// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/mint/query.proto

package com.juno.mint;

public interface QueryAnnualProvisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:juno.mint.QueryAnnualProvisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * annual_provisions is the current minting annual provisions value.
   * </pre>
   *
   * <code>bytes annual_provisions = 1 [json_name = "annualProvisions", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The annualProvisions.
   */
  com.google.protobuf.ByteString getAnnualProvisions();
}
