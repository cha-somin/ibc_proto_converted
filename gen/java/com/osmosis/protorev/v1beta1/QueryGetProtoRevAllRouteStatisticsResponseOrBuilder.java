// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/query.proto

package com.osmosis.protorev.v1beta1;

public interface QueryGetProtoRevAllRouteStatisticsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.protorev.v1beta1.QueryGetProtoRevAllRouteStatisticsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * statistics contains the number of trades/profits the module has executed on
   * all routes it has successfully executed a trade on
   * </pre>
   *
   * <code>repeated .osmosis.protorev.v1beta1.RouteStatistics statistics = 1 [json_name = "statistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"statistics&#92;""];</code>
   */
  java.util.List<com.osmosis.protorev.v1beta1.RouteStatistics> 
      getStatisticsList();
  /**
   * <pre>
   * statistics contains the number of trades/profits the module has executed on
   * all routes it has successfully executed a trade on
   * </pre>
   *
   * <code>repeated .osmosis.protorev.v1beta1.RouteStatistics statistics = 1 [json_name = "statistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"statistics&#92;""];</code>
   */
  com.osmosis.protorev.v1beta1.RouteStatistics getStatistics(int index);
  /**
   * <pre>
   * statistics contains the number of trades/profits the module has executed on
   * all routes it has successfully executed a trade on
   * </pre>
   *
   * <code>repeated .osmosis.protorev.v1beta1.RouteStatistics statistics = 1 [json_name = "statistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"statistics&#92;""];</code>
   */
  int getStatisticsCount();
  /**
   * <pre>
   * statistics contains the number of trades/profits the module has executed on
   * all routes it has successfully executed a trade on
   * </pre>
   *
   * <code>repeated .osmosis.protorev.v1beta1.RouteStatistics statistics = 1 [json_name = "statistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"statistics&#92;""];</code>
   */
  java.util.List<? extends com.osmosis.protorev.v1beta1.RouteStatisticsOrBuilder> 
      getStatisticsOrBuilderList();
  /**
   * <pre>
   * statistics contains the number of trades/profits the module has executed on
   * all routes it has successfully executed a trade on
   * </pre>
   *
   * <code>repeated .osmosis.protorev.v1beta1.RouteStatistics statistics = 1 [json_name = "statistics", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"statistics&#92;""];</code>
   */
  com.osmosis.protorev.v1beta1.RouteStatisticsOrBuilder getStatisticsOrBuilder(
      int index);
}
