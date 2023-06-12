// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/params.proto

package com.coreum.asset.ft.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * issue_fee is the fee burnt each time new token is issued
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return Whether the issueFee field is set.
   */
  boolean hasIssueFee();
  /**
   * <pre>
   * issue_fee is the fee burnt each time new token is issued
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return The issueFee.
   */
  com.cosmos.base.v1beta1.Coin getIssueFee();
  /**
   * <pre>
   * issue_fee is the fee burnt each time new token is issued
   * </pre>
   *
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 1 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getIssueFeeOrBuilder();
}
