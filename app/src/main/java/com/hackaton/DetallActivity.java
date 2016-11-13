package com.hackaton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.hackaton.modelos.modelo_inicio;

public class DetallActivity extends AppCompatActivity {

    public static String EXTRA_PARAM_ID ="com.hackaton.extra.ID";
    public  static String Extra_PARAM_descripcion = "com.hackaton.extra.descrip";
    public static String VIEW_NAME_HEADER_IMAGE="imagen_compartida";

modelo_inicio modelo;
    TextView des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detall);

        modelo = modelo_inicio.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID, 0));
        loadImageParallax(modelo.getIdDrawable());
        des = ( TextView) findViewById(R.id.descripcion);
cargarDescripcion(modelo_inicio.getItem(getIntent().getIntExtra(EXTRA_PARAM_ID,0)).getDescripcion());

    }


    private void loadImageParallax(int id) {
        ImageView image = (ImageView) findViewById(R.id.image_paralax);
        // Usando Glide para la carga asíncrona
        Glide.with(this)
                .load(id)
                .centerCrop()
                .into(image);

    }

    private  void cargarDescripcion(String id){
       des.setText(id);
    }




}
