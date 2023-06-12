// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta2/audit.proto

package com.akash.audit.v1beta2;

public interface MsgDeleteProviderAttributesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.audit.v1beta2.MsgDeleteProviderAttributes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>string auditor = 2 [json_name = "auditor", (.gogoproto.jsontag) = "auditor", (.gogoproto.moretags) = "yaml:&#92;"auditor&#92;""];</code>
   * @return The auditor.
   */
  java.lang.String getAuditor();
  /**
   * <code>string auditor = 2 [json_name = "auditor", (.gogoproto.jsontag) = "auditor", (.gogoproto.moretags) = "yaml:&#92;"auditor&#92;""];</code>
   * @return The bytes for auditor.
   */
  com.google.protobuf.ByteString
      getAuditorBytes();

  /**
   * <code>repeated string keys = 3 [json_name = "keys", (.gogoproto.jsontag) = "keys", (.gogoproto.moretags) = "yaml:&#92;"keys&#92;""];</code>
   * @return A list containing the keys.
   */
  java.util.List<java.lang.String>
      getKeysList();
  /**
   * <code>repeated string keys = 3 [json_name = "keys", (.gogoproto.jsontag) = "keys", (.gogoproto.moretags) = "yaml:&#92;"keys&#92;""];</code>
   * @return The count of keys.
   */
  int getKeysCount();
  /**
   * <code>repeated string keys = 3 [json_name = "keys", (.gogoproto.jsontag) = "keys", (.gogoproto.moretags) = "yaml:&#92;"keys&#92;""];</code>
   * @param index The index of the element to return.
   * @return The keys at the given index.
   */
  java.lang.String getKeys(int index);
  /**
   * <code>repeated string keys = 3 [json_name = "keys", (.gogoproto.jsontag) = "keys", (.gogoproto.moretags) = "yaml:&#92;"keys&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keys at the given index.
   */
  com.google.protobuf.ByteString
      getKeysBytes(int index);
}
