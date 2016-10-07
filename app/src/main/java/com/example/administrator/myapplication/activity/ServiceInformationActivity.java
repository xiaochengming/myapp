package com.example.administrator.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.administrator.myapplication.Adapter.JiageBaseAdapter;
import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.entity.Category;
import com.example.administrator.myapplication.entity.Price;
import com.example.administrator.myapplication.util.StringUtil;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import org.xutils.x;

import java.lang.reflect.Type;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class ServiceInformationActivity extends AppCompatActivity {

    @InjectView(R.id.tv_tbTitle)
    TextView tvTbTitle;
    @InjectView(R.id.tb_title)
    Toolbar tbTitle;
    @InjectView(R.id.lv_yuyue)
    ListView lvYuyue;
    @InjectView(R.id.tv_tishi)
    TextView tvTishi;
    @InjectView(R.id.tv_jiesao)
    TextView tvJiesao;
    @InjectView(R.id.iv_photo)
    ImageView ivPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_information);
        ButterKnife.inject(this);


        tbTitle.setTitle("");
        tbTitle.setNavigationIcon(R.mipmap.backs);
        setSupportActionBar(tbTitle);
        //返回
        tbTitle.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        Intent intent = getIntent();
        if (intent != null) {
            String str = intent.getStringExtra("category");
            Gson gson = new Gson();
            Type type = new TypeToken<Category>() {
            }.getType();
            Category category = gson.fromJson(str, type);
            Log.i("Service", "onCreate: " + category);
            if (category.getName()!=null){
                tvTbTitle.setText(category.getName());
            }
            if (category.getPhoto() != null) {
                Log.i("Service", "onCreate: "+"getphoto");
                String url = StringUtil.ip + category.getPhoto();
                Log.i("Service", "onCreate: "+url);
                x.image().bind(ivPhoto, url);
            }
            if (category.getPrompt()!=null){
                tvTishi.setText(category.getPrompt());
            }
            if (category.getProfile()!=null){
                tvJiesao.setText(category.getProfile());
            }
            if (category.getPrices()!=null){
                List<Price> list=category.getPrices();
                Log.i("Service", "onCreate: "+list.size());
                JiageBaseAdapter jiage=new JiageBaseAdapter(list,this);
                lvYuyue.setAdapter(jiage);
                fixListViewHeight(lvYuyue);
                jiage.notifyDataSetChanged();
            }
        }
    }
    public void fixListViewHeight(ListView listView) {
        // 如果没有设置数据适配器，则ListView没有子项，返回。
        ListAdapter listAdapter = listView.getAdapter();
        int totalHeight = 0;
        if (listAdapter == null) {
            return;
        }
        for (int i = 0, len = listAdapter.getCount(); i < len; i++) {
            View listViewItem = listAdapter.getView(i , null, listView);
            // 计算子项View 的宽高
            listViewItem.measure(0, 0);
            // 计算所有子项的高度和
            totalHeight += listViewItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        // listView.getDividerHeight()获取子项间分隔符的高度
        // params.height设置ListView完全显示需要的高度
        params.height = totalHeight+ (listView.getDividerHeight() * (listAdapter.getCount() - 1))+20;
        listView.setLayoutParams(params);
    }
}
