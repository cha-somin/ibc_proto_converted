// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: secret/registration/v1beta1/msg.proto

package com.secret.registration.v1beta1;

public interface RaAuthenticateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:secret.registration.v1beta1.RaAuthenticate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  com.google.protobuf.ByteString getSender();

  /**
   * <code>bytes certificate = 2 [json_name = "certificate", (.gogoproto.jsontag) = "ra_cert", (.gogoproto.casttype) = "github.com/scrtlabs/SecretNetwork/x/registration/remote_attestation.Certificate"];</code>
   * @return The certificate.
   */
  com.google.protobuf.ByteString getCertificate();
}
