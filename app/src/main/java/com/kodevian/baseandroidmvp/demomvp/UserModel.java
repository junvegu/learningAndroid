package com.kodevian.baseandroidmvp.demomvp;

import java.io.Serializable;

/**
 * Created by junior on 19/08/17.
 */

public class UserModel implements Serializable {


    private String login;
    private long id;
    private String avatar_url;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }
}
