package com.example.mailapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mailapp.model.Email;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainViewModel extends ViewModel {

    // Mutable allows for Read & Write of new emails
    private MutableLiveData<List<Email>> _myEmails = new MutableLiveData<>();

    // This is a public getter to allow view to be able to observer the LiveData for new emails
    public LiveData<List<Email>> getMyEmails() {
        return _myEmails;
    }

    // This method will create emails
    public void fetchEmails() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        emails.add(new Email("Sender", Calendar.getInstance(), "Subject", "Body"));
        _myEmails.setValue(emails);
    }
}
