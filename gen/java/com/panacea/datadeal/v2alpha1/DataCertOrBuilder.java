// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha1/tx.proto

package com.panacea.datadeal.v2alpha1;

public interface DataCertOrBuilder extends
    // @@protoc_insertion_point(interface_extends:panacea.datadeal.v2alpha1.DataCert)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.panacea.datadeal.v2alpha1.UnsignedDataCert unsigned_cert = 1 [json_name = "unsignedCert"];</code>
   * @return Whether the unsignedCert field is set.
   */
  boolean hasUnsignedCert();
  /**
   * <code>.panacea.datadeal.v2alpha1.UnsignedDataCert unsigned_cert = 1 [json_name = "unsignedCert"];</code>
   * @return The unsignedCert.
   */
  com.panacea.datadeal.v2alpha1.UnsignedDataCert getUnsignedCert();
  /**
   * <code>.panacea.datadeal.v2alpha1.UnsignedDataCert unsigned_cert = 1 [json_name = "unsignedCert"];</code>
   */
  com.panacea.datadeal.v2alpha1.UnsignedDataCertOrBuilder getUnsignedCertOrBuilder();

  /**
   * <code>bytes signature = 2 [json_name = "signature"];</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();
}
