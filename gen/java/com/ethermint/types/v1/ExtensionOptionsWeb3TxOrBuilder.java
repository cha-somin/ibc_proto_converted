// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/types/v1/web3.proto

package com.ethermint.types.v1;

public interface ExtensionOptionsWeb3TxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ethermint.types.v1.ExtensionOptionsWeb3Tx)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * typed_data_chain_id is used only in EIP712 Domain and should match
   * Ethereum network ID in a Web3 provider (e.g. Metamask).
   * </pre>
   *
   * <code>uint64 typed_data_chain_id = 1 [json_name = "typedDataChainId", (.gogoproto.customname) = "TypedDataChainID", (.gogoproto.jsontag) = "typedDataChainID,omitempty"];</code>
   * @return The typedDataChainId.
   */
  long getTypedDataChainId();

  /**
   * <pre>
   * fee_payer is an account address for the fee payer. It will be validated
   * during EIP712 signature checking.
   * </pre>
   *
   * <code>string fee_payer = 2 [json_name = "feePayer", (.gogoproto.jsontag) = "feePayer,omitempty"];</code>
   * @return The feePayer.
   */
  java.lang.String getFeePayer();
  /**
   * <pre>
   * fee_payer is an account address for the fee payer. It will be validated
   * during EIP712 signature checking.
   * </pre>
   *
   * <code>string fee_payer = 2 [json_name = "feePayer", (.gogoproto.jsontag) = "feePayer,omitempty"];</code>
   * @return The bytes for feePayer.
   */
  com.google.protobuf.ByteString
      getFeePayerBytes();

  /**
   * <pre>
   * fee_payer_sig is a signature data from the fee paying account,
   * allows to perform fee delegation when using EIP712 Domain.
   * </pre>
   *
   * <code>bytes fee_payer_sig = 3 [json_name = "feePayerSig", (.gogoproto.jsontag) = "feePayerSig,omitempty"];</code>
   * @return The feePayerSig.
   */
  com.google.protobuf.ByteString getFeePayerSig();
}
