// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/oracle/query.proto

package com.irismod.oracle;

public interface QueryFeedValueResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.oracle.QueryFeedValueResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .irismod.oracle.FeedValue feed_values = 1 [json_name = "feedValues", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.irismod.oracle.FeedValue> 
      getFeedValuesList();
  /**
   * <code>repeated .irismod.oracle.FeedValue feed_values = 1 [json_name = "feedValues", (.gogoproto.nullable) = false];</code>
   */
  com.irismod.oracle.FeedValue getFeedValues(int index);
  /**
   * <code>repeated .irismod.oracle.FeedValue feed_values = 1 [json_name = "feedValues", (.gogoproto.nullable) = false];</code>
   */
  int getFeedValuesCount();
  /**
   * <code>repeated .irismod.oracle.FeedValue feed_values = 1 [json_name = "feedValues", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.irismod.oracle.FeedValueOrBuilder> 
      getFeedValuesOrBuilderList();
  /**
   * <code>repeated .irismod.oracle.FeedValue feed_values = 1 [json_name = "feedValues", (.gogoproto.nullable) = false];</code>
   */
  com.irismod.oracle.FeedValueOrBuilder getFeedValuesOrBuilder(
      int index);
}
