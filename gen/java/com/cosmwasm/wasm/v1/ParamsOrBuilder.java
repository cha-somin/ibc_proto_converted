// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/types.proto

package com.cosmwasm.wasm.v1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmwasm.wasm.v1.AccessConfig code_upload_access = 1 [json_name = "codeUploadAccess", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"code_upload_access&#92;""];</code>
   * @return Whether the codeUploadAccess field is set.
   */
  boolean hasCodeUploadAccess();
  /**
   * <code>.cosmwasm.wasm.v1.AccessConfig code_upload_access = 1 [json_name = "codeUploadAccess", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"code_upload_access&#92;""];</code>
   * @return The codeUploadAccess.
   */
  com.cosmwasm.wasm.v1.AccessConfig getCodeUploadAccess();
  /**
   * <code>.cosmwasm.wasm.v1.AccessConfig code_upload_access = 1 [json_name = "codeUploadAccess", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"code_upload_access&#92;""];</code>
   */
  com.cosmwasm.wasm.v1.AccessConfigOrBuilder getCodeUploadAccessOrBuilder();

  /**
   * <code>.cosmwasm.wasm.v1.AccessType instantiate_default_permission = 2 [json_name = "instantiateDefaultPermission", (.gogoproto.moretags) = "yaml:&#92;"instantiate_default_permission&#92;""];</code>
   * @return The enum numeric value on the wire for instantiateDefaultPermission.
   */
  int getInstantiateDefaultPermissionValue();
  /**
   * <code>.cosmwasm.wasm.v1.AccessType instantiate_default_permission = 2 [json_name = "instantiateDefaultPermission", (.gogoproto.moretags) = "yaml:&#92;"instantiate_default_permission&#92;""];</code>
   * @return The instantiateDefaultPermission.
   */
  com.cosmwasm.wasm.v1.AccessType getInstantiateDefaultPermission();
}
