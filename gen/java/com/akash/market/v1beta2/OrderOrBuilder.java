// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/order.proto

package com.akash.market.v1beta2;

public interface OrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta2.Order)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.akash.market.v1beta2.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return Whether the orderId field is set.
   */
  boolean hasOrderId();
  /**
   * <code>.akash.market.v1beta2.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The orderId.
   */
  com.akash.market.v1beta2.OrderID getOrderId();
  /**
   * <code>.akash.market.v1beta2.OrderID order_id = 1 [json_name = "orderId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "OrderID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  com.akash.market.v1beta2.OrderIDOrBuilder getOrderIdOrBuilder();

  /**
   * <code>.akash.market.v1beta2.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <code>.akash.market.v1beta2.Order.State state = 2 [json_name = "state", (.gogoproto.jsontag) = "state", (.gogoproto.moretags) = "yaml:&#92;"state&#92;""];</code>
   * @return The state.
   */
  com.akash.market.v1beta2.Order.State getState();

  /**
   * <code>.akash.deployment.v1beta2.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   * @return Whether the spec field is set.
   */
  boolean hasSpec();
  /**
   * <code>.akash.deployment.v1beta2.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   * @return The spec.
   */
  com.akash.deployment.v1beta2.GroupSpec getSpec();
  /**
   * <code>.akash.deployment.v1beta2.GroupSpec spec = 3 [json_name = "spec", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "spec", (.gogoproto.moretags) = "yaml:&#92;"spec&#92;""];</code>
   */
  com.akash.deployment.v1beta2.GroupSpecOrBuilder getSpecOrBuilder();

  /**
   * <code>int64 created_at = 4 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  long getCreatedAt();
}
