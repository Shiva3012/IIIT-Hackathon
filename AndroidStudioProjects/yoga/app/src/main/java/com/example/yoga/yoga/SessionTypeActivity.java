package com.example.yogainstructor;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class SessionTypeActivity extends AppCompatActivity {

    private Button startPoseEstimationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_type);

        startPoseEstimationButton = findViewById(R.id.startPoseEstimationButton);

        startPoseEstimationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SessionTypeActivity.this, PoseEstimationActivity.class);
                startActivity(intent);
            }
        });
    }
}
