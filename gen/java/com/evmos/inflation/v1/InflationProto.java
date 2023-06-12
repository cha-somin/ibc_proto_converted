// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/inflation/v1/inflation.proto

package com.evmos.inflation.v1;

public final class InflationProto {
  private InflationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_inflation_v1_InflationDistribution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_inflation_v1_InflationDistribution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_inflation_v1_ExponentialCalculation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_inflation_v1_ExponentialCalculation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"evmos/inflation/v1/inflation.proto\022\022ev" +
      "mos.inflation.v1\032\024gogoproto/gogo.proto\"\242" +
      "\002\n\025InflationDistribution\022W\n\017staking_rewa" +
      "rds\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.DecR\016stakingRewards\022Y\n\020usa" +
      "ge_incentives\030\002 \001(\tB.\310\336\037\000\332\336\037&github.com/" +
      "cosmos/cosmos-sdk/types.DecR\017usageIncent" +
      "ives\022U\n\016community_pool\030\003 \001(\tB.\310\336\037\000\332\336\037&gi" +
      "thub.com/cosmos/cosmos-sdk/types.DecR\rco" +
      "mmunityPool\"\374\002\n\026ExponentialCalculation\022<" +
      "\n\001a\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.DecR\001a\022<\n\001r\030\002 \001(\tB.\310\336\037\000\332\336\037" +
      "&github.com/cosmos/cosmos-sdk/types.DecR" +
      "\001r\022<\n\001c\030\003 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos" +
      "/cosmos-sdk/types.DecR\001c\022U\n\016bonding_targ" +
      "et\030\004 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosm" +
      "os-sdk/types.DecR\rbondingTarget\022Q\n\014max_v" +
      "ariance\030\005 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos" +
      "/cosmos-sdk/types.DecR\013maxVarianceB\300\001\n\026c" +
      "om.evmos.inflation.v1B\016InflationProtoP\001Z" +
      ",github.com/evmos/evmos/v13/x/inflation/" +
      "types\242\002\003EIX\252\002\022Evmos.Inflation.V1\312\002\022Evmos" +
      "\\Inflation\\V1\342\002\036Evmos\\Inflation\\V1\\GPBMe" +
      "tadata\352\002\024Evmos::Inflation::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_evmos_inflation_v1_InflationDistribution_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_inflation_v1_InflationDistribution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_inflation_v1_InflationDistribution_descriptor,
        new java.lang.String[] { "StakingRewards", "UsageIncentives", "CommunityPool", });
    internal_static_evmos_inflation_v1_ExponentialCalculation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_inflation_v1_ExponentialCalculation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_inflation_v1_ExponentialCalculation_descriptor,
        new java.lang.String[] { "A", "R", "C", "BondingTarget", "MaxVariance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
