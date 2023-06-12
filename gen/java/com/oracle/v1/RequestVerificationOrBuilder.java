// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/oracle/v1/oracle.proto

package com.oracle.v1;

public interface RequestVerificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:oracle.v1.RequestVerification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * ChainID is the ID of targeted chain
   * </pre>
   *
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
   * @return The chainId.
   */
  java.lang.String getChainId();
  /**
   * <pre>
   * ChainID is the ID of targeted chain
   * </pre>
   *
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.customname) = "ChainID"];</code>
   * @return The bytes for chainId.
   */
  com.google.protobuf.ByteString
      getChainIdBytes();

  /**
   * <pre>
   * Validator is an validator address
   * </pre>
   *
   * <code>string validator = 2 [json_name = "validator"];</code>
   * @return The validator.
   */
  java.lang.String getValidator();
  /**
   * <pre>
   * Validator is an validator address
   * </pre>
   *
   * <code>string validator = 2 [json_name = "validator"];</code>
   * @return The bytes for validator.
   */
  com.google.protobuf.ByteString
      getValidatorBytes();

  /**
   * <pre>
   * RequestID is the targeted request ID
   * </pre>
   *
   * <code>uint64 request_id = 3 [json_name = "requestId", (.gogoproto.customname) = "RequestID", (.gogoproto.casttype) = "RequestID"];</code>
   * @return The requestId.
   */
  long getRequestId();

  /**
   * <pre>
   * ExternalID is the oracle's external ID of data source
   * </pre>
   *
   * <code>uint64 external_id = 4 [json_name = "externalId", (.gogoproto.customname) = "ExternalID", (.gogoproto.casttype) = "ExternalID"];</code>
   * @return The externalId.
   */
  long getExternalId();

  /**
   * <pre>
   * DataSourceID is the ID of data source
   * </pre>
   *
   * <code>uint64 data_source_id = 5 [json_name = "dataSourceId", (.gogoproto.customname) = "DataSourceID", (.gogoproto.casttype) = "DataSourceID"];</code>
   * @return The dataSourceId.
   */
  long getDataSourceId();
}
