// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

public interface AuxSignerDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.AuxSignerData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * address is the bech32-encoded address of the auxiliary signer. If using
   * AuxSignerData across different chains, the bech32 prefix of the target
   * chain (where the final transaction is broadcasted) should be used.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <pre>
   * address is the bech32-encoded address of the auxiliary signer. If using
   * AuxSignerData across different chains, the bech32 prefix of the target
   * chain (where the final transaction is broadcasted) should be used.
   * </pre>
   *
   * <code>string address = 1 [json_name = "address", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <pre>
   * sign_doc is the SIGN_MODE_DIRECT_AUX sign doc that the auxiliary signer
   * signs. Note: we use the same sign doc even if we're signing with
   * LEGACY_AMINO_JSON.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.SignDocDirectAux sign_doc = 2 [json_name = "signDoc"];</code>
   * @return Whether the signDoc field is set.
   */
  boolean hasSignDoc();
  /**
   * <pre>
   * sign_doc is the SIGN_MODE_DIRECT_AUX sign doc that the auxiliary signer
   * signs. Note: we use the same sign doc even if we're signing with
   * LEGACY_AMINO_JSON.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.SignDocDirectAux sign_doc = 2 [json_name = "signDoc"];</code>
   * @return The signDoc.
   */
  com.cosmos.tx.v1beta1.SignDocDirectAux getSignDoc();
  /**
   * <pre>
   * sign_doc is the SIGN_MODE_DIRECT_AUX sign doc that the auxiliary signer
   * signs. Note: we use the same sign doc even if we're signing with
   * LEGACY_AMINO_JSON.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.SignDocDirectAux sign_doc = 2 [json_name = "signDoc"];</code>
   */
  com.cosmos.tx.v1beta1.SignDocDirectAuxOrBuilder getSignDocOrBuilder();

  /**
   * <pre>
   * mode is the signing mode of the single signer.
   * </pre>
   *
   * <code>.cosmos.tx.signing.v1beta1.SignMode mode = 3 [json_name = "mode"];</code>
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   * <pre>
   * mode is the signing mode of the single signer.
   * </pre>
   *
   * <code>.cosmos.tx.signing.v1beta1.SignMode mode = 3 [json_name = "mode"];</code>
   * @return The mode.
   */
  com.cosmos.tx.signing.v1beta1.SignMode getMode();

  /**
   * <pre>
   * sig is the signature of the sign doc.
   * </pre>
   *
   * <code>bytes sig = 4 [json_name = "sig"];</code>
   * @return The sig.
   */
  com.google.protobuf.ByteString getSig();
}
