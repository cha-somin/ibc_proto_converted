// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/vault/v1beta1/genesis.proto

package com.comdex.vault.v1beta1;

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
    internal_static_comdex_vault_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_comdex_vault_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"comdex/vault/v1beta1/genesis.proto\022\024co" +
      "mdex.vault.v1beta1\032\024gogoproto/gogo.proto" +
      "\032 comdex/vault/v1beta1/vault.proto\"\327\004\n\014G" +
      "enesisState\022T\n\006vaults\030\001 \003(\0132\033.comdex.vau" +
      "lt.v1beta1.VaultB\037\310\336\037\000\342\336\037\006Vaults\362\336\037\ryaml" +
      ":\"vaults\"R\006vaults\022o\n\017stableMintVault\030\002 \003" +
      "(\0132%.comdex.vault.v1beta1.StableMintVaul" +
      "tB\036\310\336\037\000\362\336\037\026yaml:\"stableMintVault\"R\017stabl" +
      "eMintVault\022\243\001\n\033appExtendedPairVaultMappi" +
      "ng\030\003 \003(\01325.comdex.vault.v1beta1.AppExten" +
      "dedPairVaultMappingDataB*\310\336\037\000\362\336\037\"yaml:\"a" +
      "ppExtendedPairVaultMapping\"R\033appExtended" +
      "PairVaultMapping\022\226\001\n\025userVaultAssetMappi" +
      "ng\030\004 \003(\0132:.comdex.vault.v1beta1.OwnerApp" +
      "ExtendedPairVaultMappingDataB$\310\336\037\000\362\336\037\034ya" +
      "ml:\"userVaultAssetMapping\"R\025userVaultAss" +
      "etMapping\022A\n\016lengthOfVaults\030\005 \001(\004B\031\362\336\037\025y" +
      "aml:\"lengthOfVaults\"R\016lengthOfVaultsB\323\001\n" +
      "\030com.comdex.vault.v1beta1B\014GenesisProtoP" +
      "\001Z/github.com/comdex-official/comdex/x/v" +
      "ault/types\242\002\003CVX\252\002\024Comdex.Vault.V1beta1\312" +
      "\002\024Comdex\\Vault\\V1beta1\342\002 Comdex\\Vault\\V1" +
      "beta1\\GPBMetadata\352\002\026Comdex::Vault::V1bet" +
      "a1\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.comdex.vault.v1beta1.VaultProto.getDescriptor(),
        });
    internal_static_comdex_vault_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_comdex_vault_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_comdex_vault_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "Vaults", "StableMintVault", "AppExtendedPairVaultMapping", "UserVaultAssetMapping", "LengthOfVaults", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.comdex.vault.v1beta1.VaultProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
