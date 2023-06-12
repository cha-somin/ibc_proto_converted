// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/participationrewards/v1/messages.proto

package com.quicksilver.participationrewards.v1;

public final class MessagesProto {
  private MessagesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaim_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_participationrewards_v1_MsgSubmitClaim_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaimResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_quicksilver_participationrewards_v1_MsgSubmitClaimResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n2quicksilver/participationrewards/v1/me" +
      "ssages.proto\022#quicksilver.participationr" +
      "ewards.v1\032\024gogoproto/gogo.proto\032\031cosmos_" +
      "proto/cosmos.proto\032\034google/api/annotatio" +
      "ns.proto\032\035tendermint/crypto/proof.proto\032" +
      ">quicksilver/participationrewards/v1/par" +
      "ticipationrewards.proto\0320quicksilver/cla" +
      "imsmanager/v1/claimsmanager.proto\"\216\002\n\016Ms" +
      "gSubmitClaim\022<\n\014user_address\030\001 \001(\tB\030\322\264-\024" +
      "cosmos.AddressStringR\014user_address\022\022\n\004zo" +
      "ne\030\002 \001(\tR\004zone\022\032\n\010src_zone\030\003 \001(\tR\010src_zo" +
      "ne\022G\n\nclaim_type\030\004 \001(\0162\'.quicksilver.cla" +
      "imsmanager.v1.ClaimTypeR\nclaim_type\022;\n\006p" +
      "roofs\030\005 \003(\0132#.quicksilver.claimsmanager." +
      "v1.ProofR\006proofs:\010\210\240\037\000\350\240\037\000\"\030\n\026MsgSubmitC" +
      "laimResponse2\301\001\n\003Msg\022\271\001\n\013SubmitClaim\0223.q" +
      "uicksilver.participationrewards.v1.MsgSu" +
      "bmitClaim\032;.quicksilver.participationrew" +
      "ards.v1.MsgSubmitClaimResponse\"8\202\323\344\223\0022\"-" +
      "/quicksilver/tx/v1/participationrewards/" +
      "claim:\001*B\253\002\n\'com.quicksilver.participati" +
      "onrewards.v1B\rMessagesProtoP\001ZCgithub.co" +
      "m/ingenuity-build/quicksilver/x/particip" +
      "ationrewards/types\242\002\003QPX\252\002#Quicksilver.P" +
      "articipationrewards.V1\312\002#Quicksilver\\Par" +
      "ticipationrewards\\V1\342\002/Quicksilver\\Parti" +
      "cipationrewards\\V1\\GPBMetadata\352\002%Quicksi" +
      "lver::Participationrewards::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.tendermint.crypto.ProofProto.getDescriptor(),
          com.quicksilver.participationrewards.v1.ParticipationrewardsProto.getDescriptor(),
          com.quicksilver.claimsmanager.v1.ClaimsmanagerProto.getDescriptor(),
        });
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaim_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaim_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_participationrewards_v1_MsgSubmitClaim_descriptor,
        new java.lang.String[] { "UserAddress", "Zone", "SrcZone", "ClaimType", "Proofs", });
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaimResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_quicksilver_participationrewards_v1_MsgSubmitClaimResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_quicksilver_participationrewards_v1_MsgSubmitClaimResponse_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.tendermint.crypto.ProofProto.getDescriptor();
    com.quicksilver.participationrewards.v1.ParticipationrewardsProto.getDescriptor();
    com.quicksilver.claimsmanager.v1.ClaimsmanagerProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
