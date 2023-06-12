// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/registration/v1beta1/remote_attestation/types.proto

package com.secret.registration.remote_attestation.v1beta1;

public interface EndorsedAttestationReportOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.registration.remote_attestation.v1beta1.EndorsedAttestationReport)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes report = 1 [json_name = "report"];</code>
   * @return The report.
   */
  com.google.protobuf.ByteString getReport();

  /**
   * <code>bytes signature = 2 [json_name = "signature"];</code>
   * @return The signature.
   */
  com.google.protobuf.ByteString getSignature();

  /**
   * <code>bytes signing_cert = 3 [json_name = "signingCert"];</code>
   * @return The signingCert.
   */
  com.google.protobuf.ByteString getSigningCert();
}
