package com.myutils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;


/**
 * DB基本实现,提供操作数据库的简单封装
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 9:58
 */
@Repository
public class DBDaoImpl {

    @Autowired
    private DataSource dataSource;

    public <T> T query(String sql, Class<T> type, Object... params) throws DatabaseException {
        if (dataSource == null) throw new DatabaseException("dataSource is null");
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            return DBUtils.query(conn, sql, type, params);
        } catch (SQLException e) { throw new DatabaseException("查询数据库出错", e);
        } finally {
            DBUtils.closeQuietly(conn);
        }
    }

    public <T> List<T> queryForList(String sql, Class<T> type, Object... params) throws DatabaseException {
        if (dataSource == null) throw new DatabaseException("dataSource is null");
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            return DBUtils.queryForList(conn, sql, type, params);
        } catch (SQLException e) {
            throw new DatabaseException("查询数据库出错", e);
        } finally {
            DBUtils.closeQuietly(conn);
        }
    }

    public int update(String sql, Object... params) throws DatabaseException {
        if (dataSource == null)
            throw new DatabaseException("dataSource is null");
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            return DBUtils.update(conn, sql, params);
        } catch (SQLException e) {
            throw new DatabaseException("更新数据库出错", e);
        } finally {
            DBUtils.closeQuietly(conn);
        }
    }

    public int[] batch(String sql, Object[][] params)
            throws DatabaseException {
        if (dataSource == null)
            throw new DatabaseException("dataSource is null");
        Connection conn = null;
        try {
            conn = dataSource.getConnection();
            return DBUtils.batch(conn, sql, params);
        } catch (SQLException e) {
            throw new DatabaseException("批量更新数据库出错", e);
        } finally {
            DBUtils.closeQuietly(conn);
        }
    }

    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
