// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/nft/v1/genesis.proto

package com.coreum.asset.nft.v1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.nft.v1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.coreum.asset.nft.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.coreum.asset.nft.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.coreum.asset.nft.v1.Params getParams();
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.coreum.asset.nft.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.coreum.asset.nft.v1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <pre>
   * class_definitions keep the non-fungible token class definitions state
   * </pre>
   *
   * <code>repeated .coreum.asset.nft.v1.ClassDefinition class_definitions = 2 [json_name = "classDefinitions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.coreum.asset.nft.v1.ClassDefinition> 
      getClassDefinitionsList();
  /**
   * <pre>
   * class_definitions keep the non-fungible token class definitions state
   * </pre>
   *
   * <code>repeated .coreum.asset.nft.v1.ClassDefinition class_definitions = 2 [json_name = "classDefinitions", (.gogoproto.nullable) = false];</code>
   */
  com.coreum.asset.nft.v1.ClassDefinition getClassDefinitions(int index);
  /**
   * <pre>
   * class_definitions keep the non-fungible token class definitions state
   * </pre>
   *
   * <code>repeated .coreum.asset.nft.v1.ClassDefinition class_definitions = 2 [json_name = "classDefinitions", (.gogoproto.nullable) = false];</code>
   */
  int getClassDefinitionsCount();
  /**
   * <pre>
   * class_definitions keep the non-fungible token class definitions state
   * </pre>
   *
   * <code>repeated .coreum.asset.nft.v1.ClassDefinition class_definitions = 2 [json_name = "classDefinitions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.coreum.asset.nft.v1.ClassDefinitionOrBuilder> 
      getClassDefinitionsOrBuilderList();
  /**
   * <pre>
   * class_definitions keep the non-fungible token class definitions state
   * </pre>
   *
   * <code>repeated .coreum.asset.nft.v1.ClassDefinition class_definitions = 2 [json_name = "classDefinitions", (.gogoproto.nullable) = false];</code>
   */
  com.coreum.asset.nft.v1.ClassDefinitionOrBuilder getClassDefinitionsOrBuilder(
      int index);

  /**
   * <code>repeated .coreum.asset.nft.v1.FrozenNFT frozen_nfts = 3 [json_name = "frozenNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "FrozenNFTs"];</code>
   */
  java.util.List<com.coreum.asset.nft.v1.FrozenNFT> 
      getFrozenNftsList();
  /**
   * <code>repeated .coreum.asset.nft.v1.FrozenNFT frozen_nfts = 3 [json_name = "frozenNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "FrozenNFTs"];</code>
   */
  com.coreum.asset.nft.v1.FrozenNFT getFrozenNfts(int index);
  /**
   * <code>repeated .coreum.asset.nft.v1.FrozenNFT frozen_nfts = 3 [json_name = "frozenNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "FrozenNFTs"];</code>
   */
  int getFrozenNftsCount();
  /**
   * <code>repeated .coreum.asset.nft.v1.FrozenNFT frozen_nfts = 3 [json_name = "frozenNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "FrozenNFTs"];</code>
   */
  java.util.List<? extends com.coreum.asset.nft.v1.FrozenNFTOrBuilder> 
      getFrozenNftsOrBuilderList();
  /**
   * <code>repeated .coreum.asset.nft.v1.FrozenNFT frozen_nfts = 3 [json_name = "frozenNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "FrozenNFTs"];</code>
   */
  com.coreum.asset.nft.v1.FrozenNFTOrBuilder getFrozenNftsOrBuilder(
      int index);

  /**
   * <code>repeated .coreum.asset.nft.v1.WhitelistedNFTAccounts whitelisted_nft_accounts = 4 [json_name = "whitelistedNftAccounts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "WhitelistedNFTAccounts"];</code>
   */
  java.util.List<com.coreum.asset.nft.v1.WhitelistedNFTAccounts> 
      getWhitelistedNftAccountsList();
  /**
   * <code>repeated .coreum.asset.nft.v1.WhitelistedNFTAccounts whitelisted_nft_accounts = 4 [json_name = "whitelistedNftAccounts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "WhitelistedNFTAccounts"];</code>
   */
  com.coreum.asset.nft.v1.WhitelistedNFTAccounts getWhitelistedNftAccounts(int index);
  /**
   * <code>repeated .coreum.asset.nft.v1.WhitelistedNFTAccounts whitelisted_nft_accounts = 4 [json_name = "whitelistedNftAccounts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "WhitelistedNFTAccounts"];</code>
   */
  int getWhitelistedNftAccountsCount();
  /**
   * <code>repeated .coreum.asset.nft.v1.WhitelistedNFTAccounts whitelisted_nft_accounts = 4 [json_name = "whitelistedNftAccounts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "WhitelistedNFTAccounts"];</code>
   */
  java.util.List<? extends com.coreum.asset.nft.v1.WhitelistedNFTAccountsOrBuilder> 
      getWhitelistedNftAccountsOrBuilderList();
  /**
   * <code>repeated .coreum.asset.nft.v1.WhitelistedNFTAccounts whitelisted_nft_accounts = 4 [json_name = "whitelistedNftAccounts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "WhitelistedNFTAccounts"];</code>
   */
  com.coreum.asset.nft.v1.WhitelistedNFTAccountsOrBuilder getWhitelistedNftAccountsOrBuilder(
      int index);

  /**
   * <code>repeated .coreum.asset.nft.v1.BurntNFT burnt_nfts = 5 [json_name = "burntNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BurntNFTs"];</code>
   */
  java.util.List<com.coreum.asset.nft.v1.BurntNFT> 
      getBurntNftsList();
  /**
   * <code>repeated .coreum.asset.nft.v1.BurntNFT burnt_nfts = 5 [json_name = "burntNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BurntNFTs"];</code>
   */
  com.coreum.asset.nft.v1.BurntNFT getBurntNfts(int index);
  /**
   * <code>repeated .coreum.asset.nft.v1.BurntNFT burnt_nfts = 5 [json_name = "burntNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BurntNFTs"];</code>
   */
  int getBurntNftsCount();
  /**
   * <code>repeated .coreum.asset.nft.v1.BurntNFT burnt_nfts = 5 [json_name = "burntNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BurntNFTs"];</code>
   */
  java.util.List<? extends com.coreum.asset.nft.v1.BurntNFTOrBuilder> 
      getBurntNftsOrBuilderList();
  /**
   * <code>repeated .coreum.asset.nft.v1.BurntNFT burnt_nfts = 5 [json_name = "burntNfts", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BurntNFTs"];</code>
   */
  com.coreum.asset.nft.v1.BurntNFTOrBuilder getBurntNftsOrBuilder(
      int index);
}
