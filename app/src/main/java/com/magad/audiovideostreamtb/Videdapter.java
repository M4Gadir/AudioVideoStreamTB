package com.magad.audiovideostreamtb;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

class Videdapter extends RecyclerView.Adapter<Inisialisasi> {
    Context context;
    public Videdapter(Context context) {

    }

    @NonNull
    @Override
    public Inisialisasi onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.isireyclernya,null );
        return new Inisialisasi(v,context );
    }

    @Override
    public void onBindViewHolder(@NonNull Inisialisasi inisialisasi, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
