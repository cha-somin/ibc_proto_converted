// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/royalty_config.proto

package com.likechain.likenft.v1;

public interface RoyaltyConfigByClassOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.RoyaltyConfigByClass)
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
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 2 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return Whether the royaltyConfig field is set.
   */
  boolean hasRoyaltyConfig();
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 2 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   * @return The royaltyConfig.
   */
  com.likechain.likenft.v1.RoyaltyConfig getRoyaltyConfig();
  /**
   * <code>.likechain.likenft.v1.RoyaltyConfig royalty_config = 2 [json_name = "royaltyConfig", (.gogoproto.nullable) = false];</code>
   */
  com.likechain.likenft.v1.RoyaltyConfigOrBuilder getRoyaltyConfigOrBuilder();
}
