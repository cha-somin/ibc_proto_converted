// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rvalidator/proposal.proto

package com.stafihub.stafihub.rvalidator;

public interface UpdateRValidatorReportProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stafihub.stafihub.rvalidator.UpdateRValidatorReportProposal)
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
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string poolAddress = 3 [json_name = "poolAddress"];</code>
   * @return The poolAddress.
   */
  java.lang.String getPoolAddress();
  /**
   * <code>string poolAddress = 3 [json_name = "poolAddress"];</code>
   * @return The bytes for poolAddress.
   */
  com.google.protobuf.ByteString
      getPoolAddressBytes();

  /**
   * <code>string propId = 4 [json_name = "propId"];</code>
   * @return The propId.
   */
  java.lang.String getPropId();
  /**
   * <code>string propId = 4 [json_name = "propId"];</code>
   * @return The bytes for propId.
   */
  com.google.protobuf.ByteString
      getPropIdBytes();

  /**
   * <code>.stafihub.stafihub.rvalidator.Cycle cycle = 5 [json_name = "cycle"];</code>
   * @return Whether the cycle field is set.
   */
  boolean hasCycle();
  /**
   * <code>.stafihub.stafihub.rvalidator.Cycle cycle = 5 [json_name = "cycle"];</code>
   * @return The cycle.
   */
  com.stafihub.stafihub.rvalidator.Cycle getCycle();
  /**
   * <code>.stafihub.stafihub.rvalidator.Cycle cycle = 5 [json_name = "cycle"];</code>
   */
  com.stafihub.stafihub.rvalidator.CycleOrBuilder getCycleOrBuilder();

  /**
   * <code>.stafihub.stafihub.rvalidator.UpdateRValidatorStatus status = 6 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <code>.stafihub.stafihub.rvalidator.UpdateRValidatorStatus status = 6 [json_name = "status"];</code>
   * @return The status.
   */
  com.stafihub.stafihub.rvalidator.UpdateRValidatorStatus getStatus();
}
