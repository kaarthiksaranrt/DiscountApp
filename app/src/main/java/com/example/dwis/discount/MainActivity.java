package com.example.dwis.discount;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double Amount,Discount,Result,temp;
    EditText et1 ,et2;
    Button cal;
    TextView display;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editText);
        et2=findViewById(R.id.editText2);
        cal=findViewById(R.id.Calculate);
        display=findViewById(R.id.textView2);
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Amount=Double.parseDouble(et1.getText().toString());
                Discount=Double.parseDouble(et2.getText().toString());
                temp=Amount*(Discount/100);
                Result=Amount-temp;
                display.setText("The Amount to be Paid: "+Result);


            }
        });









    }
}
