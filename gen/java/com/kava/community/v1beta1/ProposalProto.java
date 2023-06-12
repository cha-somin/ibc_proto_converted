// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/community/v1beta1/proposal.proto

package com.kava.community.v1beta1;

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
    internal_static_kava_community_v1beta1_CommunityPoolLendDepositProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_community_v1beta1_CommunityPoolLendDepositProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_community_v1beta1_CommunityPoolLendWithdrawProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_community_v1beta1_CommunityPoolLendWithdrawProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_community_v1beta1_CommunityCDPRepayDebtProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_community_v1beta1_CommunityCDPRepayDebtProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%kava/community/v1beta1/proposal.proto\022" +
      "\026kava.community.v1beta1\032\036cosmos/base/v1b" +
      "eta1/coin.proto\032\024gogoproto/gogo.proto\"\311\001" +
      "\n CommunityPoolLendDepositProposal\022\024\n\005ti" +
      "tle\030\001 \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013d" +
      "escription\022c\n\006amount\030\003 \003(\0132\031.cosmos.base" +
      ".v1beta1.CoinB0\310\336\037\000\252\337\037(github.com/cosmos" +
      "/cosmos-sdk/types.CoinsR\006amount:\010\210\240\037\000\230\240\037" +
      "\000\"\312\001\n!CommunityPoolLendWithdrawProposal\022" +
      "\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 \001" +
      "(\tR\013description\022c\n\006amount\030\003 \003(\0132\031.cosmos" +
      ".base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com/c" +
      "osmos/cosmos-sdk/types.CoinsR\006amount:\010\210\240" +
      "\037\000\230\240\037\000\"\305\001\n\035CommunityCDPRepayDebtProposal" +
      "\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 " +
      "\001(\tR\013description\022\'\n\017collateral_type\030\003 \001(" +
      "\tR\016collateralType\0229\n\007payment\030\004 \001(\0132\031.cos" +
      "mos.base.v1beta1.CoinB\004\310\336\037\000R\007payment:\010\210\240" +
      "\037\000\230\240\037\000\"\324\001\n&CommunityCDPWithdrawCollatera" +
      "lProposal\022\024\n\005title\030\001 \001(\tR\005title\022 \n\013descr" +
      "iption\030\002 \001(\tR\013description\022\'\n\017collateral_" +
      "type\030\003 \001(\tR\016collateralType\022?\n\ncollateral" +
      "\030\004 \001(\0132\031.cosmos.base.v1beta1.CoinB\004\310\336\037\000R" +
      "\ncollateral:\010\210\240\037\000\230\240\037\000B\322\001\n\032com.kava.commu" +
      "nity.v1beta1B\rProposalProtoP\001Z+github.co" +
      "m/kava-labs/kava/x/community/types\242\002\003KCX" +
      "\252\002\026Kava.Community.V1beta1\312\002\026Kava\\Communi" +
      "ty\\V1beta1\342\002\"Kava\\Community\\V1beta1\\GPBM" +
      "etadata\352\002\030Kava::Community::V1beta1b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_kava_community_v1beta1_CommunityPoolLendDepositProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_community_v1beta1_CommunityPoolLendDepositProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_community_v1beta1_CommunityPoolLendDepositProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Amount", });
    internal_static_kava_community_v1beta1_CommunityPoolLendWithdrawProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kava_community_v1beta1_CommunityPoolLendWithdrawProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_community_v1beta1_CommunityPoolLendWithdrawProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Amount", });
    internal_static_kava_community_v1beta1_CommunityCDPRepayDebtProposal_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kava_community_v1beta1_CommunityCDPRepayDebtProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_community_v1beta1_CommunityCDPRepayDebtProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "CollateralType", "Payment", });
    internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_community_v1beta1_CommunityCDPWithdrawCollateralProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "CollateralType", "Collateral", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
