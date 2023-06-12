// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta1/attribute.proto

package com.akash.base.v1beta1;

public interface SignedByOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.base.v1beta1.SignedBy)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @return A list containing the allOf.
   */
  java.util.List<java.lang.String>
      getAllOfList();
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @return The count of allOf.
   */
  int getAllOfCount();
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @param index The index of the element to return.
   * @return The allOf at the given index.
   */
  java.lang.String getAllOf(int index);
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allOf at the given index.
   */
  com.google.protobuf.ByteString
      getAllOfBytes(int index);

  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @return A list containing the anyOf.
   */
  java.util.List<java.lang.String>
      getAnyOfList();
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @return The count of anyOf.
   */
  int getAnyOfCount();
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @param index The index of the element to return.
   * @return The anyOf at the given index.
   */
  java.lang.String getAnyOf(int index);
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the anyOf at the given index.
   */
  com.google.protobuf.ByteString
      getAnyOfBytes(int index);
}
