// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/session/v2/genesis.proto

package com.sentinel.session.v2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:sentinel.session.v2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .sentinel.session.v2.Session sessions = 1 [json_name = "sessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.sentinel.session.v2.Session> 
      getSessionsList();
  /**
   * <code>repeated .sentinel.session.v2.Session sessions = 1 [json_name = "sessions", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.session.v2.Session getSessions(int index);
  /**
   * <code>repeated .sentinel.session.v2.Session sessions = 1 [json_name = "sessions", (.gogoproto.nullable) = false];</code>
   */
  int getSessionsCount();
  /**
   * <code>repeated .sentinel.session.v2.Session sessions = 1 [json_name = "sessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.sentinel.session.v2.SessionOrBuilder> 
      getSessionsOrBuilderList();
  /**
   * <code>repeated .sentinel.session.v2.Session sessions = 1 [json_name = "sessions", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.session.v2.SessionOrBuilder getSessionsOrBuilder(
      int index);

  /**
   * <code>.sentinel.session.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.sentinel.session.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.sentinel.session.v2.Params getParams();
  /**
   * <code>.sentinel.session.v2.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.sentinel.session.v2.ParamsOrBuilder getParamsOrBuilder();
}
