package com.example.loginusingsharedpreferences.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginusingsharedpreferences.Adapters.BlackFridayAdapter;
import com.example.loginusingsharedpreferences.R;

public class BlackFridayDealsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private BlackFridayAdapter mBlackFridayAdapter;

    public BlackFridayDealsFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_black_friday_deals,container,false);

        mRecyclerView = view.findViewById(R.id.rv_black_friday);
        mLinearLayoutManager = new LinearLayoutManager(getContext());

        mBlackFridayAdapter = new BlackFridayAdapter(getContext());
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mBlackFridayAdapter);

            return view;
    }
}
