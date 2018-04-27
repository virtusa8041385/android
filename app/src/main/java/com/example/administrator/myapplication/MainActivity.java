package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_card);

        Button b1 = (Button)findViewById(R.id.button_1);
        final EditText username = (EditText)findViewById(R.id.user_name);
        final EditText password = (EditText)findViewById(R.id.pass_word);
        final EditText code = (EditText)findViewById(R.id.business_code);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            if (username.getText().toString().equals("000") && password.getText().toString().equals("demo951") && code.getText().toString().equals("000")) {
                Toast.makeText(getApplicationContext(),
                        "Redirecting...", Toast.LENGTH_SHORT).show();
                Intent intent;
                intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
            else {
                Toast.makeText(getApplicationContext(),
                        "Wrong Credentials",Toast.LENGTH_SHORT).show();
            }
            }


            });
    }

}
