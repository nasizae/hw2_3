package com.example.a2_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class BlankFragment extends Fragment {
    private TextView num;
    private Button pos,neg;
private int velue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        InitView();
        InitListener();
    }

    private void InitView() {
        num=requireActivity().findViewById(R.id.tv_num);
        pos=requireActivity().findViewById(R.id.positiv);
        neg=requireActivity().findViewById(R.id.negativ);
    }
    private void InitListener() {
        pos.setOnClickListener(view -> {

                velue++;
                num.setText(String.valueOf(velue));

        });
        neg.setOnClickListener(view -> {
                velue--;
                num.setText(String.valueOf(velue));
        });
    }

}