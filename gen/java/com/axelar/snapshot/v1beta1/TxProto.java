// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/snapshot/v1beta1/tx.proto

package com.axelar.snapshot.v1beta1;

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
    internal_static_axelar_snapshot_v1beta1_RegisterProxyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_RegisterProxyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_snapshot_v1beta1_RegisterProxyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_RegisterProxyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_DeactivateProxyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_axelar_snapshot_v1beta1_DeactivateProxyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n axelar/snapshot/v1beta1/tx.proto\022\027axel" +
      "ar.snapshot.v1beta1\032\024gogoproto/gogo.prot" +
      "o\032\034google/api/annotations.proto\032.axelar/" +
      "permission/exported/v1beta1/types.proto\"" +
      "\271\001\n\024RegisterProxyRequest\022I\n\006sender\030\001 \001(\014" +
      "B1\372\336\037-github.com/cosmos/cosmos-sdk/types" +
      ".ValAddressR\006sender\022P\n\nproxy_addr\030\002 \001(\014B" +
      "1\372\336\037-github.com/cosmos/cosmos-sdk/types." +
      "AccAddressR\tproxyAddr:\004\200\265\030\001\"\027\n\025RegisterP" +
      "roxyResponse\"i\n\026DeactivateProxyRequest\022I" +
      "\n\006sender\030\001 \001(\014B1\372\336\037-github.com/cosmos/co" +
      "smos-sdk/types.ValAddressR\006sender:\004\200\265\030\001\"" +
      "\031\n\027DeactivateProxyResponseB\337\001\n\033com.axela" +
      "r.snapshot.v1beta1B\007TxProtoP\001Z5github.co" +
      "m/axelarnetwork/axelar-core/x/snapshot/t" +
      "ypes\242\002\003ASX\252\002\027Axelar.Snapshot.V1beta1\312\002\027A" +
      "xelar\\Snapshot\\V1beta1\342\002#Axelar\\Snapshot" +
      "\\V1beta1\\GPBMetadata\352\002\031Axelar::Snapshot:" +
      ":V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.axelar.permission.exported.v1beta1.TypesProto.getDescriptor(),
        });
    internal_static_axelar_snapshot_v1beta1_RegisterProxyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_axelar_snapshot_v1beta1_RegisterProxyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_RegisterProxyRequest_descriptor,
        new java.lang.String[] { "Sender", "ProxyAddr", });
    internal_static_axelar_snapshot_v1beta1_RegisterProxyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_axelar_snapshot_v1beta1_RegisterProxyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_RegisterProxyResponse_descriptor,
        new java.lang.String[] { });
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_DeactivateProxyRequest_descriptor,
        new java.lang.String[] { "Sender", });
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_axelar_snapshot_v1beta1_DeactivateProxyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_axelar_snapshot_v1beta1_DeactivateProxyResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.axelar.permission.exported.v1beta1.TypesProto.permissionRole);
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.axelar.permission.exported.v1beta1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
