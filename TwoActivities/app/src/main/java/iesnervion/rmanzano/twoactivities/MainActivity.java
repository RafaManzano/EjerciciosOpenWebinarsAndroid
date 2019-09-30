package iesnervion.rmanzano.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto = findViewById(R.id.textoEvento);

        /*
        Con clase anonima
        texto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Toast.makeText(MainActivity.this, "Has hecho click con escuchador", Toast.LENGTH_SHORT).show();
            }
        });
         */
        texto.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if(id == R.id.textoEvento) {
            Toast.makeText(this, "Has hecho click en el texto y gestionado desde Java", Toast.LENGTH_SHORT).show();
        }
        /*
        else {

        }
        */
    }

    /*
    public void initSecActivity(View view) {
        Toast.makeText(this, "Has hecho click en el texto", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this, "Has hecho click en el texto", Toast.LENGTH_LONG).show();
    }
    */

}
