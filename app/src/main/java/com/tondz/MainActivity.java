package com.tondz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn_go;
    TextView textView_masv,textView_malop,textView_hoten;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_go = findViewById(R.id.button_goto);
        textView_hoten = findViewById(R.id.editText_hoten);
        textView_masv = findViewById(R.id.editText_masv);
        textView_malop = findViewById(R.id.editText_malop);
        btn_go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo();
            }
        });
    }
    public void goTo(){
        Intent intent = new Intent(this,YThucHocTap.class);
        startActivity(intent);
    }
}