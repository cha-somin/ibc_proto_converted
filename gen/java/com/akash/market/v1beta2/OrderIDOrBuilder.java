// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/order.proto

package com.akash.market.v1beta2;

public interface OrderIDOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.market.v1beta2.OrderID)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>uint64 dseq = 2 [json_name = "dseq", (.gogoproto.customname) = "DSeq", (.gogoproto.jsontag) = "dseq", (.gogoproto.moretags) = "yaml:&#92;"dseq&#92;""];</code>
   * @return The dseq.
   */
  long getDseq();

  /**
   * <code>uint32 gseq = 3 [json_name = "gseq", (.gogoproto.customname) = "GSeq", (.gogoproto.jsontag) = "gseq", (.gogoproto.moretags) = "yaml:&#92;"gseq&#92;""];</code>
   * @return The gseq.
   */
  int getGseq();

  /**
   * <code>uint32 oseq = 4 [json_name = "oseq", (.gogoproto.customname) = "OSeq", (.gogoproto.jsontag) = "oseq", (.gogoproto.moretags) = "yaml:&#92;"oseq&#92;""];</code>
   * @return The oseq.
   */
  int getOseq();
}
