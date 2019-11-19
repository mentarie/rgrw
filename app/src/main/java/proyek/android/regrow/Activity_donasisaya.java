package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_donasisaya extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donasisaya);

        ImageView donasisaya_kamis = findViewById(R.id.donasisaya_kamis);
        donasisaya_kamis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Activity_donasisaya.this, Activity_listkampanye.class);
                startActivity(i);
            }
        });
    }
}
