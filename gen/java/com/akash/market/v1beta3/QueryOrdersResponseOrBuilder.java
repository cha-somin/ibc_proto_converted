// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta3/query.proto

package com.akash.market.v1beta3;

public interface QueryOrdersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta3.QueryOrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.market.v1beta3.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Orders"];</code>
   */
  java.util.List<com.akash.market.v1beta3.Order> 
      getOrdersList();
  /**
   * <code>repeated .akash.market.v1beta3.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Orders"];</code>
   */
  com.akash.market.v1beta3.Order getOrders(int index);
  /**
   * <code>repeated .akash.market.v1beta3.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Orders"];</code>
   */
  int getOrdersCount();
  /**
   * <code>repeated .akash.market.v1beta3.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Orders"];</code>
   */
  java.util.List<? extends com.akash.market.v1beta3.OrderOrBuilder> 
      getOrdersOrBuilderList();
  /**
   * <code>repeated .akash.market.v1beta3.Order orders = 1 [json_name = "orders", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "Orders"];</code>
   */
  com.akash.market.v1beta3.OrderOrBuilder getOrdersOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
