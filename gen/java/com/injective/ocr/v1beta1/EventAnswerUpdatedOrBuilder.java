// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/ocr.proto

package com.injective.ocr.v1beta1;

public interface EventAnswerUpdatedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.ocr.v1beta1.EventAnswerUpdated)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string current = 1 [json_name = "current", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The current.
   */
  java.lang.String getCurrent();
  /**
   * <code>string current = 1 [json_name = "current", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for current.
   */
  com.google.protobuf.ByteString
      getCurrentBytes();

  /**
   * <code>string round_id = 2 [json_name = "roundId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The roundId.
   */
  java.lang.String getRoundId();
  /**
   * <code>string round_id = 2 [json_name = "roundId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for roundId.
   */
  com.google.protobuf.ByteString
      getRoundIdBytes();

  /**
   * <code>.google.protobuf.Timestamp updated_at = 3 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the updatedAt field is set.
   */
  boolean hasUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 3 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The updatedAt.
   */
  com.google.protobuf.Timestamp getUpdatedAt();
  /**
   * <code>.google.protobuf.Timestamp updated_at = 3 [json_name = "updatedAt", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdatedAtOrBuilder();
}
