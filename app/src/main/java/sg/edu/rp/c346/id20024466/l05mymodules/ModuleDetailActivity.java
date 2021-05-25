package sg.edu.rp.c346.id20024466.l05mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {

    TextView tvDisplay;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);

        tvDisplay = findViewById(R.id.tvDisplay);
        backBtn = findViewById(R.id.backBtn);

        Intent intentReceived = getIntent();
        String moduleSelected = intentReceived.getStringExtra("Module");

        String messageC346 = "Module Code: C346" +
                "\nModule Name: Android Programming" +
                "\nAcademic Year: 2020" +
                "\nSemester: 1" +
                "\nModule Credit: 4" +
                "\nVenue: W66M";

        String messageC203 = "Module Code: C203" +
                "\nModule Name: Web Appln Development In php" +
                "\nAcademic Year: 2020" +
                "\nSemester: 1" +
                "\nModule Credit: 4" +
                "\nVenue: HBL";

        if (moduleSelected.equals("c346")) {
            tvDisplay.setText(messageC346);
        } else if (moduleSelected.equals("c203")) {
            tvDisplay.setText(messageC203);
        }


        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}