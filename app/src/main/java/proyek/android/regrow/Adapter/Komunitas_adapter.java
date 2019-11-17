package proyek.android.regrow.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;
import proyek.android.regrow.Model.Komunitas_model;
import proyek.android.regrow.R;

public class Komunitas_adapter extends RecyclerView.Adapter<Komunitas_adapter.ViewHolder>{
    private ArrayList<Komunitas_model> komunitas; //kalo list pake <>
    private Context context;



    public Komunitas_adapter(ArrayList<Komunitas_model> komunitas) {
        this.komunitas = komunitas;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_komunitas, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Komunitas_model model = komunitas.get(position);
        holder.item_komunitas_title.setText(model.getNama());
//        holder.item_komunitas_image.setImageResource(model.getGambar());
        holder.item_komunitas_nama.setText(model.getKeterangan());
        holder.item_komunitas_lokasi.setText(model.getLokasi());
        holder.item_komunitas_pengikut.setText(model.getPengikut());
    }

    @Override
    public int getItemCount() {
        return komunitas.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView item_komunitas_image;
        TextView item_komunitas_title, item_komunitas_nama, item_komunitas_lokasi,item_komunitas_pengikut;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_komunitas_image = itemView.findViewById(R.id.item_komunitas_image);
            item_komunitas_title = itemView.findViewById(R.id.item_komunitas_title);
            item_komunitas_nama = itemView.findViewById(R.id.item_komunitas_nama);
            item_komunitas_lokasi = itemView.findViewById(R.id.item_komunitas_lokasi);
            item_komunitas_pengikut = itemView.findViewById(R.id.item_komunitas_pengikut);
        }
    }
}
