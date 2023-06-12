// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

public interface MsgMigrateValueOwnerRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.MsgMigrateValueOwnerRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * existing is the value owner address that is being migrated.
   * </pre>
   *
   * <code>string existing = 1 [json_name = "existing"];</code>
   * @return The existing.
   */
  java.lang.String getExisting();
  /**
   * <pre>
   * existing is the value owner address that is being migrated.
   * </pre>
   *
   * <code>string existing = 1 [json_name = "existing"];</code>
   * @return The bytes for existing.
   */
  com.google.protobuf.ByteString
      getExistingBytes();

  /**
   * <pre>
   * proposed is the new value owner address for all of existing's scopes.
   * </pre>
   *
   * <code>string proposed = 2 [json_name = "proposed"];</code>
   * @return The proposed.
   */
  java.lang.String getProposed();
  /**
   * <pre>
   * proposed is the new value owner address for all of existing's scopes.
   * </pre>
   *
   * <code>string proposed = 2 [json_name = "proposed"];</code>
   * @return The bytes for proposed.
   */
  com.google.protobuf.ByteString
      getProposedBytes();

  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  java.util.List<java.lang.String>
      getSignersList();
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  int getSignersCount();
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  java.lang.String getSigners(int index);
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  com.google.protobuf.ByteString
      getSignersBytes(int index);
}
