// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/proposals.proto

package com.provenance.marker.v1;

public interface SupplyIncreaseProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.marker.v1.SupplyIncreaseProposal)
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
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the amount field is set.
   */
  boolean hasAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The amount.
   */
  com.cosmos.base.v1beta1.Coin getAmount();
  /**
   * <code>.cosmos.base.v1beta1.Coin amount = 3 [json_name = "amount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAmountOrBuilder();

  /**
   * <pre>
   * an optional target address for the minted coin from this request
   * </pre>
   *
   * <code>string target_address = 4 [json_name = "targetAddress"];</code>
   * @return The targetAddress.
   */
  java.lang.String getTargetAddress();
  /**
   * <pre>
   * an optional target address for the minted coin from this request
   * </pre>
   *
   * <code>string target_address = 4 [json_name = "targetAddress"];</code>
   * @return The bytes for targetAddress.
   */
  com.google.protobuf.ByteString
      getTargetAddressBytes();
}
