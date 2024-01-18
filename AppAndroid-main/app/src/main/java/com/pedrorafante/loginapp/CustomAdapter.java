package com.pedrorafante.loginapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private List<Usuario> itemList;

    private OnItemClickListener onItemClickListener;

    private DatabaseHelper databaseHelper;

    public CustomAdapter(List<Usuario> itemList) {
        this.itemList = itemList;
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        this.onItemClickListener = listener;
    }



    @NonNull
    @Override
    public CustomAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        databaseHelper = new DatabaseHelper(parent.getContext());
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomAdapter.ViewHolder holder, int position) {
        Usuario item = itemList.get(position);
        holder.textView.setText(item.getUser());
        Glide.with(holder.itemView.getContext()).load(R.drawable.img_image1).into(holder.imageView);

//        // Verifique se a propriedade imagePath contém o caminho da imagem no banco de dados
//        if (item.getImagePath() != null && !item.getImagePath().isEmpty()) {
//            // Use Glide para carregar a imagem do caminho no banco de dados
//            Glide.with(holder.itemView.getContext()).load(item.getImagePath()).into(holder.imageView);
//        } else {
//            // Se imagePath for nulo ou vazio, você pode lidar com um fallback ou exibir uma imagem padrão
//            Glide.with(holder.itemView.getContext()).load(R.drawable.default_image).into(holder.imageView);
//        }

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public interface OnItemClickListener{
        void onItemClick(int position);

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txtLanguageOne);
            imageView = itemView.findViewById(R.id.imageView);

            itemView.setOnClickListener(v -> {
                if (onItemClickListener != null){
                    int position = getAdapterPosition();
                    if (position != RecyclerView.NO_POSITION){
                        onItemClickListener.onItemClick(position);
                    }
                }
            });

        }
    }

    public void atualizarList(List<Usuario> novaLista){
        this.itemList = novaLista;
        notifyDataSetChanged();
    }
}
