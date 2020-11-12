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
import com.example.loginusingsharedpreferences.Models.BlackFridayModel;
import com.example.loginusingsharedpreferences.R;

import java.util.ArrayList;

public class BlackFridayDealsFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLinearLayoutManager;
    private BlackFridayAdapter mBlackFridayAdapter;
    ArrayList<BlackFridayModel> mList;

    public BlackFridayDealsFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_black_friday_deals,container,false);

        mRecyclerView = view.findViewById(R.id.rv_black_friday);
        mLinearLayoutManager = new LinearLayoutManager(getContext());

        mList = new ArrayList<>();
        mList.add(new BlackFridayModel(R.drawable.soya_beans,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit ","200 ksh",5,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.jenny_beans,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia dolor sit amet","800 ksh",5,"Available on jumia express"));
        mList.add(new BlackFridayModel(R.drawable.kabras_sugar,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum","500 ksh",3,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.mumias_sugar,"Lorem Ipsum neque porro quisquam","200 ksh",4,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.red_beans,"Lorem Ipsum neque porro quisquam est qui","100 ksh",3,""));
        mList.add(new BlackFridayModel(R.drawable.rice_daawat,"Lorem Ipsum neque porro quisquam est","100 ksh",3,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.rice_pearl,"Lorem Ipsum neque ","1000 ksh",3,""));
        mList.add(new BlackFridayModel(R.drawable.rice_sunrice,"Lorem Ipsum","10 ksh",5,""));
        mList.add(new BlackFridayModel(R.drawable.batteries,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur","20ksh",3,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.bluetooth_accessories,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia dolor","50 ksh",3,""));
        mList.add(new BlackFridayModel(R.drawable.headsets,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum quia","456 ksh",3,""));
        mList.add(new BlackFridayModel(R.drawable.portable_powerbanks,"Lorem Ipsum neque porro","809 ksh",4,"Available on Jumia express."));
        mList.add(new BlackFridayModel(R.drawable.screen_protectors,"Lorem Ipsum neque porro quisquam est qui dolorem","55 ksh",3,""));
        mList.add(new BlackFridayModel(R.drawable.smart_watches,"Lorem Ipsum neque porro quisquam est qui dolorem ipsum","90 ksh",5,""));


        mBlackFridayAdapter = new BlackFridayAdapter(getContext(),mList);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mBlackFridayAdapter);

            return view;
    }
}
