// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/feemodel/v1/params.proto

package com.coreum.feemodel.v1;

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
    internal_static_coreum_feemodel_v1_ModelParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_feemodel_v1_ModelParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coreum_feemodel_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coreum_feemodel_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037coreum/feemodel/v1/params.proto\022\022coreu" +
      "m.feemodel.v1\032\031cosmos_proto/cosmos.proto" +
      "\032\024gogoproto/gogo.proto\"\370\005\n\013ModelParams\022v" +
      "\n\021initial_gas_price\030\001 \001(\tBJ\310\336\037\000\332\336\037&githu" +
      "b.com/cosmos/cosmos-sdk/types.Dec\362\336\037\030yam" +
      "l:\"initial_gas_price\"R\017initialGasPrice\022\212" +
      "\001\n\030max_gas_price_multiplier\030\002 \001(\tBQ\310\336\037\000\332" +
      "\336\037&github.com/cosmos/cosmos-sdk/types.De" +
      "c\362\336\037\037yaml:\"max_gas_price_multiplier\"R\025ma" +
      "xGasPriceMultiplier\022h\n\014max_discount\030\003 \001(" +
      "\tBE\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.Dec\362\336\037\023yaml:\"max_discount\"R\013maxDis" +
      "count\022\216\001\n\031escalation_start_fraction\030\004 \001(" +
      "\tBR\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/" +
      "types.Dec\362\336\037 yaml:\"escalation_start_frac" +
      "tion\"R\027escalationStartFraction\022<\n\rmax_bl" +
      "ock_gas\030\005 \001(\003B\030\362\336\037\024yaml:\"max_block_gas\"R" +
      "\013maxBlockGas\022V\n\026short_ema_block_length\030\006" +
      " \001(\rB!\362\336\037\035yaml:\"short_ema_block_length\"R" +
      "\023shortEmaBlockLength\022S\n\025long_ema_block_l" +
      "ength\030\007 \001(\rB \362\336\037\034yaml:\"long_ema_block_le" +
      "ngth\"R\022longEmaBlockLength\"U\n\006Params\022K\n\005m" +
      "odel\030\001 \001(\0132\037.coreum.feemodel.v1.ModelPar" +
      "amsB\024\310\336\037\000\362\336\037\014yaml:\"model\"R\005modelB\304\001\n\026com" +
      ".coreum.feemodel.v1B\013ParamsProtoP\001Z3gith" +
      "ub.com/CoreumFoundation/coreum/x/feemode" +
      "l/types\242\002\003CFX\252\002\022Coreum.Feemodel.V1\312\002\022Cor" +
      "eum\\Feemodel\\V1\342\002\036Coreum\\Feemodel\\V1\\GPB" +
      "Metadata\352\002\024Coreum::Feemodel::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_coreum_feemodel_v1_ModelParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_coreum_feemodel_v1_ModelParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_feemodel_v1_ModelParams_descriptor,
        new java.lang.String[] { "InitialGasPrice", "MaxGasPriceMultiplier", "MaxDiscount", "EscalationStartFraction", "MaxBlockGas", "ShortEmaBlockLength", "LongEmaBlockLength", });
    internal_static_coreum_feemodel_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_coreum_feemodel_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coreum_feemodel_v1_Params_descriptor,
        new java.lang.String[] { "Model", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
