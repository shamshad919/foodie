package com.example.shamshad.foodorder;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static com.example.shamshad.foodorder.R.id.user_name;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void comment(View view)
    {
        setContentView(R.layout.sign_in);
    }

    public void signin(View view) {
        Toast toast=Toast.makeText(getApplicationContext(),"Successfully created",Toast.LENGTH_LONG);
        toast.show();
    }


}
