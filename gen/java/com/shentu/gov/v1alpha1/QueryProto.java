// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/gov/v1alpha1/query.proto

package com.shentu.gov.v1alpha1;

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
    internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shentu_gov_v1alpha1_QueryCertVotedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shentu_gov_v1alpha1_QueryCertVotedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_shentu_gov_v1alpha1_QueryParamsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_shentu_gov_v1alpha1_QueryParamsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037shentu/gov/v1alpha1/query.proto\022\023shent" +
      "u.gov.v1alpha1\032\024gogoproto/gogo.proto\032\034go" +
      "ogle/api/annotations.proto\032\034cosmos/gov/v" +
      "1beta1/gov.proto\032\036cosmos/gov/v1beta1/que" +
      "ry.proto\032\035shentu/gov/v1alpha1/gov.proto\"" +
      "8\n\025QueryCertVotedRequest\022\037\n\013proposal_id\030" +
      "\001 \001(\004R\nproposalId\"7\n\026QueryCertVotedRespo" +
      "nse\022\035\n\ncert_voted\030\001 \001(\010R\tcertVoted\"\312\002\n\023Q" +
      "ueryParamsResponse\022K\n\rvoting_params\030\001 \001(" +
      "\0132 .cosmos.gov.v1beta1.VotingParamsB\004\310\336\037" +
      "\000R\014votingParams\022N\n\016deposit_params\030\002 \001(\0132" +
      "!.cosmos.gov.v1beta1.DepositParamsB\004\310\336\037\000" +
      "R\rdepositParams\022H\n\014tally_params\030\003 \001(\0132\037." +
      "cosmos.gov.v1beta1.TallyParamsB\004\310\336\037\000R\013ta" +
      "llyParams\022L\n\rcustom_params\030\004 \001(\0132!.shent" +
      "u.gov.v1alpha1.CustomParamsB\004\310\336\037\000R\014custo" +
      "mParams2\363\n\n\005Query\022\224\001\n\010Proposal\022(.cosmos." +
      "gov.v1beta1.QueryProposalRequest\032).cosmo" +
      "s.gov.v1beta1.QueryProposalResponse\"3\202\323\344" +
      "\223\002-\022+/cosmos/gov/v1beta1/proposals/{prop" +
      "osal_id}\022\211\001\n\tProposals\022).cosmos.gov.v1be" +
      "ta1.QueryProposalsRequest\032*.cosmos.gov.v" +
      "1beta1.QueryProposalsResponse\"%\202\323\344\223\002\037\022\035/" +
      "cosmos/gov/v1beta1/proposals\022\226\001\n\004Vote\022$." +
      "cosmos.gov.v1beta1.QueryVoteRequest\032%.co" +
      "smos.gov.v1beta1.QueryVoteResponse\"A\202\323\344\223" +
      "\002;\0229/cosmos/gov/v1beta1/proposals/{propo" +
      "sal_id}/votes/{voter}\022\221\001\n\005Votes\022%.cosmos" +
      ".gov.v1beta1.QueryVotesRequest\032&.cosmos." +
      "gov.v1beta1.QueryVotesResponse\"9\202\323\344\223\0023\0221" +
      "/cosmos/gov/v1beta1/proposals/{proposal_" +
      "id}/votes\022\214\001\n\006Params\022&.cosmos.gov.v1beta" +
      "1.QueryParamsRequest\032(.shentu.gov.v1alph" +
      "a1.QueryParamsResponse\"0\202\323\344\223\002*\022(/cosmos/" +
      "gov/v1beta1/params/{params_type}\022\246\001\n\007Dep" +
      "osit\022\'.cosmos.gov.v1beta1.QueryDepositRe" +
      "quest\032(.cosmos.gov.v1beta1.QueryDepositR" +
      "esponse\"H\202\323\344\223\002B\022@/cosmos/gov/v1beta1/pro" +
      "posals/{proposal_id}/deposits/{depositor" +
      "}\022\235\001\n\010Deposits\022(.cosmos.gov.v1beta1.Quer" +
      "yDepositsRequest\032).cosmos.gov.v1beta1.Qu" +
      "eryDepositsResponse\"<\202\323\344\223\0026\0224/cosmos/gov" +
      "/v1beta1/proposals/{proposal_id}/deposit" +
      "s\022\243\001\n\013TallyResult\022+.cosmos.gov.v1beta1.Q" +
      "ueryTallyResultRequest\032,.cosmos.gov.v1be" +
      "ta1.QueryTallyResultResponse\"9\202\323\344\223\0023\0221/c" +
      "osmos/gov/v1beta1/proposals/{proposal_id" +
      "}/tally\022\233\001\n\tCertVoted\022*.shentu.gov.v1alp" +
      "ha1.QueryCertVotedRequest\032+.shentu.gov.v" +
      "1alpha1.QueryCertVotedResponse\"5\202\323\344\223\002/\022-" +
      "/shentu/gov/v1alpha1/cert_voted/{proposa" +
      "l_id}B\303\001\n\027com.shentu.gov.v1alpha1B\nQuery" +
      "ProtoP\001Z.github.com/shentufoundation/she" +
      "ntu/x/gov/types\242\002\003SGX\252\002\023Shentu.Gov.V1alp" +
      "ha1\312\002\023Shentu\\Gov\\V1alpha1\342\002\037Shentu\\Gov\\V" +
      "1alpha1\\GPBMetadata\352\002\025Shentu::Gov::V1alp" +
      "ha1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.cosmos.gov.v1beta1.GovProto.getDescriptor(),
          com.cosmos.gov.v1beta1.QueryProto.getDescriptor(),
          com.shentu.gov.v1alpha1.GovProto.getDescriptor(),
        });
    internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shentu_gov_v1alpha1_QueryCertVotedRequest_descriptor,
        new java.lang.String[] { "ProposalId", });
    internal_static_shentu_gov_v1alpha1_QueryCertVotedResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_shentu_gov_v1alpha1_QueryCertVotedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shentu_gov_v1alpha1_QueryCertVotedResponse_descriptor,
        new java.lang.String[] { "CertVoted", });
    internal_static_shentu_gov_v1alpha1_QueryParamsResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_shentu_gov_v1alpha1_QueryParamsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_shentu_gov_v1alpha1_QueryParamsResponse_descriptor,
        new java.lang.String[] { "VotingParams", "DepositParams", "TallyParams", "CustomParams", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.cosmos.gov.v1beta1.GovProto.getDescriptor();
    com.cosmos.gov.v1beta1.QueryProto.getDescriptor();
    com.shentu.gov.v1alpha1.GovProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
