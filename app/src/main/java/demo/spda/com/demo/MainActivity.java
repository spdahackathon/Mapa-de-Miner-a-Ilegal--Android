package demo.spda.com.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.esri.android.map.MapView;
import com.esri.android.map.ags.ArcGISDynamicMapServiceLayer;

public class MainActivity extends AppCompatActivity {
    MapView mv;//objeto mapa
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //enlazando etiqueta la parte visual del mapa con la programación
        //jalandolo de la vista
        mv= (MapView) findViewById(R.id.map);

        //Añadiendo nueva capa al mapa
        mv.addLayer( //pidiendo mapa al geoservidor de minam
                new ArcGISDynamicMapServiceLayer(
                        "http://geoservidor.minam.gob.pe/arcgis/rest/services/MAPA_FINAL_ACT_MINERA/MapServer"
                ));

    }
}
