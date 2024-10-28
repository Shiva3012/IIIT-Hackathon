package com.example.yogainstructor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class YogaSelectionActivity extends AppCompatActivity {

    private Button liveSessionButton, uploadVideoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_selection);

        liveSessionButton = findViewById(R.id.liveSessionButton);
        uploadVideoButton = findViewById(R.id.uploadVideoButton);

        liveSessionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaSelectionActivity.this, SessionTypeActivity.class);
                intent.putExtra("sessionType", "live");
                startActivity(intent);
            }
        });

        uploadVideoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YogaSelectionActivity.this, UploadVideoActivity.class);
                startActivity(intent);
            }
        });
    }
}
