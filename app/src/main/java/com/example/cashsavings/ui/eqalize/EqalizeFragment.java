package com.example.cashsavings.ui.eqalize;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cashsavings.R;

public class EqalizeFragment extends Fragment {

    private EqalizeViewModel eqalizeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        eqalizeViewModel =
                ViewModelProviders.of(this).get(EqalizeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_create, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);
        eqalizeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}