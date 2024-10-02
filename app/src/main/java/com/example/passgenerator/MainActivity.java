package com.example.passgenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    CheckBox checkboxNumber, checkboxSymbols, checkboxTopRegister;
    Button btnGenerate;
    EditText password;

    Object [] myArrNumb = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Object [] myArrSymbols = {"!", "@", "#", "%", "&", "?", "-", "_", "^"};
    Object [] myArrTopRegister = {"A", "E", "I", "O", "U", "Y", "B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "W", "X", "Y", "Z"};
    Object [] myArrBukvy = {"a", "e", "i", "o", "u", "y", "b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "z"};

    Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnGenerate = findViewById(R.id.btnGenerate);

        checkboxNumber = findViewById(R.id.checkboxNumbers);
        checkboxSymbols = findViewById(R.id.checkboxSymbols);
        checkboxTopRegister = findViewById(R.id.checkboxTopRegister);

        btnGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean checkNumb = checkboxNumber.isChecked();
                boolean checkSymbols = checkboxSymbols.isChecked();
                boolean checkTopReg = checkboxTopRegister.isChecked();

                generatePass(checkNumb, checkSymbols, checkTopReg);
            }
        });
    }

    public void generatePass(Boolean Numbers, Boolean Symbold, Boolean Register){

        String result = Numbers.toString() + Symbold.toString() + Register.toString();

        password = findViewById(R.id.Password);

        String passwordArr = "";

        if (Numbers == true){
            if (Symbold == true){
                if (Register == true){
                    for(int i=0; i <= 3; i++){
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                    }
                    for(int i=0; i <= 3; i++){
                        passwordArr += (myArrSymbols[rand.nextInt(myArrSymbols.length)].toString());
                    }
                    for(int i=0; i <= 2; i++){
                        passwordArr += (myArrNumb[rand.nextInt(myArrNumb.length)].toString());
                    }
                    for(int i=0; i <= 2; i++){
                        passwordArr += (myArrTopRegister[rand.nextInt(myArrTopRegister.length)].toString());
                    }

                    //Toast.makeText(this, "tr tr tr", Toast.LENGTH_SHORT).show();

                }
                else{
                    for(int i=0; i <= 4; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                    }
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrSymbols[rand.nextInt(myArrSymbols.length)].toString());
                    }
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrNumb[rand.nextInt(myArrNumb.length)].toString());
                    }
                    //Toast.makeText(this, "tr tr fs", Toast.LENGTH_SHORT).show();
                }
            }
            else {
                if (Register == true){
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                    }
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrNumb[rand.nextInt(myArrNumb.length)].toString());
                    }
                    for(int i=0; i <= 4; i++) {
                        passwordArr += (myArrTopRegister[rand.nextInt(myArrTopRegister.length)].toString());
                    }

                    //Toast.makeText(this, "tr fs tr", Toast.LENGTH_SHORT).show();

                }
                else {
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrNumb[rand.nextInt(myArrNumb.length)].toString());
                    }
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                    }
                    //Toast.makeText(this, "tr fs fs", Toast.LENGTH_SHORT).show();
                }
            }
        }
        else{
            if (Symbold == true){
                if (Register == true){
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrTopRegister[rand.nextInt(myArrTopRegister.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                    for(int i=0; i <= 3; i++) {
                        passwordArr += (myArrSymbols[rand.nextInt(myArrSymbols.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                    for(int i=0; i <= 4; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrSymbols[rand.nextInt(myArrSymbols.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                }
            }
            else{
                if (Register == true){
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                    for(int i=0; i <= 5; i++) {
                        passwordArr += (myArrTopRegister[rand.nextInt(myArrTopRegister.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                }
                else {
                    for(int i=0; i <= 10; i++) {
                        passwordArr += (myArrBukvy[rand.nextInt(myArrBukvy.length)].toString());
                        //Toast.makeText(this, "fs tr fs", Toast.LENGTH_SHORT).show();
                    }
                }
                //Toast.makeText(this, "fs fs fs", Toast.LENGTH_SHORT).show();
            }
        }

        password.setText(passwordArr.toString());

        passwordArr = "";

    }

}