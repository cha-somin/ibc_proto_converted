// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/query.proto

package com.axelar.evm.v1beta1;

public interface ProofOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.evm.v1beta1.Proof)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <code>repeated string addresses = 1 [json_name = "addresses"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);

  /**
   * <code>repeated string weights = 2 [json_name = "weights"];</code>
   * @return A list containing the weights.
   */
  java.util.List<java.lang.String>
      getWeightsList();
  /**
   * <code>repeated string weights = 2 [json_name = "weights"];</code>
   * @return The count of weights.
   */
  int getWeightsCount();
  /**
   * <code>repeated string weights = 2 [json_name = "weights"];</code>
   * @param index The index of the element to return.
   * @return The weights at the given index.
   */
  java.lang.String getWeights(int index);
  /**
   * <code>repeated string weights = 2 [json_name = "weights"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the weights at the given index.
   */
  com.google.protobuf.ByteString
      getWeightsBytes(int index);

  /**
   * <code>string threshold = 3 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  java.lang.String getThreshold();
  /**
   * <code>string threshold = 3 [json_name = "threshold"];</code>
   * @return The bytes for threshold.
   */
  com.google.protobuf.ByteString
      getThresholdBytes();

  /**
   * <code>repeated string signatures = 4 [json_name = "signatures"];</code>
   * @return A list containing the signatures.
   */
  java.util.List<java.lang.String>
      getSignaturesList();
  /**
   * <code>repeated string signatures = 4 [json_name = "signatures"];</code>
   * @return The count of signatures.
   */
  int getSignaturesCount();
  /**
   * <code>repeated string signatures = 4 [json_name = "signatures"];</code>
   * @param index The index of the element to return.
   * @return The signatures at the given index.
   */
  java.lang.String getSignatures(int index);
  /**
   * <code>repeated string signatures = 4 [json_name = "signatures"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signatures at the given index.
   */
  com.google.protobuf.ByteString
      getSignaturesBytes(int index);
}
