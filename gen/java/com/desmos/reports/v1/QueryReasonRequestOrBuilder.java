// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/reports/v1/query.proto

package com.desmos.reports.v1;

public interface QueryReasonRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.reports.v1.QueryReasonRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of the subspace that holds the reason to query for
   * </pre>
   *
   * <code>uint64 subspace_id = 1 [json_name = "subspaceId", (.gogoproto.moretags) = "yaml:&#92;"subspace_id&#92;""];</code>
   * @return The subspaceId.
   */
  long getSubspaceId();

  /**
   * <pre>
   * Id of the reason to query for
   * </pre>
   *
   * <code>uint32 reason_id = 2 [json_name = "reasonId", (.gogoproto.moretags) = "yaml:&#92;"reason_id&#92;""];</code>
   * @return The reasonId.
   */
  int getReasonId();
}
