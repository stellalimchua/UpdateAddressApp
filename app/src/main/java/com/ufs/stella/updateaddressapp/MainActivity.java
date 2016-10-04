package com.ufs.stella.updateaddressapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.basgeekball.awesomevalidation.AwesomeValidation;

import static com.basgeekball.awesomevalidation.ValidationStyle.UNDERLABEL;

public class MainActivity extends AppCompatActivity {

    AwesomeValidation formValidation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setFormValidationStyle();
    }

    public void setFormValidationStyle() {
        formValidation = new AwesomeValidation(UNDERLABEL);
        formValidation.setContext(this);
    }

    public void addFormValidation() {
        formValidation.addValidation(this, R.id.postal_address1, "a-zA-Z0-9\\s", R.string.err_address_line1_hint);
        formValidation.addValidation(this, R.id.postal_address2, "a-zA-Z0-9\\s", R.string.err_address_line2_hint);
        formValidation.addValidation(this, R.id.postal_code, "\\d", R.string.err_postal_code);
        formValidation.addValidation(this, R.id.city, "a-zA-Z0-9\\s", R.string.err_city);
        formValidation.addValidation(this, R.id.state_province_region, "a-zA-Z0-9\\s", R.string.err_state_province_Region);
        formValidation.addValidation(this, R.id.Country, "a-zA-Z\\s", R.string.err_Country);
    }
}
