package com.example.nhuthuy.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a, b;
    Button tinh;
    TextView x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (EditText)findViewById(R.id.txtnhapa);
        b = (EditText)findViewById(R.id.txtnhapb);
        tinh = (Button)findViewById(R.id.btntinh);
        x = (TextView)findViewById(R.id.tvketqua);

        tinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hsa = Integer.parseInt(a.getText().toString());
                int hsb = Integer.parseInt(b.getText().toString());

                double nghiem = (double) -hsb/hsa;

                if (hsa == 0) {
                    if (hsb == 0) {
                        x.setText("Phương trình vô số nghiệm");
                    }
                    else
                        x.setText("Phương trình vô nghiệm");
                }
                else
                    x.setText("Nghiệm của phương trình là:" +nghiem);
            }
        });
    }
}
