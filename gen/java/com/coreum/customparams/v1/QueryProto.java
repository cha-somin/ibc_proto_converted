// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/customparams/v1/query.proto

package com.coreum.customparams.v1;

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
    internal_static_coreum_customparams_v1_QueryStakingParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_customparams_v1_QueryStakingParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coreum_customparams_v1_QueryStakingParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_customparams_v1_QueryStakingParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\"coreum/customparams/v1/query.proto\022\026co" +
      "reum.customparams.v1\032\024gogoproto/gogo.pro" +
      "to\032\034google/api/annotations.proto\032\036cosmos" +
      "/base/v1beta1/coin.proto\032#coreum/customp" +
      "arams/v1/params.proto\"\033\n\031QueryStakingPar" +
      "amsRequest\"a\n\032QueryStakingParamsResponse" +
      "\022C\n\006params\030\001 \001(\0132%.coreum.customparams.v" +
      "1.StakingParamsB\004\310\336\037\000R\006params2\257\001\n\005Query\022" +
      "\245\001\n\rStakingParams\0221.coreum.customparams." +
      "v1.QueryStakingParamsRequest\0322.coreum.cu" +
      "stomparams.v1.QueryStakingParamsResponse" +
      "\"-\202\323\344\223\002\'\022%/coreum/customparams/v1/stakin" +
      "gparamsB\333\001\n\032com.coreum.customparams.v1B\n" +
      "QueryProtoP\001Z7github.com/CoreumFoundatio" +
      "n/coreum/x/customparams/types\242\002\003CCX\252\002\026Co" +
      "reum.Customparams.V1\312\002\026Coreum\\Custompara" +
      "ms\\V1\342\002\"Coreum\\Customparams\\V1\\GPBMetada" +
      "ta\352\002\030Coreum::Customparams::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.coreum.customparams.v1.ParamsProto.getDescriptor(),
        });
    internal_static_coreum_customparams_v1_QueryStakingParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_coreum_customparams_v1_QueryStakingParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_customparams_v1_QueryStakingParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_coreum_customparams_v1_QueryStakingParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_coreum_customparams_v1_QueryStakingParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_customparams_v1_QueryStakingParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.coreum.customparams.v1.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
