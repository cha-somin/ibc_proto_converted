// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/oracle/v2alpha2/query.proto

package com.panacea.oracle.v2alpha2;

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
    internal_static_panacea_oracle_v2alpha2_QueryOraclesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOraclesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOraclesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOraclesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleParamsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleParamsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryParamsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#panacea/oracle/v2alpha2/query.proto\022\027p" +
      "anacea.oracle.v2alpha2\032$panacea/oracle/v" +
      "2alpha2/oracle.proto\032%panacea/oracle/v2a" +
      "lpha2/genesis.proto\032*cosmos/base/query/v" +
      "1beta1/pagination.proto\032\034google/api/anno" +
      "tations.proto\032\024gogoproto/gogo.proto\"]\n\023Q" +
      "ueryOraclesRequest\022F\n\npagination\030\001 \001(\0132&" +
      ".cosmos.base.query.v1beta1.PageRequestR\n" +
      "pagination\"\232\001\n\024QueryOraclesResponse\0229\n\007o" +
      "racles\030\001 \003(\0132\037.panacea.oracle.v2alpha2.O" +
      "racleR\007oracles\022G\n\npagination\030\002 \001(\0132\'.cos" +
      "mos.base.query.v1beta1.PageResponseR\npag" +
      "ination\".\n\022QueryOracleRequest\022\030\n\007address" +
      "\030\001 \001(\tR\007address\"N\n\023QueryOracleResponse\0227" +
      "\n\006oracle\030\001 \001(\0132\037.panacea.oracle.v2alpha2" +
      ".OracleR\006oracle\"W\n\036QueryOracleRegistrati" +
      "onRequest\022\033\n\tunique_id\030\001 \001(\tR\010uniqueId\022\030" +
      "\n\007address\030\002 \001(\tR\007address\"\177\n\037QueryOracleR" +
      "egistrationResponse\022\\\n\023oracle_registrati" +
      "on\030\001 \001(\0132+.panacea.oracle.v2alpha2.Oracl" +
      "eRegistrationR\022oracleRegistration\"\232\001\n\"Qu" +
      "eryOracleRegistrationVoteRequest\022\033\n\tuniq" +
      "ue_id\030\001 \001(\tR\010uniqueId\022#\n\rvoter_address\030\002" +
      " \001(\tR\014voterAddress\0222\n\025voting_target_addr" +
      "ess\030\003 \001(\tR\023votingTargetAddress\"\220\001\n#Query" +
      "OracleRegistrationVoteResponse\022i\n\030oracle" +
      "_registration_vote\030\001 \001(\0132/.panacea.oracl" +
      "e.v2alpha2.OracleRegistrationVoteR\026oracl" +
      "eRegistrationVote\"\032\n\030QueryOracleParamsRe" +
      "quest\"N\n\023QueryParamsResponse\0227\n\006params\030\001" +
      " \001(\0132\037.panacea.oracle.v2alpha2.ParamsR\006p" +
      "arams\"\037\n\035QueryOracleUpgradeInfoRequest\"|" +
      "\n\036QueryOracleUpgradeInfoResponse\022Z\n\023orac" +
      "le_upgrade_info\030\001 \001(\0132*.panacea.oracle.v" +
      "2alpha2.OracleUpgradeInfoR\021oracleUpgrade" +
      "Info2\343\010\n\005Query\022\220\001\n\007Oracles\022,.panacea.ora" +
      "cle.v2alpha2.QueryOraclesRequest\032-.panac" +
      "ea.oracle.v2alpha2.QueryOraclesResponse\"" +
      "(\202\323\344\223\002\"\022 /panacea/oracle/v2alpha2/oracle" +
      "s\022\227\001\n\006Oracle\022+.panacea.oracle.v2alpha2.Q" +
      "ueryOracleRequest\032,.panacea.oracle.v2alp" +
      "ha2.QueryOracleResponse\"2\202\323\344\223\002,\022*/panace" +
      "a/oracle/v2alpha2/oracles/{address}\022\324\001\n\022" +
      "OracleRegistration\0227.panacea.oracle.v2al" +
      "pha2.QueryOracleRegistrationRequest\0328.pa" +
      "nacea.oracle.v2alpha2.QueryOracleRegistr" +
      "ationResponse\"K\202\323\344\223\002E\022C/panacea/oracle/v" +
      "2alpha2/oracle_registrations/{unique_id}" +
      "/{address}\022\203\002\n\026OracleRegistrationVote\022;." +
      "panacea.oracle.v2alpha2.QueryOracleRegis" +
      "trationVoteRequest\032<.panacea.oracle.v2al" +
      "pha2.QueryOracleRegistrationVoteResponse" +
      "\"n\202\323\344\223\002h\022f/panacea/oracle/v2alpha2/oracl" +
      "e_registration_votes/{unique_id}/{voting" +
      "_target_address}/{voter_address}\022\222\001\n\006Par" +
      "ams\0221.panacea.oracle.v2alpha2.QueryOracl" +
      "eParamsRequest\032,.panacea.oracle.v2alpha2" +
      ".QueryParamsResponse\"\'\202\323\344\223\002!\022\037/panacea/o" +
      "racle/v2alpha2/params\022\272\001\n\021OracleUpgradeI" +
      "nfo\0226.panacea.oracle.v2alpha2.QueryOracl" +
      "eUpgradeInfoRequest\0327.panacea.oracle.v2a" +
      "lpha2.QueryOracleUpgradeInfoResponse\"4\202\323" +
      "\344\223\002.\022,/panacea/oracle/v2alpha2/oracle_up" +
      "grade_infoB\333\001\n\033com.panacea.oracle.v2alph" +
      "a2B\nQueryProtoP\001Z2github.com/medibloc/pa" +
      "nacea-core/v2/x/oracle/types\242\002\003POX\252\002\027Pan" +
      "acea.Oracle.V2alpha2\312\002\027Panacea\\Oracle\\V2" +
      "alpha2\342\002#Panacea\\Oracle\\V2alpha2\\GPBMeta" +
      "data\352\002\031Panacea::Oracle::V2alpha2b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.panacea.oracle.v2alpha2.OracleProto.getDescriptor(),
          com.panacea.oracle.v2alpha2.GenesisProto.getDescriptor(),
          com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
        });
    internal_static_panacea_oracle_v2alpha2_QueryOraclesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_panacea_oracle_v2alpha2_QueryOraclesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOraclesRequest_descriptor,
        new java.lang.String[] { "Pagination", });
    internal_static_panacea_oracle_v2alpha2_QueryOraclesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_panacea_oracle_v2alpha2_QueryOraclesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOraclesResponse_descriptor,
        new java.lang.String[] { "Oracles", "Pagination", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_panacea_oracle_v2alpha2_QueryOracleRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleRequest_descriptor,
        new java.lang.String[] { "Address", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_panacea_oracle_v2alpha2_QueryOracleResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleResponse_descriptor,
        new java.lang.String[] { "Oracle", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationRequest_descriptor,
        new java.lang.String[] { "UniqueId", "Address", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationResponse_descriptor,
        new java.lang.String[] { "OracleRegistration", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteRequest_descriptor,
        new java.lang.String[] { "UniqueId", "VoterAddress", "VotingTargetAddress", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleRegistrationVoteResponse_descriptor,
        new java.lang.String[] { "OracleRegistrationVote", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleParamsRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_panacea_oracle_v2alpha2_QueryOracleParamsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleParamsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_panacea_oracle_v2alpha2_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_panacea_oracle_v2alpha2_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryParamsResponse_descriptor,
        new java.lang.String[] { "Params", });
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoRequest_descriptor,
        new java.lang.String[] { });
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_panacea_oracle_v2alpha2_QueryOracleUpgradeInfoResponse_descriptor,
        new java.lang.String[] { "OracleUpgradeInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.panacea.oracle.v2alpha2.OracleProto.getDescriptor();
    com.panacea.oracle.v2alpha2.GenesisProto.getDescriptor();
    com.cosmos.base.query.v1beta1.PaginationProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
