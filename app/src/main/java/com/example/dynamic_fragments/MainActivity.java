package com.example.dynamic_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getSupportFragmentManager();
        addGithubFragment();
    }

    private void addGithubFragment() {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        GithubFragment fragment = new GithubFragment();
        transaction.replace(R.id.flContainer, fragment, "GithubFragment").commit();
    }
}