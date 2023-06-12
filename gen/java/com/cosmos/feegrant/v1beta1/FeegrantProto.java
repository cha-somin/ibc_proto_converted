// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/feegrant/v1beta1/feegrant.proto

package com.cosmos.feegrant.v1beta1;

public final class FeegrantProto {
  private FeegrantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_BasicAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_feegrant_v1beta1_Grant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&cosmos/feegrant/v1beta1/feegrant.proto" +
      "\022\027cosmos.feegrant.v1beta1\032\024gogoproto/gog" +
      "o.proto\032\031google/protobuf/any.proto\032\031cosm" +
      "os_proto/cosmos.proto\032\036cosmos/base/v1bet" +
      "a1/coin.proto\032\021amino/amino.proto\032\037google" +
      "/protobuf/timestamp.proto\032\036google/protob" +
      "uf/duration.proto\"\240\002\n\016BasicAllowance\022\202\001\n" +
      "\013spend_limit\030\001 \003(\0132\031.cosmos.base.v1beta1" +
      ".CoinBF\310\336\037\000\252\337\037(github.com/cosmos/cosmos-" +
      "sdk/types.Coins\232\347\260*\014legacy_coins\250\347\260*\001R\ns" +
      "pendLimit\022@\n\nexpiration\030\002 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\004\220\337\037\001R\nexpiration:G\312\264-" +
      "%cosmos.feegrant.v1beta1.FeeAllowanceI\212\347" +
      "\260*\031cosmos-sdk/BasicAllowance\"\331\004\n\021Periodi" +
      "cAllowance\022H\n\005basic\030\001 \001(\0132\'.cosmos.feegr" +
      "ant.v1beta1.BasicAllowanceB\t\310\336\037\000\250\347\260*\001R\005b" +
      "asic\022@\n\006period\030\002 \001(\0132\031.google.protobuf.D" +
      "urationB\r\310\336\037\000\230\337\037\001\250\347\260*\001R\006period\022\217\001\n\022perio" +
      "d_spend_limit\030\003 \003(\0132\031.cosmos.base.v1beta" +
      "1.CoinBF\310\336\037\000\252\337\037(github.com/cosmos/cosmos" +
      "-sdk/types.Coins\232\347\260*\014legacy_coins\250\347\260*\001R\020" +
      "periodSpendLimit\022\213\001\n\020period_can_spend\030\004 " +
      "\003(\0132\031.cosmos.base.v1beta1.CoinBF\310\336\037\000\252\337\037(" +
      "github.com/cosmos/cosmos-sdk/types.Coins" +
      "\232\347\260*\014legacy_coins\250\347\260*\001R\016periodCanSpend\022L" +
      "\n\014period_reset\030\005 \001(\0132\032.google.protobuf.T" +
      "imestampB\r\310\336\037\000\220\337\037\001\250\347\260*\001R\013periodReset:J\312\264" +
      "-%cosmos.feegrant.v1beta1.FeeAllowanceI\212" +
      "\347\260*\034cosmos-sdk/PeriodicAllowance\"\361\001\n\023All" +
      "owedMsgAllowance\022]\n\tallowance\030\001 \001(\0132\024.go" +
      "ogle.protobuf.AnyB)\312\264-%cosmos.feegrant.v" +
      "1beta1.FeeAllowanceIR\tallowance\022)\n\020allow" +
      "ed_messages\030\002 \003(\tR\017allowedMessages:P\210\240\037\000" +
      "\312\264-%cosmos.feegrant.v1beta1.FeeAllowance" +
      "I\212\347\260*\036cosmos-sdk/AllowedMsgAllowance\"\316\001\n" +
      "\005Grant\0222\n\007granter\030\001 \001(\tB\030\322\264-\024cosmos.Addr" +
      "essStringR\007granter\0222\n\007grantee\030\002 \001(\tB\030\322\264-" +
      "\024cosmos.AddressStringR\007grantee\022]\n\tallowa" +
      "nce\030\003 \001(\0132\024.google.protobuf.AnyB)\312\264-%cos" +
      "mos.feegrant.v1beta1.FeeAllowanceIR\tallo" +
      "wanceB\303\001\n\033com.cosmos.feegrant.v1beta1B\rF" +
      "eegrantProtoP\001Z\027cosmossdk.io/x/feegrant\242" +
      "\002\003CFX\252\002\027Cosmos.Feegrant.V1beta1\312\002\027Cosmos" +
      "\\Feegrant\\V1beta1\342\002#Cosmos\\Feegrant\\V1be" +
      "ta1\\GPBMetadata\352\002\031Cosmos::Feegrant::V1be" +
      "ta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
        });
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_feegrant_v1beta1_BasicAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_BasicAllowance_descriptor,
        new java.lang.String[] { "SpendLimit", "Expiration", });
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_PeriodicAllowance_descriptor,
        new java.lang.String[] { "Basic", "Period", "PeriodSpendLimit", "PeriodCanSpend", "PeriodReset", });
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_AllowedMsgAllowance_descriptor,
        new java.lang.String[] { "Allowance", "AllowedMessages", });
    internal_static_cosmos_feegrant_v1beta1_Grant_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_feegrant_v1beta1_Grant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_feegrant_v1beta1_Grant_descriptor,
        new java.lang.String[] { "Granter", "Grantee", "Allowance", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.amino.AminoProto.encoding);
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
