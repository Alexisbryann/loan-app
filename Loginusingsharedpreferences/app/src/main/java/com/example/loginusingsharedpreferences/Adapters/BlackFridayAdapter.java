package com.example.loginusingsharedpreferences.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginusingsharedpreferences.R;

public class BlackFridayAdapter extends RecyclerView.Adapter<BlackFridayAdapter.ViewHolder> {

    private final Context mContext;

    public BlackFridayAdapter(Context context){
        mContext = context;
    }
    @NonNull
    @Override
    public BlackFridayAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        View view = layoutInflater.inflate(R.layout.item_black_friday_deals,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BlackFridayAdapter.ViewHolder holder, int position) {
        holder.mTv1.setText("Mimi");
        holder.mTv2.setText("Wewe");
        holder.mTv3.setText("Sisi");
        holder.mImageView.setImageResource(R.drawable.phones);
        holder.mRatingBar.setMax(5);
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final ImageView mImageView;
        private final TextView mTv1;
        private final TextView mTv2;
        private final TextView mTv3;
        private final RatingBar mRatingBar;
        private final Button mBtn1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            mImageView = itemView.findViewById(R.id.imageView8);
            mTv1 = itemView.findViewById(R.id.tv_description);
            mTv2 = itemView.findViewById(R.id.tv_price);
            mTv3 = itemView.findViewById(R.id.tv_express);
            mRatingBar = itemView.findViewById(R.id.ratingBar);
            mBtn1 = itemView.findViewById(R.id.btn_add_to_cart);
        }
    }
}
