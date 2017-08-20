package com.kodevian.baseandroidmvp.demomvp;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by junior on 19/08/17.
 */

public interface UserRequest {


    @GET("users/junvegu")
    Call<UserModel> getUsers();
}
