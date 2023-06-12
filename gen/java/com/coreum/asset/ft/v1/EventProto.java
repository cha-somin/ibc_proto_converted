// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/event.proto

package com.coreum.asset.ft.v1;

public final class EventProto {
  private EventProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coreum_asset_ft_v1_EventIssued_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_asset_ft_v1_EventIssued_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coreum_asset_ft_v1_EventFrozenAmountChanged_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_asset_ft_v1_EventFrozenAmountChanged_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coreum_asset_ft_v1_EventWhitelistedAmountChanged_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_asset_ft_v1_EventWhitelistedAmountChanged_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036coreum/asset/ft/v1/event.proto\022\022coreum" +
      ".asset.ft.v1\032\024gogoproto/gogo.proto\032\036core" +
      "um/asset/ft/v1/token.proto\"\354\003\n\013EventIssu" +
      "ed\022\024\n\005denom\030\001 \001(\tR\005denom\022\026\n\006issuer\030\002 \001(\t" +
      "R\006issuer\022\026\n\006symbol\030\003 \001(\tR\006symbol\022\030\n\007subu" +
      "nit\030\004 \001(\tR\007subunit\022\034\n\tprecision\030\005 \001(\rR\tp" +
      "recision\022U\n\016initial_amount\030\006 \001(\tB.\310\336\037\000\332\336" +
      "\037&github.com/cosmos/cosmos-sdk/types.Int" +
      "R\rinitialAmount\022 \n\013description\030\007 \001(\tR\013de" +
      "scription\0227\n\010features\030\010 \003(\0162\033.coreum.ass" +
      "et.ft.v1.FeatureR\010features\022K\n\tburn_rate\030" +
      "\t \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-" +
      "sdk/types.DecR\010burnRate\022`\n\024send_commissi" +
      "on_rate\030\n \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos" +
      "/cosmos-sdk/types.DecR\022sendCommissionRat" +
      "e\"\372\001\n\030EventFrozenAmountChanged\022\030\n\007accoun" +
      "t\030\001 \001(\tR\007account\022\024\n\005denom\030\002 \001(\tR\005denom\022W" +
      "\n\017previous_amount\030\003 \001(\tB.\310\336\037\000\332\336\037&github." +
      "com/cosmos/cosmos-sdk/types.IntR\016previou" +
      "sAmount\022U\n\016current_amount\030\004 \001(\tB.\310\336\037\000\332\336\037" +
      "&github.com/cosmos/cosmos-sdk/types.IntR" +
      "\rcurrentAmount\"\377\001\n\035EventWhitelistedAmoun" +
      "tChanged\022\030\n\007account\030\001 \001(\tR\007account\022\024\n\005de" +
      "nom\030\002 \001(\tR\005denom\022W\n\017previous_amount\030\003 \001(" +
      "\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.IntR\016previousAmount\022U\n\016current_amo" +
      "unt\030\004 \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.IntR\rcurrentAmountB\304\001\n\026com" +
      ".coreum.asset.ft.v1B\nEventProtoP\001Z3githu" +
      "b.com/CoreumFoundation/coreum/x/asset/ft" +
      "/types\242\002\003CAF\252\002\022Coreum.Asset.Ft.V1\312\002\022Core" +
      "um\\Asset\\Ft\\V1\342\002\036Coreum\\Asset\\Ft\\V1\\GPBM" +
      "etadata\352\002\025Coreum::Asset::Ft::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.coreum.asset.ft.v1.TokenProto.getDescriptor(),
        });
    internal_static_coreum_asset_ft_v1_EventIssued_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_coreum_asset_ft_v1_EventIssued_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_asset_ft_v1_EventIssued_descriptor,
        new java.lang.String[] { "Denom", "Issuer", "Symbol", "Subunit", "Precision", "InitialAmount", "Description", "Features", "BurnRate", "SendCommissionRate", });
    internal_static_coreum_asset_ft_v1_EventFrozenAmountChanged_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_coreum_asset_ft_v1_EventFrozenAmountChanged_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_asset_ft_v1_EventFrozenAmountChanged_descriptor,
        new java.lang.String[] { "Account", "Denom", "PreviousAmount", "CurrentAmount", });
    internal_static_coreum_asset_ft_v1_EventWhitelistedAmountChanged_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_coreum_asset_ft_v1_EventWhitelistedAmountChanged_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_asset_ft_v1_EventWhitelistedAmountChanged_descriptor,
        new java.lang.String[] { "Account", "Denom", "PreviousAmount", "CurrentAmount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.coreum.asset.ft.v1.TokenProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
