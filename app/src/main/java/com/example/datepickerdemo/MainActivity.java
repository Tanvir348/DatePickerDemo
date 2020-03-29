package com.example.datepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      private TextView textView;
      private Button button;
      private DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView= (TextView)findViewById(R.id.textviewId);
        button = (Button) findViewById(R.id.buttonId);
        datePicker = (DatePicker) findViewById(R.id.datepickerId);

        textView.setText(currentDate());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(currentDate());
            }
        });
    }
    String currentDate(){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("current Date : ");
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append((datePicker.getMonth()+1)+"/");
        stringBuilder.append(datePicker.getYear());
       return stringBuilder.toString();
    }
}
