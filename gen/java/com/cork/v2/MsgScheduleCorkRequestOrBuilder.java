// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/cork/v2/tx.proto

package com.cork.v2;

public interface MsgScheduleCorkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cork.v2.MsgScheduleCorkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the scheduled cork
   * </pre>
   *
   * <code>.cork.v2.Cork cork = 1 [json_name = "cork"];</code>
   * @return Whether the cork field is set.
   */
  boolean hasCork();
  /**
   * <pre>
   * the scheduled cork
   * </pre>
   *
   * <code>.cork.v2.Cork cork = 1 [json_name = "cork"];</code>
   * @return The cork.
   */
  com.cork.v2.Cork getCork();
  /**
   * <pre>
   * the scheduled cork
   * </pre>
   *
   * <code>.cork.v2.Cork cork = 1 [json_name = "cork"];</code>
   */
  com.cork.v2.CorkOrBuilder getCorkOrBuilder();

  /**
   * <pre>
   * the block height that must be reached
   * </pre>
   *
   * <code>uint64 block_height = 2 [json_name = "blockHeight"];</code>
   * @return The blockHeight.
   */
  long getBlockHeight();

  /**
   * <pre>
   * signer account address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer account address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
