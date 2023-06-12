// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/queries/v1/query.proto

package com.em.queries.v1;

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
    internal_static_em_queries_v1_QueryCirculatingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QueryCirculatingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_QueryCirculatingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QueryCirculatingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_QuerySpendableRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QuerySpendableRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_QuerySpendableResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QuerySpendableResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_QueryMissedBlocksRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QueryMissedBlocksRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_QueryMissedBlocksResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_QueryMissedBlocksResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_em_queries_v1_MissedBlocksInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_em_queries_v1_MissedBlocksInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031em/queries/v1/query.proto\022\rem.queries." +
      "v1\032\024gogoproto/gogo.proto\032\036cosmos/base/v1" +
      "beta1/coin.proto\032\034google/api/annotations" +
      ".proto\032\037google/protobuf/timestamp.proto\"" +
      "\031\n\027QueryCirculatingRequest\"\215\001\n\030QueryCirc" +
      "ulatingResponse\022q\n\005total\030\001 \003(\0132\031.cosmos." +
      "base.v1beta1.CoinB@\310\336\037\000\362\336\037\014yaml:\"total\"\252" +
      "\337\037(github.com/cosmos/cosmos-sdk/types.Co" +
      "insR\005total\"E\n\025QuerySpendableRequest\022,\n\007a" +
      "ddress\030\001 \001(\tB\022\362\336\037\016yaml:\"address\"R\007addres" +
      "s\"\221\001\n\026QuerySpendableResponse\022w\n\007balance\030" +
      "\001 \003(\0132\031.cosmos.base.v1beta1.CoinBB\310\336\037\000\362\336" +
      "\037\016yaml:\"balance\"\252\337\037(github.com/cosmos/co" +
      "smos-sdk/types.CoinsR\007balance\"=\n\030QueryMi" +
      "ssedBlocksRequest\022!\n\014cons_address\030\001 \001(\tR" +
      "\013consAddress\"p\n\031QueryMissedBlocksRespons" +
      "e\022S\n\022missed_blocks_info\030\001 \001(\0132\037.em.queri" +
      "es.v1.MissedBlocksInfoB\004\310\336\037\000R\020missedBloc" +
      "ksInfo\"\350\001\n\020MissedBlocksInfo\022!\n\014cons_addr" +
      "ess\030\001 \001(\tR\013consAddress\022T\n\025missed_blocks_" +
      "counter\030\002 \001(\003B \362\336\037\034yaml:\"missed_blocks_c" +
      "ounter\"R\023missedBlocksCounter\022Q\n\024total_bl" +
      "ocks_counter\030\003 \001(\003B\037\362\336\037\033yaml:\"total_bloc" +
      "ks_counter\"R\022totalBlocksCounter:\010\230\240\037\001\350\240\037" +
      "\0012\265\003\n\005Query\022\204\001\n\013Circulating\022&.em.queries" +
      ".v1.QueryCirculatingRequest\032\'.em.queries" +
      ".v1.QueryCirculatingResponse\"$\202\323\344\223\002\036\022\034/e" +
      "-money/bank/v1/circulating\022\233\001\n\014MissedBlo" +
      "cks\022\'.em.queries.v1.QueryMissedBlocksReq" +
      "uest\032(.em.queries.v1.QueryMissedBlocksRe" +
      "sponse\"8\202\323\344\223\0022\0220/e-money/slashing/v1/mis" +
      "sedblocks/{cons_address}\022\206\001\n\tSpendable\022$" +
      ".em.queries.v1.QuerySpendableRequest\032%.e" +
      "m.queries.v1.QuerySpendableResponse\",\202\323\344" +
      "\223\002&\022$/e-money/bank/v1/spendable/{address" +
      "}B\243\001\n\021com.em.queries.v1B\nQueryProtoP\001Z,g" +
      "ithub.com/e-money/em-ledger/x/queries/ty" +
      "pes\242\002\003EQX\252\002\rEm.Queries.V1\312\002\rEm\\Queries\\V" +
      "1\342\002\031Em\\Queries\\V1\\GPBMetadata\352\002\017Em::Quer" +
      "ies::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_em_queries_v1_QueryCirculatingRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_em_queries_v1_QueryCirculatingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QueryCirculatingRequest_descriptor,
        new java.lang.String[] { });
    internal_static_em_queries_v1_QueryCirculatingResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_em_queries_v1_QueryCirculatingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QueryCirculatingResponse_descriptor,
        new java.lang.String[] { "Total", });
    internal_static_em_queries_v1_QuerySpendableRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_em_queries_v1_QuerySpendableRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QuerySpendableRequest_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_em_queries_v1_QuerySpendableResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_em_queries_v1_QuerySpendableResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QuerySpendableResponse_descriptor,
        new java.lang.String[] { "Balance", });
    internal_static_em_queries_v1_QueryMissedBlocksRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_em_queries_v1_QueryMissedBlocksRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QueryMissedBlocksRequest_descriptor,
        new java.lang.String[] { "ConsAddress", });
    internal_static_em_queries_v1_QueryMissedBlocksResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_em_queries_v1_QueryMissedBlocksResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_QueryMissedBlocksResponse_descriptor,
        new java.lang.String[] { "MissedBlocksInfo", });
    internal_static_em_queries_v1_MissedBlocksInfo_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_em_queries_v1_MissedBlocksInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_em_queries_v1_MissedBlocksInfo_descriptor,
        new java.lang.String[] { "ConsAddress", "MissedBlocksCounter", "TotalBlocksCounter", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
