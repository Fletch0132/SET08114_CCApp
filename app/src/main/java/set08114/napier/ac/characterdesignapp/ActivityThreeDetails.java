package set08114.napier.ac.characterdesignapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityThreeDetails extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        //DISPLAYS TOAST NOTIFICATION WHEN ENTERING DETAILS PAGE
        Toast.makeText(getBaseContext(), "In Details section of Application", Toast.LENGTH_LONG).show();



        //VARIABLES DECLARED
        final EditText textFirstName = (EditText) findViewById(R.id.txtFirstName);
        final EditText textLastName = (EditText) findViewById(R.id.txtLastName);



        //BUTTON NAVIGATING TO DISPLAY - FULL CHARACTER DETAILS WILL BE DISPLAYED THERE
        Button btnNextDisplay = (Button) findViewById(R.id.btnNextDisplay);
        btnNextDisplay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //VARIABLES
                String firstName = textFirstName.getText().toString();
                String lastName = textLastName.getText().toString();


                //IF FIRST NAME IS BLANK THEN RETURN ERROR
                if((firstName.isEmpty()) || (firstName.matches("")) || (firstName.trim().length() == 0) || (firstName.trim().equals(""))){
                    AlertDialog alertDialog = new AlertDialog.Builder(ActivityThreeDetails.this).create();
                    alertDialog.setTitle("First Name");
                    alertDialog.setMessage("Please input a First Name");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();
                }
                else if ((lastName.isEmpty()) || (lastName.matches("")) || (lastName.trim().length() == 0) || (lastName.trim().equals(""))){
                    AlertDialog alertDialog = new AlertDialog.Builder(ActivityThreeDetails.this).create();
                    alertDialog.setTitle("Last Name");
                    alertDialog.setMessage("Please input a Last Name");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    alertDialog.show();
                }
                else {

                    //CAPITALISE FIRST LETTER
                    String capFstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
                    String capLstName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);


                    //STORE FIRST NAME
                    StaticVariables.firstName = capFstName;

                    //STORE LAST NAME
                    StaticVariables.lastName = capLstName;

                    Intent activityFourDisplay = new Intent(ActivityThreeDetails.this, ActivityFourDisplay.class);
                    startActivity(activityFourDisplay);
                }
            }
        });




        //CHECKBOX ONCLICK LISTENERS SET UP
        //MOLES
        CheckBox cbMoles = (CheckBox) findViewById(R.id.checkboxMoles);
        cbMoles.setOnClickListener(startListener);


        //SCARS
        CheckBox cbScars = (CheckBox) findViewById(R.id.checkboxScars);
        cbScars.setOnClickListener(startListener);


        //FRECKLES
        CheckBox cbFreckles = (CheckBox) findViewById(R.id.checkboxFreckles);
        cbFreckles.setOnClickListener(startListener);


        //TATTOOS
        CheckBox cbTattoos = (CheckBox) findViewById(R.id.checkboxTattoos);
        cbTattoos.setOnClickListener(startListener);
        //CHECKS AGE TO MAKE SURE CHARACTER IS 18+
        if(StaticVariables.maleSelected == true){
            if(Integer.parseInt(StaticVariables.maleAge) < 18){
                cbTattoos.setEnabled(false);
            }
        }
        else{
            if(Integer.parseInt(StaticVariables.femaleAge) < 18){
                cbTattoos.setEnabled(false);
            }
        }


        //PIERCINGS
        CheckBox cbPiercings = (CheckBox) findViewById(R.id.checkboxPiercings);
        cbPiercings.setOnClickListener(startListener);
        //CHECKS AGE TO MAKE SURE CHARACTER IS 16+
        if(StaticVariables.maleSelected == true){
            if(Integer.parseInt(StaticVariables.maleAge) < 16){
                cbPiercings.setEnabled(false);
            }
        }
        else {
            if(Integer.parseInt(StaticVariables.femaleAge) < 16) {
                cbPiercings.setEnabled(false);
            }
        }

    }




    //CHECKBOXES WHEN CLICKED
    private View.OnClickListener startListener = new View.OnClickListener() {
        public void onClick(View c) {

            //MOLES
            CheckBox cbMoles = (CheckBox) findViewById(R.id.checkboxMoles);
            if (cbMoles.isChecked()) {
                //DISPLAY TOAST
                Toast.makeText(ActivityThreeDetails.this, "Mole(s) selected", Toast.LENGTH_LONG).show();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.moles = true;
            }



            //SCARS
            CheckBox cbScars = (CheckBox) findViewById(R.id.checkboxScars);
            if (cbScars.isChecked()) {
                //DISPLAY TOAST
                Toast.makeText(ActivityThreeDetails.this, "Scar(s) selected", Toast.LENGTH_LONG).show();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.scars = true;
            }



            //FRECKLES
            CheckBox cbFreckles = (CheckBox) findViewById(R.id.checkboxFreckles);
            if (cbFreckles.isChecked()) {
                //DISPLAY TOAST
                Toast.makeText(ActivityThreeDetails.this, "Freckles selected", Toast.LENGTH_LONG).show();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.freckles = true;
            }



            //TATTOOS
            CheckBox cbTattoos = (CheckBox) findViewById(R.id.checkboxTattoos);
            if (cbTattoos.isChecked()) {
                //DISPLAY TOAST
                Toast.makeText(ActivityThreeDetails.this, "Tattoo(s) selected", Toast.LENGTH_LONG).show();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.tattoos = true;
            }



            //PIERCINGS
            CheckBox cbPiercings = (CheckBox) findViewById(R.id.checkboxPiercings);
            if (cbPiercings.isChecked()) {
                //DISPLAY TOAST
                Toast.makeText(ActivityThreeDetails.this, "Piercing(s) selected", Toast.LENGTH_LONG).show();
                //STORE SELECTION IN STATICVARIABLES
                StaticVariables.piercings = true;
            }
        }
    };
}
