// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/p8e/p8e.proto

package com.provenance.metadata.v1.p8e;

@java.lang.Deprecated public interface PublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:provenance.metadata.v1.p8e.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes public_key_bytes = 1 [json_name = "publicKeyBytes"];</code>
   * @return The publicKeyBytes.
   */
  com.google.protobuf.ByteString getPublicKeyBytes();

  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  com.provenance.metadata.v1.p8e.PublicKeyType getType();

  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
   * @return The enum numeric value on the wire for curve.
   */
  int getCurveValue();
  /**
   * <code>.provenance.metadata.v1.p8e.PublicKeyCurve curve = 3 [json_name = "curve"];</code>
   * @return The curve.
   */
  com.provenance.metadata.v1.p8e.PublicKeyCurve getCurve();
}
