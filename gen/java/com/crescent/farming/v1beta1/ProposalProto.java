// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: crescent/farming/v1beta1/proposal.proto

package com.crescent.farming.v1beta1;

public final class ProposalProto {
  private ProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_farming_v1beta1_PublicPlanProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_farming_v1beta1_PublicPlanProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_farming_v1beta1_AddPlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_farming_v1beta1_AddPlanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_farming_v1beta1_ModifyPlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_farming_v1beta1_ModifyPlanRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_crescent_farming_v1beta1_DeletePlanRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_crescent_farming_v1beta1_DeletePlanRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'crescent/farming/v1beta1/proposal.prot" +
      "o\022\030crescent.farming.v1beta1\032\024gogoproto/g" +
      "ogo.proto\032\031cosmos_proto/cosmos.proto\032\036co" +
      "smos/base/v1beta1/coin.proto\032&crescent/f" +
      "arming/v1beta1/farming.proto\032\037google/pro" +
      "tobuf/timestamp.proto\"\330\003\n\022PublicPlanProp" +
      "osal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descriptio" +
      "n\030\002 \001(\tR\013description\022v\n\021add_plan_request" +
      "s\030\003 \003(\0132(.crescent.farming.v1beta1.AddPl" +
      "anRequestB \310\336\037\000\362\336\037\030yaml:\"add_plan_reques" +
      "ts\"R\017addPlanRequests\022\202\001\n\024modify_plan_req" +
      "uests\030\004 \003(\0132+.crescent.farming.v1beta1.M" +
      "odifyPlanRequestB#\310\336\037\000\362\336\037\033yaml:\"modify_p" +
      "lan_requests\"R\022modifyPlanRequests\022\202\001\n\024de" +
      "lete_plan_requests\030\005 \003(\0132+.crescent.farm" +
      "ing.v1beta1.DeletePlanRequestB#\310\336\037\000\362\336\037\033y" +
      "aml:\"delete_plan_requests\"R\022deletePlanRe" +
      "quests:\010\210\240\037\000\230\240\037\000\"\212\006\n\016AddPlanRequest\022\022\n\004n" +
      "ame\030\001 \001(\tR\004name\022Q\n\024farming_pool_address\030" +
      "\002 \001(\tB\037\362\336\037\033yaml:\"farming_pool_address\"R\022" +
      "farmingPoolAddress\022O\n\023termination_addres" +
      "s\030\003 \001(\tB\036\362\336\037\032yaml:\"termination_address\"R" +
      "\022terminationAddress\022\242\001\n\024staking_coin_wei" +
      "ghts\030\004 \003(\0132\034.cosmos.base.v1beta1.DecCoin" +
      "BR\310\336\037\000\362\336\037\033yaml:\"staking_coin_weights\"\252\337\037" +
      "+github.com/cosmos/cosmos-sdk/types.DecC" +
      "oinsR\022stakingCoinWeights\022X\n\nstart_time\030\005" +
      " \001(\0132\032.google.protobuf.TimestampB\035\310\336\037\000\362\336" +
      "\037\021yaml:\"start_time\"\220\337\037\001R\tstartTime\022R\n\010en" +
      "d_time\030\006 \001(\0132\032.google.protobuf.Timestamp" +
      "B\033\310\336\037\000\362\336\037\017yaml:\"end_time\"\220\337\037\001R\007endTime\022\205" +
      "\001\n\014epoch_amount\030\007 \003(\0132\031.cosmos.base.v1be" +
      "ta1.CoinBG\310\336\037\000\362\336\037\023yaml:\"epoch_amount\"\252\337\037" +
      "(github.com/cosmos/cosmos-sdk/types.Coin" +
      "sR\013epochAmount\022e\n\013epoch_ratio\030\010 \001(\tBD\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "Dec\362\336\037\022yaml:\"epoch_ratio\"R\nepochRatio\"\246\006" +
      "\n\021ModifyPlanRequest\022\027\n\007plan_id\030\001 \001(\004R\006pl" +
      "anId\022\022\n\004name\030\002 \001(\tR\004name\022Q\n\024farming_pool" +
      "_address\030\003 \001(\tB\037\362\336\037\033yaml:\"farming_pool_a" +
      "ddress\"R\022farmingPoolAddress\022O\n\023terminati" +
      "on_address\030\004 \001(\tB\036\362\336\037\032yaml:\"termination_" +
      "address\"R\022terminationAddress\022\242\001\n\024staking" +
      "_coin_weights\030\005 \003(\0132\034.cosmos.base.v1beta" +
      "1.DecCoinBR\310\336\037\000\362\336\037\033yaml:\"staking_coin_we" +
      "ights\"\252\337\037+github.com/cosmos/cosmos-sdk/t" +
      "ypes.DecCoinsR\022stakingCoinWeights\022X\n\nsta" +
      "rt_time\030\006 \001(\0132\032.google.protobuf.Timestam" +
      "pB\035\310\336\037\001\362\336\037\021yaml:\"start_time\"\220\337\037\001R\tstartT" +
      "ime\022R\n\010end_time\030\007 \001(\0132\032.google.protobuf." +
      "TimestampB\033\310\336\037\001\362\336\037\017yaml:\"end_time\"\220\337\037\001R\007" +
      "endTime\022\205\001\n\014epoch_amount\030\010 \003(\0132\031.cosmos." +
      "base.v1beta1.CoinBG\310\336\037\000\362\336\037\023yaml:\"epoch_a" +
      "mount\"\252\337\037(github.com/cosmos/cosmos-sdk/t" +
      "ypes.CoinsR\013epochAmount\022e\n\013epoch_ratio\030\t" +
      " \001(\tBD\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.Dec\362\336\037\022yaml:\"epoch_ratio\"R\nepoc" +
      "hRatio\",\n\021DeletePlanRequest\022\027\n\007plan_id\030\001" +
      " \001(\004R\006planIdB\350\001\n\034com.crescent.farming.v1" +
      "beta1B\rProposalProtoP\001Z7github.com/cresc" +
      "ent-network/crescent/v5/x/farming/types\242" +
      "\002\003CFX\252\002\030Crescent.Farming.V1beta1\312\002\030Cresc" +
      "ent\\Farming\\V1beta1\342\002$Crescent\\Farming\\V" +
      "1beta1\\GPBMetadata\352\002\032Crescent::Farming::" +
      "V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.crescent.farming.v1beta1.FarmingProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_crescent_farming_v1beta1_PublicPlanProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_crescent_farming_v1beta1_PublicPlanProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_farming_v1beta1_PublicPlanProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "AddPlanRequests", "ModifyPlanRequests", "DeletePlanRequests", });
    internal_static_crescent_farming_v1beta1_AddPlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_crescent_farming_v1beta1_AddPlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_farming_v1beta1_AddPlanRequest_descriptor,
        new java.lang.String[] { "Name", "FarmingPoolAddress", "TerminationAddress", "StakingCoinWeights", "StartTime", "EndTime", "EpochAmount", "EpochRatio", });
    internal_static_crescent_farming_v1beta1_ModifyPlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_crescent_farming_v1beta1_ModifyPlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_farming_v1beta1_ModifyPlanRequest_descriptor,
        new java.lang.String[] { "PlanId", "Name", "FarmingPoolAddress", "TerminationAddress", "StakingCoinWeights", "StartTime", "EndTime", "EpochAmount", "EpochRatio", });
    internal_static_crescent_farming_v1beta1_DeletePlanRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_crescent_farming_v1beta1_DeletePlanRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_crescent_farming_v1beta1_DeletePlanRequest_descriptor,
        new java.lang.String[] { "PlanId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.crescent.farming.v1beta1.FarmingProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
