// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/collector/v1beta1/genesis.proto

package com.comdex.collector.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:comdex.collector.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToFeeCollectedData netFeeCollectedData = 1 [json_name = "netFeeCollectedData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"netFeeCollectedData&#92;""];</code>
   */
  java.util.List<com.comdex.collector.v1beta1.AppAssetIdToFeeCollectedData> 
      getNetFeeCollectedDataList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToFeeCollectedData netFeeCollectedData = 1 [json_name = "netFeeCollectedData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"netFeeCollectedData&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppAssetIdToFeeCollectedData getNetFeeCollectedData(int index);
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToFeeCollectedData netFeeCollectedData = 1 [json_name = "netFeeCollectedData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"netFeeCollectedData&#92;""];</code>
   */
  int getNetFeeCollectedDataCount();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToFeeCollectedData netFeeCollectedData = 1 [json_name = "netFeeCollectedData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"netFeeCollectedData&#92;""];</code>
   */
  java.util.List<? extends com.comdex.collector.v1beta1.AppAssetIdToFeeCollectedDataOrBuilder> 
      getNetFeeCollectedDataOrBuilderList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToFeeCollectedData netFeeCollectedData = 1 [json_name = "netFeeCollectedData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"netFeeCollectedData&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppAssetIdToFeeCollectedDataOrBuilder getNetFeeCollectedDataOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.collector.v1beta1.AppToAssetIdCollectorMapping appIdToAssetCollectorMapping = 2 [json_name = "appIdToAssetCollectorMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appIdToAssetCollectorMapping&#92;""];</code>
   */
  java.util.List<com.comdex.collector.v1beta1.AppToAssetIdCollectorMapping> 
      getAppIdToAssetCollectorMappingList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToAssetIdCollectorMapping appIdToAssetCollectorMapping = 2 [json_name = "appIdToAssetCollectorMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appIdToAssetCollectorMapping&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppToAssetIdCollectorMapping getAppIdToAssetCollectorMapping(int index);
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToAssetIdCollectorMapping appIdToAssetCollectorMapping = 2 [json_name = "appIdToAssetCollectorMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appIdToAssetCollectorMapping&#92;""];</code>
   */
  int getAppIdToAssetCollectorMappingCount();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToAssetIdCollectorMapping appIdToAssetCollectorMapping = 2 [json_name = "appIdToAssetCollectorMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appIdToAssetCollectorMapping&#92;""];</code>
   */
  java.util.List<? extends com.comdex.collector.v1beta1.AppToAssetIdCollectorMappingOrBuilder> 
      getAppIdToAssetCollectorMappingOrBuilderList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToAssetIdCollectorMapping appIdToAssetCollectorMapping = 2 [json_name = "appIdToAssetCollectorMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appIdToAssetCollectorMapping&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppToAssetIdCollectorMappingOrBuilder getAppIdToAssetCollectorMappingOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.collector.v1beta1.CollectorLookupTableData collectorLookup = 3 [json_name = "collectorLookup", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorLookupTable&#92;""];</code>
   */
  java.util.List<com.comdex.collector.v1beta1.CollectorLookupTableData> 
      getCollectorLookupList();
  /**
   * <code>repeated .comdex.collector.v1beta1.CollectorLookupTableData collectorLookup = 3 [json_name = "collectorLookup", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorLookupTable&#92;""];</code>
   */
  com.comdex.collector.v1beta1.CollectorLookupTableData getCollectorLookup(int index);
  /**
   * <code>repeated .comdex.collector.v1beta1.CollectorLookupTableData collectorLookup = 3 [json_name = "collectorLookup", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorLookupTable&#92;""];</code>
   */
  int getCollectorLookupCount();
  /**
   * <code>repeated .comdex.collector.v1beta1.CollectorLookupTableData collectorLookup = 3 [json_name = "collectorLookup", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorLookupTable&#92;""];</code>
   */
  java.util.List<? extends com.comdex.collector.v1beta1.CollectorLookupTableDataOrBuilder> 
      getCollectorLookupOrBuilderList();
  /**
   * <code>repeated .comdex.collector.v1beta1.CollectorLookupTableData collectorLookup = 3 [json_name = "collectorLookup", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorLookupTable&#92;""];</code>
   */
  com.comdex.collector.v1beta1.CollectorLookupTableDataOrBuilder getCollectorLookupOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable collectorAuctionLookupTable = 4 [json_name = "collectorAuctionLookupTable", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorAuctionLookupTable&#92;""];</code>
   */
  java.util.List<com.comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable> 
      getCollectorAuctionLookupTableList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable collectorAuctionLookupTable = 4 [json_name = "collectorAuctionLookupTable", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorAuctionLookupTable&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable getCollectorAuctionLookupTable(int index);
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable collectorAuctionLookupTable = 4 [json_name = "collectorAuctionLookupTable", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorAuctionLookupTable&#92;""];</code>
   */
  int getCollectorAuctionLookupTableCount();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable collectorAuctionLookupTable = 4 [json_name = "collectorAuctionLookupTable", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorAuctionLookupTable&#92;""];</code>
   */
  java.util.List<? extends com.comdex.collector.v1beta1.AppAssetIdToAuctionLookupTableOrBuilder> 
      getCollectorAuctionLookupTableOrBuilderList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppAssetIdToAuctionLookupTable collectorAuctionLookupTable = 4 [json_name = "collectorAuctionLookupTable", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"collectorAuctionLookupTable&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppAssetIdToAuctionLookupTableOrBuilder getCollectorAuctionLookupTableOrBuilder(
      int index);

  /**
   * <code>repeated .comdex.collector.v1beta1.AppToDenomsMapping appToDenomsMapping = 5 [json_name = "appToDenomsMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appToDenomsMapping&#92;""];</code>
   */
  java.util.List<com.comdex.collector.v1beta1.AppToDenomsMapping> 
      getAppToDenomsMappingList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToDenomsMapping appToDenomsMapping = 5 [json_name = "appToDenomsMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appToDenomsMapping&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppToDenomsMapping getAppToDenomsMapping(int index);
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToDenomsMapping appToDenomsMapping = 5 [json_name = "appToDenomsMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appToDenomsMapping&#92;""];</code>
   */
  int getAppToDenomsMappingCount();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToDenomsMapping appToDenomsMapping = 5 [json_name = "appToDenomsMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appToDenomsMapping&#92;""];</code>
   */
  java.util.List<? extends com.comdex.collector.v1beta1.AppToDenomsMappingOrBuilder> 
      getAppToDenomsMappingOrBuilderList();
  /**
   * <code>repeated .comdex.collector.v1beta1.AppToDenomsMapping appToDenomsMapping = 5 [json_name = "appToDenomsMapping", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"appToDenomsMapping&#92;""];</code>
   */
  com.comdex.collector.v1beta1.AppToDenomsMappingOrBuilder getAppToDenomsMappingOrBuilder(
      int index);

  /**
   * <code>.comdex.collector.v1beta1.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.comdex.collector.v1beta1.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.comdex.collector.v1beta1.Params getParams();
  /**
   * <code>.comdex.collector.v1beta1.Params params = 6 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.comdex.collector.v1beta1.ParamsOrBuilder getParamsOrBuilder();
}
