// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: passage3d/claim/v1beta1/query.proto

package com.passage3d.claim.v1beta1;

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
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryClaimRecordRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryClaimRecordResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryClaimableForActionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryClaimableForActionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryTotalClaimableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_passage3d_claim_v1beta1_QueryTotalClaimableResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#passage3d/claim/v1beta1/query.proto\022\027p" +
      "assage3d.claim.v1beta1\032\024gogoproto/gogo.p" +
      "roto\032\034google/api/annotations.proto\032\036cosm" +
      "os/base/v1beta1/coin.proto\032$passage3d/cl" +
      "aim/v1beta1/params.proto\032*passage3d/clai" +
      "m/v1beta1/claim_record.proto\"\"\n QueryMod" +
      "uleAccountBalanceRequest\"\267\001\n!QueryModule" +
      "AccountBalanceResponse\022\221\001\n\026module_accoun" +
      "t_balance\030\001 \003(\0132\031.cosmos.base.v1beta1.Co" +
      "inB@\310\336\037\000\362\336\037\014yaml:\"coins\"\252\337\037(github.com/c" +
      "osmos/cosmos-sdk/types.CoinsR\024moduleAcco" +
      "untBalance\"\024\n\022QueryParamsRequest\"T\n\023Quer" +
      "yParamsResponse\022=\n\006params\030\001 \001(\0132\037.passag" +
      "e3d.claim.v1beta1.ParamsB\004\310\336\037\000R\006params\"G" +
      "\n\027QueryClaimRecordRequest\022,\n\007address\030\001 \001" +
      "(\tB\022\362\336\037\016yaml:\"address\"R\007address\"\200\001\n\030Quer" +
      "yClaimRecordResponse\022d\n\014claim_record\030\001 \001" +
      "(\0132$.passage3d.claim.v1beta1.ClaimRecord" +
      "B\033\310\336\037\000\362\336\037\023yaml:\"claim_record\"R\013claimReco" +
      "rd\"y\n\036QueryClaimableForActionRequest\022,\n\007" +
      "address\030\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007addre" +
      "ss\022)\n\006action\030\002 \001(\tB\021\362\336\037\ryaml:\"action\"R\006a" +
      "ction\"\226\001\n\037QueryClaimableForActionRespons" +
      "e\022s\n\006amount\030\001 \001(\0132\031.cosmos.base.v1beta1." +
      "CoinB@\310\336\037\000\362\336\037\ryaml:\"amount\"\252\337\037\'github.co" +
      "m/cosmos/cosmos-sdk/types.CoinR\006amount\"J" +
      "\n\032QueryTotalClaimableRequest\022,\n\007address\030" +
      "\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007address\"\220\001\n\033Q" +
      "ueryTotalClaimableResponse\022q\n\005coins\030\001 \003(" +
      "\0132\031.cosmos.base.v1beta1.CoinB@\310\336\037\000\362\336\037\014ya" +
      "ml:\"coins\"\252\337\037(github.com/cosmos/cosmos-s" +
      "dk/types.CoinsR\005coins2\233\007\n\005Query\022\306\001\n\024Modu" +
      "leAccountBalance\0229.passage3d.claim.v1bet" +
      "a1.QueryModuleAccountBalanceRequest\032:.pa" +
      "ssage3d.claim.v1beta1.QueryModuleAccount" +
      "BalanceResponse\"7\202\323\344\223\0021\022//passage3d/clai" +
      "m/v1beta1/module_account_balance\022\214\001\n\006Par" +
      "ams\022+.passage3d.claim.v1beta1.QueryParam" +
      "sRequest\032,.passage3d.claim.v1beta1.Query" +
      "ParamsResponse\"\'\202\323\344\223\002!\022\037/passage3d/claim" +
      "/v1beta1/params\022\253\001\n\013ClaimRecord\0220.passag" +
      "e3d.claim.v1beta1.QueryClaimRecordReques" +
      "t\0321.passage3d.claim.v1beta1.QueryClaimRe" +
      "cordResponse\"7\202\323\344\223\0021\022//passage3d/claim/v" +
      "1beta1/claim_record/{address}\022\321\001\n\022Claima" +
      "bleForAction\0227.passage3d.claim.v1beta1.Q" +
      "ueryClaimableForActionRequest\0328.passage3" +
      "d.claim.v1beta1.QueryClaimableForActionR" +
      "esponse\"H\202\323\344\223\002B\022@/passage3d/claim/v1beta" +
      "1/claimable_for_action/{address}/{action" +
      "}\022\267\001\n\016TotalClaimable\0223.passage3d.claim.v" +
      "1beta1.QueryTotalClaimableRequest\0324.pass" +
      "age3d.claim.v1beta1.QueryTotalClaimableR" +
      "esponse\":\202\323\344\223\0024\0222/passage3d/claim/v1beta" +
      "1/total_claimable/{address}B\323\001\n\033com.pass" +
      "age3d.claim.v1beta1B\nQueryProtoP\001Z*githu" +
      "b.com/envadiv/passage3d/x/claim/types\242\002\003" +
      "PCX\252\002\027Passage3d.Claim.V1beta1\312\002\027Passage3" +
      "d\\Claim\\V1beta1\342\002#Passage3d\\Claim\\V1beta" +
      "1\\GPBMetadata\352\002\031Passage3d::Claim::V1beta" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.passage3d.claim.v1beta1.ParamsProto.getDescriptor(),
          com.passage3d.claim.v1beta1.ClaimRecordProto.getDescriptor(),
        });
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceRequest_descriptor,
        new java.lang.String[] { });
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryModuleAccountBalanceResponse_descriptor,
        new java.lang.String[] { "ModuleAccountBalance", });
    internal_static_passage3d_claim_v1beta1_QueryParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_passage3d_claim_v1beta1_QueryParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_passage3d_claim_v1beta1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_passage3d_claim_v1beta1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryClaimRecordRequest_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_passage3d_claim_v1beta1_QueryClaimRecordResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryClaimRecordResponse_descriptor,
        new java.lang.String[] { "ClaimRecord", });
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryClaimableForActionRequest_descriptor,
        new java.lang.String[] { "Address", "Action", });
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_passage3d_claim_v1beta1_QueryClaimableForActionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryClaimableForActionResponse_descriptor,
        new java.lang.String[] { "Amount", });
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryTotalClaimableRequest_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_passage3d_claim_v1beta1_QueryTotalClaimableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_passage3d_claim_v1beta1_QueryTotalClaimableResponse_descriptor,
        new java.lang.String[] { "Coins", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.passage3d.claim.v1beta1.ParamsProto.getDescriptor();
    com.passage3d.claim.v1beta1.ClaimRecordProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
