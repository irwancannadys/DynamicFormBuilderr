package com.domikado.dynamicform;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.button)
    Button button;

    @BindView(R.id.button2)
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void form_satu(){
//        Toast.makeText(this, "test", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(getApplicationContext(), Form1.class));
    }

    @OnClick(R.id.button2)
    public void form_dua(){
        startActivity(new Intent(getApplicationContext(), Form2.class));
    }
}
