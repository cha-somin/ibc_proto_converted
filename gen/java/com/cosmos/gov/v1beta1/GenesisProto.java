// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/genesis.proto

package com.cosmos.gov.v1beta1;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_GenesisState_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/gov/v1beta1/genesis.proto\022\022cosm" +
      "os.gov.v1beta1\032\024gogoproto/gogo.proto\032\034co" +
      "smos/gov/v1beta1/gov.proto\032\021amino/amino." +
      "proto\"\236\004\n\014GenesisState\0220\n\024starting_propo" +
      "sal_id\030\001 \001(\004R\022startingProposalId\022N\n\010depo" +
      "sits\030\002 \003(\0132\033.cosmos.gov.v1beta1.DepositB" +
      "\025\310\336\037\000\252\337\037\010Deposits\250\347\260*\001R\010deposits\022B\n\005vote" +
      "s\030\003 \003(\0132\030.cosmos.gov.v1beta1.VoteB\022\310\336\037\000\252" +
      "\337\037\005Votes\250\347\260*\001R\005votes\022R\n\tproposals\030\004 \003(\0132" +
      "\034.cosmos.gov.v1beta1.ProposalB\026\310\336\037\000\252\337\037\tP" +
      "roposals\250\347\260*\001R\tproposals\022S\n\016deposit_para" +
      "ms\030\005 \001(\0132!.cosmos.gov.v1beta1.DepositPar" +
      "amsB\t\310\336\037\000\250\347\260*\001R\rdepositParams\022P\n\rvoting_" +
      "params\030\006 \001(\0132 .cosmos.gov.v1beta1.Voting" +
      "ParamsB\t\310\336\037\000\250\347\260*\001R\014votingParams\022M\n\014tally" +
      "_params\030\007 \001(\0132\037.cosmos.gov.v1beta1.Tally" +
      "ParamsB\t\310\336\037\000\250\347\260*\001R\013tallyParamsB\302\001\n\026com.c" +
      "osmos.gov.v1beta1B\014GenesisProtoP\001Z0githu" +
      "b.com/cosmos/cosmos-sdk/x/gov/types/v1be" +
      "ta1\242\002\003CGX\252\002\022Cosmos.Gov.V1beta1\312\002\022Cosmos\\" +
      "Gov\\V1beta1\342\002\036Cosmos\\Gov\\V1beta1\\GPBMeta" +
      "data\352\002\024Cosmos::Gov::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.gov.v1beta1.GovProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_gov_v1beta1_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_GenesisState_descriptor,
        new java.lang.String[] { "StartingProposalId", "Deposits", "Votes", "Proposals", "DepositParams", "VotingParams", "TallyParams", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.gov.v1beta1.GovProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
