// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/params/module/v1/module.proto

package com.cosmos.params.module.v1;

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
    internal_static_cosmos_params_module_v1_Module_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_params_module_v1_Module_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$cosmos/params/module/v1/module.proto\022\027" +
      "cosmos.params.module.v1\032 cosmos/app/v1al" +
      "pha1/module.proto\"7\n\006Module:-\272\300\226\332\001\'\n%git" +
      "hub.com/cosmos/cosmos-sdk/x/paramsB\251\001\n\033c" +
      "om.cosmos.params.module.v1B\013ModuleProtoP" +
      "\001\242\002\003CPM\252\002\027Cosmos.Params.Module.V1\312\002\027Cosm" +
      "os\\Params\\Module\\V1\342\002#Cosmos\\Params\\Modu" +
      "le\\V1\\GPBMetadata\352\002\032Cosmos::Params::Modu" +
      "le::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.app.v1alpha1.ModuleProto.getDescriptor(),
        });
    internal_static_cosmos_params_module_v1_Module_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_params_module_v1_Module_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_params_module_v1_Module_descriptor,
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
