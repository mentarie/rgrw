package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyek.android.regrow.Adapter.Komunitas_adapter;
import proyek.android.regrow.Adapter.Komunitas_adapter_terdekat;
import proyek.android.regrow.Model.Komunitas_model;

public class Activity_komunitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komunitas);
//komunitas favorit
        RecyclerView item_komunitas = findViewById(R.id.item_komunitas);
        
        ArrayList<Komunitas_model> komunitas;

        komunitas=new ArrayList<>();
        komunitas.add(new Komunitas_model(1, getResources().getIdentifier("kemangteer", "drawable", this.getPackageName()),"Kemangteer", "Komunitas Mangrove", "Yogyakarta", "1000 pengikut"));
        komunitas.add(new Komunitas_model(2,getResources().getIdentifier("wanakalasandya", "drawable", this.getPackageName()),"Wanakalasandya", "Komunitas Lingkungan", "Kalimantan Selatan", "800 pengikut"));
        komunitas.add(new Komunitas_model(3,getResources().getIdentifier("mudamenginspirasi", "drawable", this.getPackageName()),"Muda Menginspirasi", "Komunitas Lingkungan", "Yogyakarta", "800 pengikut"));

        Komunitas_adapter adapter ;
        adapter = new Komunitas_adapter(komunitas);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getApplicationContext());
        item_komunitas.setLayoutManager(layout_manager);
        item_komunitas.setAdapter(adapter);

// komunitas terdekat
        RecyclerView item_komunitas2 = findViewById(R.id.item_komunitas);

        ArrayList<Komunitas_model> komunitas2;

        komunitas2=new ArrayList<>();
        komunitas2.add(new Komunitas_model(4,getResources().getIdentifier("lindungihutan", "drawable", this.getPackageName()),"Lindungi Hutan", "Komunitas Lingkungan", "Yogyakarta", "3000 pengikut"));
        komunitas2.add(new Komunitas_model(5,getResources().getIdentifier("logo_komunitas", "drawable", this.getPackageName()),"Pecinta Alam Kaltim", "Komunitas Reboisasi", "Kalimantan Timur", "1051 pengikut"));
        komunitas2.add(new Komunitas_model(5,getResources().getIdentifier("logoregrow", "drawable", this.getPackageName()),"ReGrow", "Komunitas Reboisasi", "Yogyakarta", "650 pengikut"));

        Komunitas_adapter_terdekat adapter2 ;
        adapter2 = new Komunitas_adapter_terdekat(komunitas2);
        RecyclerView.LayoutManager layout_manager2 = new LinearLayoutManager(getApplicationContext());
        item_komunitas2.setLayoutManager(layout_manager2);
        item_komunitas2.setAdapter(adapter2);
    }
}
