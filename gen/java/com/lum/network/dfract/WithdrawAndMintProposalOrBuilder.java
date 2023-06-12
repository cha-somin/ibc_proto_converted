// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/dfract/proposal.proto

package com.lum.network.dfract;

public interface WithdrawAndMintProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.dfract.WithdrawAndMintProposal)
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
   * <code>string withdrawal_address = 3 [json_name = "withdrawalAddress"];</code>
   * @return The withdrawalAddress.
   */
  java.lang.String getWithdrawalAddress();
  /**
   * <code>string withdrawal_address = 3 [json_name = "withdrawalAddress"];</code>
   * @return The bytes for withdrawalAddress.
   */
  com.google.protobuf.ByteString
      getWithdrawalAddressBytes();

  /**
   * <code>int64 micro_mint_rate = 4 [json_name = "microMintRate"];</code>
   * @return The microMintRate.
   */
  long getMicroMintRate();
}
