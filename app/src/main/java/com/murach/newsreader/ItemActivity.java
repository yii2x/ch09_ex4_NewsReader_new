package com.murach.newsreader;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

public class ItemActivity extends Activity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);
    }

//    @Override
//    public void onClick(View v) {
//        // get the intent
//        Intent intent = getIntent();
//
//        // get the Uri for the link
//        String link = intent.getStringExtra("link");
//        Uri viewUri = Uri.parse(link);
//
//        // create the intent and start it
//        Intent viewIntent = new Intent(Intent.ACTION_VIEW, viewUri);
//        startActivity(viewIntent);
//    }
}