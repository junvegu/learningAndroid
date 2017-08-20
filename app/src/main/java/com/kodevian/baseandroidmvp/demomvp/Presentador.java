package com.kodevian.baseandroidmvp.demomvp;

import android.content.Context;
import android.widget.Toast;

import com.kodevian.baseandroidmvp.ActivityBlackPink;
import com.kodevian.baseandroidmvp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by junior on 18/08/17.
 */

public class Presentador implements  PresenterInterface {


    private View mView;
    private Context context;

    public Presentador(Context context,View view) {
        this.mView = view;
        this.context = context;
    }

    @Override
    public void selectedImage(int flag) {

        if (flag == ActivityBlackPink.ROSE) {
            mView.changeImage(R.drawable.rose);
        }else{

            mView.changeImage(R.drawable.jennie);
        }

    }

    @Override
    public void retrieveUser(){
        UserRequest loginService =
                ServiceFactory.createService(UserRequest.class);

        Call<UserModel> call = loginService.getUsers();
        call.enqueue(new Callback<UserModel>() {
            @Override
            public void onResponse(Call<UserModel> call, Response<UserModel> response) {

                if (response.isSuccessful()) {
                   //200

                    Toast.makeText(context, response.body().getLogin(), Toast.LENGTH_SHORT).show();
                } else {

                    //400
                }
            }

            @Override
            public void onFailure(Call<UserModel> call, Throwable t) {

                //500
            }
        });
    }
}
