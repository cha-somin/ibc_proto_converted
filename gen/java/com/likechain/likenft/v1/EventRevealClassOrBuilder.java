// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/event.proto

package com.likechain.likenft.v1;

public interface EventRevealClassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.EventRevealClass)
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
   * <code>bool success = 2 [json_name = "success"];</code>
   * @return The success.
   */
  boolean getSuccess();

  /**
   * <code>string error = 3 [json_name = "error"];</code>
   * @return The error.
   */
  java.lang.String getError();
  /**
   * <code>string error = 3 [json_name = "error"];</code>
   * @return The bytes for error.
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
