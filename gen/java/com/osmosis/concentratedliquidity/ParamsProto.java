// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/params.proto

package com.osmosis.concentratedliquidity;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+osmosis/concentrated-liquidity/params." +
      "proto\022\035osmosis.concentratedliquidity\032\024go" +
      "goproto/gogo.proto\032\031cosmos_proto/cosmos." +
      "proto\032\036google/protobuf/duration.proto\"\206\006" +
      "\n\006Params\022Z\n\027authorized_tick_spacing\030\001 \003(" +
      "\004B\"\362\336\037\036yaml:\"authorized_tick_spacing\"R\025a" +
      "uthorizedTickSpacing\022\216\001\n\031authorized_spre" +
      "ad_factors\030\002 \003(\tBR\310\336\037\000\332\336\037&github.com/cos" +
      "mos/cosmos-sdk/types.Dec\362\336\037 yaml:\"author" +
      "ized_spread_factors\"R\027authorizedSpreadFa" +
      "ctors\022\237\001\n\037balancer_shares_reward_discoun" +
      "t\030\003 \001(\tBX\310\336\037\000\332\336\037&github.com/cosmos/cosmo" +
      "s-sdk/types.Dec\362\336\037&yaml:\"balancer_shares" +
      "_reward_discount\"R\034balancerSharesRewardD" +
      "iscount\022Z\n\027authorized_quote_denoms\030\004 \003(\t" +
      "B\"\362\336\037\036yaml:\"authorized_quote_denoms\"R\025au" +
      "thorizedQuoteDenoms\022\205\001\n\022authorized_uptim" +
      "es\030\005 \003(\0132\031.google.protobuf.DurationB;\310\336\037" +
      "\000\352\336\037\022duration,omitempty\362\336\037\031yaml:\"authori" +
      "zed_uptimes\"\230\337\037\001R\021authorizedUptimes\022\210\001\n\'" +
      "is_permissionless_pool_creation_enabled\030" +
      "\006 \001(\010B2\362\336\037.yaml:\"is_permissionless_pool_" +
      "creation_enabled\"R#isPermissionlessPoolC" +
      "reationEnabledB\211\002\n!com.osmosis.concentra" +
      "tedliquidityB\013ParamsProtoP\001ZBgithub.com/" +
      "osmosis-labs/osmosis/v15/x/concentrated-" +
      "liquidity/types\242\002\003OCX\252\002\035Osmosis.Concentr" +
      "atedliquidity\312\002\035Osmosis\\Concentratedliqu" +
      "idity\342\002)Osmosis\\Concentratedliquidity\\GP" +
      "BMetadata\352\002\036Osmosis::Concentratedliquidi" +
      "tyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_osmosis_concentratedliquidity_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_concentratedliquidity_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_Params_descriptor,
        new java.lang.String[] { "AuthorizedTickSpacing", "AuthorizedSpreadFactors", "BalancerSharesRewardDiscount", "AuthorizedQuoteDenoms", "AuthorizedUptimes", "IsPermissionlessPoolCreationEnabled", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
