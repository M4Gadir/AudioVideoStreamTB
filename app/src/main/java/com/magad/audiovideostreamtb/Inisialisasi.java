package com.magad.audiovideostreamtb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

class Inisialisasi extends RecyclerView.ViewHolder {
    TextView tv;
    ImageView iv;
    public Inisialisasi(@NonNull View itemView, Context context) {
        super(itemView);
        tv = itemView.findViewById(R.id.tvsong);
        iv = itemView.findViewById(R.id.imgsong);
    }
}
