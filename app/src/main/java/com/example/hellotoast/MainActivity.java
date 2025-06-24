package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hellotoast.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //Variable that has an initial value of zero.
    private int count = 0;

    public static ActivityMainBinding mainBinding;

//    public TextView textDisplayCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        //mainBinding to reach all views.
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
//      setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        textDisplayCount = findViewById(R.id.text_display_count);
    }
    public void showToast(View view) {
        //When clicking button_toast show the text "Hello Toast" for a short time.
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void showZero(View view) {
        //Reset count.
        count = 0;
        //Show the count text.
        mainBinding.textDisplayCount.setText(String.valueOf(count));
        //Reset the button_zero color to gray.
        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }

    public void showCount(View view) {
        //Increase count by one when clicking on button_count.
        count++;
        //Show the count text.
        mainBinding.textDisplayCount.setText(String.valueOf(count));

        if (count % 2 == 0) {
            //If count is even change the button_count color to blue.
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        }
        else {
            //If count is odd change the button_count color to green.
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }

        //When clicking on button_count on the first click change the button_zero to orange.
        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange));
    }
}