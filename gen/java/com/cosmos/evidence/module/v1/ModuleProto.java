// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/module/v1/module.proto

package com.cosmos.evidence.module.v1;

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
    internal_static_cosmos_evidence_module_v1_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&cosmos/evidence/module/v1/module.proto" +
      "\022\031cosmos.evidence.module.v1\032 cosmos/app/" +
      "v1alpha1/module.proto\")\n\006Module:\037\272\300\226\332\001\031\n" +
      "\027cosmossdk.io/x/evidenceB\263\001\n\035com.cosmos." +
      "evidence.module.v1B\013ModuleProtoP\001\242\002\003CEM\252" +
      "\002\031Cosmos.Evidence.Module.V1\312\002\031Cosmos\\Evi" +
      "dence\\Module\\V1\342\002%Cosmos\\Evidence\\Module" +
      "\\V1\\GPBMetadata\352\002\034Cosmos::Evidence::Modu" +
      "le::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.app.v1alpha1.ModuleProto.getDescriptor(),
        });
    internal_static_cosmos_evidence_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_module_v1_Module_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos.app.v1alpha1.ModuleProto.module);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.app.v1alpha1.ModuleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
