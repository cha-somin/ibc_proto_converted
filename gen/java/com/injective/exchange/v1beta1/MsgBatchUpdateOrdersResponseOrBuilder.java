// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/tx.proto

package com.injective.exchange.v1beta1;

public interface MsgBatchUpdateOrdersResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.MsgBatchUpdateOrdersResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated bool spot_cancel_success = 1 [json_name = "spotCancelSuccess"];</code>
   * @return A list containing the spotCancelSuccess.
   */
  java.util.List<java.lang.Boolean> getSpotCancelSuccessList();
  /**
   * <code>repeated bool spot_cancel_success = 1 [json_name = "spotCancelSuccess"];</code>
   * @return The count of spotCancelSuccess.
   */
  int getSpotCancelSuccessCount();
  /**
   * <code>repeated bool spot_cancel_success = 1 [json_name = "spotCancelSuccess"];</code>
   * @param index The index of the element to return.
   * @return The spotCancelSuccess at the given index.
   */
  boolean getSpotCancelSuccess(int index);

  /**
   * <code>repeated bool derivative_cancel_success = 2 [json_name = "derivativeCancelSuccess"];</code>
   * @return A list containing the derivativeCancelSuccess.
   */
  java.util.List<java.lang.Boolean> getDerivativeCancelSuccessList();
  /**
   * <code>repeated bool derivative_cancel_success = 2 [json_name = "derivativeCancelSuccess"];</code>
   * @return The count of derivativeCancelSuccess.
   */
  int getDerivativeCancelSuccessCount();
  /**
   * <code>repeated bool derivative_cancel_success = 2 [json_name = "derivativeCancelSuccess"];</code>
   * @param index The index of the element to return.
   * @return The derivativeCancelSuccess at the given index.
   */
  boolean getDerivativeCancelSuccess(int index);

  /**
   * <code>repeated string spot_order_hashes = 3 [json_name = "spotOrderHashes"];</code>
   * @return A list containing the spotOrderHashes.
   */
  java.util.List<java.lang.String>
      getSpotOrderHashesList();
  /**
   * <code>repeated string spot_order_hashes = 3 [json_name = "spotOrderHashes"];</code>
   * @return The count of spotOrderHashes.
   */
  int getSpotOrderHashesCount();
  /**
   * <code>repeated string spot_order_hashes = 3 [json_name = "spotOrderHashes"];</code>
   * @param index The index of the element to return.
   * @return The spotOrderHashes at the given index.
   */
  java.lang.String getSpotOrderHashes(int index);
  /**
   * <code>repeated string spot_order_hashes = 3 [json_name = "spotOrderHashes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the spotOrderHashes at the given index.
   */
  com.google.protobuf.ByteString
      getSpotOrderHashesBytes(int index);

  /**
   * <code>repeated string derivative_order_hashes = 4 [json_name = "derivativeOrderHashes"];</code>
   * @return A list containing the derivativeOrderHashes.
   */
  java.util.List<java.lang.String>
      getDerivativeOrderHashesList();
  /**
   * <code>repeated string derivative_order_hashes = 4 [json_name = "derivativeOrderHashes"];</code>
   * @return The count of derivativeOrderHashes.
   */
  int getDerivativeOrderHashesCount();
  /**
   * <code>repeated string derivative_order_hashes = 4 [json_name = "derivativeOrderHashes"];</code>
   * @param index The index of the element to return.
   * @return The derivativeOrderHashes at the given index.
   */
  java.lang.String getDerivativeOrderHashes(int index);
  /**
   * <code>repeated string derivative_order_hashes = 4 [json_name = "derivativeOrderHashes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the derivativeOrderHashes at the given index.
   */
  com.google.protobuf.ByteString
      getDerivativeOrderHashesBytes(int index);

  /**
   * <code>repeated bool binary_options_cancel_success = 5 [json_name = "binaryOptionsCancelSuccess"];</code>
   * @return A list containing the binaryOptionsCancelSuccess.
   */
  java.util.List<java.lang.Boolean> getBinaryOptionsCancelSuccessList();
  /**
   * <code>repeated bool binary_options_cancel_success = 5 [json_name = "binaryOptionsCancelSuccess"];</code>
   * @return The count of binaryOptionsCancelSuccess.
   */
  int getBinaryOptionsCancelSuccessCount();
  /**
   * <code>repeated bool binary_options_cancel_success = 5 [json_name = "binaryOptionsCancelSuccess"];</code>
   * @param index The index of the element to return.
   * @return The binaryOptionsCancelSuccess at the given index.
   */
  boolean getBinaryOptionsCancelSuccess(int index);

  /**
   * <code>repeated string binary_options_order_hashes = 6 [json_name = "binaryOptionsOrderHashes"];</code>
   * @return A list containing the binaryOptionsOrderHashes.
   */
  java.util.List<java.lang.String>
      getBinaryOptionsOrderHashesList();
  /**
   * <code>repeated string binary_options_order_hashes = 6 [json_name = "binaryOptionsOrderHashes"];</code>
   * @return The count of binaryOptionsOrderHashes.
   */
  int getBinaryOptionsOrderHashesCount();
  /**
   * <code>repeated string binary_options_order_hashes = 6 [json_name = "binaryOptionsOrderHashes"];</code>
   * @param index The index of the element to return.
   * @return The binaryOptionsOrderHashes at the given index.
   */
  java.lang.String getBinaryOptionsOrderHashes(int index);
  /**
   * <code>repeated string binary_options_order_hashes = 6 [json_name = "binaryOptionsOrderHashes"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the binaryOptionsOrderHashes at the given index.
   */
  com.google.protobuf.ByteString
      getBinaryOptionsOrderHashesBytes(int index);
}
