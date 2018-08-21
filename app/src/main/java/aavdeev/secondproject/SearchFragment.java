package aavdeev.secondproject;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SearchFragment extends Fragment {

    public static String SEARCH_MESSAGE = "Search message";
    private EditText editText;

<<<<<<< HEAD


=======
>>>>>>> 7d6349274c8dd0cc3c88079bca14c9ecbb5b8d2d
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = getView();
        editText = view.findViewById(R.id.editText);
        Button serchButtob = view.findViewById(R.id.searchButton);


        return inflater.inflate(R.layout.fragment_search, container, false);
    }

    private View.OnClickListener searchButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };

}
