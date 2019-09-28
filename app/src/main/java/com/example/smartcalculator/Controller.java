package com.example.smartcalculator;

import androidx.appcompat.app.AppCompatActivity;

public class Controller extends AppCompatActivity {

    public double calculation(double a, double b, char op) {
        if(op == '+')
            return a+b;
        else if(op == '-')
            return a-b;
        else if(op == '*')
            return a*b;
        else if(op == '%')
            return a%b;
        else
            return a/b;
    }
}
