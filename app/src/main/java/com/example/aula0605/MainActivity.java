package com.example.aula0605;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int num = 0;
    int tot = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mais(View view) {
        TextView numcafe = findViewById(R.id.numcafe);
        TextView total = findViewById(R.id.total);
        if(num >= 0) {
            num++;
            numcafe.setText("" + num);
            tot += 3;
            total.setText("Preço total: R$" + tot);
        }else {
            numcafe.setText("0");
            total.setText("Preço total: R$0,00");

        }
    }

    public void menos(View view) {
        TextView numcafe = findViewById(R.id.numcafe);
        TextView total = findViewById(R.id.total);
        if(num != 0) {
            num--;
            numcafe.setText("" + num);
            tot -= 3;
            total.setText("Preço total: R$"+ tot);

        }else {
            numcafe.setText("0");
            total.setText("Preço total: R$0,00");
        }
    }
}
