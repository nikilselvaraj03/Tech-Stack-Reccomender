package com.example.clover.clu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

/**
 * Created by Nishanth on 18-02-2017.
 */

public class serverside extends Activity {
    Button b1;
    Singleton sharedObj;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.server);
        sharedObj=Singleton.getInstance();
        b1=(Button)findViewById(R.id.next2_id);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent i=new Intent(getApplicationContext(),checklist.class);
                startActivity(i);
            }
        });
    }
            public void onCheckboxClicked(View view) {
                // Is the view now checked?
                boolean checked = ((CheckBox) view).isChecked();

                // Check which checkbox was clicked
                switch(view.getId()) {
                    case R.id.server1:
                        if (checked){
                            sharedObj.ssusar[1]=1;
                        }

                        else

                        {
                            sharedObj.ssusar[1]=0;
                        }
                        break;
                    case R.id.server2:
                        if (checked){
                            sharedObj.ssusar[2]=1;
                        }
                        else {
                            sharedObj.ssusar[2]=0;
                        }
                        break;
                    case R.id.server3:
                        if (checked){
                            sharedObj.ssusar[3]=1;
                        }
                        else {
                            sharedObj.ssusar[3]=0;
                        }
                        break;
                    case R.id.server4:
                        if (checked){
                            sharedObj.ssusar[4]=1;
                        }
                        else {
                            sharedObj.ssusar[4]=0;
                        }
                        break;
                    case R.id.server5:
                        if (checked){
                            sharedObj.ssusar[5]=1;
                        }
                        else {
                            sharedObj.ssusar[5]=0;
                        }
                        break;

                    case R.id.server8:
                        if (checked){
                            sharedObj.ssusar[7]=1;
                        }
                        else {
                            sharedObj.ssusar[7]=0;
                        }
                        break;
                    case R.id.server9:
                        if (checked){
                            sharedObj.ssusar[8]=1;
                        }
                        else {
                            sharedObj.ssusar[8]=0;
                        }
                        break;
                }
            }

            public void onRadioButtonClicked(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();

                // Check which radio button was clicked
                switch(view.getId()) {
                    case R.id.server6:
                        if (checked)
                            sharedObj.ssusar[6]=0;
                            break;
                    case R.id.server7:
                        if (checked)
                            sharedObj.ssusar[6]=1;
                            break;
                }
            }

}
