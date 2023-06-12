// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/govshuttle/v1/govshuttle.proto

package com.canto.govshuttle.v1;

public final class GovshuttleProto {
  private GovshuttleProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_Params_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_LendingMarketProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_LendingMarketProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_TreasuryProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_TreasuryProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_TreasuryProposalMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_TreasuryProposalMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_govshuttle_v1_LendingMarketMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_govshuttle_v1_LendingMarketMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$canto/govshuttle/v1/govshuttle.proto\022\023" +
      "canto.govshuttle.v1\032\024gogoproto/gogo.prot" +
      "o\032\031cosmos_proto/cosmos.proto\"\016\n\006Params:\004" +
      "\230\240\037\000\"\331\001\n\025LendingMarketProposal\022\024\n\005title\030" +
      "\001 \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descr" +
      "iption\022F\n\010metadata\030\003 \001(\0132*.canto.govshut" +
      "tle.v1.LendingMarketMetadataR\010metadata:@" +
      "\350\240\037\000\312\264-8github.com/cosmos/cosmos-sdk/x/g" +
      "ov/types/v1beta1.Content\"\327\001\n\020TreasuryPro" +
      "posal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descripti" +
      "on\030\002 \001(\tR\013description\022I\n\010metadata\030\003 \001(\0132" +
      "-.canto.govshuttle.v1.TreasuryProposalMe" +
      "tadataR\010metadata:@\350\240\037\000\312\264-8github.com/cos" +
      "mos/cosmos-sdk/x/gov/types/v1beta1.Conte" +
      "nt\"\204\001\n\030TreasuryProposalMetadata\022\026\n\006PropI" +
      "D\030\001 \001(\004R\006PropID\022\034\n\trecipient\030\002 \001(\tR\treci" +
      "pient\022\026\n\006amount\030\003 \001(\004R\006amount\022\024\n\005denom\030\004" +
      " \001(\tR\005denom:\004\350\240\037\000\"\237\001\n\025LendingMarketMetad" +
      "ata\022\030\n\007Account\030\001 \003(\tR\007Account\022\026\n\006PropId\030" +
      "\002 \001(\004R\006PropId\022\026\n\006values\030\003 \003(\004R\006values\022\034\n" +
      "\tcalldatas\030\004 \003(\tR\tcalldatas\022\036\n\nsignature" +
      "s\030\005 \003(\tR\nsignaturesB\316\001\n\027com.canto.govshu" +
      "ttle.v1B\017GovshuttleProtoP\001Z4github.com/C" +
      "anto-Network/Canto/v6/x/govshuttle/types" +
      "\242\002\003CGX\252\002\023Canto.Govshuttle.V1\312\002\023Canto\\Gov" +
      "shuttle\\V1\342\002\037Canto\\Govshuttle\\V1\\GPBMeta" +
      "data\352\002\025Canto::Govshuttle::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_canto_govshuttle_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_canto_govshuttle_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_Params_descriptor,
        new java.lang.String[] { });
    internal_static_canto_govshuttle_v1_LendingMarketProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_canto_govshuttle_v1_LendingMarketProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_LendingMarketProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Metadata", });
    internal_static_canto_govshuttle_v1_TreasuryProposal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_canto_govshuttle_v1_TreasuryProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_TreasuryProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Metadata", });
    internal_static_canto_govshuttle_v1_TreasuryProposalMetadata_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_canto_govshuttle_v1_TreasuryProposalMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_TreasuryProposalMetadata_descriptor,
        new java.lang.String[] { "PropID", "Recipient", "Amount", "Denom", });
    internal_static_canto_govshuttle_v1_LendingMarketMetadata_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_canto_govshuttle_v1_LendingMarketMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_govshuttle_v1_LendingMarketMetadata_descriptor,
        new java.lang.String[] { "Account", "PropId", "Values", "Calldatas", "Signatures", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
