package com.example.savannah.button_counter_floyd;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class ButtonCounter extends AppCompatActivity {
    private Button ascendingButton;
    private Button descendingButton;
    private Button clearButton;
    private TextView countText;
    private Integer counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_counter);

        counter = 0;
        ascendingButton = (Button) findViewById(R.id.ascend_button);
        descendingButton = (Button) findViewById(R.id.descend_button);
        clearButton = (Button) findViewById(R.id.clear_button);
        countText = (TextView) findViewById(R.id.countText);
        countText.setText(counter.toString());

        ascendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                add();
                countText.setText(counter.toString());
            }
        });
        descendingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                subtract();
                countText.setText(counter.toString());
            }
        });
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                countText.setText(counter.toString());
            }
        });
    }
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("countSave", counter);
    }

    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("countSave");
        countText.setText(counter.toString());
    }

    public void add() {
        counter = counter + 1;
    }

    public void subtract() {
        counter = counter - 1;
    }

    public void clear() {
        counter = 0;
    }
}
