// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/evm/v1/query.proto

package com.ethermint.evm.v1;

public interface QueryTxLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.evm.v1.QueryTxLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * logs represents the ethereum logs generated from the given transaction.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.Log logs = 1 [json_name = "logs"];</code>
   */
  java.util.List<com.ethermint.evm.v1.Log> 
      getLogsList();
  /**
   * <pre>
   * logs represents the ethereum logs generated from the given transaction.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.Log logs = 1 [json_name = "logs"];</code>
   */
  com.ethermint.evm.v1.Log getLogs(int index);
  /**
   * <pre>
   * logs represents the ethereum logs generated from the given transaction.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.Log logs = 1 [json_name = "logs"];</code>
   */
  int getLogsCount();
  /**
   * <pre>
   * logs represents the ethereum logs generated from the given transaction.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.Log logs = 1 [json_name = "logs"];</code>
   */
  java.util.List<? extends com.ethermint.evm.v1.LogOrBuilder> 
      getLogsOrBuilderList();
  /**
   * <pre>
   * logs represents the ethereum logs generated from the given transaction.
   * </pre>
   *
   * <code>repeated .ethermint.evm.v1.Log logs = 1 [json_name = "logs"];</code>
   */
  com.ethermint.evm.v1.LogOrBuilder getLogsOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
