package android.example.com.dolker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FindAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_account);

        Button findAccount = (Button) findViewById(R.id.findAccount);

        // Set a click listener on that Button
        findAccount.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the login Button is clicked on.
            @Override
            public void onClick(View view) {
                Intent findAccountIntent = new Intent(FindAccount.this, RecoverAccountActivity.class);
                startActivity(findAccountIntent);
            }
        });
    }
}
