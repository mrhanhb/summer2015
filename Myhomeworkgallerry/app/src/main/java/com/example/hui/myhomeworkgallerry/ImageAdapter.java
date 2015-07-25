package com.example.hui.myhomeworkgallerry;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by hui on 2015/7/19.
 */
public class ImageAdapter extends BaseAdapter {
    Context mContext;
    public int[] mImageResourceIds={
            R.drawable.h1,

            R.drawable.h3,

            R.drawable.h7,
            R.drawable.h8
    };
    public ImageAdapter(Context context){
        this.mContext=context;
    }
    public int getCount(){
        return mImageResourceIds.length;
    }
    public Object getItem(int position){
        return mImageResourceIds[position];
    }
    public long getItemId(int position){
        return position;
    }
    public View getView(int position,View converView,ViewGroup parent){
        ImageView imageView=new ImageView(mContext);
        imageView.setImageResource(mImageResourceIds[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(120,120));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return imageView;
    }
}