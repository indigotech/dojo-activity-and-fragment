package com.taqtile.activityandfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * Use the {@link CategoryFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CategoryFragment extends Fragment {

    private static final String ARG_NAME = "name";

    private String mName;
    private Button mTshirtButton;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param name Category name.
     * @return A new instance of fragment CategoryFragment.
     */
    public static CategoryFragment newInstance(String name) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }

    public CategoryFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mName = getArguments().getString(ARG_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_category, container, false);
        mTshirtButton = (Button)v.findViewById(R.id.tshirt_button);
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
        ((MainActivity)activity).onSectionAttached("T-shirts");
    }

    private void onTshirtButtonClick() {
        //TODO: implement Tshirt button click
        Toast.makeText(getActivity(), "Category Tshirt", Toast.LENGTH_SHORT).show();
    }
}
