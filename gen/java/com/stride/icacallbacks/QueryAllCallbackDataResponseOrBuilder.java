// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/icacallbacks/query.proto

package com.stride.icacallbacks;

public interface QueryAllCallbackDataResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:stride.icacallbacks.QueryAllCallbackDataResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.stride.icacallbacks.CallbackData> 
      getCallbackDataList();
  /**
   * <code>repeated .stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  com.stride.icacallbacks.CallbackData getCallbackData(int index);
  /**
   * <code>repeated .stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  int getCallbackDataCount();
  /**
   * <code>repeated .stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.stride.icacallbacks.CallbackDataOrBuilder> 
      getCallbackDataOrBuilderList();
  /**
   * <code>repeated .stride.icacallbacks.CallbackData callback_data = 1 [json_name = "callbackData", (.gogoproto.nullable) = false];</code>
   */
  com.stride.icacallbacks.CallbackDataOrBuilder getCallbackDataOrBuilder(
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
