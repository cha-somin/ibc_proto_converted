// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/nft/nft.proto

package com.irismod.nft;

public interface CollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:irismod.nft.Collection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.irismod.nft.Denom denom = 1 [json_name = "denom", (.gogoproto.nullable) = false];</code>
   * @return Whether the denom field is set.
   */
  boolean hasDenom();
  /**
   * <code>.irismod.nft.Denom denom = 1 [json_name = "denom", (.gogoproto.nullable) = false];</code>
   * @return The denom.
   */
  com.irismod.nft.Denom getDenom();
  /**
   * <code>.irismod.nft.Denom denom = 1 [json_name = "denom", (.gogoproto.nullable) = false];</code>
   */
  com.irismod.nft.DenomOrBuilder getDenomOrBuilder();

  /**
   * <code>repeated .irismod.nft.BaseNFT nfts = 2 [json_name = "nfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "NFTs"];</code>
   */
  java.util.List<com.irismod.nft.BaseNFT> 
      getNftsList();
  /**
   * <code>repeated .irismod.nft.BaseNFT nfts = 2 [json_name = "nfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "NFTs"];</code>
   */
  com.irismod.nft.BaseNFT getNfts(int index);
  /**
   * <code>repeated .irismod.nft.BaseNFT nfts = 2 [json_name = "nfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "NFTs"];</code>
   */
  int getNftsCount();
  /**
   * <code>repeated .irismod.nft.BaseNFT nfts = 2 [json_name = "nfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "NFTs"];</code>
   */
  java.util.List<? extends com.irismod.nft.BaseNFTOrBuilder> 
      getNftsOrBuilderList();
  /**
   * <code>repeated .irismod.nft.BaseNFT nfts = 2 [json_name = "nfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "NFTs"];</code>
   */
  com.irismod.nft.BaseNFTOrBuilder getNftsOrBuilder(
      int index);
}
