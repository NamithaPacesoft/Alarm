package com.example.user.firstapplicationipc.activity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.firstapplicationipc.R;

import org.w3c.dom.Text;

/**
 * Created by User on 2017-06-13.
 */

public class MessageActivity extends AppCompatActivity {


    TextView tvDescription;
    Button btnOk;
    Button btnSend;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_display_message);


        initializeMyComponent();
        addActionListener();
    }

    private void initializeMyComponent(){
        tvDescription = (TextView) findViewById(R.id.tv_description);
        btnOk = (Button) findViewById(R.id.btn_ok);

        tvDescription.setText("Hello");
    }

    private void addActionListener(){
        btnOk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
    }
}
