// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/tokenfactory/v1beta1/query.proto

package com.injective.tokenfactory.v1beta1;

public interface QueryDenomAuthorityMetadataRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.tokenfactory.v1beta1.QueryDenomAuthorityMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string creator = 1 [json_name = "creator", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The creator.
   */
  java.lang.String getCreator();
  /**
   * <code>string creator = 1 [json_name = "creator", (.gogoproto.moretags) = "yaml:&#92;"denom&#92;""];</code>
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString
      getCreatorBytes();

  /**
   * <code>string sub_denom = 2 [json_name = "subDenom", (.gogoproto.moretags) = "yaml:&#92;"sub_denom&#92;""];</code>
   * @return The subDenom.
   */
  java.lang.String getSubDenom();
  /**
   * <code>string sub_denom = 2 [json_name = "subDenom", (.gogoproto.moretags) = "yaml:&#92;"sub_denom&#92;""];</code>
   * @return The bytes for subDenom.
   */
  com.google.protobuf.ByteString
      getSubDenomBytes();
}
