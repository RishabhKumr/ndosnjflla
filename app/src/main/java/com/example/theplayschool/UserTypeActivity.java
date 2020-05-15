package com.example.theplayschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.FileInputStream;

public class UserTypeActivity extends AppCompatActivity {
    private ImageButton student_btn;
    private TextView user_name;
    private String file = "UserName";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_type);
        student_btn = (ImageButton) findViewById(R.id.imageButton1);
        user_name = (TextView) findViewById(R.id.name);
        student_btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {

                // Start NewActivity.class
                Intent myIntent = new Intent(UserTypeActivity.this,
                        StudentInfoUpdate.class);
                startActivity(myIntent);
            }
        });

        //Username read
        try {
            FileInputStream fin = openFileInput(file);
            int c;
            String temp = " ";
            while((c = fin.read())!= -1) {
                temp = temp + Character.toString((char) c);
            }
            user_name.setText(temp);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
