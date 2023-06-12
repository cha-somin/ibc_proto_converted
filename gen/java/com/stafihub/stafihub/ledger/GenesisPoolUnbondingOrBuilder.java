// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/genesis.proto

package com.stafihub.stafihub.ledger;

public interface GenesisPoolUnbondingOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.ledger.GenesisPoolUnbonding)
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
   * <code>uint32 era = 2 [json_name = "era"];</code>
   * @return The era.
   */
  int getEra();

  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The pool.
   */
  java.lang.String getPool();
  /**
   * <code>string pool = 3 [json_name = "pool"];</code>
   * @return The bytes for pool.
   */
  com.google.protobuf.ByteString
      getPoolBytes();

  /**
   * <code>uint32 sequence = 4 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  int getSequence();

  /**
   * <code>.stafihub.stafihub.ledger.Unbonding unbonding = 5 [json_name = "unbonding"];</code>
   * @return Whether the unbonding field is set.
   */
  boolean hasUnbonding();
  /**
   * <code>.stafihub.stafihub.ledger.Unbonding unbonding = 5 [json_name = "unbonding"];</code>
   * @return The unbonding.
   */
  com.stafihub.stafihub.ledger.Unbonding getUnbonding();
  /**
   * <code>.stafihub.stafihub.ledger.Unbonding unbonding = 5 [json_name = "unbonding"];</code>
   */
  com.stafihub.stafihub.ledger.UnbondingOrBuilder getUnbondingOrBuilder();
}
