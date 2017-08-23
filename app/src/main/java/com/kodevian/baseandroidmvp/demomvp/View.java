package com.kodevian.baseandroidmvp.demomvp;

import com.kodevian.baseandroidmvp.adapters.KoreanItem;

import java.util.ArrayList;

/**
 * Created by junior on 18/08/17.
 */

public interface View {

    void changeImage(int image);

    void showData(ArrayList<KoreanItem> koreanItems);
}
