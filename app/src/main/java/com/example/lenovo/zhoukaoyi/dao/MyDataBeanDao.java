package com.example.lenovo.zhoukaoyi.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.lenovo.zhoukaoyi.bean.MyDataBean;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MY_DATA_BEAN".
*/
public class MyDataBeanDao extends AbstractDao<MyDataBean, Long> {

    public static final String TABLENAME = "MY_DATA_BEAN";

    /**
     * Properties of entity MyDataBean.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property CommentNum = new Property(1, String.class, "commentNum", false, "COMMENT_NUM");
        public final static Property Content = new Property(2, String.class, "content", false, "CONTENT");
        public final static Property CreateTime = new Property(3, String.class, "createTime", false, "CREATE_TIME");
        public final static Property ImgUrls = new Property(4, String.class, "imgUrls", false, "IMG_URLS");
        public final static Property Jid = new Property(5, int.class, "jid", false, "JID");
        public final static Property PraiseNum = new Property(6, String.class, "praiseNum", false, "PRAISE_NUM");
        public final static Property ShareNum = new Property(7, String.class, "shareNum", false, "SHARE_NUM");
        public final static Property Uid = new Property(8, int.class, "uid", false, "UID");
        public final static Property Age = new Property(9, String.class, "age", false, "AGE");
        public final static Property Fans = new Property(10, String.class, "fans", false, "FANS");
        public final static Property Follow = new Property(11, boolean.class, "follow", false, "FOLLOW");
        public final static Property Icon = new Property(12, String.class, "icon", false, "ICON");
        public final static Property Nickname = new Property(13, String.class, "nickname", false, "NICKNAME");
    }


    public MyDataBeanDao(DaoConfig config) {
        super(config);
    }
    
    public MyDataBeanDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MY_DATA_BEAN\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"COMMENT_NUM\" TEXT," + // 1: commentNum
                "\"CONTENT\" TEXT," + // 2: content
                "\"CREATE_TIME\" TEXT," + // 3: createTime
                "\"IMG_URLS\" TEXT," + // 4: imgUrls
                "\"JID\" INTEGER NOT NULL ," + // 5: jid
                "\"PRAISE_NUM\" TEXT," + // 6: praiseNum
                "\"SHARE_NUM\" TEXT," + // 7: shareNum
                "\"UID\" INTEGER NOT NULL ," + // 8: uid
                "\"AGE\" TEXT," + // 9: age
                "\"FANS\" TEXT," + // 10: fans
                "\"FOLLOW\" INTEGER NOT NULL ," + // 11: follow
                "\"ICON\" TEXT," + // 12: icon
                "\"NICKNAME\" TEXT);"); // 13: nickname
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MY_DATA_BEAN\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MyDataBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String commentNum = entity.getCommentNum();
        if (commentNum != null) {
            stmt.bindString(2, commentNum);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(4, createTime);
        }
 
        String imgUrls = entity.getImgUrls();
        if (imgUrls != null) {
            stmt.bindString(5, imgUrls);
        }
        stmt.bindLong(6, entity.getJid());
 
        String praiseNum = entity.getPraiseNum();
        if (praiseNum != null) {
            stmt.bindString(7, praiseNum);
        }
 
        String shareNum = entity.getShareNum();
        if (shareNum != null) {
            stmt.bindString(8, shareNum);
        }
        stmt.bindLong(9, entity.getUid());
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(10, age);
        }
 
        String fans = entity.getFans();
        if (fans != null) {
            stmt.bindString(11, fans);
        }
        stmt.bindLong(12, entity.getFollow() ? 1L: 0L);
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(13, icon);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(14, nickname);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MyDataBean entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String commentNum = entity.getCommentNum();
        if (commentNum != null) {
            stmt.bindString(2, commentNum);
        }
 
        String content = entity.getContent();
        if (content != null) {
            stmt.bindString(3, content);
        }
 
        String createTime = entity.getCreateTime();
        if (createTime != null) {
            stmt.bindString(4, createTime);
        }
 
        String imgUrls = entity.getImgUrls();
        if (imgUrls != null) {
            stmt.bindString(5, imgUrls);
        }
        stmt.bindLong(6, entity.getJid());
 
        String praiseNum = entity.getPraiseNum();
        if (praiseNum != null) {
            stmt.bindString(7, praiseNum);
        }
 
        String shareNum = entity.getShareNum();
        if (shareNum != null) {
            stmt.bindString(8, shareNum);
        }
        stmt.bindLong(9, entity.getUid());
 
        String age = entity.getAge();
        if (age != null) {
            stmt.bindString(10, age);
        }
 
        String fans = entity.getFans();
        if (fans != null) {
            stmt.bindString(11, fans);
        }
        stmt.bindLong(12, entity.getFollow() ? 1L: 0L);
 
        String icon = entity.getIcon();
        if (icon != null) {
            stmt.bindString(13, icon);
        }
 
        String nickname = entity.getNickname();
        if (nickname != null) {
            stmt.bindString(14, nickname);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MyDataBean readEntity(Cursor cursor, int offset) {
        MyDataBean entity = new MyDataBean( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // commentNum
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // content
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // createTime
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // imgUrls
            cursor.getInt(offset + 5), // jid
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // praiseNum
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // shareNum
            cursor.getInt(offset + 8), // uid
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // age
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // fans
            cursor.getShort(offset + 11) != 0, // follow
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // icon
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13) // nickname
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MyDataBean entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setCommentNum(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setContent(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCreateTime(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setImgUrls(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setJid(cursor.getInt(offset + 5));
        entity.setPraiseNum(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setShareNum(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setUid(cursor.getInt(offset + 8));
        entity.setAge(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setFans(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setFollow(cursor.getShort(offset + 11) != 0);
        entity.setIcon(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setNickname(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MyDataBean entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MyDataBean entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MyDataBean entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
