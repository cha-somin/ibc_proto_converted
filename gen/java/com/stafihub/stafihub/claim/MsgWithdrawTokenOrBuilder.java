// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/claim/tx.proto

package com.stafihub.stafihub.claim;

public interface MsgWithdrawTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.claim.MsgWithdrawToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator"];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string recipient = 2 [json_name = "recipient"];</code>
   * @return The recipient.
   */
  java.lang.String getRecipient();
  /**
   * <code>string recipient = 2 [json_name = "recipient"];</code>
   * @return The bytes for recipient.
   */
  com.google.protobuf.ByteString
      getRecipientBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin token = 3 [json_name = "token", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return Whether the token field is set.
   */
  boolean hasToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin token = 3 [json_name = "token", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   * @return The token.
   */
  com.cosmos.base.v1beta1.Coin getToken();
  /**
   * <code>.cosmos.base.v1beta1.Coin token = 3 [json_name = "token", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Coin"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getTokenOrBuilder();
}
