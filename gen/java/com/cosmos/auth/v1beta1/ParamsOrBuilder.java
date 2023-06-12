// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/auth/v1beta1/auth.proto

package com.cosmos.auth.v1beta1;

public interface ParamsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.auth.v1beta1.Params)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 max_memo_characters = 1 [json_name = "maxMemoCharacters"];</code>
   * @return The maxMemoCharacters.
   */
  long getMaxMemoCharacters();

  /**
   * <code>uint64 tx_sig_limit = 2 [json_name = "txSigLimit"];</code>
   * @return The txSigLimit.
   */
  long getTxSigLimit();

  /**
   * <code>uint64 tx_size_cost_per_byte = 3 [json_name = "txSizeCostPerByte"];</code>
   * @return The txSizeCostPerByte.
   */
  long getTxSizeCostPerByte();

  /**
   * <code>uint64 sig_verify_cost_ed25519 = 4 [json_name = "sigVerifyCostEd25519", (.gogoproto.customname) = "SigVerifyCostED25519"];</code>
   * @return The sigVerifyCostEd25519.
   */
  long getSigVerifyCostEd25519();

  /**
   * <code>uint64 sig_verify_cost_secp256k1 = 5 [json_name = "sigVerifyCostSecp256k1", (.gogoproto.customname) = "SigVerifyCostSecp256k1"];</code>
   * @return The sigVerifyCostSecp256k1.
   */
  long getSigVerifyCostSecp256K1();
}
