// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/earn/v1beta1/genesis.proto

package com.kava.earn.v1beta1;

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
    internal_static_kava_earn_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_earn_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037kava/earn/v1beta1/genesis.proto\022\021kava." +
      "earn.v1beta1\032\024gogoproto/gogo.proto\032\036kava" +
      "/earn/v1beta1/params.proto\032\035kava/earn/v1" +
      "beta1/vault.proto\"\222\002\n\014GenesisState\0227\n\006pa" +
      "rams\030\001 \001(\0132\031.kava.earn.v1beta1.ParamsB\004\310" +
      "\336\037\000R\006params\022Y\n\rvault_records\030\002 \003(\0132\036.kav" +
      "a.earn.v1beta1.VaultRecordB\024\310\336\037\000\252\337\037\014Vaul" +
      "tRecordsR\014vaultRecords\022n\n\023vault_share_re" +
      "cords\030\003 \003(\0132#.kava.earn.v1beta1.VaultSha" +
      "reRecordB\031\310\336\037\000\252\337\037\021VaultShareRecordsR\021vau" +
      "ltShareRecordsB\263\001\n\025com.kava.earn.v1beta1" +
      "B\014GenesisProtoP\001Z&github.com/kava-labs/k" +
      "ava/x/earn/types\242\002\003KEX\252\002\021Kava.Earn.V1bet" +
      "a1\312\002\021Kava\\Earn\\V1beta1\342\002\035Kava\\Earn\\V1bet" +
      "a1\\GPBMetadata\352\002\023Kava::Earn::V1beta1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.kava.earn.v1beta1.ParamsProto.getDescriptor(),
          com.kava.earn.v1beta1.VaultProto.getDescriptor(),
        });
    internal_static_kava_earn_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_earn_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_earn_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Params", "VaultRecords", "VaultShareRecords", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.kava.earn.v1beta1.ParamsProto.getDescriptor();
    com.kava.earn.v1beta1.VaultProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
