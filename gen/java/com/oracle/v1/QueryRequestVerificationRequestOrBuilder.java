// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/query.proto

package com.oracle.v1;

public interface QueryRequestVerificationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:oracle.v1.QueryRequestVerificationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ChainID is the chain ID to identify which chain ID is used for the
   * verification
   * </pre>
   *
   * <code>string chain_id = 1 [json_name = "chainId"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <pre>
   * ChainID is the chain ID to identify which chain ID is used for the
   * verification
   * </pre>
   *
   * <code>string chain_id = 1 [json_name = "chainId"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <pre>
   * Validator is a validator address
   * </pre>
   *
   * <code>string validator = 2 [json_name = "validator"];</code>
   * @return The validator.
   */
  java.lang.String getValidator();
  /**
   * <pre>
   * Validator is a validator address
   * </pre>
   *
   * <code>string validator = 2 [json_name = "validator"];</code>
   * @return The bytes for validator.
   */
  com.google.protobuf.ByteString
      getValidatorBytes();

  /**
   * <pre>
   * RequestID is oracle request ID
   * </pre>
   *
   * <code>uint64 request_id = 3 [json_name = "requestId"];</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <pre>
   * ExternalID is an oracle's external ID
   * </pre>
   *
   * <code>uint64 external_id = 4 [json_name = "externalId"];</code>
   * @return The externalId.
   */
  long getExternalId();

  /**
   * <pre>
   * DataSourceID is the ID of data source
   * </pre>
   *
   * <code>uint64 data_source_id = 5 [json_name = "dataSourceId"];</code>
   * @return The dataSourceId.
   */
  long getDataSourceId();

  /**
   * <pre>
   * Reporter is an bech32-encoded public key of the reporter authorized by the
   * validator
   * </pre>
   *
   * <code>string reporter = 6 [json_name = "reporter"];</code>
   * @return The reporter.
   */
  java.lang.String getReporter();
  /**
   * <pre>
   * Reporter is an bech32-encoded public key of the reporter authorized by the
   * validator
   * </pre>
   *
   * <code>string reporter = 6 [json_name = "reporter"];</code>
   * @return The bytes for reporter.
   */
  com.google.protobuf.ByteString
      getReporterBytes();

  /**
   * <pre>
   * Signature is a signature signed by the reporter using reporter's private
   * key
   * </pre>
   *
   * <code>bytes signature = 7 [json_name = "signature"];</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <pre>
   * MaxDelay is a max number of RequestID delay acceptable in case of node
   * delay
   * </pre>
   *
   * <code>uint64 max_delay = 8 [json_name = "maxDelay"];</code>
   * @return The maxDelay.
   */
  long getMaxDelay();
}
