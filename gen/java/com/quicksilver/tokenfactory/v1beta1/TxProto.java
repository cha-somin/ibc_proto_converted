// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/tokenfactory/v1beta1/tx.proto

package com.quicksilver.tokenfactory.v1beta1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenom_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenom_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenomResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMint_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgMint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMintResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgMintResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurn_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgBurn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurnResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgBurnResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdmin_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdmin_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdminResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdminResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)quicksilver/tokenfactory/v1beta1/tx.pr" +
      "oto\022 quicksilver.tokenfactory.v1beta1\032\024g" +
      "ogoproto/gogo.proto\032\036cosmos/base/v1beta1" +
      "/coin.proto\032\036cosmos/bank/v1beta1/bank.pr" +
      "oto\"l\n\016MsgCreateDenom\022)\n\006sender\030\001 \001(\tB\021\362" +
      "\336\037\ryaml:\"sender\"R\006sender\022/\n\010subdenom\030\002 \001" +
      "(\tB\023\362\336\037\017yaml:\"subdenom\"R\010subdenom\"\\\n\026Msg" +
      "CreateDenomResponse\022B\n\017new_token_denom\030\001" +
      " \001(\tB\032\362\336\037\026yaml:\"new_token_denom\"R\rnewTok" +
      "enDenom\"~\n\007MsgMint\022)\n\006sender\030\001 \001(\tB\021\362\336\037\r" +
      "yaml:\"sender\"R\006sender\022H\n\006amount\030\002 \001(\0132\031." +
      "cosmos.base.v1beta1.CoinB\025\310\336\037\000\362\336\037\ryaml:\"" +
      "amount\"R\006amount\"\021\n\017MsgMintResponse\"~\n\007Ms" +
      "gBurn\022)\n\006sender\030\001 \001(\tB\021\362\336\037\ryaml:\"sender\"" +
      "R\006sender\022H\n\006amount\030\002 \001(\0132\031.cosmos.base.v" +
      "1beta1.CoinB\025\310\336\037\000\362\336\037\ryaml:\"amount\"R\006amou" +
      "nt\"\021\n\017MsgBurnResponse\"\226\001\n\016MsgChangeAdmin" +
      "\022)\n\006sender\030\001 \001(\tB\021\362\336\037\ryaml:\"sender\"R\006sen" +
      "der\022&\n\005denom\030\002 \001(\tB\020\362\336\037\014yaml:\"denom\"R\005de" +
      "nom\0221\n\tnew_admin\030\003 \001(\tB\024\362\336\037\020yaml:\"new_ad" +
      "min\"R\010newAdmin\"\030\n\026MsgChangeAdminResponse" +
      "\"\224\001\n\023MsgSetDenomMetadata\022)\n\006sender\030\001 \001(\t" +
      "B\021\362\336\037\ryaml:\"sender\"R\006sender\022R\n\010metadata\030" +
      "\002 \001(\0132\035.cosmos.bank.v1beta1.MetadataB\027\310\336" +
      "\037\000\362\336\037\017yaml:\"metadata\"R\010metadata\"\035\n\033MsgSe" +
      "tDenomMetadataResponse2\322\004\n\003Msg\022y\n\013Create" +
      "Denom\0220.quicksilver.tokenfactory.v1beta1" +
      ".MsgCreateDenom\0328.quicksilver.tokenfacto" +
      "ry.v1beta1.MsgCreateDenomResponse\022d\n\004Min" +
      "t\022).quicksilver.tokenfactory.v1beta1.Msg" +
      "Mint\0321.quicksilver.tokenfactory.v1beta1." +
      "MsgMintResponse\022d\n\004Burn\022).quicksilver.to" +
      "kenfactory.v1beta1.MsgBurn\0321.quicksilver" +
      ".tokenfactory.v1beta1.MsgBurnResponse\022y\n" +
      "\013ChangeAdmin\0220.quicksilver.tokenfactory." +
      "v1beta1.MsgChangeAdmin\0328.quicksilver.tok" +
      "enfactory.v1beta1.MsgChangeAdminResponse" +
      "\022\210\001\n\020SetDenomMetadata\0225.quicksilver.toke" +
      "nfactory.v1beta1.MsgSetDenomMetadata\032=.q" +
      "uicksilver.tokenfactory.v1beta1.MsgSetDe" +
      "nomMetadataResponseB\216\002\n$com.quicksilver." +
      "tokenfactory.v1beta1B\007TxProtoP\001Z;github." +
      "com/ingenuity-build/quicksilver/x/tokenf" +
      "actory/types\242\002\003QTX\252\002 Quicksilver.Tokenfa" +
      "ctory.V1beta1\312\002 Quicksilver\\Tokenfactory" +
      "\\V1beta1\342\002,Quicksilver\\Tokenfactory\\V1be" +
      "ta1\\GPBMetadata\352\002\"Quicksilver::Tokenfact" +
      "ory::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.bank.v1beta1.BankProto.getDescriptor(),
        });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenom_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenom_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenom_descriptor,
        new java.lang.String[] { "Sender", "Subdenom", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenomResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgCreateDenomResponse_descriptor,
        new java.lang.String[] { "NewTokenDenom", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMint_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMint_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgMint_descriptor,
        new java.lang.String[] { "Sender", "Amount", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMintResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgMintResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgMintResponse_descriptor,
        new java.lang.String[] { });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurn_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurn_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgBurn_descriptor,
        new java.lang.String[] { "Sender", "Amount", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurnResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgBurnResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgBurnResponse_descriptor,
        new java.lang.String[] { });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdmin_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdmin_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdmin_descriptor,
        new java.lang.String[] { "Sender", "Denom", "NewAdmin", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdminResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdminResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgChangeAdminResponse_descriptor,
        new java.lang.String[] { });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadata_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadata_descriptor,
        new java.lang.String[] { "Sender", "Metadata", });
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadataResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_MsgSetDenomMetadataResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.bank.v1beta1.BankProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
