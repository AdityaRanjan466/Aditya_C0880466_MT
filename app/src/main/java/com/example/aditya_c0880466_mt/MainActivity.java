package com.example.aditya_c0880466_mt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spnrSelectCar;
    EditText edtxtDailyRent;
    SeekBar skbrRentDays;
    RadioGroup rdgrpDriverAge;
    RadioButton rdbtnLessThan20, rdbtnBw21and60, rdbtnAbove60;
    CheckBox chckbxGPS, chckbxChildSeat, chckbxMileage;
    Button btnViewDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnrSelectCar = findViewById(R.id.spnr_selectcar);
        edtxtDailyRent = findViewById(R.id.edtxt_dailyrent);
        skbrRentDays = findViewById(R.id.skbr_rentdays);
        rdgrpDriverAge = findViewById(R.id.rdgrp_driverage);
        rdbtnLessThan20 = findViewById(R.id.rdbtn_lessthan20);
        rdbtnBw21and60 = findViewById(R.id.rdbtn_bw21and60);
        rdbtnAbove60 = findViewById(R.id.rdbtn_above60);
        chckbxGPS = findViewById(R.id.chckbx_gps);
        chckbxChildSeat = findViewById(R.id.chckbx_childseat);
        chckbxMileage = findViewById(R.id.chckbx_mileage);
        btnViewDetail = findViewById(R.id.btn_viewdetail);

        ArrayAdapter<CharSequence> spinnerAdapter = ArrayAdapter.createFromResource(MainActivity.this,R.array.caroptionsarray, android.R.layout.simple_spinner_item);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnrSelectCar.setAdapter(spinnerAdapter);
    }
}