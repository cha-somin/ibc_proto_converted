// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package com.panacea.did.v2;

public interface DataWithSeqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.DataWithSeq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes data = 1 [json_name = "data"];</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  long getSequence();
}
