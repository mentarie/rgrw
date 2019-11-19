package proyek.android.regrow;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DonasiFragment extends Fragment {
    public DonasiFragment() {

    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_donasi, container, false);

        ImageView donasisaya_kamis = fragmentView.findViewById(R.id.donasisaya_kamis);
        donasisaya_kamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), Activity_listkampanye.class);
                startActivity(i);
            }
        });
        LinearLayout catatankebaikan_1 = fragmentView.findViewById(R.id.catatankebaikan_1);
        catatankebaikan_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), Activity_donasisaya_donasi.class);
                startActivity(i);
            }
        });
        return fragmentView;
    }
}