package com.example.a5835512032.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private TextView tv2;
    private EditText edtName;
    private Button btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtName = findViewById(R.id.edtName);
        btnDelete = findViewById(R.id.btnDelete);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText("");
                tv2.setText("");
            }
        });
    }

    public void submit(View view) {
        tv1.setText( edtName.getText()  );
        tv2.setText("PS Operation");
    }
}