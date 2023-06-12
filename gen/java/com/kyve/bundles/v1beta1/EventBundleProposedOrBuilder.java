// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/events.proto

package com.kyve.bundles.v1beta1;

public interface EventBundleProposedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.bundles.v1beta1.EventBundleProposed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool_id is the unique ID of the pool.
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <pre>
   * internal id for the KYVE-bundle
   * </pre>
   *
   * <code>uint64 id = 2 [json_name = "id"];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * storage_id is the ID to retrieve to data item from the configured storage provider
   * e.g. the ARWEAVE-id
   * </pre>
   *
   * <code>string storage_id = 3 [json_name = "storageId"];</code>
   * @return The storageId.
   */
  java.lang.String getStorageId();
  /**
   * <pre>
   * storage_id is the ID to retrieve to data item from the configured storage provider
   * e.g. the ARWEAVE-id
   * </pre>
   *
   * <code>string storage_id = 3 [json_name = "storageId"];</code>
   * @return The bytes for storageId.
   */
  com.google.protobuf.ByteString
      getStorageIdBytes();

  /**
   * <pre>
   * Address of the uploader/proposer of the bundle
   * </pre>
   *
   * <code>string uploader = 4 [json_name = "uploader"];</code>
   * @return The uploader.
   */
  java.lang.String getUploader();
  /**
   * <pre>
   * Address of the uploader/proposer of the bundle
   * </pre>
   *
   * <code>string uploader = 4 [json_name = "uploader"];</code>
   * @return The bytes for uploader.
   */
  com.google.protobuf.ByteString
      getUploaderBytes();

  /**
   * <pre>
   * data_size size in bytes of the data
   * </pre>
   *
   * <code>uint64 data_size = 5 [json_name = "dataSize"];</code>
   * @return The dataSize.
   */
  long getDataSize();

  /**
   * <pre>
   * from_index starting index of the bundle (inclusive)
   * </pre>
   *
   * <code>uint64 from_index = 6 [json_name = "fromIndex"];</code>
   * @return The fromIndex.
   */
  long getFromIndex();

  /**
   * <pre>
   * bundle_size amount of data items in the bundle
   * </pre>
   *
   * <code>uint64 bundle_size = 7 [json_name = "bundleSize"];</code>
   * @return The bundleSize.
   */
  long getBundleSize();

  /**
   * <pre>
   * from_key the key of the first data item in the bundle
   * </pre>
   *
   * <code>string from_key = 8 [json_name = "fromKey"];</code>
   * @return The fromKey.
   */
  java.lang.String getFromKey();
  /**
   * <pre>
   * from_key the key of the first data item in the bundle
   * </pre>
   *
   * <code>string from_key = 8 [json_name = "fromKey"];</code>
   * @return The bytes for fromKey.
   */
  com.google.protobuf.ByteString
      getFromKeyBytes();

  /**
   * <pre>
   * to_key the key of the last data item in the bundle
   * </pre>
   *
   * <code>string to_key = 9 [json_name = "toKey"];</code>
   * @return The toKey.
   */
  java.lang.String getToKey();
  /**
   * <pre>
   * to_key the key of the last data item in the bundle
   * </pre>
   *
   * <code>string to_key = 9 [json_name = "toKey"];</code>
   * @return The bytes for toKey.
   */
  com.google.protobuf.ByteString
      getToKeyBytes();

  /**
   * <pre>
   * bundle_summary is a short string holding some useful information of
   * the bundle which will get stored on-chain
   * </pre>
   *
   * <code>string bundle_summary = 10 [json_name = "bundleSummary"];</code>
   * @return The bundleSummary.
   */
  java.lang.String getBundleSummary();
  /**
   * <pre>
   * bundle_summary is a short string holding some useful information of
   * the bundle which will get stored on-chain
   * </pre>
   *
   * <code>string bundle_summary = 10 [json_name = "bundleSummary"];</code>
   * @return The bytes for bundleSummary.
   */
  com.google.protobuf.ByteString
      getBundleSummaryBytes();

  /**
   * <pre>
   * data_hash is a sha256 hash of the raw compressed data
   * </pre>
   *
   * <code>string data_hash = 11 [json_name = "dataHash"];</code>
   * @return The dataHash.
   */
  java.lang.String getDataHash();
  /**
   * <pre>
   * data_hash is a sha256 hash of the raw compressed data
   * </pre>
   *
   * <code>string data_hash = 11 [json_name = "dataHash"];</code>
   * @return The bytes for dataHash.
   */
  com.google.protobuf.ByteString
      getDataHashBytes();

  /**
   * <pre>
   * proposed_at the unix time when the bundle was proposed
   * </pre>
   *
   * <code>uint64 proposed_at = 12 [json_name = "proposedAt"];</code>
   * @return The proposedAt.
   */
  long getProposedAt();

  /**
   * <pre>
   * storage_provider_id the unique id of the storage provider where
   * the data of the bundle is tored
   * </pre>
   *
   * <code>uint32 storage_provider_id = 13 [json_name = "storageProviderId"];</code>
   * @return The storageProviderId.
   */
  int getStorageProviderId();

  /**
   * <pre>
   * compression_id  the unique id of the compression type the data
   * of the bundle was compressed with
   * </pre>
   *
   * <code>uint32 compression_id = 14 [json_name = "compressionId"];</code>
   * @return The compressionId.
   */
  int getCompressionId();
}
