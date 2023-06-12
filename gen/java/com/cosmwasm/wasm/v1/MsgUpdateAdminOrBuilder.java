// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package com.cosmwasm.wasm.v1;

public interface MsgUpdateAdminOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.MsgUpdateAdmin)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Sender is the that actor that signed the messages
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The sender.
   */
  java.lang.String getSender();
  /**
   * <pre>
   * Sender is the that actor that signed the messages
   * </pre>
   *
   * <code>string sender = 1 [json_name = "sender"];</code>
   * @return The bytes for sender.
   */
  com.google.protobuf.ByteString
      getSenderBytes();

  /**
   * <pre>
   * NewAdmin address to be set
   * </pre>
   *
   * <code>string new_admin = 2 [json_name = "newAdmin"];</code>
   * @return The newAdmin.
   */
  java.lang.String getNewAdmin();
  /**
   * <pre>
   * NewAdmin address to be set
   * </pre>
   *
   * <code>string new_admin = 2 [json_name = "newAdmin"];</code>
   * @return The bytes for newAdmin.
   */
  com.google.protobuf.ByteString
      getNewAdminBytes();

  /**
   * <pre>
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 3 [json_name = "contract"];</code>
   * @return The contract.
   */
  java.lang.String getContract();
  /**
   * <pre>
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 3 [json_name = "contract"];</code>
   * @return The bytes for contract.
   */
  com.google.protobuf.ByteString
      getContractBytes();
}
