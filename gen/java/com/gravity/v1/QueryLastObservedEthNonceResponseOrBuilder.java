// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/query.proto

package com.gravity.v1;

public interface QueryLastObservedEthNonceResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:gravity.v1.QueryLastObservedEthNonceResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * a response of 0 indicates that no Ethereum events have been observed, and thus
   * the bridge is inactive
   * </pre>
   *
   * <code>uint64 nonce = 1 [json_name = "nonce"];</code>
   * @return The nonce.
   */
  long getNonce();
}
