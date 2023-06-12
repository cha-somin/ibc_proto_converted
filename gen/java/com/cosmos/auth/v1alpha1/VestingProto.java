// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/auth/v1alpha1/vesting.proto

package com.cosmos.auth.v1alpha1;

public final class VestingProto {
  private VestingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_auth_v1alpha1_ManualVestingAccount_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_auth_v1alpha1_ManualVestingAccount_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"shentu/auth/v1alpha1/vesting.proto\022\024co" +
      "smos.auth.v1alpha1\032\024gogoproto/gogo.proto" +
      "\032\036cosmos/base/v1beta1/coin.proto\032$cosmos" +
      "/vesting/v1beta1/vesting.proto\"\275\002\n\024Manua" +
      "lVestingAccount\022b\n\024base_vesting_account\030" +
      "\001 \001(\0132*.cosmos.vesting.v1beta1.BaseVesti" +
      "ngAccountB\004\320\336\037\001R\022baseVestingAccount\022\205\001\n\014" +
      "vested_coins\030\002 \003(\0132\031.cosmos.base.v1beta1" +
      ".CoinBG\310\336\037\000\362\336\037\023yaml:\"vested_coins\"\252\337\037(gi" +
      "thub.com/cosmos/cosmos-sdk/types.CoinsR\013" +
      "vestedCoins\022/\n\010unlocker\030\003 \001(\tB\023\362\336\037\017yaml:" +
      "\"unlocker\"R\010unlocker:\010\210\240\037\000\230\240\037\000B\313\001\n\030com.c" +
      "osmos.auth.v1alpha1B\014VestingProtoP\001Z/git" +
      "hub.com/shentufoundation/shentu/x/auth/t" +
      "ypes\242\002\003CAX\252\002\024Cosmos.Auth.V1alpha1\312\002\024Cosm" +
      "os\\Auth\\V1alpha1\342\002 Cosmos\\Auth\\V1alpha1\\" +
      "GPBMetadata\352\002\026Cosmos::Auth::V1alpha1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.vesting.v1beta1.VestingProto.getDescriptor(),
        });
    internal_static_cosmos_auth_v1alpha1_ManualVestingAccount_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_auth_v1alpha1_ManualVestingAccount_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_auth_v1alpha1_ManualVestingAccount_descriptor,
        new java.lang.String[] { "BaseVestingAccount", "VestedCoins", "Unlocker", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.embed);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.vesting.v1beta1.VestingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
