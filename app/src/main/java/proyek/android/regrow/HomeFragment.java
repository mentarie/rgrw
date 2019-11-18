package proyek.android.regrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import proyek.android.regrow.Adapter.ListKampanye_adapter;
import proyek.android.regrow.Model.ListKampanye_model;


public class HomeFragment extends Fragment {
    public static final String TAG = "bottom_sheet";

    public HomeFragment() {

    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_home, container, false);
// notif
        ImageView home_pemberitahuan = fragmentView.findViewById(R.id.home_pemberitahuan);
        home_pemberitahuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Activity_pemberitahuan.class);
                startActivity(i);
            }
        });

// recycleview
        RecyclerView item_listkampanye = fragmentView.findViewById(R.id.item_listkampanye);

        ArrayList<ListKampanye_model> listkampanye;
        listkampanye=new ArrayList<>();
        listkampanye.add(new ListKampanye_model(1, getResources().getIdentifier("@drawable/lk1", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Pecinta ALam Kaltim", "Rp 500.000.089", "40"));
        listkampanye.add(new ListKampanye_model(2,getResources().getIdentifier("@drawable/lk2", "drawable", getActivity().getPackageName()),"#PenebanganLiar - ReGrow Hutan\n" +
                "Sumatera Utara", "Pecinta Alam Sumut", "Rp 90.000.000", "50"));
        listkampanye.add(new ListKampanye_model(3,getResources().getIdentifier("@drawable/lk3", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas Reboisasi Sumbar", "Rp 100.000.000", "60"));
        listkampanye.add(new ListKampanye_model(4,getResources().getIdentifier("@drawable/lk4", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas ReGrow", "Rp 50.000.000", "80"));
        listkampanye.add(new ListKampanye_model(5, getResources().getIdentifier("@drawable/lk1", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Pecinta ALam Kaltim", "Rp 500.000.089", "40"));
        listkampanye.add(new ListKampanye_model(6,getResources().getIdentifier("@drawable/lk2", "drawable", getActivity().getPackageName()),"#PenebanganLiar - ReGrow Hutan\n" +
                "Sumatera Utara", "Pecinta Alam Sumut", "Rp 90.000.000", "50"));
        listkampanye.add(new ListKampanye_model(7,getResources().getIdentifier("@drawable/lk3", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas Reboisasi Sumbar", "Rp 100.000.000", "60"));
        listkampanye.add(new ListKampanye_model(8,getResources().getIdentifier("@drawable/lk4", "drawable", getActivity().getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas ReGrow", "Rp 50.000.000", "80"));

        ListKampanye_adapter adapter ;
        adapter = new ListKampanye_adapter(listkampanye);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getActivity().getApplicationContext());
        item_listkampanye.setLayoutManager(layout_manager);
        item_listkampanye.setAdapter(adapter);

// saldo

        CardView isi_saldo = fragmentView.findViewById(R.id.isi_saldo);
        isi_saldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSheet_IsiSaldo fragment = new FragmentSheet_IsiSaldo();
                fragment.show(((FragmentActivity) getActivity()).getSupportFragmentManager(), TAG);
            }
        });

        return fragmentView;
    }
}