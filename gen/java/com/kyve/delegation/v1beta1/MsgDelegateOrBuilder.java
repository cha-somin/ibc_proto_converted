// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/delegation/v1beta1/tx.proto

package com.kyve.delegation.v1beta1;

public interface MsgDelegateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.delegation.v1beta1.MsgDelegate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <pre>
   * creator ...
   * </pre>
   *
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <pre>
   * staker ...
   * </pre>
   *
   * <code>string staker = 2 [json_name = "staker"];</code>
   * @return The staker.
   */
  java.lang.String getStaker();
  /**
   * <pre>
   * staker ...
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
