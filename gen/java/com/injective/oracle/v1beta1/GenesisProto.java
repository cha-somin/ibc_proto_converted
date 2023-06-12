// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/genesis.proto

package com.injective.oracle.v1beta1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_CalldataRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&injective/oracle/v1beta1/genesis.proto" +
      "\022\030injective.oracle.v1beta1\032%injective/or" +
      "acle/v1beta1/oracle.proto\032\024gogoproto/gog" +
      "o.proto\"\340\t\n\014GenesisState\022>\n\006params\030\001 \001(\013" +
      "2 .injective.oracle.v1beta1.ParamsB\004\310\336\037\000" +
      "R\006params\022#\n\rband_relayers\030\002 \003(\tR\014bandRel" +
      "ayers\022T\n\021band_price_states\030\003 \003(\0132(.injec" +
      "tive.oracle.v1beta1.BandPriceStateR\017band" +
      "PriceStates\022_\n\027price_feed_price_states\030\004" +
      " \003(\0132(.injective.oracle.v1beta1.PriceFee" +
      "dStateR\024priceFeedPriceStates\022`\n\025coinbase" +
      "_price_states\030\005 \003(\0132,.injective.oracle.v" +
      "1beta1.CoinbasePriceStateR\023coinbasePrice" +
      "States\022[\n\025band_ibc_price_states\030\006 \003(\0132(." +
      "injective.oracle.v1beta1.BandPriceStateR" +
      "\022bandIbcPriceStates\022d\n\030band_ibc_oracle_r" +
      "equests\030\007 \003(\0132+.injective.oracle.v1beta1" +
      ".BandOracleRequestR\025bandIbcOracleRequest" +
      "s\022U\n\017band_ibc_params\030\010 \001(\0132\'.injective.o" +
      "racle.v1beta1.BandIBCParamsB\004\310\336\037\000R\rbandI" +
      "bcParams\0228\n\031band_ibc_latest_client_id\030\t " +
      "\001(\004R\025bandIbcLatestClientId\022S\n\020calldata_r" +
      "ecords\030\n \003(\0132(.injective.oracle.v1beta1." +
      "CalldataRecordR\017calldataRecords\022:\n\032band_" +
      "ibc_latest_request_id\030\013 \001(\004R\026bandIbcLate" +
      "stRequestId\022c\n\026chainlink_price_states\030\014 " +
      "\003(\0132-.injective.oracle.v1beta1.Chainlink" +
      "PriceStateR\024chainlinkPriceStates\022`\n\030hist" +
      "orical_price_records\030\r \003(\0132&.injective.o" +
      "racle.v1beta1.PriceRecordsR\026historicalPr" +
      "iceRecords\022P\n\017provider_states\030\016 \003(\0132\'.in" +
      "jective.oracle.v1beta1.ProviderStateR\016pr" +
      "oviderStates\022T\n\021pyth_price_states\030\017 \003(\0132" +
      "(.injective.oracle.v1beta1.PythPriceStat" +
      "eR\017pythPriceStates\"I\n\016CalldataRecord\022\033\n\t" +
      "client_id\030\001 \001(\004R\010clientId\022\032\n\010calldata\030\002 " +
      "\001(\014R\010calldataB\374\001\n\034com.injective.oracle.v" +
      "1beta1B\014GenesisProtoP\001ZLgithub.com/Injec" +
      "tiveLabs/injective-core/injective-chain/" +
      "modules/oracle/types\242\002\003IOX\252\002\030Injective.O" +
      "racle.V1beta1\312\002\030Injective\\Oracle\\V1beta1" +
      "\342\002$Injective\\Oracle\\V1beta1\\GPBMetadata\352" +
      "\002\032Injective::Oracle::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.injective.oracle.v1beta1.OracleProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_injective_oracle_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_oracle_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "BandRelayers", "BandPriceStates", "PriceFeedPriceStates", "CoinbasePriceStates", "BandIbcPriceStates", "BandIbcOracleRequests", "BandIbcParams", "BandIbcLatestClientId", "CalldataRecords", "BandIbcLatestRequestId", "ChainlinkPriceStates", "HistoricalPriceRecords", "ProviderStates", "PythPriceStates", });
    internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_oracle_v1beta1_CalldataRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_CalldataRecord_descriptor,
        new java.lang.String[] { "ClientId", "Calldata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.injective.oracle.v1beta1.OracleProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
