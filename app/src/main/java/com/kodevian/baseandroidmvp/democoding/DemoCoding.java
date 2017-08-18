package com.kodevian.baseandroidmvp.democoding;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.kodevian.baseandroidmvp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by junior on 18/08/17.
 */

public class DemoCoding extends AppCompatActivity {


    private int temp = 0;
    private ArrayList<BlackPinkInteger> mBlackPinkIntegers;
    private Handler mHandler;
    private Runnable mBlackPinkSwiped = new Runnable() {
        @Override
        public void run() {


            loadImage(mBlackPinkIntegers.get(temp).getPhoto());
            temp++;

            if (temp == 4) {
                temp = 0;
            }
            mHandler.postDelayed(this, 3000);
        }
    };


    private void loadImage(String url) {
        Glide.with(this).load(url).into(image);
    }

    @BindView(R.id.image)
    ImageView image;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);
        ButterKnife.bind(this);

        mBlackPinkIntegers = new ArrayList<>();
        mHandler = new Handler();

        BlackPinkInteger integer1 = new BlackPinkInteger("Rose", "https://i.pinimg.com/736x/9c/fc/73/9cfc73e6b34783ff99bc7d5d6e531af1--roseanne-park-blackpink-rose-cute.jpg");
        BlackPinkInteger integer2 = new BlackPinkInteger("Jenni", "https://s-media-cache-ak0.pinimg.com/originals/13/6c/94/136c94887f32a1b407d83768c7772db2.jpg");
        BlackPinkInteger integer3 = new BlackPinkInteger("Jisso", "https://s-media-cache-ak0.pinimg.com/originals/de/fe/80/defe805affecee2051741b0346d41f92.jpg");
        BlackPinkInteger integer4 = new BlackPinkInteger("Lisa", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSpsF4GyJv3p64PId6Fj9IFOKs7E_gQeLunZW0OeU_p0HMlgV8v");

        mBlackPinkIntegers.add(integer1);
        mBlackPinkIntegers.add(integer2);
        mBlackPinkIntegers.add(integer3);
        mBlackPinkIntegers.add(integer4);


    }


    @Override
    protected void onStop() {
        super.onStop();
        mHandler.removeCallbacks(mBlackPinkSwiped);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mBlackPinkSwiped.run();

    }
}
