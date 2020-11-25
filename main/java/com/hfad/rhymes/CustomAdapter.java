package com.hfad.rhymes;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    private Context context;
    private String[] names;
    private int[] imageId;
    public CustomAdapter(Context context, String []names,int[]imageId){
this.context=context;
this.names = names;
this.imageId=imageId;
    }

    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        CardView view = (CardView)inflater.inflate(R.layout.card_view_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, final int position) {
        final CardView cv=holder.cardView;
        ImageView imageView = (ImageView)cv.findViewById(R.id.info_image);
        TextView textView = (TextView)cv.findViewById(R.id.text);
        textView.setText(names[position]);
        imageView.setImageResource(imageId[position]);
        cv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cv.getContext(), RhymesActivity.class);
                intent.putExtra("position", position);
                cv.getContext().startActivity(intent);}});
    }

    @Override
    public int getItemCount() {
        return imageId.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        public ViewHolder(@NonNull CardView itemView) {
            super(itemView);
            cardView=itemView;
        }
    }
}
