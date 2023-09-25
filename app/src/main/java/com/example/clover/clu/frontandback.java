package com.example.clover.clu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


/**
 * Created by Nishanth on 18-02-2017.
 */

public class frontandback extends Activity {
    Button b1,b2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frontorback);

        b1=(Button)findViewById(R.id.front);
        b2=(Button)findViewById(R.id.back);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),clientside.class);
                startActivity(i);


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),clientside.class);
                startActivity(i);


            }
        });



    }
}
