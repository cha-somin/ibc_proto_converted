// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

public interface QueryValsetConfirmsByNonceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.QueryValsetConfirmsByNonceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .gravity.v1.MsgValsetConfirm confirms = 1 [json_name = "confirms", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.gravity.v1.MsgValsetConfirm> 
      getConfirmsList();
  /**
   * <code>repeated .gravity.v1.MsgValsetConfirm confirms = 1 [json_name = "confirms", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.MsgValsetConfirm getConfirms(int index);
  /**
   * <code>repeated .gravity.v1.MsgValsetConfirm confirms = 1 [json_name = "confirms", (.gogoproto.nullable) = false];</code>
   */
  int getConfirmsCount();
  /**
   * <code>repeated .gravity.v1.MsgValsetConfirm confirms = 1 [json_name = "confirms", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.gravity.v1.MsgValsetConfirmOrBuilder> 
      getConfirmsOrBuilderList();
  /**
   * <code>repeated .gravity.v1.MsgValsetConfirm confirms = 1 [json_name = "confirms", (.gogoproto.nullable) = false];</code>
   */
  com.gravity.v1.MsgValsetConfirmOrBuilder getConfirmsOrBuilder(
      int index);
}
