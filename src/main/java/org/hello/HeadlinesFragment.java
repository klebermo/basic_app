package org.hello;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.FragmentTransaction;

public class HeadlinesFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.headlines_view,container, false);

        Button button1 = (Button) view.findViewById(R.id.button1);
        button1.setOnClickListener(new OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
            Tab1Fragment newFragment = new Tab1Fragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
          }
        });

        Button button2 = (Button) view.findViewById(R.id.button2);
        button2.setOnClickListener(new OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
            Tab2Fragment newFragment = new Tab2Fragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
          }
        });

        Button button3 = (Button) view.findViewById(R.id.button3);
        button3.setOnClickListener(new OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
            Tab3Fragment newFragment = new Tab3Fragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
          }
        });

        Button button4 = (Button) view.findViewById(R.id.button4);
        button4.setOnClickListener(new OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
            Tab4Fragment newFragment = new Tab4Fragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
          }
        });

        Button button5 = (Button) view.findViewById(R.id.button5);
        button5.setOnClickListener(new OnClickListener()
        {
          @Override
          public void onClick(View v)
          {
            Tab5Fragment newFragment = new Tab5Fragment();
            FragmentTransaction transaction = getFragmentManager().beginTransaction();

            // Replace whatever is in the fragment_container view with this fragment,
            // and add the transaction to the back stack so the user can navigate back
            transaction.replace(R.id.fragment_container, newFragment);
            transaction.addToBackStack(null);

            // Commit the transaction
            transaction.commit();
          }
        });

        return view;
    }

}
