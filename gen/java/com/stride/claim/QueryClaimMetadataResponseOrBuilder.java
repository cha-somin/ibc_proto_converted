// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/claim/query.proto

package com.stride.claim;

public interface QueryClaimMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.claim.QueryClaimMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .stride.claim.ClaimMetadata claim_metadata = 1 [json_name = "claimMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_metadata&#92;""];</code>
   */
  java.util.List<com.stride.claim.ClaimMetadata> 
      getClaimMetadataList();
  /**
   * <code>repeated .stride.claim.ClaimMetadata claim_metadata = 1 [json_name = "claimMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_metadata&#92;""];</code>
   */
  com.stride.claim.ClaimMetadata getClaimMetadata(int index);
  /**
   * <code>repeated .stride.claim.ClaimMetadata claim_metadata = 1 [json_name = "claimMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_metadata&#92;""];</code>
   */
  int getClaimMetadataCount();
  /**
   * <code>repeated .stride.claim.ClaimMetadata claim_metadata = 1 [json_name = "claimMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_metadata&#92;""];</code>
   */
  java.util.List<? extends com.stride.claim.ClaimMetadataOrBuilder> 
      getClaimMetadataOrBuilderList();
  /**
   * <code>repeated .stride.claim.ClaimMetadata claim_metadata = 1 [json_name = "claimMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claim_metadata&#92;""];</code>
   */
  com.stride.claim.ClaimMetadataOrBuilder getClaimMetadataOrBuilder(
      int index);
}
