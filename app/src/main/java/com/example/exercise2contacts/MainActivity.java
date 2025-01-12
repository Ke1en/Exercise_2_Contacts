package com.example.exercise2contacts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText contactName = findViewById(R.id.contactText);
        EditText phoneNumber = findViewById(R.id.phoneNumberText);
        Button button = findViewById(R.id.button);
        TextView outputText = findViewById(R.id.contactAddedText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String contact = contactName.getText().toString();
                int number = Integer.parseInt(phoneNumber.getText().toString());

                outputText.setText("Добавлен контакт: " + contact + " " + number);
            }
        });
    }
}
