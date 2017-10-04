package kiky.extrabundle.android.com.kikyapps;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by KIKY on 10/4/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    Context c;
    String[] players;
    String[] positions;
    int[] images;

    public MyAdapter(Context ctx,String[] players,String[] positions,int[] images)
    {

        this.c=ctx;
        this.players=players;
        this.positions=positions;
        this.images=images;

    }
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);


        MyHolder holder=new MyHolder(v);

        return holder;
    }



    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {


        holder.nameTxt.setText(players[position]);
        holder.posTxt.setText(positions[position]);
        holder.img.setImageResource(images[position]);


        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {


                Intent i=new Intent(c,DetailActivity.class);


                i.putExtra("Name",players[position]);
                i.putExtra("Position",positions[position]);
                i.putExtra("Image",images[position]);


                c.startActivity(i);

            }
        });

    }


    @Override
    public int getItemCount() {
        return players.length;
    }
}
