package com.kodevian.baseandroidmvp.democoding;

import java.io.Serializable;

/**
 * Created by junior on 18/08/17.
 */

public class BlackPinkInteger implements Serializable {

    private String name;
    private String photo;




    public BlackPinkInteger(String name, String photo) {
        this.name = name;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }



}
