package com.kodevian.baseandroidmvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;

import com.kodevian.baseandroidmvp.demomvp.*;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by junior on 18/08/17.
 */

public class ActivityBlackPink extends AppCompatActivity implements com.kodevian.baseandroidmvp.demomvp.View {

    public static final int ROSE = 1;
    public static final int JENNIE = 2;


    private PresenterInterface mPresenter;

    @BindView(R.id.image_kokoro)
    ImageView imageKokoro;
    @BindView(R.id.invoke)
    Button invoke;
    @BindView(R.id.invoke1)
    Button invoke1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);
        ButterKnife.bind(this);
        mPresenter = new Presentador(getBaseContext(),this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.retrieveUser();
    }

    @OnClick({R.id.invoke, R.id.invoke1})
    public void onViewClicked(android.view.View view) {
        switch (view.getId()) {
            case R.id.invoke:
                mPresenter.selectedImage(ROSE);
                break;
            case R.id.invoke1:
                mPresenter.selectedImage(JENNIE);
                break;
        }
    }

    @Override
    public void changeImage(int flag) {
        imageKokoro.setBackgroundResource(flag);
    }
}
