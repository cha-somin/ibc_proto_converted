// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha2/query.proto

package com.panacea.datadeal.v2alpha2;

public interface QueryDataSaleRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.datadeal.v2alpha2.QueryDataSaleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
   * @return The dealId.
   */
  long getDealId();

  /**
   * <code>string data_hash = 2 [json_name = "dataHash"];</code>
   * @return The dataHash.
   */
  java.lang.String getDataHash();
  /**
   * <code>string data_hash = 2 [json_name = "dataHash"];</code>
   * @return The bytes for dataHash.
   */
  com.google.protobuf.ByteString
      getDataHashBytes();
}
