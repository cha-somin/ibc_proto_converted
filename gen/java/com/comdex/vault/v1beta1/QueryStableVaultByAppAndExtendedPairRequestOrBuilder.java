// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/query.proto

package com.comdex.vault.v1beta1;

public interface QueryStableVaultByAppAndExtendedPairRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.vault.v1beta1.QueryStableVaultByAppAndExtendedPairRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 app_id = 1 [json_name = "appId", (.gogoproto.moretags) = "yaml:&#92;"app_id&#92;""];</code>
   * @return The appId.
   */
  long getAppId();

  /**
   * <code>uint64 extended_pair_id = 2 [json_name = "extendedPairId", (.gogoproto.moretags) = "yaml:&#92;"extended_pair_id&#92;""];</code>
   * @return The extendedPairId.
   */
  long getExtendedPairId();
}
