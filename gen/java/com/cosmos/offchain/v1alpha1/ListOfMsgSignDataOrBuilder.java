// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: iov/offchain/v1alpha1/offchain.proto

package com.cosmos.offchain.v1alpha1;

public interface ListOfMsgSignDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.offchain.v1alpha1.ListOfMsgSignData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * msgs is a list of messages
   * </pre>
   *
   * <code>repeated .cosmos.offchain.v1alpha1.MsgSignData msgs = 1 [json_name = "msgs"];</code>
   */
  java.util.List<com.cosmos.offchain.v1alpha1.MsgSignData> 
      getMsgsList();
  /**
   * <pre>
   * msgs is a list of messages
   * </pre>
   *
   * <code>repeated .cosmos.offchain.v1alpha1.MsgSignData msgs = 1 [json_name = "msgs"];</code>
   */
  com.cosmos.offchain.v1alpha1.MsgSignData getMsgs(int index);
  /**
   * <pre>
   * msgs is a list of messages
   * </pre>
   *
   * <code>repeated .cosmos.offchain.v1alpha1.MsgSignData msgs = 1 [json_name = "msgs"];</code>
   */
  int getMsgsCount();
  /**
   * <pre>
   * msgs is a list of messages
   * </pre>
   *
   * <code>repeated .cosmos.offchain.v1alpha1.MsgSignData msgs = 1 [json_name = "msgs"];</code>
   */
  java.util.List<? extends com.cosmos.offchain.v1alpha1.MsgSignDataOrBuilder> 
      getMsgsOrBuilderList();
  /**
   * <pre>
   * msgs is a list of messages
   * </pre>
   *
   * <code>repeated .cosmos.offchain.v1alpha1.MsgSignData msgs = 1 [json_name = "msgs"];</code>
   */
  com.cosmos.offchain.v1alpha1.MsgSignDataOrBuilder getMsgsOrBuilder(
      int index);
}
