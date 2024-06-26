package org.example.db;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseManager {

    private static final String URL = "jdbc:postgresql://localhost:5432/SmartCity";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Sandu";
    private static final ComboPooledDataSource cpds;

    static {
        System.setProperty("com.mchange.v2.log.MLog", "com.mchange.v2.log.FallbackMLog");
        System.setProperty("com.mchange.v2.log.FallbackMLog.DEFAULT_CUTOFF_LEVEL", "OFF");

        cpds = new ComboPooledDataSource();
        cpds.setJdbcUrl(URL);
        cpds.setUser(USER);
        cpds.setPassword(PASSWORD);
    }
    public static Connection getConnection() throws SQLException {
        return cpds.getConnection();
    }
}

