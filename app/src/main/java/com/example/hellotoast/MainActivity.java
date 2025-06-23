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
    private int count = 0; //Variable that has an initial value of zero.

    public static ActivityMainBinding mainBinding;

//    public TextView textDisplayCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater()); //mainBinding to reach all views.
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
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show(); //When clicking button_toast show the text "Hello Toast" for a short time.
    }

    public void showZero(View view) {
        count = 0; //Reset count.
        mainBinding.textDisplayCount.setText(String.valueOf(count)); //Show the count text.
        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray)); //Reset the button_zero color to gray.
    }

    public void showCount(View view) {
        count++; //Increase count by one when clicking on button_count.
        mainBinding.textDisplayCount.setText(String.valueOf(count)); //Show the count text.

        if (count % 2 == 0) {
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue)); //If count is even change the button_count color to blue.
        }
        else {
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green)); //If count is odd change the button_count color to green.
        }

        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange)); //When clicking on button_count on the first click change the button_zero to orange
    }
}