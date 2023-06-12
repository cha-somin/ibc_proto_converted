// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/escrow/v1beta2/types.proto

package com.akash.escrow.v1beta2;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_escrow_v1beta2_AccountID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_escrow_v1beta2_AccountID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_escrow_v1beta2_Account_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_escrow_v1beta2_Account_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_escrow_v1beta2_FractionalPayment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_escrow_v1beta2_FractionalPayment_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n akash/escrow/v1beta2/types.proto\022\024akas" +
      "h.escrow.v1beta2\032\024gogoproto/gogo.proto\032\036" +
      "cosmos/base/v1beta1/coin.proto\"l\n\tAccoun" +
      "tID\022/\n\005scope\030\001 \001(\tB\031\352\336\037\005scope\362\336\037\014yaml:\"s" +
      "cope\"R\005scope\022.\n\003xid\030\002 \001(\tB\034\342\336\037\003XID\352\336\037\003xi" +
      "d\362\336\037\nyaml:\"xid\"R\003xid\"\236\006\n\007Account\022N\n\002id\030\001" +
      " \001(\0132\037.akash.escrow.v1beta2.AccountIDB\035\310" +
      "\336\037\000\342\336\037\002ID\352\336\037\002id\362\336\037\tyaml:\"id\"R\002id\022/\n\005owne" +
      "r\030\002 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"R\005owne" +
      "r\022T\n\005state\030\003 \001(\0162#.akash.escrow.v1beta2." +
      "Account.StateB\031\352\336\037\005state\362\336\037\014yaml:\"state\"" +
      "R\005state\022Y\n\007balance\030\004 \001(\0132\034.cosmos.base.v" +
      "1beta1.DecCoinB!\310\336\037\000\352\336\037\007balance\362\336\037\016yaml:" +
      "\"balance\"R\007balance\022i\n\013transferred\030\005 \001(\0132" +
      "\034.cosmos.base.v1beta1.DecCoinB)\310\336\037\000\352\336\037\013t" +
      "ransferred\362\336\037\022yaml:\"transferred\"R\013transf" +
      "erred\022M\n\nsettled_at\030\006 \001(\003B.\342\336\037\tSettledAt" +
      "\352\336\037\tsettledAt\362\336\037\020yaml:\"settledAt\"R\tsettl" +
      "edAt\022?\n\tdepositor\030\007 \001(\tB!\352\336\037\tdepositor\362\336" +
      "\037\020yaml:\"depositor\"R\tdepositor\022Q\n\005funds\030\010" +
      " \001(\0132\034.cosmos.base.v1beta1.DecCoinB\035\310\336\037\000" +
      "\352\336\037\005funds\362\336\037\014yaml:\"funds\"R\005funds\"\222\001\n\005Sta" +
      "te\022$\n\007invalid\020\000\032\027\212\235 \023AccountStateInvalid" +
      "\022\031\n\004open\020\001\032\017\212\235 \013AccountOpen\022\035\n\006closed\020\002\032" +
      "\021\212\235 \rAccountClosed\022#\n\toverdrawn\020\003\032\024\212\235 \020A" +
      "ccountOverdrawn\032\004\210\243\036\000\"\214\006\n\021FractionalPaym" +
      "ent\022r\n\naccount_id\030\001 \001(\0132\037.akash.escrow.v" +
      "1beta2.AccountIDB2\310\336\037\000\342\336\037\tAccountID\352\336\037\ta" +
      "ccountID\362\336\037\020yaml:\"accountID\"R\taccountId\022" +
      "M\n\npayment_id\030\002 \001(\tB.\342\336\037\tPaymentID\352\336\037\tpa" +
      "ymentID\362\336\037\020yaml:\"paymentID\"R\tpaymentId\022/" +
      "\n\005owner\030\003 \001(\tB\031\352\336\037\005owner\362\336\037\014yaml:\"owner\"" +
      "R\005owner\022^\n\005state\030\004 \001(\0162-.akash.escrow.v1" +
      "beta2.FractionalPayment.StateB\031\352\336\037\005state" +
      "\362\336\037\014yaml:\"state\"R\005state\022M\n\004rate\030\005 \001(\0132\034." +
      "cosmos.base.v1beta1.DecCoinB\033\310\336\037\000\352\336\037\004rat" +
      "e\362\336\037\013yaml:\"rate\"R\004rate\022Y\n\007balance\030\006 \001(\0132" +
      "\034.cosmos.base.v1beta1.DecCoinB!\310\336\037\000\352\336\037\007b" +
      "alance\362\336\037\016yaml:\"balance\"R\007balance\022^\n\twit" +
      "hdrawn\030\007 \001(\0132\031.cosmos.base.v1beta1.CoinB" +
      "%\310\336\037\000\352\336\037\twithdrawn\362\336\037\020yaml:\"withdrawn\"R\t" +
      "withdrawn\"\222\001\n\005State\022$\n\007invalid\020\000\032\027\212\235 \023Pa" +
      "ymentStateInvalid\022\031\n\004open\020\001\032\017\212\235 \013Payment" +
      "Open\022\035\n\006closed\020\002\032\021\212\235 \rPaymentClosed\022#\n\to" +
      "verdrawn\020\003\032\024\212\235 \020PaymentOverdrawn\032\004\210\243\036\000:\004" +
      "\230\240\037\001B\323\001\n\030com.akash.escrow.v1beta2B\nTypes" +
      "ProtoP\001Z9github.com/akash-network/akash-" +
      "api/go/node/escrow/v1beta2\242\002\003AEX\252\002\024Akash" +
      ".Escrow.V1beta2\312\002\024Akash\\Escrow\\V1beta2\342\002" +
      " Akash\\Escrow\\V1beta2\\GPBMetadata\352\002\026Akas" +
      "h::Escrow::V1beta2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
        });
    internal_static_akash_escrow_v1beta2_AccountID_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_escrow_v1beta2_AccountID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_escrow_v1beta2_AccountID_descriptor,
        new java.lang.String[] { "Scope", "Xid", });
    internal_static_akash_escrow_v1beta2_Account_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_akash_escrow_v1beta2_Account_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_escrow_v1beta2_Account_descriptor,
        new java.lang.String[] { "Id", "Owner", "State", "Balance", "Transferred", "SettledAt", "Depositor", "Funds", });
    internal_static_akash_escrow_v1beta2_FractionalPayment_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_akash_escrow_v1beta2_FractionalPayment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_escrow_v1beta2_FractionalPayment_descriptor,
        new java.lang.String[] { "AccountId", "PaymentId", "Owner", "State", "Rate", "Balance", "Withdrawn", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
