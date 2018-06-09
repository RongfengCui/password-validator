package ca.dal.csci3130.csci3130ass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the button
        Button btn = findViewById(R.id.button);
        //get the textView
        final TextView txt = findViewById(R.id.textView);
        //get the editText
        final EditText editText = findViewById(R.id.editText);
        //display the text when user click the button
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(Validator.Stage2(editText.getText().toString()) < 5)
                    txt.setText("not strong");
                else
                    txt.setText("strong");
            }
        });
    }
}
