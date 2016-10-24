package com.mj.mymaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void irUNAM (View v) {
        callMyMap(19.3321207,-99.1882354, "UNAM Rectoría");
    }

    public void irPerisur (View v) {
        callMyMap(19.3040783, -99.1901905, "Perisur");
    }

    public void irCoyo (View v) {
        callMyMap(19.349904, -99.1623308, "Coyoacán centro");
    }

    public void irCui (View v) {
        callMyMap(19.3010226, -99.1853223, "Pirámide de Cuicuilco");
    }

    public void callMyMap (Double Lat, Double Len, String LocName){
        Intent i = new Intent(this, MapsActivity.class);
        i.putExtra("Lat",Lat);
        i.putExtra("Len",Len);
        i.putExtra("LocName", LocName);
        startActivity(i);
    }
}
