// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface FeeDiscountProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.FeeDiscountProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountSchedule schedule = 3 [json_name = "schedule"];</code>
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountSchedule schedule = 3 [json_name = "schedule"];</code>
   * @return The schedule.
   */
  com.injective.exchange.v1beta1.FeeDiscountSchedule getSchedule();
  /**
   * <code>.injective.exchange.v1beta1.FeeDiscountSchedule schedule = 3 [json_name = "schedule"];</code>
   */
  com.injective.exchange.v1beta1.FeeDiscountScheduleOrBuilder getScheduleOrBuilder();
}
