package com.taqtile.activityandfragment;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class SearchResultActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
    }

    public void onTshirtButtonClick() {
        //TODO: implement Search button click
        Toast.makeText(this, "Tshirt", Toast.LENGTH_SHORT).show();
    }

}
