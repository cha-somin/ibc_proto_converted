// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kyve/bundles/v1beta1/params.proto

package com.kyve.bundles.v1beta1;

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
    internal_static_kyve_bundles_v1beta1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kyve_bundles_v1beta1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!kyve/bundles/v1beta1/params.proto\022\024kyv" +
      "e.bundles.v1beta1\032\024gogoproto/gogo.proto\"" +
      "\362\001\n\006Params\022%\n\016upload_timeout\030\001 \001(\004R\ruplo" +
      "adTimeout\022Q\n\014storage_cost\030\002 \001(\tB.\310\336\037\000\332\336\037" +
      "&github.com/cosmos/cosmos-sdk/types.DecR" +
      "\013storageCost\022O\n\013network_fee\030\003 \001(\tB.\310\336\037\000\332" +
      "\336\037&github.com/cosmos/cosmos-sdk/types.De" +
      "cR\nnetworkFee\022\035\n\nmax_points\030\004 \001(\004R\tmaxPo" +
      "intsB\307\001\n\030com.kyve.bundles.v1beta1B\013Param" +
      "sProtoP\001Z,github.com/KYVENetwork/chain/x" +
      "/bundles/types\242\002\003KBX\252\002\024Kyve.Bundles.V1be" +
      "ta1\312\002\024Kyve\\Bundles\\V1beta1\342\002 Kyve\\Bundle" +
      "s\\V1beta1\\GPBMetadata\352\002\026Kyve::Bundles::V" +
      "1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_kyve_bundles_v1beta1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kyve_bundles_v1beta1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kyve_bundles_v1beta1_Params_descriptor,
        new java.lang.String[] { "UploadTimeout", "StorageCost", "NetworkFee", "MaxPoints", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
