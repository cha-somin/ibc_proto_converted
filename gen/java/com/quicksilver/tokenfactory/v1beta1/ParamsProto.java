// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/tokenfactory/v1beta1/params.proto

package com.quicksilver.tokenfactory.v1beta1;

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
    internal_static_quicksilver_tokenfactory_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_tokenfactory_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-quicksilver/tokenfactory/v1beta1/param" +
      "s.proto\022 quicksilver.tokenfactory.v1beta" +
      "1\032\024gogoproto/gogo.proto\0328quicksilver/tok" +
      "enfactory/v1beta1/authorityMetadata.prot" +
      "o\032\031cosmos_proto/cosmos.proto\032\036cosmos/bas" +
      "e/v1beta1/coin.proto\"\241\001\n\006Params\022\226\001\n\022deno" +
      "m_creation_fee\030\001 \003(\0132\031.cosmos.base.v1bet" +
      "a1.CoinBM\310\336\037\000\362\336\037\031yaml:\"denom_creation_fe" +
      "e\"\252\337\037(github.com/cosmos/cosmos-sdk/types" +
      ".CoinsR\020denomCreationFeeB\222\002\n$com.quicksi" +
      "lver.tokenfactory.v1beta1B\013ParamsProtoP\001" +
      "Z;github.com/ingenuity-build/quicksilver" +
      "/x/tokenfactory/types\242\002\003QTX\252\002 Quicksilve" +
      "r.Tokenfactory.V1beta1\312\002 Quicksilver\\Tok" +
      "enfactory\\V1beta1\342\002,Quicksilver\\Tokenfac" +
      "tory\\V1beta1\\GPBMetadata\352\002\"Quicksilver::" +
      "Tokenfactory::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.quicksilver.tokenfactory.v1beta1.AuthorityMetadataProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_quicksilver_tokenfactory_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quicksilver_tokenfactory_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_tokenfactory_v1beta1_Params_descriptor,
        new java.lang.String[] { "DenomCreationFee", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.quicksilver.tokenfactory.v1beta1.AuthorityMetadataProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
