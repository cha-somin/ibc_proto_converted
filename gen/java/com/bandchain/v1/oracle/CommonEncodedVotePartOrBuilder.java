// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: band/bandchain/v1/oracle/proof.proto

package com.bandchain.v1.oracle;

public interface CommonEncodedVotePartOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bandchain.v1.oracle.CommonEncodedVotePart)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes signed_data_prefix = 1 [json_name = "signedDataPrefix", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
   * @return The signedDataPrefix.
   */
  com.google.protobuf.ByteString getSignedDataPrefix();

  /**
   * <code>bytes signed_data_suffix = 2 [json_name = "signedDataSuffix", (.gogoproto.casttype) = "github.com/tendermint/tendermint/libs/bytes.HexBytes"];</code>
   * @return The signedDataSuffix.
   */
  com.google.protobuf.ByteString getSignedDataSuffix();
}
