// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/minters.proto

package com.noble.fiattokenfactory;

public final class MintersProto {
  private MintersProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_noble_fiattokenfactory_Minters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_noble_fiattokenfactory_Minters_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$noble/fiattokenfactory/minters.proto\022\026" +
      "noble.fiattokenfactory\032\024gogoproto/gogo.p" +
      "roto\032\036cosmos/base/v1beta1/coin.proto\"b\n\007" +
      "Minters\022\030\n\007address\030\001 \001(\tR\007address\022=\n\tall" +
      "owance\030\002 \001(\0132\031.cosmos.base.v1beta1.CoinB" +
      "\004\310\336\037\000R\tallowanceB\343\001\n\032com.noble.fiattoken" +
      "factoryB\014MintersProtoP\001Z>github.com/stra" +
      "ngelove-ventures/noble/x/fiattokenfactor" +
      "y/types\242\002\003NFX\252\002\026Noble.Fiattokenfactory\312\002" +
      "\026Noble\\Fiattokenfactory\342\002\"Noble\\Fiattoke" +
      "nfactory\\GPBMetadata\352\002\027Noble::Fiattokenf" +
      "actoryb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_noble_fiattokenfactory_Minters_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_noble_fiattokenfactory_Minters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_noble_fiattokenfactory_Minters_descriptor,
        new java.lang.String[] { "Address", "Allowance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
