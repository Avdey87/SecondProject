package aavdeev.secondproject;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends SingleFragmentActivity {

    @Override
    protected android.support.v4.app.Fragment getFragment() {
        return MainFragment.newInstance();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
                        switch (item.getItemId()) {
            case R.id.settings:
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragmentContainer, SettingsFragment.newInstance())
                        .addToBackStack(SettingsFragment.class.getName())
                        .commit();
                Toast.makeText(this, R.string.settings, Toast.LENGTH_SHORT).show();

                break;
            case R.id.search:
                getSupportFragmentManager().
                        beginTransaction().
                        replace(R.id.fragmentContainer, SearchFragment.newInstance())
                        .addToBackStack(SearchFragment.class.getName())
                        .commit();
                Toast.makeText(this, R.string.search, Toast.LENGTH_SHORT).show();
                break;
            case R.id.exit:
                Toast.makeText(this, R.string.exit, Toast.LENGTH_SHORT).show();
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }



}
