package com.example.loginusingsharedpreferences.Adapters;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginusingsharedpreferences.Fragments.CategoriesFragment;
import com.example.loginusingsharedpreferences.Models.CategoriesModel;
import com.example.loginusingsharedpreferences.R;

import java.util.ArrayList;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoriesViewHolder>{

    private final Context mContext;
    ArrayList mValues;

    public CategoriesAdapter(Context context, ArrayList values
    ){
        mContext = context;
        mValues = values;
    }

    @NonNull
    @Override
    public CategoriesAdapter.CategoriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        View view = layoutInflater.inflate(R.layout.item_categories,parent,false);
        return new CategoriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoriesAdapter.CategoriesViewHolder holder, int position) {

        holder.setData((CategoriesModel) mValues.get(position));
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class CategoriesViewHolder extends RecyclerView.ViewHolder {

         public ImageView mImg;
         public TextView mTv1;
        CategoriesModel item;

        public CategoriesViewHolder(@NonNull View itemView) {
            super(itemView);

            mImg = itemView.findViewById(R.id.imageView2);
            mTv1 = itemView.findViewById(R.id.tv_product);

        }
        public void setData(CategoriesModel item) {
            this.item = item;
            mTv1.setText(item.getProductName());
            mImg.setImageResource(item.getImage());

        }
    }

}
