// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/genesis.proto

package com.injective.oracle.v1beta1;

public interface CalldataRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.CalldataRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  long getClientId();

  /**
   * <code>bytes calldata = 2 [json_name = "calldata"];</code>
   * @return The calldata.
   */
  com.google.protobuf.ByteString getCalldata();
}
