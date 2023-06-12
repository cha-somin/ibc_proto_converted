// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/nft/v1beta1/nft.proto

package com.cosmos.nft.v1beta1;

public interface ClassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.nft.v1beta1.Class)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * id defines the unique identifier of the NFT classification, similar to the contract address of ERC721
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * id defines the unique identifier of the NFT classification, similar to the contract address of ERC721
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * name defines the human-readable name of the NFT classification. Optional
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name defines the human-readable name of the NFT classification. Optional
   * </pre>
   *
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * symbol is an abbreviated name for nft classification. Optional
   * </pre>
   *
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <pre>
   * symbol is an abbreviated name for nft classification. Optional
   * </pre>
   *
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <pre>
   * description is a brief description of nft classification. Optional
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * description is a brief description of nft classification. Optional
   * </pre>
   *
   * <code>string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * uri for the class metadata stored off chain. It can define schema for Class and NFT `Data` attributes. Optional
   * </pre>
   *
   * <code>string uri = 5 [json_name = "uri"];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * uri for the class metadata stored off chain. It can define schema for Class and NFT `Data` attributes. Optional
   * </pre>
   *
   * <code>string uri = 5 [json_name = "uri"];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * uri_hash is a hash of the document pointed by uri. Optional
   * </pre>
   *
   * <code>string uri_hash = 6 [json_name = "uriHash"];</code>
   * @return The uriHash.
   */
  java.lang.String getUriHash();
  /**
   * <pre>
   * uri_hash is a hash of the document pointed by uri. Optional
   * </pre>
   *
   * <code>string uri_hash = 6 [json_name = "uriHash"];</code>
   * @return The bytes for uriHash.
   */
  com.google.protobuf.ByteString
      getUriHashBytes();

  /**
   * <pre>
   * data is the app specific metadata of the NFT class. Optional
   * </pre>
   *
   * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
   * @return Whether the data field is set.
   */
  boolean hasData();
  /**
   * <pre>
   * data is the app specific metadata of the NFT class. Optional
   * </pre>
   *
   * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.Any getData();
  /**
   * <pre>
   * data is the app specific metadata of the NFT class. Optional
   * </pre>
   *
   * <code>.google.protobuf.Any data = 7 [json_name = "data"];</code>
   */
  com.google.protobuf.AnyOrBuilder getDataOrBuilder();
}
