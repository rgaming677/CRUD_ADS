package com.example.myapplication.adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.database.dao.MahasiswaDao;
import com.example.myapplication.database.entitas.Mahasiswa;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.MahasiswaViewHolder> {
    private List<MahasiswaDao> mahasiswaList;
    private Context context;

    public MahasiswaAdapter(List<Mahasiswa> mahasiswaList, Context context ) {
        this.mahasiswaList = mahasiswaList;
        this.context = context;
    }
}
