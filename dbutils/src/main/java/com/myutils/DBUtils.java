package com.myutils;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 9:59
 */
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;
import java.util.Map;

import org.apache.commons.dbutils.BasicRowProcessor;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

public class DBUtils {

    /**
     * 查询单条记录.
     */
    @SuppressWarnings("unchecked")
    public static <T> T query(Connection conn, String sql, Class<T> type, Object... params) throws SQLException {
        QueryRunner run = new QueryRunner(true);
        if (PrimitiveClasses.isPrimitive(type)) {
            return (T) run.query(conn, sql, new PrimitiveScalarHandler(), params);
        } else if (Map.class.equals(type)) {
            return (T) run.query(conn, sql, new MapHandler(), params);
        }
        BeanHandler<T> handler = new BeanHandler<T>(type, new BasicRowProcessor(new AnnoBeanProcessor()));
        return run.query(conn, sql, handler, params);
    }

    /**
     * 查询多条记录. <br/>
     */
    @SuppressWarnings("unchecked")
    public static <T> List<T> queryForList(Connection conn, String sql, Class<T> type, Object... params) throws SQLException {
        QueryRunner run = new QueryRunner(true);
        if (PrimitiveClasses.isPrimitive(type)) {
            return (List<T>) run.query(conn, sql, new PrimitiveColumnListHandler(), params);
        } else if (Map.class.equals(type)) {
            return (List<T>) run.query(conn, sql, new MapListHandler(), params);
        }
        BeanListHandler<T> handler = new BeanListHandler<T>(type, new BasicRowProcessor(new AnnoBeanProcessor()));
        return run.query(conn, sql, handler, params);
    }

    /**
     * 执行INSERT/UPDATE/DELETE语句.
     */
    public static int update(Connection conn, String sql, Object...params) throws SQLException {

        QueryRunner run = new QueryRunner(true);
        return run.update(conn, sql, params);
    }

    /**
     * 批量执行指定的SQL语句.
     */
    public static int[] batch(Connection conn, String sql, Object[][] params) throws SQLException {
        QueryRunner run = new QueryRunner(true);
        return run.batch(conn, sql, params);
    }

    /**
     * 执行指定的储存过程. <br/>
     *
     * 注意，本方法限定于存储过程入参和出参均为字符串类型. <br/>
     */
    public static void call(Connection conn, String procedure, String...params )throws SQLException{

        CallableStatement call = null;
        call = conn.prepareCall(procedure);
        call.registerOutParameter(1, Types.VARCHAR);

        for (int i = 0; i < params.length; i++) {
            call.registerOutParameter(i + 1, Types.VARCHAR);
            call.setString(i + 1, String.valueOf(params[i]));
        }

        call.execute();
        call.close();
    }

    /**
     *
     * 执行指定的储存过程，并返回结果. <br/>
     */
    public static String callAndGetResult(Connection conn, String procedure, String...params )throws SQLException{

        CallableStatement call;
        call = conn.prepareCall(procedure);
        call.registerOutParameter(1, Types.VARCHAR);
        for (int i = 0; i < params.length; i++) {
            call.registerOutParameter(i + 2, Types.VARCHAR);
            call.setString(i + 2, String.valueOf(params[i]));
        }
        call.execute();
        String result = call.getString(1);
        call.close();
        return result;
    }

    /**
     * 关闭/释放数据库连接.
     */
    public static void close(Connection conn) throws SQLException {
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

    /**
     * 关闭/释放数据库连接,忽略异常.
     */
    public static void closeQuietly(Connection conn) {
        try {
            close(conn);
        } catch (SQLException e) {	}
    }
}
