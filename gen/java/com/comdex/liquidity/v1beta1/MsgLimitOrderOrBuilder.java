// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/liquidity/v1beta1/tx.proto

package com.comdex.liquidity.v1beta1;

public interface MsgLimitOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.liquidity.v1beta1.MsgLimitOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The orderer.
   */
  java.lang.String getOrderer();
  /**
   * <pre>
   * orderer specifies the bech32-encoded address that makes an order
   * </pre>
   *
   * <code>string orderer = 1 [json_name = "orderer"];</code>
   * @return The bytes for orderer.
   */
  com.google.protobuf.ByteString
      getOrdererBytes();

  /**
   * <pre>
   * pair_id specifies the pair id
   * </pre>
   *
   * <code>uint64 pair_id = 2 [json_name = "pairId"];</code>
   * @return The pairId.
   */
  long getPairId();

  /**
   * <pre>
   * direction specifies the order direction(buy or sell)
   * </pre>
   *
   * <code>.comdex.liquidity.v1beta1.OrderDirection direction = 3 [json_name = "direction"];</code>
   * @return The enum numeric value on the wire for direction.
   */
  int getDirectionValue();
  /**
   * <pre>
   * direction specifies the order direction(buy or sell)
   * </pre>
   *
   * <code>.comdex.liquidity.v1beta1.OrderDirection direction = 3 [json_name = "direction"];</code>
   * @return The direction.
   */
  com.comdex.liquidity.v1beta1.OrderDirection getDirection();

  /**
   * <pre>
   * offer_coin specifies the amount of coin the orderer offers
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin offer_coin = 4 [json_name = "offerCoin", (.gogoproto.nullable) = false];</code>
   * @return Whether the offerCoin field is set.
   */
  boolean hasOfferCoin();
  /**
   * <pre>
   * offer_coin specifies the amount of coin the orderer offers
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin offer_coin = 4 [json_name = "offerCoin", (.gogoproto.nullable) = false];</code>
   * @return The offerCoin.
   */
  com.cosmos.base.v1beta1.Coin getOfferCoin();
  /**
   * <pre>
   * offer_coin specifies the amount of coin the orderer offers
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin offer_coin = 4 [json_name = "offerCoin", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getOfferCoinOrBuilder();

  /**
   * <pre>
   * demand_coin_denom specifies the demand coin denom
   * </pre>
   *
   * <code>string demand_coin_denom = 5 [json_name = "demandCoinDenom"];</code>
   * @return The demandCoinDenom.
   */
  java.lang.String getDemandCoinDenom();
  /**
   * <pre>
   * demand_coin_denom specifies the demand coin denom
   * </pre>
   *
   * <code>string demand_coin_denom = 5 [json_name = "demandCoinDenom"];</code>
   * @return The bytes for demandCoinDenom.
   */
  com.google.protobuf.ByteString
      getDemandCoinDenomBytes();

  /**
   * <pre>
   * price specifies the order price
   * </pre>
   *
   * <code>string price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <pre>
   * price specifies the order price
   * </pre>
   *
   * <code>string price = 6 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <pre>
   * amount specifies the amount of base coin the orderer wants to buy or sell
   * </pre>
   *
   * <code>string amount = 7 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The amount.
   */
  java.lang.String getAmount();
  /**
   * <pre>
   * amount specifies the amount of base coin the orderer wants to buy or sell
   * </pre>
   *
   * <code>string amount = 7 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for amount.
   */
  com.google.protobuf.ByteString
      getAmountBytes();

  /**
   * <pre>
   * order_lifespan specifies the order lifespan
   * </pre>
   *
   * <code>.google.protobuf.Duration order_lifespan = 8 [json_name = "orderLifespan", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return Whether the orderLifespan field is set.
   */
  boolean hasOrderLifespan();
  /**
   * <pre>
   * order_lifespan specifies the order lifespan
   * </pre>
   *
   * <code>.google.protobuf.Duration order_lifespan = 8 [json_name = "orderLifespan", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   * @return The orderLifespan.
   */
  com.google.protobuf.Duration getOrderLifespan();
  /**
   * <pre>
   * order_lifespan specifies the order lifespan
   * </pre>
   *
   * <code>.google.protobuf.Duration order_lifespan = 8 [json_name = "orderLifespan", (.gogoproto.nullable) = false, (.gogoproto.stdduration) = true];</code>
   */
  com.google.protobuf.DurationOrBuilder getOrderLifespanOrBuilder();

  /**
   * <code>uint64 app_id = 9 [json_name = "appId"];</code>
   * @return The appId.
   */
  long getAppId();
}
