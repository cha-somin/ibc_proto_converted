// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/globalfee/v1/proposal.proto

package com.publicawesome.stargaze.globalfee.v1;

public interface RemoveCodeAuthorizationProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:publicawesome.stargaze.globalfee.v1.RemoveCodeAuthorizationProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>uint64 code_id = 3 [json_name = "codeId", (.gogoproto.customname) = "CodeID", (.gogoproto.moretags) = "yaml:&#92;"code_id&#92;""];</code>
   * @return The codeId.
   */
  long getCodeId();
}
