// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sommelier/cellarfees/v1/params.proto

package com.cellarfees.v1;

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
    internal_static_cellarfees_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cellarfees_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$sommelier/cellarfees/v1/params.proto\022\r" +
      "cellarfees.v1\032\024gogoproto/gogo.proto\"\271\002\n\006" +
      "Params\022A\n\035fee_accrual_auction_threshold\030" +
      "\001 \001(\004R\032feeAccrualAuctionThreshold\0224\n\026rew" +
      "ard_emission_period\030\002 \001(\004R\024rewardEmissio" +
      "nPeriod\022m\n\033initial_price_decrease_rate\030\003" +
      " \001(\tB.\310\336\037\000\332\336\037&github.com/cosmos/cosmos-s" +
      "dk/types.DecR\030initialPriceDecreaseRate\022A" +
      "\n\035price_decrease_block_interval\030\004 \001(\004R\032p" +
      "riceDecreaseBlockInterval:\004\230\240\037\000B\251\001\n\021com." +
      "cellarfees.v1B\013ParamsProtoP\001Z2github.com" +
      "/peggyjv/sommelier/v4/x/cellarfees/types" +
      "\242\002\003CXX\252\002\rCellarfees.V1\312\002\rCellarfees\\V1\342\002" +
      "\031Cellarfees\\V1\\GPBMetadata\352\002\016Cellarfees:" +
      ":V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_cellarfees_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cellarfees_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cellarfees_v1_Params_descriptor,
        new java.lang.String[] { "FeeAccrualAuctionThreshold", "RewardEmissionPeriod", "InitialPriceDecreaseRate", "PriceDecreaseBlockInterval", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
