// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta3/genesis.proto

package com.akash.cert.v1beta3;

public interface GenesisCertificateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.cert.v1beta3.GenesisCertificate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The owner.
   */
  java.lang.String getOwner();
  /**
   * <code>string owner = 1 [json_name = "owner", (.gogoproto.jsontag) = "owner", (.gogoproto.moretags) = "yaml:&#92;"owner&#92;""];</code>
   * @return The bytes for owner.
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return Whether the certificate field is set.
   */
  boolean hasCertificate();
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   * @return The certificate.
   */
  com.akash.cert.v1beta3.Certificate getCertificate();
  /**
   * <code>.akash.cert.v1beta3.Certificate certificate = 2 [json_name = "certificate", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificate", (.gogoproto.moretags) = "yaml:&#92;"certificate&#92;""];</code>
   */
  com.akash.cert.v1beta3.CertificateOrBuilder getCertificateOrBuilder();
}
