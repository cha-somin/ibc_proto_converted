// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/savings/v1beta1/query.proto

package com.kava.savings.v1beta1;

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
    internal_static_kava_savings_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_savings_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_savings_v1beta1_QueryDepositsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryDepositsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_savings_v1beta1_QueryDepositsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryDepositsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_savings_v1beta1_QueryTotalSupplyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryTotalSupplyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_kava_savings_v1beta1_QueryTotalSupplyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_kava_savings_v1beta1_QueryTotalSupplyResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n kava/savings/v1beta1/query.proto\022\024kava" +
      ".savings.v1beta1\032*cosmos/base/query/v1be" +
      "ta1/pagination.proto\032\036cosmos/base/v1beta" +
      "1/coin.proto\032\031cosmos_proto/cosmos.proto\032" +
      "\024gogoproto/gogo.proto\032\034google/api/annota" +
      "tions.proto\032 kava/savings/v1beta1/store." +
      "proto\"\024\n\022QueryParamsRequest\"W\n\023QueryPara" +
      "msResponse\022:\n\006params\030\001 \001(\0132\034.kava.saving" +
      "s.v1beta1.ParamsB\004\310\336\037\000R\006params:\004\210\240\037\000\"\244\001\n" +
      "\024QueryDepositsRequest\022\024\n\005denom\030\001 \001(\tR\005de" +
      "nom\022.\n\005owner\030\002 \001(\tB\030\322\264-\024cosmos.AddressSt" +
      "ringR\005owner\022F\n\npagination\030\003 \001(\0132&.cosmos" +
      ".base.query.v1beta1.PageRequestR\npaginat" +
      "ion\"\255\001\n\025QueryDepositsResponse\022K\n\010deposit" +
      "s\030\001 \003(\0132\035.kava.savings.v1beta1.DepositB\020" +
      "\310\336\037\000\252\337\037\010DepositsR\010deposits\022G\n\npagination" +
      "\030\002 \001(\0132\'.cosmos.base.query.v1beta1.PageR" +
      "esponseR\npagination\"\031\n\027QueryTotalSupplyR" +
      "equest\"\227\001\n\030QueryTotalSupplyResponse\022\026\n\006h" +
      "eight\030\001 \001(\003R\006height\022c\n\006result\030\002 \003(\0132\031.co" +
      "smos.base.v1beta1.CoinB0\310\336\037\000\252\337\037(github.c" +
      "om/cosmos/cosmos-sdk/types.CoinsR\006result" +
      "2\266\003\n\005Query\022\203\001\n\006Params\022(.kava.savings.v1b" +
      "eta1.QueryParamsRequest\032).kava.savings.v" +
      "1beta1.QueryParamsResponse\"$\202\323\344\223\002\036\022\034/kav" +
      "a/savings/v1beta1/params\022\213\001\n\010Deposits\022*." +
      "kava.savings.v1beta1.QueryDepositsReques" +
      "t\032+.kava.savings.v1beta1.QueryDepositsRe" +
      "sponse\"&\202\323\344\223\002 \022\036/kava/savings/v1beta1/de" +
      "posits\022\230\001\n\013TotalSupply\022-.kava.savings.v1" +
      "beta1.QueryTotalSupplyRequest\032..kava.sav" +
      "ings.v1beta1.QueryTotalSupplyResponse\"*\202" +
      "\323\344\223\002$\022\"/kava/savings/v1beta1/total_suppl" +
      "yB\303\001\n\030com.kava.savings.v1beta1B\nQueryPro" +
      "toP\001Z)github.com/kava-labs/kava/x/saving" +
      "s/types\242\002\003KSX\252\002\024Kava.Savings.V1beta1\312\002\024K" +
      "ava\\Savings\\V1beta1\342\002 Kava\\Savings\\V1bet" +
      "a1\\GPBMetadata\352\002\026Kava::Savings::V1beta1b" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.kava.savings.v1beta1.StoreProto.getDescriptor(),
        });
    internal_static_kava_savings_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_kava_savings_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_kava_savings_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_kava_savings_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_kava_savings_v1beta1_QueryDepositsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_kava_savings_v1beta1_QueryDepositsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryDepositsRequest_descriptor,
        new java.lang.String[] { "Denom", "Owner", "Pagination", });
    internal_static_kava_savings_v1beta1_QueryDepositsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_kava_savings_v1beta1_QueryDepositsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryDepositsResponse_descriptor,
        new java.lang.String[] { "Deposits", "Pagination", });
    internal_static_kava_savings_v1beta1_QueryTotalSupplyRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_kava_savings_v1beta1_QueryTotalSupplyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryTotalSupplyRequest_descriptor,
        new java.lang.String[] { });
    internal_static_kava_savings_v1beta1_QueryTotalSupplyResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_kava_savings_v1beta1_QueryTotalSupplyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_kava_savings_v1beta1_QueryTotalSupplyResponse_descriptor,
        new java.lang.String[] { "Height", "Result", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.kava.savings.v1beta1.StoreProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
