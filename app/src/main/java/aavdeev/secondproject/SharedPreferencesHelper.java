package aavdeev.secondproject;

import android.content.Context;

public class SharedPreferencesHelper {
    public static final String SEARCH_KEY = "Search key";

    private SharedPreferencesHelper sharedPreferencesHelper;

    public SharedPreferencesHelper(SharedPreferencesHelper sharedPreferencesHelper) {
        this.sharedPreferencesHelper = sharedPreferencesHelper;
    }
}
