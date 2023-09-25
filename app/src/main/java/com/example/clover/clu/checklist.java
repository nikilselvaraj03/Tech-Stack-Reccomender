package com.example.clover.clu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;


/**
 * Created by Nishanth on 17-02-2017.
 */

public class checklist extends Activity {
    Button submit;
    Singleton sharedObj;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.check_box);
        sharedObj=Singleton.getInstance();
        submit=(Button)findViewById(R.id.next3);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),fields.class);
                startActivity(i);
            }
        });
    }
            public void onCheckboxClicked(View view) {
                // Is the view now checked?
                boolean checked = ((CheckBox) view).isChecked();

                // Check which checkbox was clicked
                switch(view.getId()) {
                    case R.id.db1:
                        if (checked){
                            sharedObj.clusar[1]=1;
                        }

                        else

                        {
                            sharedObj.clusar[1]=0;
                        }
                        break;
                    case R.id.db2:
                        if (checked){
                            sharedObj. clusar[2]=1;
                        }
                        else {
                            sharedObj.clusar[2]=0;
                        }
                        break;
                    case R.id.db3:
                        if (checked){
                            sharedObj.clusar[3]=1;
                        }
                        else {
                            sharedObj.clusar[3]=0;
                        }
                        break;
                    case R.id.db4:
                        if (checked){
                            sharedObj.clusar[4]=1;
                        }
                        else {
                            sharedObj.clusar[4]=0;
                        }
                        break;
                    case R.id.db5:
                        if (checked){
                            sharedObj.clusar[5]=1;
                        }
                        else {
                            sharedObj.clusar[5]=0;
                        }
                        break;
                    case R.id.db6:
                        if (checked){
                            sharedObj.clusar[6]=1;
                        }
                        else {
                            sharedObj.clusar[6]=0;
                        }
                        break;
                }
            }
            public void onRadioButtonClicked(View view) {
                // Is the button now checked?
                boolean checked = ((RadioButton) view).isChecked();

                // Check which radio button was clicked
                switch(view.getId()) {
                    case R.id.db7:
                        if (checked)
                            sharedObj.clusar[7]=0;                            break;
                    case R.id.db8:
                        if (checked)
                            sharedObj.clusar[7]=1;
                            break;
                    case R.id.db9:
                        if (checked)
                            sharedObj.clusar[8]=0;
                        break;
                    case R.id.db10:
                        if (checked)
                            sharedObj.clusar[8]=1;
                        break;
                }
            }

}