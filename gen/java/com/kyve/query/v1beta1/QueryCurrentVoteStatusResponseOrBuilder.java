// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/query/v1beta1/bundles.proto

package com.kyve.query.v1beta1;

public interface QueryCurrentVoteStatusResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.query.v1beta1.QueryCurrentVoteStatusResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * valid ...
   * </pre>
   *
   * <code>uint64 valid = 1 [json_name = "valid"];</code>
   * @return The valid.
   */
  long getValid();

  /**
   * <pre>
   * invalid ...
   * </pre>
   *
   * <code>uint64 invalid = 2 [json_name = "invalid"];</code>
   * @return The invalid.
   */
  long getInvalid();

  /**
   * <pre>
   * abstain ...
   * </pre>
   *
   * <code>uint64 abstain = 3 [json_name = "abstain"];</code>
   * @return The abstain.
   */
  long getAbstain();

  /**
   * <pre>
   * total ...
   * </pre>
   *
   * <code>uint64 total = 4 [json_name = "total"];</code>
   * @return The total.
   */
  long getTotal();
}
