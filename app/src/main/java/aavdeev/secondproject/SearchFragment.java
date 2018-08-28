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

import java.util.Objects;

public class SearchFragment extends Fragment {

    private SharedPreferencesHelper sharedPreferencesHelper;
    private EditText editText;
    private Button searchButton;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search, container, false);

        sharedPreferencesHelper= new SharedPreferencesHelper((getActivity()));
        editText = view.findViewById(R.id.editText);
        searchButton = view.findViewById(R.id.searchButton);
        searchButton.setOnClickListener(searchButtonClickListener);

        return view;
    }

    public static SearchFragment newInstance() {
        Bundle args = new Bundle();

        SearchFragment fragment = new SearchFragment();
        fragment.setArguments(args);
        return fragment;
    }

    private View.OnClickListener searchButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String search = "";
            switch (sharedPreferencesHelper.getSettingsKey()) {
                case "Google":
                    search = "https://google.com/search?q=" + editText.getText().toString();
                    break;
                case "Yandex":
                    search = "https://www.yandex.ru/search?text=" + editText.getText().toString();
                    break;
                case "Bing":
                    search = "https://bing.com/search?q=" + editText.getText().toString();
            }
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse(search));
            startActivity(intent);
        }
    };

}
