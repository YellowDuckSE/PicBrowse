package se.wiktoreriksson.picbrowse;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TabLayout dcimpick = findViewById(R.id.pic_k);
        String selectedfolder = "/";
        switch (dcimpick.getSelectedTabPosition()) {
            case 0:
                selectedfolder="";
        }
    }
}
