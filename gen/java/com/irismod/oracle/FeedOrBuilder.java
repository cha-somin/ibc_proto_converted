// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/oracle/oracle.proto

package com.irismod.oracle;

public interface FeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.oracle.Feed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string feed_name = 1 [json_name = "feedName", (.gogoproto.moretags) = "yaml:&#92;"feed_name&#92;""];</code>
   * @return The feedName.
   */
  java.lang.String getFeedName();
  /**
   * <code>string feed_name = 1 [json_name = "feedName", (.gogoproto.moretags) = "yaml:&#92;"feed_name&#92;""];</code>
   * @return The bytes for feedName.
   */
  com.google.protobuf.ByteString
      getFeedNameBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string aggregate_func = 3 [json_name = "aggregateFunc", (.gogoproto.moretags) = "yaml:&#92;"aggregate_func&#92;""];</code>
   * @return The aggregateFunc.
   */
  java.lang.String getAggregateFunc();
  /**
   * <code>string aggregate_func = 3 [json_name = "aggregateFunc", (.gogoproto.moretags) = "yaml:&#92;"aggregate_func&#92;""];</code>
   * @return The bytes for aggregateFunc.
   */
  com.google.protobuf.ByteString
      getAggregateFuncBytes();

  /**
   * <code>string value_json_path = 4 [json_name = "valueJsonPath", (.gogoproto.moretags) = "yaml:&#92;"value_json_path&#92;""];</code>
   * @return The valueJsonPath.
   */
  java.lang.String getValueJsonPath();
  /**
   * <code>string value_json_path = 4 [json_name = "valueJsonPath", (.gogoproto.moretags) = "yaml:&#92;"value_json_path&#92;""];</code>
   * @return The bytes for valueJsonPath.
   */
  com.google.protobuf.ByteString
      getValueJsonPathBytes();

  /**
   * <code>uint64 latest_history = 5 [json_name = "latestHistory", (.gogoproto.moretags) = "yaml:&#92;"latest_history&#92;""];</code>
   * @return The latestHistory.
   */
  long getLatestHistory();

  /**
   * <code>string request_context_id = 6 [json_name = "requestContextId", (.gogoproto.customname) = "RequestContextID", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The requestContextId.
   */
  java.lang.String getRequestContextId();
  /**
   * <code>string request_context_id = 6 [json_name = "requestContextId", (.gogoproto.customname) = "RequestContextID", (.gogoproto.moretags) = "yaml:&#92;"request_context_id&#92;""];</code>
   * @return The bytes for requestContextId.
   */
  com.google.protobuf.ByteString
      getRequestContextIdBytes();

  /**
   * <code>string creator = 7 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 7 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();
}
