package com.example.administrator.myapplication.Adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.myapplication.R;
import com.example.administrator.myapplication.entity.Category;

import java.io.InputStream;
import java.util.List;


/**
 * Created by Administrator on 2016/9/20.
 */
public class MybaseAdapter extends BaseAdapter {
    List<Category> list;
    Context context;
    public MybaseAdapter(List<Category> list, Context context) {
        this.list=list;
        this.context=context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Hundle hundle;
        if (convertView==null){
            convertView=LayoutInflater.from(context).inflate(R.layout.worker_list_item,null);
            ImageView imageView= (ImageView) convertView.findViewById(R.id.imageView_worker_photo);
            TextView tvWorkerTitle= (TextView) convertView.findViewById(R.id.tv_workerListTitle);
            TextView tvWorketJiesao= (TextView) convertView.findViewById(R.id.tv_workerListJieSao);
            View view=convertView.findViewById(R.id.v_xian);
            hundle=new Hundle(imageView,tvWorkerTitle,tvWorketJiesao,view);
            convertView.setTag(hundle);
        }else {
            hundle= (Hundle) convertView.getTag();
        }
        //ImageView imageView=hundle.imageView;
        hundle.tvWorkerTitle.setText(list.get(position).getName());
        hundle.tvWorketJiesao.setText(list.get(position).getSlogan());
        int x=position+1;
        InputStream is=context.getClass().getClassLoader().getResourceAsStream("assets/"+x+".png");
        Bitmap bitmap= BitmapFactory.decodeStream(is);
        hundle.imageView.setImageBitmap(bitmap);
        return convertView;
    }
    class  Hundle{
        ImageView imageView;
        TextView tvWorkerTitle;
        TextView tvWorketJiesao;
        View view;

        public Hundle(ImageView imageView, TextView tvWorkerTitle, TextView tvWorketJiesao, View view) {
            this.imageView = imageView;
            this.tvWorkerTitle = tvWorkerTitle;
            this.tvWorketJiesao = tvWorketJiesao;
            this.view = view;
        }
    }
}
