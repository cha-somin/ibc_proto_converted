// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/ocr.proto

package com.injective.ocr.v1beta1;

public interface ModuleParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.ocr.v1beta1.ModuleParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * feed_id is an unique ID for the target of this config
   * </pre>
   *
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The feedId.
   */
  java.lang.String getFeedId();
  /**
   * <pre>
   * feed_id is an unique ID for the target of this config
   * </pre>
   *
   * <code>string feed_id = 1 [json_name = "feedId"];</code>
   * @return The bytes for feedId.
   */
  com.google.protobuf.ByteString
      getFeedIdBytes();

  /**
   * <pre>
   * lowest answer the median of a report is allowed to be
   * </pre>
   *
   * <code>string min_answer = 2 [json_name = "minAnswer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The minAnswer.
   */
  java.lang.String getMinAnswer();
  /**
   * <pre>
   * lowest answer the median of a report is allowed to be
   * </pre>
   *
   * <code>string min_answer = 2 [json_name = "minAnswer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for minAnswer.
   */
  com.google.protobuf.ByteString
      getMinAnswerBytes();

  /**
   * <pre>
   * highest answer the median of a report is allowed to be
   * </pre>
   *
   * <code>string max_answer = 3 [json_name = "maxAnswer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The maxAnswer.
   */
  java.lang.String getMaxAnswer();
  /**
   * <pre>
   * highest answer the median of a report is allowed to be
   * </pre>
   *
   * <code>string max_answer = 3 [json_name = "maxAnswer", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for maxAnswer.
   */
  com.google.protobuf.ByteString
      getMaxAnswerBytes();

  /**
   * <pre>
   * Fixed LINK reward for each observer
   * </pre>
   *
   * <code>string link_per_observation = 4 [json_name = "linkPerObservation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The linkPerObservation.
   */
  java.lang.String getLinkPerObservation();
  /**
   * <pre>
   * Fixed LINK reward for each observer
   * </pre>
   *
   * <code>string link_per_observation = 4 [json_name = "linkPerObservation", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for linkPerObservation.
   */
  com.google.protobuf.ByteString
      getLinkPerObservationBytes();

  /**
   * <pre>
   * Fixed LINK reward for transmitter
   * </pre>
   *
   * <code>string link_per_transmission = 5 [json_name = "linkPerTransmission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The linkPerTransmission.
   */
  java.lang.String getLinkPerTransmission();
  /**
   * <pre>
   * Fixed LINK reward for transmitter
   * </pre>
   *
   * <code>string link_per_transmission = 5 [json_name = "linkPerTransmission", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for linkPerTransmission.
   */
  com.google.protobuf.ByteString
      getLinkPerTransmissionBytes();

  /**
   * <pre>
   * Native denom for LINK coin in the bank keeper
   * </pre>
   *
   * <code>string link_denom = 6 [json_name = "linkDenom"];</code>
   * @return The linkDenom.
   */
  java.lang.String getLinkDenom();
  /**
   * <pre>
   * Native denom for LINK coin in the bank keeper
   * </pre>
   *
   * <code>string link_denom = 6 [json_name = "linkDenom"];</code>
   * @return The bytes for linkDenom.
   */
  com.google.protobuf.ByteString
      getLinkDenomBytes();

  /**
   * <pre>
   * Enables unique reports
   * </pre>
   *
   * <code>bool unique_reports = 7 [json_name = "uniqueReports"];</code>
   * @return The uniqueReports.
   */
  boolean getUniqueReports();

  /**
   * <pre>
   * short human-readable description of observable this feed's answers pertain
   * to
   * </pre>
   *
   * <code>string description = 8 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * short human-readable description of observable this feed's answers pertain
   * to
   * </pre>
   *
   * <code>string description = 8 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * feed administrator
   * </pre>
   *
   * <code>string feed_admin = 9 [json_name = "feedAdmin"];</code>
   * @return The feedAdmin.
   */
  java.lang.String getFeedAdmin();
  /**
   * <pre>
   * feed administrator
   * </pre>
   *
   * <code>string feed_admin = 9 [json_name = "feedAdmin"];</code>
   * @return The bytes for feedAdmin.
   */
  com.google.protobuf.ByteString
      getFeedAdminBytes();

  /**
   * <pre>
   * feed billing administrator
   * </pre>
   *
   * <code>string billing_admin = 10 [json_name = "billingAdmin"];</code>
   * @return The billingAdmin.
   */
  java.lang.String getBillingAdmin();
  /**
   * <pre>
   * feed billing administrator
   * </pre>
   *
   * <code>string billing_admin = 10 [json_name = "billingAdmin"];</code>
   * @return The bytes for billingAdmin.
   */
  com.google.protobuf.ByteString
      getBillingAdminBytes();
}
