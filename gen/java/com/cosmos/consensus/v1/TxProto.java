// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/consensus/v1/tx.proto

package com.cosmos.consensus.v1;

public final class TxProto {
  private TxProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_consensus_v1_MsgUpdateParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_consensus_v1_MsgUpdateParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_consensus_v1_MsgUpdateParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_consensus_v1_MsgUpdateParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cosmos/consensus/v1/tx.proto\022\023cosmos.c" +
      "onsensus.v1\032\021amino/amino.proto\032\031cosmos_p" +
      "roto/cosmos.proto\032\027cosmos/msg/v1/msg.pro" +
      "to\032\035tendermint/types/params.proto\"\270\002\n\017Ms" +
      "gUpdateParams\0226\n\tauthority\030\001 \001(\tB\030\322\264-\024co" +
      "smos.AddressStringR\tauthority\0223\n\005block\030\002" +
      " \001(\0132\035.tendermint.types.BlockParamsR\005blo" +
      "ck\022<\n\010evidence\030\003 \001(\0132 .tendermint.types." +
      "EvidenceParamsR\010evidence\022?\n\tvalidator\030\004 " +
      "\001(\0132!.tendermint.types.ValidatorParamsR\t" +
      "validator:9\202\347\260*\tauthority\212\347\260*&cosmos-sdk" +
      "/x/consensus/MsgUpdateParams\"\031\n\027MsgUpdat" +
      "eParamsResponse2p\n\003Msg\022b\n\014UpdateParams\022$" +
      ".cosmos.consensus.v1.MsgUpdateParams\032,.c" +
      "osmos.consensus.v1.MsgUpdateParamsRespon" +
      "se\032\005\200\347\260*\001B\300\001\n\027com.cosmos.consensus.v1B\007T" +
      "xProtoP\001Z.github.com/cosmos/cosmos-sdk/x" +
      "/consensus/types\242\002\003CCX\252\002\023Cosmos.Consensu" +
      "s.V1\312\002\023Cosmos\\Consensus\\V1\342\002\037Cosmos\\Cons" +
      "ensus\\V1\\GPBMetadata\352\002\025Cosmos::Consensus" +
      "::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.amino.AminoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.tendermint.types.ParamsProto.getDescriptor(),
        });
    internal_static_cosmos_consensus_v1_MsgUpdateParams_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_consensus_v1_MsgUpdateParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_consensus_v1_MsgUpdateParams_descriptor,
        new java.lang.String[] { "Authority", "Block", "Evidence", "Validator", });
    internal_static_cosmos_consensus_v1_MsgUpdateParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_consensus_v1_MsgUpdateParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_consensus_v1_MsgUpdateParamsResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos.msg.v1.MsgProto.service);
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.amino.AminoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.tendermint.types.ParamsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
