package cn.binarywang.tools.generator;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/**
 * @author Binary Wang
 */
public class InsertSQLGenerator {
    private static final Joiner COMMA_JOINER = Joiner.on(", ");
    private Connection con;
    private String tableName;

    public InsertSQLGenerator(String url, String username, String password,
            String tableName) {
        try {
            this.con = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        this.tableName = tableName;
    }

    public String generateSQL() {
        try (PreparedStatement ps = this.con
            .prepareStatement("select * from " + this.tableName);
                ResultSet rs = ps.executeQuery();) {

            ResultSetMetaData rsm = rs.getMetaData();
            List<String> columns = Lists.newArrayList();
            for (int i = 1; i <= rsm.getColumnCount(); i++) {
                String columnName = rsm.getColumnName(i);
                String dbType = rsm.getColumnTypeName(i);

                System.out.print("Name: " + columnName);
                System.out.println(", DBType : " + dbType);
                columns.add(columnName);
            }

            return String.format("insert into %s(%s) values(%s)",
                this.tableName, COMMA_JOINER.join(columns),
                COMMA_JOINER.join(Collections.nCopies(columns.size(), "?")));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    public String generateParams() {
        return null;
    }

    public void close() {
        try {
            this.con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
