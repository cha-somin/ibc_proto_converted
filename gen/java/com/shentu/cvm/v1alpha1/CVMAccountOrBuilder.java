// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/cvm/v1alpha1/query.proto

package com.shentu.cvm.v1alpha1;

public interface CVMAccountOrBuilder extends
    // @@protoc_insertion_point(interface_extends:shentu.cvm.v1alpha1.CVMAccount)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
   * @return Whether the baseAccount field is set.
   */
  boolean hasBaseAccount();
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
   * @return The baseAccount.
   */
  com.cosmos.auth.v1beta1.BaseAccount getBaseAccount();
  /**
   * <code>.cosmos.auth.v1beta1.BaseAccount base_account = 1 [json_name = "baseAccount", (.gogoproto.embed) = true, (.gogoproto.moretags) = "yaml:&#92;"base_account&#92;""];</code>
   */
  com.cosmos.auth.v1beta1.BaseAccountOrBuilder getBaseAccountOrBuilder();

  /**
   * <code>string code = 2 [json_name = "code", (.gogoproto.moretags) = "yaml:&#92;"code&#92;""];</code>
   * @return The code.
   */
  java.lang.String getCode();
  /**
   * <code>string code = 2 [json_name = "code", (.gogoproto.moretags) = "yaml:&#92;"code&#92;""];</code>
   * @return The bytes for code.
   */
  com.google.protobuf.ByteString
      getCodeBytes();

  /**
   * <code>string abi = 3 [json_name = "abi", (.gogoproto.moretags) = "yaml:&#92;"abi&#92;""];</code>
   * @return The abi.
   */
  java.lang.String getAbi();
  /**
   * <code>string abi = 3 [json_name = "abi", (.gogoproto.moretags) = "yaml:&#92;"abi&#92;""];</code>
   * @return The bytes for abi.
   */
  com.google.protobuf.ByteString
      getAbiBytes();
}
