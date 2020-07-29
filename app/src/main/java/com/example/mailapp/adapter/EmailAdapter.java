package com.example.mailapp.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mailapp.Utils;
import com.example.mailapp.databinding.ItemMailBinding;
import com.example.mailapp.model.Email;

import java.util.ArrayList;
import java.util.List;

public class EmailAdapter extends RecyclerView.Adapter<EmailAdapter.EmailViewHolder> {

    // Declare list of emails
    private List<Email> emails;

    // Constructor to initialize new instance of this class
    public EmailAdapter() {
        // this will create a empty list to start
        emails = new ArrayList<>();
    }

    @NonNull
    @Override
    public EmailViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Inflates the view using ViewBinding
        ItemMailBinding binding = ItemMailBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        // Returns a new instance of the EmailViewHolder class that we created below
        return new EmailViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull EmailViewHolder holder, int position) {
        // Passes current email in the list to the ViewHolder i created so i can setup the display views
        holder.loadEmail(emails.get(position));
    }

    @Override
    public int getItemCount() {
        return emails.size();
    }

    // Allows me to load new emails, clears current list first
    public void loadEmails(List<Email> emails) {
        this.emails.clear();
        this.emails.addAll(emails);
        // This tells the adapter that i have change the entire list
        notifyDataSetChanged();
    }

    static class EmailViewHolder extends RecyclerView.ViewHolder {
        // Final Declaration which means this field was be initialized
        private final ItemMailBinding binding;

        // Constructor to initialize new instance of this class
        // Takes in the ItemMailBinding is parameter
        public EmailViewHolder(@NonNull ItemMailBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        // Method that takes en Email object and uses it to setup the display views
        public void loadEmail(Email email) {
            binding.tvMailSender.setText(email.getSender());
            binding.tvMailTime.setText(Utils.calendarToFormattedTime(email.getDate()));
            binding.tvMailSubject.setText(email.getSubject());
            binding.tvMailBody.setText(email.getBody());
        }
    }
}
