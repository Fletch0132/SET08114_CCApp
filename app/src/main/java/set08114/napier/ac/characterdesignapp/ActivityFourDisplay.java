package set08114.napier.ac.characterdesignapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityFourDisplay extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //display Toast message for Display page
        Toast.makeText(getBaseContext(), "In Character Display page", Toast.LENGTH_LONG).show();


        //DECLARE VARIABLE
        final TextView textCharacterDisplay = (TextView) findViewById(R.id.txtDisplayCharacter);
        String genderDisplay;



        //MALE OR FEMALE TO BE DISPLAYED
        if(StaticVariables.maleSelected == true){
            genderDisplay = "Male";
        }
        else{
            genderDisplay = "Female";
        }



        //EXTRA FEATURES TO BE DISPLAYED CORRECTLY
        //VARIABLES
        String molesDisplay, scarsDisplay, frecklesDisplay, tattoosDisplay, piercingsDisplay;

        //YES OR NO TO BE DISPLAYED
        //MOLES
        if(StaticVariables.moles == true){
            molesDisplay = "yes";
        } else{
            molesDisplay = "No";
        }


        //SCARS
        if(StaticVariables.scars == true) {
            scarsDisplay = "Yes";
        } else {
            scarsDisplay = "No";
        }


        //FRECKLES
        if(StaticVariables.freckles == true){
            frecklesDisplay = "Yes";
        } else {
            frecklesDisplay = "No";
        }


        //TATTOOS
        if(StaticVariables.tattoos == true){
            tattoosDisplay = "Yes";
        } else {
            tattoosDisplay = "No";
        }


        //PIERCINGS
        if(StaticVariables.piercings == true){
            piercingsDisplay = "Yes";
        } else {
            piercingsDisplay = "No";
        }



        //CONTENT TO DISPLAY - MALE
        String maleCharacter =
                ("Name: " + StaticVariables.firstName + " " + StaticVariables.lastName +
                        "\nAge: " + StaticVariables.maleAge +
                        "\n\nGender: " + genderDisplay +
                        "\nSkin Tone: " + StaticVariables.maleSkinTone +
                        "\nEye Colour: " + StaticVariables.maleEyeColour +
                        "\nHair Colour: " + StaticVariables.maleHairColour +
                        "\nHair Style: " + StaticVariables.maleHairStyle +
                        "\nFacial Hair: " + StaticVariables.maleFacialHair +
                        "\n\nOther Features;" +
                        "\n\t\t\t\t\tMoles: " + molesDisplay +
                        "\n\t\t\t\t\tScars: " + scarsDisplay +
                        "\n\t\t\t\t\tFreckles: " + frecklesDisplay +
                        "\n\t\t\t\t\tTattoos: " + tattoosDisplay +
                        "\n\t\t\t\t\tPiercings: " + piercingsDisplay);



        //CONTENT TO DISPLAY - FEMALE
        String femaleCharacter =
                ("Name: " + StaticVariables.firstName + " " + StaticVariables.lastName +
                        "\nAge: " + StaticVariables.femaleAge +
                        "\n\nGender: " + genderDisplay +
                        "\nSkin Tone: " + StaticVariables.femaleSkinTone +
                        "\nEye Colour: " + StaticVariables.femaleEyeColour +
                        "\nHair Colour: " + StaticVariables.femaleHairColour +
                        "\nHair Style: " + StaticVariables.femaleHairStyle +
                        "\n\nOther Features;" +
                        "\n\t\t\t\t\tMoles: " + molesDisplay +
                        "\n\t\t\t\t\tScars: " + scarsDisplay +
                        "\n\t\t\t\t\tFreckles: " + frecklesDisplay +
                        "\n\t\t\t\t\tTattoos: " + tattoosDisplay +
                        "\n\t\t\t\t\tPiercings: " + piercingsDisplay);



        //DISPLAY THE CORRECT CONTENT
        //IF MALE WAS SELECTED ON THE FIRST PAGE THEN DISPLAY MALE CHARACTER
        if(StaticVariables.maleSelected == true){
            textCharacterDisplay.setText(maleCharacter);
        }
        //IF FEMALE WAS SELECTED ON THE FIRST PAGE THEN DISPLAY FEMALE CHARACTER
        else if(StaticVariables.femaleSelected == true) {
            textCharacterDisplay.setText(femaleCharacter);
        }
        //DISPLAY ERROR - NAVIGATE BACK TO MAIN PAGE
        else{
            AlertDialog alertDialog = new AlertDialog.Builder(ActivityFourDisplay.this).create();
            alertDialog.setTitle("Error");
            alertDialog.setMessage("Something went wrong. Try again");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();
                }
            });
            alertDialog.show();
        }



        //MAIN BUTTON FOR RETURNING TO HOME SCREEN
        final Button btnMain = (Button) findViewById(R.id.btnMain);

        btnMain.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent mainActivity = new Intent(ActivityFourDisplay.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });


    }
}
