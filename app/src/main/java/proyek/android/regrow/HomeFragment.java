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

        ImageView home_pemberitahuan = fragmentView.findViewById(R.id.home_pemberitahuan);
        home_pemberitahuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Activity_pemberitahuan.class);
                startActivity(i);
            }
        });

        CardView isi_saldo = fragmentView.findViewById(R.id.isi_saldo);
        isi_saldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSheet_Donasi fragment = new FragmentSheet_Donasi();
                fragment.show(((FragmentActivity) getActivity()).getSupportFragmentManager(), TAG);
            }
        });

        return fragmentView;
    }
}