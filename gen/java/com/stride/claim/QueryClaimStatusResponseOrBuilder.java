// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/claim/query.proto

package com.stride.claim;

public interface QueryClaimStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.claim.QueryClaimStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .stride.claim.ClaimStatus claim_status = 1 [json_name = "claimStatus", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_status&#92;""];</code>
   */
  java.util.List<com.stride.claim.ClaimStatus> 
      getClaimStatusList();
  /**
   * <code>repeated .stride.claim.ClaimStatus claim_status = 1 [json_name = "claimStatus", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_status&#92;""];</code>
   */
  com.stride.claim.ClaimStatus getClaimStatus(int index);
  /**
   * <code>repeated .stride.claim.ClaimStatus claim_status = 1 [json_name = "claimStatus", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_status&#92;""];</code>
   */
  int getClaimStatusCount();
  /**
   * <code>repeated .stride.claim.ClaimStatus claim_status = 1 [json_name = "claimStatus", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_status&#92;""];</code>
   */
  java.util.List<? extends com.stride.claim.ClaimStatusOrBuilder> 
      getClaimStatusOrBuilderList();
  /**
   * <code>repeated .stride.claim.ClaimStatus claim_status = 1 [json_name = "claimStatus", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_status&#92;""];</code>
   */
  com.stride.claim.ClaimStatusOrBuilder getClaimStatusOrBuilder(
      int index);
}
