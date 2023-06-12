// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/token/token.proto

package com.irismod.token;

public final class TokenProto {
  private TokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_irismod_token_Token_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irismod_token_Token_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_irismod_token_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_irismod_token_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031irismod/token/token.proto\022\rirismod.tok" +
      "en\032\036cosmos/base/v1beta1/coin.proto\032\024gogo" +
      "proto/gogo.proto\"\255\002\n\005Token\022\026\n\006symbol\030\001 \001" +
      "(\tR\006symbol\022\022\n\004name\030\002 \001(\tR\004name\022\024\n\005scale\030" +
      "\003 \001(\rR\005scale\022.\n\010min_unit\030\004 \001(\tB\023\362\336\037\017yaml" +
      ":\"min_unit\"R\007minUnit\022@\n\016initial_supply\030\005" +
      " \001(\004B\031\362\336\037\025yaml:\"initial_supply\"R\rinitial" +
      "Supply\0224\n\nmax_supply\030\006 \001(\004B\025\362\336\037\021yaml:\"ma" +
      "x_supply\"R\tmaxSupply\022\032\n\010mintable\030\007 \001(\010R\010" +
      "mintable\022\024\n\005owner\030\010 \001(\tR\005owner:\010\210\240\037\000\230\240\037\000" +
      "\"\362\002\n\006Params\022m\n\016token_tax_rate\030\001 \001(\tBG\310\336\037" +
      "\000\332\336\037&github.com/cosmos/cosmos-sdk/types." +
      "Dec\362\336\037\025yaml:\"token_tax_rate\"R\014tokenTaxRa" +
      "te\022o\n\024issue_token_base_fee\030\002 \001(\0132\031.cosmo" +
      "s.base.v1beta1.CoinB#\310\336\037\000\362\336\037\033yaml:\"issue" +
      "_token_base_fee\"R\021issueTokenBaseFee\022~\n\024m" +
      "int_token_fee_ratio\030\003 \001(\tBM\310\336\037\000\332\336\037&githu" +
      "b.com/cosmos/cosmos-sdk/types.Dec\362\336\037\033yam" +
      "l:\"mint_token_fee_ratio\"R\021mintTokenFeeRa" +
      "tio:\010\230\240\037\000\350\240\037\001B\250\001\n\021com.irismod.tokenB\nTok" +
      "enProtoP\001Z.github.com/irisnet/irismod/mo" +
      "dules/token/types\242\002\003ITX\252\002\rIrismod.Token\312" +
      "\002\rIrismod\\Token\342\002\031Irismod\\Token\\GPBMetad" +
      "ata\352\002\016Irismod::Token\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_irismod_token_Token_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_irismod_token_Token_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irismod_token_Token_descriptor,
        new java.lang.String[] { "Symbol", "Name", "Scale", "MinUnit", "InitialSupply", "MaxSupply", "Mintable", "Owner", });
    internal_static_irismod_token_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_irismod_token_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_irismod_token_Params_descriptor,
        new java.lang.String[] { "TokenTaxRate", "IssueTokenBaseFee", "MintTokenFeeRatio", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
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
