package com.example.reinstack.ui.exceed_budget_remainder;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.reinstack.R;

public class exceed_budget_remainder extends Fragment {

    private ExceedBudgetRemainderViewModel mViewModel;

    public static exceed_budget_remainder newInstance() {
        return new exceed_budget_remainder();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_exceed_budget_remainder, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(ExceedBudgetRemainderViewModel.class);
        // TODO: Use the ViewModel
    }

}