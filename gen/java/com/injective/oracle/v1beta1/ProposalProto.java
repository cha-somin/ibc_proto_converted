// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/oracle/v1beta1/proposal.proto

package com.injective.oracle.v1beta1;

public final class ProposalProto {
  private ProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_GrantBandOraclePrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_GrantBandOraclePrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_RevokeBandOraclePrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_RevokeBandOraclePrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_GrantPriceFeederPrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_GrantPriceFeederPrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_GrantProviderPrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_GrantProviderPrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_RevokeProviderPrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_RevokeProviderPrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_RevokePriceFeederPrivilegeProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_RevokePriceFeederPrivilegeProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_AuthorizeBandOracleRequestProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_AuthorizeBandOracleRequestProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_UpdateBandOracleRequestProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_UpdateBandOracleRequestProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_oracle_v1beta1_EnableBandIBCProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_oracle_v1beta1_EnableBandIBCProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'injective/oracle/v1beta1/proposal.prot" +
      "o\022\030injective.oracle.v1beta1\032\036cosmos/base" +
      "/v1beta1/coin.proto\032\031cosmos_proto/cosmos" +
      ".proto\032\024gogoproto/gogo.proto\032%injective/" +
      "oracle/v1beta1/oracle.proto\"\236\001\n GrantBan" +
      "dOraclePrivilegeProposal\022\024\n\005title\030\001 \001(\tR" +
      "\005title\022 \n\013description\030\002 \001(\tR\013description" +
      "\022\032\n\010relayers\030\003 \003(\tR\010relayers:&\210\240\037\000\350\240\037\000\312\264" +
      "-\032cosmos.gov.v1beta1.Content\"\237\001\n!RevokeB" +
      "andOraclePrivilegeProposal\022\024\n\005title\030\001 \001(" +
      "\tR\005title\022 \n\013description\030\002 \001(\tR\013descripti" +
      "on\022\032\n\010relayers\030\003 \003(\tR\010relayers:&\210\240\037\000\350\240\037\000" +
      "\312\264-\032cosmos.gov.v1beta1.Content\"\311\001\n!Grant" +
      "PriceFeederPrivilegeProposal\022\024\n\005title\030\001 " +
      "\001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descrip" +
      "tion\022\022\n\004base\030\003 \001(\tR\004base\022\024\n\005quote\030\004 \001(\tR" +
      "\005quote\022\032\n\010relayers\030\005 \003(\tR\010relayers:&\210\240\037\000" +
      "\350\240\037\000\312\264-\032cosmos.gov.v1beta1.Content\"\270\001\n\036G" +
      "rantProviderPrivilegeProposal\022\024\n\005title\030\001" +
      " \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descri" +
      "ption\022\032\n\010provider\030\003 \001(\tR\010provider\022\032\n\010rel" +
      "ayers\030\004 \003(\tR\010relayers:&\210\240\037\000\350\240\037\000\312\264-\032cosmo" +
      "s.gov.v1beta1.Content\"\271\001\n\037RevokeProvider" +
      "PrivilegeProposal\022\024\n\005title\030\001 \001(\tR\005title\022" +
      " \n\013description\030\002 \001(\tR\013description\022\032\n\010pro" +
      "vider\030\003 \001(\tR\010provider\022\032\n\010relayers\030\005 \003(\tR" +
      "\010relayers:&\210\240\037\000\350\240\037\000\312\264-\032cosmos.gov.v1beta" +
      "1.Content\"\312\001\n\"RevokePriceFeederPrivilege" +
      "Proposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descri" +
      "ption\030\002 \001(\tR\013description\022\022\n\004base\030\003 \001(\tR\004" +
      "base\022\024\n\005quote\030\004 \001(\tR\005quote\022\032\n\010relayers\030\005" +
      " \003(\tR\010relayers:&\210\240\037\000\350\240\037\000\312\264-\032cosmos.gov.v" +
      "1beta1.Content\"\321\001\n\"AuthorizeBandOracleRe" +
      "questProposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013d" +
      "escription\030\002 \001(\tR\013description\022K\n\007request" +
      "\030\003 \001(\0132+.injective.oracle.v1beta1.BandOr" +
      "acleRequestB\004\310\336\037\000R\007request:&\210\240\037\000\350\240\037\000\312\264-\032" +
      "cosmos.gov.v1beta1.Content\"\220\002\n\037UpdateBan" +
      "dOracleRequestProposal\022\024\n\005title\030\001 \001(\tR\005t" +
      "itle\022 \n\013description\030\002 \001(\tR\013description\022," +
      "\n\022delete_request_ids\030\003 \003(\004R\020deleteReques" +
      "tIds\022_\n\025update_oracle_request\030\004 \001(\0132+.in" +
      "jective.oracle.v1beta1.BandOracleRequest" +
      "R\023updateOracleRequest:&\210\240\037\000\350\240\037\000\312\264-\032cosmo" +
      "s.gov.v1beta1.Content\"\316\001\n\025EnableBandIBCP" +
      "roposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descrip" +
      "tion\030\002 \001(\tR\013description\022U\n\017band_ibc_para" +
      "ms\030\003 \001(\0132\'.injective.oracle.v1beta1.Band" +
      "IBCParamsB\004\310\336\037\000R\rbandIbcParams:&\210\240\037\000\350\240\037\000" +
      "\312\264-\032cosmos.gov.v1beta1.ContentB\375\001\n\034com.i" +
      "njective.oracle.v1beta1B\rProposalProtoP\001" +
      "ZLgithub.com/InjectiveLabs/injective-cor" +
      "e/injective-chain/modules/oracle/types\242\002" +
      "\003IOX\252\002\030Injective.Oracle.V1beta1\312\002\030Inject" +
      "ive\\Oracle\\V1beta1\342\002$Injective\\Oracle\\V1" +
      "beta1\\GPBMetadata\352\002\032Injective::Oracle::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.injective.oracle.v1beta1.OracleProto.getDescriptor(),
        });
    internal_static_injective_oracle_v1beta1_GrantBandOraclePrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_oracle_v1beta1_GrantBandOraclePrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_GrantBandOraclePrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Relayers", });
    internal_static_injective_oracle_v1beta1_RevokeBandOraclePrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_oracle_v1beta1_RevokeBandOraclePrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_RevokeBandOraclePrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Relayers", });
    internal_static_injective_oracle_v1beta1_GrantPriceFeederPrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_injective_oracle_v1beta1_GrantPriceFeederPrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_GrantPriceFeederPrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Base", "Quote", "Relayers", });
    internal_static_injective_oracle_v1beta1_GrantProviderPrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_injective_oracle_v1beta1_GrantProviderPrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_GrantProviderPrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Provider", "Relayers", });
    internal_static_injective_oracle_v1beta1_RevokeProviderPrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_injective_oracle_v1beta1_RevokeProviderPrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_RevokeProviderPrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Provider", "Relayers", });
    internal_static_injective_oracle_v1beta1_RevokePriceFeederPrivilegeProposal_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_injective_oracle_v1beta1_RevokePriceFeederPrivilegeProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_RevokePriceFeederPrivilegeProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Base", "Quote", "Relayers", });
    internal_static_injective_oracle_v1beta1_AuthorizeBandOracleRequestProposal_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_injective_oracle_v1beta1_AuthorizeBandOracleRequestProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_AuthorizeBandOracleRequestProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Request", });
    internal_static_injective_oracle_v1beta1_UpdateBandOracleRequestProposal_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_injective_oracle_v1beta1_UpdateBandOracleRequestProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_UpdateBandOracleRequestProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "DeleteRequestIds", "UpdateOracleRequest", });
    internal_static_injective_oracle_v1beta1_EnableBandIBCProposal_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_injective_oracle_v1beta1_EnableBandIBCProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_oracle_v1beta1_EnableBandIBCProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "BandIbcParams", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.injective.oracle.v1beta1.OracleProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
