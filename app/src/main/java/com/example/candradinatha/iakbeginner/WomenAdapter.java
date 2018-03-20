package com.example.candradinatha.iakbeginner;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Candradinatha on 16/02/2018.
 */

public class WomenAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view, parent,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder) holder).bindViewWomen(position);
    }

    @Override
    public int getItemCount() {
        return ItemData.title.length;
    }

    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private TextView mJudulText, mContentText, mPriceText;
        private ImageView mItemImage;

        public ListViewHolder (View itemView){
            super(itemView);
            mJudulText = (TextView) itemView.findViewById(R.id.tv_judul);
            mContentText = (TextView) itemView.findViewById(R.id.tv_content);
            mItemImage = (ImageView) itemView.findViewById(R.id.iv_avatar);
            mPriceText = (TextView) itemView.findViewById(R.id.tv_price);
            itemView.setOnClickListener(this);

        }

        public void bindViewWomen (final int position){
            mJudulText.setText(ItemData.womenTitle[position]);
            mItemImage.setImageResource(ItemData.womenPicture[position]);
            mContentText.setText(ItemData.content[position]);
            mPriceText.setText(ItemData.price[position]);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(itemView.getContext(),DetailActivity.class);

                    intent.putExtra("avatar", ItemData.womenPicture[position]);
                    intent.putExtra("judul", ItemData.womenTitle[position]);
                    intent.putExtra("content", ItemData.content[position]);
                    intent.putExtra("price", ItemData.price[position]);

                    itemView.getContext().startActivity(intent);

                }
            });

        }

        public void onClick (View view){

        }
    }
}
