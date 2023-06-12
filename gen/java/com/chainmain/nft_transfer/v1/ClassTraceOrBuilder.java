// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/nft_transfer/v1/trace.proto

package com.chainmain.nft_transfer.v1;

public interface ClassTraceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chainmain.nft_transfer.v1.ClassTrace)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * path defines the chain of port/channel identifiers used for tracing the
   * source of the non-fungible token.
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The path.
   */
  java.lang.String getPath();
  /**
   * <pre>
   * path defines the chain of port/channel identifiers used for tracing the
   * source of the non-fungible token.
   * </pre>
   *
   * <code>string path = 1 [json_name = "path"];</code>
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <pre>
   * base classID of the relayed non-fungible token.
   * </pre>
   *
   * <code>string base_class_id = 2 [json_name = "baseClassId"];</code>
   * @return The baseClassId.
   */
  java.lang.String getBaseClassId();
  /**
   * <pre>
   * base classID of the relayed non-fungible token.
   * </pre>
   *
   * <code>string base_class_id = 2 [json_name = "baseClassId"];</code>
   * @return The bytes for baseClassId.
   */
  com.google.protobuf.ByteString
      getBaseClassIdBytes();
}
