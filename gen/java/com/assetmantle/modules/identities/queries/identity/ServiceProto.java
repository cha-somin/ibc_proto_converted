// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/queries/identity/service.proto

package com.assetmantle.modules.identities.queries.identity;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5assetmantle/identities/queries/identit" +
      "y/service.proto\022/assetmantle.modules.ide" +
      "ntities.queries.identity\032\034google/api/ann" +
      "otations.proto\032;assetmantle/identities/q" +
      "ueries/identity/query_request.proto\032<ass" +
      "etmantle/identities/queries/identity/que" +
      "ry_response.proto2\300\001\n\007Service\022\264\001\n\006Handle" +
      "\022=.assetmantle.modules.identities.querie" +
      "s.identity.QueryRequest\032>.assetmantle.mo" +
      "dules.identities.queries.identity.QueryR" +
      "esponse\"+\202\323\344\223\002%\022#/mantle/identities/v1be" +
      "ta1/identityB\243\002\n3com.assetmantle.modules" +
      ".identities.queries.identityB\014ServicePro" +
      "to\242\002\005AMIQI\252\002/Assetmantle.Modules.Identit" +
      "ies.Queries.Identity\312\002/Assetmantle\\Modul" +
      "es\\Identities\\Queries\\Identity\342\002;Assetma" +
      "ntle\\Modules\\Identities\\Queries\\Identity" +
      "\\GPBMetadata\352\0023Assetmantle::Modules::Ide" +
      "ntities::Queries::Identityb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.identities.queries.identity.QueryRequestProto.getDescriptor(),
          com.assetmantle.modules.identities.queries.identity.QueryResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.identities.queries.identity.QueryRequestProto.getDescriptor();
    com.assetmantle.modules.identities.queries.identity.QueryResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}