// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/delegation/v1beta1/events.proto

package com.kyve.delegation.v1beta1;

public interface EventUndelegateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.delegation.v1beta1.EventUndelegate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the account address of the delegator.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the account address of the delegator.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * staker is the account address of the protocol node.
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  java.lang.String getStaker();
  /**
   * <pre>
   * staker is the account address of the protocol node.
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The bytes for staker.
   */
  com.google.protobuf.ByteString
      getStakerBytes();

  /**
   * <pre>
   * amount ...
   * </pre>
   *
   * <code>uint64 amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  long getAmount();
}
