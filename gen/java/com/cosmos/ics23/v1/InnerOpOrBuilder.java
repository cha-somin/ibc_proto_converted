// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/ics23/v1/proofs.proto

package com.cosmos.ics23.v1;

public interface InnerOpOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.ics23.v1.InnerOp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.ics23.v1.HashOp hash = 1 [json_name = "hash"];</code>
   * @return The enum numeric value on the wire for hash.
   */
  int getHashValue();
  /**
   * <code>.cosmos.ics23.v1.HashOp hash = 1 [json_name = "hash"];</code>
   * @return The hash.
   */
  com.cosmos.ics23.v1.HashOp getHash();

  /**
   * <code>bytes prefix = 2 [json_name = "prefix"];</code>
   * @return The prefix.
   */
  com.google.protobuf.ByteString getPrefix();

  /**
   * <code>bytes suffix = 3 [json_name = "suffix"];</code>
   * @return The suffix.
   */
  com.google.protobuf.ByteString getSuffix();
}
