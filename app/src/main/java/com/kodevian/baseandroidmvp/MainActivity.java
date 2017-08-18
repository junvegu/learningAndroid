package com.kodevian.baseandroidmvp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.kodevian.baseandroidmvp.demomvp.SecondActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity  {


    @BindView(R.id.action2)
    ImageView action2;
    @BindView(R.id.action)
    ImageView action;




    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "On Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        ButterKnife.bind(this);

        Toast.makeText(this, "On Create", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "On Resume", Toast.LENGTH_SHORT).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "On Pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "On Stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "On Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Toast.makeText(this, "Me he ido :d", Toast.LENGTH_SHORT).show();

    }

    @OnClick({R.id.action2, R.id.action})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.action2:
                break;
            case R.id.action:

                Intent intent =  new Intent(getBaseContext(),SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}
