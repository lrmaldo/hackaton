package com.hackaton.modelos;

import com.google.firebase.database.IgnoreExtraProperties;
import com.hackaton.R;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Leo on 12/11/2016.
 */

public class modelo_inicio {
    private  String nombre;
    private int idDrawable;

    public modelo_inicio(String nombre, int idDrawable) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




    public int getIdDrawable() {
        return idDrawable;
    }

    public int getId() {
        return nombre.hashCode();
    }

    public static modelo_inicio[] ITEMS = {
            new modelo_inicio("Tecnologías", R.drawable.common_full_open_on_phone),
            new modelo_inicio("Viajes", R.drawable.common_full_open_on_phone),
            new modelo_inicio("Supermercados", R.drawable.common_full_open_on_phone),
            new modelo_inicio("Restuarantes", R.drawable.common_full_open_on_phone),
           // new modelo_inicio("", R.drawable.bmw_serie6_cabrio_2015),
           // new modelo_inicio("Ford Mondeo", R.drawable.ford_mondeo),
            //new modelo_inicio("Volvo V60 Cross Country", R.drawable.volvo_v60_crosscountry),
            //new modelo_inicio("Jaguar XE", R.drawable.jaguar_xe),
           // new modelo_inicio("VW Golf R Variant", R.drawable.volkswagen_golf_r_variant_2015),
            //new modelo_inicio("Seat León ST Cupra", R.drawable.seat_leon_st_cupra),
    };

    /**
     * Obtiene item basado en su identificador
     *
     * @param id identificador
     * @return Coche
     */
    public static modelo_inicio getItem(int id) {
        for (modelo_inicio item : ITEMS) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


}
