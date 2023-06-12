// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/pool.proto

package com.gravity.v1;

public final class PoolProto {
  private PoolProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gravity_v1_IDSet_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gravity_v1_IDSet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gravity_v1_BatchFees_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gravity_v1_BatchFees_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gravity_v1_EventWithdrawalReceived_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gravity_v1_EventWithdrawalReceived_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_gravity_v1_EventWithdrawCanceled_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_gravity_v1_EventWithdrawCanceled_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025gravity/v1/pool.proto\022\ngravity.v1\032\024gog" +
      "oproto/gogo.proto\"\031\n\005IDSet\022\020\n\003ids\030\001 \003(\004R" +
      "\003ids\"\213\001\n\tBatchFees\022\024\n\005token\030\001 \001(\tR\005token" +
      "\022M\n\ntotal_fees\030\002 \001(\tB.\310\336\037\000\332\336\037&github.com" +
      "/cosmos/cosmos-sdk/types.IntR\ttotalFees\022" +
      "\031\n\010tx_count\030\003 \001(\004R\007txCount\"\246\001\n\027EventWith" +
      "drawalReceived\022\'\n\017bridge_contract\030\001 \001(\tR" +
      "\016bridgeContract\022&\n\017bridge_chain_id\030\002 \001(\t" +
      "R\rbridgeChainId\022$\n\016outgoing_tx_id\030\003 \001(\tR" +
      "\014outgoingTxId\022\024\n\005nonce\030\004 \001(\tR\005nonce\"\225\001\n\025" +
      "EventWithdrawCanceled\022\026\n\006sender\030\001 \001(\tR\006s" +
      "ender\022\023\n\005tx_id\030\002 \001(\tR\004txId\022\'\n\017bridge_con" +
      "tract\030\003 \001(\tR\016bridgeContract\022&\n\017bridge_ch" +
      "ain_id\030\004 \001(\tR\rbridgeChainIdB\245\001\n\016com.grav" +
      "ity.v1B\tPoolProtoP\001Z?github.com/Gravity-" +
      "Bridge/Gravity-Bridge/module/x/gravity/t" +
      "ypes\242\002\003GXX\252\002\nGravity.V1\312\002\nGravity\\V1\342\002\026G" +
      "ravity\\V1\\GPBMetadata\352\002\013Gravity::V1b\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_gravity_v1_IDSet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_gravity_v1_IDSet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gravity_v1_IDSet_descriptor,
        new java.lang.String[] { "Ids", });
    internal_static_gravity_v1_BatchFees_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_gravity_v1_BatchFees_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gravity_v1_BatchFees_descriptor,
        new java.lang.String[] { "Token", "TotalFees", "TxCount", });
    internal_static_gravity_v1_EventWithdrawalReceived_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_gravity_v1_EventWithdrawalReceived_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gravity_v1_EventWithdrawalReceived_descriptor,
        new java.lang.String[] { "BridgeContract", "BridgeChainId", "OutgoingTxId", "Nonce", });
    internal_static_gravity_v1_EventWithdrawCanceled_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_gravity_v1_EventWithdrawCanceled_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_gravity_v1_EventWithdrawCanceled_descriptor,
        new java.lang.String[] { "Sender", "TxId", "BridgeContract", "BridgeChainId", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
