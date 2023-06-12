// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha2/tx.proto

package com.panacea.datadeal.v2alpha2;

public interface DataDeliveryVoteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.datadeal.v2alpha2.DataDeliveryVote)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string voter_unique_id = 1 [json_name = "voterUniqueId"];</code>
   * @return The voterUniqueId.
   */
  java.lang.String getVoterUniqueId();
  /**
   * <code>string voter_unique_id = 1 [json_name = "voterUniqueId"];</code>
   * @return The bytes for voterUniqueId.
   */
  com.google.protobuf.ByteString
      getVoterUniqueIdBytes();

  /**
   * <code>string voter_address = 2 [json_name = "voterAddress"];</code>
   * @return The voterAddress.
   */
  java.lang.String getVoterAddress();
  /**
   * <code>string voter_address = 2 [json_name = "voterAddress"];</code>
   * @return The bytes for voterAddress.
   */
  com.google.protobuf.ByteString
      getVoterAddressBytes();

  /**
   * <code>uint64 deal_id = 3 [json_name = "dealId"];</code>
   * @return The dealId.
   */
  long getDealId();

  /**
   * <code>string data_hash = 4 [json_name = "dataHash"];</code>
   * @return The dataHash.
   */
  java.lang.String getDataHash();
  /**
   * <code>string data_hash = 4 [json_name = "dataHash"];</code>
   * @return The bytes for dataHash.
   */
  com.google.protobuf.ByteString
      getDataHashBytes();

  /**
   * <code>string delivered_cid = 5 [json_name = "deliveredCid"];</code>
   * @return The deliveredCid.
   */
  java.lang.String getDeliveredCid();
  /**
   * <code>string delivered_cid = 5 [json_name = "deliveredCid"];</code>
   * @return The bytes for deliveredCid.
   */
  com.google.protobuf.ByteString
      getDeliveredCidBytes();

  /**
   * <code>.panacea.oracle.v2alpha2.VoteOption vote_option = 6 [json_name = "voteOption"];</code>
   * @return The enum numeric value on the wire for voteOption.
   */
  int getVoteOptionValue();
  /**
   * <code>.panacea.oracle.v2alpha2.VoteOption vote_option = 6 [json_name = "voteOption"];</code>
   * @return The voteOption.
   */
  com.panacea.oracle.v2alpha2.VoteOption getVoteOption();
}
