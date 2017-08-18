package com.kodevian.baseandroidmvp.demomvp;

import com.kodevian.baseandroidmvp.ActivityBlackPink;
import com.kodevian.baseandroidmvp.R;

/**
 * Created by junior on 18/08/17.
 */

public class Presentador implements  PresenterInterface {


    private View mView;


    public Presentador(View view) {
        this.mView = view;
    }

    @Override
    public void selectedImage(int flag) {

        if (flag == ActivityBlackPink.ROSE) {
            mView.changeImage(R.drawable.rose);
        }else{

            mView.changeImage(R.drawable.jennie);
        }

    }
}
