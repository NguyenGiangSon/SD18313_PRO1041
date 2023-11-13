package fpt.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCHelper {

    public static PreparedStatement getStm(String sql, Object... args) throws SQLException {
        Connection conn = DBContext.getConnection();
        PreparedStatement stm;
        if (sql.trim().startsWith("{")) {
            stm = conn.prepareCall(sql);
        } else {
            stm = conn.prepareStatement(sql);
        }
        if (args != null && args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                stm.setObject(i + 1, args[i]);
            }
        }
        return stm;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement stm = getStm(sql, args);
        return stm.executeQuery();
    }

    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stm = getStm(sql, args);
            try {
                return stm.executeUpdate();
            } finally {
                stm.getConnection().close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
