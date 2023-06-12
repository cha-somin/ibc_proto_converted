// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: confio/twasm/v1beta1/proposal.proto

package com.confio.twasm.v1beta1;

public final class ProposalProto {
  private ProposalProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_confio_twasm_v1beta1_DemotePrivilegedContractProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_confio_twasm_v1beta1_DemotePrivilegedContractProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#confio/twasm/v1beta1/proposal.proto\022\024c" +
      "onfio.twasm.v1beta1\032\024gogoproto/gogo.prot" +
      "o\032\036cosmos/base/v1beta1/coin.proto\032\034cosmw" +
      "asm/wasm/v1/types.proto\032\031cosmos_proto/co" +
      "smos.proto\032\031google/protobuf/any.proto\"\270\001" +
      "\n#PromoteToPrivilegedContractProposal\022&\n" +
      "\005title\030\001 \001(\tB\020\362\336\037\014yaml:\"title\"R\005title\0228\n" +
      "\013description\030\002 \001(\tB\026\362\336\037\022yaml:\"descriptio" +
      "n\"R\013description\022/\n\010contract\030\003 \001(\tB\023\362\336\037\017y" +
      "aml:\"contract\"R\010contract\"\265\001\n DemotePrivi" +
      "legedContractProposal\022&\n\005title\030\001 \001(\tB\020\362\336" +
      "\037\014yaml:\"title\"R\005title\0228\n\013description\030\002 \001" +
      "(\tB\026\362\336\037\022yaml:\"description\"R\013description\022" +
      "/\n\010contract\030\003 \001(\tB\023\362\336\037\017yaml:\"contract\"R\010" +
      "contractB\317\001\n\030com.confio.twasm.v1beta1B\rP" +
      "roposalProtoP\001Z&github.com/confio/tgrade" +
      "/x/twasm/types\242\002\003CTX\252\002\024Confio.Twasm.V1be" +
      "ta1\312\002\024Confio\\Twasm\\V1beta1\342\002 Confio\\Twas" +
      "m\\V1beta1\\GPBMetadata\352\002\026Confio::Twasm::V" +
      "1beta1\310\341\036\000\330\341\036\000\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.cosmwasm.wasm.v1.TypesProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_confio_twasm_v1beta1_PromoteToPrivilegedContractProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Contract", });
    internal_static_confio_twasm_v1beta1_DemotePrivilegedContractProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_confio_twasm_v1beta1_DemotePrivilegedContractProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_confio_twasm_v1beta1_DemotePrivilegedContractProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Contract", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.goprotoStringerAll);
    registry.add(com.gogoproto.GogoProto.moretags);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.cosmwasm.wasm.v1.TypesProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
