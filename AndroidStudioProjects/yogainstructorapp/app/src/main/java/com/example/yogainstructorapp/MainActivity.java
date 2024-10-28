package com.example.yogainstructorapp;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.qualcomm.qidk.PoseEstimator; // Hypothetical import, adjust according to the actual library.

public class MainActivity extends AppCompatActivity {

    private PoseEstimator poseEstimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initializePoseEstimator();
    }

    private void initializePoseEstimator() {
        poseEstimator = new PoseEstimator(this);

        // Start the pose estimator and handle results
        poseEstimator.start(new PoseEstimator.PoseCallback() {
            @Override
            public void onPoseDetected(Pose pose) {
                // Handle pose detection and give feedback
                Toast.makeText(MainActivity.this, "Pose Detected: " + pose.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onError(String error) {
                Toast.makeText(MainActivity.this, "Error: " + error, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (poseEstimator != null) {
            poseEstimator.stop();
        }
    }
}
