package com.devfest.its.its_devfest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
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

import com.devfest.its.its_devfest.Fragments.ContactFragment;
import com.devfest.its.its_devfest.Fragments.HomeFragment;
import com.devfest.its.its_devfest.Fragments.JobFragment;
import com.devfest.its.its_devfest.Fragments.NewsFragment;
import com.devfest.its.its_devfest.Fragments.ProfileFragment;
import com.google.firebase.auth.FirebaseAuth;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FragmentManager mFragmentManager;

    private HomeFragment homeFragment;
    private ContactFragment contactFragment;
    private JobFragment jobFragment;
    private NewsFragment newsFragment;
    private ProfileFragment profileFragment;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


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


        //Fragments
        performHomeFragment();
        performContactFragment();
        performJobFragment ();
        performNewsFragment ();



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
        getMenuInflater().inflate(R.menu.navigation, menu);
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


    private void performFragment(Fragment fragment) {
        mFragmentManager = getSupportFragmentManager();

        FragmentTransaction fragmentTransaction = mFragmentManager
                .beginTransaction();
        fragmentTransaction.replace(R.id.content_frame, fragment);
        fragmentTransaction.commit();
    }

    private void performHomeFragment(){
        homeFragment = HomeFragment.newInstance();
        performFragment(homeFragment);
    }

    private void performContactFragment(){
        contactFragment = ContactFragment.newInstance();
        performFragment(homeFragment);
    }

    private void performJobFragment (){
        JobFragment jobFragment = JobFragment.newInstance();
        performFragment(jobFragment);
    }
    private void performNewsFragment (){
        NewsFragment newsFragment = NewsFragment.newInstance();
        performFragment(newsFragment);
    }









    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {

            performHomeFragment();

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_cart) {

        } else if (id == R.id.nav_categorie) {

        } else if (id == R.id.nav_contact) {

            performContactFragment();

        }else if (id == R.id.nav_guestbook) {

        }else if (id == R.id.nav_job) {

            performJobFragment ();

        }else if (id == R.id.nav_login) {

        }else if (id == R.id.nav_profile) {

        }else if (id == R.id.nav_news) {

        }else if (id == R.id.nav_startsiets) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
