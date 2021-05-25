package sg.edu.rp.c346.id20024466.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView c346;
    TextView c203;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.c346);
        c203 = findViewById(R.id.c203);

        Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Module", "c346");
                startActivity(intent);
            }
        });

        c203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("Module", "c203");
                startActivity(intent);
            }
        });
    }
}