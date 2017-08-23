package com.kodevian.baseandroidmvp.adapters;

import java.io.Serializable;

/**
 * Created by junior on 23/08/17.
 */

public class KoreanItem implements Serializable {

    private String name;
    private String image;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
