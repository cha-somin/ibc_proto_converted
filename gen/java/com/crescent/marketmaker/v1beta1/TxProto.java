// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/marketmaker/v1beta1/tx.proto

package com.crescent.marketmaker.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMaker_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMaker_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentives_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentives_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%crescent/marketmaker/v1beta1/tx.proto\022" +
      "\034crescent.marketmaker.v1beta1\032\024gogoproto" +
      "/gogo.proto\032\031cosmos_proto/cosmos.proto\032\036" +
      "cosmos/base/v1beta1/coin.proto\032\037google/p" +
      "rotobuf/timestamp.proto\"e\n\023MsgApplyMarke" +
      "tMaker\022\030\n\007address\030\001 \001(\tR\007address\022.\n\010pair" +
      "_ids\030\002 \003(\004B\023\362\336\037\017yaml:\"pair_ids\"R\007pairIds" +
      ":\004\210\240\037\000\"\035\n\033MsgApplyMarketMakerResponse\"4\n" +
      "\022MsgClaimIncentives\022\030\n\007address\030\001 \001(\tR\007ad" +
      "dress:\004\210\240\037\000\"\034\n\032MsgClaimIncentivesRespons" +
      "e2\207\002\n\003Msg\022\200\001\n\020ApplyMarketMaker\0221.crescen" +
      "t.marketmaker.v1beta1.MsgApplyMarketMake" +
      "r\0329.crescent.marketmaker.v1beta1.MsgAppl" +
      "yMarketMakerResponse\022}\n\017ClaimIncentives\022" +
      "0.crescent.marketmaker.v1beta1.MsgClaimI" +
      "ncentives\0328.crescent.marketmaker.v1beta1" +
      ".MsgClaimIncentivesResponseB\372\001\n com.cres" +
      "cent.marketmaker.v1beta1B\007TxProtoP\001Z;git" +
      "hub.com/crescent-network/crescent/v5/x/m" +
      "arketmaker/types\242\002\003CMX\252\002\034Crescent.Market" +
      "maker.V1beta1\312\002\034Crescent\\Marketmaker\\V1b" +
      "eta1\342\002(Crescent\\Marketmaker\\V1beta1\\GPBM" +
      "etadata\352\002\036Crescent::Marketmaker::V1beta1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMaker_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMaker_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMaker_descriptor,
        new java.lang.String[] { "Address", "PairIds", });
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_marketmaker_v1beta1_MsgApplyMarketMakerResponse_descriptor,
        new java.lang.String[] { });
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentives_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentives_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentives_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_marketmaker_v1beta1_MsgClaimIncentivesResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
