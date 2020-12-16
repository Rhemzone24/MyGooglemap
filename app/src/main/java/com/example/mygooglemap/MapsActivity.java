package com.example.mygooglemap;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    ArrayList<LatLng> arrayList= new ArrayList<>();
    LatLng Philippines = new LatLng(12.3300, 122.4880);
    LatLng Tabtabungao = new LatLng(16.2195, 120.4680);
    LatLng Binmeckeg = new LatLng(16.2075, 120.4747);
    LatLng Concepcion = new LatLng(16.2267, 120.4636);
    LatLng Pinmilapil = new LatLng( 16.2047, 120.4572);
    LatLng Urdaneta = new LatLng(15.9758, 120.4680);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        arrayList.add(Philippines);
        arrayList.add(Tabtabungao);
        arrayList.add(Binmeckeg);
        arrayList.add(Concepcion);
        arrayList.add(Pinmilapil);
        arrayList.add(Urdaneta);
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

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {
        } else if (mMap != null) {
            // Access to the location has been granted to the app.
            mMap.setMyLocationEnabled(true);
        }

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(16.2321, 120.4811);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Rhemz's Location"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //marker of urdaneta
        Marker m1 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.980620369721564, 120.56062868579194))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Pino's Location"));
        //marker of pino
        Marker m2 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.8518, 120.5861))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Pino's Location"));
        //marker of jane
        Marker m3 = googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(15.81283, 120.69257))
                .anchor(0.5f, 0.5f)
                .title("LOCATION")
                .snippet("Jane Pauline's Location"));
        //Location of mine
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(16.2321, 120.4811))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
        //Location of Pino
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.8518, 120.5861))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
       //location of jane
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.81283, 120.69257))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));




    //location of urdaneta
        mMap.addCircle(new CircleOptions()
                .center(new LatLng(15.980620369721564, 120.56062868579194))
                .radius(5000)
                .strokeWidth(10)
                .strokeColor(Color.GREEN)
                .fillColor(Color.argb(128, 255, 0, 0)));
        //route of rhemz
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.2321, 120.4811),
                        new LatLng(16.223429397162167,120.49934900462878),
                        new LatLng(16.20964350059096, 120.50317757057351),
                        new LatLng(16.206886205530765, 120.51274898543535),
                        new LatLng(16.176553415644268, 120.51609898063701),
                        new LatLng(16.16690109599733, 120.52184182955415),
                        new LatLng(16.15724830492719, 120.52279897104033),
                        new LatLng(16.139780152133266, 120.52471325401271),
                        new LatLng(16.131505225913244, 120.52902039070052),
                        new LatLng(16.131045497652917, 120.52136325881105),
                        new LatLng(16.113115263607213,  120.5299775321867),
                        new LatLng(16.09150487896968, 120.54337751299332),
                        new LatLng(16.066673023583473, 120.55342749859827),
                        new LatLng(16.04689729186499, 120.56204177197394),
                        new LatLng(16.02935250274424, 120.56495061872741),
                        new LatLng(16.013501035054098,  120.57719471154152),
                        new LatLng(16.00509444288663, 120.58244217989044),
                        new LatLng(16.001971904243582, 120.57819422932228),
                        new LatLng(16.001971904243582, 120.57594531431559),
                        new LatLng(15.987319340514542, 120.57294676097335),
                        new LatLng(15.97650938396586,  120.57094772541186),
                        new LatLng(15.979299119983411, 120.57095494068223),
                        new LatLng(15.97881704020378, 120.56607039925031),
                        new LatLng(15.97987047229225, 120.56367455953654),
                        new LatLng(15.980084728987434, 120.56313595991097),
                        new LatLng(15.981798774288743, 120.5600715137655),
                        new LatLng(15.980620369721564,  120.56062868579194))

                .width(10)
                .color(Color.BLUE));
       //route of pino
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.8518,120.5861),
                        new LatLng(15.8792, 120.6014),
                        new LatLng(15.9, 120.5833),
        new LatLng(15.9884,  120.5734))


                .width(10)
                .color(Color.BLUE));
       //route of jane
        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.81283,120.69257),
                        new LatLng(15.8792, 120.6014),
                        new LatLng(15.9, 120.5833),
                        new LatLng(15.9884,  120.5734))


                .width(10)
                .color(Color.BLUE));




        enableMyLocation();
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setZoomGesturesEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
    }


    public void enableMyLocation() {

    }
}