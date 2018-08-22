package aavdeev.secondproject;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterViewAnimator;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends SingleFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected android.support.v4.app.Fragment getFragment() {
        return null;
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
                Toast.makeText(this, R.string.settings, Toast.LENGTH_SHORT).show();

                break;
            case R.id.search:

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
