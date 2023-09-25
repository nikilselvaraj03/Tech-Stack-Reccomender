package com.example.clover.clu;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SearchViewCompat;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    ImageButton android,ios,win,macos,web,linux,unix;

   Singleton sharedObj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        sharedObj = Singleton.getInstance( );
        sharedObj.js= new int[] {1,1,1,1,0,1,1,1,1,1,1};
        sharedObj.objc=new int[]{1,1,0,0,1,1,0,1,1,0,0};
        sharedObj.angjs=new int[]{1,1,1,1,1,1,0,1,1,1,1};
        sharedObj.swift=new int[]{0,1,1,1,1,1,1,1,1,0,1};
        sharedObj.jquery=new int[]{1,0,1,1,0,0,1,1,1,1,1};
        sharedObj.python=new int[]{1,0,1,0,1,1,0,1,1,1,1};

        sharedObj.php=new int[] {1,1,1,1,0,0,0,1};
        sharedObj.aspnet=new int[] {0,1,1,1,1,1,0,1,1};
        sharedObj.coldfusion=new int[] {1,0,1,0,1,0,1,1};
        sharedObj.python1=new int[] {1,1,1,0,0,1,1,0};
        sharedObj.nodejs=new int[] {1,1,1,1,0,1,1,1};
        sharedObj.jsp=new int[] {1,1,1,1,0,0,1,1,0};
        sharedObj.perl=new int[] {1,1,1,1,1,0,1,0};

        sharedObj.mysql=new int[] {1,1,0,1,1,0,0,0};
        sharedObj.oracle=new int[] {1,1,1,1,1,1,0,1};
        sharedObj.sqllite=new int[] {1,1,0,0,1,1,1,1};
        sharedObj.microsoftsql= new int[] {0,1,0,1,1,0,0,0};

        android=(ImageButton)findViewById(R.id.android);
        ios=(ImageButton)findViewById(R.id.ios);
        win=(ImageButton)findViewById(R.id.win);
        macos=(ImageButton)findViewById(R.id.mac_os);
        web=(ImageButton)findViewById(R.id.web);
        linux=(ImageButton)findViewById(R.id.linux_distros);
        unix=(ImageButton)findViewById(R.id.unix_distros);


        android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);
            }
        });

        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });

        win.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        macos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        ios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        linux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        unix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),frontandback.class);
                startActivity(i);

            }
        });
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;



    }




}
