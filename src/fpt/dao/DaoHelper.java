package fpt.dao;

import fpt.utils.JDBCHelper;
import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoHelper extends JDBCHelper {

    public <T> List<T> excuesList(Class<T> clazz, String sql, Object... objects) {
        try {
            ResultSet rs = query(sql, objects);
            List<T> lstResult = new ArrayList<>();
            while (rs.next()) {
                lstResult.add(createObject(clazz, rs));
            }
            return lstResult;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    public <T> T excuesObject(Class<T> clazz, String sql, Object... objects) {
        try {
            ResultSet rs = query(sql, objects);
            while (rs.next()) {
                return createObject(clazz, rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean checkUpdateQuery(String sql, Object... objects) {
        int check = update(sql, objects);
        return check > 0;
    }

    public boolean excuesInsertUpdateDelete(String sql, Object... objects) {
        int check = update(sql, objects);
        return check > 0;
    }

    public boolean excuteInsertUpdateDelete(String sql, Object... objects) {
        int check = update(sql, objects);
        return check > 0 ? true : false;
    }

    private <T> T createObject(Class<T> clazz, ResultSet resultSet) throws Exception {
        T object = clazz.newInstance();
        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            String fieldName = field.getName();
            Object value = null;
            try {
                value = resultSet.getObject(fieldName);
            } catch (Exception e) {
                //
            }
            if (value != null) {
//                String fieldType = String.valueOf(field.getType());
                Class fieldType = field.getType();
                if (fieldType == Float.class || fieldType == float.class) {
                    if (value instanceof Double) {
                        // Ép kiểu Double thành Float
                        field.set(object, ((Double) value).floatValue());
                    }
                } else {
                    field.set(object, value);
                }
            }
        }
        return object;
    }

    public <T> T excuesInsertUpdateDeleteUseSp(Class<T> clazz, String sql, Object... objects) {
        try {
            ResultSet rs = query(sql, objects);
            while (rs.next()) {
                return createObject(clazz, rs);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
