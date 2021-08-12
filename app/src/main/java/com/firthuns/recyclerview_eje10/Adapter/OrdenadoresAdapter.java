package com.firthuns.recyclerview_eje10.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firthuns.recyclerview_eje10.R;
import com.firthuns.recyclerview_eje10.modelos.Ordenador;

import java.util.List;

public class OrdenadoresAdapter extends RecyclerView.Adapter<OrdenadoresAdapter.OrdenadorVH> {

    private List<Ordenador> object;
    private int resource;
    private Context context;

    public OrdenadoresAdapter(List<Ordenador> object, int resource, Context context) {
        this.object = object;
        this.resource = resource;
        this.context = context;
    }

    /* INSTANCIA UN NUEVO OBJETO OrdenadorVH y lo retorna para que se le cambie la info*/
    @NonNull
    @Override
    public OrdenadorVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View ordenadorItem = LayoutInflater.from(context).inflate(resource,null);
    // la siguiente linea me hace que el linearLayout ocupe to.do el ancho de pantalla
        ordenadorItem.setLayoutParams(new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT));

        return new OrdenadorVH(ordenadorItem);
    }

    /*
    * Asignar los valores correspondientes a los atributos de VH, [holder y position*
    * */

    @Override
    public void onBindViewHolder(@NonNull OrdenadorVH holder, int position) {
            Ordenador ordenador = object.get(position);
            // voy a asignar a los atributos del holder

        holder.txtMarca.setText(ordenador.getMarca());
        holder.txtModelo.setText(ordenador.getModelo());
        holder.txtRam.setText(String.valueOf(ordenador.getRam()));
        holder.txtVelocidadProcesador.setText(String.valueOf(ordenador.getVelocidadProcesador()));

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "CARD" + position, Toast.LENGTH_LONG).show();
            }
        });


        holder.txtMarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "marca " + position, Toast.LENGTH_LONG).show();
            }
        });
    }

    /*Se encarga de devolver el numero de 'filas* que hay que pintar , numero que me lo dará el arraylist*/
    @Override
    public int getItemCount() {
        return object.size(); // OJITO CON ESTE APARTADO CARA EL EXAMEN
    }

    public static class OrdenadorVH extends RecyclerView.ViewHolder {
        TextView txtMarca, txtModelo, txtRam, txtVelocidadProcesador;
        View card;
        public OrdenadorVH(@NonNull View itemView) {
            super(itemView);


            txtMarca = itemView.findViewById(R.id.txtMarcaFila);
            txtModelo = itemView.findViewById(R.id.txtModeloFila);
            txtRam = itemView.findViewById(R.id.txtRamFila);
            txtVelocidadProcesador = itemView.findViewById(R.id.txtVelocidadFila);
            card = itemView;

        }
    }


}
