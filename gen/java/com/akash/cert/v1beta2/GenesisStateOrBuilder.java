// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/cert/v1beta2/genesis.proto

package com.akash.cert.v1beta2;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:akash.cert.v1beta2.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .akash.cert.v1beta2.GenesisCertificate certificates = 1 [json_name = "certificates", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificates", (.gogoproto.moretags) = "yaml:&#92;"certificates&#92;"", (.gogoproto.castrepeated) = "GenesisCertificates"];</code>
   */
  java.util.List<com.akash.cert.v1beta2.GenesisCertificate> 
      getCertificatesList();
  /**
   * <code>repeated .akash.cert.v1beta2.GenesisCertificate certificates = 1 [json_name = "certificates", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificates", (.gogoproto.moretags) = "yaml:&#92;"certificates&#92;"", (.gogoproto.castrepeated) = "GenesisCertificates"];</code>
   */
  com.akash.cert.v1beta2.GenesisCertificate getCertificates(int index);
  /**
   * <code>repeated .akash.cert.v1beta2.GenesisCertificate certificates = 1 [json_name = "certificates", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificates", (.gogoproto.moretags) = "yaml:&#92;"certificates&#92;"", (.gogoproto.castrepeated) = "GenesisCertificates"];</code>
   */
  int getCertificatesCount();
  /**
   * <code>repeated .akash.cert.v1beta2.GenesisCertificate certificates = 1 [json_name = "certificates", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificates", (.gogoproto.moretags) = "yaml:&#92;"certificates&#92;"", (.gogoproto.castrepeated) = "GenesisCertificates"];</code>
   */
  java.util.List<? extends com.akash.cert.v1beta2.GenesisCertificateOrBuilder> 
      getCertificatesOrBuilderList();
  /**
   * <code>repeated .akash.cert.v1beta2.GenesisCertificate certificates = 1 [json_name = "certificates", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "certificates", (.gogoproto.moretags) = "yaml:&#92;"certificates&#92;"", (.gogoproto.castrepeated) = "GenesisCertificates"];</code>
   */
  com.akash.cert.v1beta2.GenesisCertificateOrBuilder getCertificatesOrBuilder(
      int index);
}
