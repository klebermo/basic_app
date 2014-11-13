package org.hello;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Tab5Fragment extends Fragment {
@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_view, container, false);

        TextView text = (TextView) view.findViewById(R.id.textView1);
        text.setText("This is the content for tab 5");

        return view;
    }
}
