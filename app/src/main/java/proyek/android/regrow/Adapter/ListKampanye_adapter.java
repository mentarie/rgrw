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

import proyek.android.regrow.Model.ListKampanye_model;
import proyek.android.regrow.R;

public class ListKampanye_adapter extends RecyclerView.Adapter<ListKampanye_adapter.ViewHolder>{
    private ArrayList<ListKampanye_model> listkampanye; //kalo list pake <>
    private Context context;

    public ListKampanye_adapter(ArrayList<ListKampanye_model> listkampanye) {this.listkampanye = listkampanye;}

    public int getItemCount() {
        return listkampanye.size();
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_listkampanye, parent, false);
        return new ListKampanye_adapter.ViewHolder(view);
    }

    public void onBindViewHolder(@NonNull ListKampanye_adapter.ViewHolder holder, int position) {
        ListKampanye_model model = listkampanye.get(position);
        holder.item_listkampanye_judul.setText(model.getJudul());
        holder.item_listkampanye_img.setImageResource(model.getGambar());
        holder.list_listkampanye_lokasi.setText(model.getLokasi());
        holder.item_listkampanye_danaterkumpul.setText(model.getDanaterkumpul());
        holder.item_listkampanye_sisahari.setText(model.getSisahari());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView item_listkampanye_img;
        TextView item_listkampanye_judul, list_listkampanye_lokasi,item_listkampanye_danaterkumpul,item_listkampanye_sisahari ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_listkampanye_img = itemView.findViewById(R.id.item_listkampanye_img);
            item_listkampanye_judul = itemView.findViewById(R.id.item_listkampanye_judul);
            list_listkampanye_lokasi = itemView.findViewById(R.id.list_listkampanye_lokasi);
            item_listkampanye_danaterkumpul = itemView.findViewById(R.id.item_listkampanye_danaterkumpul);
            item_listkampanye_sisahari = itemView.findViewById(R.id.item_listkampanye_sisahari);
        }
    }
}
