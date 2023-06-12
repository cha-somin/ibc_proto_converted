// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/offer.proto

package com.likechain.likenft.v1;

public interface OfferOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.Offer)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string class_id = 1 [json_name = "classId"];</code>
   * @return The classId.
   */
  java.lang.String getClassId();
  /**
   * <code>string class_id = 1 [json_name = "classId"];</code>
   * @return The bytes for classId.
   */
  com.google.protobuf.ByteString
      getClassIdBytes();

  /**
   * <code>string nft_id = 2 [json_name = "nftId"];</code>
   * @return The nftId.
   */
  java.lang.String getNftId();
  /**
   * <code>string nft_id = 2 [json_name = "nftId"];</code>
   * @return The bytes for nftId.
   */
  com.google.protobuf.ByteString
      getNftIdBytes();

  /**
   * <code>string buyer = 3 [json_name = "buyer"];</code>
   * @return The buyer.
   */
  java.lang.String getBuyer();
  /**
   * <code>string buyer = 3 [json_name = "buyer"];</code>
   * @return The bytes for buyer.
   */
  com.google.protobuf.ByteString
      getBuyerBytes();

  /**
   * <code>uint64 price = 4 [json_name = "price"];</code>
   * @return The price.
   */
  long getPrice();

  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return Whether the expiration field is set.
   */
  boolean hasExpiration();
  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   * @return The expiration.
   */
  com.google.protobuf.Timestamp getExpiration();
  /**
   * <code>.google.protobuf.Timestamp expiration = 5 [json_name = "expiration", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getExpirationOrBuilder();
}
