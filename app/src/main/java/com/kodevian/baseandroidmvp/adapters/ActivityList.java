package com.kodevian.baseandroidmvp.adapters;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import com.kodevian.baseandroidmvp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by junior on 23/08/17.
 */

public class ActivityList extends AppCompatActivity {


    @BindView(R.id.list_koreans)
    RecyclerView listKoreans;

    private AdapterListKoreans mAdapterListKoreans;


    private Button button;

    private LinearLayoutManager linearLayoutManager;
    private GridLayoutManager gridLayoutManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ButterKnife.bind(this);



        ArrayList<KoreanItem> koreanItems = new ArrayList<>();

        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());
        koreanItems.add(new KoreanItem());


        mAdapterListKoreans =  new AdapterListKoreans(koreanItems,this);

        linearLayoutManager = new LinearLayoutManager(this);
        gridLayoutManager =  new GridLayoutManager(this,3);


        listKoreans.setAdapter(mAdapterListKoreans);
        listKoreans.setLayoutManager(gridLayoutManager);

        mAdapterListKoreans.notifyDataSetChanged();

    }


}
