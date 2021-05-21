package com.example.myrestaurants;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    private Button mfindRestaurantsButton;
    private EditText mlocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mlocationEditText = (EditText) findViewById(R.id.locationEditText);
        mfindRestaurantsButton = (Button)findViewById(R.id.findRestaurantsButton);
            mfindRestaurantsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
                    String location = mlocationEditText.getText().toString();
                    Log.d(TAG, location);
                    Intent intent = new Intent(MainActivity.this, RestaurantsActivity.class);
                    startActivity(intent);
                }
            });
    }
}