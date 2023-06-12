// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/events.proto

package com.umee.leverage.v1;

public interface EventFundOracleOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.EventFundOracle)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Assets sent to oracle module
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin assets = 1 [json_name = "assets", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getAssetsList();
  /**
   * <pre>
   * Assets sent to oracle module
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin assets = 1 [json_name = "assets", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.Coin getAssets(int index);
  /**
   * <pre>
   * Assets sent to oracle module
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin assets = 1 [json_name = "assets", (.gogoproto.nullable) = false];</code>
   */
  int getAssetsCount();
  /**
   * <pre>
   * Assets sent to oracle module
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin assets = 1 [json_name = "assets", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAssetsOrBuilderList();
  /**
   * <pre>
   * Assets sent to oracle module
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin assets = 1 [json_name = "assets", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getAssetsOrBuilder(
      int index);
}
