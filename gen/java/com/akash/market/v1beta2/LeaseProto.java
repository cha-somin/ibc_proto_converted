// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/lease.proto

package com.akash.market.v1beta2;

public final class LeaseProto {
  private LeaseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_LeaseID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_LeaseID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_Lease_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_Lease_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_LeaseFilters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_LeaseFilters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCreateLease_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCreateLease_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCreateLeaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCreateLeaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgWithdrawLease_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgWithdrawLease_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgWithdrawLeaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgWithdrawLeaseResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCloseLease_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCloseLease_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_market_v1beta2_MsgCloseLeaseResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_market_v1beta2_MsgCloseLeaseResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n akash/market/v1beta2/lease.proto\022\024akas" +
      "h.market.v1beta2\032\024gogoproto/gogo.proto\032\036" +
      "cosmos/base/v1beta1/coin.proto\032\036akash/ma" +
      "rket/v1beta2/bid.proto\"\240\002\n\007LeaseID\022/\n\005ow" +
      "ner\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"R\005ow" +
      "ner\0223\n\004dseq\030\002 \001(\004B\037\342\336\037\004DSeq\352\336\037\004dseq\362\336\037\013y" +
      "aml:\"dseq\"R\004dseq\0223\n\004gseq\030\003 \001(\rB\037\342\336\037\004GSeq" +
      "\352\336\037\004gseq\362\336\037\013yaml:\"gseq\"R\004gseq\0223\n\004oseq\030\004 " +
      "\001(\rB\037\342\336\037\004OSeq\352\336\037\004oseq\362\336\037\013yaml:\"oseq\"R\004os" +
      "eq\022;\n\010provider\030\005 \001(\tB\037\352\336\037\010provider\362\336\037\017ya" +
      "ml:\"provider\"R\010provider:\010\230\240\037\000\350\240\037\000\"\364\003\n\005Le" +
      "ase\022\\\n\010lease_id\030\001 \001(\0132\035.akash.market.v1b" +
      "eta2.LeaseIDB\"\310\336\037\000\342\336\037\007LeaseID\352\336\037\002id\362\336\037\ty" +
      "aml:\"id\"R\007leaseId\022R\n\005state\030\002 \001(\0162!.akash" +
      ".market.v1beta2.Lease.StateB\031\352\336\037\005state\362\336" +
      "\037\014yaml:\"state\"R\005state\022Q\n\005price\030\003 \001(\0132\034.c" +
      "osmos.base.v1beta1.DecCoinB\035\310\336\037\000\352\336\037\005pric" +
      "e\362\336\037\014yaml:\"price\"R\005price\022\035\n\ncreated_at\030\004" +
      " \001(\003R\tcreatedAt\022\033\n\tclosed_on\030\005 \001(\003R\010clos" +
      "edOn\"\237\001\n\005State\022\"\n\007invalid\020\000\032\025\212\235 \021LeaseSt" +
      "ateInvalid\022\033\n\006active\020\001\032\017\212\235 \013LeaseActive\022" +
      "2\n\022insufficient_funds\020\002\032\032\212\235 \026LeaseInsuff" +
      "icientFunds\022\033\n\006closed\020\003\032\017\212\235 \013LeaseClosed" +
      "\032\004\210\243\036\000:\010\230\240\037\000\350\240\037\000\"\322\002\n\014LeaseFilters\022/\n\005own" +
      "er\030\001 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"R\005own" +
      "er\0223\n\004dseq\030\002 \001(\004B\037\342\336\037\004DSeq\352\336\037\004dseq\362\336\037\013ya" +
      "ml:\"dseq\"R\004dseq\0223\n\004gseq\030\003 \001(\rB\037\342\336\037\004GSeq\352" +
      "\336\037\004gseq\362\336\037\013yaml:\"gseq\"R\004gseq\0223\n\004oseq\030\004 \001" +
      "(\rB\037\342\336\037\004OSeq\352\336\037\004oseq\362\336\037\013yaml:\"oseq\"R\004ose" +
      "q\022;\n\010provider\030\005 \001(\tB\037\352\336\037\010provider\362\336\037\017yam" +
      "l:\"provider\"R\010provider\022/\n\005state\030\006 \001(\tB\031\352" +
      "\336\037\005state\362\336\037\014yaml:\"state\"R\005state:\004\350\240\037\000\"l\n" +
      "\016MsgCreateLease\022T\n\006bid_id\030\001 \001(\0132\033.akash." +
      "market.v1beta2.BidIDB \310\336\037\000\342\336\037\005BidID\352\336\037\002i" +
      "d\362\336\037\tyaml:\"id\"R\005bidId:\004\350\240\037\000\"\030\n\026MsgCreate" +
      "LeaseResponse\"r\n\020MsgWithdrawLease\022X\n\006bid" +
      "_id\030\001 \001(\0132\035.akash.market.v1beta2.LeaseID" +
      "B\"\310\336\037\000\342\336\037\007LeaseID\352\336\037\002id\362\336\037\tyaml:\"id\"R\005bi" +
      "dId:\004\350\240\037\000\"\032\n\030MsgWithdrawLeaseResponse\"s\n" +
      "\rMsgCloseLease\022\\\n\010lease_id\030\001 \001(\0132\035.akash" +
      ".market.v1beta2.LeaseIDB\"\310\336\037\000\342\336\037\007LeaseID" +
      "\352\336\037\002id\362\336\037\tyaml:\"id\"R\007leaseId:\004\350\240\037\000\"\027\n\025Ms" +
      "gCloseLeaseResponseB\323\001\n\030com.akash.market" +
      ".v1beta2B\nLeaseProtoP\001Z9github.com/akash" +
      "-network/akash-api/go/node/market/v1beta" +
      "2\242\002\003AMX\252\002\024Akash.Market.V1beta2\312\002\024Akash\\M" +
      "arket\\V1beta2\342\002 Akash\\Market\\V1beta2\\GPB" +
      "Metadata\352\002\026Akash::Market::V1beta2b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.akash.market.v1beta2.BidProto.getDescriptor(),
        });
    internal_static_akash_market_v1beta2_LeaseID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_market_v1beta2_LeaseID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_LeaseID_descriptor,
        new java.lang.String[] { "Owner", "Dseq", "Gseq", "Oseq", "Provider", });
    internal_static_akash_market_v1beta2_Lease_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_akash_market_v1beta2_Lease_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_Lease_descriptor,
        new java.lang.String[] { "LeaseId", "State", "Price", "CreatedAt", "ClosedOn", });
    internal_static_akash_market_v1beta2_LeaseFilters_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_akash_market_v1beta2_LeaseFilters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_LeaseFilters_descriptor,
        new java.lang.String[] { "Owner", "Dseq", "Gseq", "Oseq", "Provider", "State", });
    internal_static_akash_market_v1beta2_MsgCreateLease_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_akash_market_v1beta2_MsgCreateLease_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCreateLease_descriptor,
        new java.lang.String[] { "BidId", });
    internal_static_akash_market_v1beta2_MsgCreateLeaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_akash_market_v1beta2_MsgCreateLeaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCreateLeaseResponse_descriptor,
        new java.lang.String[] { });
    internal_static_akash_market_v1beta2_MsgWithdrawLease_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_akash_market_v1beta2_MsgWithdrawLease_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgWithdrawLease_descriptor,
        new java.lang.String[] { "BidId", });
    internal_static_akash_market_v1beta2_MsgWithdrawLeaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_akash_market_v1beta2_MsgWithdrawLeaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgWithdrawLeaseResponse_descriptor,
        new java.lang.String[] { });
    internal_static_akash_market_v1beta2_MsgCloseLease_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_akash_market_v1beta2_MsgCloseLease_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCloseLease_descriptor,
        new java.lang.String[] { "LeaseId", });
    internal_static_akash_market_v1beta2_MsgCloseLeaseResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_akash_market_v1beta2_MsgCloseLeaseResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_market_v1beta2_MsgCloseLeaseResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.akash.market.v1beta2.BidProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
