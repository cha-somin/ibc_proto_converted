// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/assets/transactions/revoke/service.proto

package com.assetmantle.modules.assets.transactions.revoke;

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
      "\n4assetmantle/assets/transactions/revoke" +
      "/service.proto\022.assetmantle.modules.asse" +
      "ts.transactions.revoke\032\034google/api/annot" +
      "ations.proto\0324assetmantle/assets/transac" +
      "tions/revoke/message.proto\032Aassetmantle/" +
      "assets/transactions/revoke/transaction_r" +
      "esponse.proto2\261\001\n\007Service\022\245\001\n\006Handle\0227.a" +
      "ssetmantle.modules.assets.transactions.r" +
      "evoke.Message\032C.assetmantle.modules.asse" +
      "ts.transactions.revoke.TransactionRespon" +
      "se\"\035\202\323\344\223\002\027\"\025/mantle/assets/revokeB\236\002\n2co" +
      "m.assetmantle.modules.assets.transaction" +
      "s.revokeB\014ServiceProto\242\002\005AMATR\252\002.Assetma" +
      "ntle.Modules.Assets.Transactions.Revoke\312" +
      "\002.Assetmantle\\Modules\\Assets\\Transaction" +
      "s\\Revoke\342\002:Assetmantle\\Modules\\Assets\\Tr" +
      "ansactions\\Revoke\\GPBMetadata\352\0022Assetman" +
      "tle::Modules::Assets::Transactions::Revo" +
      "keb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.revoke.MessageProto.getDescriptor(),
          com.assetmantle.modules.assets.transactions.revoke.TransactionResponseProto.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.revoke.MessageProto.getDescriptor();
    com.assetmantle.modules.assets.transactions.revoke.TransactionResponseProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
