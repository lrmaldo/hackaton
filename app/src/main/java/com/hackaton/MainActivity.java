package com.hackaton;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.hackaton.modelos.FirebaseAdapter;
import com.hackaton.modelos.modelo_inicio;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private AdView mAdView;
    private GridView gridView;
   FirebaseAdapter adapter;
    FirebaseHelper helper;
    expandibleGrid expa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       // mAdView = (AdView) findViewById(R.id.adView);
        //AdRequest adRequest = new AdRequest.Builder().build();
       // mAdView.loadAd(adRequest);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.backgroundColor));

        gridView = (GridView) findViewById(R.id.grid);
        adapter = new FirebaseAdapter(this);
        gridView.setAdapter(adapter);
        //gridView.setOnItemClickListener(this);

       //gridView = (expandibleGrid)  findViewById(R.id.grid);
        //gridView

        gridView.setOnItemClickListener(this);

        //expa = new expandibleGrid(gridView.getContext());
        CollapsingToolbarLayout collapser =
                (CollapsingToolbarLayout) findViewById(R.id.collapser);
        collapser.setTitle("Noticias Nuevas");
        collapser.setCollapsedTitleTextColor(getResources().getColor(R.color.backgroundColor));
        // Cambiar título

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            gridView.setNestedScrollingEnabled(true);
        }

        loadImageParallax(R.drawable.portada);// Cargar Imagen




    }

    /**
     * Se carga una imagen aleatoria para el detalle
     */
    private void loadImageParallax(int id) {
        ImageView image = (ImageView) findViewById(R.id.image_paralax);
        // Usando Glide para la carga asíncrona
        Glide.with(this)
                .load(id)
                .centerCrop()
                .into(image);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.quejas:
                showSnackBar("Quejas...");
                Intent intent = new Intent(this, QuejasActivity.class);
                startActivity(intent);


                return true;
            case R.id.notificacion:
                showSnackBar("Se");
                return true;
            case R.id.login:
                showSnackBar("Por favor espere...");
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Proyecta una {@link Snackbar} con el string usado
     *
     * @param msg Mensaje
     */
    private void showSnackBar(String msg) {
        Snackbar
                .make(findViewById(R.id.coordinator), msg, Snackbar.LENGTH_LONG)
                .show();
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        modelo_inicio item = (modelo_inicio) parent.getItemAtPosition(position);

        Intent intent = new Intent(this, DetallActivity.class);
        intent.putExtra(DetallActivity.EXTRA_PARAM_ID, item.getId());

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            ActivityOptionsCompat activityOptions =
                    ActivityOptionsCompat.makeSceneTransitionAnimation(
                            this,
                           new Pair<View, String>(view.findViewById(R.id.imagen_coche),
                                  DetallActivity.VIEW_NAME_HEADER_IMAGE)
                   );

            ActivityCompat.startActivity(this, intent, activityOptions.toBundle());
        } else{
            startActivity(intent);
        }

  //
    }





}
