// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/did/v2/genesis.proto

package com.panacea.did.v2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.did.v2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, .panacea.did.v2.DIDDocumentWithSeq&gt; documents = 1 [json_name = "documents"];</code>
   */
  int getDocumentsCount();
  /**
   * <code>map&lt;string, .panacea.did.v2.DIDDocumentWithSeq&gt; documents = 1 [json_name = "documents"];</code>
   */
  boolean containsDocuments(
      java.lang.String key);
  /**
   * Use {@link #getDocumentsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.panacea.did.v2.DIDDocumentWithSeq>
  getDocuments();
  /**
   * <code>map&lt;string, .panacea.did.v2.DIDDocumentWithSeq&gt; documents = 1 [json_name = "documents"];</code>
   */
  java.util.Map<java.lang.String, com.panacea.did.v2.DIDDocumentWithSeq>
  getDocumentsMap();
  /**
   * <code>map&lt;string, .panacea.did.v2.DIDDocumentWithSeq&gt; documents = 1 [json_name = "documents"];</code>
   */
  /* nullable */
com.panacea.did.v2.DIDDocumentWithSeq getDocumentsOrDefault(
      java.lang.String key,
      /* nullable */
com.panacea.did.v2.DIDDocumentWithSeq defaultValue);
  /**
   * <code>map&lt;string, .panacea.did.v2.DIDDocumentWithSeq&gt; documents = 1 [json_name = "documents"];</code>
   */
  com.panacea.did.v2.DIDDocumentWithSeq getDocumentsOrThrow(
      java.lang.String key);
}
