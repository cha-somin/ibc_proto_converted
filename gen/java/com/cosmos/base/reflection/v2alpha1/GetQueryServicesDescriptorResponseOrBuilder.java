// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package com.cosmos.base.reflection.v2alpha1;

public interface GetQueryServicesDescriptorResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.base.reflection.v2alpha1.GetQueryServicesDescriptorResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   * @return Whether the queries field is set.
   */
  boolean hasQueries();
  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   * @return The queries.
   */
  com.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor getQueries();
  /**
   * <pre>
   * queries provides information on the available queryable services
   * </pre>
   *
   * <code>.cosmos.base.reflection.v2alpha1.QueryServicesDescriptor queries = 1 [json_name = "queries"];</code>
   */
  com.cosmos.base.reflection.v2alpha1.QueryServicesDescriptorOrBuilder getQueriesOrBuilder();
}
