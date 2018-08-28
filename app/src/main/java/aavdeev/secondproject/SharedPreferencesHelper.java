package aavdeev.secondproject;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPreferencesHelper {
    public static final String SHERED_PREF_NAME = "SHERED_PREF_NAME";
    public static final String SETTINGS_KEY = "SETTINGS_KEY";
    public static final String CHECKED_KEY  = "CHECKED_KEY ";

    private SharedPreferences sharedPreferencesHelper;

    public SharedPreferencesHelper(Context context) {
        sharedPreferencesHelper = context.getSharedPreferences(SHERED_PREF_NAME,
                Context.MODE_PRIVATE);
    }

    public String getSettingsKey() {
        return sharedPreferencesHelper.getString(SETTINGS_KEY,"setting");
    }

    public void setSettingsKey(String setting) {
        sharedPreferencesHelper.edit().putString(SETTINGS_KEY, setting).apply();
    }
    public int getChecked() {
        return sharedPreferencesHelper.getInt(CHECKED_KEY, -1);
    }
    public void setChecked(int checked) {
        sharedPreferencesHelper.edit().putInt(CHECKED_KEY, checked).apply();
    }


}
