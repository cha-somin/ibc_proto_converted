// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/tariff/params.proto

package com.noble.tariff;

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
    internal_static_noble_tariff_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_tariff_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_noble_tariff_DistributionEntity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_tariff_DistributionEntity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031noble/tariff/params.proto\022\014noble.tarif" +
      "f\032\024gogoproto/gogo.proto\032\036cosmos/base/v1b" +
      "eta1/coin.proto\"\230\004\n\006Params\022T\n\005share\030\001 \001(" +
      "\tB>\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.Dec\362\336\037\014yaml:\"share\"R\005share\022{\n\025dist" +
      "ribution_entities\030\002 \003(\0132 .noble.tariff.D" +
      "istributionEntityB$\310\336\037\000\362\336\037\034yaml:\"distrib" +
      "ution_entities\"R\024distributionEntities\022s\n" +
      "\020transfer_fee_bps\030\003 \001(\tBI\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:" +
      "\"transfer_fee_bps\"R\016transferFeeBps\022s\n\020tr" +
      "ansfer_fee_max\030\004 \001(\tBI\310\336\037\000\332\336\037&github.com" +
      "/cosmos/cosmos-sdk/types.Int\362\336\037\027yaml:\"tr" +
      "ansfer_fee_max\"R\016transferFeeMax\022K\n\022trans" +
      "fer_fee_denom\030\005 \001(\tB\035\362\336\037\031yaml:\"transfer_" +
      "fee_denom\"R\020transferFeeDenom:\004\230\240\037\000\"\204\001\n\022D" +
      "istributionEntity\022\030\n\007address\030\001 \001(\tR\007addr" +
      "ess\022T\n\005share\030\002 \001(\tB>\310\336\037\000\332\336\037&github.com/c" +
      "osmos/cosmos-sdk/types.Dec\362\336\037\014yaml:\"shar" +
      "e\"R\005shareB\252\001\n\020com.noble.tariffB\013ParamsPr" +
      "otoP\001Z4github.com/strangelove-ventures/n" +
      "oble/x/tariff/types\242\002\003NTX\252\002\014Noble.Tariff" +
      "\312\002\014Noble\\Tariff\342\002\030Noble\\Tariff\\GPBMetada" +
      "ta\352\002\rNoble::Tariff\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_noble_tariff_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_noble_tariff_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_tariff_Params_descriptor,
        new java.lang.String[] { "Share", "DistributionEntities", "TransferFeeBps", "TransferFeeMax", "TransferFeeDenom", });
    internal_static_noble_tariff_DistributionEntity_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_noble_tariff_DistributionEntity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_tariff_DistributionEntity_descriptor,
        new java.lang.String[] { "Address", "Share", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
