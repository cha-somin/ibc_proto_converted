// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teritori/mint/v1beta1/query.proto

package com.teritori.mint.v1beta1;

public interface QueryBlockProvisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:teritori.mint.v1beta1.QueryBlockProvisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * block_provisions is the current minting per epoch provisions value.
   * </pre>
   *
   * <code>bytes block_provisions = 1 [json_name = "blockProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The blockProvisions.
   */
  com.google.protobuf.ByteString getBlockProvisions();
}
