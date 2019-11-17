package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_komunitas_lihatprofil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komunitas_lihatprofil);

        ImageView img_galeri1 = findViewById(R.id.img_galeri1);
        img_galeri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_komunitas_lihatprofil.this, Activity_komunitas_lihatprofil_foto.class);
                startActivity(i);
            }
        });

    }
}
