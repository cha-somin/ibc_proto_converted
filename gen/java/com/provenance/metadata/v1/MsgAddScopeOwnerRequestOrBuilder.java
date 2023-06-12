// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

public interface MsgAddScopeOwnerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.MsgAddScopeOwnerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * scope MetadataAddress for updating data access
   * </pre>
   *
   * <code>bytes scope_id = 1 [json_name = "scopeId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_id&#92;""];</code>
   * @return The scopeId.
   */
  com.google.protobuf.ByteString getScopeId();

  /**
   * <pre>
   * owner parties to add to the scope
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.Party owners = 2 [json_name = "owners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   */
  java.util.List<com.provenance.metadata.v1.Party> 
      getOwnersList();
  /**
   * <pre>
   * owner parties to add to the scope
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.Party owners = 2 [json_name = "owners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   */
  com.provenance.metadata.v1.Party getOwners(int index);
  /**
   * <pre>
   * owner parties to add to the scope
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.Party owners = 2 [json_name = "owners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   */
  int getOwnersCount();
  /**
   * <pre>
   * owner parties to add to the scope
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.Party owners = 2 [json_name = "owners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   */
  java.util.List<? extends com.provenance.metadata.v1.PartyOrBuilder> 
      getOwnersOrBuilderList();
  /**
   * <pre>
   * owner parties to add to the scope
   * </pre>
   *
   * <code>repeated .provenance.metadata.v1.Party owners = 2 [json_name = "owners", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   */
  com.provenance.metadata.v1.PartyOrBuilder getOwnersOrBuilder(
      int index);

  /**
   * <pre>
   * signers is the list of address of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  java.util.List<java.lang.String>
      getSignersList();
  /**
   * <pre>
   * signers is the list of address of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  int getSignersCount();
  /**
   * <pre>
   * signers is the list of address of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  java.lang.String getSigners(int index);
  /**
   * <pre>
   * signers is the list of address of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  com.google.protobuf.ByteString
      getSignersBytes(int index);
}
