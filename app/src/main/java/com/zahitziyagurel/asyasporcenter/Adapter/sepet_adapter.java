package com.zahitziyagurel.asyasporcenter.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.zahitziyagurel.asyasporcenter.R;
import com.zahitziyagurel.asyasporcenter.Values.Urun;

import java.util.List;

public class sepet_adapter extends RecyclerView.Adapter<sepet_adapter.ViewHolder>  {
    List<Urun> uruns;
    String TAG = getClass().getName();
    public sepet_adapter(List<Urun> uruns) {
        this.uruns = uruns;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_sepet,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final Urun item = uruns.get(i);
        viewHolder.txt_urun.setText(item.getUrunAdi());
        viewHolder.txt_40.setText(item.getCount40() + "");
        viewHolder.txt_41.setText(item.getCount41() + "");
        viewHolder.txt_42.setText(item.getCount42() + "");
        viewHolder.txt_43.setText(item.getCount43() + "");
        viewHolder.txt_44.setText(item.getCount44() + "");
        viewHolder.txt_45.setText(item.getCount45() + "");
        float toplam = item.getCount40() + item.getCount41() + item.getCount42() + item.getCount43() + item.getCount44() + item.getCount45();
        viewHolder.txt_fiyat.setText(toplam * item.getFiyat() + "₺");
    }

    @Override
    public int getItemCount() {
        return uruns.size();
    }

    public Urun getItem(int position){
        return uruns.get(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView txt_urun,txt_fiyat,txt_40,txt_41,txt_42,txt_43,txt_44,txt_45;
        private RelativeLayout root,frg_back;
        public LinearLayout frg_view;
        private ImageView img;
        public ViewHolder(View itemView) {
            super(itemView);
            frg_view=itemView.findViewById(R.id.list_sepet_frg_view);
            frg_back=itemView.findViewById(R.id.list_sepet_frg_delete);
            root=itemView.findViewById(R.id.list_sepet_rootview);
            txt_urun=itemView.findViewById(R.id.list_sepet_adi);
            txt_fiyat=itemView.findViewById(R.id.list_sepet_fiyat);
            txt_40=itemView.findViewById(R.id.list_sepet_40);
            txt_41=itemView.findViewById(R.id.list_sepet_41);
            txt_42=itemView.findViewById(R.id.list_sepet_42);
            txt_43=itemView.findViewById(R.id.list_sepet_43);
            txt_44=itemView.findViewById(R.id.list_sepet_44);
            txt_45=itemView.findViewById(R.id.list_sepet_45);
            img=itemView.findViewById(R.id.list_sepet_img);
        }
    }
}
