// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/staking/v1beta3/params.proto

package com.akash.staking.v1beta3;

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
    internal_static_akash_staking_v1beta3_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_staking_v1beta3_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"akash/staking/v1beta3/params.proto\022\025ak" +
      "ash.staking.v1beta3\032\024gogoproto/gogo.prot" +
      "o\"\206\001\n\006Params\022|\n\023min_commission_rate\030\001 \001(" +
      "\tBL\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.Dec\362\336\037\032yaml:\"min_commission_rate\"R" +
      "\021minCommissionRateB\332\001\n\031com.akash.staking" +
      ".v1beta3B\013ParamsProtoP\001Z:github.com/akas" +
      "h-network/akash-api/go/node/staking/v1be" +
      "ta3\242\002\003ASX\252\002\025Akash.Staking.V1beta3\312\002\025Akas" +
      "h\\Staking\\V1beta3\342\002!Akash\\Staking\\V1beta" +
      "3\\GPBMetadata\352\002\027Akash::Staking::V1beta3b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_akash_staking_v1beta3_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_staking_v1beta3_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_staking_v1beta3_Params_descriptor,
        new java.lang.String[] { "MinCommissionRate", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
