package com.junjun.tobtoun;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.in_id);
        password = (EditText)findViewById(R.id.in_pass);
        btn = (Button)findViewById(R.id.butt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("1234")){
                    Intent bt = new Intent(MainActivity.this,page2.class);
                    startActivity(bt);
                    Toast.makeText(getApplicationContext(),"SUCCESS!!!",Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"WRONG!!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
