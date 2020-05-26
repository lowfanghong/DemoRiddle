package sg.edu.rp.c346_18021531.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  TextView tvQ1;
  Button btnReveal,btnReveal2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvQ1 = findViewById(R.id.textViewQ1);
        btnReveal = findViewById(R.id.buttonRevealQ1);
        btnReveal2 = findViewById(R.id.buttonRevealQ2);

        btnReveal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question", "Q1");

                startActivity(intent);
            }
        });
        btnReveal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity2.class);
                intent.putExtra("Question", "Q2");

                startActivity(intent);
            }
        });


    }
}
