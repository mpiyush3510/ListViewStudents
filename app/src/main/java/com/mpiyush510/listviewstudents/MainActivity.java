package com.mpiyush510.listviewstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.mpiyush510.listviewstudents.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
int[] StudImg= {
        R.drawable.ajay_frag,
        R.drawable.ajith_frag,
        R.drawable.anamika_saini,
        R.drawable.anju,
        R.drawable.arpit_frag,
        R.drawable.hitixa_patel,
        R.drawable.nimi_jagid,
        R.drawable.noor_jahan,
        R.drawable.default_user,
        R.drawable.piyush_frag,
        R.drawable.rajat_frag,
        R.drawable.saima_khanjpg,
        R.drawable.sheetal_sinha,
        R.drawable.umesh_frag,
        R.drawable.dharmendra_frag,
        R.drawable.mayank_frag,
        R.drawable.nikhil_frag,
        R.drawable.default_user,
};
String[] StudName={
  "Ajay Mali","Ajith Sahji","Anamika Saini","Anjali Parmar","Arpit Kakadiya","Hitixa","Nimi jagid","Noor Jahan","Priyanshu",
  "Piyush Makwana","Rajat KD","Saima Khan","Sheetal Sinha","Umesh Mishra","Dharmendra Sir","Mayank","Nikhil Mishra","Akshar Sir"
};

String[] StudEmail={
        "Ajay@adminsy5.com",
        "Ajith@adminsy5.com",
        "Anamika@adminsy5.in",
        "Anjali@adminsy5",
        "Arpit@adminsy5.com",
        "Hitixa@adminsy5.com",
        "Nimi@adminsy5.in",
        "Noor@adminsy5",
        "Priyanshu@adminsy5.com",
        "Piyush@adminsy5.com",
        "Rajat@adminsy5.in",
        "Saima@adminsy5",
        "Sheetal@adminsy5.com",
        "Umesh@adminsy5.com",
        "Dharmendra@adminsy5.in",
        "Mayank@adminsy5",
        "Not Available",
        "Aksar@adminsy5.com",
};

    String[] StudRole={
            "Developer",
            "Developer",
            "Ui Creator",
            "Developer",
            "Admin",
            "Ui Creator",
            "Backend Db Admin",
            "Frontend Ui tuner",
            "Editor",
            "Editor",
            "Boss",
            "Admin",
            "Db Admin",
            "Admin",
            "Creator",
            "Web Designer",
            "UnEmployee",
            "Ai Admin",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        StudentAdapter studentAdapter=new StudentAdapter(getApplicationContext(),StudImg,StudName,StudEmail,StudRole);
        binding.ListView1.setAdapter(studentAdapter);

    }
}