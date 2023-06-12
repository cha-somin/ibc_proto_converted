// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/pool-incentives/v1beta1/gov.proto

package com.osmosis.poolincentives.v1beta1;

public final class GovProto {
  private GovProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_poolincentives_v1beta1_ReplacePoolIncentivesProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_poolincentives_v1beta1_ReplacePoolIncentivesProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_osmosis_poolincentives_v1beta1_UpdatePoolIncentivesProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_osmosis_poolincentives_v1beta1_UpdatePoolIncentivesProposal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n)osmosis/pool-incentives/v1beta1/gov.pr" +
      "oto\022\036osmosis.poolincentives.v1beta1\032\031cos" +
      "mos_proto/cosmos.proto\032\021amino/amino.prot" +
      "o\032\024gogoproto/gogo.proto\0320osmosis/pool-in" +
      "centives/v1beta1/incentives.proto\"\372\001\n\035Re" +
      "placePoolIncentivesProposal\022\024\n\005title\030\001 \001" +
      "(\tR\005title\022 \n\013description\030\002 \001(\tR\013descript" +
      "ion\022K\n\007records\030\003 \003(\0132+.osmosis.poolincen" +
      "tives.v1beta1.DistrRecordB\004\310\336\037\000R\007records" +
      ":T\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos.gov.v1beta1.Con" +
      "tent\212\347\260*%osmosis/ReplacePoolIncentivesPr" +
      "oposal\"\370\001\n\034UpdatePoolIncentivesProposal\022" +
      "\024\n\005title\030\001 \001(\tR\005title\022 \n\013description\030\002 \001" +
      "(\tR\013description\022K\n\007records\030\003 \003(\0132+.osmos" +
      "is.poolincentives.v1beta1.DistrRecordB\004\310" +
      "\336\037\000R\007records:S\210\240\037\000\230\240\037\000\350\240\037\001\312\264-\032cosmos.gov" +
      ".v1beta1.Content\212\347\260*$osmosis/UpdatePoolI" +
      "ncentivesProposalB\205\002\n\"com.osmosis.poolin" +
      "centives.v1beta1B\010GovProtoP\001Z;github.com" +
      "/osmosis-labs/osmosis/v15/x/pool-incenti" +
      "ves/types\242\002\003OPX\252\002\036Osmosis.Poolincentives" +
      ".V1beta1\312\002\036Osmosis\\Poolincentives\\V1beta" +
      "1\342\002*Osmosis\\Poolincentives\\V1beta1\\GPBMe" +
      "tadata\352\002 Osmosis::Poolincentives::V1beta" +
      "1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.osmosis.poolincentives.v1beta1.IncentivesProto.getDescriptor(),
        });
    internal_static_osmosis_poolincentives_v1beta1_ReplacePoolIncentivesProposal_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_osmosis_poolincentives_v1beta1_ReplacePoolIncentivesProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_poolincentives_v1beta1_ReplacePoolIncentivesProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Records", });
    internal_static_osmosis_poolincentives_v1beta1_UpdatePoolIncentivesProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_osmosis_poolincentives_v1beta1_UpdatePoolIncentivesProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_osmosis_poolincentives_v1beta1_UpdatePoolIncentivesProposal_descriptor,
        new java.lang.String[] { "Title", "Description", "Records", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.osmosis.poolincentives.v1beta1.IncentivesProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
