package com.taqtile.activityandfragment;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link com.taqtile.activityandfragment.RegisterPersonalFragment.OnNextButtonClickListener} interface
 * to handle interaction events.
 * Use the {@link RegisterPersonalFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RegisterPersonalFragment extends Fragment {

    private OnNextButtonClickListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment RegisterPersonalFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RegisterPersonalFragment newInstance() {
        RegisterPersonalFragment fragment = new RegisterPersonalFragment();
        return fragment;
    }

    public RegisterPersonalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register_personal, container, false);
        Button button = (Button) view.findViewById(R.id.next_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.onNextButtonClick();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mListener = (OnNextButtonClickListener) activity;
        } catch (ClassCastException e) {
            throw new ClassCastException(activity.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnNextButtonClickListener {
        // TODO: Update argument type and name
        public void onNextButtonClick();
    }

}
