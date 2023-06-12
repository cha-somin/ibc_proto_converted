// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/asset.proto

package com.comdex.asset.v1beta1;

public final class AssetProto {
  private AssetProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_comdex_asset_v1beta1_Asset_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n comdex/asset/v1beta1/asset.proto\022\024comd" +
      "ex.asset.v1beta1\032\024gogoproto/gogo.proto\"\235" +
      "\003\n\005Asset\022\016\n\002id\030\001 \001(\004R\002id\022#\n\004name\030\002 \001(\tB\017" +
      "\362\336\037\013yaml:\"name\"R\004name\022&\n\005denom\030\003 \001(\tB\020\362\336" +
      "\037\014yaml:\"denom\"R\005denom\022]\n\010decimals\030\004 \001(\tB" +
      "A\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/ty" +
      "pes.Int\362\336\037\017yaml:\"decimals\"R\010decimals\0226\n\013" +
      "is_on_chain\030\005 \001(\010B\026\362\336\037\022yaml:\"is_on_chain" +
      "\"R\tisOnChain\022\\\n\030is_oracle_price_required" +
      "\030\006 \001(\010B#\362\336\037\037yaml:\"is_oracle_price_requir" +
      "ed\"R\025isOraclePriceRequired\022B\n\017is_cdp_min" +
      "table\030\007 \001(\010B\032\362\336\037\026yaml:\"is_cdp_mintable\"R" +
      "\risCdpMintableB\321\001\n\030com.comdex.asset.v1be" +
      "ta1B\nAssetProtoP\001Z/github.com/comdex-off" +
      "icial/comdex/x/asset/types\242\002\003CAX\252\002\024Comde" +
      "x.Asset.V1beta1\312\002\024Comdex\\Asset\\V1beta1\342\002" +
      " Comdex\\Asset\\V1beta1\\GPBMetadata\352\002\026Comd" +
      "ex::Asset::V1beta1\310\341\036\000\250\342\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_comdex_asset_v1beta1_Asset_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_comdex_asset_v1beta1_Asset_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_comdex_asset_v1beta1_Asset_descriptor,
        new java.lang.String[] { "Id", "Name", "Denom", "Decimals", "IsOnChain", "IsOraclePriceRequired", "IsCdpMintable", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
