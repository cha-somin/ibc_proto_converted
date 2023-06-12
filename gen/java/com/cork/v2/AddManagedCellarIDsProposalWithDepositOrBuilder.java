// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/cork/v2/proposal.proto

package com.cork.v2;

public interface AddManagedCellarIDsProposalWithDepositOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cork.v2.AddManagedCellarIDsProposalWithDeposit)
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
   * <code>repeated string cellar_ids = 3 [json_name = "cellarIds"];</code>
   * @return A list containing the cellarIds.
   */
  java.util.List<java.lang.String>
      getCellarIdsList();
  /**
   * <code>repeated string cellar_ids = 3 [json_name = "cellarIds"];</code>
   * @return The count of cellarIds.
   */
  int getCellarIdsCount();
  /**
   * <code>repeated string cellar_ids = 3 [json_name = "cellarIds"];</code>
   * @param index The index of the element to return.
   * @return The cellarIds at the given index.
   */
  java.lang.String getCellarIds(int index);
  /**
   * <code>repeated string cellar_ids = 3 [json_name = "cellarIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the cellarIds at the given index.
   */
  com.google.protobuf.ByteString
      getCellarIdsBytes(int index);

  /**
   * <code>string deposit = 4 [json_name = "deposit"];</code>
   * @return The deposit.
   */
  java.lang.String getDeposit();
  /**
   * <code>string deposit = 4 [json_name = "deposit"];</code>
   * @return The bytes for deposit.
   */
  com.google.protobuf.ByteString
      getDepositBytes();
}
