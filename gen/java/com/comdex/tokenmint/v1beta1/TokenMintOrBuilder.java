// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/tokenmint/v1beta1/mint.proto

package com.comdex.tokenmint.v1beta1;

public interface TokenMintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.tokenmint.v1beta1.TokenMint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.customname) = "AppId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>repeated .comdex.tokenmint.v1beta1.MintedTokens minted_tokens = 2 [json_name = "mintedTokens", (.gogoproto.moretags) = "yaml:&#92;"minted_tokens&#92;""];</code>
   */
  java.util.List<com.comdex.tokenmint.v1beta1.MintedTokens> 
      getMintedTokensList();
  /**
   * <code>repeated .comdex.tokenmint.v1beta1.MintedTokens minted_tokens = 2 [json_name = "mintedTokens", (.gogoproto.moretags) = "yaml:&#92;"minted_tokens&#92;""];</code>
   */
  com.comdex.tokenmint.v1beta1.MintedTokens getMintedTokens(int index);
  /**
   * <code>repeated .comdex.tokenmint.v1beta1.MintedTokens minted_tokens = 2 [json_name = "mintedTokens", (.gogoproto.moretags) = "yaml:&#92;"minted_tokens&#92;""];</code>
   */
  int getMintedTokensCount();
  /**
   * <code>repeated .comdex.tokenmint.v1beta1.MintedTokens minted_tokens = 2 [json_name = "mintedTokens", (.gogoproto.moretags) = "yaml:&#92;"minted_tokens&#92;""];</code>
   */
  java.util.List<? extends com.comdex.tokenmint.v1beta1.MintedTokensOrBuilder> 
      getMintedTokensOrBuilderList();
  /**
   * <code>repeated .comdex.tokenmint.v1beta1.MintedTokens minted_tokens = 2 [json_name = "mintedTokens", (.gogoproto.moretags) = "yaml:&#92;"minted_tokens&#92;""];</code>
   */
  com.comdex.tokenmint.v1beta1.MintedTokensOrBuilder getMintedTokensOrBuilder(
      int index);
}
