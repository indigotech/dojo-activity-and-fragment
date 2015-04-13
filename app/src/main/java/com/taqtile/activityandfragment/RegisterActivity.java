package com.taqtile.activityandfragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;


public class RegisterActivity extends ActionBarActivity
        implements RegisterPersonalFragment.OnNextButtonClickListener,
                   RegisterAddressFragment.OnSubmitListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new RegisterPersonalFragment())
                    .addToBackStack(null)
                    .commit();
        }
    }

    @Override
    public void onNextButtonClick() {
        getFragmentManager().beginTransaction()
                .replace(R.id.container, new RegisterAddressFragment())
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onSubmit(String address) {

    }
}
