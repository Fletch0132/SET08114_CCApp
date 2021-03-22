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


public class ActivityTwoMale extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male);

        //DISPLAYS TOAST NOTIFICATION FOR ENTERING MALE PAGE
        Toast.makeText(getBaseContext(), "In Male character creation", Toast.LENGTH_LONG).show();


        //DECLARE VARIABLES
        Button btnNextDetails = (Button) findViewById(R.id.btnNextDetails);
        final EditText textMaleAge = (EditText) findViewById(R.id.txtMaleAge);


        //SPINNER VARIABLES
        final Spinner maleSkinTone = (Spinner) findViewById(R.id.spinnerMaleSkin);
        final Spinner maleEyeColour = (Spinner) findViewById(R.id.spinnerMaleEyes);
        final Spinner maleHairColour = (Spinner) findViewById(R.id.spinnerMaleHairC);
        final Spinner maleHairStyle = (Spinner) findViewById(R.id.spinnerMaleHairS);
        final Spinner maleFacialHair = (Spinner) findViewById(R.id.spinnerFacialHair);


        //SKIN TONE ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterMaleSkinTone = ArrayAdapter.createFromResource(this, R.array.skin_tone, android.R.layout.simple_spinner_item);
        adapterMaleSkinTone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maleSkinTone.setAdapter(adapterMaleSkinTone);
        //STORE SELECTED SKIN TONE
        maleSkinTone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedSkinToneNum;
            String maleSkinToneSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                //SELECTED ITEM INDEX
                selectedSkinToneNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                maleSkinToneSelected = maleSkinTone.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.maleSkinTone = maleSkinToneSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedSkinToneNum = 0;
                return;
            }
        });


        //EYE COLOUR ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterMaleEyeColour = ArrayAdapter.createFromResource(this, R.array.eye_colour, android.R.layout.simple_spinner_item);
        adapterMaleEyeColour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maleEyeColour.setAdapter(adapterMaleEyeColour);
        //STORE SELECTED EYE COLOUR
        maleEyeColour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedEyeColourNum;
            String maleEyeColourSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //SELECTED ITEM INDEX
                selectedEyeColourNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                maleEyeColourSelected = maleEyeColour.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.maleEyeColour = maleEyeColourSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedEyeColourNum = 0;
                return;
            }
        });


        //HAIR COLOUR ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterMaleHairColour = ArrayAdapter.createFromResource(this, R.array.hair_colour, android.R.layout.simple_spinner_item);
        adapterMaleHairColour.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maleHairColour.setAdapter(adapterMaleHairColour);
        //STORE SELECTED HAIR COLOUR
        maleHairColour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedHairColourNum;
            String maleHairColourSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX ITEM SELECTED
                selectedHairColourNum = parent.getSelectedItemPosition();
                //SELECTED ITEM TO STRING
                maleHairColourSelected = maleHairColour.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.maleHairColour = maleHairColourSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedHairColourNum = 0;
                return;
            }
        });


        //HAIR STYLE ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterMaleHairStyle = ArrayAdapter.createFromResource(this, R.array.male_hair_style, android.R.layout.simple_spinner_item);
        adapterMaleHairStyle.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maleHairStyle.setAdapter(adapterMaleHairStyle);
        //STORE SELECTED HAIR STYLE
        maleHairStyle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedHairStyleNum;
            String maleHairStyleSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX ITEM SELECTED
                selectedHairStyleNum = parent.getSelectedItemPosition();
                //SELECTED ITEM TO STRING
                maleHairStyleSelected = maleHairStyle.getSelectedItem().toString();
                //STORE SELECTION IN STATIC VARIABLES
                StaticVariables.maleHairStyle = maleHairStyleSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedHairStyleNum = 0;
                return;
            }
        });


        //FACIAL HAIR ARRAY ADAPTER
        ArrayAdapter<CharSequence> adapterMaleFacialHair = ArrayAdapter.createFromResource(this, R.array.facial_hair, android.R.layout.simple_spinner_item);
        adapterMaleFacialHair.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        maleFacialHair.setAdapter(adapterMaleFacialHair);
        //STORE SELECTED FACIAL HAIR OPTION
        maleFacialHair.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            //VARIABLES
            int selectedFacialHairNum;
            String maleFacialHairSelected;

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //INDEX ITEM SELECTED
                selectedFacialHairNum = parent.getSelectedItemPosition();
                //ITEM SELECTED TO STRING
                maleFacialHairSelected = maleFacialHair.getSelectedItem().toString();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.maleFacialHair = maleFacialHairSelected;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                selectedFacialHairNum = 0;
                return;
            }
        });



        //VALIDATES INPUT AGE ON BUTTON CLICK
        btnNextDetails.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //VARIABLES
                String maleAge = textMaleAge.getText().toString();


                //IF AGE IS BLANK THEN RETURN ERROR
                if ((maleAge.isEmpty()) || (maleAge.matches("")) || (maleAge.trim().length() == 0) || (maleAge.trim().equals(""))) {

                    AlertDialog alertDialog = new AlertDialog.Builder(ActivityTwoMale.this).create();
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
                    int numMaleAge = Integer.parseInt(maleAge);
                    if ((numMaleAge < 1) || (numMaleAge > 100)) {
                        AlertDialog alertDialog = new AlertDialog.Builder(ActivityTwoMale.this).create();
                        alertDialog.setTitle("Error");
                        alertDialog.setMessage("Character age must be greater than 0 and less than 100!");
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
                        //STORE MALE AGE IN STATICVARIABLES
                        StaticVariables.maleAge = maleAge;

                        Intent activityThreeDetails = new Intent(ActivityTwoMale.this, ActivityThreeDetails.class);
                        startActivity(activityThreeDetails);
                        //}

                    }
                }

            }

        });
    }


}