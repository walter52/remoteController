package com.walter.remotecontroller;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ViewPagerAdapter extends RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder> {

    private final static List<String> CLASSIFICATION = List.of("首页", "第二页", "第三页", "第四页");
    private final static List<Integer> COLOUR = List.of(R.color.white, R.color.black, R.color.blue, R.color.teal_200);

    @NonNull
    @Override
    public ViewPagerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewPagerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pager, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewPagerViewHolder holder, int position) {
        holder.mTv.setText(CLASSIFICATION.get(position));
        holder.mContainer.setBackgroundResource(COLOUR.get(position));
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ViewPagerViewHolder extends RecyclerView.ViewHolder {
        private TextView mTv;
        private RelativeLayout mContainer;

        public ViewPagerViewHolder(@NonNull View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.tvTitle);
            mContainer = itemView.findViewById(R.id.container);
        }
    }
}
