// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/icaauth/v1/tx.proto

package com.chainmain.icaauth.v1;

public interface MsgRegisterAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainmain.icaauth.v1.MsgRegisterAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * owner represents the owner of the interchain account
   * </pre>
   *
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * owner represents the owner of the interchain account
   * </pre>
   *
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * connectionId represents the IBC `connectionId` of the host chain
   * </pre>
   *
   * <code>string connectionId = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The connectionId.
   */
  java.lang.String getConnectionId();
  /**
   * <pre>
   * connectionId represents the IBC `connectionId` of the host chain
   * </pre>
   *
   * <code>string connectionId = 2 [json_name = "connectionId", (.gogoproto.moretags) = "yaml:&#92;"connection_id&#92;""];</code>
   * @return The bytes for connectionId.
   */
  com.google.protobuf.ByteString
      getConnectionIdBytes();

  /**
   * <pre>
   * version represents the version of the ICA channel
   * </pre>
   *
   * <code>string version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <pre>
   * version represents the version of the ICA channel
   * </pre>
   *
   * <code>string version = 3 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
