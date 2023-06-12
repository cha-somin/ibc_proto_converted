// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/market/v1/market.proto

package com.em.market.v1;

public interface ExecutionPlanOrBuilder extends
    // @@protoc_insertion_point(interface_extends:em.market.v1.ExecutionPlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string price = 1 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The price.
   */
  java.lang.String getPrice();
  /**
   * <code>string price = 1 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for price.
   */
  com.google.protobuf.ByteString
      getPriceBytes();

  /**
   * <code>.em.market.v1.Order first_order = 2 [json_name = "firstOrder"];</code>
   * @return Whether the firstOrder field is set.
   */
  boolean hasFirstOrder();
  /**
   * <code>.em.market.v1.Order first_order = 2 [json_name = "firstOrder"];</code>
   * @return The firstOrder.
   */
  com.em.market.v1.Order getFirstOrder();
  /**
   * <code>.em.market.v1.Order first_order = 2 [json_name = "firstOrder"];</code>
   */
  com.em.market.v1.OrderOrBuilder getFirstOrderOrBuilder();

  /**
   * <code>.em.market.v1.Order second_order = 3 [json_name = "secondOrder"];</code>
   * @return Whether the secondOrder field is set.
   */
  boolean hasSecondOrder();
  /**
   * <code>.em.market.v1.Order second_order = 3 [json_name = "secondOrder"];</code>
   * @return The secondOrder.
   */
  com.em.market.v1.Order getSecondOrder();
  /**
   * <code>.em.market.v1.Order second_order = 3 [json_name = "secondOrder"];</code>
   */
  com.em.market.v1.OrderOrBuilder getSecondOrderOrBuilder();
}
