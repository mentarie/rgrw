package proyek.android.regrow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import proyek.android.regrow.Adapter.Komunitas_adapter;
import proyek.android.regrow.Model.Komunitas_model;


public class ExploreFragment extends Fragment {
    public ExploreFragment() {

    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_explore, container, false);
        RecyclerView item_komunitas = fragmentView.findViewById(R.id.item_komunitas);

        ArrayList<Komunitas_model> komunitas;

        komunitas=new ArrayList<>();
        komunitas.add(new Komunitas_model(1,getResources().getIdentifier("kemangteer", "drawable", getActivity().getPackageName()),"Kemangteer", "Komunitas Mangrove", "Yogyakarta", "1000 pengikut"));
        komunitas.add(new Komunitas_model(2,getResources().getIdentifier("wanakalasandya", "drawable", getActivity().getPackageName()),"Wanakalasandya", "Komunitas Lingkungan", "Kalimantan Selatan", "800 pengikut"));
        komunitas.add(new Komunitas_model(3,getResources().getIdentifier("mudamenginspirasi", "drawable", getActivity().getPackageName()),"Muda Menginspirasi", "Komunitas Lingkungan", "Yogyakarta", "800 pengikut"));
        komunitas.add(new Komunitas_model(4,getResources().getIdentifier("lindungihutan", "drawable", getActivity().getPackageName()),"Lindungi Hutan", "Komunitas Lingkungan", "Yogyakarta", "3000 pengikut"));
        komunitas.add(new Komunitas_model(5,getResources().getIdentifier("logo_komunitas", "drawable", getActivity().getPackageName()),"Pecinta Alam Kaltim", "Komunitas Reboisasi", "Kalimantan Timur", "1051 pengikut"));
        komunitas.add(new Komunitas_model(5,getResources().getIdentifier("logoregrow", "drawable", getActivity().getPackageName()),"ReGrow", "Komunitas Reboisasi", "Yogyakarta", "650 pengikut"));

        Komunitas_adapter adapter ;
        adapter = new Komunitas_adapter(komunitas);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getActivity().getApplicationContext());
        item_komunitas.setLayoutManager(layout_manager);
        item_komunitas.setAdapter(adapter);
        return fragmentView;
    }
}