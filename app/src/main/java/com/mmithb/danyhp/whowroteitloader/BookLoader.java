package com.mmithb.danyhp.whowroteitloader;

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;

/**
 * Created by ASUS on 12-Apr-18.
 */

public class BookLoader extends AsyncTaskLoader<String> {
    private String mQueryString;

    public BookLoader(Context context, String mQueryString) {
        super(context);
        this.mQueryString = mQueryString;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
}
