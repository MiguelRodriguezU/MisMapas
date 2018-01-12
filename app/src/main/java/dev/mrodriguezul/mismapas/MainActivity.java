package dev.mrodriguezul.mismapas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnIrMapas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btnIrMapas = (Button) findViewById(R.id.btn_ir_mapas);

        btnIrMapas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verMapa(view.getId());

            }
        });*/
    }

    public void irLocal(View view){

        Intent intento = new Intent(this, MapsActivity.class);

        if(view.getId() == R.id.btn_ir_centro_comercial){
            intento = new Intent(this, MapsActivity.class);
            intento.putExtra(Constantes.LATITUD,-12.086317);
            intento.putExtra(Constantes.LONGITUD,-77.034775);
            intento.putExtra(Constantes.TITULO,"Centro Comercial Risso");
            intento.putExtra(Constantes.ICONO,R.drawable.ic_centro_comercial);
        }

        if(view.getId() == R.id.btn_ir_iglesia){
            intento = new Intent(this, MapsActivity.class);
            intento.putExtra(Constantes.LATITUD,-12.082469);
            intento.putExtra(Constantes.LONGITUD,-77.031853);
            intento.putExtra(Constantes.TITULO,"Iglesia Santa Beatríz");
            intento.putExtra(Constantes.ICONO,R.drawable.ic_action_church);
        }

        if(view.getId() == R.id.btn_ir_hospital){
            intento = new Intent(this, MapsActivity.class);
            intento.putExtra(Constantes.LATITUD,-12.091318);
            intento.putExtra(Constantes.LONGITUD,-77.028309);
            intento.putExtra(Constantes.TITULO,"Clínica Javier Prado");
            intento.putExtra(Constantes.ICONO,R.drawable.ic_hospital);
        }

        if(view.getId() == R.id.btn_ir_restaurante){
            intento = new Intent(this, MapsActivity.class);
            intento.putExtra(Constantes.LATITUD,-12.089810);
            intento.putExtra(Constantes.LONGITUD,-77.033160);
            intento.putExtra(Constantes.TITULO,"Restaurante Vegano");
            intento.putExtra(Constantes.ICONO,R.drawable.ic_action_restaurante);
        }
        if(intento != null){
            startActivity(intento);
        }
    }

    public void verMapa(int idLocal){
        if(idLocal == R.id.btn_ir_iglesia){

        }
        Intent intento = new Intent(this, MapsActivity.class);
        intento.putExtra(Constantes.LATITUD,-12.082469);
        intento.putExtra(Constantes.LONGITUD,-77.031853);
        intento.putExtra(Constantes.TITULO,"Iglesia!");
        intento.putExtra(Constantes.ICONO,R.drawable.ic_action_church);
        startActivity(intento);
    }
}
