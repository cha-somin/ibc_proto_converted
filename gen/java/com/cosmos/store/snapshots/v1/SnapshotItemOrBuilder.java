// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/store/snapshots/v1/snapshot.proto

package com.cosmos.store.snapshots.v1;

public interface SnapshotItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.store.snapshots.v1.SnapshotItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotStoreItem store = 1 [json_name = "store"];</code>
   * @return Whether the store field is set.
   */
  boolean hasStore();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotStoreItem store = 1 [json_name = "store"];</code>
   * @return The store.
   */
  com.cosmos.store.snapshots.v1.SnapshotStoreItem getStore();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotStoreItem store = 1 [json_name = "store"];</code>
   */
  com.cosmos.store.snapshots.v1.SnapshotStoreItemOrBuilder getStoreOrBuilder();

  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotIAVLItem iavl = 2 [json_name = "iavl", (.gogoproto.customname) = "IAVL"];</code>
   * @return Whether the iavl field is set.
   */
  boolean hasIavl();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotIAVLItem iavl = 2 [json_name = "iavl", (.gogoproto.customname) = "IAVL"];</code>
   * @return The iavl.
   */
  com.cosmos.store.snapshots.v1.SnapshotIAVLItem getIavl();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotIAVLItem iavl = 2 [json_name = "iavl", (.gogoproto.customname) = "IAVL"];</code>
   */
  com.cosmos.store.snapshots.v1.SnapshotIAVLItemOrBuilder getIavlOrBuilder();

  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionMeta extension = 3 [json_name = "extension"];</code>
   * @return Whether the extension field is set.
   */
  boolean hasExtension();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionMeta extension = 3 [json_name = "extension"];</code>
   * @return The extension.
   */
  com.cosmos.store.snapshots.v1.SnapshotExtensionMeta getExtension();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionMeta extension = 3 [json_name = "extension"];</code>
   */
  com.cosmos.store.snapshots.v1.SnapshotExtensionMetaOrBuilder getExtensionOrBuilder();

  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionPayload extension_payload = 4 [json_name = "extensionPayload"];</code>
   * @return Whether the extensionPayload field is set.
   */
  boolean hasExtensionPayload();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionPayload extension_payload = 4 [json_name = "extensionPayload"];</code>
   * @return The extensionPayload.
   */
  com.cosmos.store.snapshots.v1.SnapshotExtensionPayload getExtensionPayload();
  /**
   * <code>.cosmos.store.snapshots.v1.SnapshotExtensionPayload extension_payload = 4 [json_name = "extensionPayload"];</code>
   */
  com.cosmos.store.snapshots.v1.SnapshotExtensionPayloadOrBuilder getExtensionPayloadOrBuilder();

  com.cosmos.store.snapshots.v1.SnapshotItem.ItemCase getItemCase();
}
