// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/genesis.proto

package com.bitsong.fantoken.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bitsong.fantoken.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.bitsong.fantoken.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.bitsong.fantoken.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.bitsong.fantoken.v1beta1.Params getParams();
  /**
   * <code>.bitsong.fantoken.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.bitsong.fantoken.v1beta1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>repeated .bitsong.fantoken.v1beta1.FanToken fan_tokens = 2 [json_name = "fanTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.bitsong.fantoken.v1beta1.FanToken> 
      getFanTokensList();
  /**
   * <code>repeated .bitsong.fantoken.v1beta1.FanToken fan_tokens = 2 [json_name = "fanTokens", (.gogoproto.nullable) = false];</code>
   */
  com.bitsong.fantoken.v1beta1.FanToken getFanTokens(int index);
  /**
   * <code>repeated .bitsong.fantoken.v1beta1.FanToken fan_tokens = 2 [json_name = "fanTokens", (.gogoproto.nullable) = false];</code>
   */
  int getFanTokensCount();
  /**
   * <code>repeated .bitsong.fantoken.v1beta1.FanToken fan_tokens = 2 [json_name = "fanTokens", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.bitsong.fantoken.v1beta1.FanTokenOrBuilder> 
      getFanTokensOrBuilderList();
  /**
   * <code>repeated .bitsong.fantoken.v1beta1.FanToken fan_tokens = 2 [json_name = "fanTokens", (.gogoproto.nullable) = false];</code>
   */
  com.bitsong.fantoken.v1beta1.FanTokenOrBuilder getFanTokensOrBuilder(
      int index);
}
