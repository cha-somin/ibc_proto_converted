// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/concentrated-liquidity/gov.proto

package com.osmosis.concentratedliquidity.v1beta1;

public final class GovProto {
  private GovProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_v1beta1_CreateConcentratedLiquidityPoolsProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_v1beta1_CreateConcentratedLiquidityPoolsProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_v1beta1_TickSpacingDecreaseProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_v1beta1_TickSpacingDecreaseProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolIdToTickSpacingRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_v1beta1_PoolIdToTickSpacingRecord_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(osmosis/concentrated-liquidity/gov.pro" +
      "to\022%osmosis.concentratedliquidity.v1beta" +
      "1\032\024gogoproto/gogo.proto\"\343\001\n(CreateConcen" +
      "tratedLiquidityPoolsProposal\022\024\n\005title\030\001 " +
      "\001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descrip" +
      "tion\022q\n\014pool_records\030\003 \003(\01321.osmosis.con" +
      "centratedliquidity.v1beta1.PoolRecordB\033\310" +
      "\336\037\000\362\336\037\023yaml:\"pool_records\"R\013poolRecords:" +
      "\014\210\240\037\000\230\240\037\000\350\240\037\001\"\361\001\n\033TickSpacingDecreasePro" +
      "posal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descripti" +
      "on\030\002 \001(\tR\013description\022\213\001\n\037pool_id_to_tic" +
      "k_spacing_records\030\003 \003(\0132@.osmosis.concen" +
      "tratedliquidity.v1beta1.PoolIdToTickSpac" +
      "ingRecordB\004\310\336\037\000R\032poolIdToTickSpacingReco" +
      "rds:\014\210\240\037\000\230\240\037\000\350\240\037\001\"d\n\031PoolIdToTickSpacing" +
      "Record\022\027\n\007pool_id\030\001 \001(\004R\006poolId\022(\n\020new_t" +
      "ick_spacing\030\002 \001(\004R\016newTickSpacing:\004\350\240\037\001\"" +
      "\225\003\n\nPoolRecord\022)\n\006denom0\030\001 \001(\tB\021\362\336\037\ryaml" +
      ":\"denom0\"R\006denom0\022)\n\006denom1\030\002 \001(\tB\021\362\336\037\ry" +
      "aml:\"denom1\"R\006denom1\022:\n\014tick_spacing\030\003 \001" +
      "(\004B\027\362\336\037\023yaml:\"tick_spacing\"R\013tickSpacing" +
      "\022\201\001\n\025exponent_at_price_one\030\004 \001(\tBN\310\336\037\000\332\336" +
      "\037&github.com/cosmos/cosmos-sdk/types.Int" +
      "\362\336\037\034yaml:\"exponent_at_price_one\"R\022expone" +
      "ntAtPriceOne\022k\n\rspread_factor\030\005 \001(\tBF\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "Dec\362\336\037\024yaml:\"spread_factor\"R\014spreadFacto" +
      "r:\004\350\240\037\001B\257\002\n)com.osmosis.concentratedliqu" +
      "idity.v1beta1B\010GovProtoP\001ZBgithub.com/os" +
      "mosis-labs/osmosis/v15/x/concentrated-li" +
      "quidity/types\242\002\003OCX\252\002%Osmosis.Concentrat" +
      "edliquidity.V1beta1\312\002%Osmosis\\Concentrat" +
      "edliquidity\\V1beta1\342\0021Osmosis\\Concentrat" +
      "edliquidity\\V1beta1\\GPBMetadata\352\002\'Osmosi" +
      "s::Concentratedliquidity::V1beta1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_osmosis_concentratedliquidity_v1beta1_CreateConcentratedLiquidityPoolsProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_concentratedliquidity_v1beta1_CreateConcentratedLiquidityPoolsProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_v1beta1_CreateConcentratedLiquidityPoolsProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "PoolRecords", });
    internal_static_osmosis_concentratedliquidity_v1beta1_TickSpacingDecreaseProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_osmosis_concentratedliquidity_v1beta1_TickSpacingDecreaseProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_v1beta1_TickSpacingDecreaseProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "PoolIdToTickSpacingRecords", });
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolIdToTickSpacingRecord_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolIdToTickSpacingRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_v1beta1_PoolIdToTickSpacingRecord_descriptor,
        new java.lang.String[] { "PoolId", "NewTickSpacing", });
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_concentratedliquidity_v1beta1_PoolRecord_descriptor,
        new java.lang.String[] { "Denom0", "Denom1", "TickSpacing", "ExponentAtPriceOne", "SpreadFactor", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
