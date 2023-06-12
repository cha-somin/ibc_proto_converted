// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/inflation/v1/genesis.proto

package com.canto.inflation.v1;

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
    internal_static_canto_inflation_v1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_inflation_v1_GenesisState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_inflation_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_inflation_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n canto/inflation/v1/genesis.proto\022\022cant" +
      "o.inflation.v1\032\024gogoproto/gogo.proto\032\"ca" +
      "nto/inflation/v1/inflation.proto\"\336\001\n\014Gen" +
      "esisState\0228\n\006params\030\001 \001(\0132\032.canto.inflat" +
      "ion.v1.ParamsB\004\310\336\037\000R\006params\022\026\n\006period\030\002 " +
      "\001(\004R\006period\022)\n\020epoch_identifier\030\003 \001(\tR\017e" +
      "pochIdentifier\022*\n\021epochs_per_period\030\004 \001(" +
      "\003R\017epochsPerPeriod\022%\n\016skipped_epochs\030\005 \001" +
      "(\004R\rskippedEpochs\"\245\002\n\006Params\022\035\n\nmint_den" +
      "om\030\001 \001(\tR\tmintDenom\022i\n\027exponential_calcu" +
      "lation\030\002 \001(\0132*.canto.inflation.v1.Expone" +
      "ntialCalculationB\004\310\336\037\000R\026exponentialCalcu" +
      "lation\022f\n\026inflation_distribution\030\003 \001(\0132)" +
      ".canto.inflation.v1.InflationDistributio" +
      "nB\004\310\336\037\000R\025inflationDistribution\022)\n\020enable" +
      "_inflation\030\004 \001(\010R\017enableInflationB\305\001\n\026co" +
      "m.canto.inflation.v1B\014GenesisProtoP\001Z3gi" +
      "thub.com/Canto-Network/Canto/v6/x/inflat" +
      "ion/types\242\002\003CIX\252\002\022Canto.Inflation.V1\312\002\022C" +
      "anto\\Inflation\\V1\342\002\036Canto\\Inflation\\V1\\G" +
      "PBMetadata\352\002\024Canto::Inflation::V1b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.canto.inflation.v1.InflationProto.getDescriptor(),
        });
    internal_static_canto_inflation_v1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_canto_inflation_v1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_inflation_v1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "Period", "EpochIdentifier", "EpochsPerPeriod", "SkippedEpochs", });
    internal_static_canto_inflation_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_canto_inflation_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_inflation_v1_Params_descriptor,
        new java.lang.String[] { "MintDenom", "ExponentialCalculation", "InflationDistribution", "EnableInflation", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.canto.inflation.v1.InflationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
