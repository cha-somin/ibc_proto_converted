// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reactions/v1/msgs.proto

package com.desmos.reactions.v1;

public interface MsgAddRegisteredReactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.reactions.v1.MsgAddRegisteredReaction)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace inside which this reaction should be registered
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.customname) = "SubspaceID", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Shorthand code of the reaction
   * </pre>
   *
   * <code>string shorthand_code = 2 [json_name = "shorthandCode", (.gogoproto.moretags) = "yaml:&#92;"shorthand_code&#92;""];</code>
   * @return The shorthandCode.
   */
  java.lang.String getShorthandCode();
  /**
   * <pre>
   * Shorthand code of the reaction
   * </pre>
   *
   * <code>string shorthand_code = 2 [json_name = "shorthandCode", (.gogoproto.moretags) = "yaml:&#92;"shorthand_code&#92;""];</code>
   * @return The bytes for shorthandCode.
   */
  com.google.protobuf.ByteString
      getShorthandCodeBytes();

  /**
   * <pre>
   * Display value of the reaction
   * </pre>
   *
   * <code>string display_value = 3 [json_name = "displayValue", (.gogoproto.moretags) = "yaml:&#92;"display_value&#92;""];</code>
   * @return The displayValue.
   */
  java.lang.String getDisplayValue();
  /**
   * <pre>
   * Display value of the reaction
   * </pre>
   *
   * <code>string display_value = 3 [json_name = "displayValue", (.gogoproto.moretags) = "yaml:&#92;"display_value&#92;""];</code>
   * @return The bytes for displayValue.
   */
  com.google.protobuf.ByteString
      getDisplayValueBytes();

  /**
   * <pre>
   * User adding the supported reaction
   * </pre>
   *
   * <code>string user = 4 [json_name = "user", (.gogoproto.moretags) = "yaml:&#92;"user&#92;""];</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <pre>
   * User adding the supported reaction
   * </pre>
   *
   * <code>string user = 4 [json_name = "user", (.gogoproto.moretags) = "yaml:&#92;"user&#92;""];</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();
}
