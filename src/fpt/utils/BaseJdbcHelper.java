package fpt.utils;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BaseJdbcHelper<T, K> extends JDBCHelper {
    
    private Class<T> clazz;

    public BaseJdbcHelper(Class<T> entityType) {
        this.clazz = entityType;
    }

    public Class<T> getEntityType() {
        return clazz;
    }

    public List<T> excuesList(String sql, Object... objects) {
        List<T> lstResult = new ArrayList<>();
        try {
            ResultSet rs = query(sql, objects);
            while (rs.next()) {
                lstResult.add(createObject(rs));
            }
        } catch (Exception e) {
            // handel execton 
            e.printStackTrace();
        }
        return lstResult;
    }

    public T excuesObject(String sql, Object... objects) {
        try {
            ResultSet rs = query(sql, objects);
            while (rs.next()) {
                return createObject(rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean excuesInsertUpdateDelete(String sql, Object... objects) {
        int check = update(sql, objects);
        return check > 0;
    }

    private T createObject(ResultSet resultSet) throws Exception {
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
}
