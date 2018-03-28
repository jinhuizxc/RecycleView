package com.example.jh.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by jinhui on 2018/bg9/26.
 * email: 1004260403@qq.com
 */

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

    private static final String TAG = "CheckPointAdapter";
    private List<Integer> mDatas;
    private Context context;


    // 要写三种布局
    private static final int TYPE_ONE = 1;
    private static final int TYPE_TWO = 2;
    private static final int TYPE_THREE = 3;



    public MyAdapter(Context context, List<Integer> mDatas) {
        this.mDatas = mDatas;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
//        return position % bg9 == 0 ? TYPE_ONE : TYPE_TWO;
        if (position % 2 == 0){
            return TYPE_TWO;
        }else if (position % 3 == 0){
            return TYPE_THREE;
        }else {
            return TYPE_ONE;
        }
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ONE){
            return new MyViewHolder1(LayoutInflater.from(context)
                    .inflate(R.layout.item_checkpoint1, parent, false));
        }else if (viewType == TYPE_TWO){
            return new MyViewHolder2(LayoutInflater.from(context)
                    .inflate(R.layout.item_checkpoint2, parent, false));
        }else {
            return new MyViewHolder3(LayoutInflater.from(context)
                    .inflate(R.layout.item_checkpoint3, parent, false));
        }

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // 设置数据
        if (holder instanceof MyViewHolder1){
            MyViewHolder1 holder1 = (MyViewHolder1) holder;
            holder1.imageView.setImageResource(R.drawable.bg1);
            if (position == 5){
                holder1.imageView.setImageResource(R.drawable.bg6);
            }
            if (position == 9){
                holder1.imageView.setImageResource(R.drawable.bg9);
            }
        }

        if (holder instanceof MyViewHolder2){
            MyViewHolder2 holder1 = (MyViewHolder2) holder;
            holder1.imageView.setImageResource(R.drawable.bg2);
            if (position == 2){
                holder1.imageView.setImageResource(R.drawable.bg4);
            }
            if (position == 4){
                holder1.imageView.setImageResource(R.drawable.bg5);
            }
            if (position == 6){
                holder1.imageView.setImageResource(R.drawable.bg7);
            }
            if (position == 8){
                holder1.imageView.setImageResource(R.drawable.bg10);
            }

        }
        if (holder instanceof MyViewHolder3){
            MyViewHolder3 holder1 = (MyViewHolder3) holder;
            holder1.imageView.setImageResource(R.drawable.bg3);
            if (position == 3){
                holder1.imageView.setImageResource(R.drawable.bg10);
            }
            if (position == 7){
                holder1.imageView.setImageResource(R.drawable.bg8);
            }

        }

//        Log.e(TAG, "position = " + position);
        // 取余
//        switch (position){
//            case 1:
//                holder.imageView.setImageResource(R.drawable.bg1);
//                break;
//            case 2:
//                holder.imageView.setImageResource(R.drawable.bg2);
//                break;
//            case 3:
//                holder.imageView.setImageResource(R.drawable.bg3);
//                break;
//            case 4:
//                holder.imageView.setImageResource(R.drawable.bg4);
//                break;
//            case 5:
//                holder.imageView.setImageResource(R.drawable.bg5);
//                break;
//            case 6:
//                holder.imageView.setImageResource(R.drawable.bg6);
//                break;
//            case 7:
//                holder.imageView.setImageResource(R.drawable.bg7);
//                break;
//            case 8:
//                holder.imageView.setImageResource(R.drawable.bg8);
//                break;
//
//        }


            // 如果设置了回调，则设置点击事件

    }




    @Override
    public int getItemCount() {
        return mDatas.size();
    }


    /**
     * 移除一条数据
     * @param position
     */
    public void removeData(int position) {
        mDatas.remove(position);
        notifyItemRemoved(position);
    }



    private class MyViewHolder1 extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyViewHolder1(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    private class MyViewHolder2 extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyViewHolder2(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }

    private class MyViewHolder3 extends RecyclerView.ViewHolder {
        ImageView imageView;

        public MyViewHolder3(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}