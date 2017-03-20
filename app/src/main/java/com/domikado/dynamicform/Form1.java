package com.domikado.dynamicform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;

public class Form1 extends AppCompatActivity {

    LinearLayout layout1;
    LinearLayout.LayoutParams params;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);

        layout1 = (LinearLayout) findViewById(R.id.layout1);
        setView();

//        LinearLayout
//        step 1 instantiate linear layout

//        EditText
//        step 1 buat method untuk menghandle dynamic dari edittext
//        step 2 buat method untuk handle view yang di add ke linear layout
    }

    private void setView(){
        createOrhandleEdittext("Your Email");
        createOrhandleEdittext("your name");
    }


    private void createOrhandleEdittext(String text){
        EditText editText = new EditText(this);
        editText.setHint("Your Email");
        editText.setHint("your name");
        layout1.addView(editText);
    }
}
