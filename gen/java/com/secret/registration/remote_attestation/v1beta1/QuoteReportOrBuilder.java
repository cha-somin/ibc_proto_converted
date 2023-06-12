// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/registration/v1beta1/remote_attestation/types.proto

package com.secret.registration.remote_attestation.v1beta1;

public interface QuoteReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.registration.remote_attestation.v1beta1.QuoteReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id", (.gogoproto.customname) = "ID"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string timestamp = 2 [json_name = "timestamp"];</code>
   * @return The timestamp.
   */
  java.lang.String getTimestamp();
  /**
   * <code>string timestamp = 2 [json_name = "timestamp"];</code>
   * @return The bytes for timestamp.
   */
  com.google.protobuf.ByteString
      getTimestampBytes();

  /**
   * <code>uint64 version = 3 [json_name = "version"];</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <code>string isv_enclave_quote_status = 4 [json_name = "isvEnclaveQuoteStatus", (.gogoproto.jsontag) = "isvEnclaveQuoteStatus"];</code>
   * @return The isvEnclaveQuoteStatus.
   */
  java.lang.String getIsvEnclaveQuoteStatus();
  /**
   * <code>string isv_enclave_quote_status = 4 [json_name = "isvEnclaveQuoteStatus", (.gogoproto.jsontag) = "isvEnclaveQuoteStatus"];</code>
   * @return The bytes for isvEnclaveQuoteStatus.
   */
  com.google.protobuf.ByteString
      getIsvEnclaveQuoteStatusBytes();

  /**
   * <code>string platform_info_blob = 5 [json_name = "platformInfoBlob", (.gogoproto.jsontag) = "platformInfoBlob"];</code>
   * @return The platformInfoBlob.
   */
  java.lang.String getPlatformInfoBlob();
  /**
   * <code>string platform_info_blob = 5 [json_name = "platformInfoBlob", (.gogoproto.jsontag) = "platformInfoBlob"];</code>
   * @return The bytes for platformInfoBlob.
   */
  com.google.protobuf.ByteString
      getPlatformInfoBlobBytes();

  /**
   * <code>string isv_enclave_quote_body = 6 [json_name = "isvEnclaveQuoteBody", (.gogoproto.jsontag) = "isvEnclaveQuoteBody"];</code>
   * @return The isvEnclaveQuoteBody.
   */
  java.lang.String getIsvEnclaveQuoteBody();
  /**
   * <code>string isv_enclave_quote_body = 6 [json_name = "isvEnclaveQuoteBody", (.gogoproto.jsontag) = "isvEnclaveQuoteBody"];</code>
   * @return The bytes for isvEnclaveQuoteBody.
   */
  com.google.protobuf.ByteString
      getIsvEnclaveQuoteBodyBytes();

  /**
   * <code>repeated string advisory_ids = 7 [json_name = "advisoryIds", (.gogoproto.customname) = "AdvisoryIDs", (.gogoproto.jsontag) = "advisoryIDs"];</code>
   * @return A list containing the advisoryIds.
   */
  java.util.List<java.lang.String>
      getAdvisoryIdsList();
  /**
   * <code>repeated string advisory_ids = 7 [json_name = "advisoryIds", (.gogoproto.customname) = "AdvisoryIDs", (.gogoproto.jsontag) = "advisoryIDs"];</code>
   * @return The count of advisoryIds.
   */
  int getAdvisoryIdsCount();
  /**
   * <code>repeated string advisory_ids = 7 [json_name = "advisoryIds", (.gogoproto.customname) = "AdvisoryIDs", (.gogoproto.jsontag) = "advisoryIDs"];</code>
   * @param index The index of the element to return.
   * @return The advisoryIds at the given index.
   */
  java.lang.String getAdvisoryIds(int index);
  /**
   * <code>repeated string advisory_ids = 7 [json_name = "advisoryIds", (.gogoproto.customname) = "AdvisoryIDs", (.gogoproto.jsontag) = "advisoryIDs"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the advisoryIds at the given index.
   */
  com.google.protobuf.ByteString
      getAdvisoryIdsBytes(int index);
}
