// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/tx.proto

package com.stride.stakeibc;

public interface MsgDeleteValidatorOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.stakeibc.MsgDeleteValidator)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string host_zone = 2 [json_name = "hostZone"];</code>
   * @return The hostZone.
   */
  java.lang.String getHostZone();
  /**
   * <code>string host_zone = 2 [json_name = "hostZone"];</code>
   * @return The bytes for hostZone.
   */
  com.google.protobuf.ByteString
      getHostZoneBytes();

  /**
   * <code>string val_addr = 3 [json_name = "valAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The valAddr.
   */
  java.lang.String getValAddr();
  /**
   * <code>string val_addr = 3 [json_name = "valAddr", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for valAddr.
   */
  com.google.protobuf.ByteString
      getValAddrBytes();
}
