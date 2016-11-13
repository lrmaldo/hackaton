package com.hackaton.modelos;

import com.hackaton.R;

/**
 * Created by Leo on 12/11/2016.
 */

public class modelo_inicio {
    String titulo;
    private  String nombre;
    private int idDrawable;
    String Descripcion;

    public modelo_inicio(String titulo, String nombre, int idDrawable, String descripcion) {
        this.titulo = titulo;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static modelo_inicio[] ITEMS = {
            new modelo_inicio("EMPRESAS DE TELECOMUNICACIONES RESISTEN LA LLEGADA DE TRUMP","Internacional", R.drawable.internacional,"El que Donald Trump sea el presidente electo de Estados Unidos tuvo como efecto inmediato la depreciación del peso. Para las empresas y consumidores de telecomunicaciones también habrá consecuencias, aunque limitadas, prevén analistas.\n" +
                    "Entre las compañías del sector que se verán más afectadas por el efecto cambiario son las que se dedican a la televisión de paga, ya que la compra de contenidos se hace en esa moneda, aunque el despliegue de redes de cuarta generación para telecomunicaciones móviles, como la tecnología 4G en lo móviles, también sentirán el ‘efecto Trump’.\n"),
            new modelo_inicio("SAMSUNG NO QUIERE ARRIESGARSE","Tecnología", R.drawable.tecno,"Samsung no quiere arriesgarse con el lanzamiento de sus nuevos smartphones, debido a los lamentables sucesos que ocurrieron con los Galaxy Note 7. Por esta razón, la compañía está intentando llegar a un acuerdo con LG para utilizar sus baterías en los futuros modelos de celulares como el Galaxy S8.\n" +
                    "Dicho acuerdo es parte de la estrategia de la compañía coreana para diversificar los proveedores y evitar riesgos posibles. La decisión de Samsung podría ayudar a que la producción de sus smartphones se estabilice generando credibilidad y seguridad en sus consumidores.\n" +
                    "Ambas empresas están buscando y discutiendo las maneras de llevar a cabo el suministro de baterías LG para los nuevos celulares de Samsung que saldrán a la luz el próximo año.\n" +
                    "Si el acuerdo con LG concluye en buenos términos, Samung tendría que romper su alianza con Samsung SDI, subsidiaria de la compañía que se ha encargado de proveer un 70% de baterías para sus Galaxy. El resto ha corrido por la cuenta de ATL.\n"),
            new modelo_inicio("CRISIS DEL CONSUMISMO","SuperMercados", R.drawable.enterod,"En la actual crisis del consumo masivo, producto de la fuerte suba de precios en el" +
                    " último tiempo y la gran pérdida del poder adquisitivo, la percepción de los consumidores deja muy mal parados y en el ojo de la tormenta a los grandes supermercados. Para graficarlo de algún modo, la caída en el nivel de ventas que sufren este año las cadenas parece ser inversamente proporcional al incremento de los atributos negativos que reciben por parte de los compradores, principalmente, debido al exiguo compromiso con éstos frente a la escalada de la inflación, según revela un estudio de CEOP realizado entre el 21 y 26 de octubre pasado en exclusiva para Ámbito Financiero.La investigación muestra en forma contundente que más de la mitad de los encuestados (54,4%) tiene una imagen \"bastante negativa\" de los súper, particularmente, de los que integran el nivel socioeconómico (NSE) bajo. El resto, un 29,1%, dice tener una imagen regular, " +
                    "mientras que apenas un 16,5% mira a las cadenas con buenos ojos."),
            new modelo_inicio("Precios al consumidor suben 0.61% en octubre","HOY EN DIA", R.drawable.gaso,"Ciudad de México. La inflación interanual de México se aceleró en octubre a su mayor nivel en más de un año y medio, en cifras previas a la victoria de Donald Trump en los comicios presidenciales en Estados Unidos que ha provocado un desplome del peso.\n" +
                    "El índice de precios al consumidor interanual se ubicó en 3.064 por ciento hasta octubre, el dato mensual más alto desde los 3.14 de marzo del año pasado, de acuerdo al Instituto Nacional de Estadística y Geografía (Inegi).\n" +
                    "El dato estuvo debajo de la mediana de estimaciones de analistas que esperaban una inflación del 3.10 por ciento en octubre, según un sondeo de Reuters.\n"),
            new modelo_inicio("Yucatán, tercer peor estado por quejas en servicio de Telecomunicaciones","Tecnologías", R.drawable.yuca,"Dijo que de las 29 mil quejas registradas de enero a noviembre, 1 mil 44 corresponden a la delegación yucateca, que representan un 3.6 por ciento.\n" +
                    "“En Yucatán la cifra responde, según nos informa la delegación estatal, a una cultura de la queja, la gente tiene confianza de reportar”, agregó y destacó que la densidad de consumidores de servicios de telefonía celular genera que la mayoría de las inconformidades sean en este sector.\n" +
                    "\n" +
                    "\n" +
                    "“La telefonía móvil es el primer giro que da problemas, en México hay 233.1 millones de subscriptores de telecomunicaciones,  el doble que los mexicanos, de esos 109 millones son de telefonía móvil, porque hay personas que utiliza dos hasta tres celulares. Con la apertura de la competencia hay más gente conectada, hay 70 millones contra 40 de hace dos años, entre más conectividad, más gente inconforme porque sí hay cobertura pero aún no con suficiente calidad” agregó, en el caso de Yucatán más de 1 millón y medio de personas son usuarios de telefonía celular\n"),
            new modelo_inicio("Innovación tecnológica fortalecerá México","Tecnología", R.drawable.forta,"El impulso a la innovación científica y tecnológica dará certeza económica al país, por ello es necesario que el gobierno apoye a las mentes brillantes de México, aseveró Inés Jiménez Palomar, directora general de Inmateciis.\n" +
                    " “Existen demasiados proyectos relacionados con la innovación tecnológica y científica, tan sólo con saber que la impresora de biomateriles 3D fue creada por un mexicano en Suiza, habla del potencial del país y su gente”.\n" +
                    "Durante la inauguración de Autodek University México 2016, la especialista en biomateriales detalló que los proyectos del futuro ya se incuban en las universidades del país; y ante el panorama económico que vive México, apostar por la inversión en desarrollos tecnológicos es la mejor opción.\n"),
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
