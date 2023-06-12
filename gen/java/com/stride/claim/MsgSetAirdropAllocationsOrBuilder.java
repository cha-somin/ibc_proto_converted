// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/claim/tx.proto

package com.stride.claim;

public interface MsgSetAirdropAllocationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.claim.MsgSetAirdropAllocations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string allocator = 1 [json_name = "allocator"];</code>
   * @return The allocator.
   */
  java.lang.String getAllocator();
  /**
   * <code>string allocator = 1 [json_name = "allocator"];</code>
   * @return The bytes for allocator.
   */
  com.google.protobuf.ByteString
      getAllocatorBytes();

  /**
   * <code>string airdrop_identifier = 2 [json_name = "airdropIdentifier", (.gogoproto.moretags) = "yaml:&#92;"airdrop_identifier&#92;""];</code>
   * @return The airdropIdentifier.
   */
  java.lang.String getAirdropIdentifier();
  /**
   * <code>string airdrop_identifier = 2 [json_name = "airdropIdentifier", (.gogoproto.moretags) = "yaml:&#92;"airdrop_identifier&#92;""];</code>
   * @return The bytes for airdropIdentifier.
   */
  com.google.protobuf.ByteString
      getAirdropIdentifierBytes();

  /**
   * <code>repeated string users = 3 [json_name = "users"];</code>
   * @return A list containing the users.
   */
  java.util.List<java.lang.String>
      getUsersList();
  /**
   * <code>repeated string users = 3 [json_name = "users"];</code>
   * @return The count of users.
   */
  int getUsersCount();
  /**
   * <code>repeated string users = 3 [json_name = "users"];</code>
   * @param index The index of the element to return.
   * @return The users at the given index.
   */
  java.lang.String getUsers(int index);
  /**
   * <code>repeated string users = 3 [json_name = "users"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the users at the given index.
   */
  com.google.protobuf.ByteString
      getUsersBytes(int index);

  /**
   * <code>repeated string weights = 4 [json_name = "weights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weights&#92;""];</code>
   * @return A list containing the weights.
   */
  java.util.List<java.lang.String>
      getWeightsList();
  /**
   * <code>repeated string weights = 4 [json_name = "weights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weights&#92;""];</code>
   * @return The count of weights.
   */
  int getWeightsCount();
  /**
   * <code>repeated string weights = 4 [json_name = "weights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weights&#92;""];</code>
   * @param index The index of the element to return.
   * @return The weights at the given index.
   */
  java.lang.String getWeights(int index);
  /**
   * <code>repeated string weights = 4 [json_name = "weights", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.moretags) = "yaml:&#92;"weights&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the weights at the given index.
   */
  com.google.protobuf.ByteString
      getWeightsBytes(int index);
}
