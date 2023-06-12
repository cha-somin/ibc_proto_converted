// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/royalty_config.proto

package com.likechain.likenft.v1;

public interface RoyaltyConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.RoyaltyConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 rate_basis_points = 1 [json_name = "rateBasisPoints"];</code>
   * @return The rateBasisPoints.
   */
  long getRateBasisPoints();

  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.likechain.likenft.v1.RoyaltyStakeholder> 
      getStakeholdersList();
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  com.likechain.likenft.v1.RoyaltyStakeholder getStakeholders(int index);
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  int getStakeholdersCount();
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder> 
      getStakeholdersOrBuilderList();
  /**
   * <code>repeated .likechain.likenft.v1.RoyaltyStakeholder stakeholders = 2 [json_name = "stakeholders", (.gogoproto.nullable) = false];</code>
   */
  com.likechain.likenft.v1.RoyaltyStakeholderOrBuilder getStakeholdersOrBuilder(
      int index);
}
