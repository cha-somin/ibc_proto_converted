// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/nft.proto

package com.cudosnode.cudosnode.nft;

public interface OwnerOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cudosnode.cudosnode.nft.Owner)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  java.util.List<com.cudosnode.cudosnode.nft.IDCollection> 
      getIdCollectionsList();
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  com.cudosnode.cudosnode.nft.IDCollection getIdCollections(int index);
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  int getIdCollectionsCount();
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  java.util.List<? extends com.cudosnode.cudosnode.nft.IDCollectionOrBuilder> 
      getIdCollectionsOrBuilderList();
  /**
   * <code>repeated .cudosnode.cudosnode.nft.IDCollection id_collections = 2 [json_name = "idCollections", (.gogoproto.nullable) = false, (.gogoproto.customname) = "IDCollections", (.gogoproto.moretags) = "yaml:&#92;"idcs&#92;""];</code>
   */
  com.cudosnode.cudosnode.nft.IDCollectionOrBuilder getIdCollectionsOrBuilder(
      int index);
}
