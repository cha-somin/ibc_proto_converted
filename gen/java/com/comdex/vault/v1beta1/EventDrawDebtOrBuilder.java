// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/events.proto

package com.comdex.vault.v1beta1;

public interface EventDrawDebtOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.EventDrawDebt)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner"];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string collateral_type = 2 [json_name = "collateralType"];</code>
   * @return The collateralType.
   */
  java.lang.String getCollateralType();
  /**
   * <code>string collateral_type = 2 [json_name = "collateralType"];</code>
   * @return The bytes for collateralType.
   */
  com.google.protobuf.ByteString
      getCollateralTypeBytes();

  /**
   * <code>.cosmos.base.v1beta1.Coin debt = 3 [json_name = "debt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payment&#92;""];</code>
   * @return Whether the debt field is set.
   */
  boolean hasDebt();
  /**
   * <code>.cosmos.base.v1beta1.Coin debt = 3 [json_name = "debt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payment&#92;""];</code>
   * @return The debt.
   */
  com.cosmos.base.v1beta1.Coin getDebt();
  /**
   * <code>.cosmos.base.v1beta1.Coin debt = 3 [json_name = "debt", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"payment&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getDebtOrBuilder();
}
