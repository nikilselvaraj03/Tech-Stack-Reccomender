package com.example.clover.clu;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Nishanth on 18-02-2017.
 */

public class result extends Activity {

    TextView r1,r2,r3,r4;
    int i;Singleton sharedObj;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultxml);


        sharedObj=Singleton.getInstance();
        r2=(TextView)findViewById(R.id.res2);
        r2.setText(sharedObj.cssf);

        r3=(TextView)findViewById(R.id.res3);
        r3.setText(sharedObj.sssf);


        r4=(TextView)findViewById(R.id.res4);
        r4.setText(sharedObj.dbsf);



    }


}
