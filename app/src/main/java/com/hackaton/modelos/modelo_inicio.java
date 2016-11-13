package com.hackaton.modelos;

import com.hackaton.R;

/**
 * Created by Leo on 12/11/2016.
 */

public class modelo_inicio {
    private  String nombre;
    private int idDrawable;
    String Descripcion;

    public modelo_inicio(String nombre, int idDrawable, String descripcion) {
        this.nombre = nombre;
        this.idDrawable = idDrawable;
        Descripcion = descripcion;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }



    public static modelo_inicio[] ITEMS = {
            new modelo_inicio("Internacional", R.drawable.internacional,""),
            new modelo_inicio("Tecnología", R.drawable.tecno,"Samsung no quiere arriesgarse con el lanzamiento de sus nuevos smartphones, debido a los lamentables sucesos que ocurrieron con los Galaxy Note 7. Por esta razón, la compañía está intentando llegar a un acuerdo con LG para utilizar sus baterías en los futuros modelos de celulares como el Galaxy S8.\n" +
                    "Dicho acuerdo es parte de la estrategia de la compañía coreana para diversificar los proveedores y evitar riesgos posibles. La decisión de Samsung podría ayudar a que la producción de sus smartphones se estabilice generando credibilidad y seguridad en sus consumidores.\n" +
                    "Ambas empresas están buscando y discutiendo las maneras de llevar a cabo el suministro de baterías LG para los nuevos celulares de Samsung que saldrán a la luz el próximo año.\n" +
                    "Si el acuerdo con LG concluye en buenos términos, Samung tendría que romper su alianza con Samsung SDI, subsidiaria de la compañía que se ha encargado de proveer un 70% de baterías para sus Galaxy. El resto ha corrido por la cuenta de ATL.\n"),
            new modelo_inicio("SuperMercados", R.drawable.enterod,"En la actual crisis del consumo masivo, producto de la fuerte suba de precios en el" +
                    " último tiempo y la gran pérdida del poder adquisitivo, la percepción de los consumidores deja muy mal parados y en el ojo de la tormenta a los grandes supermercados. Para graficarlo de algún modo, la caída en el nivel de ventas que sufren este año las cadenas parece ser inversamente proporcional al incremento de los atributos negativos que reciben por parte de los compradores, principalmente, debido al exiguo compromiso con éstos frente a la escalada de la inflación, según revela un estudio de CEOP realizado entre el 21 y 26 de octubre pasado en exclusiva para Ámbito Financiero.La investigación muestra en forma contundente que más de la mitad de los encuestados (54,4%) tiene una imagen \"bastante negativa\" de los súper, particularmente, de los que integran el nivel socioeconómico (NSE) bajo. El resto, un 29,1%, dice tener una imagen regular, " +
                    "mientras que apenas un 16,5% mira a las cadenas con buenos ojos."),
            new modelo_inicio("Restuarantes", R.drawable.common_full_open_on_phone,""),
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
