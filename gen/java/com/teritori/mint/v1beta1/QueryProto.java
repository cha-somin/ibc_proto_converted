// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: teritori/mint/v1beta1/query.proto

package com.teritori.mint.v1beta1;

public final class QueryProto {
  private QueryProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_teritori_mint_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_teritori_mint_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_teritori_mint_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_teritori_mint_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_teritori_mint_v1beta1_QueryBlockProvisionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_teritori_mint_v1beta1_QueryBlockProvisionsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!teritori/mint/v1beta1/query.proto\022\025ter" +
      "itori.mint.v1beta1\032\024gogoproto/gogo.proto" +
      "\032\034google/api/annotations.proto\032 teritori" +
      "/mint/v1beta1/mint.proto\"\024\n\022QueryParamsR" +
      "equest\"R\n\023QueryParamsResponse\022;\n\006params\030" +
      "\001 \001(\0132\035.teritori.mint.v1beta1.ParamsB\004\310\336" +
      "\037\000R\006params\"\035\n\033QueryBlockProvisionsReques" +
      "t\"y\n\034QueryBlockProvisionsResponse\022Y\n\020blo" +
      "ck_provisions\030\001 \001(\014B.\310\336\037\000\332\336\037&github.com/" +
      "cosmos/cosmos-sdk/types.DecR\017blockProvis" +
      "ions2\276\002\n\005Query\022\206\001\n\006Params\022).teritori.min" +
      "t.v1beta1.QueryParamsRequest\032*.teritori." +
      "mint.v1beta1.QueryParamsResponse\"%\202\323\344\223\002\037" +
      "\022\035/teritori/mint/v1beta1/params\022\253\001\n\017Bloc" +
      "kProvisions\0222.teritori.mint.v1beta1.Quer" +
      "yBlockProvisionsRequest\0323.teritori.mint." +
      "v1beta1.QueryBlockProvisionsResponse\"/\202\323" +
      "\344\223\002)\022\'/teritori/mint/v1beta1/block_provi" +
      "sionsB\316\001\n\031com.teritori.mint.v1beta1B\nQue" +
      "ryProtoP\001Z/github.com/TERITORI/teritori-" +
      "chain/x/mint/types\242\002\003TMX\252\002\025Teritori.Mint" +
      ".V1beta1\312\002\025Teritori\\Mint\\V1beta1\342\002!Terit" +
      "ori\\Mint\\V1beta1\\GPBMetadata\352\002\027Teritori:" +
      ":Mint::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.teritori.mint.v1beta1.MintProto.getDescriptor(),
        });
    internal_static_teritori_mint_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_teritori_mint_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_teritori_mint_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_teritori_mint_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_teritori_mint_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_teritori_mint_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_teritori_mint_v1beta1_QueryBlockProvisionsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_teritori_mint_v1beta1_QueryBlockProvisionsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_teritori_mint_v1beta1_QueryBlockProvisionsResponse_descriptor,
        new java.lang.String[] { "BlockProvisions", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.teritori.mint.v1beta1.MintProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
