package il.co.roeen.blogs.ACTIVITIES;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import il.co.roeen.blogs.R;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
    }

    protected abstract void initializwViews();
    protected abstract void setListeners();
}