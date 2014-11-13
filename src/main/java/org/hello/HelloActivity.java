package org.hello;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Fragment;
import android.app.FragmentTransaction;

public class HelloActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.hello_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_search:
                openSearch();
                return true;
            case R.id.action_settings:
                openSettings();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void openSearch() {
      //
    }

    public void openSettings() {
      //
    }

    public void btn1_click(View view) {
      // The user selected the headline of an article from the HeadlinesFragment
      // Do something here to display that article
      Fragment newFragment = new Tab1Fragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();

      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack so the user can navigate back
      transaction.replace(R.id.article_fragment, newFragment);
      transaction.addToBackStack(null);

      // Commit the transaction
      transaction.commit();
    }

    public void btn2_click(View view) {
      // The user selected the headline of an article from the HeadlinesFragment
      // Do something here to display that article
      Fragment newFragment = new Tab2Fragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();

      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack so the user can navigate back
      transaction.replace(R.id.article_fragment, newFragment);
      transaction.addToBackStack(null);

      // Commit the transaction
      transaction.commit();
    }

    public void btn3_click(View view) {
      // The user selected the headline of an article from the HeadlinesFragment
      // Do something here to display that article
      Fragment newFragment = new Tab3Fragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();

      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack so the user can navigate back
      transaction.replace(R.id.article_fragment, newFragment);
      transaction.addToBackStack(null);

      // Commit the transaction
      transaction.commit();
    }

    public void btn4_click(View view) {
      // The user selected the headline of an article from the HeadlinesFragment
      // Do something here to display that article
      Fragment newFragment = new Tab4Fragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();

      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack so the user can navigate back
      transaction.replace(R.id.article_fragment, newFragment);
      transaction.addToBackStack(null);

      // Commit the transaction
      transaction.commit();
    }

    public void btn5_click(View view) {
      // The user selected the headline of an article from the HeadlinesFragment
      // Do something here to display that article
      Fragment newFragment = new Tab5Fragment();
      FragmentTransaction transaction = getFragmentManager().beginTransaction();

      // Replace whatever is in the fragment_container view with this fragment,
      // and add the transaction to the back stack so the user can navigate back
      transaction.replace(R.id.article_fragment, newFragment);
      transaction.addToBackStack(null);

      // Commit the transaction
      transaction.commit();
    }

}
