package com.tondz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class YThucHocTap extends AppCompatActivity {

    Button button_goto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_y_thuc_hoc_tap);
        button_goto = findViewById(R.id.button_goto);
        button_goto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goTo();
            }
        });
    }
    public void goTo(){
        Intent intent = new Intent(this,ChapHanhQuyChe.class);
        startActivity(intent);
    }
}