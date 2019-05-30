package net.meyki.data.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.text.TextUtils;

import net.meyki.data.client.domain.ChatItem;
import net.meyki.skt.utils.Log;
import net.meyki.skt.utils.SerializeUtil;
import net.meyki.skt.utils.SerializedUtils;
import net.meyki.data.client.domain.PointChatItem;
import net.meyki.data.share.domain.ChatGroupItem;
import net.meyki.data.share.domain.SystemInfoItem;

import java.util.ArrayList;
import java.util.List;


final class DatabaseOperator extends AbsDatabaseHelper {
    private static final String TAG = DatabaseOperator.class.getSimpleName();
    private static final boolean DBG = true;
    // 数据最长有效时间
    public static final long MAX_VALIDATE_TIME = 7 * 24 * 60 * 60 * 1000;
    // public static final long MAX_VALIDATE_TIME =30 * 1000;
    static final String DATABASE_NAME = "meykiclient_d.db";
    static final int DATABASE_VERSION = 1;

    // 数据库中的表信息

    static final class Tables {
        public static String TABLE_MAP_SET = "settings";
        public static class MAP_SET implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_MAP_SET + " (" + MAP_SET.ID
                    + " INTEGER NOT NULL PRIMARY KEY, " + MAP_SET.KEY
                    + " TEXT NOT NULL," + MAP_SET.VALUE + " TEXT NOT NULL);";
            public static final String ID = "id";
            public static final String KEY = "key";
            public static final String VALUE = "value";
        }

        /* SingleData table. */
        public static String TABLE_SINGLE_DATA = "single_data_table";

