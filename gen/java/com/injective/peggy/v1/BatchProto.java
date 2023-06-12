// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/peggy/v1/batch.proto

package com.injective.peggy.v1;

public final class BatchProto {
  private BatchProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_OutgoingTxBatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_OutgoingTxBatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_injective_peggy_v1_OutgoingTransferTx_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_injective_peggy_v1_OutgoingTransferTx_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036injective/peggy/v1/batch.proto\022\022inject" +
      "ive.peggy.v1\032$injective/peggy/v1/attesta" +
      "tion.proto\"\340\001\n\017OutgoingTxBatch\022\037\n\013batch_" +
      "nonce\030\001 \001(\004R\nbatchNonce\022#\n\rbatch_timeout" +
      "\030\002 \001(\004R\014batchTimeout\022J\n\014transactions\030\003 \003" +
      "(\0132&.injective.peggy.v1.OutgoingTransfer" +
      "TxR\014transactions\022%\n\016token_contract\030\004 \001(\t" +
      "R\rtokenContract\022\024\n\005block\030\005 \001(\004R\005block\"\335\001" +
      "\n\022OutgoingTransferTx\022\016\n\002id\030\001 \001(\004R\002id\022\026\n\006" +
      "sender\030\002 \001(\tR\006sender\022!\n\014dest_address\030\003 \001" +
      "(\tR\013destAddress\022?\n\013erc20_token\030\004 \001(\0132\036.i" +
      "njective.peggy.v1.ERC20TokenR\nerc20Token" +
      "\022;\n\terc20_fee\030\005 \001(\0132\036.injective.peggy.v1" +
      ".ERC20TokenR\010erc20FeeB\333\001\n\026com.injective." +
      "peggy.v1B\nBatchProtoP\001ZKgithub.com/Injec" +
      "tiveLabs/injective-core/injective-chain/" +
      "modules/peggy/types\242\002\003IPX\252\002\022Injective.Pe" +
      "ggy.V1\312\002\022Injective\\Peggy\\V1\342\002\036Injective\\" +
      "Peggy\\V1\\GPBMetadata\352\002\024Injective::Peggy:" +
      ":V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.injective.peggy.v1.AttestationProto.getDescriptor(),
        });
    internal_static_injective_peggy_v1_OutgoingTxBatch_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_injective_peggy_v1_OutgoingTxBatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_OutgoingTxBatch_descriptor,
        new java.lang.String[] { "BatchNonce", "BatchTimeout", "Transactions", "TokenContract", "Block", });
    internal_static_injective_peggy_v1_OutgoingTransferTx_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_injective_peggy_v1_OutgoingTransferTx_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_injective_peggy_v1_OutgoingTransferTx_descriptor,
        new java.lang.String[] { "Id", "Sender", "DestAddress", "Erc20Token", "Erc20Fee", });
    com.injective.peggy.v1.AttestationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
