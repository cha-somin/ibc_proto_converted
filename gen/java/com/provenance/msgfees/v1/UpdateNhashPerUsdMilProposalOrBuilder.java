// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/proposals.proto

package com.provenance.msgfees.v1;

public interface UpdateNhashPerUsdMilProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.msgfees.v1.UpdateNhashPerUsdMilProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * proposal title
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * proposal title
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * proposal description
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * proposal description
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * nhash_per_usd_mil is number of nhash per usd mil
   * </pre>
   *
   * <code>uint64 nhash_per_usd_mil = 3 [json_name = "nhashPerUsdMil"];</code>
   * @return The nhashPerUsdMil.
   */
  long getNhashPerUsdMil();
}
