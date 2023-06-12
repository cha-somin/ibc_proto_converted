// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/class_input.proto

package com.likechain.likenft.v1;

public interface ClassInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.ClassInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string symbol = 2 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 2 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string uri = 4 [json_name = "uri"];</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <code>string uri = 4 [json_name = "uri"];</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <code>string uri_hash = 5 [json_name = "uriHash"];</code>
   * @return The uriHash.
   */
  java.lang.String getUriHash();
  /**
   * <code>string uri_hash = 5 [json_name = "uriHash"];</code>
   * @return The bytes for uriHash.
   */
  com.google.protobuf.ByteString
      getUriHashBytes();

  /**
   * <code>bytes metadata = 6 [json_name = "metadata", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "JsonInput"];</code>
   * @return The metadata.
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <code>.likechain.likenft.v1.ClassConfig config = 7 [json_name = "config", (.gogoproto.nullable) = false];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <code>.likechain.likenft.v1.ClassConfig config = 7 [json_name = "config", (.gogoproto.nullable) = false];</code>
   * @return The config.
   */
  com.likechain.likenft.v1.ClassConfig getConfig();
  /**
   * <code>.likechain.likenft.v1.ClassConfig config = 7 [json_name = "config", (.gogoproto.nullable) = false];</code>
   */
  com.likechain.likenft.v1.ClassConfigOrBuilder getConfigOrBuilder();
}
