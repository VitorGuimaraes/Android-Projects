package android.example.com.dolker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegisterDogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_dog);

        Button registerButton = (Button) findViewById(R.id.registerButton);

        // Set a click listener on that Button
        registerButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(RegisterDogActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });

    }
}
