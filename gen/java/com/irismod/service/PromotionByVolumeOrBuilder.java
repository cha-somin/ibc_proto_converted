// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/service.proto

package com.irismod.service;

public interface PromotionByVolumeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.service.PromotionByVolume)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 volume = 1 [json_name = "volume"];</code>
   * @return The volume.
   */
  long getVolume();

  /**
   * <code>string discount = 2 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The discount.
   */
  java.lang.String getDiscount();
  /**
   * <code>string discount = 2 [json_name = "discount", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for discount.
   */
  com.google.protobuf.ByteString
      getDiscountBytes();
}
