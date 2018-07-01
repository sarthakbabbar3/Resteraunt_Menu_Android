package com.example.sarthakbabbar.recycle_view;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by SARTHAK BABBAR on 23-Mar-18.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private final Context context;
    int[] drawable={R.drawable.chicken65, R.drawable.biryani, R.drawable.mangoicecream,
            R.drawable.chicken65, R.drawable.biryani, R.drawable.mangoicecream};
    String[] menu={"Chicken 65","Chicken Biryani","Mango Ice-Cream",
            "Chicken 65","Chicken Biryani","Mango Ice-Cream"};
    String[] price={"8.99","10.99","4.99",
            "8.99","10.99","4.99"};

    public MyAdapter(Context context){
        this.context=context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater li=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=li.inflate(R.layout.menu_item,null);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.ivItem.setImageResource(drawable[position]);
        holder.tvItem.setText(menu[position]);
        holder.tvPrice.setText(price[position]);
    }

    @Override
    public int getItemCount() {
        return menu.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView ivItem;
        TextView tvItem,tvPrice;

        public MyViewHolder(View itemView)
        {
            super(itemView);
            ivItem=(ImageView)itemView.findViewById(R.id.ivItem);
            tvItem=(TextView)itemView.findViewById(R.id.tvItem);
            tvPrice=(TextView)itemView.findViewById(R.id.tvPrice);



            itemView.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {

                    String text=tvItem.getText().toString();
                    Toast.makeText(context,text+"Pressed",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
