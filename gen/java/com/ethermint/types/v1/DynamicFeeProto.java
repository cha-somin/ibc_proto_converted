// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ethermint/types/v1/dynamic_fee.proto

package com.ethermint.types.v1;

public final class DynamicFeeProto {
  private DynamicFeeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ethermint_types_v1_ExtensionOptionDynamicFeeTx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ethermint_types_v1_ExtensionOptionDynamicFeeTx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$ethermint/types/v1/dynamic_fee.proto\022\022" +
      "ethermint.types.v1\032\024gogoproto/gogo.proto" +
      "\"{\n\033ExtensionOptionDynamicFeeTx\022\\\n\022max_p" +
      "riority_price\030\001 \001(\tB.\310\336\037\000\332\336\037&github.com/" +
      "cosmos/cosmos-sdk/types.IntR\020maxPriority" +
      "PriceB\265\001\n\026com.ethermint.types.v1B\017Dynami" +
      "cFeeProtoP\001Z github.com/evmos/evmos/v13/" +
      "types\242\002\003ETX\252\002\022Ethermint.Types.V1\312\002\022Ether" +
      "mint\\Types\\V1\342\002\036Ethermint\\Types\\V1\\GPBMe" +
      "tadata\352\002\024Ethermint::Types::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_ethermint_types_v1_ExtensionOptionDynamicFeeTx_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ethermint_types_v1_ExtensionOptionDynamicFeeTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ethermint_types_v1_ExtensionOptionDynamicFeeTx_descriptor,
        new java.lang.String[] { "MaxPriorityPrice", });
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
