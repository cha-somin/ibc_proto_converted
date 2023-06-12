// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/msgfees/v1/proposals.proto

package com.provenance.msgfees.v1;

public interface UpdateConversionFeeDenomProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.msgfees.v1.UpdateConversionFeeDenomProposal)
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
   * conversion_fee_denom is the denom that usd will be converted to
   * </pre>
   *
   * <code>string conversion_fee_denom = 4 [json_name = "conversionFeeDenom"];</code>
   * @return The conversionFeeDenom.
   */
  java.lang.String getConversionFeeDenom();
  /**
   * <pre>
   * conversion_fee_denom is the denom that usd will be converted to
   * </pre>
   *
   * <code>string conversion_fee_denom = 4 [json_name = "conversionFeeDenom"];</code>
   * @return The bytes for conversionFeeDenom.
   */
  com.google.protobuf.ByteString
      getConversionFeeDenomBytes();
}
