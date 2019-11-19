package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Activity_isisaldo extends AppCompatActivity {
    private View view;
    Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isisaldo);

        TextView batal_isisaldo = findViewById(R.id.batal_isisaldo);
        batal_isisaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_isisaldo.this, HomeFragment.class);
                startActivity(i);
            }
        });
        CardView button_instruksipembayaran = findViewById(R.id.button_instruksipembayaran);
        button_instruksipembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
