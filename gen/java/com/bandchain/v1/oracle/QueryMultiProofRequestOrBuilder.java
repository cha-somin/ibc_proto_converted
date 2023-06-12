// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/bandchain/v1/oracle/proof.proto

package com.bandchain.v1.oracle;

public interface QueryMultiProofRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bandchain.v1.oracle.QueryMultiProofRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * request_ids is the list of request IDs
   * </pre>
   *
   * <code>repeated uint64 request_ids = 1 [json_name = "requestIds"];</code>
   * @return A list containing the requestIds.
   */
  java.util.List<java.lang.Long> getRequestIdsList();
  /**
   * <pre>
   * request_ids is the list of request IDs
   * </pre>
   *
   * <code>repeated uint64 request_ids = 1 [json_name = "requestIds"];</code>
   * @return The count of requestIds.
   */
  int getRequestIdsCount();
  /**
   * <pre>
   * request_ids is the list of request IDs
   * </pre>
   *
   * <code>repeated uint64 request_ids = 1 [json_name = "requestIds"];</code>
   * @param index The index of the element to return.
   * @return The requestIds at the given index.
   */
  long getRequestIds(int index);
}
