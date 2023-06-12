// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/bundles.proto

package com.kyve.bundles.v1beta1;

public interface BundleProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyve.bundles.v1beta1.BundleProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * pool_id is the id of the pool for which this proposal is for
   * </pre>
   *
   * <code>uint64 pool_id = 1 [json_name = "poolId"];</code>
   * @return The poolId.
   */
  long getPoolId();

  /**
   * <pre>
   * storage_id is the id with which the data can be retrieved from
   * </pre>
   *
   * <code>string storage_id = 2 [json_name = "storageId"];</code>
   * @return The storageId.
   */
  java.lang.String getStorageId();
  /**
   * <pre>
   * storage_id is the id with which the data can be retrieved from
   * </pre>
   *
   * <code>string storage_id = 2 [json_name = "storageId"];</code>
   * @return The bytes for storageId.
   */
  com.google.protobuf.ByteString
      getStorageIdBytes();

  /**
   * <pre>
   * uploader is the address of the staker who submitted the current proposal
   * </pre>
   *
   * <code>string uploader = 3 [json_name = "uploader"];</code>
   * @return The uploader.
   */
  java.lang.String getUploader();
  /**
   * <pre>
   * uploader is the address of the staker who submitted the current proposal
   * </pre>
   *
   * <code>string uploader = 3 [json_name = "uploader"];</code>
   * @return The bytes for uploader.
   */
  com.google.protobuf.ByteString
      getUploaderBytes();

  /**
   * <pre>
   * next_uploader is the address of the staker who should upload the next proposal
   * </pre>
   *
   * <code>string next_uploader = 4 [json_name = "nextUploader"];</code>
   * @return The nextUploader.
   */
  java.lang.String getNextUploader();
  /**
   * <pre>
   * next_uploader is the address of the staker who should upload the next proposal
   * </pre>
   *
   * <code>string next_uploader = 4 [json_name = "nextUploader"];</code>
   * @return The bytes for nextUploader.
   */
  com.google.protobuf.ByteString
      getNextUploaderBytes();

  /**
   * <pre>
   * data_size the size of the data in bytes
   * </pre>
   *
   * <code>uint64 data_size = 5 [json_name = "dataSize"];</code>
   * @return The dataSize.
   */
  long getDataSize();

  /**
   * <pre>
   * bundle_size the size of the bundle (amount of data items)
   * </pre>
   *
   * <code>uint64 bundle_size = 6 [json_name = "bundleSize"];</code>
   * @return The bundleSize.
   */
  long getBundleSize();

  /**
   * <pre>
   * to_key the key of the last data item in the bundle proposal
   * </pre>
   *
   * <code>string to_key = 7 [json_name = "toKey"];</code>
   * @return The toKey.
   */
  java.lang.String getToKey();
  /**
   * <pre>
   * to_key the key of the last data item in the bundle proposal
   * </pre>
   *
   * <code>string to_key = 7 [json_name = "toKey"];</code>
   * @return The bytes for toKey.
   */
  com.google.protobuf.ByteString
      getToKeyBytes();

  /**
   * <pre>
   * bundle_summary a string summary of the current proposal
   * </pre>
   *
   * <code>string bundle_summary = 8 [json_name = "bundleSummary"];</code>
   * @return The bundleSummary.
   */
  java.lang.String getBundleSummary();
  /**
   * <pre>
   * bundle_summary a string summary of the current proposal
   * </pre>
   *
   * <code>string bundle_summary = 8 [json_name = "bundleSummary"];</code>
   * @return The bytes for bundleSummary.
   */
  com.google.protobuf.ByteString
      getBundleSummaryBytes();

  /**
   * <pre>
   * data_hash a sha256 hash of the raw compressed data
   * </pre>
   *
   * <code>string data_hash = 9 [json_name = "dataHash"];</code>
   * @return The dataHash.
   */
  java.lang.String getDataHash();
  /**
   * <pre>
   * data_hash a sha256 hash of the raw compressed data
   * </pre>
   *
   * <code>string data_hash = 9 [json_name = "dataHash"];</code>
   * @return The bytes for dataHash.
   */
  com.google.protobuf.ByteString
      getDataHashBytes();

  /**
   * <pre>
   * updated_at the last time this proposal was edited
   * </pre>
   *
   * <code>uint64 updated_at = 10 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  long getUpdatedAt();

  /**
   * <pre>
   * voters_valid list of all stakers who voted in favor for current proposal
   * </pre>
   *
   * <code>repeated string voters_valid = 11 [json_name = "votersValid"];</code>
   * @return A list containing the votersValid.
   */
  java.util.List<java.lang.String>
      getVotersValidList();
  /**
   * <pre>
   * voters_valid list of all stakers who voted in favor for current proposal
   * </pre>
   *
   * <code>repeated string voters_valid = 11 [json_name = "votersValid"];</code>
   * @return The count of votersValid.
   */
  int getVotersValidCount();
  /**
   * <pre>
   * voters_valid list of all stakers who voted in favor for current proposal
   * </pre>
   *
   * <code>repeated string voters_valid = 11 [json_name = "votersValid"];</code>
   * @param index The index of the element to return.
   * @return The votersValid at the given index.
   */
  java.lang.String getVotersValid(int index);
  /**
   * <pre>
   * voters_valid list of all stakers who voted in favor for current proposal
   * </pre>
   *
   * <code>repeated string voters_valid = 11 [json_name = "votersValid"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the votersValid at the given index.
   */
  com.google.protobuf.ByteString
      getVotersValidBytes(int index);

  /**
   * <pre>
   * voters_invalid list of all stakers who voted against for current proposal
   * </pre>
   *
   * <code>repeated string voters_invalid = 12 [json_name = "votersInvalid"];</code>
   * @return A list containing the votersInvalid.
   */
  java.util.List<java.lang.String>
      getVotersInvalidList();
  /**
   * <pre>
   * voters_invalid list of all stakers who voted against for current proposal
   * </pre>
   *
   * <code>repeated string voters_invalid = 12 [json_name = "votersInvalid"];</code>
   * @return The count of votersInvalid.
   */
  int getVotersInvalidCount();
  /**
   * <pre>
   * voters_invalid list of all stakers who voted against for current proposal
   * </pre>
   *
   * <code>repeated string voters_invalid = 12 [json_name = "votersInvalid"];</code>
   * @param index The index of the element to return.
   * @return The votersInvalid at the given index.
   */
  java.lang.String getVotersInvalid(int index);
  /**
   * <pre>
   * voters_invalid list of all stakers who voted against for current proposal
   * </pre>
   *
   * <code>repeated string voters_invalid = 12 [json_name = "votersInvalid"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the votersInvalid at the given index.
   */
  com.google.protobuf.ByteString
      getVotersInvalidBytes(int index);

  /**
   * <pre>
   * voters_abstain list of all stakers who voted abstain for current proposal
   * </pre>
   *
   * <code>repeated string voters_abstain = 13 [json_name = "votersAbstain"];</code>
   * @return A list containing the votersAbstain.
   */
  java.util.List<java.lang.String>
      getVotersAbstainList();
  /**
   * <pre>
   * voters_abstain list of all stakers who voted abstain for current proposal
   * </pre>
   *
   * <code>repeated string voters_abstain = 13 [json_name = "votersAbstain"];</code>
   * @return The count of votersAbstain.
   */
  int getVotersAbstainCount();
  /**
   * <pre>
   * voters_abstain list of all stakers who voted abstain for current proposal
   * </pre>
   *
   * <code>repeated string voters_abstain = 13 [json_name = "votersAbstain"];</code>
   * @param index The index of the element to return.
   * @return The votersAbstain at the given index.
   */
  java.lang.String getVotersAbstain(int index);
  /**
   * <pre>
   * voters_abstain list of all stakers who voted abstain for current proposal
   * </pre>
   *
   * <code>repeated string voters_abstain = 13 [json_name = "votersAbstain"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the votersAbstain at the given index.
   */
  com.google.protobuf.ByteString
      getVotersAbstainBytes(int index);

  /**
   * <pre>
   * from_key the key of the first data item in the bundle proposal
   * </pre>
   *
   * <code>string from_key = 14 [json_name = "fromKey"];</code>
   * @return The fromKey.
   */
  java.lang.String getFromKey();
  /**
   * <pre>
   * from_key the key of the first data item in the bundle proposal
   * </pre>
   *
   * <code>string from_key = 14 [json_name = "fromKey"];</code>
   * @return The bytes for fromKey.
   */
  com.google.protobuf.ByteString
      getFromKeyBytes();

  /**
   * <pre>
   * storage_provider_id the id of the storage provider where the bundle is stored
   * </pre>
   *
   * <code>uint32 storage_provider_id = 15 [json_name = "storageProviderId"];</code>
   * @return The storageProviderId.
   */
  int getStorageProviderId();

  /**
   * <pre>
   * compression_id the id of the compression type with which the data was compressed
   * </pre>
   *
   * <code>uint32 compression_id = 16 [json_name = "compressionId"];</code>
   * @return The compressionId.
   */
  int getCompressionId();
}
