package demoapp.co.nestedscrollviewwithrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by surya on 10/5/18.
 */

public class ProductListHorizontalAdapter extends RecyclerView.Adapter<ProductListHorizontalAdapter.MyViewHolder> {

    private List<Integer> horizontalList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public ImageView imgView;

        public MyViewHolder(View view) {
            super(view);
            imgView = (ImageView) view.findViewById(R.id.imgview);

        }
    }


    public ProductListHorizontalAdapter(List<Integer> horizontalList) {
        this.horizontalList = horizontalList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.itemviewfirst, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        holder.imgView.setImageResource(horizontalList.get(position));
    }

    @Override
    public int getItemCount() {
        return horizontalList.size();
    }
}
