// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/lpfarm/v1beta1/tx.proto

package com.crescent.lpfarm.v1beta1;

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
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgFarm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgFarm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgFarmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgFarmResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarm_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgUnfarm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarmResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgUnfarmResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgHarvest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgHarvest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_lpfarm_v1beta1_MsgHarvestResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_lpfarm_v1beta1_MsgHarvestResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n crescent/lpfarm/v1beta1/tx.proto\022\027cres" +
      "cent.lpfarm.v1beta1\032\024gogoproto/gogo.prot" +
      "o\032\036cosmos/base/v1beta1/coin.proto\032\037googl" +
      "e/protobuf/timestamp.proto\032$crescent/lpf" +
      "arm/v1beta1/lpfarm.proto\"\270\002\n\024MsgCreatePr" +
      "ivatePlan\022\030\n\007creator\030\001 \001(\tR\007creator\022 \n\013d" +
      "escription\030\002 \001(\tR\013description\022^\n\022reward_" +
      "allocations\030\003 \003(\0132).crescent.lpfarm.v1be" +
      "ta1.RewardAllocationB\004\310\336\037\000R\021rewardAlloca" +
      "tions\022C\n\nstart_time\030\004 \001(\0132\032.google.proto" +
      "buf.TimestampB\010\310\336\037\000\220\337\037\001R\tstartTime\022?\n\010en" +
      "d_time\030\005 \001(\0132\032.google.protobuf.Timestamp" +
      "B\010\310\336\037\000\220\337\037\001R\007endTime\"i\n\034MsgCreatePrivateP" +
      "lanResponse\022\027\n\007plan_id\030\001 \001(\004R\006planId\0220\n\024" +
      "farming_pool_address\030\002 \001(\tR\022farmingPoolA" +
      "ddress\"V\n\007MsgFarm\022\026\n\006farmer\030\001 \001(\tR\006farme" +
      "r\0223\n\004coin\030\002 \001(\0132\031.cosmos.base.v1beta1.Co" +
      "inB\004\310\336\037\000R\004coin\"\213\001\n\017MsgFarmResponse\022x\n\021wi" +
      "thdrawn_rewards\030\001 \003(\0132\031.cosmos.base.v1be" +
      "ta1.CoinB0\310\336\037\000\252\337\037(github.com/cosmos/cosm" +
      "os-sdk/types.CoinsR\020withdrawnRewards\"X\n\t" +
      "MsgUnfarm\022\026\n\006farmer\030\001 \001(\tR\006farmer\0223\n\004coi" +
      "n\030\002 \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000" +
      "R\004coin\"\215\001\n\021MsgUnfarmResponse\022x\n\021withdraw" +
      "n_rewards\030\001 \003(\0132\031.cosmos.base.v1beta1.Co" +
      "inB0\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk" +
      "/types.CoinsR\020withdrawnRewards\":\n\nMsgHar" +
      "vest\022\026\n\006farmer\030\001 \001(\tR\006farmer\022\024\n\005denom\030\002 " +
      "\001(\tR\005denom\"\216\001\n\022MsgHarvestResponse\022x\n\021wit" +
      "hdrawn_rewards\030\001 \003(\0132\031.cosmos.base.v1bet" +
      "a1.CoinB0\310\336\037\000\252\337\037(github.com/cosmos/cosmo" +
      "s-sdk/types.CoinsR\020withdrawnRewards2\213\003\n\003" +
      "Msg\022y\n\021CreatePrivatePlan\022-.crescent.lpfa" +
      "rm.v1beta1.MsgCreatePrivatePlan\0325.cresce" +
      "nt.lpfarm.v1beta1.MsgCreatePrivatePlanRe" +
      "sponse\022R\n\004Farm\022 .crescent.lpfarm.v1beta1" +
      ".MsgFarm\032(.crescent.lpfarm.v1beta1.MsgFa" +
      "rmResponse\022X\n\006Unfarm\022\".crescent.lpfarm.v" +
      "1beta1.MsgUnfarm\032*.crescent.lpfarm.v1bet" +
      "a1.MsgUnfarmResponse\022[\n\007Harvest\022#.cresce" +
      "nt.lpfarm.v1beta1.MsgHarvest\032+.crescent." +
      "lpfarm.v1beta1.MsgHarvestResponseB\340\001\n\033co" +
      "m.crescent.lpfarm.v1beta1B\007TxProtoP\001Z6gi" +
      "thub.com/crescent-network/crescent/v5/x/" +
      "lpfarm/types\242\002\003CLX\252\002\027Crescent.Lpfarm.V1b" +
      "eta1\312\002\027Crescent\\Lpfarm\\V1beta1\342\002#Crescen" +
      "t\\Lpfarm\\V1beta1\\GPBMetadata\352\002\031Crescent:" +
      ":Lpfarm::V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.crescent.lpfarm.v1beta1.LpfarmProto.getDescriptor(),
        });
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlan_descriptor,
        new java.lang.String[] { "Creator", "Description", "RewardAllocations", "StartTime", "EndTime", });
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgCreatePrivatePlanResponse_descriptor,
        new java.lang.String[] { "PlanId", "FarmingPoolAddress", });
    internal_static_crescent_lpfarm_v1beta1_MsgFarm_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_crescent_lpfarm_v1beta1_MsgFarm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgFarm_descriptor,
        new java.lang.String[] { "Farmer", "Coin", });
    internal_static_crescent_lpfarm_v1beta1_MsgFarmResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_crescent_lpfarm_v1beta1_MsgFarmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgFarmResponse_descriptor,
        new java.lang.String[] { "WithdrawnRewards", });
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarm_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarm_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgUnfarm_descriptor,
        new java.lang.String[] { "Farmer", "Coin", });
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarmResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_crescent_lpfarm_v1beta1_MsgUnfarmResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgUnfarmResponse_descriptor,
        new java.lang.String[] { "WithdrawnRewards", });
    internal_static_crescent_lpfarm_v1beta1_MsgHarvest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_crescent_lpfarm_v1beta1_MsgHarvest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgHarvest_descriptor,
        new java.lang.String[] { "Farmer", "Denom", });
    internal_static_crescent_lpfarm_v1beta1_MsgHarvestResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_crescent_lpfarm_v1beta1_MsgHarvestResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_lpfarm_v1beta1_MsgHarvestResponse_descriptor,
        new java.lang.String[] { "WithdrawnRewards", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.crescent.lpfarm.v1beta1.LpfarmProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
