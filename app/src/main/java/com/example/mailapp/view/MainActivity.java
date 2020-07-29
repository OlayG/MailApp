package com.example.mailapp.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.LayoutInflater;

import com.example.mailapp.adapter.EmailAdapter;
import com.example.mailapp.databinding.ActivityMainBinding;
import com.example.mailapp.viewmodel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Declaring my top level variables
    private ActivityMainBinding binding;
    private MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Setup ViewBinding
        binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        // Setup Layout
        setContentView(binding.getRoot());
        // Initialize ViewModel
        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        // This method sets up my recyclerview
        setupRecyclerView();
        // This method sets up my Observers
        setupObserver();
        // This tells the ViewModel to fetch emails
        viewModel.fetchEmails();
    }

    private void setupObserver() {
        viewModel.getMyEmails().observe(this, emails -> {
            // Getting the adapter from the RecyclerView
            // (this is another way if i don't want to declare it at top level)
            EmailAdapter adapter = ((EmailAdapter) binding.rvMail.getAdapter());
            // Check if the adapter is null
            // if its not null we want to load the emails
            if (adapter != null) adapter.loadEmails(emails);
        });
    }

    private void setupRecyclerView() {
        // Setting up Layout Manager this allows us to scroll vertically
        binding.rvMail.setLayoutManager(new LinearLayoutManager(this));
        // Sets up adapter with empty list to start
        binding.rvMail.setAdapter(new EmailAdapter());
    }
}