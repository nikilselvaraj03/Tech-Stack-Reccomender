package com.example.clover.clu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;


/**
 * Created by Nishanth on 17-02-2017.
 */

public class fields extends Activity {
    Button b1;
    Singleton sharedObj;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feilds_layout);
        sharedObj=Singleton.getInstance();
        b1=(Button)findViewById(R.id.result);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cs();
                Intent i=new Intent(getApplicationContext(),result.class);
                startActivity(i);
            }
        });
    }

    public void cs() {
        Log.d("checking","cs");
        ss();
        int k, temp;
        String temp1;

        for (k = 0; k < 11; k++) {
            if (sharedObj.csusar[k] == sharedObj.js[k]) {
                sharedObj.i = sharedObj.i + 1;
                sharedObj.cssf = "javascript";
            }
        }
        for (k = 0; k < 11; k++) {
            if (sharedObj.csusar[k] == sharedObj.objc[k]) {
                sharedObj.j = sharedObj.j + 1;
                sharedObj.cssf2 = "objective c";
                if (sharedObj.i < sharedObj.j) {
                    temp = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = temp;
                    temp1 = sharedObj.cssf;
                    sharedObj.cssf = sharedObj.cssf2;
                    sharedObj.cssf = temp1;
                }
            }
        }
        for (k = 0; k < 11; k++) {
            if (sharedObj.csusar[k] == sharedObj.angjs[k]) {
                sharedObj.j=0;
                sharedObj.j = sharedObj.j + 1;
                if (sharedObj.i < sharedObj.j) {
                    temp = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.cssf = "angular javascript";
                }
            }
        }
        for (k = 0; k < 11; k++) {
            if (sharedObj.csusar[k] == sharedObj.swift[k]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.cssf = "swift";
                }
            }
        }

        for (k = 0; k < 11; k++) {
            if (sharedObj.csusar[k] == sharedObj.python[k]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.cssf = "python";
                }
            }
        }
    }


    public void ss() {

        db();
        sharedObj.i=0;
        sharedObj.j=0;
        int l, temp2;
        String temp3;
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.php[l]) {
                sharedObj.i = sharedObj.i + 1;
                sharedObj.sssf = "php";
            }
        }
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.aspnet[l]) {
                sharedObj.j = sharedObj.j + 1;
                sharedObj.sssf2 = "asp_net";
                if (sharedObj.i < sharedObj.j) {
                    temp2 =sharedObj.i;
                    sharedObj.i = sharedObj.j;
                   sharedObj.j=0;
                }
            }
        }
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.coldfusion[l]) {
                sharedObj.j = sharedObj.j + 1;
                if (sharedObj.i < sharedObj.j) {
                    temp2 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j=0;
                    sharedObj.sssf = "cold fusion";


                }
            }
        }
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.python1[l]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp2 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j=0;
                    sharedObj.sssf = "python";
                }
            }
        }
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.nodejs[l]) {
                sharedObj.j = sharedObj.j + 1;
                if (sharedObj.i < sharedObj.j) {
                    temp2 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j=0;
                    sharedObj.sssf = "node.js";
                }
            }
        }

        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.jsp[l]) {
                sharedObj.j = sharedObj.j + 1;
                if (sharedObj.i < sharedObj.j) {
                    temp2 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j=0;
                    sharedObj.sssf = "jsp.net";
                }
            }
        }
        for (l = 0; l < 8; l++) {
            if (sharedObj.ssusar[l] == sharedObj.perl[l]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp2 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j=0;
                    sharedObj.sssf = "perl";
                }
            }
        }
    }

    public void db() {

        sharedObj.i=0;
        sharedObj.j=0;
        int m, temp4;
        String temp5;
        for (m = 0; m < 8; m++) {
            if (sharedObj.clusar[m] == sharedObj.mysql[m]) {
                sharedObj.i = sharedObj.i + 1;
                sharedObj.dbsf = "mysql";
            }
        }
        for (m = 0; m < 8; m++) {
            if (sharedObj.clusar[m] == sharedObj.oracle[m]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp4 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.dbsf = "oracle";
                }
            }
        }
        for (m = 0; m < 8; m++) {
            if (sharedObj.clusar[m] == sharedObj.sqllite[m]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp4 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.dbsf = "sqllite";
                }
            }
        }

        for (m = 0; m < 8; m++) {
            if (sharedObj.clusar[m] == sharedObj.microsoftsql[m]) {
                sharedObj.j = sharedObj.j + 1;

                if (sharedObj.i < sharedObj.j) {
                    temp4 = sharedObj.i;
                    sharedObj.i = sharedObj.j;
                    sharedObj.j = 0;
                    sharedObj.dbsf = "microsoftsql";
                }
            }
        }
        Log.d("dbsf","="+sharedObj.dbsf);
    }
}

