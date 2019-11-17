package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import proyek.android.regrow.Adapter.Komunitas_adapter;
import proyek.android.regrow.Model.Komunitas_model;

public class Activity_komunitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komunitas);

        RecyclerView item_komunitas = findViewById(R.id.item_komunitas);
        
        ArrayList<Komunitas_model> komunitas;

        komunitas=new ArrayList<>();
//        komunitas.add(new Komunitas_model(1, item_komunitas.getContext().getResources().getDrawable(R.drawable.kemangteer),"Kemangteer", "Komunitas Mangrove", "Yogyakarta", "1000 pengikut"));
        komunitas.add(new Komunitas_model(1, "","Kemangteer", "Komunitas Mangrove", "Yogyakarta", "1000 pengikut"));
        komunitas.add(new Komunitas_model(2,"","Wanakalasandya", "Komunitas Lingkungan", "Kalimantan Selatan", "800 pengikut"));
        komunitas.add(new Komunitas_model(3,"","Muda Menginspirasi", "Komunitas Lingkungan", "Yogyakarta", "800 pengikut"));
        komunitas.add(new Komunitas_model(4,"","Lindungi Hutan", "Komunitas Lingkungan", "Yogyakarta", "3000 pengikut"));

        Komunitas_adapter adapter ;
        adapter = new Komunitas_adapter(komunitas);
        RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(getApplicationContext());
        item_komunitas.setLayoutManager(layout_manager);
        item_komunitas.setAdapter(adapter);
    }
}
