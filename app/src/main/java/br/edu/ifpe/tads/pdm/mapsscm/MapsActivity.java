package br.edu.ifpe.tads.pdm.mapsscm;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener {

    private GoogleMap mMap;
    private GoogleMap.OnMarkerClickListener clickListener;
    private float rot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }




    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setOnMarkerClickListener(this);



        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-25.274398, 133.775136);
        LatLng usa = new LatLng(36.2080012, -100.7390755);
        LatLng jpn = new LatLng(36.204824, 138.252924);
        LatLng ger = new LatLng(51.165691, 10.451526);
        LatLng sta = new LatLng(-30.559482, 22.937506);
        LatLng arg = new LatLng(-38.416097, -63.616672);




        mMap.addMarker(new MarkerOptions().position(sydney).title("AUD 2,79"));
        mMap.addMarker(new MarkerOptions().position(usa).title("USD 3,87"));
        mMap.addMarker(new MarkerOptions().position(jpn).title("JPY 0,03"));
        mMap.addMarker(new MarkerOptions().position(ger).title("EUR 4,40"));
        mMap.addMarker(new MarkerOptions().position(sta).title("ZAR 0,28"));
        mMap.addMarker(new MarkerOptions().position(arg).title("ARS 0,40"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(usa));
    }

    @Override
    public boolean onMarkerClick(Marker marker) {


    return false;

    }
}
