package iesnervion.rmanzano.intentexplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void iniciarActivity(View view) {
        //Desde aqui iniciamos DatosActivity
        //Intent Explicito
        Intent intentDatos = new Intent(this, DatosActivity.class);
        intentDatos.putExtra("numero",5);
        intentDatos.putExtra("nombre","Miguel");
        startActivity(intentDatos);
    }
}
