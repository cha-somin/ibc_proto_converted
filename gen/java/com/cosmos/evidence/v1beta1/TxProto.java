// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/evidence/v1beta1/tx.proto

package com.cosmos.evidence.v1beta1;

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
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n cosmos/evidence/v1beta1/tx.proto\022\027cosm" +
      "os.evidence.v1beta1\032\024gogoproto/gogo.prot" +
      "o\032\031google/protobuf/any.proto\032\031cosmos_pro" +
      "to/cosmos.proto\032\027cosmos/msg/v1/msg.proto" +
      "\032\021amino/amino.proto\"\334\001\n\021MsgSubmitEvidenc" +
      "e\0226\n\tsubmitter\030\001 \001(\tB\030\322\264-\024cosmos.Address" +
      "StringR\tsubmitter\022V\n\010evidence\030\002 \001(\0132\024.go" +
      "ogle.protobuf.AnyB$\312\264- cosmos.evidence.v" +
      "1beta1.EvidenceR\010evidence:7\210\240\037\000\350\240\037\000\202\347\260*\t" +
      "submitter\212\347\260*\034cosmos-sdk/MsgSubmitEviden" +
      "ce\"/\n\031MsgSubmitEvidenceResponse\022\022\n\004hash\030" +
      "\004 \001(\014R\004hash2~\n\003Msg\022p\n\016SubmitEvidence\022*.c" +
      "osmos.evidence.v1beta1.MsgSubmitEvidence" +
      "\0322.cosmos.evidence.v1beta1.MsgSubmitEvid" +
      "enceResponse\032\005\200\347\260*\001B\307\001\n\033com.cosmos.evide" +
      "nce.v1beta1B\007TxProtoP\001Z\035cosmossdk.io/x/e" +
      "vidence/types\242\002\003CEX\252\002\027Cosmos.Evidence.V1" +
      "beta1\312\002\027Cosmos\\Evidence\\V1beta1\342\002#Cosmos" +
      "\\Evidence\\V1beta1\\GPBMetadata\352\002\031Cosmos::" +
      "Evidence::V1beta1\250\342\036\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.msg.v1.MsgProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidence_descriptor,
        new java.lang.String[] { "Submitter", "Evidence", });
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_evidence_v1beta1_MsgSubmitEvidenceResponse_descriptor,
        new java.lang.String[] { "Hash", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos.msg.v1.MsgProto.service);
    registry.add(com.cosmos.msg.v1.MsgProto.signer);
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.equalAll);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.msg.v1.MsgProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
