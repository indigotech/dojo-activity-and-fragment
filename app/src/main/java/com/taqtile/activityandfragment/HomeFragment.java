package com.taqtile.activityandfragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link HomeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeFragment extends Fragment {

    private Button mRegisterButton;
    private Button mSearchButton;
    private Button mTshirtButton;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment HomeFragment.
     */
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        mRegisterButton = (Button)v.findViewById(R.id.register_button);
        mSearchButton = (Button)v.findViewById(R.id.search_button);
        mTshirtButton = (Button)v.findViewById(R.id.tshirt_button);

        mRegisterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onRegisterButtonClick();
            }
        });
        mSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onSearchButtonClick();
            }
        });
        mTshirtButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onTshirtButtonClick();
            }
        });
        return v;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((MainActivity)activity).onSectionAttached("Home");
    }

    private void onRegisterButtonClick() {
        Intent i = new Intent(getActivity(), RegisterActivity.class);
        startActivity(i);
    }

    private void onSearchButtonClick() {
        //TODO: implement Search button click
        Toast.makeText(getActivity(), "Search", Toast.LENGTH_SHORT).show();
    }

    private void onTshirtButtonClick() {
        Intent i = new Intent(getActivity(), ProductDetailsActivity.class);
        startActivity(i);
    }
}
