package android.example.com.portal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button login = (Button) findViewById(R.id.login_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText login_field = (EditText) findViewById(R.id.login_field);
                EditText password_field = (EditText) findViewById(R.id.password_field);

                Intent loginIntent = new Intent(LoginActivity.this, Laboratorios.class);
                if (login_field.getText().toString().equals("admin") && password_field.getText().toString().equals("admin")) {
                    startActivity(loginIntent);
                }
            }
        });
    }
}
