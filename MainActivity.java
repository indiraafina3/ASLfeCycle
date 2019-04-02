package com.codepolitan.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("STATE_ACTIVITY","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("STATE_ACTIVITY", "Kamu sedang berada di state onCreate");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d("STATE_ACTIVITY","Kamu sedang berada di state onResume");
    }

    @Override
    protected void  onPause () {
        super.onPause();
        Log.d("STATE_ACTIVITY","Kamu sedang berada di state onPause");
    }

    @Override
    protected void onStop () {
        Log.d("STATE_ACTIVITY, "Kamu sedang berada di state onStop")
    }

    @Override
    protected void onDestroy () {
        Log.d("STATE_ACTIVITY,"Kamu sedang berada di state onDestroy");
    }
}

}
