package nydev.com.helloworld;

import java.util.Collections;


import java.util.ArrayList;
import java.util.Collections;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;


/**
 * <tt>Database</tt> represents the persistent storage layer for the stall
 * manager application and provides methods for performing CRUD operations.
 */
public class Database extends SQLiteOpenHelper
{

    public Database() {

        super(null,
                DATABASE_NAME,
                null,
                DATABASE_VERSION);

    }

    public void onCreate(SQLiteDatabase database) {
        //TODO
    }

    public void onUpgrade(SQLiteDatabase database, int a, int b) {

    }

    /**
     * Transactions.
     */
    private static ArrayList <Transaction> transactionList;

    /**
     * Database.
     */
    private static final Database singleton = new Database();

    /**
     * Database name.
     */
    private static final String DATABASE_NAME = "helloWorld.db";

    /**
     * Database version.
     */
    private static final int DATABASE_VERSION = 1;

    /**
     * Table name for transactions.
     */
    private static final String TRANSACTION_DATABASE_TABLE = "transactionTable";

    /**
     * Column name for transaction ID.
     */
    private static final String TRANSACTION_ID = "id";

    /**
     * Column name for transaction price
     */
    private static final String TRANSACTION_PRICE = "price";

    /**
     * Column name for rewards that resulted from a transaction.
     */
    private static final String TRANSACTION_TICKER = "ticker";

    private static final String TRANSACTION_SHARES = "shares";

    /**
     * SQL command to create the transactions table.
     */
    private static final String CREATE_TRANSACTION_TABLE_COMMAND =
            "CREATE TABLE " + TRANSACTION_DATABASE_TABLE + " ( " +
                    TRANSACTION_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    TRANSACTION_TICKER + " text, " +
                    TRANSACTION_PRICE + " integer, " +
                    TRANSACTION_SHARES + " integer, " + " ) ";

    /**
     * SQL command to delete the transactions table.
     */
    private static final String DROP_TRANSACTION_TABLE_COMMAND =
            "DROP TABLE IF EXISTS " + TRANSACTION_DATABASE_TABLE;


}
