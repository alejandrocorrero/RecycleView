package es.saladillo.alejandro.recycleview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivityAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final ArrayList<ListItem> mDatos;

    // Constructor. Recibe contexto y datos.
    public MainActivityAdapter(ArrayList<ListItem> datos) {
        mDatos = datos;
    }
    @Override
    public int getItemCount() {
        return mDatos.size();
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType==R.layout.item_alumno)
             View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_alumno, parent, false);
        return new ViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // Se obtiene el alumno correspondiente.
       ListItem objeto = mDatos.get(position);

        if(objeto.getType()==R.layout.item_alumno)
            (ViewHolderAlumno)holder.setText(objeto.getAlumno());
            (ViewHolderAlumno)holder.setText(objeto.getEdad());
        holder.lblDireccion.setText(alumno.getDireccion());
        holder.imgFoto.setImageUri(alumno.getFoto());
    }
    static class ViewHolderClase extends RecyclerView.ViewHolder {

        // El contenedor de vistas para un elemento de la lista debe contener...
        private final TextView txtCurso;
        public ViewHolderClase(View itemView) {
            super(itemView);
            txtCurso = (TextView) itemView.findViewById(R.id.txtCurso);
        }

    }
    static class ViewHolderAlumno extends RecyclerView.ViewHolder {

        // El contenedor de vistas para un elemento de la lista debe contener...
        private final TextView lblAlumno;
        private final TextView txtEdad;
        public ViewHolderAlumno(View itemView) {
            super(itemView);
            lblAlumno = (TextView) itemView.findViewById(R.id.txtAlumno);
            txtEdad = (TextView) itemView.findViewById(R.id.txtEdad);
        }

    }

}