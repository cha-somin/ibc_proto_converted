// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/params.proto

package com.osmosis.protorev.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.protorev.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Boolean whether the protorev module is enabled.
   * </pre>
   *
   * <code>bool enabled = 1 [json_name = "enabled", (.gogoproto.moretags) = "yaml:&#92;"enabled&#92;""];</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * The admin account (settings manager) of the protorev module.
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * The admin account (settings manager) of the protorev module.
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin", (.gogoproto.moretags) = "yaml:&#92;"admin&#92;""];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();
}
