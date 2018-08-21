package aavdeev.secondproject;


import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;


<<<<<<< HEAD

public class MainFragment extends Fragment {


=======
public class MainFragment extends Fragment {


>>>>>>> 7d6349274c8dd0cc3c88079bca14c9ecbb5b8d2d
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_main, container, false);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        switch (item.getItemId()) {
            case R.id.settings:

                break;
            case R.id.search:

                break;
            case R.id.exit:


                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
