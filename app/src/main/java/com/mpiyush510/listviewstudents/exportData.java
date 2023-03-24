package com.mpiyush510.listviewstudents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.mpiyush510.listviewstudents.databinding.ActivityExportDataBinding;

public class exportData extends AppCompatActivity {
ActivityExportDataBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityExportDataBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent ig=getIntent();
        Bundle bundle=getIntent().getExtras();
        int img= bundle.getInt("StudImg");
        String s1=ig.getStringExtra("StudName");
        String s2=ig.getStringExtra("StudEmail");
        String s3=ig.getStringExtra("StudRole");
        binding.ExportImg.setImageResource(img);
        binding.ExportName.setText(s1);
        binding.ExportEmail.setText(s2);
        binding.ExportRole.setText(s3);

        custDailog();
    }

    private void custDailog() {
        binding.About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                materialDailog();
            }

            private void materialDailog() {
                MaterialAlertDialogBuilder materialAlertDialogBuilder=new MaterialAlertDialogBuilder(exportData.this)
                        .setTitle("Admin Notice")
                        .setMessage("This app create by team AdminSy5")
                        .setPositiveButton("Ok Sir !", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                materialAlertDialogBuilder.create().show();
            }
        });
    }
}