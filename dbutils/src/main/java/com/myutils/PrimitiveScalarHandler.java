package com.myutils;

/**
 * @Author: ZhangQingrong
 * @Date : 2017/7/28 10:03
 */
import java.math.BigInteger;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.handlers.ScalarHandler;

/**
 * ClassName: PrimitiveScalarHandler<br/>
 * Function: 单一列handler.<br/>
 * date: Aug 1, 2014 2:14:42 PM<br/>
 *
 * @version 1.0
 */
public class PrimitiveScalarHandler extends ScalarHandler {

    @Override
    public Object handle(ResultSet rs) throws SQLException {

        Object obj = super.handle(rs);
        if (obj instanceof BigInteger)
            return ((BigInteger) obj).longValue();
        return obj;
    }
}
