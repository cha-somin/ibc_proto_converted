// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/proposal.proto

package com.injective.oracle.v1beta1;

public interface GrantBandOraclePrivilegeProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.oracle.v1beta1.GrantBandOraclePrivilegeProposal)
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
   * <code>repeated string relayers = 3 [json_name = "relayers"];</code>
   * @return A list containing the relayers.
   */
  java.util.List<java.lang.String>
      getRelayersList();
  /**
   * <code>repeated string relayers = 3 [json_name = "relayers"];</code>
   * @return The count of relayers.
   */
  int getRelayersCount();
  /**
   * <code>repeated string relayers = 3 [json_name = "relayers"];</code>
   * @param index The index of the element to return.
   * @return The relayers at the given index.
   */
  java.lang.String getRelayers(int index);
  /**
   * <code>repeated string relayers = 3 [json_name = "relayers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the relayers at the given index.
   */
  com.google.protobuf.ByteString
      getRelayersBytes(int index);
}
