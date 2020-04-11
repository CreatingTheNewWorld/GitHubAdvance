package com.example.githubadvance;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Local_branch: master, remote_branch: master, first commit", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Local_branch: master, remote_branch: master, second commit", Toast.LENGTH_SHORT).show();
        //branch help_b
        //branch master
        //branch help_b

        //hello
    }
}
