package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyek.android.regrow.Adapter.Komunitas_adapter;
import proyek.android.regrow.Adapter.Pemberitahuan_adapter;
import proyek.android.regrow.Model.Komunitas_model;
import proyek.android.regrow.Model.Pemberitahuan_model;

public class Activity_pemberitahuan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemberitahuan);

        RecyclerView item_pemberitahuan = findViewById(R.id.item_pemberitahuan);

        ArrayList<Pemberitahuan_model> pemberitahuan;

        pemberitahuan=new ArrayList<>();
        pemberitahuan.add(new Pemberitahuan_model(1, getResources().getIdentifier("galeri1", "drawable", this.getPackageName()),"Pecinta Alam Kaltim - Pecinta Alam Kaltim mengirim post. 11 jam", "Lorem ipsum color sit amet"));
        pemberitahuan.add(new Pemberitahuan_model(2,getResources().getIdentifier("galeri2", "drawable", this.getPackageName()),"Progress  : Kegiatan Reboisasi Telah Terlaksana! - Regrow Hutan kalimantan Timur\n" +
                "Pecinta Alam Kaltim. 13 jam", "Lorem ipsum color sit amet"));
        pemberitahuan.add(new Pemberitahuan_model(3,getResources().getIdentifier("galeri3", "drawable", this.getPackageName()),"Kemangteer - Kemangteer Jogja mengirim post. 1 hari", "Lorem ipsum color sit amet"));
        pemberitahuan.add(new Pemberitahuan_model(4,getResources().getIdentifier("galeri1", "drawable", this.getPackageName()),"Wanakalasandya - Wanakalasandya mengirim post. 23 j", "Lorem ipsum color sit amet"));

        Pemberitahuan_adapter adapter ;
        adapter = new Pemberitahuan_adapter(pemberitahuan);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getApplicationContext());
        item_pemberitahuan.setLayoutManager(layout_manager);
        item_pemberitahuan.setAdapter(adapter);
    }
}
