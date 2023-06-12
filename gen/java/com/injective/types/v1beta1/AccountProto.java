// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/types/v1beta1/account.proto

package com.injective.types.v1beta1;

public final class AccountProto {
  private AccountProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_types_v1beta1_EthAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%injective/types/v1beta1/account.proto\022" +
      "\027injective.types.v1beta1\032\036cosmos/auth/v1" +
      "beta1/auth.proto\032\031cosmos_proto/cosmos.pr" +
      "oto\032\024gogoproto/gogo.proto\"\345\001\n\nEthAccount" +
      "\022`\n\014base_account\030\001 \001(\0132 .cosmos.auth.v1b" +
      "eta1.BaseAccountB\033\320\336\037\001\362\336\037\023yaml:\"base_acc" +
      "ount\"R\013baseAccount\0221\n\tcode_hash\030\002 \001(\014B\024\362" +
      "\336\037\020yaml:\"code_hash\"R\010codeHash:B\210\240\037\000\230\240\037\000\350" +
      "\240\037\000\312\264-2github.com/cosmos/cosmos-sdk/x/au" +
      "th/types.AccountIB\350\001\n\033com.injective.type" +
      "s.v1beta1B\014AccountProtoP\001Z=github.com/In" +
      "jectiveLabs/injective-core/injective-cha" +
      "in/types\242\002\003ITX\252\002\027Injective.Types.V1beta1" +
      "\312\002\027Injective\\Types\\V1beta1\342\002#Injective\\T" +
      "ypes\\V1beta1\\GPBMetadata\352\002\031Injective::Ty" +
      "pes::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.auth.v1beta1.AuthProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_injective_types_v1beta1_EthAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_types_v1beta1_EthAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_types_v1beta1_EthAccount_descriptor,
        new java.lang.String[] { "BaseAccount", "CodeHash", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.embed);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.auth.v1beta1.AuthProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
