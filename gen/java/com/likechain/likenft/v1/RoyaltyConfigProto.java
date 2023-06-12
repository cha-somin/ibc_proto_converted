// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/likenft/v1/royalty_config.proto

package com.likechain.likenft.v1;

public final class RoyaltyConfigProto {
  private RoyaltyConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_RoyaltyConfigByClass_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_RoyaltyConfigByClass_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_RoyaltyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_RoyaltyStakeholder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_RoyaltyStakeholder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_RoyaltyConfigInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_RoyaltyConfigInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_likechain_likenft_v1_RoyaltyStakeholderInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_likechain_likenft_v1_RoyaltyStakeholderInput_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)likechain/likenft/v1/royalty_config.pr" +
      "oto\022\024likechain.likenft.v1\032\024gogoproto/gog" +
      "o.proto\"\203\001\n\024RoyaltyConfigByClass\022\031\n\010clas" +
      "s_id\030\001 \001(\tR\007classId\022P\n\016royalty_config\030\002 " +
      "\001(\0132#.likechain.likenft.v1.RoyaltyConfig" +
      "B\004\310\336\037\000R\rroyaltyConfig\"\217\001\n\rRoyaltyConfig\022" +
      "*\n\021rate_basis_points\030\001 \001(\004R\017rateBasisPoi" +
      "nts\022R\n\014stakeholders\030\002 \003(\0132(.likechain.li" +
      "kenft.v1.RoyaltyStakeholderB\004\310\336\037\000R\014stake" +
      "holders\"y\n\022RoyaltyStakeholder\022K\n\007account" +
      "\030\001 \001(\014B1\372\336\037-github.com/cosmos/cosmos-sdk" +
      "/types.AccAddressR\007account\022\026\n\006weight\030\002 \001" +
      "(\004R\006weight\"\231\001\n\022RoyaltyConfigInput\022*\n\021rat" +
      "e_basis_points\030\001 \001(\004R\017rateBasisPoints\022W\n" +
      "\014stakeholders\030\002 \003(\0132-.likechain.likenft." +
      "v1.RoyaltyStakeholderInputB\004\310\336\037\000R\014stakeh" +
      "olders\"K\n\027RoyaltyStakeholderInput\022\030\n\007acc" +
      "ount\030\001 \001(\tR\007account\022\026\n\006weight\030\002 \001(\004R\006wei" +
      "ghtB\327\001\n\030com.likechain.likenft.v1B\022Royalt" +
      "yConfigProtoP\001Z5github.com/likecoin/like" +
      "coin-chain/v4/x/likenft/types\242\002\003LLX\252\002\024Li" +
      "kechain.Likenft.V1\312\002\024Likechain\\Likenft\\V" +
      "1\342\002 Likechain\\Likenft\\V1\\GPBMetadata\352\002\026L" +
      "ikechain::Likenft::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_likechain_likenft_v1_RoyaltyConfigByClass_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_likechain_likenft_v1_RoyaltyConfigByClass_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_RoyaltyConfigByClass_descriptor,
        new java.lang.String[] { "ClassId", "RoyaltyConfig", });
    internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_likechain_likenft_v1_RoyaltyConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_RoyaltyConfig_descriptor,
        new java.lang.String[] { "RateBasisPoints", "Stakeholders", });
    internal_static_likechain_likenft_v1_RoyaltyStakeholder_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_likechain_likenft_v1_RoyaltyStakeholder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_RoyaltyStakeholder_descriptor,
        new java.lang.String[] { "Account", "Weight", });
    internal_static_likechain_likenft_v1_RoyaltyConfigInput_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_likechain_likenft_v1_RoyaltyConfigInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_RoyaltyConfigInput_descriptor,
        new java.lang.String[] { "RateBasisPoints", "Stakeholders", });
    internal_static_likechain_likenft_v1_RoyaltyStakeholderInput_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_likechain_likenft_v1_RoyaltyStakeholderInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_likechain_likenft_v1_RoyaltyStakeholderInput_descriptor,
        new java.lang.String[] { "Account", "Weight", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.casttype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
