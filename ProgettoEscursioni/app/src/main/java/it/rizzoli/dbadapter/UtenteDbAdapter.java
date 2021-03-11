package it.rizzoli.dbadapter;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

import it.rizzoli.database.UtenteDatabaseHelper;
import it.rizzoli.model.Utente;

public class UtenteDbAdapter {
    public static final String USERS_TABLE_KEY = "Users"; //Utente

    public static final String UTENTE_ID_KEY = "_id";
    public static final String UTENTE_NAME_KEY = "name";
    public static final String UTENTE_SURNAME_KEY = "surname";
    public static final String UTENTE_AGE_KEY = "age";
    public static final String UTENTE_USERNAME_KEY = "username";
    public static final String UTENTE_PASSWORD_KEY = "password";

    private Context ctx;
    private SQLiteDatabase database;
    private UtenteDatabaseHelper dbHelper;

    public UtenteDbAdapter(Context context) {
        ctx = context;
    }

    private ContentValues createDictionary(Utente user) {
        ContentValues values = new ContentValues();
        values.put(UTENTE_NAME_KEY, user.getNome());
        values.put(UTENTE_SURNAME_KEY, user.getCognome());
        values.put(UTENTE_USERNAME_KEY, user.getUsername());
        values.put(UTENTE_PASSWORD_KEY, user.getPassword());

        return values;
    }

    //apriamo la connessione al db per l'Utente
    //metodo da chiamare subito dopo un Dbadapter
    public UtenteDbAdapter open() throws SQLException {
        dbHelper = new UtenteDatabaseHelper(ctx);
        database = dbHelper.getWritableDatabase();
        return this;
    }

    //per chiudere la connessione una volta finito
    public void close() {
        dbHelper.close();
    }

    //CRUD = Create/Insert into, R/select..., U/update, D/delete
    //metodi per insert, update, ....
    public long insertUser(Utente user) {
        ContentValues values = createDictionary(user);
        return database.insertOrThrow(USERS_TABLE_KEY, null, values);
    }

    //query per selezionare i dati di tutti gli utenti del db
    public Cursor fetchAllUsers() {
        return database.query(USERS_TABLE_KEY, new String[] { UTENTE_ID_KEY, UTENTE_NAME_KEY, UTENTE_SURNAME_KEY, UTENTE_AGE_KEY, UTENTE_USERNAME_KEY, UTENTE_PASSWORD_KEY}, null, null, null, null, null);
    }

    //select * from Users where username = '<argomento metodo>' AND password = '<argomento metodo>'
    public Cursor fetchUserBy(String username, String password) {
        Cursor mCursor = database.query(true, USERS_TABLE_KEY, new String[] { UTENTE_ID_KEY, UTENTE_NAME_KEY, UTENTE_SURNAME_KEY, UTENTE_AGE_KEY, UTENTE_USERNAME_KEY, UTENTE_PASSWORD_KEY},
                UTENTE_USERNAME_KEY + " = '"+ username + "' AND " + UTENTE_PASSWORD_KEY + " = '"+ password + "'", null, null, null, null, null);

        return mCursor;
    }

    public boolean updateUser(Utente u, int id) {
        ContentValues updateValues = createDictionary(u);
        return database.update(USERS_TABLE_KEY, updateValues, UTENTE_ID_KEY + "=" + id, null) > 0;
    }
}


