// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/gov.proto

package com.comdex.lend.v1beta1;

public interface LendPairsProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.lend.v1beta1.LendPairsProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title", (.gogoproto.moretags) = "yaml:&#92;"title&#92;""];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description", (.gogoproto.moretags) = "yaml:&#92;"description&#92;""];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.comdex.lend.v1beta1.Extended_Pair pairs = 3 [json_name = "pairs", (.gogoproto.nullable) = false];</code>
   * @return Whether the pairs field is set.
   */
  boolean hasPairs();
  /**
   * <code>.comdex.lend.v1beta1.Extended_Pair pairs = 3 [json_name = "pairs", (.gogoproto.nullable) = false];</code>
   * @return The pairs.
   */
  com.comdex.lend.v1beta1.Extended_Pair getPairs();
  /**
   * <code>.comdex.lend.v1beta1.Extended_Pair pairs = 3 [json_name = "pairs", (.gogoproto.nullable) = false];</code>
   */
  com.comdex.lend.v1beta1.Extended_PairOrBuilder getPairsOrBuilder();
}
