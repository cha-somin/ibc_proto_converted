// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/mint/v1beta1/mint.proto

package com.stride.mint.v1beta1;

public interface MinterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.mint.v1beta1.Minter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * current epoch provisions
   * </pre>
   *
   * <code>string epoch_provisions = 1 [json_name = "epochProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"epoch_provisions&#92;""];</code>
   * @return The epochProvisions.
   */
  java.lang.String getEpochProvisions();
  /**
   * <pre>
   * current epoch provisions
   * </pre>
   *
   * <code>string epoch_provisions = 1 [json_name = "epochProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"epoch_provisions&#92;""];</code>
   * @return The bytes for epochProvisions.
   */
  com.google.protobuf.ByteString
      getEpochProvisionsBytes();
}
