package proyek.android.regrow;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import static android.app.Activity.RESULT_OK;

public class FragmentSheet_IsiSaldo extends BottomSheetDialogFragment {
    Integer i = 1;
    private Button btnConfirm;
    private TextView txtQuantity;
    Context mContext;
    ProgressDialog loading;
    private View view;
    private boolean invalidated = false;
    private BottomSheetBehavior mBottomSheetBehavior;
    private HasilCallbacks hasilCallbacks;
    public FragmentSheet_IsiSaldo(HasilCallbacks hasilCallbacks, boolean invalidated){
        this.hasilCallbacks = hasilCallbacks;
        this.invalidated = invalidated;
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
        //handleUserExit();
    }

    @SuppressLint("RestrictedApi")
    @Override
    public void setupDialog(Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        if(invalidated){
            view = LayoutInflater.from(getContext()).inflate(R.layout.bottomsheetview_isisaldo2, null);
        }else{
            view = LayoutInflater.from(getContext()).inflate(R.layout.activity_isisaldo, null);
        }

        dialog.setContentView(view);

        mContext = getActivity();

        CoordinatorLayout.LayoutParams params = (CoordinatorLayout.LayoutParams) ((View) view.getParent()).getLayoutParams();
        CoordinatorLayout.Behavior behavior = params.getBehavior();

        if (behavior != null && behavior instanceof BottomSheetBehavior) {
            mBottomSheetBehavior = (BottomSheetBehavior) behavior;
            ((BottomSheetBehavior) behavior).setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
                @Override
                public void onStateChanged(@NonNull View bottomSheet, int newState) {
                    if (newState == BottomSheetBehavior.STATE_HIDDEN) {
                        dismiss();
                    }
                }

                @Override
                public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                }
            });
        }

        TextView pilih_metodePembayaran = view.findViewById(R.id.pilih_metodePembayaran);
        pilih_metodePembayaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getContext(), Activity_MetodePembayaran.class);
                startActivityForResult(i, 69);
            }
        });

        CardView button_isisaldo = view.findViewById(R.id.button_isisaldo);
        button_isisaldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentSheet_IsiSaldo.this.dismiss();
                Intent i = new Intent(getContext(), Activity_isisaldo.class);
                startActivity(i);
            }
        });
    }

    private void handleUserExit() {
        //Toast.makeText(getActivity(), "Added to Cart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 69 && resultCode == RESULT_OK){
           hasilCallbacks.callbacks();
            this.dismiss();
        }
    }
}
