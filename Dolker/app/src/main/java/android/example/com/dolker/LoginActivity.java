package android.example.com.dolker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.login_button);
        Button signup = (Button) findViewById(R.id.signup_button);
        Button forgetPassword = (Button) findViewById(R.id.forgetPassword);

        // Set a click listener on that Button
        login.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });

        // Set a click listener on that Button
        signup.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent signupIntent = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(signupIntent);
            }
        });

        // Set a click listener on that Button
        forgetPassword.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent forgetPasswordIntent = new Intent(LoginActivity.this, FindAccount.class);
                startActivity(forgetPasswordIntent);
            }
        });

    }
}
