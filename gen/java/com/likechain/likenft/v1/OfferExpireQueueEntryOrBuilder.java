// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/offer_expire_queue.proto

package com.likechain.likenft.v1;

public interface OfferExpireQueueEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.OfferExpireQueueEntry)
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
   * <code>bytes offer_key = 2 [json_name = "offerKey"];</code>
   * @return The offerKey.
   */
  com.google.protobuf.ByteString getOfferKey();
}
