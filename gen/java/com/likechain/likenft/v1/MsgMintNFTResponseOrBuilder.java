// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/tx.proto

package com.likechain.likenft.v1;

public interface MsgMintNFTResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:likechain.likenft.v1.MsgMintNFTResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.cosmos.nft.v1beta1.NFT nft = 1 [json_name = "nft", (.gogoproto.nullable) = false];</code>
   * @return Whether the nft field is set.
   */
  boolean hasNft();
  /**
   * <code>.cosmos.nft.v1beta1.NFT nft = 1 [json_name = "nft", (.gogoproto.nullable) = false];</code>
   * @return The nft.
   */
  com.cosmos.nft.v1beta1.NFT getNft();
  /**
   * <code>.cosmos.nft.v1beta1.NFT nft = 1 [json_name = "nft", (.gogoproto.nullable) = false];</code>
   */
  com.cosmos.nft.v1beta1.NFTOrBuilder getNftOrBuilder();
}
