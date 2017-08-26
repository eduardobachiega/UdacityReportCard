package eduardobachiega.udacityreportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvReportCard = (TextView) findViewById(R.id.tvReportCard);
        Map<String, Integer> subjectsAndGrades = new HashMap<>();
        subjectsAndGrades.put("Android development", 95);
        subjectsAndGrades.put("iOS development", 70);
        subjectsAndGrades.put("Web development", 55);
        subjectsAndGrades.put("Machine learning", 86);
        subjectsAndGrades.put("Big data", 62);
        ReportCard rp = new ReportCard("Udacity", "Eduardo Bachiega", subjectsAndGrades);
        tvReportCard.setText(rp.getReportCard());
    }
}
