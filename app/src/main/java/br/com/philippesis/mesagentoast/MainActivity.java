package br.com.philippesis.mesagentoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnGerarToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGerarToast = (Button) findViewById(R.id.idBtnGerarToast);

        btnGerarToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText( MainActivity.this, "Toast gerado!", Toast.LENGTH_LONG).show();

            }
        });

    }
}
