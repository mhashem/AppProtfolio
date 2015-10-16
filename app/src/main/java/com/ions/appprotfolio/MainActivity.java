package com.ions.appprotfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button spotifyBtn, scoresBtn, libraryAppBtn, buildItBiggerBtn, xyzBtn, capStoneBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });


        spotifyBtn = (Button) findViewById(R.id.spotifyBtn);
        scoresBtn = (Button) findViewById(R.id.scoresBtn);
        libraryAppBtn = (Button) findViewById(R.id.libraryAppBtn);
        buildItBiggerBtn = (Button) findViewById(R.id.buildItBtn);
        xyzBtn = (Button) findViewById(R.id.xyzBtn);
        capStoneBtn = (Button) findViewById(R.id.capstoneApp);

        spotifyBtn.setOnClickListener(getClickListener("This will open my Spotify App"));
        scoresBtn.setOnClickListener(getClickListener("This will open my Scores App"));
        libraryAppBtn.setOnClickListener(getClickListener("This will open my Library App"));
        buildItBiggerBtn.setOnClickListener(getClickListener("This will open my Build It Bigger App"));
        xyzBtn.setOnClickListener(getClickListener("This will open my XYZ Library App"));
        capStoneBtn.setOnClickListener(getClickListener("This will open my Rocking App :p"));
    }

    private View.OnClickListener getClickListener(final String text) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
