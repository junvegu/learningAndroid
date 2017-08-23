package com.kodevian.baseandroidmvp.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.kodevian.baseandroidmvp.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by junior on 23/08/17.
 */

public class AdapterListKoreans extends RecyclerView.Adapter<AdapterListKoreans.ViewHolder> implements OnClickChinaListener {


    private ArrayList<KoreanItem> mKoreanItems;
    private Context mContext;

    public AdapterListKoreans(ArrayList<KoreanItem> mKoreanItems, Context mContext) {
        this.mKoreanItems = mKoreanItems;
        this.mContext = mContext;
    }

    //Instnciar la vista del item
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_cell, parent, false);

        return new ViewHolder(v,this);
    }


    //Llenar contenido a cada item
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        KoreanItem koreanItem =  mKoreanItems.get(position);

        holder.text.setText("Esta es una china: "+ position);

        
       /* holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext, "HOlaaa china  numero : "+position, Toast.LENGTH_SHORT).show();
            }
        });*/
    }


    //Calcular el tamaño de la lista
    @Override
    public int getItemCount() {
        return mKoreanItems.size();
    }

    @Override
    public void clickItem(int position) {

        Toast.makeText(mContext, "HOlaaa china  numero : "+position, Toast.LENGTH_SHORT).show();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener{

        @BindView(R.id.image)
        ImageView image;
        @BindView(R.id.text)
        TextView text;

        OnClickChinaListener onClickChinaListener;

        public ViewHolder(View itemView , final OnClickChinaListener onClickChinaListener) {
            super(itemView);
            this.onClickChinaListener = onClickChinaListener;
            ButterKnife.bind(this,itemView);
            itemView.setOnClickListener(this);


        }


        @Override
        public void onClick(View view) {
            onClickChinaListener.clickItem(getAdapterPosition());
        }
    }
}
