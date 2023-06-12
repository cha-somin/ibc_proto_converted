// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/swap/v1beta1/swap.proto

package com.kava.swap.v1beta1;

public interface PoolRecordOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kava.swap.v1beta1.PoolRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool_id represents the unique id of the pool
   * </pre>
   *
   * <code>string pool_id = 1 [json_name = "poolId", (.gogoproto.customname) = "PoolID"];</code>
   * @return The poolId.
   */
  java.lang.String getPoolId();
  /**
   * <pre>
   * pool_id represents the unique id of the pool
   * </pre>
   *
   * <code>string pool_id = 1 [json_name = "poolId", (.gogoproto.customname) = "PoolID"];</code>
   * @return The bytes for poolId.
   */
  com.google.protobuf.ByteString
      getPoolIdBytes();

  /**
   * <pre>
   * reserves_a is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_a = 2 [json_name = "reservesA", (.gogoproto.nullable) = false];</code>
   * @return Whether the reservesA field is set.
   */
  boolean hasReservesA();
  /**
   * <pre>
   * reserves_a is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_a = 2 [json_name = "reservesA", (.gogoproto.nullable) = false];</code>
   * @return The reservesA.
   */
  com.cosmos.base.v1beta1.Coin getReservesA();
  /**
   * <pre>
   * reserves_a is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_a = 2 [json_name = "reservesA", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getReservesAOrBuilder();

  /**
   * <pre>
   * reserves_b is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_b = 3 [json_name = "reservesB", (.gogoproto.nullable) = false];</code>
   * @return Whether the reservesB field is set.
   */
  boolean hasReservesB();
  /**
   * <pre>
   * reserves_b is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_b = 3 [json_name = "reservesB", (.gogoproto.nullable) = false];</code>
   * @return The reservesB.
   */
  com.cosmos.base.v1beta1.Coin getReservesB();
  /**
   * <pre>
   * reserves_b is the a token coin reserves
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin reserves_b = 3 [json_name = "reservesB", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getReservesBOrBuilder();

  /**
   * <pre>
   * total_shares is the total distrubuted shares of the pool
   * </pre>
   *
   * <code>string total_shares = 4 [json_name = "totalShares", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The totalShares.
   */
  java.lang.String getTotalShares();
  /**
   * <pre>
   * total_shares is the total distrubuted shares of the pool
   * </pre>
   *
   * <code>string total_shares = 4 [json_name = "totalShares", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.cosmos_proto.scalar) = "cosmos.Int"];</code>
   * @return The bytes for totalShares.
   */
  com.google.protobuf.ByteString
      getTotalSharesBytes();
}
