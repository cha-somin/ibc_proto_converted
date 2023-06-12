// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/iid/v1beta1/tx.proto

package com.ixo.iid.v1beta1;

public interface MsgAddLinkedEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.iid.v1beta1.MsgAddLinkedEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the iid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * the iid
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * the entity to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.LinkedEntity linkedEntity = 2 [json_name = "linkedEntity"];</code>
   * @return Whether the linkedEntity field is set.
   */
  boolean hasLinkedEntity();
  /**
   * <pre>
   * the entity to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.LinkedEntity linkedEntity = 2 [json_name = "linkedEntity"];</code>
   * @return The linkedEntity.
   */
  com.ixo.iid.v1beta1.LinkedEntity getLinkedEntity();
  /**
   * <pre>
   * the entity to add
   * </pre>
   *
   * <code>.ixo.iid.v1beta1.LinkedEntity linkedEntity = 2 [json_name = "linkedEntity"];</code>
   */
  com.ixo.iid.v1beta1.LinkedEntityOrBuilder getLinkedEntityOrBuilder();

  /**
   * <pre>
   * address of the account signing the message
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * address of the account signing the message
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();
}
