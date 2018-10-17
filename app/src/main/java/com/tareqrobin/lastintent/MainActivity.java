package com.tareqrobin.lastintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button hvn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hvn=findViewById(R.id.button);
        hvn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gate=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(gate);
            }
        });
    }
}
