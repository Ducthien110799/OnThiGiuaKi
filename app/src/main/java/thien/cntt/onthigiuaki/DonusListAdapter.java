package thien.cntt.onthigiuaki;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DonusListAdapter extends RecyclerView.Adapter<DonusListAdapter.DonusViewHolder> {

    public ArrayList<Donut> donutArrayList;
    public LayoutInflater layoutInflater;

    private  Context context;

    public DonusListAdapter(Context context, ArrayList<Donut> donutArrayList) {
        layoutInflater = LayoutInflater.from(context);
        this.donutArrayList = donutArrayList;
        this.context= context;
    }


    @NonNull
    @Override
    public DonusListAdapter.DonusViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView=layoutInflater.inflate(R.layout.list_item, parent, false);

        return new DonusViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull DonusListAdapter.DonusViewHolder holder, final int position) {
        final Donut mCurrent = donutArrayList.get(position);
        holder.name.setText(mCurrent.getName());
        holder.info.setText(mCurrent.getInfo());
        holder.price.setText(mCurrent.getPrice());
        holder.img.setImageResource(mCurrent.getImg());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Activity_new.class);
                intent.putExtra("name", mCurrent.getName());
                intent.putExtra("info", mCurrent.getInfo());
                intent.putExtra("price", mCurrent.getPrice());
                intent.putExtra("img", mCurrent.getImg());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return donutArrayList.size();
    }

    public class DonusViewHolder extends RecyclerView.ViewHolder{

        DonusListAdapter donusListAdapter;
        public TextView name;
        public TextView info;
        public TextView price;
        public ImageView img;


        public DonusViewHolder(@NonNull View itemView, DonusListAdapter adapter) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            info = itemView.findViewById(R.id.tvInfo);
            price = itemView.findViewById(R.id.tvPrice);
            img = itemView.findViewById(R.id.imgView);
            this.donusListAdapter= adapter;
        }
    }
}
