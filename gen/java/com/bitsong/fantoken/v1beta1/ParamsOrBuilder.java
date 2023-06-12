// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/params.proto

package com.bitsong.fantoken.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return Whether the issueFee field is set.
   */
  boolean hasIssueFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return The issueFee.
   */
  com.cosmos.base.v1beta1.Coin getIssueFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getIssueFeeOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 2 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   * @return Whether the mintFee field is set.
   */
  boolean hasMintFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 2 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   * @return The mintFee.
   */
  com.cosmos.base.v1beta1.Coin getMintFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 2 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getMintFeeOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 3 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   * @return Whether the burnFee field is set.
   */
  boolean hasBurnFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 3 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   * @return The burnFee.
   */
  com.cosmos.base.v1beta1.Coin getBurnFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 3 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBurnFeeOrBuilder();
}
