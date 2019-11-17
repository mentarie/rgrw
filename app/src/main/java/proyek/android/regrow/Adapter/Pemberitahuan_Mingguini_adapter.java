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

import proyek.android.regrow.Model.Pemberitahuan_model;
import proyek.android.regrow.R;

public class Pemberitahuan_Mingguini_adapter extends RecyclerView.Adapter<Pemberitahuan_Mingguini_adapter.ViewHolder>{
    private ArrayList<Pemberitahuan_model> pemberitahuan; //kalo list pake <>
    private Context context;

    public Pemberitahuan_Mingguini_adapter(ArrayList<Pemberitahuan_model> pemberitahuan) {
        this.pemberitahuan = pemberitahuan;
    }

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pemberitahuan, parent, false);
        return new Pemberitahuan_Mingguini_adapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Pemberitahuan_model model = pemberitahuan.get(position);
        holder.item_pemberitahuan_img.setImageResource(model.getGambar());
        holder.item_pemberitahuan_desc.setText(model.getDeskripsi());
        holder.item_pemberitahuan_imgdesc.setImageResource(model.getDeskripsi_gambar());
    }

    public int getItemCount() {
        return pemberitahuan.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView item_pemberitahuan_img, item_pemberitahuan_imgdesc;
        TextView item_pemberitahuan_desc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_pemberitahuan_img = itemView.findViewById(R.id.item_pemberitahuan_img);
            item_pemberitahuan_desc = itemView.findViewById(R.id.item_pemberitahuan_desc);
            item_pemberitahuan_imgdesc = itemView.findViewById(R.id.item_pemberitahuan_imgdesc);
        }
    }
}
