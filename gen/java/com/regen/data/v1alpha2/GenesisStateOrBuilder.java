// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/data/v1alpha2/genesis.proto

package com.regen.data.v1alpha2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:regen.data.v1alpha2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * entries are the content entries
   * </pre>
   *
   * <code>repeated .regen.data.v1alpha2.GenesisContentEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<com.regen.data.v1alpha2.GenesisContentEntry> 
      getEntriesList();
  /**
   * <pre>
   * entries are the content entries
   * </pre>
   *
   * <code>repeated .regen.data.v1alpha2.GenesisContentEntry entries = 1 [json_name = "entries"];</code>
   */
  com.regen.data.v1alpha2.GenesisContentEntry getEntries(int index);
  /**
   * <pre>
   * entries are the content entries
   * </pre>
   *
   * <code>repeated .regen.data.v1alpha2.GenesisContentEntry entries = 1 [json_name = "entries"];</code>
   */
  int getEntriesCount();
  /**
   * <pre>
   * entries are the content entries
   * </pre>
   *
   * <code>repeated .regen.data.v1alpha2.GenesisContentEntry entries = 1 [json_name = "entries"];</code>
   */
  java.util.List<? extends com.regen.data.v1alpha2.GenesisContentEntryOrBuilder> 
      getEntriesOrBuilderList();
  /**
   * <pre>
   * entries are the content entries
   * </pre>
   *
   * <code>repeated .regen.data.v1alpha2.GenesisContentEntry entries = 1 [json_name = "entries"];</code>
   */
  com.regen.data.v1alpha2.GenesisContentEntryOrBuilder getEntriesOrBuilder(
      int index);
}
