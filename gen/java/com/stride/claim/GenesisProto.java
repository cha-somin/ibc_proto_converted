// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/claim/genesis.proto

package com.stride.claim;

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
    internal_static_stride_claim_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stride_claim_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032stride/claim/genesis.proto\022\014stride.cla" +
      "im\032\024gogoproto/gogo.proto\032\030stride/claim/c" +
      "laim.proto\032\031stride/claim/params.proto\"\261\001" +
      "\n\014GenesisState\022C\n\006params\030\001 \001(\0132\024.stride." +
      "claim.ParamsB\025\310\336\037\000\362\336\037\ryaml:\"params\"R\006par" +
      "ams\022\\\n\rclaim_records\030\002 \003(\0132\031.stride.clai" +
      "m.ClaimRecordB\034\310\336\037\000\362\336\037\024yaml:\"claim_recor" +
      "ds\"R\014claimRecordsB\241\001\n\020com.stride.claimB\014" +
      "GenesisProtoP\001Z.github.com/Stride-Labs/s" +
      "tride/v9/x/claim/types\242\002\003SCX\252\002\014Stride.Cl" +
      "aim\312\002\014Stride\\Claim\342\002\030Stride\\Claim\\GPBMet" +
      "adata\352\002\rStride::Claimb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.stride.claim.ClaimProto.getDescriptor(),
          com.stride.claim.ParamsProto.getDescriptor(),
        });
    internal_static_stride_claim_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stride_claim_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stride_claim_GenesisState_descriptor,
        new java.lang.String[] { "Params", "ClaimRecords", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.stride.claim.ClaimProto.getDescriptor();
    com.stride.claim.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
