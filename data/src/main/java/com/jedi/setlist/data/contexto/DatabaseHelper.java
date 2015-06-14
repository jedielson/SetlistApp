package com.jedi.setlist.data.contexto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.jedi.setlist.data.entityconfig.BandaConfiguration;

import java.sql.SQLException;

/**
 * Created by Jedi on 08-Jun-15.
 *
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {
    private static final String databaseName = "dbApplication.db";
    private static final int databaseVersion = 1;

    public DatabaseHelper(Context context) {
        super(context, databaseName, null, databaseVersion);
    }


    @Override
    public void onCreate(SQLiteDatabase sd, ConnectionSource cs) {
        try {
            TableUtils.createTable(cs, new BandaConfiguration());

        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onUpgrade(SQLiteDatabase sd, ConnectionSource cs, int oldVersion, int newVersion) {
        /*try {
            //TableUtils.dropTable(cs, Student.class, true);
            onCreate(sd, cs);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }*/
    }


    @Override
    public void close(){
        super.close();
    }
}