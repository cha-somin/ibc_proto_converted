// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package com.provenance.marker.v1;

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
    internal_static_provenance_marker_v1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAllMarkersRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAllMarkersRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAllMarkersResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAllMarkersResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryMarkerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryMarkerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryMarkerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryHoldingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryHoldingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryHoldingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QuerySupplyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QuerySupplyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QuerySupplyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QuerySupplyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryEscrowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryEscrowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryEscrowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryEscrowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAccessRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAccessRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAccessResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAccessResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryDenomMetadataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryDenomMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryDenomMetadataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAccountDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAccountDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_QueryAccountDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_QueryAccountDataResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_provenance_marker_v1_Balance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_provenance_marker_v1_Balance_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n provenance/marker/v1/query.proto\022\024prov" +
      "enance.marker.v1\032\024gogoproto/gogo.proto\032\031" +
      "google/protobuf/any.proto\032*cosmos/base/q" +
      "uery/v1beta1/pagination.proto\032\036cosmos/ba" +
      "se/v1beta1/coin.proto\032\036cosmos/bank/v1bet" +
      "a1/bank.proto\032\031cosmos_proto/cosmos.proto" +
      "\032\034google/api/annotations.proto\032!provenan" +
      "ce/marker/v1/marker.proto\032&provenance/ma" +
      "rker/v1/accessgrant.proto\"\024\n\022QueryParams" +
      "Request\"Q\n\023QueryParamsResponse\022:\n\006params" +
      "\030\001 \001(\0132\034.provenance.marker.v1.ParamsB\004\310\336" +
      "\037\000R\006params\"\234\001\n\026QueryAllMarkersRequest\022:\n" +
      "\006status\030\001 \001(\0162\".provenance.marker.v1.Mar" +
      "kerStatusR\006status\022F\n\npagination\030\002 \001(\0132&." +
      "cosmos.base.query.v1beta1.PageRequestR\np" +
      "agination\"\246\001\n\027QueryAllMarkersResponse\022B\n" +
      "\007markers\030\001 \003(\0132\024.google.protobuf.AnyB\022\312\264" +
      "-\016MarkerAccountIR\007markers\022G\n\npagination\030" +
      "\002 \001(\0132\'.cosmos.base.query.v1beta1.PageRe" +
      "sponseR\npagination\"$\n\022QueryMarkerRequest" +
      "\022\016\n\002id\030\001 \001(\tR\002id\"W\n\023QueryMarkerResponse\022" +
      "@\n\006marker\030\001 \001(\0132\024.google.protobuf.AnyB\022\312" +
      "\264-\016MarkerAccountIR\006marker\"m\n\023QueryHoldin" +
      "gRequest\022\016\n\002id\030\001 \001(\tR\002id\022F\n\npagination\030\002" +
      " \001(\0132&.cosmos.base.query.v1beta1.PageReq" +
      "uestR\npagination\"\240\001\n\024QueryHoldingRespons" +
      "e\022?\n\010balances\030\001 \003(\0132\035.provenance.marker." +
      "v1.BalanceB\004\310\336\037\000R\010balances\022G\n\npagination" +
      "\030\002 \001(\0132\'.cosmos.base.query.v1beta1.PageR" +
      "esponseR\npagination\"$\n\022QuerySupplyReques" +
      "t\022\016\n\002id\030\001 \001(\tR\002id\"N\n\023QuerySupplyResponse" +
      "\0227\n\006amount\030\001 \001(\0132\031.cosmos.base.v1beta1.C" +
      "oinB\004\310\336\037\000R\006amount\"$\n\022QueryEscrowRequest\022" +
      "\016\n\002id\030\001 \001(\tR\002id\"z\n\023QueryEscrowResponse\022c" +
      "\n\006escrow\030\001 \003(\0132\031.cosmos.base.v1beta1.Coi" +
      "nB0\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/" +
      "types.CoinsR\006escrow\"$\n\022QueryAccessReques" +
      "t\022\016\n\002id\030\001 \001(\tR\002id\"Z\n\023QueryAccessResponse" +
      "\022C\n\010accounts\030\001 \003(\0132!.provenance.marker.v" +
      "1.AccessGrantB\004\310\336\037\000R\010accounts\"1\n\031QueryDe" +
      "nomMetadataRequest\022\024\n\005denom\030\001 \001(\tR\005denom" +
      "\"]\n\032QueryDenomMetadataResponse\022?\n\010metada" +
      "ta\030\001 \001(\0132\035.cosmos.bank.v1beta1.MetadataB" +
      "\004\310\336\037\000R\010metadata\"/\n\027QueryAccountDataReque" +
      "st\022\024\n\005denom\030\001 \001(\tR\005denom\"0\n\030QueryAccount" +
      "DataResponse\022\024\n\005value\030\001 \001(\tR\005value\"\220\001\n\007B" +
      "alance\022\030\n\007address\030\001 \001(\tR\007address\022a\n\005coin" +
      "s\030\002 \003(\0132\031.cosmos.base.v1beta1.CoinB0\310\336\037\000" +
      "\252\337\037(github.com/cosmos/cosmos-sdk/types.C" +
      "oinsR\005coins:\010\210\240\037\000\350\240\037\0002\255\n\n\005Query\022\203\001\n\006Para" +
      "ms\022(.provenance.marker.v1.QueryParamsReq" +
      "uest\032).provenance.marker.v1.QueryParamsR" +
      "esponse\"$\202\323\344\223\002\036\022\034/provenance/marker/v1/p" +
      "arams\022\214\001\n\nAllMarkers\022,.provenance.marker" +
      ".v1.QueryAllMarkersRequest\032-.provenance." +
      "marker.v1.QueryAllMarkersResponse\"!\202\323\344\223\002" +
      "\033\022\031/provenance/marker/v1/all\022\210\001\n\006Marker\022" +
      "(.provenance.marker.v1.QueryMarkerReques" +
      "t\032).provenance.marker.v1.QueryMarkerResp" +
      "onse\")\202\323\344\223\002#\022!/provenance/marker/v1/deta" +
      "il/{id}\022\214\001\n\007Holding\022).provenance.marker." +
      "v1.QueryHoldingRequest\032*.provenance.mark" +
      "er.v1.QueryHoldingResponse\"*\202\323\344\223\002$\022\"/pro" +
      "venance/marker/v1/holding/{id}\022\210\001\n\006Suppl" +
      "y\022(.provenance.marker.v1.QuerySupplyRequ" +
      "est\032).provenance.marker.v1.QuerySupplyRe" +
      "sponse\")\202\323\344\223\002#\022!/provenance/marker/v1/su" +
      "pply/{id}\022\210\001\n\006Escrow\022(.provenance.marker" +
      ".v1.QueryEscrowRequest\032).provenance.mark" +
      "er.v1.QueryEscrowResponse\")\202\323\344\223\002#\022!/prov" +
      "enance/marker/v1/escrow/{id}\022\217\001\n\006Access\022" +
      "(.provenance.marker.v1.QueryAccessReques" +
      "t\032).provenance.marker.v1.QueryAccessResp" +
      "onse\"0\202\323\344\223\002*\022(/provenance/marker/v1/acce" +
      "sscontrol/{id}\022\252\001\n\rDenomMetadata\022/.prove" +
      "nance.marker.v1.QueryDenomMetadataReques" +
      "t\0320.provenance.marker.v1.QueryDenomMetad" +
      "ataResponse\"6\202\323\344\223\0020\022./provenance/marker/" +
      "v1/getdenommetadata/{denom}\022\237\001\n\013AccountD" +
      "ata\022-.provenance.marker.v1.QueryAccountD" +
      "ataRequest\032..provenance.marker.v1.QueryA" +
      "ccountDataResponse\"1\202\323\344\223\002+\022)/provenance/" +
      "marker/v1/accountdata/{denom}B\314\001\n\030com.pr" +
      "ovenance.marker.v1B\nQueryProtoP\001Z2github" +
      ".com/provenance-io/provenance/x/marker/t" +
      "ypes\242\002\003PMX\252\002\024Provenance.Marker.V1\312\002\024Prov" +
      "enance\\Marker\\V1\342\002 Provenance\\Marker\\V1\\" +
      "GPBMetadata\352\002\026Provenance::Marker::V1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmos.bank.v1beta1.BankProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.provenance.marker.v1.MarkerProto.getDescriptor(),
          com.provenance.marker.v1.AccessgrantProto.getDescriptor(),
        });
    internal_static_provenance_marker_v1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_provenance_marker_v1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_provenance_marker_v1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_provenance_marker_v1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_provenance_marker_v1_QueryAllMarkersRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_provenance_marker_v1_QueryAllMarkersRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAllMarkersRequest_descriptor,
        new java.lang.String[] { "Status", "Pagination", });
    internal_static_provenance_marker_v1_QueryAllMarkersResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_provenance_marker_v1_QueryAllMarkersResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAllMarkersResponse_descriptor,
        new java.lang.String[] { "Markers", "Pagination", });
    internal_static_provenance_marker_v1_QueryMarkerRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_provenance_marker_v1_QueryMarkerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryMarkerRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_provenance_marker_v1_QueryMarkerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryMarkerResponse_descriptor,
        new java.lang.String[] { "Marker", });
    internal_static_provenance_marker_v1_QueryHoldingRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_provenance_marker_v1_QueryHoldingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryHoldingRequest_descriptor,
        new java.lang.String[] { "Id", "Pagination", });
    internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_provenance_marker_v1_QueryHoldingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryHoldingResponse_descriptor,
        new java.lang.String[] { "Balances", "Pagination", });
    internal_static_provenance_marker_v1_QuerySupplyRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_provenance_marker_v1_QuerySupplyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QuerySupplyRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_provenance_marker_v1_QuerySupplyResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_provenance_marker_v1_QuerySupplyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QuerySupplyResponse_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_provenance_marker_v1_QueryEscrowRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_provenance_marker_v1_QueryEscrowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryEscrowRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_provenance_marker_v1_QueryEscrowResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_provenance_marker_v1_QueryEscrowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryEscrowResponse_descriptor,
        new java.lang.String[] { "Escrow", });
    internal_static_provenance_marker_v1_QueryAccessRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_provenance_marker_v1_QueryAccessRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAccessRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_provenance_marker_v1_QueryAccessResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_provenance_marker_v1_QueryAccessResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAccessResponse_descriptor,
        new java.lang.String[] { "Accounts", });
    internal_static_provenance_marker_v1_QueryDenomMetadataRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_provenance_marker_v1_QueryDenomMetadataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryDenomMetadataRequest_descriptor,
        new java.lang.String[] { "Denom", });
    internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_provenance_marker_v1_QueryDenomMetadataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor,
        new java.lang.String[] { "Metadata", });
    internal_static_provenance_marker_v1_QueryAccountDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_provenance_marker_v1_QueryAccountDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAccountDataRequest_descriptor,
        new java.lang.String[] { "Denom", });
    internal_static_provenance_marker_v1_QueryAccountDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_provenance_marker_v1_QueryAccountDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_QueryAccountDataResponse_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_provenance_marker_v1_Balance_descriptor =
      getDescriptor().getMessageTypes().get(18);
    internal_static_provenance_marker_v1_Balance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_provenance_marker_v1_Balance_descriptor,
        new java.lang.String[] { "Address", "Coins", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmos.bank.v1beta1.BankProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.provenance.marker.v1.MarkerProto.getDescriptor();
    com.provenance.marker.v1.AccessgrantProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
