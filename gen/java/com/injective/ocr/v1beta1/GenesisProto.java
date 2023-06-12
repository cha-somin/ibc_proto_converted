// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/ocr/v1beta1/genesis.proto

package com.injective.ocr.v1beta1;

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
    internal_static_injective_ocr_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_FeedTransmission_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_FeedTransmission_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_FeedEpochAndRound_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_FeedEpochAndRound_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_FeedLatestAggregatorRoundIDs_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_FeedLatestAggregatorRoundIDs_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_RewardPool_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_RewardPool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_FeedCounts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_FeedCounts_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_Count_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_Count_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_ocr_v1beta1_PendingPayeeship_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_ocr_v1beta1_PendingPayeeship_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#injective/ocr/v1beta1/genesis.proto\022\025i" +
      "njective.ocr.v1beta1\032\037injective/ocr/v1be" +
      "ta1/ocr.proto\032\024gogoproto/gogo.proto\032\036cos" +
      "mos/base/v1beta1/coin.proto\"\224\006\n\014GenesisS" +
      "tate\022;\n\006params\030\001 \001(\0132\035.injective.ocr.v1b" +
      "eta1.ParamsB\004\310\336\037\000R\006params\022D\n\014feed_config" +
      "s\030\002 \003(\0132!.injective.ocr.v1beta1.FeedConf" +
      "igR\013feedConfigs\022_\n\027latest_epoch_and_roun" +
      "ds\030\003 \003(\0132(.injective.ocr.v1beta1.FeedEpo" +
      "chAndRoundR\024latestEpochAndRounds\022V\n\022feed" +
      "_transmissions\030\004 \003(\0132\'.injective.ocr.v1b" +
      "eta1.FeedTransmissionR\021feedTransmissions" +
      "\022r\n\033latest_aggregator_round_ids\030\005 \003(\01323." +
      "injective.ocr.v1beta1.FeedLatestAggregat" +
      "orRoundIDsR\030latestAggregatorRoundIds\022D\n\014" +
      "reward_pools\030\006 \003(\0132!.injective.ocr.v1bet" +
      "a1.RewardPoolR\013rewardPools\022Y\n\027feed_obser" +
      "vation_counts\030\007 \003(\0132!.injective.ocr.v1be" +
      "ta1.FeedCountsR\025feedObservationCounts\022[\n" +
      "\030feed_transmission_counts\030\010 \003(\0132!.inject" +
      "ive.ocr.v1beta1.FeedCountsR\026feedTransmis" +
      "sionCounts\022V\n\022pending_payeeships\030\t \003(\0132\'" +
      ".injective.ocr.v1beta1.PendingPayeeshipR" +
      "\021pendingPayeeships\"t\n\020FeedTransmission\022\027" +
      "\n\007feed_id\030\001 \001(\tR\006feedId\022G\n\014transmission\030" +
      "\002 \001(\0132#.injective.ocr.v1beta1.Transmissi" +
      "onR\014transmission\"z\n\021FeedEpochAndRound\022\027\n" +
      "\007feed_id\030\001 \001(\tR\006feedId\022L\n\017epoch_and_roun" +
      "d\030\002 \001(\0132$.injective.ocr.v1beta1.EpochAnd" +
      "RoundR\repochAndRound\"g\n\034FeedLatestAggreg" +
      "atorRoundIDs\022\027\n\007feed_id\030\001 \001(\tR\006feedId\022.\n" +
      "\023aggregator_round_id\030\002 \001(\004R\021aggregatorRo" +
      "undId\"^\n\nRewardPool\022\027\n\007feed_id\030\001 \001(\tR\006fe" +
      "edId\0227\n\006amount\030\002 \001(\0132\031.cosmos.base.v1bet" +
      "a1.CoinB\004\310\336\037\000R\006amount\"[\n\nFeedCounts\022\027\n\007f" +
      "eed_id\030\001 \001(\tR\006feedId\0224\n\006counts\030\002 \003(\0132\034.i" +
      "njective.ocr.v1beta1.CountR\006counts\"7\n\005Co" +
      "unt\022\030\n\007address\030\001 \001(\tR\007address\022\024\n\005count\030\002" +
      " \001(\004R\005count\"t\n\020PendingPayeeship\022\027\n\007feed_" +
      "id\030\001 \001(\tR\006feedId\022 \n\013transmitter\030\002 \001(\tR\013t" +
      "ransmitter\022%\n\016proposed_payee\030\003 \001(\tR\rprop" +
      "osedPayeeB\352\001\n\031com.injective.ocr.v1beta1B" +
      "\014GenesisProtoP\001ZIgithub.com/InjectiveLab" +
      "s/injective-core/injective-chain/modules" +
      "/ocr/types\242\002\003IOX\252\002\025Injective.Ocr.V1beta1" +
      "\312\002\025Injective\\Ocr\\V1beta1\342\002!Injective\\Ocr" +
      "\\V1beta1\\GPBMetadata\352\002\027Injective::Ocr::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.injective.ocr.v1beta1.OcrProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_injective_ocr_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_ocr_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "FeedConfigs", "LatestEpochAndRounds", "FeedTransmissions", "LatestAggregatorRoundIds", "RewardPools", "FeedObservationCounts", "FeedTransmissionCounts", "PendingPayeeships", });
    internal_static_injective_ocr_v1beta1_FeedTransmission_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_ocr_v1beta1_FeedTransmission_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_FeedTransmission_descriptor,
        new java.lang.String[] { "FeedId", "Transmission", });
    internal_static_injective_ocr_v1beta1_FeedEpochAndRound_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_injective_ocr_v1beta1_FeedEpochAndRound_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_FeedEpochAndRound_descriptor,
        new java.lang.String[] { "FeedId", "EpochAndRound", });
    internal_static_injective_ocr_v1beta1_FeedLatestAggregatorRoundIDs_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_injective_ocr_v1beta1_FeedLatestAggregatorRoundIDs_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_FeedLatestAggregatorRoundIDs_descriptor,
        new java.lang.String[] { "FeedId", "AggregatorRoundId", });
    internal_static_injective_ocr_v1beta1_RewardPool_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_injective_ocr_v1beta1_RewardPool_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_RewardPool_descriptor,
        new java.lang.String[] { "FeedId", "Amount", });
    internal_static_injective_ocr_v1beta1_FeedCounts_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_injective_ocr_v1beta1_FeedCounts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_FeedCounts_descriptor,
        new java.lang.String[] { "FeedId", "Counts", });
    internal_static_injective_ocr_v1beta1_Count_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_injective_ocr_v1beta1_Count_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_Count_descriptor,
        new java.lang.String[] { "Address", "Count", });
    internal_static_injective_ocr_v1beta1_PendingPayeeship_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_injective_ocr_v1beta1_PendingPayeeship_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_ocr_v1beta1_PendingPayeeship_descriptor,
        new java.lang.String[] { "FeedId", "Transmitter", "ProposedPayee", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.injective.ocr.v1beta1.OcrProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
