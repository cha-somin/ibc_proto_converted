// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/interchain_accounts/v1/packet.proto

package com.ibc.applications.interchain_accounts.v1;

public final class PacketProto {
  private PacketProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_InterchainAccountPacketData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_InterchainAccountPacketData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ibc_applications_interchain_accounts_v1_CosmosTx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ibc_applications_interchain_accounts_v1_CosmosTx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4ibc/applications/interchain_accounts/v" +
      "1/packet.proto\022\'ibc.applications.interch" +
      "ain_accounts.v1\032\031google/protobuf/any.pro" +
      "to\032\024gogoproto/gogo.proto\"\210\001\n\033InterchainA" +
      "ccountPacketData\022A\n\004type\030\001 \001(\0162-.ibc.app" +
      "lications.interchain_accounts.v1.TypeR\004t" +
      "ype\022\022\n\004data\030\002 \001(\014R\004data\022\022\n\004memo\030\003 \001(\tR\004m" +
      "emo\"<\n\010CosmosTx\0220\n\010messages\030\001 \003(\0132\024.goog" +
      "le.protobuf.AnyR\010messages*X\n\004Type\022%\n\020TYP" +
      "E_UNSPECIFIED\020\000\032\017\212\235 \013UNSPECIFIED\022#\n\017TYPE" +
      "_EXECUTE_TX\020\001\032\016\212\235 \nEXECUTE_TX\032\004\210\243\036\000B\274\002\n+" +
      "com.ibc.applications.interchain_accounts" +
      ".v1B\013PacketProtoP\001ZEgithub.com/cosmos/ib" +
      "c-go/v7/modules/apps/27-interchain-accou" +
      "nts/types\242\002\003IAI\252\002&Ibc.Applications.Inter" +
      "chainAccounts.V1\312\002&Ibc\\Applications\\Inte" +
      "rchainAccounts\\V1\342\0022Ibc\\Applications\\Int" +
      "erchainAccounts\\V1\\GPBMetadata\352\002)Ibc::Ap" +
      "plications::InterchainAccounts::V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.AnyProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ibc_applications_interchain_accounts_v1_InterchainAccountPacketData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ibc_applications_interchain_accounts_v1_InterchainAccountPacketData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_InterchainAccountPacketData_descriptor,
        new java.lang.String[] { "Type", "Data", "Memo", });
    internal_static_ibc_applications_interchain_accounts_v1_CosmosTx_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ibc_applications_interchain_accounts_v1_CosmosTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ibc_applications_interchain_accounts_v1_CosmosTx_descriptor,
        new java.lang.String[] { "Messages", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.AnyProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
