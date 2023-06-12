// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/tx.proto

package com.comdex.liquidity.v1beta1;

public interface MsgDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.MsgDeposit)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * depositor specifies the bech32-encoded address that makes a deposit to the pool
   * </pre>
   *
   * <code>string depositor = 1 [json_name = "depositor"];</code>
   * @return The depositor.
   */
  java.lang.String getDepositor();
  /**
   * <pre>
   * depositor specifies the bech32-encoded address that makes a deposit to the pool
   * </pre>
   *
   * <code>string depositor = 1 [json_name = "depositor"];</code>
   * @return The bytes for depositor.
   */
  com.google.protobuf.ByteString
      getDepositorBytes();

  /**
   * <pre>
   * pool_id specifies the pool id
   * </pre>
   *
   * <code>uint64 pool_id = 2 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <pre>
   * deposit_coins specifies the amount of coins to deposit.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_coins = 3 [json_name = "depositCoins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getDepositCoinsList();
  /**
   * <pre>
   * deposit_coins specifies the amount of coins to deposit.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_coins = 3 [json_name = "depositCoins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getDepositCoins(int index);
  /**
   * <pre>
   * deposit_coins specifies the amount of coins to deposit.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_coins = 3 [json_name = "depositCoins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getDepositCoinsCount();
  /**
   * <pre>
   * deposit_coins specifies the amount of coins to deposit.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_coins = 3 [json_name = "depositCoins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getDepositCoinsOrBuilderList();
  /**
   * <pre>
   * deposit_coins specifies the amount of coins to deposit.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin deposit_coins = 3 [json_name = "depositCoins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDepositCoinsOrBuilder(
      int index);

  /**
   * <code>uint64 app_id = 4 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();
}
