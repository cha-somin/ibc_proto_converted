// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: evmos/revenue/v1/query.proto

package com.evmos.revenue.v1;

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
    internal_static_evmos_revenue_v1_QueryRevenuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryRevenuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryRevenuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryRevenuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryRevenueRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryRevenueRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryRevenueResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryRevenueResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryDeployerRevenuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034evmos/revenue/v1/query.proto\022\020evmos.re" +
      "venue.v1\032*cosmos/base/query/v1beta1/pagi" +
      "nation.proto\032\036evmos/revenue/v1/genesis.p" +
      "roto\032\036evmos/revenue/v1/revenue.proto\032\024go" +
      "goproto/gogo.proto\032\034google/api/annotatio" +
      "ns.proto\"^\n\024QueryRevenuesRequest\022F\n\npagi" +
      "nation\030\001 \001(\0132&.cosmos.base.query.v1beta1" +
      ".PageRequestR\npagination\"\235\001\n\025QueryRevenu" +
      "esResponse\022;\n\010revenues\030\001 \003(\0132\031.evmos.rev" +
      "enue.v1.RevenueB\004\310\336\037\000R\010revenues\022G\n\npagin" +
      "ation\030\002 \001(\0132\'.cosmos.base.query.v1beta1." +
      "PageResponseR\npagination\"@\n\023QueryRevenue" +
      "Request\022)\n\020contract_address\030\001 \001(\tR\017contr" +
      "actAddress\"Q\n\024QueryRevenueResponse\0229\n\007re" +
      "venue\030\001 \001(\0132\031.evmos.revenue.v1.RevenueB\004" +
      "\310\336\037\000R\007revenue\"\024\n\022QueryParamsRequest\"M\n\023Q" +
      "ueryParamsResponse\0226\n\006params\030\001 \001(\0132\030.evm" +
      "os.revenue.v1.ParamsB\004\310\336\037\000R\006params\"\221\001\n\034Q" +
      "ueryDeployerRevenuesRequest\022)\n\020deployer_" +
      "address\030\001 \001(\tR\017deployerAddress\022F\n\npagina" +
      "tion\030\002 \001(\0132&.cosmos.base.query.v1beta1.P" +
      "ageRequestR\npagination\"\227\001\n\035QueryDeployer" +
      "RevenuesResponse\022-\n\022contract_addresses\030\001" +
      " \003(\tR\021contractAddresses\022G\n\npagination\030\002 " +
      "\001(\0132\'.cosmos.base.query.v1beta1.PageResp" +
      "onseR\npagination\"\227\001\n\036QueryWithdrawerReve" +
      "nuesRequest\022-\n\022withdrawer_address\030\001 \001(\tR" +
      "\021withdrawerAddress\022F\n\npagination\030\002 \001(\0132&" +
      ".cosmos.base.query.v1beta1.PageRequestR\n" +
      "pagination\"\231\001\n\037QueryWithdrawerRevenuesRe" +
      "sponse\022-\n\022contract_addresses\030\001 \003(\tR\021cont" +
      "ractAddresses\022G\n\npagination\030\002 \001(\0132\'.cosm" +
      "os.base.query.v1beta1.PageResponseR\npagi" +
      "nation2\365\005\n\005Query\022\177\n\010Revenues\022&.evmos.rev" +
      "enue.v1.QueryRevenuesRequest\032\'.evmos.rev" +
      "enue.v1.QueryRevenuesResponse\"\"\202\323\344\223\002\034\022\032/" +
      "evmos/revenue/v1/revenues\022\217\001\n\007Revenue\022%." +
      "evmos.revenue.v1.QueryRevenueRequest\032&.e" +
      "vmos.revenue.v1.QueryRevenueResponse\"5\202\323" +
      "\344\223\002/\022-/evmos/revenue/v1/revenues/{contra" +
      "ct_address}\022w\n\006Params\022$.evmos.revenue.v1" +
      ".QueryParamsRequest\032%.evmos.revenue.v1.Q" +
      "ueryParamsResponse\" \202\323\344\223\002\032\022\030/evmos/reven" +
      "ue/v1/params\022\252\001\n\020DeployerRevenues\022..evmo" +
      "s.revenue.v1.QueryDeployerRevenuesReques" +
      "t\032/.evmos.revenue.v1.QueryDeployerRevenu" +
      "esResponse\"5\202\323\344\223\002/\022-/evmos/revenue/v1/re" +
      "venues/{deployer_address}\022\262\001\n\022Withdrawer" +
      "Revenues\0220.evmos.revenue.v1.QueryWithdra" +
      "werRevenuesRequest\0321.evmos.revenue.v1.Qu" +
      "eryWithdrawerRevenuesResponse\"7\202\323\344\223\0021\022//" +
      "evmos/revenue/v1/revenues/{withdrawer_ad" +
      "dress}B\263\001\n\024com.evmos.revenue.v1B\nQueryPr" +
      "otoP\001Z-github.com/evmos/evmos/v13/x/reve" +
      "nue/v1/types\242\002\003ERX\252\002\020Evmos.Revenue.V1\312\002\020" +
      "Evmos\\Revenue\\V1\342\002\034Evmos\\Revenue\\V1\\GPBM" +
      "etadata\352\002\022Evmos::Revenue::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.evmos.revenue.v1.GenesisProto.getDescriptor(),
          com.evmos.revenue.v1.RevenueProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_evmos_revenue_v1_QueryRevenuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_evmos_revenue_v1_QueryRevenuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryRevenuesRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_evmos_revenue_v1_QueryRevenuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_evmos_revenue_v1_QueryRevenuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryRevenuesResponse_descriptor,
        new java.lang.String[] { "Revenues", "Pagination", });
    internal_static_evmos_revenue_v1_QueryRevenueRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_evmos_revenue_v1_QueryRevenueRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryRevenueRequest_descriptor,
        new java.lang.String[] { "ContractAddress", });
    internal_static_evmos_revenue_v1_QueryRevenueResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_evmos_revenue_v1_QueryRevenueResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryRevenueResponse_descriptor,
        new java.lang.String[] { "Revenue", });
    internal_static_evmos_revenue_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_evmos_revenue_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_evmos_revenue_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_evmos_revenue_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryDeployerRevenuesRequest_descriptor,
        new java.lang.String[] { "DeployerAddress", "Pagination", });
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryDeployerRevenuesResponse_descriptor,
        new java.lang.String[] { "ContractAddresses", "Pagination", });
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesRequest_descriptor,
        new java.lang.String[] { "WithdrawerAddress", "Pagination", });
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_evmos_revenue_v1_QueryWithdrawerRevenuesResponse_descriptor,
        new java.lang.String[] { "ContractAddresses", "Pagination", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.evmos.revenue.v1.GenesisProto.getDescriptor();
    com.evmos.revenue.v1.RevenueProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
