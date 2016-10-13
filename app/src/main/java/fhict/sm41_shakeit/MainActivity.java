package fhict.sm41_shakeit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button continueButton = (Button) findViewById(R.id.continueButton);
        final EditText personen = (EditText) findViewById(R.id.personen);
        final EditText range = (EditText) findViewById(R.id.range);
        final EditText budget = (EditText) findViewById(R.id.budget);
        final EditText tijd = (EditText) findViewById(R.id.tijd);

        continueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence text;
                int duration = Toast.LENGTH_SHORT;
                if(personen.length() < 1) {
                    text = "Vul het aantal personen in";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(range.length() < 1) {
                    text = "Vul het maximale aantal km in";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(budget.length() < 1) {
                    text = "Vul het maximale bedrag in";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else if(tijd.length() < 1) {
                    text = "Vul de maximale lengte in";
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Intent intent = new Intent(MainActivity.this, ShakeActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
