// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta2/audit.proto

package com.akash.audit.v1beta2;

public interface AttributesFiltersOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.audit.v1beta2.AttributesFilters)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @return A list containing the auditors.
   */
  java.util.List<java.lang.String>
      getAuditorsList();
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @return The count of auditors.
   */
  int getAuditorsCount();
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @param index The index of the element to return.
   * @return The auditors at the given index.
   */
  java.lang.String getAuditors(int index);
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the auditors at the given index.
   */
  com.google.protobuf.ByteString
      getAuditorsBytes(int index);

  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @return A list containing the owners.
   */
  java.util.List<java.lang.String>
      getOwnersList();
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @return The count of owners.
   */
  int getOwnersCount();
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @param index The index of the element to return.
   * @return The owners at the given index.
   */
  java.lang.String getOwners(int index);
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the owners at the given index.
   */
  com.google.protobuf.ByteString
      getOwnersBytes(int index);
}
