// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/erc20/v1/erc20.proto

package com.evmos.erc20.v1;

public interface ProposalMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:evmos.erc20.v1.ProposalMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * metadata slice of the native Cosmos coins
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.cosmos.bank.v1beta1.Metadata> 
      getMetadataList();
  /**
   * <pre>
   * metadata slice of the native Cosmos coins
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.bank.v1beta1.Metadata getMetadata(int index);
  /**
   * <pre>
   * metadata slice of the native Cosmos coins
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  int getMetadataCount();
  /**
   * <pre>
   * metadata slice of the native Cosmos coins
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.cosmos.bank.v1beta1.MetadataOrBuilder> 
      getMetadataOrBuilderList();
  /**
   * <pre>
   * metadata slice of the native Cosmos coins
   * </pre>
   *
   * <code>repeated .cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder(
      int index);
}
