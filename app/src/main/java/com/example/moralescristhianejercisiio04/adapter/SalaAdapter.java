package com.example.moralescristhianejercisiio04.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.moralescristhianejercisiio04.R;
import com.example.moralescristhianejercisiio04.entity.Sala;

import java.util.List;

public class SalaAdapter extends ArrayAdapter<Sala> {

    private Context context;
    private List<Sala> lista;
    public SalaAdapter(@NonNull Context context, int resource, @NonNull List<Sala> lista) {
        super(context, resource,  lista);
        this.context = context;
        this.lista = lista;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.activity_sala_crud_item, parent, false);

        Sala obj = lista.get(position);

        TextView txtNombre = row.findViewById(R.id.idItemCrudSalaNombre);
        txtNombre.setText(obj.getCapacidad());

        return row;
    }

}
