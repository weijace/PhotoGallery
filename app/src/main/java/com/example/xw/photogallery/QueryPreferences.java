package com.example.xw.photogallery;

import android.content.Context;
import android.preference.PreferenceManager;

/**
 * Created by xw on 2016/9/11.
 */
public class QueryPreferences {
    private static final String PREF_SEARCH_QUERY="searchQuery";
    private static final String PREF_LAST_RESULT_ID="lastResult";
    public static String getStoredQuery(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_SEARCH_QUERY,null);
    }
    public static void setStoredQuery(Context context,String query){
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_SEARCH_QUERY,query).apply();
    }
    public static String getLastResultId(Context context){
        return PreferenceManager.getDefaultSharedPreferences(context).getString(PREF_LAST_RESULT_ID,null);
    }
    public static void setPrefLastResultId(Context context,String lastResultId){
        PreferenceManager.getDefaultSharedPreferences(context).edit().putString(PREF_LAST_RESULT_ID,lastResultId).apply();
    }
}
