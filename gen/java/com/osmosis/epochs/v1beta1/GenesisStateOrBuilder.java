// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/epochs/genesis.proto

package com.osmosis.epochs.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.epochs.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .osmosis.epochs.v1beta1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.osmosis.epochs.v1beta1.EpochInfo> 
      getEpochsList();
  /**
   * <code>repeated .osmosis.epochs.v1beta1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.epochs.v1beta1.EpochInfo getEpochs(int index);
  /**
   * <code>repeated .osmosis.epochs.v1beta1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  int getEpochsCount();
  /**
   * <code>repeated .osmosis.epochs.v1beta1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.osmosis.epochs.v1beta1.EpochInfoOrBuilder> 
      getEpochsOrBuilderList();
  /**
   * <code>repeated .osmosis.epochs.v1beta1.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  com.osmosis.epochs.v1beta1.EpochInfoOrBuilder getEpochsOrBuilder(
      int index);
}
