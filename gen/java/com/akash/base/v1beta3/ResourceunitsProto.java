// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta3/resourceunits.proto

package com.akash.base.v1beta3;

public final class ResourceunitsProto {
  private ResourceunitsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_base_v1beta3_ResourceUnits_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_base_v1beta3_ResourceUnits_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&akash/base/v1beta3/resourceunits.proto" +
      "\022\022akash.base.v1beta3\032\024gogoproto/gogo.pro" +
      "to\032\034akash/base/v1beta3/cpu.proto\032\034akash/" +
      "base/v1beta3/gpu.proto\032\037akash/base/v1bet" +
      "a3/memory.proto\032 akash/base/v1beta3/stor" +
      "age.proto\032!akash/base/v1beta3/endpoint.p" +
      "roto\"\251\004\n\rResourceUnits\022_\n\003cpu\030\001 \001(\0132\027.ak" +
      "ash.base.v1beta3.CPUB4\310\336\037\001\342\336\037\003CPU\352\336\037\rcpu" +
      ",omitempty\362\336\037\024yaml:\"cpu,omitempty\"R\003cpu\022" +
      "g\n\006memory\030\002 \001(\0132\032.akash.base.v1beta3.Mem" +
      "oryB3\310\336\037\001\352\336\037\020memory,omitempty\362\336\037\027yaml:\"m" +
      "emory,omitempty\"R\006memory\022w\n\007storage\030\003 \003(" +
      "\0132\033.akash.base.v1beta3.StorageB@\310\336\037\000\352\336\037\021" +
      "storage,omitempty\362\336\037\030yaml:\"storage,omite" +
      "mpty\"\252\337\037\007VolumesR\007storage\022_\n\003gpu\030\004 \001(\0132\027" +
      ".akash.base.v1beta3.GPUB4\310\336\037\001\342\336\037\003GPU\352\336\037\r" +
      "gpu,omitempty\362\336\037\024yaml:\"gpu,omitempty\"R\003g" +
      "pu\022n\n\tendpoints\030\005 \003(\0132\034.akash.base.v1bet" +
      "a3.EndpointB2\310\336\037\000\352\336\037\tendpoints\362\336\037\020yaml:\"" +
      "endpoints\"\252\337\037\tEndpointsR\tendpoints:\004\350\240\037\001" +
      "B\320\001\n\026com.akash.base.v1beta3B\022Resourceuni" +
      "tsProtoP\001Z8github.com/akash-network/akas" +
      "h-api/go/node/types/v1beta3\242\002\003ABX\252\002\022Akas" +
      "h.Base.V1beta3\312\002\022Akash\\Base\\V1beta3\342\002\036Ak" +
      "ash\\Base\\V1beta3\\GPBMetadata\352\002\024Akash::Ba" +
      "se::V1beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.base.v1beta3.CpuProto.getDescriptor(),
          com.akash.base.v1beta3.GpuProto.getDescriptor(),
          com.akash.base.v1beta3.MemoryProto.getDescriptor(),
          com.akash.base.v1beta3.StorageProto.getDescriptor(),
          com.akash.base.v1beta3.EndpointProto.getDescriptor(),
        });
    internal_static_akash_base_v1beta3_ResourceUnits_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_base_v1beta3_ResourceUnits_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_base_v1beta3_ResourceUnits_descriptor,
        new java.lang.String[] { "Cpu", "Memory", "Storage", "Gpu", "Endpoints", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.base.v1beta3.CpuProto.getDescriptor();
    com.akash.base.v1beta3.GpuProto.getDescriptor();
    com.akash.base.v1beta3.MemoryProto.getDescriptor();
    com.akash.base.v1beta3.StorageProto.getDescriptor();
    com.akash.base.v1beta3.EndpointProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
