// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/nft/v1/genesis.proto

package com.chainmain.nft.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainmain.nft.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .chainmain.nft.v1.Collection collections = 1 [json_name = "collections", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.chainmain.nft.v1.Collection> 
      getCollectionsList();
  /**
   * <code>repeated .chainmain.nft.v1.Collection collections = 1 [json_name = "collections", (.gogoproto.nullable) = false];</code>
   */
  com.chainmain.nft.v1.Collection getCollections(int index);
  /**
   * <code>repeated .chainmain.nft.v1.Collection collections = 1 [json_name = "collections", (.gogoproto.nullable) = false];</code>
   */
  int getCollectionsCount();
  /**
   * <code>repeated .chainmain.nft.v1.Collection collections = 1 [json_name = "collections", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.chainmain.nft.v1.CollectionOrBuilder> 
      getCollectionsOrBuilderList();
  /**
   * <code>repeated .chainmain.nft.v1.Collection collections = 1 [json_name = "collections", (.gogoproto.nullable) = false];</code>
   */
  com.chainmain.nft.v1.CollectionOrBuilder getCollectionsOrBuilder(
      int index);
}
