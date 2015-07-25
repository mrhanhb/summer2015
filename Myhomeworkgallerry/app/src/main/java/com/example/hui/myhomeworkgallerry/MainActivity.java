package com.example.hui.myhomeworkgallerry;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.ListView;

import java.nio.channels.GatheringByteChannel;


public class MainActivity extends Activity {
    Gallery gallery=null;
    ImageView mImageView;
    ImageAdapter imageAdapter=new ImageAdapter(this);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gallery=(Gallery)findViewById(R.id.gallery);
        mImageView=(ImageView)findViewById(R.id.imageView);

        gallery.setAdapter(imageAdapter);
        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mImageView.setBackgroundResource(imageAdapter.mImageResourceIds[position]);
            }
        });
    }

}