// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/supply/v1/accounts.proto

package com.chainmain.supply.v1;

public final class AccountsProto {
  private AccountsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_chainmain_supply_v1_VestingAccounts_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_chainmain_supply_v1_VestingAccounts_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"cryptoorg/supply/v1/accounts.proto\022\023ch" +
      "ainmain.supply.v1\"/\n\017VestingAccounts\022\034\n\t" +
      "addresses\030\001 \003(\tR\taddressesB\315\001\n\027com.chain" +
      "main.supply.v1B\rAccountsProtoP\001Z5github." +
      "com/crypto-org-chain/chain-main/x/supply" +
      "/types\242\002\003CSX\252\002\023Chainmain.Supply.V1\312\002\023Cha" +
      "inmain\\Supply\\V1\342\002\037Chainmain\\Supply\\V1\\G" +
      "PBMetadata\352\002\025Chainmain::Supply::V1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_chainmain_supply_v1_VestingAccounts_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chainmain_supply_v1_VestingAccounts_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_chainmain_supply_v1_VestingAccounts_descriptor,
        new java.lang.String[] { "Addresses", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
