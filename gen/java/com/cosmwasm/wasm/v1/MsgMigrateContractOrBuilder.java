// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package com.cosmwasm.wasm.v1;

public interface MsgMigrateContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.MsgMigrateContract)
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
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 2 [json_name = "contract"];</code>
   * @return The contract.
   */
  java.lang.String getContract();
  /**
   * <pre>
   * Contract is the address of the smart contract
   * </pre>
   *
   * <code>string contract = 2 [json_name = "contract"];</code>
   * @return The bytes for contract.
   */
  com.google.protobuf.ByteString
      getContractBytes();

  /**
   * <pre>
   * CodeID references the new WASM code
   * </pre>
   *
   * <code>uint64 code_id = 3 [json_name = "codeId", (.gogoproto.customname) = "CodeID"];</code>
   * @return The codeId.
   */
  long getCodeId();

  /**
   * <pre>
   * Msg json encoded message to be passed to the contract on migration
   * </pre>
   *
   * <code>bytes msg = 4 [json_name = "msg", (.gogoproto.casttype) = "RawContractMessage"];</code>
   * @return The msg.
   */
  com.google.protobuf.ByteString getMsg();
}
