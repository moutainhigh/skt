package net.meyki.data.provider;

import java.util.List;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Abstract database helper, you can order it's inheritance instance 
 * to create, upgrade, open and close this database.
 * */
abstract class AbsDatabaseHelper {
	private static final String TAG = AbsDatabaseHelper.class.getSimpleName();
	private static final boolean DBG = true;
	
	/**
	 * Database instance.
	 * */
	protected SQLiteDatabase mDBInstance = null;
	
	/**
	 * Database helper instance.
	 * */
	private InterDBHelper mDBHelper = null;

	/**
	 * Return this database name.
	 * 
	 * @return String database name.
	 * */
	protected abstract String databaseName();
	
	/**
	 * Return this database version
	 * */
	protected abstract int databaseVersion();
	
	/**
	 * Return this database tables string.
	 * */
	protected abstract List<String> createTableList();

	/**
	 * Open database.
	 * 
	 * @param ct context.
	 * */
	public void open(Context ct) {
		if (DBG) Log.d(TAG, "open " + databaseName() + " database.");
		
		if (null == ct) {
			Log.e(TAG, "open() : the input params invalid!");
			return;
		}
		
		if (null == mDBHelper) {
			mDBHelper = new InterDBHelper(ct);
		}
		
		mDBInstance = mDBHelper.getWritableDatabase();
	}

	/**
	 * Close database.
	 * 
	 * @param ct context.
	 * */
	public void close() {
		if (DBG) Log.d(TAG, "close " + databaseName() + " database.");
		
		if (mDBHelper != null) {
			mDBHelper.close();
		}
	}
	
	/**
	 * Internal database helper for create and update database tables.
	 * */
	private class InterDBHelper extends SQLiteOpenHelper {
		private final String TAG_INTER = InterDBHelper.class.getSimpleName();
		
		public InterDBHelper(Context ct) {
			super(ct, databaseName(), null, databaseVersion());
			if (DBG) Log.d(TAG_INTER, "create internal database help instance.");
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			if (DBG) Log.d(TAG_INTER, "start to creat database tables.");
			
			if (null == db) {
				Log.e(TAG_INTER, "onCreate() : the input params invalid!");
			} else {
				createTables(createTableList(), db);
			}
			
			if (DBG) Log.d(TAG_INTER, "end creat database tables.");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			if (DBG) Log.d(TAG_INTER, "upgrade database tables.");
			// TODO you must upgrade old database to current database.
			
		}

		/**
		 * Create tables from string list.
		 * 
		 * @param tables tables string array.
		 * @param db database instance.
		 * */
		private void createTables(List<String> tables, SQLiteDatabase db) {
			if (null == tables || tables.isEmpty() || null == db) {
				Log.e(TAG_INTER, "createTables() : the input params invalid!");
				return;
			}
			
			try {
				db.beginTransaction();
				for (String t : tables) {
					if (DBG) Log.d(TAG_INTER, "excute sql:" + t);
					db.execSQL(t);
				}
				db.setTransactionSuccessful();
			} catch (Exception e) {
				if (DBG) Log.d(TAG_INTER, "excute sql error:" + e.toString());
				e.printStackTrace();
			} finally {
				db.endTransaction();
			}
		}
	}
}