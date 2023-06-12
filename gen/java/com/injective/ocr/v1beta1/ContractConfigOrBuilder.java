// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/ocr.proto

package com.injective.ocr.v1beta1;

public interface ContractConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.ocr.v1beta1.ContractConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * config_count ordinal number of this config setting among all config
   * settings
   * </pre>
   *
   * <code>uint64 config_count = 1 [json_name = "configCount"];</code>
   * @return The configCount.
   */
  long getConfigCount();

  /**
   * <pre>
   * signers ith element is address ith oracle uses to sign a report
   * </pre>
   *
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  java.util.List<java.lang.String>
      getSignersList();
  /**
   * <pre>
   * signers ith element is address ith oracle uses to sign a report
   * </pre>
   *
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  int getSignersCount();
  /**
   * <pre>
   * signers ith element is address ith oracle uses to sign a report
   * </pre>
   *
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  java.lang.String getSigners(int index);
  /**
   * <pre>
   * signers ith element is address ith oracle uses to sign a report
   * </pre>
   *
   * <code>repeated string signers = 2 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  com.google.protobuf.ByteString
      getSignersBytes(int index);

  /**
   * <pre>
   * transmitters ith element is address ith oracle uses to transmit a report
   * via the transmit method
   * </pre>
   *
   * <code>repeated string transmitters = 3 [json_name = "transmitters"];</code>
   * @return A list containing the transmitters.
   */
  java.util.List<java.lang.String>
      getTransmittersList();
  /**
   * <pre>
   * transmitters ith element is address ith oracle uses to transmit a report
   * via the transmit method
   * </pre>
   *
   * <code>repeated string transmitters = 3 [json_name = "transmitters"];</code>
   * @return The count of transmitters.
   */
  int getTransmittersCount();
  /**
   * <pre>
   * transmitters ith element is address ith oracle uses to transmit a report
   * via the transmit method
   * </pre>
   *
   * <code>repeated string transmitters = 3 [json_name = "transmitters"];</code>
   * @param index The index of the element to return.
   * @return The transmitters at the given index.
   */
  java.lang.String getTransmitters(int index);
  /**
   * <pre>
   * transmitters ith element is address ith oracle uses to transmit a report
   * via the transmit method
   * </pre>
   *
   * <code>repeated string transmitters = 3 [json_name = "transmitters"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the transmitters at the given index.
   */
  com.google.protobuf.ByteString
      getTransmittersBytes(int index);

  /**
   * <pre>
   * f maximum number of faulty/dishonest oracles the protocol can tolerate
   * while still working correctly
   * </pre>
   *
   * <code>uint32 f = 4 [json_name = "f"];</code>
   * @return The f.
   */
  int getF();

  /**
   * <pre>
   * onchain_config serialized data with reporting plugin params on chain.
   * </pre>
   *
   * <code>bytes onchain_config = 5 [json_name = "onchainConfig"];</code>
   * @return The onchainConfig.
   */
  com.google.protobuf.ByteString getOnchainConfig();

  /**
   * <pre>
   * offchain_config_version version of the serialization format used for
   * "offchain_config" parameter
   * </pre>
   *
   * <code>uint64 offchain_config_version = 6 [json_name = "offchainConfigVersion"];</code>
   * @return The offchainConfigVersion.
   */
  long getOffchainConfigVersion();

  /**
   * <pre>
   * offchain_config serialized data used by oracles to configure their offchain
   * operation
   * </pre>
   *
   * <code>bytes offchain_config = 7 [json_name = "offchainConfig"];</code>
   * @return The offchainConfig.
   */
  com.google.protobuf.ByteString getOffchainConfig();
}
