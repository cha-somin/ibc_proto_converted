// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package com.cosmos.tx.v1beta1;

public interface GetTxsEventResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.GetTxsEventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * txs is the list of queried transactions.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1 [json_name = "txs"];</code>
   */
  java.util.List<com.cosmos.tx.v1beta1.Tx> 
      getTxsList();
  /**
   * <pre>
   * txs is the list of queried transactions.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1 [json_name = "txs"];</code>
   */
  com.cosmos.tx.v1beta1.Tx getTxs(int index);
  /**
   * <pre>
   * txs is the list of queried transactions.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1 [json_name = "txs"];</code>
   */
  int getTxsCount();
  /**
   * <pre>
   * txs is the list of queried transactions.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1 [json_name = "txs"];</code>
   */
  java.util.List<? extends com.cosmos.tx.v1beta1.TxOrBuilder> 
      getTxsOrBuilderList();
  /**
   * <pre>
   * txs is the list of queried transactions.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.Tx txs = 1 [json_name = "txs"];</code>
   */
  com.cosmos.tx.v1beta1.TxOrBuilder getTxsOrBuilder(
      int index);

  /**
   * <pre>
   * tx_responses is the list of queried TxResponses.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2 [json_name = "txResponses"];</code>
   */
  java.util.List<com.cosmos.base.abci.v1beta1.TxResponse> 
      getTxResponsesList();
  /**
   * <pre>
   * tx_responses is the list of queried TxResponses.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2 [json_name = "txResponses"];</code>
   */
  com.cosmos.base.abci.v1beta1.TxResponse getTxResponses(int index);
  /**
   * <pre>
   * tx_responses is the list of queried TxResponses.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2 [json_name = "txResponses"];</code>
   */
  int getTxResponsesCount();
  /**
   * <pre>
   * tx_responses is the list of queried TxResponses.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2 [json_name = "txResponses"];</code>
   */
  java.util.List<? extends com.cosmos.base.abci.v1beta1.TxResponseOrBuilder> 
      getTxResponsesOrBuilderList();
  /**
   * <pre>
   * tx_responses is the list of queried TxResponses.
   * </pre>
   *
   * <code>repeated .cosmos.base.abci.v1beta1.TxResponse tx_responses = 2 [json_name = "txResponses"];</code>
   */
  com.cosmos.base.abci.v1beta1.TxResponseOrBuilder getTxResponsesOrBuilder(
      int index);

  /**
   * <pre>
   * pagination defines a pagination for the response.
   * Deprecated post v0.46.x: use total instead.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", deprecated = true];</code>
   * @deprecated cosmos.tx.v1beta1.GetTxsEventResponse.pagination is deprecated.
   *     See cosmos/tx/v1beta1/service.proto;l=130
   * @return Whether the pagination field is set.
   */
  @java.lang.Deprecated boolean hasPagination();
  /**
   * <pre>
   * pagination defines a pagination for the response.
   * Deprecated post v0.46.x: use total instead.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", deprecated = true];</code>
   * @deprecated cosmos.tx.v1beta1.GetTxsEventResponse.pagination is deprecated.
   *     See cosmos/tx/v1beta1/service.proto;l=130
   * @return The pagination.
   */
  @java.lang.Deprecated com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination defines a pagination for the response.
   * Deprecated post v0.46.x: use total instead.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination", deprecated = true];</code>
   */
  @java.lang.Deprecated com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();

  /**
   * <pre>
   * total is total number of results available
   * </pre>
   *
   * <code>uint64 total = 4 [json_name = "total"];</code>
   * @return The total.
   */
  long getTotal();
}
