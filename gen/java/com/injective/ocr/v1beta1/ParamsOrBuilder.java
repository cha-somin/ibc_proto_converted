// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/ocr.proto

package com.injective.ocr.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.ocr.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Native denom for LINK coin in the bank keeper
   * </pre>
   *
   * <code>string link_denom = 1 [json_name = "linkDenom"];</code>
   * @return The linkDenom.
   */
  java.lang.String getLinkDenom();
  /**
   * <pre>
   * Native denom for LINK coin in the bank keeper
   * </pre>
   *
   * <code>string link_denom = 1 [json_name = "linkDenom"];</code>
   * @return The bytes for linkDenom.
   */
  com.google.protobuf.ByteString
      getLinkDenomBytes();

  /**
   * <pre>
   * The block number interval at which payouts are made
   * </pre>
   *
   * <code>uint64 payout_block_interval = 2 [json_name = "payoutBlockInterval"];</code>
   * @return The payoutBlockInterval.
   */
  long getPayoutBlockInterval();

  /**
   * <pre>
   * The admin for the OCR module
   * </pre>
   *
   * <code>string module_admin = 3 [json_name = "moduleAdmin"];</code>
   * @return The moduleAdmin.
   */
  java.lang.String getModuleAdmin();
  /**
   * <pre>
   * The admin for the OCR module
   * </pre>
   *
   * <code>string module_admin = 3 [json_name = "moduleAdmin"];</code>
   * @return The bytes for moduleAdmin.
   */
  com.google.protobuf.ByteString
      getModuleAdminBytes();
}
