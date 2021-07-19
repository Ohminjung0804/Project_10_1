package kr.hs.emirim.w2009.project_10_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg = findViewById(R.id.rg);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnOpen = findViewById(R.id.btn_open);
        btnOpen.setOnClickListener(btnOpenListener);
        rg = findViewById(R.id.rg);
    }

    View.OnClickListener btnOpenListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = null;
            switch (rg.getCheckedRadioButtonId()){
                case R.id.radio_second:
                    intent = new Intent(getApplicationContext(),secondActivity.class);

                case R.id.radio_third:
                    intent = new Intent(getApplicationContext(),ThirdActivity.class);
            }
            startActivity(intent);
        }
    };
}