// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/params.proto

package com.comdex.asset.v1beta1;

public final class ParamsProto {
  private ParamsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_comdex_asset_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!comdex/asset/v1beta1/params.proto\022\024com" +
      "dex.asset.v1beta1\032\024gogoproto/gogo.proto\032" +
      "\036cosmos/base/v1beta1/coin.proto\"\211\001\n\006Para" +
      "ms\022\177\n\025asset_regisration_fee\030\006 \001(\0132\031.cosm" +
      "os.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.com" +
      "/cosmos/cosmos-sdk/types.CoinsR\023assetReg" +
      "isrationFeeB\322\001\n\030com.comdex.asset.v1beta1" +
      "B\013ParamsProtoP\001Z/github.com/comdex-offic" +
      "ial/comdex/x/asset/types\242\002\003CAX\252\002\024Comdex." +
      "Asset.V1beta1\312\002\024Comdex\\Asset\\V1beta1\342\002 C" +
      "omdex\\Asset\\V1beta1\\GPBMetadata\352\002\026Comdex" +
      "::Asset::V1beta1\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_comdex_asset_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_comdex_asset_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_comdex_asset_v1beta1_Params_descriptor,
        new java.lang.String[] { "AssetRegisrationFee", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
