// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/group/v1/events.proto

package com.cosmos.group.v1;

public final class EventsProto {
  private EventsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventCreateGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventCreateGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventUpdateGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventUpdateGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventCreateGroupPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventCreateGroupPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventUpdateGroupPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventUpdateGroupPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventSubmitProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventSubmitProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventWithdrawProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventWithdrawProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventVote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventVote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventExec_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventExec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_group_v1_EventLeaveGroup_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_group_v1_EventLeaveGroup_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cosmos/group/v1/events.proto\022\017cosmos.g" +
      "roup.v1\032\031cosmos_proto/cosmos.proto\032\033cosm" +
      "os/group/v1/types.proto\"-\n\020EventCreateGr" +
      "oup\022\031\n\010group_id\030\001 \001(\004R\007groupId\"-\n\020EventU" +
      "pdateGroup\022\031\n\010group_id\030\001 \001(\004R\007groupId\"L\n" +
      "\026EventCreateGroupPolicy\0222\n\007address\030\001 \001(\t" +
      "B\030\322\264-\024cosmos.AddressStringR\007address\"L\n\026E" +
      "ventUpdateGroupPolicy\0222\n\007address\030\001 \001(\tB\030" +
      "\322\264-\024cosmos.AddressStringR\007address\"6\n\023Eve" +
      "ntSubmitProposal\022\037\n\013proposal_id\030\001 \001(\004R\np" +
      "roposalId\"8\n\025EventWithdrawProposal\022\037\n\013pr" +
      "oposal_id\030\001 \001(\004R\nproposalId\",\n\tEventVote" +
      "\022\037\n\013proposal_id\030\001 \001(\004R\nproposalId\"\201\001\n\tEv" +
      "entExec\022\037\n\013proposal_id\030\001 \001(\004R\nproposalId" +
      "\022?\n\006result\030\002 \001(\0162\'.cosmos.group.v1.Propo" +
      "salExecutorResultR\006result\022\022\n\004logs\030\003 \001(\tR" +
      "\004logs\"`\n\017EventLeaveGroup\022\031\n\010group_id\030\001 \001" +
      "(\004R\007groupId\0222\n\007address\030\002 \001(\tB\030\322\264-\024cosmos" +
      ".AddressStringR\007addressB\246\001\n\023com.cosmos.g" +
      "roup.v1B\013EventsProtoP\001Z$github.com/cosmo" +
      "s/cosmos-sdk/x/group\242\002\003CGX\252\002\017Cosmos.Grou" +
      "p.V1\312\002\017Cosmos\\Group\\V1\342\002\033Cosmos\\Group\\V1" +
      "\\GPBMetadata\352\002\021Cosmos::Group::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.cosmos.group.v1.TypesProto.getDescriptor(),
        });
    internal_static_cosmos_group_v1_EventCreateGroup_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_group_v1_EventCreateGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventCreateGroup_descriptor,
        new java.lang.String[] { "GroupId", });
    internal_static_cosmos_group_v1_EventUpdateGroup_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_group_v1_EventUpdateGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventUpdateGroup_descriptor,
        new java.lang.String[] { "GroupId", });
    internal_static_cosmos_group_v1_EventCreateGroupPolicy_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_group_v1_EventCreateGroupPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventCreateGroupPolicy_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_cosmos_group_v1_EventUpdateGroupPolicy_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_group_v1_EventUpdateGroupPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventUpdateGroupPolicy_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_cosmos_group_v1_EventSubmitProposal_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_group_v1_EventSubmitProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventSubmitProposal_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_group_v1_EventWithdrawProposal_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_group_v1_EventWithdrawProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventWithdrawProposal_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_group_v1_EventVote_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_group_v1_EventVote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventVote_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_cosmos_group_v1_EventExec_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_group_v1_EventExec_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventExec_descriptor,
        new java.lang.String[] { "ProposalId", "Result", "Logs", });
    internal_static_cosmos_group_v1_EventLeaveGroup_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_group_v1_EventLeaveGroup_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_group_v1_EventLeaveGroup_descriptor,
        new java.lang.String[] { "GroupId", "Address", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.cosmos.group.v1.TypesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
