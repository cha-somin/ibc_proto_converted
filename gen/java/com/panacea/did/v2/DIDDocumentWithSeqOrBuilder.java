// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/did.proto

package com.panacea.did.v2;

public interface DIDDocumentWithSeqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.DIDDocumentWithSeq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   * @return The document.
   */
  com.panacea.did.v2.DIDDocument getDocument();
  /**
   * <code>.panacea.did.v2.DIDDocument document = 1 [json_name = "document"];</code>
   */
  com.panacea.did.v2.DIDDocumentOrBuilder getDocumentOrBuilder();

  /**
   * <code>uint64 sequence = 2 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  long getSequence();
}
