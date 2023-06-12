// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/nft/v1/nft.proto

package com.chainmain.nft.v1;

public interface IDCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainmain.nft.v1.IDCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The denomId.
   */
  java.lang.String getDenomId();
  /**
   * <code>string denom_id = 1 [json_name = "denomId", (.gogoproto.moretags) = "yaml:&#92;"denom_id&#92;""];</code>
   * @return The bytes for denomId.
   */
  com.google.protobuf.ByteString
      getDenomIdBytes();

  /**
   * <code>repeated string token_ids = 2 [json_name = "tokenIds", (.gogoproto.moretags) = "yaml:&#92;"token_ids&#92;""];</code>
   * @return A list containing the tokenIds.
   */
  java.util.List<java.lang.String>
      getTokenIdsList();
  /**
   * <code>repeated string token_ids = 2 [json_name = "tokenIds", (.gogoproto.moretags) = "yaml:&#92;"token_ids&#92;""];</code>
   * @return The count of tokenIds.
   */
  int getTokenIdsCount();
  /**
   * <code>repeated string token_ids = 2 [json_name = "tokenIds", (.gogoproto.moretags) = "yaml:&#92;"token_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The tokenIds at the given index.
   */
  java.lang.String getTokenIds(int index);
  /**
   * <code>repeated string token_ids = 2 [json_name = "tokenIds", (.gogoproto.moretags) = "yaml:&#92;"token_ids&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tokenIds at the given index.
   */
  com.google.protobuf.ByteString
      getTokenIdsBytes(int index);
}
