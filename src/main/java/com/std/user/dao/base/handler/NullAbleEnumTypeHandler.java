/*
 * 描          述:  <描述>
 * 修  改   人:  brady
 * 修改时间:  2012-12-6
 * <修改描述:>
 */
package com.std.user.dao.base.handler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

/**
 * 修改默认的String映射处理器
 * 替换系统中的TypeHandler
 * <功能详细描述>
 * 
 * @author  brady
 * @version  [版本号, 2012-12-6]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 */
@MappedTypes({ Enum.class })
public class NullAbleEnumTypeHandler<E extends Enum<E>> extends
        BaseTypeHandler<Enum<E>> {

    private Class<E> type;

    /**
     * <默认构造函数>
     */
    public NullAbleEnumTypeHandler(Class<E> type) {
        this.type = type;
    }

    /**
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setParameter(PreparedStatement ps, int i, Enum<E> parameter,
            JdbcType jdbcType) throws SQLException {
        if (parameter == null
                && (jdbcType == null || JdbcType.OTHER == jdbcType)) {
            ps.setNull(i, JdbcUtils.getSqlTypeByJavaType(String.class));
        } else {
            super.setParameter(ps, i, parameter, jdbcType);
        }
    }

    /**
     * @param ps
     * @param i
     * @param parameter
     * @param jdbcType
     * @throws SQLException
     */
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i,
            Enum<E> parameter, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            ps.setString(i, parameter.name());
        } else {
            ps.setObject(i, parameter.name(), jdbcType.TYPE_CODE);
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, String columnName)
            throws SQLException {
        String s = rs.getString(columnName);
        try {
            return s == null ? null : Enum.valueOf(type, s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public E getNullableResult(ResultSet rs, int columnIndex)
            throws SQLException {
        String s = rs.getString(columnIndex);
        try {
            return s == null ? null : Enum.valueOf(type, s);
        } catch (IllegalArgumentException e) {
            return null;
        }
    }

    @Override
    public E getNullableResult(CallableStatement cs, int columnIndex)
            throws SQLException {
        String s = cs.getString(columnIndex);
        try {
            return s == null ? null : Enum.valueOf(type, s);
        } catch (Exception e) {
            return null;
        }
    }

}
