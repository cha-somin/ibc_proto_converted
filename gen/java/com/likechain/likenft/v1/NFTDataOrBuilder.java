// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/nft_data.proto

package com.likechain.likenft.v1;

public interface NFTDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.NFTData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "JsonInput"];</code>
   * @return The metadata.
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <code>.likechain.likenft.v1.ClassParent class_parent = 2 [json_name = "classParent", (.gogoproto.nullable) = false];</code>
   * @return Whether the classParent field is set.
   */
  boolean hasClassParent();
  /**
   * <code>.likechain.likenft.v1.ClassParent class_parent = 2 [json_name = "classParent", (.gogoproto.nullable) = false];</code>
   * @return The classParent.
   */
  com.likechain.likenft.v1.ClassParent getClassParent();
  /**
   * <code>.likechain.likenft.v1.ClassParent class_parent = 2 [json_name = "classParent", (.gogoproto.nullable) = false];</code>
   */
  com.likechain.likenft.v1.ClassParentOrBuilder getClassParentOrBuilder();

  /**
   * <code>bool to_be_revealed = 3 [json_name = "toBeRevealed"];</code>
   * @return The toBeRevealed.
   */
  boolean getToBeRevealed();
}
