package es.pagoru.holamundo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by pablo on 19/10/16.
 */

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String nom =  getIntent().getExtras().get("nom").toString();
        String cognom = getIntent().getExtras().get("cognom").toString();
        String edat = getIntent().getExtras().get("edat").toString();
        boolean dades = (boolean) getIntent().getExtras().get("dades");

        TextView edit_nom_cognom = (TextView) findViewById(R.id.txt_nom);
        TextView edit_edat = (TextView) findViewById(R.id.txt_edat);
        TextView edit_dades = (TextView) findViewById(R.id.txt_dades);

        edit_nom_cognom.setText("Nom: " + nom + " " + cognom);
        edit_edat.setText("Edat: " + edat);
        Toast.makeText(this.getApplicationContext(), (dades) ? "Accepta les dades" : "No accepta les dades", Toast.LENGTH_LONG).show();

    }

}
