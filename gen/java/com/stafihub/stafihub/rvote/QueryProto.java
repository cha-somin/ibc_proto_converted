// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/rvote/query.proto

package com.stafihub.stafihub.rvote;

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
    internal_static_stafihub_stafihub_rvote_QueryGetProposalRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvote_QueryGetProposalRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvote_QueryGetProposalResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvote_QueryGetProposalResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032stafihub/rvote/query.proto\022\027stafihub.s" +
      "tafihub.rvote\032\034google/api/annotations.pr" +
      "oto\"1\n\027QueryGetProposalRequest\022\026\n\006propId" +
      "\030\001 \001(\tR\006propId\"6\n\030QueryGetProposalRespon" +
      "se\022\032\n\010proposal\030\001 \001(\tR\010proposal\"\035\n\033QueryG" +
      "etProposalLifeRequest\"B\n\034QueryGetProposa" +
      "lLifeResponse\022\"\n\014proposalLife\030\001 \001(\003R\014pro" +
      "posalLife2\351\002\n\005Query\022\252\001\n\013GetProposal\0220.st" +
      "afihub.stafihub.rvote.QueryGetProposalRe" +
      "quest\0321.stafihub.stafihub.rvote.QueryGet" +
      "ProposalResponse\"6\202\323\344\223\0020\022./stafihub/staf" +
      "ihub/rvote/get_proposal/{propId}\022\262\001\n\017Get" +
      "ProposalLife\0224.stafihub.stafihub.rvote.Q" +
      "ueryGetProposalLifeRequest\0325.stafihub.st" +
      "afihub.rvote.QueryGetProposalLifeRespons" +
      "e\"2\202\323\344\223\002,\022*/stafihub/stafihub/rvote/get_" +
      "proposal_lifeB\323\001\n\033com.stafihub.stafihub." +
      "rvoteB\nQueryProtoP\001Z*github.com/stafihub" +
      "/stafihub/x/rvote/types\242\002\003SSR\252\002\027Stafihub" +
      ".Stafihub.Rvote\312\002\027Stafihub\\Stafihub\\Rvot" +
      "e\342\002#Stafihub\\Stafihub\\Rvote\\GPBMetadata\352" +
      "\002\031Stafihub::Stafihub::Rvoteb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_stafihub_stafihub_rvote_QueryGetProposalRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_stafihub_stafihub_rvote_QueryGetProposalRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvote_QueryGetProposalRequest_descriptor,
        new java.lang.String[] { "PropId", });
    internal_static_stafihub_stafihub_rvote_QueryGetProposalResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_stafihub_stafihub_rvote_QueryGetProposalResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvote_QueryGetProposalResponse_descriptor,
        new java.lang.String[] { "Proposal", });
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeRequest_descriptor,
        new java.lang.String[] { });
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_stafihub_stafihub_rvote_QueryGetProposalLifeResponse_descriptor,
        new java.lang.String[] { "ProposalLife", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
