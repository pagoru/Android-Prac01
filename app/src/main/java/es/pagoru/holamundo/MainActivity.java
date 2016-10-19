package es.pagoru.holamundo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_button = (Button) findViewById(R.id.button_segona);

        final EditText text_nom = (EditText) findViewById(R.id.input_nom);
        final EditText text_cognom = (EditText) findViewById(R.id.input_cognom);
        final EditText text_edat = (EditText) findViewById(R.id.input_edat);
        final CheckBox checkBox_dades = (CheckBox) findViewById(R.id.checkBox_dades);

        button_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("nom", text_nom.getText());
                intent.putExtra("cognom", text_cognom.getText());
                intent.putExtra("edat", text_edat.getText());
                intent.putExtra("dades", checkBox_dades.isChecked());
                startActivity(intent);
            }
        });

    }
}
