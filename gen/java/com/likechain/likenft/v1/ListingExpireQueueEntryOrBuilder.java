// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/listing_expire_queue.proto

package com.likechain.likenft.v1;

public interface ListingExpireQueueEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.ListingExpireQueueEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   * <code>.google.protobuf.Timestamp expire_time = 1 [json_name = "expireTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   * <code>bytes listing_key = 2 [json_name = "listingKey"];</code>
   * @return The listingKey.
   */
  com.google.protobuf.ByteString getListingKey();
}
