package com.mpiyush510.listviewstudents;

import static androidx.core.content.ContextCompat.startActivities;
import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Toast;

import com.google.android.material.textview.MaterialTextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentAdapter extends BaseAdapter {
    Context context;
    int[] StudImg;
    String[] StudName;
    String[] StudEmail;
    String[] StudRole;
    LayoutInflater inflater;


    public StudentAdapter(Context context, int[] studImg, String[] studName, String[] studEmail, String[] studRole) {
        this.context = context;
        StudImg = studImg;
        StudName = studName;
        StudEmail = studEmail;
        StudRole = studRole;
        inflater=LayoutInflater.from(context);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int[] getStudImg() {
        return StudImg;
    }

    public void setStudImg(int[] studImg) {
        StudImg = studImg;
    }

    public String[] getStudName() {
        return StudName;
    }

    public void setStudName(String[] studName) {
        StudName = studName;
    }

    public String[] getStudEmail() {
        return StudEmail;
    }

    public void setStudEmail(String[] studEmail) {
        StudEmail = studEmail;
    }

    public String[] getStudRole() {
        return StudRole;
    }
    public void setStudRole(String[] studRole) {
        StudRole = studRole;
    }

    @Override
    public int getCount() {
        return StudName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.list_item,parent,false);
        CircleImageView id=convertView.findViewById(R.id.StudentImg);
        MaterialTextView id1=convertView.findViewById(R.id.StudentName);
        MaterialTextView id2=convertView.findViewById(R.id.StudentEmail);
        MaterialTextView id3=convertView.findViewById(R.id.StudentRole);
        id.setImageResource(StudImg[position]);
        id1.setText(StudName[position]);
        id2.setText(StudEmail[position]);
        id3.setText(StudRole[position]);
        convertView.findViewById(R.id.ViewStud).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("String","click");
                Intent ig=new Intent(StudentAdapter.this.getContext(), exportData.class);
                ig.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                ig.putExtra("StudImg",StudImg[position]);
                ig.putExtra("StudName",StudName[position]);
                ig.putExtra("StudEmail",StudEmail[position]);
                ig.putExtra("StudRole",StudRole[position]);
                v.getContext().startActivity(ig);
            }
        });
        return convertView;
    }
}
