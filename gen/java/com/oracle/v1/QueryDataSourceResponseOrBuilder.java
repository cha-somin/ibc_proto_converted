// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/query.proto

package com.oracle.v1;

public interface QueryDataSourceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:oracle.v1.QueryDataSourceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * DataSource is summary information of a data source
   * </pre>
   *
   * <code>.oracle.v1.DataSource data_source = 1 [json_name = "dataSource"];</code>
   * @return Whether the dataSource field is set.
   */
  boolean hasDataSource();
  /**
   * <pre>
   * DataSource is summary information of a data source
   * </pre>
   *
   * <code>.oracle.v1.DataSource data_source = 1 [json_name = "dataSource"];</code>
   * @return The dataSource.
   */
  com.oracle.v1.DataSource getDataSource();
  /**
   * <pre>
   * DataSource is summary information of a data source
   * </pre>
   *
   * <code>.oracle.v1.DataSource data_source = 1 [json_name = "dataSource"];</code>
   */
  com.oracle.v1.DataSourceOrBuilder getDataSourceOrBuilder();
}
