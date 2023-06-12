// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/tx.proto

package com.cosmwasm.wasm.v1;

public interface MsgInstantiateContractOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmwasm.wasm.v1.MsgInstantiateContract)
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
   * Admin is an optional address that can execute migrations
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * Admin is an optional address that can execute migrations
   * </pre>
   *
   * <code>string admin = 2 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * CodeID is the reference to the stored WASM code
   * </pre>
   *
   * <code>uint64 code_id = 3 [json_name = "codeId", (.gogoproto.customname) = "CodeID"];</code>
   * @return The codeId.
   */
  long getCodeId();

  /**
   * <pre>
   * Label is optional metadata to be stored with a contract instance.
   * </pre>
   *
   * <code>string label = 4 [json_name = "label"];</code>
   * @return The label.
   */
  java.lang.String getLabel();
  /**
   * <pre>
   * Label is optional metadata to be stored with a contract instance.
   * </pre>
   *
   * <code>string label = 4 [json_name = "label"];</code>
   * @return The bytes for label.
   */
  com.google.protobuf.ByteString
      getLabelBytes();

  /**
   * <pre>
   * Msg json encoded message to be passed to the contract on instantiation
   * </pre>
   *
   * <code>bytes msg = 5 [json_name = "msg", (.gogoproto.casttype) = "RawContractMessage"];</code>
   * @return The msg.
   */
  com.google.protobuf.ByteString getMsg();

  /**
   * <pre>
   * Funds coins that are transferred to the contract on instantiation
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin funds = 6 [json_name = "funds", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getFundsList();
  /**
   * <pre>
   * Funds coins that are transferred to the contract on instantiation
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin funds = 6 [json_name = "funds", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.Coin getFunds(int index);
  /**
   * <pre>
   * Funds coins that are transferred to the contract on instantiation
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin funds = 6 [json_name = "funds", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  int getFundsCount();
  /**
   * <pre>
   * Funds coins that are transferred to the contract on instantiation
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin funds = 6 [json_name = "funds", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getFundsOrBuilderList();
  /**
   * <pre>
   * Funds coins that are transferred to the contract on instantiation
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin funds = 6 [json_name = "funds", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getFundsOrBuilder(
      int index);
}
