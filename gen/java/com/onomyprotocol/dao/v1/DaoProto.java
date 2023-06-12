// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: onomyprotocol/dao/v1/dao.proto

package com.onomyprotocol.dao.v1;

public final class DaoProto {
  private DaoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onomyprotocol_dao_v1_FundTreasuryProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onomyprotocol_dao_v1_FundTreasuryProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onomyprotocol_dao_v1_ExchangeWithTreasuryProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onomyprotocol_dao_v1_ExchangeWithTreasuryProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onomyprotocol_dao_v1_CoinsExchangePair_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onomyprotocol_dao_v1_CoinsExchangePair_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_onomyprotocol_dao_v1_FundAccountProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_onomyprotocol_dao_v1_FundAccountProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036onomyprotocol/dao/v1/dao.proto\022\024onomyp" +
      "rotocol.dao.v1\032\024gogoproto/gogo.proto\032\036co" +
      "smos/base/v1beta1/coin.proto\"\352\001\n\024FundTre" +
      "asuryProposal\022\026\n\006sender\030\001 \001(\tR\006sender\022\024\n" +
      "\005title\030\002 \001(\tR\005title\022 \n\013description\030\003 \001(\t" +
      "R\013description\022t\n\006amount\030\004 \003(\0132\031.cosmos.b" +
      "ase.v1beta1.CoinBA\310\336\037\000\362\336\037\ryaml:\"amount\"\252" +
      "\337\037(github.com/cosmos/cosmos-sdk/types.Co" +
      "insR\006amount:\014\210\240\037\000\230\240\037\000\350\240\037\000\"\342\001\n\034ExchangeWi" +
      "thTreasuryProposal\022\026\n\006sender\030\001 \001(\tR\006send" +
      "er\022\024\n\005title\030\002 \001(\tR\005title\022 \n\013description\030" +
      "\003 \001(\tR\013description\022d\n\013coins_pairs\030\004 \003(\0132" +
      "\'.onomyprotocol.dao.v1.CoinsExchangePair" +
      "B\032\310\336\037\000\362\336\037\022yaml:\"coins_pairs\"R\ncoinsPairs" +
      ":\014\210\240\037\000\230\240\037\000\350\240\037\000\"\207\002\n\021CoinsExchangePair\022x\n\010" +
      "coin_ask\030\001 \001(\0132\031.cosmos.base.v1beta1.Coi" +
      "nBB\310\336\037\000\362\336\037\017yaml:\"coin_ask\"\252\337\037\'github.com" +
      "/cosmos/cosmos-sdk/types.CoinR\007coinAsk\022x" +
      "\n\010coin_bid\030\002 \001(\0132\031.cosmos.base.v1beta1.C" +
      "oinBB\310\336\037\000\362\336\037\017yaml:\"coin_bid\"\252\337\037\'github.c" +
      "om/cosmos/cosmos-sdk/types.CoinR\007coinBid" +
      "\"\357\001\n\023FundAccountProposal\022\034\n\trecipient\030\001 " +
      "\001(\tR\trecipient\022\024\n\005title\030\002 \001(\tR\005title\022 \n\013" +
      "description\030\003 \001(\tR\013description\022t\n\006amount" +
      "\030\004 \003(\0132\031.cosmos.base.v1beta1.CoinBA\310\336\037\000\362" +
      "\336\037\ryaml:\"amount\"\252\337\037(github.com/cosmos/co" +
      "smos-sdk/types.CoinsR\006amount:\014\210\240\037\000\230\240\037\000\350\240" +
      "\037\000B\306\001\n\030com.onomyprotocol.dao.v1B\010DaoProt" +
      "oP\001Z*github.com/onomyprotocol/onomy/x/da" +
      "o/types\242\002\003ODX\252\002\024Onomyprotocol.Dao.V1\312\002\024O" +
      "nomyprotocol\\Dao\\V1\342\002 Onomyprotocol\\Dao\\" +
      "V1\\GPBMetadata\352\002\026Onomyprotocol::Dao::V1\250" +
      "\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_onomyprotocol_dao_v1_FundTreasuryProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_onomyprotocol_dao_v1_FundTreasuryProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onomyprotocol_dao_v1_FundTreasuryProposal_descriptor,
        new java.lang.String[] { "Sender", "Title", "Description", "Amount", });
    internal_static_onomyprotocol_dao_v1_ExchangeWithTreasuryProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_onomyprotocol_dao_v1_ExchangeWithTreasuryProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onomyprotocol_dao_v1_ExchangeWithTreasuryProposal_descriptor,
        new java.lang.String[] { "Sender", "Title", "Description", "CoinsPairs", });
    internal_static_onomyprotocol_dao_v1_CoinsExchangePair_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_onomyprotocol_dao_v1_CoinsExchangePair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onomyprotocol_dao_v1_CoinsExchangePair_descriptor,
        new java.lang.String[] { "CoinAsk", "CoinBid", });
    internal_static_onomyprotocol_dao_v1_FundAccountProposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_onomyprotocol_dao_v1_FundAccountProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_onomyprotocol_dao_v1_FundAccountProposal_descriptor,
        new java.lang.String[] { "Recipient", "Title", "Description", "Amount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
