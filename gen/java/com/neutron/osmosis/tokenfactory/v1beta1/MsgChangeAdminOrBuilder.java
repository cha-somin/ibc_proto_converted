// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/osmosis/tokenfactory/v1beta1/tx.proto

package com.neutron.osmosis.tokenfactory.v1beta1;

public interface MsgChangeAdminOrBuilder extends
    // @@protoc_insertion_point(interface_extends:neutron.osmosis.tokenfactory.v1beta1.MsgChangeAdmin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.moretags) = "yaml:&#92;"sender&#92;""];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>string denom = 2 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string newAdmin = 3 [json_name = "newAdmin", (.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
   * @return The newAdmin.
   */
  java.lang.String getNewAdmin();
  /**
   * <code>string newAdmin = 3 [json_name = "newAdmin", (.gogoproto.moretags) = "yaml:&#92;"new_admin&#92;""];</code>
   * @return The bytes for newAdmin.
   */
  com.google.protobuf.ByteString
      getNewAdminBytes();
}
