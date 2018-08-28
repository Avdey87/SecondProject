package aavdeev.secondproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;


public class SettingsFragment extends Fragment {

    private SharedPreferencesHelper preferencesHelper;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container,
                false);

        preferencesHelper = new SharedPreferencesHelper(getActivity());

        RadioGroup radioGroup = view.findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.google:
                        preferencesHelper.setChecked(id);
                        preferencesHelper.setSettingsKey("Google");
                        break;
                    case R.id.yandex:
                        preferencesHelper.setChecked(id);
                        preferencesHelper.setSettingsKey("Yandex");
                        break;
                    case R.id.bing:
                        preferencesHelper.setChecked(id);
                        preferencesHelper.setSettingsKey("Bing");
                        break;
                }
            }
        });
        return view;
    }




    public static SettingsFragment newInstance() {
        Bundle args = new Bundle();

        SettingsFragment fragment = new SettingsFragment();
        fragment.setArguments(args);
        return fragment;
    }

}
