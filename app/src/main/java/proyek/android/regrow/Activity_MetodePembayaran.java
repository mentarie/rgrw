package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Activity_MetodePembayaran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__metode_pembayaran);

        LinearLayout bank_mandiri = findViewById(R.id.bank_mandiri);
        bank_mandiri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(69);
                finish();
            }
        });
    }
}
