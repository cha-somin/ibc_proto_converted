// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta3/cpu.proto

package com.akash.base.v1beta3;

public final class CpuProto {
  private CpuProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_base_v1beta3_CPU_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_base_v1beta3_CPU_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034akash/base/v1beta3/cpu.proto\022\022akash.ba" +
      "se.v1beta3\032\024gogoproto/gogo.proto\032\"akash/" +
      "base/v1beta3/attribute.proto\032&akash/base" +
      "/v1beta3/resourcevalue.proto\"\325\001\n\003CPU\022=\n\005" +
      "units\030\001 \001(\0132!.akash.base.v1beta3.Resourc" +
      "eValueB\004\310\336\037\000R\005units\022\210\001\n\nattributes\030\002 \003(\013" +
      "2\035.akash.base.v1beta3.AttributeBI\310\336\037\000\352\336\037" +
      "\024attributes,omitempty\362\336\037\033yaml:\"attribute" +
      "s,omitempty\"\252\337\037\nAttributesR\nattributes:\004" +
      "\350\240\037\001B\306\001\n\026com.akash.base.v1beta3B\010CpuProt" +
      "oP\001Z8github.com/akash-network/akash-api/" +
      "go/node/types/v1beta3\242\002\003ABX\252\002\022Akash.Base" +
      ".V1beta3\312\002\022Akash\\Base\\V1beta3\342\002\036Akash\\Ba" +
      "se\\V1beta3\\GPBMetadata\352\002\024Akash::Base::V1" +
      "beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.base.v1beta3.AttributeProto.getDescriptor(),
          com.akash.base.v1beta3.ResourcevalueProto.getDescriptor(),
        });
    internal_static_akash_base_v1beta3_CPU_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_base_v1beta3_CPU_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_base_v1beta3_CPU_descriptor,
        new java.lang.String[] { "Units", "Attributes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.base.v1beta3.AttributeProto.getDescriptor();
    com.akash.base.v1beta3.ResourcevalueProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
