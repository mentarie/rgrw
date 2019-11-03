package proyek.android.regrow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Activity_login extends AppCompatActivity {

    TextInputLayout id_login_layout;
    TextInputEditText id_login_edittext;
    LinearLayout button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        id_login_edittext = findViewById(R.id.id_login_edittext);
        id_login_layout = findViewById(R.id.id_login_layout);
        button_login = findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String no_hp = id_login_edittext.getText().toString();
                if (no_hp.isEmpty()){
                    id_login_layout.setError("Nomor Telepon Belum Diisi");
                    id_login_edittext.requestFocus();
                    return;
                }
                Intent i = new Intent(Activity_login.this, Activity_kodekonfirmasi.class);
                i.putExtra("id_login_layout", no_hp);
                startActivity(i);
            }
        });
    }
}
