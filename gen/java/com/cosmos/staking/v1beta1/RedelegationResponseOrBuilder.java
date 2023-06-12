// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package com.cosmos.staking.v1beta1;

public interface RedelegationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.staking.v1beta1.RedelegationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.staking.v1beta1.Redelegation redelegation = 1 [json_name = "redelegation", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the redelegation field is set.
   */
  boolean hasRedelegation();
  /**
   * <code>.cosmos.staking.v1beta1.Redelegation redelegation = 1 [json_name = "redelegation", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The redelegation.
   */
  com.cosmos.staking.v1beta1.Redelegation getRedelegation();
  /**
   * <code>.cosmos.staking.v1beta1.Redelegation redelegation = 1 [json_name = "redelegation", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.RedelegationOrBuilder getRedelegationOrBuilder();

  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationEntryResponse entries = 2 [json_name = "entries", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<com.cosmos.staking.v1beta1.RedelegationEntryResponse> 
      getEntriesList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationEntryResponse entries = 2 [json_name = "entries", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.RedelegationEntryResponse getEntries(int index);
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationEntryResponse entries = 2 [json_name = "entries", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  int getEntriesCount();
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationEntryResponse entries = 2 [json_name = "entries", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  java.util.List<? extends com.cosmos.staking.v1beta1.RedelegationEntryResponseOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <code>repeated .cosmos.staking.v1beta1.RedelegationEntryResponse entries = 2 [json_name = "entries", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.staking.v1beta1.RedelegationEntryResponseOrBuilder getEntriesOrBuilder(
      int index);
}
