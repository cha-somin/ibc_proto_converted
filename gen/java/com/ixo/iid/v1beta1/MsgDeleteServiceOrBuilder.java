// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/iid/v1beta1/tx.proto

package com.ixo.iid.v1beta1;

public interface MsgDeleteServiceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.iid.v1beta1.MsgDeleteService)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the did
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * the did
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * the service id
   * </pre>
   *
   * <code>string service_id = 2 [json_name = "serviceId"];</code>
   * @return The serviceId.
   */
  java.lang.String getServiceId();
  /**
   * <pre>
   * the service id
   * </pre>
   *
   * <code>string service_id = 2 [json_name = "serviceId"];</code>
   * @return The bytes for serviceId.
   */
  com.google.protobuf.ByteString
      getServiceIdBytes();

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
