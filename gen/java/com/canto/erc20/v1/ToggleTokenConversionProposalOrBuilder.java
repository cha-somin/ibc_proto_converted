// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/erc20/v1/erc20.proto

package com.canto.erc20.v1;

public interface ToggleTokenConversionProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:canto.erc20.v1.ToggleTokenConversionProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * title of the proposal
   * </pre>
   *
   * <code>string Title = 1 [json_name = "Title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * title of the proposal
   * </pre>
   *
   * <code>string Title = 1 [json_name = "Title"];</code>
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
   * token identifier can be either the hex contract address of the ERC20 or the
   * Cosmos base denomination
   * </pre>
   *
   * <code>string token = 3 [json_name = "token"];</code>
   * @return The token.
   */
  java.lang.String getToken();
  /**
   * <pre>
   * token identifier can be either the hex contract address of the ERC20 or the
   * Cosmos base denomination
   * </pre>
   *
   * <code>string token = 3 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString
      getTokenBytes();
}
