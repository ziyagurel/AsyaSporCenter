package com.zahitziyagurel.asyasporcenter.Fragment;


import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zahitziyagurel.asyasporcenter.Adapter.urun_adapter;
import com.zahitziyagurel.asyasporcenter.Helper.IRecylerItemClick;
import com.zahitziyagurel.asyasporcenter.R;
import com.zahitziyagurel.asyasporcenter.Values.Urun;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class fragment_urun extends Fragment implements IRecylerItemClick {
    private RecyclerView recyclerView;
    private List<Urun> uruns= Arrays.asList(new Urun[]{
            //Tür1: Listeye ekleme
            new Urun().setUrunAdi("Test").setFiyat(45).setId("test").setCount40(2),

    });

    private String TAG = getClass().getName();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_urunler, container, false);
        //uruns = new ArrayList<>();
        Log.e(TAG, "onCreateView: ");
        recyclerView = view.findViewById(R.id.recycler);
        //recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(), 0));
        RefreshList();
        return view;
    }
    private void SetAdapter(List<Urun> uruns){
        recyclerView.setAdapter(new urun_adapter(uruns));
    }
    private void RefreshList(){
        SetAdapter(uruns);
    }

    @Override
    public void Click(Urun urun) {
        BottomSheetDialogFragment bf = new Urun_Select_Bottom();
        Bundle args = new Bundle();
        args.putSerializable("Urun", (Serializable) new Urun()
                .setCount40(urun.getCount40())
                .setCount41(urun.getCount41())
                .setCount42(urun.getCount42())
                .setCount43(urun.getCount43())
                .setCount44(urun.getCount44())
                .setCount45(urun.getCount45())
                .setId(urun.getId())
                .setFiyat(urun.getFiyat())
                .setUrunAdi(urun.getUrunAdi())
                .setImagePath(urun.getImagePath()));
        bf.setArguments(args);
        bf.show(getFragmentManager(),"urun_select");
    }
}
