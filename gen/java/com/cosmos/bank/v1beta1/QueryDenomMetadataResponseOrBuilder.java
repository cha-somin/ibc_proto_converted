// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/v1beta1/query.proto

package com.cosmos.bank.v1beta1;

public interface QueryDenomMetadataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.bank.v1beta1.QueryDenomMetadataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   * @return The metadata.
   */
  com.cosmos.bank.v1beta1.Metadata getMetadata();
  /**
   * <pre>
   * metadata describes and provides all the client information for the requested token.
   * </pre>
   *
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false, (.amino.dont_omitempty) = true];</code>
   */
  com.cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder();
}
