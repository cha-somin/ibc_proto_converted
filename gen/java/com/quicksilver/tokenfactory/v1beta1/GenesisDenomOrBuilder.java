// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/tokenfactory/v1beta1/genesis.proto

package com.quicksilver.tokenfactory.v1beta1;

public interface GenesisDenomOrBuilder extends
    // @@protoc_insertion_point(interface_extends:quicksilver.tokenfactory.v1beta1.GenesisDenom)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 2 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   * @return Whether the authorityMetadata field is set.
   */
  boolean hasAuthorityMetadata();
  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 2 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   * @return The authorityMetadata.
   */
  com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata getAuthorityMetadata();
  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 2 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   */
  com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder getAuthorityMetadataOrBuilder();
}
