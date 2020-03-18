package com.example.intent04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.intent04.databinding.ActivityEditUserInfoBinding;

public class EditUserInfoActivity extends AppCompatActivity {

    ActivityEditUserInfoBinding binding = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_edit_user_info);
    }
}
