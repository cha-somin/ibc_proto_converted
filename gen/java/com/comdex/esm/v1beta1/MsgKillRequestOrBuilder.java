// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/esm/v1beta1/tx.proto

package com.comdex.esm.v1beta1;

public interface MsgKillRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.esm.v1beta1.MsgKillRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The from.
   */
  java.lang.String getFrom();
  /**
   * <code>string from = 1 [json_name = "from", (.gogoproto.moretags) = "yaml:&#92;"from&#92;""];</code>
   * @return The bytes for from.
   */
  com.google.protobuf.ByteString
      getFromBytes();

  /**
   * <code>.comdex.esm.v1beta1.KillSwitchParams killSwitchParams = 2 [json_name = "killSwitchParams", (.gogoproto.moretags) = "yaml:&#92;"killSwitchParams&#92;""];</code>
   * @return Whether the killSwitchParams field is set.
   */
  boolean hasKillSwitchParams();
  /**
   * <code>.comdex.esm.v1beta1.KillSwitchParams killSwitchParams = 2 [json_name = "killSwitchParams", (.gogoproto.moretags) = "yaml:&#92;"killSwitchParams&#92;""];</code>
   * @return The killSwitchParams.
   */
  com.comdex.esm.v1beta1.KillSwitchParams getKillSwitchParams();
  /**
   * <code>.comdex.esm.v1beta1.KillSwitchParams killSwitchParams = 2 [json_name = "killSwitchParams", (.gogoproto.moretags) = "yaml:&#92;"killSwitchParams&#92;""];</code>
   */
  com.comdex.esm.v1beta1.KillSwitchParamsOrBuilder getKillSwitchParamsOrBuilder();
}
