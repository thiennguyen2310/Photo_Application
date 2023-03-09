package com.example.photoapllication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class PhotoAdapter extends BaseAdapter {
    public PhotoAdapter(ArrayList<Photo> photo_list, Context context) {
        this.photo_list = photo_list;
        this.context = context;
    }

    private ArrayList<Photo> photo_list;
    private Context context;

    @Override
    public int getCount() {
        return photo_list.size();
    }

    @Override
    public Object getItem(int position) {
        return photo_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return photo_list.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final MyView dataitem;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null) {
            dataitem = new MyView();
            convertView = inflater.inflate(R.layout.photo_disp_tpl, null);
            dataitem.imageView = convertView.findViewById(R.id.img_photo);
            dataitem.textView = convertView.findViewById(R.id.tv_title);
            convertView.setTag(dataitem);
        } else {
            dataitem = (MyView) convertView.getTag();
        }
        Picasso.get().load(photo_list.get(position).getSource_photo()).resize(300,400).centerCrop().into(dataitem.imageView);
        dataitem.textView.setText(photo_list.get(position).getTitle_photo());
        return convertView;
    }

    public static class MyView {
        ImageView imageView;
        TextView textView;
    }
}
