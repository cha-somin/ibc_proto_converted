// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/superfluid/superfluid.proto

package com.osmosis.superfluid;

public interface SuperfluidAssetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.superfluid.SuperfluidAsset)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <pre>
   * AssetType indicates whether the superfluid asset is a native token or an lp
   * share
   * </pre>
   *
   * <code>.osmosis.superfluid.SuperfluidAssetType asset_type = 2 [json_name = "assetType"];</code>
   * @return The enum numeric value on the wire for assetType.
   */
  int getAssetTypeValue();
  /**
   * <pre>
   * AssetType indicates whether the superfluid asset is a native token or an lp
   * share
   * </pre>
   *
   * <code>.osmosis.superfluid.SuperfluidAssetType asset_type = 2 [json_name = "assetType"];</code>
   * @return The assetType.
   */
  com.osmosis.superfluid.SuperfluidAssetType getAssetType();
}
