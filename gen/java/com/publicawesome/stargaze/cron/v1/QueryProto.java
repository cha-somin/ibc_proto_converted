// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/cron/v1/query.proto

package com.publicawesome.stargaze.cron.v1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034stargaze/cron/v1/query.proto\022\036publicaw" +
      "esome.stargaze.cron.v1\032\024gogoproto/gogo.p" +
      "roto\032\034google/api/annotations.proto\"\034\n\032Qu" +
      "eryListPrivilegedRequest\"y\n\033QueryListPri" +
      "vilegedResponse\022Z\n\022contract_addresses\030\001 " +
      "\003(\tB+\352\336\037\'privileged_contract_addresses,o" +
      "mitemptyR\021contractAddresses2\276\001\n\005Query\022\264\001" +
      "\n\016ListPrivileged\022:.publicawesome.stargaz" +
      "e.cron.v1.QueryListPrivilegedRequest\032;.p" +
      "ublicawesome.stargaze.cron.v1.QueryListP" +
      "rivilegedResponse\")\202\323\344\223\002#\022!/stargaze/cro" +
      "n/v1/list-privilegedB\200\002\n\"com.publicaweso" +
      "me.stargaze.cron.v1B\nQueryProtoP\001Z3githu" +
      "b.com/public-awesome/stargaze/v11/x/cron" +
      "/types\242\002\003PSC\252\002\036Publicawesome.Stargaze.Cr" +
      "on.V1\312\002\036Publicawesome\\Stargaze\\Cron\\V1\342\002" +
      "*Publicawesome\\Stargaze\\Cron\\V1\\GPBMetad" +
      "ata\352\002!Publicawesome::Stargaze::Cron::V1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedRequest_descriptor,
        new java.lang.String[] { });
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_publicawesome_stargaze_cron_v1_QueryListPrivilegedResponse_descriptor,
        new java.lang.String[] { "ContractAddresses", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
