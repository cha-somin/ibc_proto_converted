// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/gov/v1beta1/gov.proto

package com.cosmos.gov.v1beta1;

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
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TextProposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TextProposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Deposit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Deposit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Proposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Proposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TallyResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TallyResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_Vote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_Vote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_DepositParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_DepositParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_VotingParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_VotingParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_cosmos_gov_v1beta1_TallyParams_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_cosmos_gov_v1beta1_TallyParams_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034cosmos/gov/v1beta1/gov.proto\022\022cosmos.g" +
      "ov.v1beta1\032\036cosmos/base/v1beta1/coin.pro" +
      "to\032\024gogoproto/gogo.proto\032\037google/protobu" +
      "f/timestamp.proto\032\031google/protobuf/any.p" +
      "roto\032\036google/protobuf/duration.proto\032\031co" +
      "smos_proto/cosmos.proto\032\021amino/amino.pro" +
      "to\"\247\001\n\022WeightedVoteOption\0226\n\006option\030\001 \001(" +
      "\0162\036.cosmos.gov.v1beta1.VoteOptionR\006optio" +
      "n\022Y\n\006weight\030\002 \001(\tBA\310\336\037\000\332\336\037&github.com/co" +
      "smos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec\250" +
      "\347\260*\001R\006weight\"\206\001\n\014TextProposal\022\024\n\005title\030\001" +
      " \001(\tR\005title\022 \n\013description\030\002 \001(\tR\013descri" +
      "ption:>\350\240\037\001\312\264-\032cosmos.gov.v1beta1.Conten" +
      "t\212\347\260*\027cosmos-sdk/TextProposal\"\326\001\n\007Deposi" +
      "t\022\037\n\013proposal_id\030\001 \001(\004R\nproposalId\0226\n\tde" +
      "positor\030\002 \001(\tB\030\322\264-\024cosmos.AddressStringR" +
      "\tdepositor\022h\n\006amount\030\003 \003(\0132\031.cosmos.base" +
      ".v1beta1.CoinB5\310\336\037\000\252\337\037(github.com/cosmos" +
      "/cosmos-sdk/types.Coins\250\347\260*\001R\006amount:\010\210\240" +
      "\037\000\350\240\037\000\"\331\005\n\010Proposal\022\037\n\013proposal_id\030\001 \001(\004" +
      "R\nproposalId\022N\n\007content\030\002 \001(\0132\024.google.p" +
      "rotobuf.AnyB\036\312\264-\032cosmos.gov.v1beta1.Cont" +
      "entR\007content\022:\n\006status\030\003 \001(\0162\".cosmos.go" +
      "v.v1beta1.ProposalStatusR\006status\022X\n\022fina" +
      "l_tally_result\030\004 \001(\0132\037.cosmos.gov.v1beta" +
      "1.TallyResultB\t\310\336\037\000\250\347\260*\001R\020finalTallyResu" +
      "lt\022J\n\013submit_time\030\005 \001(\0132\032.google.protobu" +
      "f.TimestampB\r\310\336\037\000\220\337\037\001\250\347\260*\001R\nsubmitTime\022S" +
      "\n\020deposit_end_time\030\006 \001(\0132\032.google.protob" +
      "uf.TimestampB\r\310\336\037\000\220\337\037\001\250\347\260*\001R\016depositEndT" +
      "ime\022u\n\rtotal_deposit\030\007 \003(\0132\031.cosmos.base" +
      ".v1beta1.CoinB5\310\336\037\000\252\337\037(github.com/cosmos" +
      "/cosmos-sdk/types.Coins\250\347\260*\001R\014totalDepos" +
      "it\022U\n\021voting_start_time\030\010 \001(\0132\032.google.p" +
      "rotobuf.TimestampB\r\310\336\037\000\220\337\037\001\250\347\260*\001R\017voting" +
      "StartTime\022Q\n\017voting_end_time\030\t \001(\0132\032.goo" +
      "gle.protobuf.TimestampB\r\310\336\037\000\220\337\037\001\250\347\260*\001R\rv" +
      "otingEndTime:\004\350\240\037\001\"\351\002\n\013TallyResult\022N\n\003ye" +
      "s\030\001 \001(\tB<\310\336\037\000\332\336\037&github.com/cosmos/cosmo" +
      "s-sdk/types.Int\322\264-\ncosmos.IntR\003yes\022V\n\007ab" +
      "stain\030\002 \001(\tB<\310\336\037\000\332\336\037&github.com/cosmos/c" +
      "osmos-sdk/types.Int\322\264-\ncosmos.IntR\007absta" +
      "in\022L\n\002no\030\003 \001(\tB<\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.Int\322\264-\ncosmos.IntR\002no" +
      "\022^\n\014no_with_veto\030\004 \001(\tB<\310\336\037\000\332\336\037&github.c" +
      "om/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos" +
      ".IntR\nnoWithVeto:\004\350\240\037\001\"\372\001\n\004Vote\0223\n\013propo" +
      "sal_id\030\001 \001(\004B\022\352\336\037\002id\242\347\260*\002id\250\347\260*\001R\npropos" +
      "alId\022.\n\005voter\030\002 \001(\tB\030\322\264-\024cosmos.AddressS" +
      "tringR\005voter\022:\n\006option\030\003 \001(\0162\036.cosmos.go" +
      "v.v1beta1.VoteOptionB\002\030\001R\006option\022K\n\007opti" +
      "ons\030\004 \003(\0132&.cosmos.gov.v1beta1.WeightedV" +
      "oteOptionB\t\310\336\037\000\250\347\260*\001R\007options:\004\350\240\037\000\"\212\002\n\r" +
      "DepositParams\022\205\001\n\013min_deposit\030\001 \003(\0132\031.co" +
      "smos.base.v1beta1.CoinBI\310\336\037\000\352\336\037\025min_depo" +
      "sit,omitempty\252\337\037(github.com/cosmos/cosmo" +
      "s-sdk/types.CoinsR\nminDeposit\022q\n\022max_dep" +
      "osit_period\030\002 \001(\0132\031.google.protobuf.Dura" +
      "tionB(\310\336\037\000\352\336\037\034max_deposit_period,omitemp" +
      "ty\230\337\037\001R\020maxDepositPeriod\"s\n\014VotingParams" +
      "\022c\n\rvoting_period\030\001 \001(\0132\031.google.protobu" +
      "f.DurationB#\310\336\037\000\352\336\037\027voting_period,omitem" +
      "pty\230\337\037\001R\014votingPeriod\"\301\002\n\013TallyParams\022Z\n" +
      "\006quorum\030\001 \001(\014BB\310\336\037\000\332\336\037&github.com/cosmos" +
      "/cosmos-sdk/types.Dec\352\336\037\020quorum,omitempt" +
      "yR\006quorum\022c\n\tthreshold\030\002 \001(\014BE\310\336\037\000\332\336\037&gi" +
      "thub.com/cosmos/cosmos-sdk/types.Dec\352\336\037\023" +
      "threshold,omitemptyR\tthreshold\022q\n\016veto_t" +
      "hreshold\030\003 \001(\014BJ\310\336\037\000\332\336\037&github.com/cosmo" +
      "s/cosmos-sdk/types.Dec\352\336\037\030veto_threshold" +
      ",omitemptyR\rvetoThreshold*\346\001\n\nVoteOption" +
      "\022,\n\027VOTE_OPTION_UNSPECIFIED\020\000\032\017\212\235 \013Optio" +
      "nEmpty\022\"\n\017VOTE_OPTION_YES\020\001\032\r\212\235 \tOptionY" +
      "es\022*\n\023VOTE_OPTION_ABSTAIN\020\002\032\021\212\235 \rOptionA" +
      "bstain\022 \n\016VOTE_OPTION_NO\020\003\032\014\212\235 \010OptionNo" +
      "\0222\n\030VOTE_OPTION_NO_WITH_VETO\020\004\032\024\212\235 \020Opti" +
      "onNoWithVeto\032\004\210\243\036\000*\314\002\n\016ProposalStatus\022.\n" +
      "\033PROPOSAL_STATUS_UNSPECIFIED\020\000\032\r\212\235 \tStat" +
      "usNil\022;\n\036PROPOSAL_STATUS_DEPOSIT_PERIOD\020" +
      "\001\032\027\212\235 \023StatusDepositPeriod\0229\n\035PROPOSAL_S" +
      "TATUS_VOTING_PERIOD\020\002\032\026\212\235 \022StatusVotingP" +
      "eriod\022,\n\026PROPOSAL_STATUS_PASSED\020\003\032\020\212\235 \014S" +
      "tatusPassed\0220\n\030PROPOSAL_STATUS_REJECTED\020" +
      "\004\032\022\212\235 \016StatusRejected\022,\n\026PROPOSAL_STATUS" +
      "_FAILED\020\005\032\020\212\235 \014StatusFailed\032\004\210\243\036\000B\302\001\n\026co" +
      "m.cosmos.gov.v1beta1B\010GovProtoP\001Z0github" +
      ".com/cosmos/cosmos-sdk/x/gov/types/v1bet" +
      "a1\242\002\003CGX\252\002\022Cosmos.Gov.V1beta1\312\002\022Cosmos\\G" +
      "ov\\V1beta1\342\002\036Cosmos\\Gov\\V1beta1\\GPBMetad" +
      "ata\352\002\024Cosmos::Gov::V1beta1\310\341\036\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.cosmos.base.v1beta1.CoinProto.getDescriptor(),
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.amino.AminoProto.getDescriptor(),
        });
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_cosmos_gov_v1beta1_WeightedVoteOption_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_WeightedVoteOption_descriptor,
        new java.lang.String[] { "Option", "Weight", });
    internal_static_cosmos_gov_v1beta1_TextProposal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_cosmos_gov_v1beta1_TextProposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TextProposal_descriptor,
        new java.lang.String[] { "Title", "Description", });
    internal_static_cosmos_gov_v1beta1_Deposit_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_cosmos_gov_v1beta1_Deposit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Deposit_descriptor,
        new java.lang.String[] { "ProposalId", "Depositor", "Amount", });
    internal_static_cosmos_gov_v1beta1_Proposal_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_cosmos_gov_v1beta1_Proposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Proposal_descriptor,
        new java.lang.String[] { "ProposalId", "Content", "Status", "FinalTallyResult", "SubmitTime", "DepositEndTime", "TotalDeposit", "VotingStartTime", "VotingEndTime", });
    internal_static_cosmos_gov_v1beta1_TallyResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_cosmos_gov_v1beta1_TallyResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TallyResult_descriptor,
        new java.lang.String[] { "Yes", "Abstain", "No", "NoWithVeto", });
    internal_static_cosmos_gov_v1beta1_Vote_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_cosmos_gov_v1beta1_Vote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_Vote_descriptor,
        new java.lang.String[] { "ProposalId", "Voter", "Option", "Options", });
    internal_static_cosmos_gov_v1beta1_DepositParams_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_cosmos_gov_v1beta1_DepositParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_DepositParams_descriptor,
        new java.lang.String[] { "MinDeposit", "MaxDepositPeriod", });
    internal_static_cosmos_gov_v1beta1_VotingParams_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_cosmos_gov_v1beta1_VotingParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_VotingParams_descriptor,
        new java.lang.String[] { "VotingPeriod", });
    internal_static_cosmos_gov_v1beta1_TallyParams_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_cosmos_gov_v1beta1_TallyParams_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_cosmos_gov_v1beta1_TallyParams_descriptor,
        new java.lang.String[] { "Quorum", "Threshold", "VetoThreshold", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.amino.AminoProto.dontOmitempty);
    registry.add(com.amino.AminoProto.fieldName);
    registry.add(com.amino.AminoProto.name);
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.cosmos_proto.CosmosProto.scalar);
    registry.add(com.gogoproto.GogoProto.castrepeated);
    registry.add(com.gogoproto.GogoProto.customtype);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.goprotoGettersAll);
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdduration);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.cosmos.base.v1beta1.CoinProto.getDescriptor();
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.amino.AminoProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
