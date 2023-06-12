// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/lockup/lock.proto

package com.osmosis.lockup;

public interface PeriodLockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.lockup.PeriodLock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ID is the unique id of the lock.
   * The ID of the lock is decided upon lock creation, incrementing by 1 for
   * every lock.
   * </pre>
   *
   * <code>uint64 ID = 1 [json_name = "ID"];</code>
   * @return The iD.
   */
  long getID();

  /**
   * <pre>
   * Owner is the account address of the lock owner.
   * Only the owner can modify the state of the lock.
   * </pre>
   *
   * <code>string owner = 2 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <pre>
   * Owner is the account address of the lock owner.
   * Only the owner can modify the state of the lock.
   * </pre>
   *
   * <code>string owner = 2 [json_name = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <pre>
   * Duration is the time needed for a lock to mature after unlocking has
   * started.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   * <pre>
   * Duration is the time needed for a lock to mature after unlocking has
   * started.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   * <pre>
   * Duration is the time needed for a lock to mature after unlocking has
   * started.
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 3 [json_name = "duration", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "duration,omitempty", (.gogoproto.moretags) = "yaml:&#92;"duration&#92;"", (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   * <pre>
   * EndTime refers to the time at which the lock would mature and get deleted.
   * This value is first initialized when an unlock has started for the lock,
   * end time being block time + duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   * <pre>
   * EndTime refers to the time at which the lock would mature and get deleted.
   * This value is first initialized when an unlock has started for the lock,
   * end time being block time + duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   * <pre>
   * EndTime refers to the time at which the lock would mature and get deleted.
   * This value is first initialized when an unlock has started for the lock,
   * end time being block time + duration.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 4 [json_name = "endTime", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"end_time&#92;"", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   * <pre>
   * Coins are the tokens locked within the lock, kept in the module account.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 5 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getCoinsList();
  /**
   * <pre>
   * Coins are the tokens locked within the lock, kept in the module account.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 5 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getCoins(int index);
  /**
   * <pre>
   * Coins are the tokens locked within the lock, kept in the module account.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 5 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getCoinsCount();
  /**
   * <pre>
   * Coins are the tokens locked within the lock, kept in the module account.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 5 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getCoinsOrBuilderList();
  /**
   * <pre>
   * Coins are the tokens locked within the lock, kept in the module account.
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin coins = 5 [json_name = "coins", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinsOrBuilder(
      int index);

  /**
   * <pre>
   * Reward Receiver Address is the address that would be receiving rewards for
   * the incentives for the lock. This is set to owner by default and can be
   * changed via separate msg.
   * </pre>
   *
   * <code>string reward_receiver_address = 6 [json_name = "rewardReceiverAddress", (.gogoproto.moretags) = "yaml:&#92;"reward_receiver_address&#92;""];</code>
   * @return The rewardReceiverAddress.
   */
  java.lang.String getRewardReceiverAddress();
  /**
   * <pre>
   * Reward Receiver Address is the address that would be receiving rewards for
   * the incentives for the lock. This is set to owner by default and can be
   * changed via separate msg.
   * </pre>
   *
   * <code>string reward_receiver_address = 6 [json_name = "rewardReceiverAddress", (.gogoproto.moretags) = "yaml:&#92;"reward_receiver_address&#92;""];</code>
   * @return The bytes for rewardReceiverAddress.
   */
  com.google.protobuf.ByteString
      getRewardReceiverAddressBytes();
}
