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

public class PostListAdapter extends ArrayAdapter<Post> {
    Context ctx;
    int res;

    public PostListAdapter(@NonNull Context context, int resource, ArrayList<Post> posts) {
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

        TextView nameTextView = rowView.findViewById(R.id.nameTextView);
        TextView surnameTextView = rowView.findViewById(R.id.surnameTextView);
        TextView ageTextView = rowView.findViewById(R.id.ageTextView);

        Utente u = getItem(position);
        String eta = "" + u.getEta();

        nameTextView.setText(u.getNome());
        surnameTextView.setText(u.getCognome());
        ageTextView.setText(eta);

        return rowView;
    }
}
