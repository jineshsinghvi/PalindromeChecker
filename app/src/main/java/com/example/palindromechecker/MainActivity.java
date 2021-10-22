package com.example.palindromechecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Declaring Variables
    private TextView textViewStatus;
    private EditText editTextInputWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using findViewById-finds the particular view by Id
        textViewStatus = findViewById(R.id.textViewStatus);
        editTextInputWord = findViewById(R.id.editTextInputWord);

    }

    public void buttonCheckPalindrome(View view){

        /*
         * Using charInput to get the Input from user
         * converting it into text,string and lastly in array
         */
        char[] charInput = editTextInputWord.getText().toString().toCharArray();
        int intLength = charInput.length;
        boolean isPalindrome = true;

       for (int i=0; i<intLength/2; i++){
            if (charInput[i] != charInput[intLength-1-i]){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            // A small window gets popped on screen after declaring toast
            Toast.makeText(this, "Palindrome", Toast.LENGTH_SHORT).show();textViewStatus.setText("Palindrome");
        }
        else {
            Toast.makeText(this, "Not Palindrome", Toast.LENGTH_SHORT).show();textViewStatus.setText("NOT Palindrome");
        }

    }

}