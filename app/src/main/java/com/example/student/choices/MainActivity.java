package com.example.student.choices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox oreo;
    private CheckBox reeses;
    private CheckBox butterfinger;
    private CheckBox caramel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String selectedItems = new String();
        oreo = findViewById(R.id.oreo_box);
        reeses = findViewById(R.id.reeses_box);
        butterfinger = findViewById(R.id.butterfinger_box);
        caramel = findViewById(R.id.caramel_box);
        if(oreo.isChecked()){
            oreo.append(selectedItems);
        }
        if (reeses.isChecked()){
            reeses.append(selectedItems);
        }
        if(butterfinger.isChecked()){
            butterfinger.append(selectedItems);
        }
        if(caramel.isChecked()){
            caramel.append(selectedItems);
        }
    }

    public void showToast(String message) {

        Toast.makeText(MainActivity.this,
                message, Toast.LENGTH_LONG).show();
    }

}
