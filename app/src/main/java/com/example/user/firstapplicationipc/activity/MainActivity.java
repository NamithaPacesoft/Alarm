package com.example.user.firstapplicationipc.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.user.firstapplicationipc.R;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    ListView lstView;
    EditText etCommonWords;
    Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_simple_items);

        initializeMyComponents();
        addActionListener();
    }


    public void initializeMyComponents(){
        lstView= (ListView)findViewById(R.id.lv_simple);
        etCommonWords=(EditText) findViewById(R.id.et_word);
        btnAdd = (Button) findViewById(R.id.btn_add);

    }

    public void addActionListener(){
        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                if(etCommonWords.getText().equals(etCommonWords.getHint()) || (etCommonWords.getText().length()==0)){

                }else{


                }


            }
        });
    }


}
