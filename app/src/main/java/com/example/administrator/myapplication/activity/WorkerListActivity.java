package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.administrator.myapplication.Adapter.MybaseAdapter;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.entity.Category;
import com.example.administrator.myapplication.util.StringUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

import java.lang.reflect.Type;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class WorkerListActivity extends AppCompatActivity {

    @InjectView(R.id.lv_workerTtpe)
    ListView lvWorkerTtpe;
    @InjectView(R.id.lv_worker_list_right)
    ListView lvWorker;
    List<Category> lis;
    String[] workertype;
    @InjectView(R.id.tb_workerlist)
    Toolbar tbWorkerlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list);
        ButterKnife.inject(this);
        tbWorkerlist.setTitle("");
        tbWorkerlist.setNavigationIcon(R.mipmap.back);
        setSupportActionBar(tbWorkerlist);

        tbWorkerlist.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        final String[] typeStr = getResources().getStringArray(R.array.workerType);//simple_list_item_1
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.worker_list, typeStr);
        lvWorkerTtpe.setAdapter(arrayAdapter);

//        for (int i = 0; i < 20; i++) {
//            Category c=new Category(i, i + "-" + i, i + "", "slogan" + i, "profile" + i, i / 4 + "","");
//            categoryListlist.add(c);
//            Log.i("ming", "onCreate: "+c);
//        }

        String str = StringUtil.ip + "/CategoryServlet";
        RequestParams params = new RequestParams(str);
        Log.i("ming", "onCreate: " + 11);
        x.http().get(params, new Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {
                Log.i("ming", "onSuccess: " + result);
                Gson g = new Gson();
                Type type = new TypeToken<List<Category>>() {
                }.getType();
                lis = g.fromJson(result, type);
                workertype = getResources().getStringArray(R.array.workerType);
                Log.i("ming", "onSuccess: " + lis.size());
                MybaseAdapter mybaseAdapter = new MybaseAdapter(lis, WorkerListActivity.this);
                lvWorker.setAdapter(mybaseAdapter);

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {
                Log.i("ming", "onError: " + ex);
            }

            @Override
            public void onCancelled(CancelledException cex) {
                Log.i("ming", "onCancelled: ");
            }

            @Override
            public void onFinished() {
                Log.i("ming", "onFinished: ");
            }
        });

        lvWorkerTtpe.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                for (int i = 0; i < lis.size(); i++) {
                    Log.i("ming", "onItemClick: " + workertype[position]);
                    if (lis.get(i).getType().equals(workertype[position])) {
                        Log.i("ming", "onItemClick: " + position + "--" + i);
                        lvWorker.setSelection(i);

                        break;
                    }
                }
            }
        });
        //详细服务lv点击事件
        lvWorker.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               /* for (int i = 0; i < typeStr.length; i++) {
                    if (typeStr[i].equals(lis.get(position).getType())) {
                        lvWorkerTtpe.setSelection(i);
                        break;
                    }
                }*/
                Intent intent=new Intent(WorkerListActivity.this,ServiceInformationActivity.class);
                Category category=lis.get(position);
                Gson gson =new Gson();
                String str=gson.toJson(category);
                intent.putExtra("category",str);
                startActivity(intent);
            }
        });
    }


}
