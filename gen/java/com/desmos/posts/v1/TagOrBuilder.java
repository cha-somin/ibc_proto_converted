// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v1/models.proto

package com.desmos.posts.v1;

public interface TagOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.posts.v1.Tag)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Index of the character inside the text at which the tag starts
   * </pre>
   *
   * <code>uint64 start = 1 [json_name = "start"];</code>
   * @return The start.
   */
  long getStart();

  /**
   * <pre>
   * Index of the character inside the text at which the tag ends
   * </pre>
   *
   * <code>uint64 end = 2 [json_name = "end"];</code>
   * @return The end.
   */
  long getEnd();

  /**
   * <pre>
   * Tag reference (user address, hashtag value, etc)
   * </pre>
   *
   * <code>string tag = 3 [json_name = "tag"];</code>
   * @return The tag.
   */
  java.lang.String getTag();
  /**
   * <pre>
   * Tag reference (user address, hashtag value, etc)
   * </pre>
   *
   * <code>string tag = 3 [json_name = "tag"];</code>
   * @return The bytes for tag.
   */
  com.google.protobuf.ByteString
      getTagBytes();
}
