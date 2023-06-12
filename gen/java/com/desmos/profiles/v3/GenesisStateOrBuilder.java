// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/genesis.proto

package com.desmos.profiles.v3;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .desmos.profiles.v3.DTagTransferRequest dtag_transfer_requests = 1 [json_name = "dtagTransferRequests", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DTagTransferRequests", (.gogoproto.moretags) = "yaml:&#92;"dtag_transfer_requests&#92;""];</code>
   */
  java.util.List<com.desmos.profiles.v3.DTagTransferRequest> 
      getDtagTransferRequestsList();
  /**
   * <code>repeated .desmos.profiles.v3.DTagTransferRequest dtag_transfer_requests = 1 [json_name = "dtagTransferRequests", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DTagTransferRequests", (.gogoproto.moretags) = "yaml:&#92;"dtag_transfer_requests&#92;""];</code>
   */
  com.desmos.profiles.v3.DTagTransferRequest getDtagTransferRequests(int index);
  /**
   * <code>repeated .desmos.profiles.v3.DTagTransferRequest dtag_transfer_requests = 1 [json_name = "dtagTransferRequests", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DTagTransferRequests", (.gogoproto.moretags) = "yaml:&#92;"dtag_transfer_requests&#92;""];</code>
   */
  int getDtagTransferRequestsCount();
  /**
   * <code>repeated .desmos.profiles.v3.DTagTransferRequest dtag_transfer_requests = 1 [json_name = "dtagTransferRequests", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DTagTransferRequests", (.gogoproto.moretags) = "yaml:&#92;"dtag_transfer_requests&#92;""];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.DTagTransferRequestOrBuilder> 
      getDtagTransferRequestsOrBuilderList();
  /**
   * <code>repeated .desmos.profiles.v3.DTagTransferRequest dtag_transfer_requests = 1 [json_name = "dtagTransferRequests", (.gogoproto.nullable) = false, (.gogoproto.customname) = "DTagTransferRequests", (.gogoproto.moretags) = "yaml:&#92;"dtag_transfer_requests&#92;""];</code>
   */
  com.desmos.profiles.v3.DTagTransferRequestOrBuilder getDtagTransferRequestsOrBuilder(
      int index);

  /**
   * <code>repeated .desmos.profiles.v3.ChainLink chain_links = 2 [json_name = "chainLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"chain_links&#92;""];</code>
   */
  java.util.List<com.desmos.profiles.v3.ChainLink> 
      getChainLinksList();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink chain_links = 2 [json_name = "chainLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"chain_links&#92;""];</code>
   */
  com.desmos.profiles.v3.ChainLink getChainLinks(int index);
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink chain_links = 2 [json_name = "chainLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"chain_links&#92;""];</code>
   */
  int getChainLinksCount();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink chain_links = 2 [json_name = "chainLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"chain_links&#92;""];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.ChainLinkOrBuilder> 
      getChainLinksOrBuilderList();
  /**
   * <code>repeated .desmos.profiles.v3.ChainLink chain_links = 2 [json_name = "chainLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"chain_links&#92;""];</code>
   */
  com.desmos.profiles.v3.ChainLinkOrBuilder getChainLinksOrBuilder(
      int index);

  /**
   * <code>repeated .desmos.profiles.v3.ApplicationLink application_links = 3 [json_name = "applicationLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"application_links&#92;""];</code>
   */
  java.util.List<com.desmos.profiles.v3.ApplicationLink> 
      getApplicationLinksList();
  /**
   * <code>repeated .desmos.profiles.v3.ApplicationLink application_links = 3 [json_name = "applicationLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"application_links&#92;""];</code>
   */
  com.desmos.profiles.v3.ApplicationLink getApplicationLinks(int index);
  /**
   * <code>repeated .desmos.profiles.v3.ApplicationLink application_links = 3 [json_name = "applicationLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"application_links&#92;""];</code>
   */
  int getApplicationLinksCount();
  /**
   * <code>repeated .desmos.profiles.v3.ApplicationLink application_links = 3 [json_name = "applicationLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"application_links&#92;""];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.ApplicationLinkOrBuilder> 
      getApplicationLinksOrBuilderList();
  /**
   * <code>repeated .desmos.profiles.v3.ApplicationLink application_links = 3 [json_name = "applicationLinks", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"application_links&#92;""];</code>
   */
  com.desmos.profiles.v3.ApplicationLinkOrBuilder getApplicationLinksOrBuilder(
      int index);

  /**
   * <code>repeated .desmos.profiles.v3.DefaultExternalAddressEntry default_external_addresses = 4 [json_name = "defaultExternalAddresses", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"default_external_addresses&#92;""];</code>
   */
  java.util.List<com.desmos.profiles.v3.DefaultExternalAddressEntry> 
      getDefaultExternalAddressesList();
  /**
   * <code>repeated .desmos.profiles.v3.DefaultExternalAddressEntry default_external_addresses = 4 [json_name = "defaultExternalAddresses", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"default_external_addresses&#92;""];</code>
   */
  com.desmos.profiles.v3.DefaultExternalAddressEntry getDefaultExternalAddresses(int index);
  /**
   * <code>repeated .desmos.profiles.v3.DefaultExternalAddressEntry default_external_addresses = 4 [json_name = "defaultExternalAddresses", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"default_external_addresses&#92;""];</code>
   */
  int getDefaultExternalAddressesCount();
  /**
   * <code>repeated .desmos.profiles.v3.DefaultExternalAddressEntry default_external_addresses = 4 [json_name = "defaultExternalAddresses", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"default_external_addresses&#92;""];</code>
   */
  java.util.List<? extends com.desmos.profiles.v3.DefaultExternalAddressEntryOrBuilder> 
      getDefaultExternalAddressesOrBuilderList();
  /**
   * <code>repeated .desmos.profiles.v3.DefaultExternalAddressEntry default_external_addresses = 4 [json_name = "defaultExternalAddresses", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"default_external_addresses&#92;""];</code>
   */
  com.desmos.profiles.v3.DefaultExternalAddressEntryOrBuilder getDefaultExternalAddressesOrBuilder(
      int index);

  /**
   * <code>string ibc_port_id = 5 [json_name = "ibcPortId", (.gogoproto.customname) = "IBCPortID", (.gogoproto.moretags) = "yaml:&#92;"ibc_port_id&#92;""];</code>
   * @return The ibcPortId.
   */
  java.lang.String getIbcPortId();
  /**
   * <code>string ibc_port_id = 5 [json_name = "ibcPortId", (.gogoproto.customname) = "IBCPortID", (.gogoproto.moretags) = "yaml:&#92;"ibc_port_id&#92;""];</code>
   * @return The bytes for ibcPortId.
   */
  com.google.protobuf.ByteString
      getIbcPortIdBytes();

  /**
   * <code>.desmos.profiles.v3.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.desmos.profiles.v3.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   * @return The params.
   */
  com.desmos.profiles.v3.Params getParams();
  /**
   * <code>.desmos.profiles.v3.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   */
  com.desmos.profiles.v3.ParamsOrBuilder getParamsOrBuilder();
}
