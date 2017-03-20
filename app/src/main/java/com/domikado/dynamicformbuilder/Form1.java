package com.domikado.dynamicformbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class Form1 extends AppCompatActivity {

    private static int viewsCount = 0;
    private List<View> allViews = new ArrayList<>();

    LinearLayout layout, gambar;
    LinearLayout.LayoutParams parameterLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form1);

        layout = (LinearLayout) findViewById(R.id.layout1);
        gambar = (LinearLayout) findViewById(R.id.gambar);
        parameterLayout = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        parameterLayout.setMargins(8, 8, 8, 8);

        setViewEdittext();
        setViewSpinner();
        setViewCheckBox();
        setViewEdittext();
        setViewButton();
        viewImage();
    }

    private void setViewEdittext(){
        createOrhandleEdittext("Your Email");
        createOrhandleEdittext("your name");
    }

    private void setViewSpinner(){
        ArrayList<String> spinnerList = new ArrayList<>();
        spinnerList.add("Indonesia");
        spinnerList.add("Germany");
        spinnerList.add("Japan");
        spinnerList.add("Belanda");
        spinnerList.add("Australia");
        createOrhandleSpinner(spinnerList);
    }

    private void setViewCheckBox(){
        createCheckBox("Go Language");
        createCheckBox("Java");
        createCheckBox("Python");
        createCheckBox("AngularJs");

    }

    private void setViewButton(){
        createOrHandleButton();
    }

    //for handle EditText
    private void createOrhandleEdittext(String text){
        EditText editText = new EditText(this);
        editText.setHint(text);
        editText.setId(viewsCount++); //for handle id in widget
        allViews.add(editText);
        layout.addView(editText, parameterLayout);
    }

    //for handle Spinner
    private void createOrhandleSpinner(List<String> spiner){
        Spinner spinner = new Spinner(this);
        spinner.setId(viewsCount++); // for handle id in widget
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, spiner);
        spinner.setAdapter(adapter);
        allViews.add(spinner);
        layout.addView(spinner,parameterLayout);
    }

    //for handle CheckBox
    public void createCheckBox(String label) {

        final CheckBox checkBox = new CheckBox(this);
        checkBox.setId(viewsCount++);
        checkBox.setText(label);
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        allViews.add(checkBox);
        layout.addView(checkBox,parameterLayout);
    }

    private void createOrHandleButton(){
        Button button = new Button(this);
        button.setId(viewsCount++);
        button.setText("Submit");
        button.setOnClickListener(submit);
        layout.addView(button, parameterLayout);
    }

    private void createImageView(int drwable){
        ImageView image = new ImageView(this);
        image.setMaxWidth(5);
        image.setMaxHeight(5);
        image.setBackgroundResource(drwable);
        image.setId(viewsCount++);
        gambar.addView(image);

    }

    private void viewImage(){
        createImageView(R.mipmap.ic_launcher);
    }

    private View.OnClickListener submit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // do something
        }
    };

}
