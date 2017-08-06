package com.study.android.mylist;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tatsuya on 2017/08/06.
 */

public class MyList extends BaseAdapter {

    List<ListItem> itemList;
    LayoutInflater layoutInflater;


    public MyList(Context context, List<ListItem> itemList) {
        layoutInflater=layoutInflater.from(context);
        this.itemList=itemList;
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        final ListItem listVideoItem= itemList.get(position);
        if (convertView==null){
            convertView=layoutInflater.inflate(R.layout.list_item,parent,false);
            viewHolder=new ViewHolder();
            viewHolder.videoTitle=(TextView)convertView.findViewById(R.id.video_title);
            viewHolder.videosamne=(ImageView)convertView.findViewById(R.id.samune);
            convertView.setTag(viewHolder);
        }else {
            viewHolder=(ViewHolder)convertView.getTag();
        }

        viewHolder.videoTitle.setText(listVideoItem.getTitle());
        viewHolder.videosamne.setImageBitmap(listVideoItem.getSamne());

        return convertView;
    }

    static class ViewHolder{
        ImageView videosamne;
        TextView videoTitle;
        TextView videoUser;

    }
}