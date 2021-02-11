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

import it.rizzoli.model.Post;
import it.rizzoli.progettoescursioni.R;

public class PostListAdapter extends ArrayAdapter<Post> {
    Context ctx;
    int res;

    public PostListAdapter(@NonNull Context context, int resource, ArrayList<Post> post) {
        super(context, resource);

        addAll(post);

        ctx = context;
        res = resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(res, parent, false);

        TextView usernameTextView = rowView.findViewById(R.id.usernameTextView);
        TextView nomePercorsoTextView = rowView.findViewById(R.id.nomePTextView);
        TextView descrizioneTextView = rowView.findViewById(R.id.descrizioneTextView);
        TextView tipologiaTextView = rowView.findViewById(R.id.tipologiaTextView);


        Post p = getItem(position);


        //usernameTextView.setText(p);
        nomePercorsoTextView.setText(p.getNomePercorso());
        descrizioneTextView.setText(p.getDescrizione());
        usernameTextView.setText("Username");
        tipologiaTextView.setText(p.getTipologia());


        return rowView;

    }
}
