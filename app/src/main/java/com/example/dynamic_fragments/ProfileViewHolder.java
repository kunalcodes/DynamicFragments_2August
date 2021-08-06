package com.example.dynamic_fragments;

import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

public class ProfileViewHolder extends RecyclerView.ViewHolder {

    private ImageView mIvImage;
    private TextView mTvTitle;
    private TextView mTvSubTitle;

    public ProfileViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvImage = itemView.findViewById(R.id.ivImage);
        mTvTitle = itemView.findViewById(R.id.tvTitle);
        mTvSubTitle = itemView.findViewById(R.id.tvSubTitle);
    }

    public void setData(ResponseModel responseModel) {
        if (responseModel.getImage() != null){
            Glide.with(mIvImage).load(Uri.parse(responseModel.getImage())).into(mIvImage);
        }
        mTvTitle.setText(responseModel.getTitle());
        mTvSubTitle.setText(responseModel.getSubTitle());
    }

}
