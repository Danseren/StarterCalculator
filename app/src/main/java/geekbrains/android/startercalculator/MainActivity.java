package geekbrains.android.startercalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_start;
    private final static String TEXT = "PARAM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_start = findViewById(R.id.btn_start);
        btn_start.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Uri uri = Uri.parse("example://intent");
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.putExtra(TEXT, "0");
        @SuppressLint("WrongConstant") ActivityInfo activityInfo = intent.resolveActivityInfo(getPackageManager(), intent.getFlags());
        if (activityInfo != null) {
            startActivity(intent);
        }
    }
}