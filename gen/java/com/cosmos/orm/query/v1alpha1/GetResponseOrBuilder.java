// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/orm/query/v1alpha1/query.proto

package com.cosmos.orm.query.v1alpha1;

public interface GetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.orm.query.v1alpha1.GetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * result is the result of the get query. If no value is found, the gRPC
   * status code NOT_FOUND will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 1 [json_name = "result"];</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * result is the result of the get query. If no value is found, the gRPC
   * status code NOT_FOUND will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 1 [json_name = "result"];</code>
   * @return The result.
   */
  com.google.protobuf.Any getResult();
  /**
   * <pre>
   * result is the result of the get query. If no value is found, the gRPC
   * status code NOT_FOUND will be returned.
   * </pre>
   *
   * <code>.google.protobuf.Any result = 1 [json_name = "result"];</code>
   */
  com.google.protobuf.AnyOrBuilder getResultOrBuilder();
}
