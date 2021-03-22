package set08114.napier.ac.characterdesignapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.EditText;
import android.app.AlertDialog;

import java.lang.reflect.Array;

public class ActivityTwoFemale extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female);

        //DISPLAY TOAST NOTIFICATION FOR ENTERING FEMALE PAGE
        Toast.makeText(getBaseContext(), "In Female character Creation", Toast.LENGTH_LONG).show();


        //DECLARE VARIABLES
        Button btnNextDetails = (Button) findViewById(R.id.btnNextDetails);
        final EditText textFemaleAge = (EditText) findViewById(R.id.txtFemaleAge);



        //SPINNER VARIABLES
        final Spinner femaleSkinTone = (Spinner) findViewById(R.id.spinnerFemaleSkin);
        final Spinner femaleEyeColour = (Spinner) findViewById(R.id.spinnerFemaleEyes);
        final Spinner femaleHairColour = (Spinner) findViewById(R.id.spinnerFemaleHairC);
        final Spinner femaleHairStyle = (Spinner) findViewById(R.id.spinnerFemaleHairS);



        //SKIN TONE ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterFemaleSkinTone = ArrayAdapter.createFromResource(this, R.array.skin_tone, android.R.layout.simple_spinner_item);
        adapterFemaleSkinTone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        femaleSkinTone.setAdapter(adapterFemaleSkinTone);
        //STORE SELECTED SKIN TONE
        femaleSkinTone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedSkinToneNum;
            String femaleSkinToneSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX NUMBER SELECTED
                selectedSkinToneNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                femaleSkinToneSelected = femaleSkinTone.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLE
                StaticVariables.femaleSkinTone = femaleSkinToneSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedSkinToneNum = 0;
                return;
            }
        });



        //EYE COLOUR ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterFemaleEyeColour = ArrayAdapter.createFromResource(this, R.array.eye_colour, android.R.layout.simple_spinner_item);
        adapterFemaleEyeColour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        femaleEyeColour.setAdapter(adapterFemaleEyeColour);
        //STORE SELECTED EYE COLOUR
        femaleEyeColour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedEyeColourNum;
            String femaleEyeColourSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX NUMBER SELECTED
                selectedEyeColourNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                femaleEyeColourSelected = femaleEyeColour.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLE
                StaticVariables.femaleEyeColour = femaleEyeColourSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedEyeColourNum = 0;
                return;
            }
        });



        //HAIR COLOUR ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterFemaleHairColour = ArrayAdapter.createFromResource(this, R.array.hair_colour, android.R.layout.simple_spinner_item);
        adapterFemaleHairColour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        femaleHairColour.setAdapter(adapterFemaleHairColour);
        //STORE SELECTED HAIR COLOUR
        femaleHairColour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedHairColourNum;
            String femaleHairColourSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX NUMBER SELECTED
                selectedHairColourNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                femaleHairColourSelected = femaleHairColour.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLE
                StaticVariables.femaleHairColour = femaleHairColourSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedHairColourNum = 0;
                return;
            }
        });



        //HAIR STYLE ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterFemaleHairStyle = ArrayAdapter.createFromResource(this, R.array.female_hair_style, android.R.layout.simple_spinner_item);
        adapterFemaleHairStyle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        femaleHairStyle.setAdapter(adapterFemaleHairStyle);
        //STORE SELECTED HAIR STYLE
        femaleHairStyle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedHairStyleNum;
            String femaleHairStyleSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX ITEM SELECTED
                selectedHairStyleNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                femaleHairStyleSelected = femaleHairStyle.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLE
                StaticVariables.femaleHairStyle = femaleHairStyleSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedHairStyleNum = 0;
                return;
            }
        });


        //VALIDATES INPUT AGE ON BUTTON CLICK
        btnNextDetails.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //VARIABLES
                String femaleAge = textFemaleAge.getText().toString();


                //IF AGE IS BLANK THEN RETURN ERROR
                if ((femaleAge.isEmpty()) || (femaleAge.matches("")) || (femaleAge.trim().length() == 0) || femaleAge.trim().equals("")) {
                    AlertDialog alertDialog = new AlertDialog.Builder(ActivityTwoFemale.this).create();
                    alertDialog.setTitle("Error");
                    alertDialog.setMessage("Please input character age!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();

                }
                //IF AGE IS <0 OR >100 THE RETURN ERROR
                else {
                    int numFemaleAge = Integer.parseInt(femaleAge);

                    if ((numFemaleAge < 1) || (numFemaleAge > 100)) {
                        AlertDialog alertDialog = new AlertDialog.Builder(ActivityTwoFemale.this).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("character age must be greater than 0 and less than 100!");
                        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                        alertDialog.show();

                    }
                    //IF AGE ACCEPTED THEN NAVIGATE TO NEXT PAGE
                    else {

                        //ACCESS AND STORE THE VALIDATED FEMALE AGE IN STATICVARIABLES CLASS
                        StaticVariables.femaleAge = femaleAge;

                        Intent activityThreeDetails = new Intent(ActivityTwoFemale.this, ActivityThreeDetails.class);
                        startActivity(activityThreeDetails);
                    }
                }
            }
        });

    }
}

