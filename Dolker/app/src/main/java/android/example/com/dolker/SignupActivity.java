package android.example.com.dolker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        Button join = (Button) findViewById(R.id.join_button);

        // Set a click listener on that Button
        join.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(SignupActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
