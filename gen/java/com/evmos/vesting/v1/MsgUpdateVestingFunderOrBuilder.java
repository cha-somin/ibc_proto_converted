// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/vesting/v1/tx.proto

package com.evmos.vesting.v1;

public interface MsgUpdateVestingFunderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.vesting.v1.MsgUpdateVestingFunder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * funder_address is the current funder address of the ClawbackVestingAccount
   * </pre>
   *
   * <code>string funder_address = 1 [json_name = "funderAddress"];</code>
   * @return The funderAddress.
   */
  java.lang.String getFunderAddress();
  /**
   * <pre>
   * funder_address is the current funder address of the ClawbackVestingAccount
   * </pre>
   *
   * <code>string funder_address = 1 [json_name = "funderAddress"];</code>
   * @return The bytes for funderAddress.
   */
  com.google.protobuf.ByteString
      getFunderAddressBytes();

  /**
   * <pre>
   * new_funder_address is the new address to replace the existing funder_address
   * </pre>
   *
   * <code>string new_funder_address = 2 [json_name = "newFunderAddress"];</code>
   * @return The newFunderAddress.
   */
  java.lang.String getNewFunderAddress();
  /**
   * <pre>
   * new_funder_address is the new address to replace the existing funder_address
   * </pre>
   *
   * <code>string new_funder_address = 2 [json_name = "newFunderAddress"];</code>
   * @return The bytes for newFunderAddress.
   */
  com.google.protobuf.ByteString
      getNewFunderAddressBytes();

  /**
   * <pre>
   * vesting_address is the address of the ClawbackVestingAccount being updated
   * </pre>
   *
   * <code>string vesting_address = 3 [json_name = "vestingAddress"];</code>
   * @return The vestingAddress.
   */
  java.lang.String getVestingAddress();
  /**
   * <pre>
   * vesting_address is the address of the ClawbackVestingAccount being updated
   * </pre>
   *
   * <code>string vesting_address = 3 [json_name = "vestingAddress"];</code>
   * @return The bytes for vestingAddress.
   */
  com.google.protobuf.ByteString
      getVestingAddressBytes();
}
