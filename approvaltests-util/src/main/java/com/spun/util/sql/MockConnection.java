package com.spun.util.sql;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class MockConnection implements Connection
{
  public Statement createStatement() throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql) throws SQLException
  {
    return null;
  }
  public CallableStatement prepareCall(String sql) throws SQLException
  {
    return null;
  }
  public String nativeSQL(String sql) throws SQLException
  {
    return null;
  }
  public void setAutoCommit(boolean autoCommit) throws SQLException
  {
  }
  public boolean getAutoCommit() throws SQLException
  {
    return false;
  }
  public void commit() throws SQLException
  {
  }
  public void rollback() throws SQLException
  {
  }
  public void close() throws SQLException
  {
  }
  public boolean isClosed() throws SQLException
  {
    return false;
  }
  public DatabaseMetaData getMetaData() throws SQLException
  {
    return new MockDatabaseMetaData();
  }
  public void setReadOnly(boolean readOnly) throws SQLException
  {
  }
  public boolean isReadOnly() throws SQLException
  {
    return false;
  }
  public void setCatalog(String catalog) throws SQLException
  {
  }
  public String getCatalog() throws SQLException
  {
    return null;
  }
  public void setTransactionIsolation(int level) throws SQLException
  {
  }
  public int getTransactionIsolation() throws SQLException
  {
    return 0;
  }
  public SQLWarning getWarnings() throws SQLException
  {
    return null;
  }
  public void clearWarnings() throws SQLException
  {
  }
  public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
      throws SQLException
  {
    return null;
  }
  public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException
  {
    return null;
  }
  public Map<String, Class<?>> getTypeMap() throws SQLException
  {
    return null;
  }
  public void setTypeMap(Map<String, Class<?>> arg0) throws SQLException
  {
  }
  public void setHoldability(int holdability) throws SQLException
  {
  }
  public int getHoldability() throws SQLException
  {
    return 0;
  }
  public Savepoint setSavepoint() throws SQLException
  {
    return null;
  }
  public Savepoint setSavepoint(String name) throws SQLException
  {
    return null;
  }
  public void rollback(Savepoint savepoint) throws SQLException
  {
  }
  public void releaseSavepoint(Savepoint savepoint) throws SQLException
  {
  }
  public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
      throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException
  {
    return null;
  }
  public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException
  {
    return null;
  }
  public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException
  {
    return null;
  }
  public Array createArrayOf(String arg0, Object[] arg1) throws SQLException
  {
    return null;
  }
  public Blob createBlob() throws SQLException
  {
    return null;
  }
  public Clob createClob() throws SQLException
  {
    return null;
  }
  public NClob createNClob() throws SQLException
  {
    return null;
  }
  public SQLXML createSQLXML() throws SQLException
  {
    return null;
  }
  public Struct createStruct(String arg0, Object[] arg1) throws SQLException
  {
    return null;
  }
  public Properties getClientInfo() throws SQLException
  {
    return null;
  }
  public String getClientInfo(String arg0) throws SQLException
  {
    return null;
  }
  public boolean isValid(int arg0) throws SQLException
  {
    return false;
  }
  public void setClientInfo(Properties arg0) throws SQLClientInfoException
  {
  }
  public void setClientInfo(String arg0, String arg1) throws SQLClientInfoException
  {
  }
  public boolean isWrapperFor(Class<?> arg0) throws SQLException
  {
    return false;
  }
  public <T> T unwrap(Class<T> arg0) throws SQLException
  {
    return null;
  }
  public void abort(Executor arg0) throws SQLException
  {
  }
  public int getNetworkTimeout() throws SQLException
  {
    return 0;
  }
  public String getSchema() throws SQLException
  {
    return null;
  }
  public void setNetworkTimeout(Executor arg0, int arg1) throws SQLException
  {
  }
  public void setSchema(String arg0) throws SQLException
  {
  }
}
