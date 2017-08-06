package com.study.android.mylist;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText edit;
    List<ListItem> listItems;
    ListView listView;
    MyList MyListAdapter;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        edit=(EditText)findViewById(R.id.seach_video);
        listView=(ListView)findViewById(R.id.video_list);

        listItems=new ArrayList<>();
        button=(Button)findViewById(R.id.seachbutton);

/////////////テスト用プログラム////////////////////////
        for(int i=0;i<30;i++){
            ListItem listItem=new ListItem();
            listItem.setSamne(bitmap);
            listItem.setTitle(String.valueOf(i));
            Log.d("AAAAAA",String.valueOf(listItem));
            listItems.add(listItem);
        }
//////////////////////////////////////////////////////////////
        MyListAdapter=new MyList(this,listItems);
        listView.setAdapter(MyListAdapter);
    }
}
