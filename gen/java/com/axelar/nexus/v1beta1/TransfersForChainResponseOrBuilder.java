// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

public interface TransfersForChainResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.nexus.v1beta1.TransfersForChainResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1 [json_name = "transfers", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.nexus.exported.v1beta1.CrossChainTransfer> 
      getTransfersList();
  /**
   * <code>repeated .axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1 [json_name = "transfers", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.nexus.exported.v1beta1.CrossChainTransfer getTransfers(int index);
  /**
   * <code>repeated .axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1 [json_name = "transfers", (.gogoproto.nullable) = false];</code>
   */
  int getTransfersCount();
  /**
   * <code>repeated .axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1 [json_name = "transfers", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.nexus.exported.v1beta1.CrossChainTransferOrBuilder> 
      getTransfersOrBuilderList();
  /**
   * <code>repeated .axelar.nexus.exported.v1beta1.CrossChainTransfer transfers = 1 [json_name = "transfers", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.nexus.exported.v1beta1.CrossChainTransferOrBuilder getTransfersOrBuilder(
      int index);

  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.cosmos.base.query.v1beta1.PageResponse getPagination();
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder();
}
