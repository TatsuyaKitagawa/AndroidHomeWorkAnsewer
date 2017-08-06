package com.study.android.mylist;

import android.graphics.Bitmap;

/**
 * Created by tatsuya on 2017/08/06.
 */

public class ListItem {
    Bitmap samune;
    String Title;

    public Bitmap getSamne() {
        return samune;
    }

    public void setSamne(Bitmap samne) {
        this.samune = samne;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String videoTitle) {
        this.Title = videoTitle;
    }


}
