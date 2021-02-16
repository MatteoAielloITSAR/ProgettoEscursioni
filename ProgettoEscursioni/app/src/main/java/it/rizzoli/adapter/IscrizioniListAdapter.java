package it.rizzoli.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

import it.rizzoli.model.Utente;
import it.rizzoli.progettoescursioni.R;

public class IscrizioniListAdapter extends ArrayAdapter<Utente> {
    Context ctx;
    int res;

    public IscrizioniListAdapter(@NonNull Context context, int resource, ArrayList<Utente> iscrizioni) {
        super(context, resource);

        addAll(iscrizioni);

        ctx=context;
        res=resource;
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(res, parent, false);

        TextView usernameTextView = rowView.findViewById(R.id.usenametw);


        Utente u = getItem(position);


        usernameTextView.setText(u.getUsername());


        return rowView;

    }
}
