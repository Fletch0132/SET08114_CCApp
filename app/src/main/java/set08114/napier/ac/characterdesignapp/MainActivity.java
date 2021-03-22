package set08114.napier.ac.characterdesignapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //NAVIGATES TO ACTIVITYTWOMALE ON BUTTON CLICK
        Button btnMale = (Button) findViewById(R.id.btnMale);
        btnMale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //STORES VARIABLE FOR LATER USE - DETERMINE WHAT IS DISPLAYED
                StaticVariables.maleSelected = true;

                Intent activityTwoMale = new Intent (MainActivity.this, ActivityTwoMale.class);
                startActivity(activityTwoMale);
            }
        });




        //NAVIGATE TO ACTIVITYTWOFEMALE ON BUTTON CLICK
        Button btnFemale = (Button) findViewById(R.id.btnFemale);
        btnFemale.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                //STORES VARIABLE FOR LATER USE - DETERMINE WHAT IS DISPLAYED
                StaticVariables.femaleSelected = true;

                Intent activityTwoFemale = new Intent (MainActivity.this, ActivityTwoFemale.class);
                startActivity(activityTwoFemale);
            }
        });
    }


}
