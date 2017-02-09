package com.vangroan.botexperiment.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vangroan.botexperiment.R;
import com.vangroan.botexperiment.view.graph.BotResourceLoader;

public class BotActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bot);
    }

    @Override
    protected void onStart() {
        super.onStart();

        new BotResourceLoader(this, R.raw.user_greet).load();
    }
}
