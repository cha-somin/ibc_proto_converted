// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/bandchain/v1/node/query.proto

package com.bandchain.v1.node;

public interface ValidatorMinimalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bandchain.v1.node.ValidatorMinimal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>int64 voting_power = 2 [json_name = "votingPower"];</code>
   * @return The votingPower.
   */
  long getVotingPower();
}
