// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/gamm/v1beta1/gov.proto

package com.osmosis.gamm.v1beta1;

public interface UpdateMigrationRecordsProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.gamm.v1beta1.UpdateMigrationRecordsProposal)
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
   * <code>repeated .osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink records = 3 [json_name = "records", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink> 
      getRecordsList();
  /**
   * <code>repeated .osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink records = 3 [json_name = "records", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink getRecords(int index);
  /**
   * <code>repeated .osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink records = 3 [json_name = "records", (.gogoproto.nullable) = false];</code>
   */
  int getRecordsCount();
  /**
   * <code>repeated .osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink records = 3 [json_name = "records", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.osmosis.gamm.v1beta1.BalancerToConcentratedPoolLinkOrBuilder> 
      getRecordsOrBuilderList();
  /**
   * <code>repeated .osmosis.gamm.v1beta1.BalancerToConcentratedPoolLink records = 3 [json_name = "records", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.gamm.v1beta1.BalancerToConcentratedPoolLinkOrBuilder getRecordsOrBuilder(
      int index);
}
