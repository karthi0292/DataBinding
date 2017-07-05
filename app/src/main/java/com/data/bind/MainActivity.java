package com.data.bind;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.data.bind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user = new User();

        user.setFirstName("Karthick");
        user.setLastName("Raja");

        binding.setUser(user);
       // binding.setActivity(this);

        user.setLastName("ja");
    }

    public void onButtonClick(View view) {
        Toast.makeText(view.getContext(), ""+view.getId(), Toast.LENGTH_LONG).show();
    }
}
