// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/snapshot/v1beta1/genesis.proto

package com.axelar.snapshot.v1beta1;

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
    internal_static_axelar_snapshot_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%axelar/snapshot/v1beta1/genesis.proto\022" +
      "\027axelar.snapshot.v1beta1\032\024gogoproto/gogo" +
      ".proto\032$axelar/snapshot/v1beta1/params.p" +
      "roto\032#axelar/snapshot/v1beta1/types.prot" +
      "o\"\255\001\n\014GenesisState\022=\n\006params\030\001 \001(\0132\037.axe" +
      "lar.snapshot.v1beta1.ParamsB\004\310\336\037\000R\006param" +
      "s\022^\n\022proxied_validators\030\002 \003(\0132).axelar.s" +
      "napshot.v1beta1.ProxiedValidatorB\004\310\336\037\000R\021" +
      "proxiedValidatorsB\344\001\n\033com.axelar.snapsho" +
      "t.v1beta1B\014GenesisProtoP\001Z5github.com/ax" +
      "elarnetwork/axelar-core/x/snapshot/types" +
      "\242\002\003ASX\252\002\027Axelar.Snapshot.V1beta1\312\002\027Axela" +
      "r\\Snapshot\\V1beta1\342\002#Axelar\\Snapshot\\V1b" +
      "eta1\\GPBMetadata\352\002\031Axelar::Snapshot::V1b" +
      "eta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.axelar.snapshot.v1beta1.ParamsProto.getDescriptor(),
          com.axelar.snapshot.v1beta1.TypesProto.getDescriptor(),
        });
    internal_static_axelar_snapshot_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_snapshot_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "ProxiedValidators", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.axelar.snapshot.v1beta1.ParamsProto.getDescriptor();
    com.axelar.snapshot.v1beta1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
