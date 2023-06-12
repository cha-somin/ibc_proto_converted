// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/authz/v1beta1/authz.proto

package com.cosmos.authz.v1beta1;

public interface GrantQueueItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.authz.v1beta1.GrantQueueItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * msg_type_urls contains the list of TypeURL of a sdk.Msg.
   * </pre>
   *
   * <code>repeated string msg_type_urls = 1 [json_name = "msgTypeUrls"];</code>
   * @return A list containing the msgTypeUrls.
   */
  java.util.List<java.lang.String>
      getMsgTypeUrlsList();
  /**
   * <pre>
   * msg_type_urls contains the list of TypeURL of a sdk.Msg.
   * </pre>
   *
   * <code>repeated string msg_type_urls = 1 [json_name = "msgTypeUrls"];</code>
   * @return The count of msgTypeUrls.
   */
  int getMsgTypeUrlsCount();
  /**
   * <pre>
   * msg_type_urls contains the list of TypeURL of a sdk.Msg.
   * </pre>
   *
   * <code>repeated string msg_type_urls = 1 [json_name = "msgTypeUrls"];</code>
   * @param index The index of the element to return.
   * @return The msgTypeUrls at the given index.
   */
  java.lang.String getMsgTypeUrls(int index);
  /**
   * <pre>
   * msg_type_urls contains the list of TypeURL of a sdk.Msg.
   * </pre>
   *
   * <code>repeated string msg_type_urls = 1 [json_name = "msgTypeUrls"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the msgTypeUrls at the given index.
   */
  com.google.protobuf.ByteString
      getMsgTypeUrlsBytes(int index);
}