        public static class CACB_SINGLE_DATA implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_SINGLE_DATA + " (" + CACB_SINGLE_DATA.ID
                    + " INTEGER NOT NULL PRIMARY KEY, " + CACB_SINGLE_DATA.KEY
                    + " TEXT NOT NULL," + CACB_SINGLE_DATA.DATA
                    + " BLOB NOT NULL," + CACB_SINGLE_DATA.TIME
                    + " TEXT NOT NULL," + CACB_SINGLE_DATA.VERSION + " TEXT);";
            public static final String ID = "id";
            public static final String KEY = "single_key";
            public static final String DATA = "single_data";
            public static final String TIME = "single_time";
            public static final String VERSION = "single_version";

        }

        public static String TABLE_SINGLE_CONFIG = "single_config_table";

        public static class CACB_SINGLE_CONFIG implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_SINGLE_CONFIG + " (" + CACB_SINGLE_CONFIG.ID
                    + " INTEGER NOT NULL PRIMARY KEY, "
                    + CACB_SINGLE_CONFIG.KEY + " TEXT NOT NULL,"
                    + CACB_SINGLE_CONFIG.DATA + " BLOB NOT NULL,"
                    + CACB_SINGLE_CONFIG.TIME + " TEXT NOT NULL,"
                    + CACB_SINGLE_CONFIG.VERSION + " TEXT);";
            public static final String ID = "id";
            public static final String KEY = "single_key";
            public static final String DATA = "single_data";
            public static final String TIME = "single_time";
            public static final String VERSION = "single_version";

        }

        /* Cache table. */
        public static String TABLE_GET_CACHE = "data_cache_chat";

        public static class GET_CACHE_TABLE implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_GET_CACHE + " (" + GET_CACHE_TABLE.CACHE_ID
                    + " INTEGER NOT NULL PRIMARY KEY, "
                    + GET_CACHE_TABLE.CACHE_TIME + " INTEGER NOT NULL,"
                    + GET_CACHE_TABLE.CACHE_DATA + " BLOB NOT NULL,"
                    + GET_CACHE_TABLE.CACHE_KEY + " TEXT NOT NULL);";
            public static final String CACHE_ID = "cache_id";
            public static final String CACHE_TIME = "cache_time";
            public static final String CACHE_DATA = "cache_data";
            public static final String CACHE_KEY = "cache_key";

        }

        /* MutipleData table. */
        public static String TABLE_MUTIPLE_DATA = "mutiple_data_table";
        public static class CACB_MUTIPLE_DATA implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_MUTIPLE_DATA + " (" + CACB_MUTIPLE_DATA.ID
                    + " INTEGER NOT NULL PRIMARY KEY, " + CACB_MUTIPLE_DATA.KEY
                    + " TEXT NOT NULL," + CACB_MUTIPLE_DATA.CATE
                    + " TEXT NOT NULL," + CACB_MUTIPLE_DATA.PAGE
                    + " INTEGER NOT NULL," + CACB_MUTIPLE_DATA.DATA
                    + " BLOB NOT NULL," + CACB_MUTIPLE_DATA.TIME
                    + " TEXT NOT NULL," + CACB_MUTIPLE_DATA.VERSION + " TEXT);";
            public static final String ID = "id";
            public static final String KEY = "mutiple_key";
            public static final String DATA = "mutiple_data";
            public static final String PAGE = "mutiple_page";
            public static final String CATE = "mutiple_cate";
            public static final String TIME = "mutiple_time";
            public static final String VERSION = "mutiple_version";
        }


        /* chat history table. 点对点聊天记录表 */
        public static String TABLE_CHAT_HISTORY = "chat_data_table";
        public static class CACB_CHAT_HISTORY_DATA implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_CHAT_HISTORY + " (" + CACB_CHAT_HISTORY_DATA.ID
                    + " INTEGER NOT NULL PRIMARY KEY, " + CACB_CHAT_HISTORY_DATA.KEY
                    + " TEXT NOT NULL,"+ CACB_CHAT_HISTORY_DATA.TIME
                    + " TEXT NOT NULL," + CACB_CHAT_HISTORY_DATA.DATA
                    + " TEXT NOT NULL," + CACB_CHAT_HISTORY_DATA.TAG
                    + " TEXT NOT NULL," + CACB_CHAT_HISTORY_DATA.IS_LAST
                    + " INTEGER NOT NULL," + CACB_CHAT_HISTORY_DATA.VERSION + " TEXT);";
            //id标识
            public static final String ID = "id";
            //key值得格式为当前的userId+fromid/toid
            public static final String KEY = "chat_key";
            //聊天发送的消息对象，对应列表中的每一个item
            public static final String DATA = "chat_data";
            //当前系统时间
            public static final String TIME = "chat_time";
            //聊天时发送的标识 0：表示易商 1：表示易家
            public static final String TAG = "chat_tag";
            //标识是否为最后一条消息，0：不是 1：是
            public static final String IS_LAST = "chat_is_last";
            //当前的表版本
            public static final String VERSION = "chat_version";
        }

        /* chat history table. 群聊消息聊天记录表 */
        public static String TABLE_COMMUNITY_CHAT_DATA = "chat_community_data_table";
        public static class CACB_COMMUNITY_CHAT_DATA implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_COMMUNITY_CHAT_DATA + " (" + CACB_CHAT_HISTORY_DATA.ID
                    + " INTEGER NOT NULL PRIMARY KEY, " + CACB_CHAT_HISTORY_DATA.KEY
                    + " TEXT NOT NULL," + CACB_COMMUNITY_CHAT_DATA.TIME
                    + " TEXT NOT NULL," + CACB_COMMUNITY_CHAT_DATA.DATA
                    + " BLOB NOT NULL," + CACB_COMMUNITY_CHAT_DATA.COMMUNITY_ID
                    + " TEXT NOT NULL," + CACB_COMMUNITY_CHAT_DATA.VERSION + " TEXT);";
            //id标识
            public static final String ID = "id";
            //key值得格式为当前的userId+群id，例如：testa6dbc3ccfe56458da6cb98a9d0798c4a_yj-13609113306
            public static final String KEY = "community_chat_key";
            //聊天发送的消息对象，对应列表中的每一个item
            public static final String DATA = "community_chat_data";
            //当前系统时间
            public static final String TIME = "community_chat_time";
            //发送人的login_name
            public static final String COMMUNITY_ID = "community_chat_id";
            //当前的表版本
            public static final String VERSION = "community_chat_version";
        }


        /* chat history table. 系统消息记录表 */
        public static String TABLE_SYSTEM_CHAT = "system_chat_data_table";
        public static class CACB_TABLE_SYSTEM_CHAT implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE "
                    + TABLE_SYSTEM_CHAT + " (" + CACB_TABLE_SYSTEM_CHAT.ID
                    + " INTEGER PRIMARY KEY," + CACB_TABLE_SYSTEM_CHAT.KEY
                    + " TEXT NOT NULL," + CACB_TABLE_SYSTEM_CHAT.FROM
                    + " TEXT NOT NULL," + CACB_TABLE_SYSTEM_CHAT.DATA
                    + " BLOB NOT NULL," + CACB_TABLE_SYSTEM_CHAT.TIME
                    + " INTEGER NOT NULL, " + CACB_TABLE_SYSTEM_CHAT.VERSION + " TEXT);";
            public static final String ID = "id";
            public static final String KEY = "system_chat_key";
            public static final String FROM = "system_chat_from";
            public static final String DATA = "system_chat_data";
            public static final String TIME = "system_chat_time";
            public static final String VERSION = "system_chat_version";
        }

        /*保存订单消息*/
        public static String TABLE_ORDER_SYSTEM_DATA = "os_hint_data_table";
        public static class CACB_TABLE_ORDER_SYSTEM_DATA implements BaseColumns {
            public static final String CREATE_TABLE = "CREATE TABLE " + TABLE_ORDER_SYSTEM_DATA + "(" + CACB_TABLE_ORDER_SYSTEM_DATA.ID + "INTEGER NOT NULL PRIMARY KEY,"
                    +CACB_TABLE_ORDER_SYSTEM_DATA.KEY+"TEXT NOT NULL,"+ CACB_TABLE_ORDER_SYSTEM_DATA.VALUE + "TEXT NOT NULL,"
                    + CACB_TABLE_ORDER_SYSTEM_DATA.TIME + "TEXT NOT NULL,"+CACB_TABLE_ORDER_SYSTEM_DATA.SYSOTEM_TYPE+"TEXT NOT NULL"+CACB_TABLE_ORDER_SYSTEM_DATA.VERSION + "TEXT);";
            public static final String ID = "id";
            public static final String KEY = "order_sysotem_key";
            public static final String VALUE = "order_sysotem_value";
            public static final String TIME = "order_sysotem_time";
            public static final String SYSOTEM_TYPE = "order_sysotem_type";
            public static final String VERSION = "order_sysotem_version";
        }
    }

    @Override
    // 创建数据库中的所有表
    protected final List<String> createTableList() {
        List<String> tables = new ArrayList<String>();
        tables.add(Tables.CACB_SINGLE_DATA.CREATE_TABLE);
        tables.add(Tables.CACB_SINGLE_CONFIG.CREATE_TABLE);
        tables.add(Tables.CACB_MUTIPLE_DATA.CREATE_TABLE);
        tables.add(Tables.GET_CACHE_TABLE.CREATE_TABLE);
        tables.add(Tables.MAP_SET.CREATE_TABLE);
        tables.add(Tables.CACB_TABLE_SYSTEM_CHAT.CREATE_TABLE);
        tables.add(Tables.CACB_COMMUNITY_CHAT_DATA.CREATE_TABLE);
        tables.add(Tables.CACB_CHAT_HISTORY_DATA.CREATE_TABLE);
        if (DBG)
            Log.d(TAG, "TABLES : " + tables.toString());
        return tables;
    }

    @Override
    // 获取数据库名称
    protected final String databaseName() {
        return DATABASE_NAME;
    }

    @Override
    // 获取数据库版本号
    protected final int databaseVersion() {
        return DATABASE_VERSION;
    }

    // 共通逻辑处理

    /*保存订单消息*/
    public boolean saveTableSystem(String key,String value){
        String where = Tables.CACB_TABLE_ORDER_SYSTEM_DATA.KEY + "=\"" + key +"\"";
        Cursor cursor = null;

        try {
            cursor = mDBInstance.query(Tables.TABLE_ORDER_SYSTEM_DATA, null, where,
                    null, null, null, null);
            ContentValues table = new ContentValues();
            if(cursor !=null && cursor.getCount()>0){
                while (cursor.moveToFirst()) {
                    table.put(Tables.CACB_SINGLE_CONFIG.KEY, key);
                    table.put(Tables.CACB_SINGLE_CONFIG.DATA,
                            SerializeUtil.serializeObject(value));
                    table.put(Tables.CACB_SINGLE_CONFIG.TIME,
                            System.currentTimeMillis() + "");
                    table.put(Tables.CACB_SINGLE_CONFIG.VERSION, "");
                    break;
                }
                mDBInstance.update(Tables.TABLE_ORDER_SYSTEM_DATA, table, where,
                        null);
                return  true;
            }else {
                // 插入
                table.put(Tables.CACB_MUTIPLE_DATA.KEY, key);
                table.put(Tables.CACB_MUTIPLE_DATA.DATA,
                        SerializeUtil.serializeObject(value));
                table.put(Tables.CACB_MUTIPLE_DATA.TIME,
                        System.currentTimeMillis() + "");
                table.put(Tables.CACB_MUTIPLE_DATA.VERSION, "");
                mDBInstance.insert(Tables.TABLE_ORDER_SYSTEM_DATA, null, table);

                return  true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  false;
    }

    /*修改订单状态信息*/
    public boolean setTableSystemType(String orderId){


        return true;
    }

    /**
     * 获取单一数据对象
     * @param key      键值
     * @param dataTime 日期时间
     * @return Object可反序列化的对象，需要根据instanceof 判定后，强制类型转化成相应的对象
     */
    public Object getSingleData(String key, Long dataTime) {
        String where = Tables.CACB_SINGLE_DATA.KEY + "=\'" + key + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_DATA, null, where,
                    null, null, null, null);
            if (null != cursor) {
                while (cursor.moveToFirst()) {
                    try {
                        Long createTime = Long
                                .parseLong(cursor.getString(cursor
                                        .getColumnIndex(Tables.CACB_SINGLE_DATA.TIME)));
                        if ((System.currentTimeMillis() - createTime) > MAX_VALIDATE_TIME) {
                            // 数据已经失效，删除删除已经存在的信息
                            try {
                                mDBInstance.delete(Tables.TABLE_SINGLE_DATA,
                                        where, null);
                                Log.i("tiger", "deleted getSingleData key="
                                        + key);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    byte[] data = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_SINGLE_DATA.DATA));
                    return SerializeUtil.deserializeObject(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object getSingleData(String key, String verison) {
        String where = Tables.CACB_SINGLE_DATA.KEY + "=\'" + key + "\' AND "
                + Tables.CACB_SINGLE_DATA.VERSION + "=\'" + verison + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_DATA, null, where,
                    null, null, null, null);
            if (null != cursor) {
                while (cursor.moveToFirst()) {
                    try {
                        Long createTime = Long
                                .parseLong(cursor.getString(cursor
                                        .getColumnIndex(Tables.CACB_SINGLE_DATA.TIME)));
                        if ((System.currentTimeMillis() - createTime) > MAX_VALIDATE_TIME) {
                            // 数据已经失效，删除删除已经存在的信息
                            try {
                                mDBInstance.delete(Tables.TABLE_SINGLE_DATA,
                                        where, null);
                                Log.i("tiger", "deleted getSingleData key="
                                        + key);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    byte[] data = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_SINGLE_DATA.DATA));
                    return SerializeUtil.deserializeObject(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 获取配置信息
     */
    public Object getSingleConfigData(String key) {
        String where = Tables.CACB_SINGLE_CONFIG.KEY + "=\'" + key + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_CONFIG, null, where,
                    null, null, null, null);
            if (null != cursor) {
                while (cursor.moveToFirst()) {
                    try {
                        Long createTime = Long
                                .parseLong(cursor.getString(cursor
                                        .getColumnIndex(Tables.CACB_SINGLE_CONFIG.TIME)));
                        if ((System.currentTimeMillis() - createTime) > MAX_VALIDATE_TIME) {
                            // 数据已经失效，删除删除已经存在的信息
                            try {
                                mDBInstance.delete(Tables.TABLE_SINGLE_CONFIG,
                                        where, null);
                                Log.i("tiger", "deleted getSingleData key="
                                        + key);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    byte[] data = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_SINGLE_CONFIG.DATA));
                    return SerializeUtil.deserializeObject(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 获取分页数据对象
     *
     * @param key      键值
     * @param page     分页信息
     * @param cate
     * @param dataTime 日期时间
     * @return Object可反序列化的对象，需要根据instanceof 判定后，强制类型转化成相应的对象
     */
    public Object getMutipleData(String key, int page, String cate,
                                 Long dataTime) {
        String where = Tables.CACB_MUTIPLE_DATA.KEY + "=\'" + key + "\' AND "
                + Tables.CACB_MUTIPLE_DATA.PAGE + "=" + page;
        if (!TextUtils.isEmpty(cate)) {
            where += " AND " + Tables.CACB_MUTIPLE_DATA.CATE + "=\'" + cate
                    + "\' ";
        }
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_MUTIPLE_DATA, null, where,
                    null, null, null, null);
            if (null != cursor) {
                while (cursor.moveToFirst()) {
                    try {
                        Long createTime = Long
                                .parseLong(cursor.getString(cursor
                                        .getColumnIndex(Tables.CACB_MUTIPLE_DATA.TIME)));
                        if ((System.currentTimeMillis() - createTime) > MAX_VALIDATE_TIME) {
                            // 数据已经失效，删除删除已经存在的信息
                            try {
                                mDBInstance.delete(Tables.TABLE_MUTIPLE_DATA,
                                        where, null);
                                Log.i("tiger", "deleted getMutipleData key="
                                        + key);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            return null;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    byte[] data = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_MUTIPLE_DATA.DATA));
                    return SerializeUtil.deserializeObject(data);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    /**
     * 设置单一数据对象
     *
     * @param key  键值
     * @param data 可序列化的对象
     * @return boolean TRUE:设置成功,FALSE:设置失败
     */
    public boolean setSingleData(String key, Object data) {
        boolean ret = false;
        String where = Tables.CACB_SINGLE_DATA.KEY + "=\'" + key + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_DATA, null, where,
                    null, null, null, null);
            ContentValues values = new ContentValues();
            if (null != cursor && cursor.getCount() > 0) {
                while (cursor.moveToFirst()) {
                    values.put(Tables.CACB_SINGLE_DATA.KEY, key);
                    values.put(Tables.CACB_SINGLE_DATA.DATA,
                            SerializeUtil.serializeObject(data));
                    values.put(Tables.CACB_SINGLE_DATA.TIME,
                            System.currentTimeMillis() + "");
                    values.put(Tables.CACB_SINGLE_DATA.VERSION, "");
                    break;
                }
                // 更新
                mDBInstance.update(Tables.TABLE_SINGLE_DATA, values,
                        Tables.CACB_SINGLE_DATA.KEY + " = ?",
                        new String[]{key});
                ret = true;
            } else {
                // 插入
                values.put(Tables.CACB_SINGLE_DATA.KEY, key);
                values.put(Tables.CACB_SINGLE_DATA.DATA,
                        SerializeUtil.serializeObject(data));
                values.put(Tables.CACB_SINGLE_DATA.TIME,
                        System.currentTimeMillis() + "");
                values.put(Tables.CACB_SINGLE_DATA.VERSION, "");
                mDBInstance.insert(Tables.TABLE_SINGLE_DATA, null, values);
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;

    }

    /**
     * 删除单一数据对象
     */
    public void deleteSingleData(String key, String verison) {
        String where = Tables.CACB_SINGLE_DATA.KEY + "=\'" + key + "\' AND "
                + Tables.CACB_SINGLE_DATA.VERSION + "=\'" + verison + "\'";
        try {
            mDBInstance.delete(Tables.TABLE_SINGLE_DATA,
                    where, null);
            Log.i("tiger", "deleted getSingleData key="
                    + key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * 保存配置信息
     */
    public boolean setSingleConfigData(String key, Object data) {
        boolean ret = false;
        String where = Tables.CACB_SINGLE_CONFIG.KEY + "=\'" + key + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_CONFIG, null, where,
                    null, null, null, null);
            ContentValues values = new ContentValues();
            if (null != cursor && cursor.getCount() > 0) {
                while (cursor.moveToFirst()) {
                    values.put(Tables.CACB_SINGLE_CONFIG.KEY, key);
                    values.put(Tables.CACB_SINGLE_CONFIG.DATA,
                            SerializeUtil.serializeObject(data));
                    values.put(Tables.CACB_SINGLE_CONFIG.TIME,
                            System.currentTimeMillis() + "");
                    values.put(Tables.CACB_SINGLE_CONFIG.VERSION, "");
                    break;
                }
                // 更新
                mDBInstance.update(Tables.TABLE_SINGLE_CONFIG, values,
                        Tables.CACB_SINGLE_CONFIG.KEY + " = ?",
                        new String[]{key});
                ret = true;
            } else {
                // 插入
                values.put(Tables.CACB_SINGLE_CONFIG.KEY, key);
                values.put(Tables.CACB_SINGLE_CONFIG.DATA,
                        SerializeUtil.serializeObject(data));
                values.put(Tables.CACB_SINGLE_CONFIG.TIME,
                        System.currentTimeMillis() + "");
                values.put(Tables.CACB_SINGLE_CONFIG.VERSION, "");
                mDBInstance.insert(Tables.TABLE_SINGLE_CONFIG, null, values);
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;

    }

    public boolean setSingleData(String key, Object data, String version) {
        boolean ret = false;
        String where = Tables.CACB_SINGLE_DATA.KEY + "=\'" + key + "\'";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SINGLE_DATA, null, where,
                    null, null, null, null);
            ContentValues values = new ContentValues();
            if (null != cursor && cursor.getCount() > 0) {
                while (cursor.moveToFirst()) {
                    values.put(Tables.CACB_SINGLE_DATA.KEY, key);
                    values.put(Tables.CACB_SINGLE_DATA.DATA,
                            SerializeUtil.serializeObject(data));
                    values.put(Tables.CACB_SINGLE_DATA.TIME,
                            System.currentTimeMillis() + "");
                    values.put(Tables.CACB_SINGLE_DATA.VERSION, version);
                    break;
                }
                // 更新
                mDBInstance.update(Tables.TABLE_SINGLE_DATA, values,
                        Tables.CACB_SINGLE_DATA.KEY + " = ?",
                        new String[]{key});
                ret = true;
            } else {
                // 插入
                values.put(Tables.CACB_SINGLE_DATA.KEY, key);
                values.put(Tables.CACB_SINGLE_DATA.DATA,
                        SerializeUtil.serializeObject(data));
                values.put(Tables.CACB_SINGLE_DATA.TIME,
                        System.currentTimeMillis() + "");
                values.put(Tables.CACB_SINGLE_DATA.VERSION, version);
                mDBInstance.insert(Tables.TABLE_SINGLE_DATA, null, values);
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;

    }


    /**
     * 设置分页数据对象
     * @param key  键值
     * @param page 分页信息
     * @param data 可序列化的对象
     * @return boolean TRUE:设置成功,FALSE:设置失败
     */
    public boolean setMutipleData(String key, int page, String cate, Object data) {
        boolean ret = false;
        String where = Tables.CACB_MUTIPLE_DATA.KEY + "=\'" + key + "\' AND "
                + Tables.CACB_MUTIPLE_DATA.PAGE + "=" + page;
        if (!TextUtils.isEmpty(cate)) {
            where += " AND " + Tables.CACB_MUTIPLE_DATA.CATE + "=\'" + cate
                    + "\' ";
        }
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_MUTIPLE_DATA, null, where,
                    null, null, null, null);
            ContentValues values = new ContentValues();
            if (null != cursor && cursor.getCount() > 0) {
                while (cursor.moveToFirst()) {
                    values.put(Tables.CACB_MUTIPLE_DATA.KEY, key);
                    values.put(Tables.CACB_MUTIPLE_DATA.PAGE, page);
                    values.put(Tables.CACB_MUTIPLE_DATA.CATE, cate);
                    values.put(Tables.CACB_MUTIPLE_DATA.DATA,
                            SerializeUtil.serializeObject(data));
                    values.put(Tables.CACB_MUTIPLE_DATA.TIME,
                            System.currentTimeMillis() + "");
                    values.put(Tables.CACB_MUTIPLE_DATA.VERSION, "");
                    break;
                }
                // 更新
                mDBInstance.update(Tables.TABLE_MUTIPLE_DATA, values, where,
                        null);
                ret = true;
            } else {
                // 插入
                values.put(Tables.CACB_MUTIPLE_DATA.KEY, key);
                values.put(Tables.CACB_MUTIPLE_DATA.DATA,
                        SerializeUtil.serializeObject(data));
                values.put(Tables.CACB_MUTIPLE_DATA.PAGE, page);
                if (!TextUtils.isEmpty(cate)) {
                    values.put(Tables.CACB_MUTIPLE_DATA.CATE, cate);
                }
                values.put(Tables.CACB_MUTIPLE_DATA.TIME,
                        System.currentTimeMillis() + "");
                values.put(Tables.CACB_MUTIPLE_DATA.VERSION, "");
                mDBInstance.insert(Tables.TABLE_MUTIPLE_DATA, null, values);
                ret = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret;

    }

    /**
     * 保存设置
     *
     * @param key   键
     * @param value 值
     * @return long 插入的行ID
     */
    protected long saveSettings(String key, String value) {
        // TODO Auto-generated method stub
        String where = Tables.MAP_SET.KEY + "= \"" + key + "\"";

        Cursor cursor = mDBInstance.query(Tables.TABLE_MAP_SET, null, where,
                null, null, null, null);
        if (null != cursor && cursor.getCount() > 0) {
            cursor.close();
            ContentValues values = new ContentValues();
            values.put(Tables.MAP_SET.VALUE, value);
            String whereClause = Tables.MAP_SET.KEY + "= \"" + key + "\"";
            Log.i(TAG, "setCurrentType update " + whereClause);
            // update
            int ret = mDBInstance.update(Tables.TABLE_MAP_SET, values,
                    whereClause, null);
            if (ret > 0) {
                Log.i(TAG, "setValue update " + value + " is ok");
            } else {
                Log.i(TAG, "setValue update " + value + " is ng");
            }
        } else {
            // insert
            ContentValues values = new ContentValues();
            values.put(Tables.MAP_SET.KEY, key);
            values.put(Tables.MAP_SET.VALUE, value);
            // update
            long ret = mDBInstance.insert(Tables.TABLE_MAP_SET, null, values);
            if (ret > 0) {
                Log.i(TAG, "setValue insert " + value + " is ok");
            } else {
                Log.i(TAG, "setValue insert " + value + " is ng");
            }
        }
        return -1;
    }

    /**
     * 取得设置信息
     *
     * @param key 键
     * @return String 值
     */
    public String getSettingsValue(String key) {
        String value = "";
        String where = Tables.MAP_SET.KEY + "= \"" + key + "\"";
        Cursor cursor = mDBInstance.query(Tables.TABLE_MAP_SET, null, where,
                null, null, null, null);
        if (null != cursor && cursor.getCount() > 0) {
            cursor.moveToFirst();
            try {
                value = cursor.getString(cursor
                        .getColumnIndex(Tables.MAP_SET.VALUE));
            } catch (Exception e) {
                Log.i(TAG, e.toString());
            }
            cursor.close();
        }
        return value;
    }

    /**
     * 清除数据缓存
     *
     * @return boolean 处理成功
     */
    protected boolean ClearCacheData() {

        try {
            int retMutiple = mDBInstance.delete(Tables.TABLE_MUTIPLE_DATA,
                    null, null);
            int retSingle = mDBInstance.delete(Tables.TABLE_SINGLE_DATA, null,
                    null);
            if ((retMutiple + retSingle) > 0) {
                Log.i("tiger", "ClearCacheData=" + (retMutiple + retSingle));
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    protected List<ChatItem> getChatItem(String fromUser, int id, int pageMax) {
        String where = "";
        if (id == 0) {
            where = Tables.GET_CACHE_TABLE.CACHE_ID + ">" + id + " AND "
                    + Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromUser
                    + "\"";
        } else {
            where = Tables.GET_CACHE_TABLE.CACHE_ID + "<" + id + " AND "
                    + Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromUser
                    + "\"";
        }
        String orderby = Tables.GET_CACHE_TABLE.CACHE_ID + " DESC" + " Limit "
                + pageMax;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                List<ChatItem> ci = new ArrayList<ChatItem>();
                int len = cursor.getCount();
                int index = len;
                ChatItem[] temp = new ChatItem[len];
                while (cursor.moveToNext()) {
                    // ChatItem citem = new ChatItem();
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_ID));
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            temp[--index] = obj;
                        }
                    }
                }
                for (int i = 0; i < len; i++) {
                    if (temp[i] != null) {
                        ci.add(temp[i]);
                    }
                }
                return ci;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }


    protected ChatItem getChatItem(String fromUser) {
        String where = "";
        where = Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromUser + "\"";

        String orderby = Tables.GET_CACHE_TABLE.CACHE_TIME + " DESC"
                + " Limit " + 1;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_ID));
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            return obj;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    protected List<SystemInfoItem> getSystemInfoItem(String key) {
        String where = Tables.CACB_TABLE_SYSTEM_CHAT.KEY + "= \"" + key + "\"";
        String orderby = Tables.CACB_TABLE_SYSTEM_CHAT.ID + " DESC";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_SYSTEM_CHAT, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                List<SystemInfoItem> ci = new ArrayList<SystemInfoItem>();
                int len = cursor.getCount();
                int index = len;
                SystemInfoItem[] temp = new SystemInfoItem[len];
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_TABLE_SYSTEM_CHAT.DATA));
                    long id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.CACB_MUTIPLE_DATA.ID));
                    if (null != iostream) {
                        SystemInfoItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            temp[--index] = obj;
                        }
                    }
                }
                for (int i = 0; i < len; i++) {
                    if (temp[i] != null) {
                        ci.add(temp[i]);
                    }
                }
                return ci;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    /**
     * 更新点对点消息
     **/
    protected long updateChatPointItem(String key, ChatItem item){
        if (null == item) {
            return -1;
        }

        String where = Tables.CACB_CHAT_HISTORY_DATA.KEY + "= \"" + key + "\""
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.ID + "=\"" + item.getId() + "\"";

        Cursor cursor = mDBInstance.query(Tables.TABLE_CHAT_HISTORY, null, where,
                null, null, null, null);

        if(cursor != null && cursor.getCount() > 0){
            while (cursor.moveToNext()) {
                //如果存在更新
                Log.i("CYW", "updateChatPointItem: ChatGroupItem 存在");
                ContentValues values = new ContentValues();
                values.put(Tables.CACB_CHAT_HISTORY_DATA.DATA, SerializedUtils.encodeObject(item));
                mDBInstance.update(Tables.TABLE_CHAT_HISTORY, values, where, null);
            }
            cursor.close();
        }

        return -1;
    }

    /**
     * 保存点对点聊天记录
     */
    protected long setPointChatItem(PointChatItem item) {
        String where = "";
        //查询最后一条消息数据,并且接收人是我自己
        where = Tables.CACB_CHAT_HISTORY_DATA.KEY + "=\"" + item.key + "\""
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.IS_LAST + "=\"" + "1" + "\"";
        ContentValues values = new ContentValues();
        values.put(Tables.CACB_CHAT_HISTORY_DATA.IS_LAST, "0");
        // 更新之前所有的消息最后一条数据is_last 为 0
        mDBInstance.update(Tables.TABLE_CHAT_HISTORY, values, where, null);

        values.clear();
        values.put(Tables.CACB_CHAT_HISTORY_DATA.TAG, item.tag);
        values.put(Tables.CACB_CHAT_HISTORY_DATA.IS_LAST, "1");
        values.put(Tables.CACB_CHAT_HISTORY_DATA.KEY, item.key);
        values.put(Tables.CACB_CHAT_HISTORY_DATA.DATA, SerializedUtils.encodeObject(item.chatitem));
        values.put(Tables.CACB_CHAT_HISTORY_DATA.TIME, System.currentTimeMillis());
        return mDBInstance.insert(Tables.TABLE_CHAT_HISTORY, null, values);
    }


    /**
     * 删除点对点的聊天记录
     * */
    protected boolean deletePointChatItem(String key){
        String where = Tables.CACB_CHAT_HISTORY_DATA.KEY + "=\"" + key + "\"";
        if(mDBInstance.delete(Tables.TABLE_CHAT_HISTORY,where,null)>0){
            return true;
        }

        return false;
    }


    /**
     * 获取点对点消息记录数据列表
     * @param key 查询的key值 信息接收人的登录名，自己的login_name
     * userId_loginname，如testa6dbc3ccfe56458da6cb98a9d0798c4a_yj-13609113306
     * @return List 聊天记录
     */
    protected List<ChatItem> getPointChat(String key, long id, int pageMax) {
        String where = "";
        if (id == 0) {
            where = Tables.CACB_CHAT_HISTORY_DATA.ID + ">" + id
                    + " and " + Tables.CACB_CHAT_HISTORY_DATA.KEY + "= \"" + key + "\"";
        } else {
            where = Tables.CACB_CHAT_HISTORY_DATA.ID + "<" + id
                    + " and " + Tables.CACB_CHAT_HISTORY_DATA.KEY + "= \"" + key + "\"";
        }
        String orderby = Tables.CACB_CHAT_HISTORY_DATA.ID + " DESC " +
                " Limit " + pageMax;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_CHAT_HISTORY, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                List<ChatItem> ci = new ArrayList<ChatItem>();
                int len = cursor.getCount();
                int index = len;
                ChatItem[] temp = new ChatItem[len];
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.DATA));
                    long id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.ID));
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            temp[--index] = obj;
                        }
                    }
                }
                for (int i = 0; i < len; i++) {
                    if (temp[i] != null) {
                        ci.add(temp[i]);
                    }
                }
                return ci;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    /**
     * 保存点对点未读聊天记录
     */
    public long setPointUnreadChatItem(PointChatItem datas) {
        if (null == datas) {
            return -1;
        }
        // 未读件数 +1
        String tmp = getSettingsValue(datas.key + "_unread");
        if (TextUtils.isEmpty(tmp)) {
            saveSettings(datas.key  + "_unread", "1");
        } else {
            saveSettings(datas.key + "_unread", "" + (Integer.parseInt(tmp) + 1));
        }


        String where = Tables.CACB_CHAT_HISTORY_DATA.KEY + "=\"" + datas.key + "\""
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.IS_LAST + "=\"" + "1" + "\"";
        ContentValues values = new ContentValues();
        values.put(Tables.CACB_CHAT_HISTORY_DATA.IS_LAST, "0");
        mDBInstance.update(Tables.TABLE_CHAT_HISTORY, values, where, null);

        Cursor cursor = null;
        try {
            values.clear();
            values.put(Tables.CACB_CHAT_HISTORY_DATA.TAG, datas.tag);
            values.put(Tables.CACB_CHAT_HISTORY_DATA.IS_LAST, "1");
            values.put(Tables.CACB_CHAT_HISTORY_DATA.KEY, datas.key);
            values.put(Tables.CACB_CHAT_HISTORY_DATA.DATA, SerializedUtils.encodeObject(datas.chatitem));
            values.put(Tables.CACB_CHAT_HISTORY_DATA.TIME, System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_CHAT_HISTORY, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return -1;
    }

    /**
     * 获取点对点消息记录中发给我自己的最后一条消息聊天记录，每一条消息都是
     */
    protected List<ChatItem> getLastPointChatItem(String key) {
        String where = Tables.CACB_CHAT_HISTORY_DATA.KEY +" LIKE?"
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.IS_LAST + " = 1"
                + " and (" + Tables.CACB_CHAT_HISTORY_DATA.TAG + " =0 "
                + " or " + Tables.CACB_CHAT_HISTORY_DATA.TAG + " =1)";
        //tag 1表示易家用户 0 表示易商用户
        String orderby = Tables.CACB_CHAT_HISTORY_DATA.ID + " DESC";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_CHAT_HISTORY, null, where,
                    new String[] {key + "%" }, null, null, orderby);
            List<ChatItem> list = new ArrayList<ChatItem>();
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.ID));
                    String key_value = cursor.getString(cursor.getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.KEY));
                    String nums = getSettingsValue(key_value+"_unread");
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            obj.setUnreadNum(nums);
                            list.add(obj);
                        }
                    }
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    /**
     * 获取点对点消息记录中发给我自己的最后一条消息聊天记录，每一条消息都是
     */
    protected List<ChatItem> getSPLastPointChatItem(String key) {
        String where = Tables.CACB_CHAT_HISTORY_DATA.KEY +" LIKE?"
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.IS_LAST + " = 1"
                + " and " + Tables.CACB_CHAT_HISTORY_DATA.TAG + " = 3 ";
        //tag 1表示易家用户 0 表示易商用户
        String orderby = Tables.CACB_CHAT_HISTORY_DATA.ID + " DESC";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_CHAT_HISTORY, null, where,
                    new String[] {key + "%" }, null, null, orderby);
            List<ChatItem> list = new ArrayList<ChatItem>();
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.ID));
                    String key_value = cursor.getString(cursor.getColumnIndex(Tables.CACB_CHAT_HISTORY_DATA.KEY));
                    String nums = getSettingsValue(key_value+"_unread");
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            obj.setUnreadNum(nums);
                            list.add(obj);
                        }
                    }
                }
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    protected ChatGroupItem getLastChatGroupItem(String communityId) {
        String where = "";
        where = Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + communityId + "\"";

        String orderby = Tables.GET_CACHE_TABLE.CACHE_TIME + " DESC"
                + " Limit " + 1;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_ID));
                    if (null != iostream) {
                        ChatGroupItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            return obj;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    protected int getAllGroupUnreadNum(String key){
        int tempNum = 0;

        String where = Tables.GET_CACHE_TABLE.CACHE_KEY +" LIKE?";
        String orderby = Tables.GET_CACHE_TABLE.CACHE_ID + " DESC";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    new String[] {key + "%"}, null, null, orderby);
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    String key_value = cursor.getString(cursor.getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_KEY));
                    String nums = getSettingsValue(key_value+"_unread");
                    if(!TextUtils.isEmpty(nums)){
                        tempNum += Integer.parseInt(nums);
                    }
                }
                return tempNum;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return 0;
    }

    public long setChatItem(String toUser, ChatItem datas) {
        if (null == datas) {
            return -1;
        }

        Cursor cursor = null;
        try {
            ContentValues values = new ContentValues();
            values.put(Tables.GET_CACHE_TABLE.CACHE_KEY, "" + toUser);
            values.put(Tables.GET_CACHE_TABLE.CACHE_DATA,
                    SerializedUtils.encodeObject(datas));
            values.put(Tables.GET_CACHE_TABLE.CACHE_TIME,
                    System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_GET_CACHE, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return -1;
    }

    public long setUnreadChatItem(String toUser, ChatItem datas) {
        if (null == datas) {
            return -1;
        }
        // 未读件数 +1
        String tmp = getSettingsValue(toUser + "_unread");
        if (TextUtils.isEmpty(tmp)) {
            saveSettings(toUser + "_unread", "1");
        } else {
            saveSettings(toUser + "_unread", "" + (Integer.parseInt(tmp) + 1));
        }

        Cursor cursor = null;
        try {
            ContentValues values = new ContentValues();
            values.put(Tables.GET_CACHE_TABLE.CACHE_KEY, "" + toUser);
            values.put(Tables.GET_CACHE_TABLE.CACHE_DATA,
                    SerializedUtils.encodeObject(datas));
            values.put(Tables.GET_CACHE_TABLE.CACHE_TIME,
                    System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_GET_CACHE, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return -1;
    }

    //保存系统消息到数据库
    public long setSystemItem(String key, SystemInfoItem datas) {
        if (null == datas) {
            return -1;
        }

        String where = Tables.CACB_TABLE_SYSTEM_CHAT.KEY + "= \"" + key + "\""
                + " and " + Tables.CACB_TABLE_SYSTEM_CHAT.FROM + "=\"" + datas.getUserId() + "\"";

        Cursor cursor = mDBInstance.query(Tables.TABLE_SYSTEM_CHAT, null, where,
                null, null, null, null);

        if(cursor != null && cursor.getCount() > 0){
            cursor.moveToFirst();
            //如果存在更新
            Log.i("CYW", "setSystemItem: SystemItem 存在");
            ContentValues values = new ContentValues();
            values.put(Tables.CACB_TABLE_SYSTEM_CHAT.DATA, SerializedUtils.encodeObject(datas));
            mDBInstance.update(Tables.TABLE_SYSTEM_CHAT, values, where, null);
            cursor.close();
        }else{
            //如果不存在插入
            Log.i("CYW", "setSystemItem: SystemItem 插入");
            ContentValues values = new ContentValues();
            values.put(Tables.CACB_TABLE_SYSTEM_CHAT.KEY, key);
            values.put(Tables.CACB_TABLE_SYSTEM_CHAT.FROM, datas.getUserId());
            values.put(Tables.CACB_TABLE_SYSTEM_CHAT.DATA,
                    SerializedUtils.encodeObject(datas));
            values.put(Tables.CACB_TABLE_SYSTEM_CHAT.TIME,
                    datas.getTime());
            return mDBInstance.insert(Tables.TABLE_SYSTEM_CHAT, null, values);
        }

        return -1;
    }


    /**
     * 删除系统消息记录
     * */
    protected boolean deleteSystemChatItem(String key, String fromId){
        String where = Tables.CACB_TABLE_SYSTEM_CHAT.KEY + "=\"" + key + "\""
                + " and " + Tables.CACB_TABLE_SYSTEM_CHAT.FROM + "=\"" + fromId + "\"";

        if(mDBInstance.delete(Tables.TABLE_SYSTEM_CHAT,where,null)>0){
            return true;
        }

        return false;
    }

    /**
     * 更新单个群消息
     **/
    protected long updateChatGroupItem(String key, ChatGroupItem item){
        if (null == item) {
            return -1;
        }

        String where = Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + key + "\""
                + " and " + Tables.GET_CACHE_TABLE.CACHE_ID + "=\"" + item.getId() + "\"";

        Cursor cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                null, null, null, null);

        if(cursor != null && cursor.getCount() > 0){
            while (cursor.moveToNext()) {
                //如果存在更新
                Log.i("CYW", "updateChatGroupItem: ChatGroupItem 存在");
                ContentValues values = new ContentValues();
                values.put(Tables.GET_CACHE_TABLE.CACHE_DATA, SerializedUtils.encodeObject(item));
                mDBInstance.update(Tables.TABLE_GET_CACHE, values, where, null);
            }
            cursor.close();
        }

        return -1;
    }


    /**
     * 删除群组消息记录
     * */
    protected boolean deleteGroupChatItem(String key){
        String where = Tables.GET_CACHE_TABLE.CACHE_KEY + "=\"" + key + "\"";

        if(mDBInstance.delete(Tables.TABLE_GET_CACHE,where,null)>0){
            return true;
        }

        return false;
    }


    /**
     * 保存群组中一条聊天记录到数据库
     */
    public long setChatGroupItem(String toGroup, ChatGroupItem datas) {
        if (null == datas) {
            return -1;
        }

        Cursor cursor = null;
        try {
            ContentValues values = new ContentValues();
            values.put(Tables.GET_CACHE_TABLE.CACHE_KEY, "" + toGroup);
            values.put(Tables.GET_CACHE_TABLE.CACHE_DATA,
                    SerializedUtils.encodeObject(datas));
            values.put(Tables.GET_CACHE_TABLE.CACHE_TIME,
                    System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_GET_CACHE, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return -1;
    }

    /**
     * 根据群组id获取群组聊天信息
     *
     * @param fromGroup
     * @return
     */
    protected ChatItem getChatGroupItem(String fromGroup) {
        String where = "";
        where = Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromGroup + "\"";

        String orderby = Tables.GET_CACHE_TABLE.CACHE_TIME + " DESC" + " Limit "
                + 1;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_ID));
                    if (null != iostream) {
                        ChatItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            return obj;
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    protected List<ChatGroupItem> getChatGroupItem(String fromGroup, long id, int pageMax) {
        String where = "";
        if (id == 0) {
            where = Tables.GET_CACHE_TABLE.CACHE_ID + ">" + id + " AND "
                    + Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromGroup
                    + "\"";
        } else {
            where = Tables.GET_CACHE_TABLE.CACHE_ID + "<" + id + " AND "
                    + Tables.GET_CACHE_TABLE.CACHE_KEY + "= \"" + fromGroup
                    + "\"";
        }
        String orderby = Tables.GET_CACHE_TABLE.CACHE_ID + " DESC" + " Limit "
                + pageMax;
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_GET_CACHE, null, where,
                    null, null, null, orderby);
            if (null != cursor) {
                List<ChatGroupItem> ci = new ArrayList<ChatGroupItem>();
                int len = cursor.getCount();
                int index = len;
                ChatGroupItem[] temp = new ChatGroupItem[len];
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_DATA));
                    long id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.GET_CACHE_TABLE.CACHE_ID));
                    if (null != iostream) {
                        ChatGroupItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setId(id_value);
                            temp[--index] = obj;

                        }
                    }
                }
                for (int i = 0; i < len; i++) {
                    if (temp[i] != null) {
                        ci.add(temp[i]);
                    }
                }
                return ci;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

    /**
     * 保存群组聊天数据
     *
     * @return
     */
    protected long setCommunityChatItem(String key, ChatGroupItem item) {
        if (null == item) {
            return -1;
        }
        Cursor cursor = null;
        try {
            ContentValues values = new ContentValues();
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.KEY, key);
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.COMMUNITY_ID, "" + item.getRingGroupId());
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.DATA,
                    SerializedUtils.encodeObject(item));
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.TIME,
                    System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_COMMUNITY_CHAT_DATA, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return -1;
    }

    /**
     * 保存未读的群组聊天数据
     *
     * @param key userId + communityId
     * @return
     */
    protected long setCommunityUnreadChatItem(String key, ChatGroupItem item) {
        if (null == item) {
            return -1;
        }
        // 未读件数 +1
        String tmp = getSettingsValue(key + "_unread");
        if (TextUtils.isEmpty(tmp)) {
            saveSettings(key + "_unread", "1");
        } else {
            saveSettings(key + "_unread", "" + (Integer.parseInt(tmp) + 1));
        }

        Cursor cursor = null;
        try {
            ContentValues values = new ContentValues();
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.KEY, key);
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.COMMUNITY_ID, item.getRingGroupId());
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.DATA,
                    SerializedUtils.encodeObject(item));
            values.put(Tables.CACB_COMMUNITY_CHAT_DATA.TIME,
                    System.currentTimeMillis());
            return mDBInstance.insert(Tables.TABLE_COMMUNITY_CHAT_DATA, null, values);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return -1;
    }

    /**
     * 获取群组聊天记录数据列表
     *
     * @param key
     * @return
     */
    protected List<ChatGroupItem> getCommunityChatList(String key) {
        String where = "";
        where = Tables.CACB_COMMUNITY_CHAT_DATA.KEY + "= \"" + key + "\"";
        String orderby = Tables.CACB_COMMUNITY_CHAT_DATA.TIME + " DESC";
        Cursor cursor = null;
        try {
            cursor = mDBInstance.query(Tables.TABLE_COMMUNITY_CHAT_DATA, null, where,
                    null, null, null, orderby);
            List<ChatGroupItem> list = new ArrayList<ChatGroupItem>();
            if (null != cursor) {
                while (cursor.moveToNext()) {
                    byte[] iostream = cursor.getBlob(cursor
                            .getColumnIndex(Tables.CACB_COMMUNITY_CHAT_DATA.DATA));
                    int id_value = cursor.getInt(cursor
                            .getColumnIndex(Tables.CACB_COMMUNITY_CHAT_DATA.ID));
                    String time = cursor.getString(cursor.getColumnIndex(Tables.CACB_COMMUNITY_CHAT_DATA.TIME));
                    String comminuty_id = cursor.getString(cursor.getColumnIndex(Tables.CACB_COMMUNITY_CHAT_DATA.COMMUNITY_ID));
                    if (null != iostream) {
                        ChatGroupItem obj = SerializedUtils.decodeObject(iostream);
                        if (obj != null) {
                            obj.setRingGroupId(comminuty_id);
                            obj.setAddtime(time);
                            obj.setId(id_value);
                            list.add(obj);
                        }
                    }
                }
            }
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return null;
    }

}
