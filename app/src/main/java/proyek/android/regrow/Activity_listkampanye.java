package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyek.android.regrow.Adapter.Komunitas_adapter;
import proyek.android.regrow.Adapter.ListKampanye_adapter;
import proyek.android.regrow.Model.Komunitas_model;
import proyek.android.regrow.Model.ListKampanye_model;

public class Activity_listkampanye extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listkampanye);

        RecyclerView item_listkampanye = findViewById(R.id.item_listkampanye);

        ArrayList<ListKampanye_model> listkampanye;
        listkampanye=new ArrayList<>();
        listkampanye.add(new ListKampanye_model(1, getResources().getIdentifier("lk1", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Pecinta ALam Kaltim", "Rp 500.000.089", "40"));
        listkampanye.add(new ListKampanye_model(2,getResources().getIdentifier("lk2", "drawable", this.getPackageName()),"#PenebanganLiar - ReGrow Hutan\n" +
                "Sumatera Utara", "Pecinta Alam Sumut", "Rp 90.000.000", "50"));
        listkampanye.add(new ListKampanye_model(3,getResources().getIdentifier("lk3", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas Reboisasi Sumbar", "Rp 100.000.000", "60"));
        listkampanye.add(new ListKampanye_model(4,getResources().getIdentifier("lk4", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas ReGrow", "Rp 50.000.000", "80"));
        listkampanye.add(new ListKampanye_model(5, getResources().getIdentifier("lk1", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Pecinta ALam Kaltim", "Rp 500.000.089", "40"));
        listkampanye.add(new ListKampanye_model(6,getResources().getIdentifier("lk2", "drawable", this.getPackageName()),"#PenebanganLiar - ReGrow Hutan\n" +
                "Sumatera Utara", "Pecinta Alam Sumut", "Rp 90.000.000", "50"));
        listkampanye.add(new ListKampanye_model(7,getResources().getIdentifier("lk3", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas Reboisasi Sumbar", "Rp 100.000.000", "60"));
        listkampanye.add(new ListKampanye_model(8,getResources().getIdentifier("lk4", "drawable", this.getPackageName()),"#KebakaranHutan - ReGrow Hutan\n" +
                "Kalimantan Timur", "Komunitas ReGrow", "Rp 50.000.000", "80"));

        ListKampanye_adapter adapter ;
        adapter = new ListKampanye_adapter(listkampanye);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getApplicationContext());
        item_listkampanye.setLayoutManager(layout_manager);
        item_listkampanye.setAdapter(adapter);
    }
}
