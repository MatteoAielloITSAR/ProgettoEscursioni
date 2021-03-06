package it.rizzoli.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.zip.Inflater;

import it.rizzoli.model.Post;
import it.rizzoli.model.UtentePost;
import it.rizzoli.progettoescursioni.R;

public class PostListAdapter extends ArrayAdapter<UtentePost> {
    Context ctx;
    int res;

    public PostListAdapter(@NonNull Context context, int resource, ArrayList<UtentePost> posts) {
        super(context, resource);

        addAll(posts);

        ctx = context;
        res = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(res, parent, false);

        TextView usernameTextView = rowView.findViewById(R.id.usernameTextView);
        TextView nomePTextView = rowView.findViewById(R.id.nomePTextView);
        TextView descrizioneTextView = rowView.findViewById(R.id.descrizioneTextView);
        TextView tipologiaTextView = rowView.findViewById(R.id.tipologiaTextView);

        UtentePost p = getItem(position);

        usernameTextView.setText(p.getUsername());
        nomePTextView.setText(p.getNomePercorso());
        descrizioneTextView.setText(p.getDescrizione());
        tipologiaTextView.setText(p.getTipologia());

        return rowView;
    }
}
