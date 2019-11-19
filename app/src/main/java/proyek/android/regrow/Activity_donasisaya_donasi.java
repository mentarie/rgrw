package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Activity_donasisaya_donasi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasisaya_donasi);

        LinearLayout bukti_pelaksanaan = findViewById(R.id.bukti_pelaksanaan);
        bukti_pelaksanaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_donasisaya_donasi.this, Activity_buktipelaksanaan.class);
                startActivity(i);
            }
        });
        //back
        ImageView back_donasisaya = findViewById(R.id.back_donasisaya);
        back_donasisaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }
}
