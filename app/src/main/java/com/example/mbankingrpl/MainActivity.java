package com.example.mbankingrpl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextPin;
    private Button buttonSubmitPin;
    private String desiredPin = "1234";  // Gantilah dengan PIN yang diinginkan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextPin = findViewById(R.id.editTextPin);
        buttonSubmitPin = findViewById(R.id.buttonSubmitPin);

        // Set onClickListeners for number buttons
        setNumberButtonClickListener(R.id.button1, "1");
        setNumberButtonClickListener(R.id.button2, "2");
        setNumberButtonClickListener(R.id.button3, "3");
        setNumberButtonClickListener(R.id.button4, "4");
        setNumberButtonClickListener(R.id.button5, "5");
        setNumberButtonClickListener(R.id.button6, "6");
        setNumberButtonClickListener(R.id.button7, "7");
        setNumberButtonClickListener(R.id.button8, "8");
        setNumberButtonClickListener(R.id.button9, "9");
        setNumberButtonClickListener(R.id.button0, "0");

        // Set onClickListeners for action buttons
        setActionButtonClickListener(R.id.buttonSubmitPin, "OK");
        setActionButtonClickListener(R.id.buttonClear, "Clear");
    }

    private void setNumberButtonClickListener(int buttonId, final String number) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPin.append(number);
            }
        });
    }

    private void setActionButtonClickListener(int buttonId, final String action) {
        Button button = findViewById(buttonId);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                handleAction(action);
            }
        });
    }

    private void handleAction(String action) {
        if (action.equals("OK")) {
            // Handle submit action
            String enteredPin = editTextPin.getText().toString();

            if (validatePin(enteredPin)) {
                // PIN is valid, proceed to the main menu
                Intent intent = new Intent(MainActivity.this, menuUtama.class);
                startActivity(intent);
                // Clear the PIN after submitting
                editTextPin.getText().clear();
            } else {
                // Show a toast message for invalid PIN
                Toast.makeText(MainActivity.this, "PIN Anda Salah, Silakan Coba Lagi", Toast.LENGTH_SHORT).show();
                // Clear the PIN after an unsuccessful attempt
                editTextPin.getText().clear();
            }

        } else if (action.equals("Clear")) {
            // Handle clear action
            editTextPin.getText().clear();
        }
    }

    private boolean validatePin(String enteredPin) {
        return enteredPin.equals(desiredPin);
    }
}

