// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/bank/module/v1/module.proto

package com.cosmos.bank.module.v1;

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
    internal_static_cosmos_bank_module_v1_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cosmos/bank/module/v1/module.proto\022\025co" +
      "smos.bank.module.v1\032 cosmos/app/v1alpha1" +
      "/module.proto\"\234\001\n\006Module\022G\n blocked_modu" +
      "le_accounts_override\030\001 \003(\tR\035blockedModul" +
      "eAccountsOverride\022\034\n\tauthority\030\002 \001(\tR\tau" +
      "thority:+\272\300\226\332\001%\n#github.com/cosmos/cosmo" +
      "s-sdk/x/bankB\237\001\n\031com.cosmos.bank.module." +
      "v1B\013ModuleProtoP\001\242\002\003CBM\252\002\025Cosmos.Bank.Mo" +
      "dule.V1\312\002\025Cosmos\\Bank\\Module\\V1\342\002!Cosmos" +
      "\\Bank\\Module\\V1\\GPBMetadata\352\002\030Cosmos::Ba" +
      "nk::Module::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.app.v1alpha1.ModuleProto.getDescriptor(),
        });
    internal_static_cosmos_bank_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_bank_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_bank_module_v1_Module_descriptor,
        new java.lang.String[] { "BlockedModuleAccountsOverride", "Authority", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.app.v1alpha1.ModuleProto.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.app.v1alpha1.ModuleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
