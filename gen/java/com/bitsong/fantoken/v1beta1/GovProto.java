// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/gov.proto

package com.bitsong.fantoken.v1beta1;

public final class GovProto {
  private GovProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposalWithDeposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposalWithDeposit_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"bitsong/fantoken/v1beta1/gov.proto\022\030bi" +
      "tsong.fantoken.v1beta1\032\036cosmos/base/v1be" +
      "ta1/coin.proto\032\024gogoproto/gogo.proto\"\306\002\n" +
      "\022UpdateFeesProposal\022\024\n\005title\030\001 \001(\tR\005titl" +
      "e\022 \n\013description\030\002 \001(\tR\013description\022P\n\ti" +
      "ssue_fee\030\003 \001(\0132\031.cosmos.base.v1beta1.Coi" +
      "nB\030\310\336\037\000\362\336\037\020yaml:\"issue_fee\"R\010issueFee\022M\n" +
      "\010mint_fee\030\004 \001(\0132\031.cosmos.base.v1beta1.Co" +
      "inB\027\310\336\037\000\362\336\037\017yaml:\"mint_fee\"R\007mintFee\022M\n\010" +
      "burn_fee\030\005 \001(\0132\031.cosmos.base.v1beta1.Coi" +
      "nB\027\310\336\037\000\362\336\037\017yaml:\"burn_fee\"R\007burnFee:\010\230\240\037" +
      "\000\350\240\037\001\"\312\001\n\035UpdateFeesProposalWithDeposit\022" +
      "\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 \001" +
      "(\tR\013description\022\033\n\tissue_fee\030\003 \001(\tR\010issu" +
      "eFee\022\031\n\010mint_fee\030\004 \001(\tR\007mintFee\022\031\n\010burn_" +
      "fee\030\005 \001(\tR\007burnFee\022\030\n\007deposit\030\007 \001(\tR\007dep" +
      "osit:\004\230\240\037\001B\346\001\n\034com.bitsong.fantoken.v1be" +
      "ta1B\010GovProtoP\001Z6github.com/bitsongoffic" +
      "ial/go-bitsong/x/fantoken/types\242\002\003BFX\252\002\030" +
      "Bitsong.Fantoken.V1beta1\312\002\030Bitsong\\Fanto" +
      "ken\\V1beta1\342\002$Bitsong\\Fantoken\\V1beta1\\G" +
      "PBMetadata\352\002\032Bitsong::Fantoken::V1beta1\310" +
      "\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "IssueFee", "MintFee", "BurnFee", });
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposalWithDeposit_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposalWithDeposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_UpdateFeesProposalWithDeposit_descriptor,
        new java.lang.String[] { "Title", "Description", "IssueFee", "MintFee", "BurnFee", "Deposit", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
