// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bitsong/fantoken/v1beta1/fantoken.proto

package com.bitsong.fantoken.v1beta1;

public final class FantokenProto {
  private FantokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_Metadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_bitsong_fantoken_v1beta1_FanToken_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_bitsong_fantoken_v1beta1_FanToken_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\'bitsong/fantoken/v1beta1/fantoken.prot" +
      "o\022\030bitsong.fantoken.v1beta1\032\036cosmos/base" +
      "/v1beta1/coin.proto\032\024gogoproto/gogo.prot" +
      "o\"o\n\010Metadata\022\022\n\004name\030\001 \001(\tR\004name\022\026\n\006sym" +
      "bol\030\002 \001(\tR\006symbol\022\031\n\003uri\030\003 \001(\tB\007\342\336\037\003URIR" +
      "\003uri\022\034\n\tauthority\030\004 \001(\tR\tauthority\"\201\002\n\010F" +
      "anToken\022\024\n\005denom\030\001 \001(\tR\005denom\022b\n\nmax_sup" +
      "ply\030\002 \001(\tBC\310\336\037\000\332\336\037&github.com/cosmos/cos" +
      "mos-sdk/types.Int\362\336\037\021yaml:\"max_supply\"R\t" +
      "maxSupply\022\026\n\006minter\030\003 \001(\tR\006minter\022Y\n\tmet" +
      "a_data\030\004 \001(\0132\".bitsong.fantoken.v1beta1." +
      "MetadataB\030\310\336\037\000\362\336\037\020yaml:\"meta_data\"R\010meta" +
      "Data:\010\210\240\037\000\230\240\037\000B\353\001\n\034com.bitsong.fantoken." +
      "v1beta1B\rFantokenProtoP\001Z6github.com/bit" +
      "songofficial/go-bitsong/x/fantoken/types" +
      "\242\002\003BFX\252\002\030Bitsong.Fantoken.V1beta1\312\002\030Bits" +
      "ong\\Fantoken\\V1beta1\342\002$Bitsong\\Fantoken\\" +
      "V1beta1\\GPBMetadata\352\002\032Bitsong::Fantoken:" +
      ":V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_bitsong_fantoken_v1beta1_Metadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_bitsong_fantoken_v1beta1_Metadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_Metadata_descriptor,
        new java.lang.String[] { "Name", "Symbol", "Uri", "Authority", });
    internal_static_bitsong_fantoken_v1beta1_FanToken_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_bitsong_fantoken_v1beta1_FanToken_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_bitsong_fantoken_v1beta1_FanToken_descriptor,
        new java.lang.String[] { "Denom", "MaxSupply", "Minter", "MetaData", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.customtype);
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
