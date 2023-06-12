// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/specification.proto

package com.provenance.metadata.v1;

public interface InputSpecificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.InputSpecification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name for this input
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name for this input
   * </pre>
   *
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * a type_name (typically a proto name or class_name)
   * </pre>
   *
   * <code>string type_name = 2 [json_name = "typeName", (.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
   * @return The typeName.
   */
  java.lang.String getTypeName();
  /**
   * <pre>
   * a type_name (typically a proto name or class_name)
   * </pre>
   *
   * <code>string type_name = 2 [json_name = "typeName", (.gogoproto.moretags) = "yaml:&#92;"type_name&#92;""];</code>
   * @return The bytes for typeName.
   */
  com.google.protobuf.ByteString
      getTypeNameBytes();

  /**
   * <pre>
   * the address of a record on chain (For Established Records)
   * </pre>
   *
   * <code>bytes record_id = 3 [json_name = "recordId", (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
   * @return Whether the recordId field is set.
   */
  boolean hasRecordId();
  /**
   * <pre>
   * the address of a record on chain (For Established Records)
   * </pre>
   *
   * <code>bytes record_id = 3 [json_name = "recordId", (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"record_id&#92;""];</code>
   * @return The recordId.
   */
  com.google.protobuf.ByteString getRecordId();

  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4 [json_name = "hash"];</code>
   * @return Whether the hash field is set.
   */
  boolean hasHash();
  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4 [json_name = "hash"];</code>
   * @return The hash.
   */
  java.lang.String getHash();
  /**
   * <pre>
   * the hash of an off-chain piece of information (For Proposed Records)
   * </pre>
   *
   * <code>string hash = 4 [json_name = "hash"];</code>
   * @return The bytes for hash.
   */
  com.google.protobuf.ByteString
      getHashBytes();

  com.provenance.metadata.v1.InputSpecification.SourceCase getSourceCase();
}
