// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: regen/group/v1alpha1/types.proto

package com.regen.group.v1alpha1;

public final class TypesProto {
  private TypesProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_Member_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_Member_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_Members_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_Members_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_ThresholdDecisionPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_ThresholdDecisionPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_GroupInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_GroupInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_GroupMember_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_GroupMember_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_GroupAccountInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_GroupAccountInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_Proposal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_Proposal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_Tally_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_Tally_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_regen_group_v1alpha1_Vote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_regen_group_v1alpha1_Vote_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n regen/group/v1alpha1/types.proto\022\024rege" +
      "n.group.v1alpha1\032\024gogoproto/gogo.proto\032\036" +
      "google/protobuf/duration.proto\032\037google/p" +
      "rotobuf/timestamp.proto\032\031cosmos_proto/co" +
      "smos.proto\032\031google/protobuf/any.proto\"V\n" +
      "\006Member\022\030\n\007address\030\001 \001(\tR\007address\022\026\n\006wei" +
      "ght\030\002 \001(\tR\006weight\022\032\n\010metadata\030\003 \001(\014R\010met" +
      "adata\"G\n\007Members\022<\n\007members\030\001 \003(\0132\034.rege" +
      "n.group.v1alpha1.MemberB\004\310\336\037\000R\007members\"\206" +
      "\001\n\027ThresholdDecisionPolicy\022\034\n\tthreshold\030" +
      "\001 \001(\tR\tthreshold\0229\n\007timeout\030\002 \001(\0132\031.goog" +
      "le.protobuf.DurationB\004\310\336\037\000R\007timeout:\022\312\264-" +
      "\016DecisionPolicy\"\225\001\n\tGroupInfo\022\031\n\010group_i" +
      "d\030\001 \001(\004R\007groupId\022\024\n\005admin\030\002 \001(\tR\005admin\022\032" +
      "\n\010metadata\030\003 \001(\014R\010metadata\022\030\n\007version\030\004 " +
      "\001(\004R\007version\022!\n\014total_weight\030\005 \001(\tR\013tota" +
      "lWeight\"^\n\013GroupMember\022\031\n\010group_id\030\001 \001(\004" +
      "R\007groupId\0224\n\006member\030\002 \001(\0132\034.regen.group." +
      "v1alpha1.MemberR\006member\"\227\002\n\020GroupAccount" +
      "Info\022\030\n\007address\030\001 \001(\tR\007address\022\031\n\010group_" +
      "id\030\002 \001(\004R\007groupId\022\024\n\005admin\030\003 \001(\tR\005admin\022" +
      "\032\n\010metadata\030\004 \001(\014R\010metadata\022\030\n\007version\030\005" +
      " \001(\004R\007version\022Q\n\017decision_policy\030\006 \001(\0132\024" +
      ".google.protobuf.AnyB\022\312\264-\016DecisionPolicy" +
      "R\016decisionPolicy\022%\n\016derivation_key\030\007 \001(\014" +
      "R\rderivationKey:\010\210\240\037\000\350\240\037\001\"\355\n\n\010Proposal\022\037" +
      "\n\013proposal_id\030\001 \001(\004R\nproposalId\022\030\n\007addre" +
      "ss\030\002 \001(\tR\007address\022\032\n\010metadata\030\003 \001(\014R\010met" +
      "adata\022\034\n\tproposers\030\004 \003(\tR\tproposers\022C\n\014s" +
      "ubmitted_at\030\005 \001(\0132\032.google.protobuf.Time" +
      "stampB\004\310\336\037\000R\013submittedAt\022#\n\rgroup_versio" +
      "n\030\006 \001(\004R\014groupVersion\0222\n\025group_account_v" +
      "ersion\030\007 \001(\004R\023groupAccountVersion\022=\n\006sta" +
      "tus\030\010 \001(\0162%.regen.group.v1alpha1.Proposa" +
      "l.StatusR\006status\022=\n\006result\030\t \001(\0162%.regen" +
      ".group.v1alpha1.Proposal.ResultR\006result\022" +
      "@\n\nvote_state\030\n \001(\0132\033.regen.group.v1alph" +
      "a1.TallyB\004\310\336\037\000R\tvoteState\022:\n\007timeout\030\013 \001" +
      "(\0132\032.google.protobuf.TimestampB\004\310\336\037\000R\007ti" +
      "meout\022V\n\017executor_result\030\014 \001(\0162-.regen.g" +
      "roup.v1alpha1.Proposal.ExecutorResultR\016e" +
      "xecutorResult\022(\n\004msgs\030\r \003(\0132\024.google.pro" +
      "tobuf.AnyR\004msgs\"\320\001\n\006Status\0221\n\022STATUS_UNS" +
      "PECIFIED\020\000\032\031\212\235 \025ProposalStatusInvalid\0221\n" +
      "\020STATUS_SUBMITTED\020\001\032\033\212\235 \027ProposalStatusS" +
      "ubmitted\022+\n\rSTATUS_CLOSED\020\002\032\030\212\235 \024Proposa" +
      "lStatusClosed\022-\n\016STATUS_ABORTED\020\003\032\031\212\235 \025P" +
      "roposalStatusAborted\032\004\210\243\036\000\"\332\001\n\006Result\0221\n" +
      "\022RESULT_UNSPECIFIED\020\000\032\031\212\235 \025ProposalResul" +
      "tInvalid\0225\n\022RESULT_UNFINALIZED\020\001\032\035\212\235 \031Pr" +
      "oposalResultUnfinalized\022/\n\017RESULT_ACCEPT" +
      "ED\020\002\032\032\212\235 \026ProposalResultAccepted\022/\n\017RESU" +
      "LT_REJECTED\020\003\032\032\212\235 \026ProposalResultRejecte" +
      "d\032\004\210\243\036\000\"\231\002\n\016ExecutorResult\022B\n\033EXECUTOR_R" +
      "ESULT_UNSPECIFIED\020\000\032!\212\235 \035ProposalExecuto" +
      "rResultInvalid\022=\n\027EXECUTOR_RESULT_NOT_RU" +
      "N\020\001\032 \212\235 \034ProposalExecutorResultNotRun\022>\n" +
      "\027EXECUTOR_RESULT_SUCCESS\020\002\032!\212\235 \035Proposal" +
      "ExecutorResultSuccess\022>\n\027EXECUTOR_RESULT" +
      "_FAILURE\020\003\032!\212\235 \035ProposalExecutorResultFa" +
      "ilure\032\004\210\243\036\000:\004\210\240\037\000\"\211\001\n\005Tally\022\033\n\tyes_count" +
      "\030\001 \001(\tR\010yesCount\022\031\n\010no_count\030\002 \001(\tR\007noCo" +
      "unt\022#\n\rabstain_count\030\003 \001(\tR\014abstainCount" +
      "\022\035\n\nveto_count\030\004 \001(\tR\tvetoCount:\004\210\240\037\000\"\324\001" +
      "\n\004Vote\022\037\n\013proposal_id\030\001 \001(\004R\nproposalId\022" +
      "\024\n\005voter\030\002 \001(\tR\005voter\0224\n\006choice\030\003 \001(\0162\034." +
      "regen.group.v1alpha1.ChoiceR\006choice\022\032\n\010m" +
      "etadata\030\004 \001(\014R\010metadata\022C\n\014submitted_at\030" +
      "\005 \001(\0132\032.google.protobuf.TimestampB\004\310\336\037\000R" +
      "\013submittedAt*d\n\006Choice\022\026\n\022CHOICE_UNSPECI" +
      "FIED\020\000\022\r\n\tCHOICE_NO\020\001\022\016\n\nCHOICE_YES\020\002\022\022\n" +
      "\016CHOICE_ABSTAIN\020\003\022\017\n\013CHOICE_VETO\020\004B\307\001\n\030c" +
      "om.regen.group.v1alpha1B\nTypesProtoP\001Z-g" +
      "ithub.com/regen-network/regen-ledger/x/g" +
      "roup\242\002\003RGX\252\002\024Regen.Group.V1alpha1\312\002\024Rege" +
      "n\\Group\\V1alpha1\342\002 Regen\\Group\\V1alpha1\\" +
      "GPBMetadata\352\002\026Regen::Group::V1alpha1b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_regen_group_v1alpha1_Member_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_regen_group_v1alpha1_Member_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_Member_descriptor,
        new java.lang.String[] { "Address", "Weight", "Metadata", });
    internal_static_regen_group_v1alpha1_Members_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_regen_group_v1alpha1_Members_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_Members_descriptor,
        new java.lang.String[] { "Members", });
    internal_static_regen_group_v1alpha1_ThresholdDecisionPolicy_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_regen_group_v1alpha1_ThresholdDecisionPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_ThresholdDecisionPolicy_descriptor,
        new java.lang.String[] { "Threshold", "Timeout", });
    internal_static_regen_group_v1alpha1_GroupInfo_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_regen_group_v1alpha1_GroupInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_GroupInfo_descriptor,
        new java.lang.String[] { "GroupId", "Admin", "Metadata", "Version", "TotalWeight", });
    internal_static_regen_group_v1alpha1_GroupMember_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_regen_group_v1alpha1_GroupMember_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_GroupMember_descriptor,
        new java.lang.String[] { "GroupId", "Member", });
    internal_static_regen_group_v1alpha1_GroupAccountInfo_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_regen_group_v1alpha1_GroupAccountInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_GroupAccountInfo_descriptor,
        new java.lang.String[] { "Address", "GroupId", "Admin", "Metadata", "Version", "DecisionPolicy", "DerivationKey", });
    internal_static_regen_group_v1alpha1_Proposal_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_regen_group_v1alpha1_Proposal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_Proposal_descriptor,
        new java.lang.String[] { "ProposalId", "Address", "Metadata", "Proposers", "SubmittedAt", "GroupVersion", "GroupAccountVersion", "Status", "Result", "VoteState", "Timeout", "ExecutorResult", "Msgs", });
    internal_static_regen_group_v1alpha1_Tally_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_regen_group_v1alpha1_Tally_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_Tally_descriptor,
        new java.lang.String[] { "YesCount", "NoCount", "AbstainCount", "VetoCount", });
    internal_static_regen_group_v1alpha1_Vote_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_regen_group_v1alpha1_Vote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_regen_group_v1alpha1_Vote_descriptor,
        new java.lang.String[] { "ProposalId", "Voter", "Choice", "Metadata", "SubmittedAt", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.enumvalueCustomname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
