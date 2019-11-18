package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_isisaldo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isisaldo);

        // isi saldo
        ImageView home_pemberitahuan = fragmentView.findViewById(R.id.pilih_metodePembayaran);
        home_pemberitahuan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_isisaldo.this,Activity_pemberitahuan.class);
                startActivity(i);
            }
        });
    }
}
