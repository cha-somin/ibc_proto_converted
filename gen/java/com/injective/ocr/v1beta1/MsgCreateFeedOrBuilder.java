// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/tx.proto

package com.injective.ocr.v1beta1;

public interface MsgCreateFeedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.ocr.v1beta1.MsgCreateFeed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <code>.injective.ocr.v1beta1.FeedConfig config = 2 [json_name = "config"];</code>
   * @return Whether the config field is set.
   */
  boolean hasConfig();
  /**
   * <code>.injective.ocr.v1beta1.FeedConfig config = 2 [json_name = "config"];</code>
   * @return The config.
   */
  com.injective.ocr.v1beta1.FeedConfig getConfig();
  /**
   * <code>.injective.ocr.v1beta1.FeedConfig config = 2 [json_name = "config"];</code>
   */
  com.injective.ocr.v1beta1.FeedConfigOrBuilder getConfigOrBuilder();
}
