// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/service/service.proto

package com.irismod.service;

public interface ServiceDefinitionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.service.ServiceDefinition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <code>repeated string tags = 3 [json_name = "tags"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);

  /**
   * <code>string author = 4 [json_name = "author"];</code>
   * @return The author.
   */
  java.lang.String getAuthor();
  /**
   * <code>string author = 4 [json_name = "author"];</code>
   * @return The bytes for author.
   */
  com.google.protobuf.ByteString
      getAuthorBytes();

  /**
   * <code>string author_description = 5 [json_name = "authorDescription", (.gogoproto.moretags) = "yaml:&#92;"author_description&#92;""];</code>
   * @return The authorDescription.
   */
  java.lang.String getAuthorDescription();
  /**
   * <code>string author_description = 5 [json_name = "authorDescription", (.gogoproto.moretags) = "yaml:&#92;"author_description&#92;""];</code>
   * @return The bytes for authorDescription.
   */
  com.google.protobuf.ByteString
      getAuthorDescriptionBytes();

  /**
   * <code>string schemas = 6 [json_name = "schemas"];</code>
   * @return The schemas.
   */
  java.lang.String getSchemas();
  /**
   * <code>string schemas = 6 [json_name = "schemas"];</code>
   * @return The bytes for schemas.
   */
  com.google.protobuf.ByteString
      getSchemasBytes();
}
