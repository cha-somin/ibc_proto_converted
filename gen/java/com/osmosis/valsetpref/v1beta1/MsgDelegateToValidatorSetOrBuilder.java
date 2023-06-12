// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/tx.proto

package com.osmosis.valsetpref.v1beta1;

public interface MsgDelegateToValidatorSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.valsetpref.v1beta1.MsgDelegateToValidatorSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator is the user who is trying to delegate.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The delegator.
   */
  java.lang.String getDelegator();
  /**
   * <pre>
   * delegator is the user who is trying to delegate.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The bytes for delegator.
   */
  com.google.protobuf.ByteString
      getDelegatorBytes();

  /**
   * <pre>
   * the amount of tokens the user is trying to delegate.
   * For ex: delegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3, ValC
   * -&gt; 0.2} our staking logic would attempt to delegate 5osmo to A , 3osmo to
   * B, 2osmo to C.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the coin field is set.
   */
  boolean hasCoin();
  /**
   * <pre>
   * the amount of tokens the user is trying to delegate.
   * For ex: delegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3, ValC
   * -&gt; 0.2} our staking logic would attempt to delegate 5osmo to A , 3osmo to
   * B, 2osmo to C.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The coin.
   */
  com.cosmos.base.v1beta1.Coin getCoin();
  /**
   * <pre>
   * the amount of tokens the user is trying to delegate.
   * For ex: delegate 10osmo with validator-set {ValA -&gt; 0.5, ValB -&gt; 0.3, ValC
   * -&gt; 0.2} our staking logic would attempt to delegate 5osmo to A , 3osmo to
   * B, 2osmo to C.
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin coin = 2 [json_name = "coin", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getCoinOrBuilder();
}
