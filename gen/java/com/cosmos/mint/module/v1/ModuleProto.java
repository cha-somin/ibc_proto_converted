// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/mint/module/v1/module.proto

package com.cosmos.mint.module.v1;

public final class ModuleProto {
  private ModuleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_mint_module_v1_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_mint_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cosmos/mint/module/v1/module.proto\022\025co" +
      "smos.mint.module.v1\032 cosmos/app/v1alpha1" +
      "/module.proto\"\201\001\n\006Module\022,\n\022fee_collecto" +
      "r_name\030\001 \001(\tR\020feeCollectorName\022\034\n\tauthor" +
      "ity\030\002 \001(\tR\tauthority:+\272\300\226\332\001%\n#github.com" +
      "/cosmos/cosmos-sdk/x/mintB\237\001\n\031com.cosmos" +
      ".mint.module.v1B\013ModuleProtoP\001\242\002\003CMM\252\002\025C" +
      "osmos.Mint.Module.V1\312\002\025Cosmos\\Mint\\Modul" +
      "e\\V1\342\002!Cosmos\\Mint\\Module\\V1\\GPBMetadata" +
      "\352\002\030Cosmos::Mint::Module::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.app.v1alpha1.ModuleProto.getDescriptor(),
        });
    internal_static_cosmos_mint_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_mint_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_mint_module_v1_Module_descriptor,
        new java.lang.String[] { "FeeCollectorName", "Authority", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.app.v1alpha1.ModuleProto.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.app.v1alpha1.ModuleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
