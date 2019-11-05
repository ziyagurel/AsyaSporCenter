package com.zahitziyagurel.asyasporcenter.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zahitziyagurel.asyasporcenter.R;
import com.zahitziyagurel.asyasporcenter.Values.Urun;

import java.util.List;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class urun_adapter extends RecyclerView.Adapter<urun_adapter.ViewHolder>{
    private List<Urun> uruns;
    private String TAG = getClass().getCanonicalName();
    public urun_adapter(List<Urun> uruns){
        this.uruns = uruns;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_urun,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, int i) {
        final Urun item = uruns.get(i);
        viewHolder.txt_urun.setText(item.getUrunAdi());
        viewHolder.txt_40.setText(item.getCount40()+"");
        viewHolder.txt_41.setText(item.getCount41()+"");
        viewHolder.txt_42.setText(item.getCount42()+"");
        viewHolder.txt_43.setText(item.getCount43()+"");
        viewHolder.txt_44.setText(item.getCount44()+"");
        viewHolder.txt_45.setText(item.getCount45()+"");
        viewHolder.txt_fiyat.setText(item.getFiyat()+" ₺");
        viewHolder.txt_fiyat.setText(item.getFiyat()+" ₺");
        Log.d(TAG, "onBindViewHolder:");
        viewHolder.layout.startShimmerAnimation();
    }

    @Override
    public int getItemCount() {
        return uruns.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView txt_urun,txt_fiyat,txt_40,txt_41,txt_42,txt_43,txt_44,txt_45;
        private RelativeLayout root;
        private ShimmerLayout layout;
        public ViewHolder(View itemView) {
            super(itemView);
            layout=itemView.findViewById(R.id.list_urun_shimmer);
            //root=itemView.findViewById(R.id.list_urun_rootview);
            img=itemView.findViewById(R.id.list_urun_img);
            txt_urun=itemView.findViewById(R.id.list_urun_adi);
            txt_fiyat=itemView.findViewById(R.id.list_urun_fiyat);
            txt_40=itemView.findViewById(R.id.list_urun_40);
            txt_41=itemView.findViewById(R.id.list_urun_41);
            txt_42=itemView.findViewById(R.id.list_urun_42);
            txt_43=itemView.findViewById(R.id.list_urun_43);
            txt_44=itemView.findViewById(R.id.list_urun_44);
            txt_45=itemView.findViewById(R.id.list_urun_45);
        }
    }
}
