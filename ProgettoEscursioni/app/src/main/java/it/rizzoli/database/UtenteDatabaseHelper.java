package it.rizzoli.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import it.rizzoli.dbadapter.UtenteDbAdapter;


public class DatabaseHelper extends SQLiteOpenHelper {
    Context ctx = null; //l'activity dove il db opererà
    SQLiteDatabase db;

    public static final String DATABASE_NAME_KEY = "autenticazione.db";
    public static final int DATABASE_VER_KEY = 1;

    //creiamo la tabella vuota con i campi dell'Utente
    private static final String USER_TABLE_CREATE = "create table " + UtenteDbAdapter.USERS_TABLE_KEY + " ("+
            UtenteDbAdapter.UTENTE_ID_KEY+ " integer primary key autoincrement, " +
            UtenteDbAdapter.UTENTE_NAME_KEY + " String not null, " +
            UtenteDbAdapter.UTENTE_SURNAME_KEY + "  String not null, " +
            UtenteDbAdapter.UTENTE_USERNAME_KEY + " String not null, " +
            UtenteDbAdapter.UTENTE_PASSWORD_KEY + "  String not null, " +
            UtenteDbAdapter.UTENTE_AGE_KEY + " int);";
    //String creaUtente = "create table utente(_id integer primary key, nome, cognnome, username, password, eta)"

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME_KEY, null, DATABASE_VER_KEY);
        ctx = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(USER_TABLE_CREATE);
        //db.execSQL(creaScuola);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
        db.execSQL("DROP TABLE IF EXISTS " + UtenteDbAdapter.USERS_TABLE_KEY);
        onCreate(db);
    }
}