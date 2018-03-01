package com.example.proyectodani2;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by dam2a on 30/01/18.
 */

@IgnoreExtraProperties
public class Monster {
    String name;
    String desc;
    String picUrl;

    String mDetailPic;
    //int imageUrl;



    public Monster() {

    }

    public Monster(String name, String picUrl, String mDetailPic){
        this.name = name;
        this.picUrl = picUrl;
        this.mDetailPic = mDetailPic;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {this.picUrl = picUrl;    }

    public void setmDetailPic(String mDetailPic) {
        this.mDetailPic = mDetailPic;
    }

    public String getmDetailPic() {

        return mDetailPic;
    }
}
