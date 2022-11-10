package edu.cs.birzeit.example_bio_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnAdd;
    private EditText edtHobbies;
    private TextView txtHobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        btnAdd = findViewById(R.id.btnAdd);
        edtHobbies = findViewById(R.id.edtHobbies);
        txtHobbies = findViewById(R.id.txtHobbies);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hobbies = edtHobbies.getText().toString();
                if(!hobbies.isEmpty()){
                    txtHobbies.setText(hobbies);
                    txtHobbies.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}