// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta2/genesis.proto

package com.akash.deployment.v1beta2;

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
    internal_static_akash_deployment_v1beta2_GenesisDeployment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta2_GenesisDeployment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_deployment_v1beta2_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_deployment_v1beta2_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&akash/deployment/v1beta2/genesis.proto" +
      "\022\030akash.deployment.v1beta2\032\024gogoproto/go" +
      "go.proto\032)akash/deployment/v1beta2/deplo" +
      "yment.proto\032$akash/deployment/v1beta2/gr" +
      "oup.proto\032%akash/deployment/v1beta2/para" +
      "ms.proto\"\334\001\n\021GenesisDeployment\022m\n\ndeploy" +
      "ment\030\001 \001(\0132$.akash.deployment.v1beta2.De" +
      "ploymentB\'\310\336\037\000\352\336\037\ndeployment\362\336\037\021yaml:\"de" +
      "ployment\"R\ndeployment\022X\n\006groups\030\002 \003(\0132\037." +
      "akash.deployment.v1beta2.GroupB\037\310\336\037\000\352\336\037\006" +
      "groups\362\336\037\ryaml:\"groups\"R\006groups\"\343\001\n\014Gene" +
      "sisState\022x\n\013deployments\030\001 \003(\0132+.akash.de" +
      "ployment.v1beta2.GenesisDeploymentB)\310\336\037\000" +
      "\352\336\037\013deployments\362\336\037\022yaml:\"deployments\"R\013d" +
      "eployments\022Y\n\006params\030\002 \001(\0132 .akash.deplo" +
      "yment.v1beta2.ParamsB\037\310\336\037\000\352\336\037\006params\362\336\037\r" +
      "yaml:\"params\"R\006paramsB\355\001\n\034com.akash.depl" +
      "oyment.v1beta2B\014GenesisProtoP\001Z=github.c" +
      "om/akash-network/akash-api/go/node/deplo" +
      "yment/v1beta2\242\002\003ADX\252\002\030Akash.Deployment.V" +
      "1beta2\312\002\030Akash\\Deployment\\V1beta2\342\002$Akas" +
      "h\\Deployment\\V1beta2\\GPBMetadata\352\002\032Akash" +
      "::Deployment::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.deployment.v1beta2.DeploymentProto.getDescriptor(),
          com.akash.deployment.v1beta2.GroupProto.getDescriptor(),
          com.akash.deployment.v1beta2.ParamsProto.getDescriptor(),
        });
    internal_static_akash_deployment_v1beta2_GenesisDeployment_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_deployment_v1beta2_GenesisDeployment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta2_GenesisDeployment_descriptor,
        new java.lang.String[] { "Deployment", "Groups", });
    internal_static_akash_deployment_v1beta2_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_akash_deployment_v1beta2_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_deployment_v1beta2_GenesisState_descriptor,
        new java.lang.String[] { "Deployments", "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.deployment.v1beta2.DeploymentProto.getDescriptor();
    com.akash.deployment.v1beta2.GroupProto.getDescriptor();
    com.akash.deployment.v1beta2.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
