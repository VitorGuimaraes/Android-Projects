package android.example.com.dolker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button registerDog = (Button) findViewById(R.id.registerDog);
        Button dogsList = (Button) findViewById(R.id.dogsList);
        Button rides = (Button) findViewById(R.id.rides);
        Button callDolker = (Button) findViewById(R.id.callDolker);
        ImageButton options = (ImageButton) findViewById(R.id.options);

        // Set a click listener on that Button
        registerDog.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent registerDogIntent = new Intent(MainActivity.this, RegisterDogActivity.class);
                startActivity(registerDogIntent);
            }
        });

        // Set a click listener on that Button
        dogsList.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent dogsListIntent = new Intent(MainActivity.this, DogsListActivity.class);
                startActivity(dogsListIntent);
            }
        });

        // Set a click listener on that Button
        rides.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent ridesIntent = new Intent(MainActivity.this, RidesActivity.class);
                startActivity(ridesIntent);
            }
        });

        // Set a click listener on that Button
        callDolker.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent callDolkerIntent = new Intent(MainActivity.this, CallDolkerActivity.class);
                startActivity(callDolkerIntent);
            }
        });

        // Set a click listener on that Button
        options.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent optionsIntent = new Intent(MainActivity.this, OptionsActivity.class);
                startActivity(optionsIntent);
            }
        });
    }
}
