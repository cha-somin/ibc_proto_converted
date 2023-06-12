// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: canto/fees/v1/query.proto

package com.canto.fees.v1;

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
    internal_static_canto_fees_v1_QueryFeesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryFeesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryFeesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryFeesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryFeeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryFeeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryFeeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryFeeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryDeployerFeesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryDeployerFeesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_canto_fees_v1_QueryDeployerFeesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_canto_fees_v1_QueryDeployerFeesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031canto/fees/v1/query.proto\022\rcanto.fees." +
      "v1\032*cosmos/base/query/v1beta1/pagination" +
      ".proto\032\033canto/fees/v1/genesis.proto\032\030can" +
      "to/fees/v1/fees.proto\032\034google/api/annota" +
      "tions.proto\032\024gogoproto/gogo.proto\"Z\n\020Que" +
      "ryFeesRequest\022F\n\npagination\030\001 \001(\0132&.cosm" +
      "os.base.query.v1beta1.PageRequestR\npagin" +
      "ation\"\212\001\n\021QueryFeesResponse\022,\n\004fees\030\001 \003(" +
      "\0132\022.canto.fees.v1.FeeB\004\310\336\037\000R\004fees\022G\n\npag" +
      "ination\030\002 \001(\0132\'.cosmos.base.query.v1beta" +
      "1.PageResponseR\npagination\"<\n\017QueryFeeRe" +
      "quest\022)\n\020contract_address\030\001 \001(\tR\017contrac" +
      "tAddress\">\n\020QueryFeeResponse\022*\n\003fee\030\001 \001(" +
      "\0132\022.canto.fees.v1.FeeB\004\310\336\037\000R\003fee\"\024\n\022Quer" +
      "yParamsRequest\"J\n\023QueryParamsResponse\0223\n" +
      "\006params\030\001 \001(\0132\025.canto.fees.v1.ParamsB\004\310\336" +
      "\037\000R\006params\"\215\001\n\030QueryDeployerFeesRequest\022" +
      ")\n\020deployer_address\030\001 \001(\tR\017deployerAddre" +
      "ss\022F\n\npagination\030\002 \001(\0132&.cosmos.base.que" +
      "ry.v1beta1.PageRequestR\npagination\"\222\001\n\031Q" +
      "ueryDeployerFeesResponse\022,\n\004fees\030\001 \003(\0132\022" +
      ".canto.fees.v1.FeeB\004\310\336\037\000R\004fees\022G\n\npagina" +
      "tion\030\002 \001(\0132\'.cosmos.base.query.v1beta1.P" +
      "ageResponseR\npagination2\353\003\n\005Query\022f\n\004Fee" +
      "s\022\037.canto.fees.v1.QueryFeesRequest\032 .can" +
      "to.fees.v1.QueryFeesResponse\"\033\202\323\344\223\002\025\022\023/c" +
      "anto/fees/v1/fees\022v\n\003Fee\022\036.canto.fees.v1" +
      ".QueryFeeRequest\032\037.canto.fees.v1.QueryFe" +
      "eResponse\".\202\323\344\223\002(\022&/canto/fees/v1/fees/{" +
      "contract_address}\022n\n\006Params\022!.canto.fees" +
      ".v1.QueryParamsRequest\032\".canto.fees.v1.Q" +
      "ueryParamsResponse\"\035\202\323\344\223\002\027\022\025/canto/fees/" +
      "v1/params\022\221\001\n\014DeployerFees\022\'.canto.fees." +
      "v1.QueryDeployerFeesRequest\032(.canto.fees" +
      ".v1.QueryDeployerFeesResponse\".\202\323\344\223\002(\022&/" +
      "canto/fees/v1/fees/{deployer_address}B\245\001" +
      "\n\021com.canto.fees.v1B\nQueryProtoP\001Z.githu" +
      "b.com/Canto-Network/Canto/v6/x/fees/type" +
      "s\242\002\003CFX\252\002\rCanto.Fees.V1\312\002\rCanto\\Fees\\V1\342" +
      "\002\031Canto\\Fees\\V1\\GPBMetadata\352\002\017Canto::Fee" +
      "s::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.canto.fees.v1.GenesisProto.getDescriptor(),
          com.canto.fees.v1.FeesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_canto_fees_v1_QueryFeesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_canto_fees_v1_QueryFeesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryFeesRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_canto_fees_v1_QueryFeesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_canto_fees_v1_QueryFeesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryFeesResponse_descriptor,
        new java.lang.String[] { "Fees", "Pagination", });
    internal_static_canto_fees_v1_QueryFeeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_canto_fees_v1_QueryFeeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryFeeRequest_descriptor,
        new java.lang.String[] { "ContractAddress", });
    internal_static_canto_fees_v1_QueryFeeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_canto_fees_v1_QueryFeeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryFeeResponse_descriptor,
        new java.lang.String[] { "Fee", });
    internal_static_canto_fees_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_canto_fees_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_canto_fees_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_canto_fees_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_canto_fees_v1_QueryDeployerFeesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_canto_fees_v1_QueryDeployerFeesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryDeployerFeesRequest_descriptor,
        new java.lang.String[] { "DeployerAddress", "Pagination", });
    internal_static_canto_fees_v1_QueryDeployerFeesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_canto_fees_v1_QueryDeployerFeesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_canto_fees_v1_QueryDeployerFeesResponse_descriptor,
        new java.lang.String[] { "Fees", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.canto.fees.v1.GenesisProto.getDescriptor();
    com.canto.fees.v1.FeesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
