// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/query.proto

package com.provenance.metadata.v1;

public interface RecordSpecificationsAllResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.RecordSpecificationsAllResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * record_specifications are the wrapped record specifications.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [json_name = "recordSpecifications", (.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  java.util.List<com.provenance.metadata.v1.RecordSpecificationWrapper> 
      getRecordSpecificationsList();
  /**
   * <pre>
   * record_specifications are the wrapped record specifications.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [json_name = "recordSpecifications", (.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  com.provenance.metadata.v1.RecordSpecificationWrapper getRecordSpecifications(int index);
  /**
   * <pre>
   * record_specifications are the wrapped record specifications.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [json_name = "recordSpecifications", (.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  int getRecordSpecificationsCount();
  /**
   * <pre>
   * record_specifications are the wrapped record specifications.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [json_name = "recordSpecifications", (.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  java.util.List<? extends com.provenance.metadata.v1.RecordSpecificationWrapperOrBuilder> 
      getRecordSpecificationsOrBuilderList();
  /**
   * <pre>
   * record_specifications are the wrapped record specifications.
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.RecordSpecificationWrapper record_specifications = 1 [json_name = "recordSpecifications", (.gogoproto.moretags) = "yaml:&#92;"record_specifications&#92;""];</code>
   */
  com.provenance.metadata.v1.RecordSpecificationWrapperOrBuilder getRecordSpecificationsOrBuilder(
      int index);

  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsAllRequest request = 98 [json_name = "request"];</code>
   * @return Whether the request field is set.
   */
  boolean hasRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsAllRequest request = 98 [json_name = "request"];</code>
   * @return The request.
   */
  com.provenance.metadata.v1.RecordSpecificationsAllRequest getRequest();
  /**
   * <pre>
   * request is a copy of the request that generated these results.
   * </pre>
   *
   * <code>.provenance.metadata.v1.RecordSpecificationsAllRequest request = 98 [json_name = "request"];</code>
   */
  com.provenance.metadata.v1.RecordSpecificationsAllRequestOrBuilder getRequestOrBuilder();

  /**
   * <pre>
   * pagination provides the pagination information of this response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <pre>
   * pagination provides the pagination information of this response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <pre>
   * pagination provides the pagination information of this response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 99 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
