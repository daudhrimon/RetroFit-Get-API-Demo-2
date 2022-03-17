package com.daud.retrofitgetpostid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private Context context;
    private List<ModelClass> List;

    public MyAdapter(Context context, java.util.List<ModelClass> list) {
        this.context = context;
        List = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.postIdTv.setText("postId: "+List.get(position).getPostId());
        holder.idTv.setText("id: "+List.get(position).getId());
        holder.nameTv.setText("name: "+List.get(position).getName());
        holder.emailTv.setText("email: "+List.get(position).getEmail());
        holder.bodyTv.setText("body: "+List.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return List.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView postIdTv,idTv,nameTv,emailTv,bodyTv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            postIdTv = itemView.findViewById(R.id.postIdTv);
            idTv = itemView.findViewById(R.id.idTv);
            nameTv = itemView.findViewById(R.id.nameTv);
            emailTv = itemView.findViewById(R.id.emailTv);
            bodyTv = itemView.findViewById(R.id.bodyTv);
        }
    }
}
