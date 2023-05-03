package com.example.m3l4a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnOurButton;
    TextView txtOurTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnOurButton = findViewById(R.id.bt1);
        txtOurTextView = findViewById(R.id.t1);

        btnOurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtOurTextView.setVisibility(View.VISIBLE);
                txtOurTextView.setText("hello world");

            }
        });

    }
}