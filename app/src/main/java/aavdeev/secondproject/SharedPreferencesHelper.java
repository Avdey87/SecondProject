package aavdeev.secondproject;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {
    public static final String SHERED_PREF_NAME = "SHERED_PREF_NAME";
    public static final String SETTINGS_KEY = "SETTINGS_KEY";
   // public static final String SEARCH_KEY = "SEARCH_KEY";

    private SharedPreferences sharedPreferencesHelper;

    public SharedPreferencesHelper(Context context) {
        sharedPreferencesHelper = context.getSharedPreferences(SHERED_PREF_NAME,
                Context.MODE_PRIVATE);
    }

    public  int getSettingsKey() {
        return sharedPreferencesHelper.getInt(SETTINGS_KEY,-1);
    }

    public void setSettingsKey(int setting) {
        sharedPreferencesHelper.edit().putInt(SETTINGS_KEY, setting).apply();
    }




}
