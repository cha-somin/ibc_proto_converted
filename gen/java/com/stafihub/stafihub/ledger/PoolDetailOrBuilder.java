// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/ledger.proto

package com.stafihub.stafihub.ledger;

public interface PoolDetailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.PoolDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string pool = 2 [json_name = "pool"];</code>
   * @return The pool.
   */
  java.lang.String getPool();
  /**
   * <code>string pool = 2 [json_name = "pool"];</code>
   * @return The bytes for pool.
   */
  com.google.protobuf.ByteString
      getPoolBytes();

  /**
   * <code>repeated string subAccounts = 3 [json_name = "subAccounts"];</code>
   * @return A list containing the subAccounts.
   */
  java.util.List<java.lang.String>
      getSubAccountsList();
  /**
   * <code>repeated string subAccounts = 3 [json_name = "subAccounts"];</code>
   * @return The count of subAccounts.
   */
  int getSubAccountsCount();
  /**
   * <code>repeated string subAccounts = 3 [json_name = "subAccounts"];</code>
   * @param index The index of the element to return.
   * @return The subAccounts at the given index.
   */
  java.lang.String getSubAccounts(int index);
  /**
   * <code>repeated string subAccounts = 3 [json_name = "subAccounts"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the subAccounts at the given index.
   */
  com.google.protobuf.ByteString
      getSubAccountsBytes(int index);

  /**
   * <code>uint32 threshold = 4 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  int getThreshold();

  /**
   * <code>.stafihub.stafihub.ledger.PoolStatus status = 5 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.stafihub.stafihub.ledger.PoolStatus status = 5 [json_name = "status"];</code>
   * @return The status.
   */
  com.stafihub.stafihub.ledger.PoolStatus getStatus();
}
