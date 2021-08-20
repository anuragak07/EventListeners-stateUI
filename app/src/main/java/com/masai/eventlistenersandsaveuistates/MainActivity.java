package com.masai.eventlistenersandsaveuistates;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEtEditText;
    private TextView mTvTextview;
    private Button mBtnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnButton = findViewById(R.id.button);
        mEtEditText=findViewById(R.id.editTextTextPersonName);
        mTvTextview=findViewById(R.id.textView);
        mEtEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(s.toString().length()>6){
                    Toast.makeText(MainActivity.this,s.toString(),Toast.LENGTH_SHORT).show();
                }

            }
        });

        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTvTextview.setText("Button clicked");
            }
        });

    }
}