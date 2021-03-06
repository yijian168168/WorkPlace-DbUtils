package com.myutils;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 10:02
 */
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.ColumnListHandler;

/**
 * ClassName: PrimitiveColumnListHandler<br/>
 * Function: 单一列handler.<br/>
 * date: Aug 1, 2014 2:13:11 PM<br/>
 * @version 1.0
 */
public class PrimitiveColumnListHandler extends ColumnListHandler {

    @Override
    protected Object handleRow(ResultSet rs) throws SQLException {

        Object obj = super.handleRow(rs);
        if (obj instanceof BigInteger)
            return ((BigInteger) obj).longValue();
        return obj;
    }
}
