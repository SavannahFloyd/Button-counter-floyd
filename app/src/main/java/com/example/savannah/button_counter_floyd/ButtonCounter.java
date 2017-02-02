package com.example.savannah.button_counter_floyd;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.lang.Object;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ButtonCounter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_counter);
        final Button button = (Button) findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            }
        });
    }
}