// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/transactions/quash/service.proto

package com.assetmantle.modules.identities.transactions.quash;

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
      "\n7assetmantle/identities/transactions/qu" +
      "ash/service.proto\0221assetmantle.modules.i" +
      "dentities.transactions.quash\032\034google/api" +
      "/annotations.proto\0327assetmantle/identiti" +
      "es/transactions/quash/message.proto\032Dass" +
      "etmantle/identities/transactions/quash/t" +
      "ransaction_response.proto2\272\001\n\007Service\022\256\001" +
      "\n\006Handle\022:.assetmantle.modules.identitie" +
      "s.transactions.quash.Message\032F.assetmant" +
      "le.modules.identities.transactions.quash" +
      ".TransactionResponse\" \202\323\344\223\002\032\"\030/mantle/id" +
      "entities/quashB\255\002\n5com.assetmantle.modul" +
      "es.identities.transactions.quashB\014Servic" +
      "eProto\242\002\005AMITQ\252\0021Assetmantle.Modules.Ide" +
      "ntities.Transactions.Quash\312\0021Assetmantle" +
      "\\Modules\\Identities\\Transactions\\Quash\342\002" +
      "=Assetmantle\\Modules\\Identities\\Transact" +
      "ions\\Quash\\GPBMetadata\352\0025Assetmantle::Mo" +
      "dules::Identities::Transactions::Quashb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.quash.MessageProto.getDescriptor(),
          com.assetmantle.modules.identities.transactions.quash.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.quash.MessageProto.getDescriptor();
    com.assetmantle.modules.identities.transactions.quash.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
