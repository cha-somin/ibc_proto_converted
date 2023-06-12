// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/gov.proto

package com.bitsong.fantoken.v1beta1;

public interface UpdateFeesProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.v1beta1.UpdateFeesProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 3 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return Whether the issueFee field is set.
   */
  boolean hasIssueFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 3 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   * @return The issueFee.
   */
  com.cosmos.base.v1beta1.Coin getIssueFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin issue_fee = 3 [json_name = "issueFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"issue_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getIssueFeeOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 4 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   * @return Whether the mintFee field is set.
   */
  boolean hasMintFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 4 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   * @return The mintFee.
   */
  com.cosmos.base.v1beta1.Coin getMintFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin mint_fee = 4 [json_name = "mintFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"mint_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getMintFeeOrBuilder();

  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 5 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   * @return Whether the burnFee field is set.
   */
  boolean hasBurnFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 5 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   * @return The burnFee.
   */
  com.cosmos.base.v1beta1.Coin getBurnFee();
  /**
   * <code>.cosmos.base.v1beta1.Coin burn_fee = 5 [json_name = "burnFee", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"burn_fee&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getBurnFeeOrBuilder();
}
