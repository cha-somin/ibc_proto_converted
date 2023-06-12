// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/tx.proto

package com.umee.leverage.v1;

public interface MsgGovUpdateRegistryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.MsgGovUpdateRegistry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The authority.
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * authority is the address of the governance account.
   * </pre>
   *
   * <code>string authority = 1 [json_name = "authority", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for authority.
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 2 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * add_tokens defines new token settings.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token add_tokens = 4 [json_name = "addTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.umee.leverage.v1.Token> 
      getAddTokensList();
  /**
   * <pre>
   * add_tokens defines new token settings.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token add_tokens = 4 [json_name = "addTokens", (.gogoproto.nullable) = false];</code>
   */
  com.umee.leverage.v1.Token getAddTokens(int index);
  /**
   * <pre>
   * add_tokens defines new token settings.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token add_tokens = 4 [json_name = "addTokens", (.gogoproto.nullable) = false];</code>
   */
  int getAddTokensCount();
  /**
   * <pre>
   * add_tokens defines new token settings.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token add_tokens = 4 [json_name = "addTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.umee.leverage.v1.TokenOrBuilder> 
      getAddTokensOrBuilderList();
  /**
   * <pre>
   * add_tokens defines new token settings.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token add_tokens = 4 [json_name = "addTokens", (.gogoproto.nullable) = false];</code>
   */
  com.umee.leverage.v1.TokenOrBuilder getAddTokensOrBuilder(
      int index);

  /**
   * <pre>
   * update_tokens defines the new settings for existed tokens.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token update_tokens = 5 [json_name = "updateTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.umee.leverage.v1.Token> 
      getUpdateTokensList();
  /**
   * <pre>
   * update_tokens defines the new settings for existed tokens.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token update_tokens = 5 [json_name = "updateTokens", (.gogoproto.nullable) = false];</code>
   */
  com.umee.leverage.v1.Token getUpdateTokens(int index);
  /**
   * <pre>
   * update_tokens defines the new settings for existed tokens.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token update_tokens = 5 [json_name = "updateTokens", (.gogoproto.nullable) = false];</code>
   */
  int getUpdateTokensCount();
  /**
   * <pre>
   * update_tokens defines the new settings for existed tokens.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token update_tokens = 5 [json_name = "updateTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.umee.leverage.v1.TokenOrBuilder> 
      getUpdateTokensOrBuilderList();
  /**
   * <pre>
   * update_tokens defines the new settings for existed tokens.
   * </pre>
   *
   * <code>repeated .umee.leverage.v1.Token update_tokens = 5 [json_name = "updateTokens", (.gogoproto.nullable) = false];</code>
   */
  com.umee.leverage.v1.TokenOrBuilder getUpdateTokensOrBuilder(
      int index);
}
