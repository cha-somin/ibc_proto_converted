// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package com.provenance.metadata.v1;

public interface RecordSpecificationResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.RecordSpecificationResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_specification is the wrapped record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationWrapper record_specification = 1 [json_name = "recordSpecification", (.gogoproto.moretags) = "yaml:&#92;"record_specification&#92;""];</code>
   * @return Whether the recordSpecification field is set.
   */
  boolean hasRecordSpecification();
  /**
   * <pre>
   * record_specification is the wrapped record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationWrapper record_specification = 1 [json_name = "recordSpecification", (.gogoproto.moretags) = "yaml:&#92;"record_specification&#92;""];</code>
   * @return The recordSpecification.
   */
  com.provenance.metadata.v1.RecordSpecificationWrapper getRecordSpecification();
  /**
   * <pre>
   * record_specification is the wrapped record specification.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationWrapper record_specification = 1 [json_name = "recordSpecification", (.gogoproto.moretags) = "yaml:&#92;"record_specification&#92;""];</code>
   */
  com.provenance.metadata.v1.RecordSpecificationWrapperOrBuilder getRecordSpecificationOrBuilder();

  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationRequest request = 98 [json_name = "request"];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationRequest request = 98 [json_name = "request"];</code>
   * @return The request.
   */
  com.provenance.metadata.v1.RecordSpecificationRequest getRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationRequest request = 98 [json_name = "request"];</code>
   */
  com.provenance.metadata.v1.RecordSpecificationRequestOrBuilder getRequestOrBuilder();
}
