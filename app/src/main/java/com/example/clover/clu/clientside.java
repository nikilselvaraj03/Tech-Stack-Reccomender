package com.example.clover.clu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;



/**
 * Created by Nishanth on 18-02-2017.
 */

public class clientside extends Activity {
    Button next;
    Singleton sharedObj;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clientxml);
        sharedObj=Singleton.getInstance();
        next = (Button) findViewById(R.id.clientnext);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("csusar=",""+sharedObj.csusar[5]);
                Intent s = new Intent(getApplicationContext(), serverside.class);
                startActivity(s);
            }
        });
    }




            public void onCheckboxClicked(View view) {
                boolean checked = ((CheckBox) view).isChecked();

                // Check which checkbox was clicked
                switch(view.getId()) {
                    case R.id.clientside1:
                        if (checked){
                            sharedObj.csusar[1]=1;
                        }

                        else

                        {
                            sharedObj.csusar[1]=0;
                        }
                        break;
                    case R.id.clientside2:
                        if (checked){
                            sharedObj.csusar[2]=1;
                        }
                        else {
                            sharedObj.csusar[2]=0;
                        }
                        break;
                    case R.id.clientside3:
                        if (checked){
                            sharedObj.csusar[3]=1;
                        }
                        else {
                            sharedObj.csusar[3]=0;
                        }
                        break;
                    case R.id.clientside4:
                        if (checked){
                            sharedObj.csusar[4]=1;
                        }
                        else {
                            sharedObj.csusar[4]=0;
                        }
                        break;
                    case R.id.clientside5:
                        if (checked){
                            sharedObj.csusar[5]=1;
                        }
                        else {
                            sharedObj.csusar[5]=0;
                        }
                        break;
                    case R.id.clientside6:
                        if (checked){
                            sharedObj.csusar[6]=1;
                        }
                        else {
                            sharedObj.csusar[6]=0;
                        }
                        break;
                    case R.id.clientside7:
                        if (checked){
                            sharedObj.csusar[7]=1;
                        }
                        else {
                            sharedObj.csusar[7]=0;
                        }
                        break;
                    case R.id.clientside8:
                        if (checked){
                            sharedObj.csusar[8]=1;
                        }
                        else {
                            sharedObj.csusar[8]=0;
                        }
                        break;
                    case R.id.clientside9:
                        if (checked){
                            sharedObj.csusar[9]=1;
                        }
                        else {
                            sharedObj.csusar[9]=0;
                        }

                        break;
                    case R.id.clientside10:
                        if (checked){
                            sharedObj.csusar[10]=1;
                        }
                        else {
                            sharedObj.csusar[10]=0;
                        }
                        break;
                    case R.id.clientside11:
                        if (checked){
                            sharedObj.csusar[11]=1;
                        }
                        else {
                            sharedObj.csusar[11]=0;
                        }
                        break;
                }
            }


    }

