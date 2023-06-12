// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/posts/v1/models.proto

package com.desmos.posts.v1;

public final class ModelsProto {
  private ModelsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Post_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Post_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_PostReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_PostReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Entities_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Entities_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Tag_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Tag_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Url_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Url_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Attachment_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Attachment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Media_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Media_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Poll_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Poll_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Poll_ProvidedAnswer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Poll_ProvidedAnswer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_UserAnswer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_UserAnswer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_PollTallyResults_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_PollTallyResults_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_PollTallyResults_AnswerResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_PollTallyResults_AnswerResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_desmos_posts_v1_Params_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_desmos_posts_v1_Params_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034desmos/posts/v1/models.proto\022\017desmos.p" +
      "osts.v1\032\024gogoproto/gogo.proto\032\031google/pr" +
      "otobuf/any.proto\032\037google/protobuf/timest" +
      "amp.proto\032\031cosmos_proto/cosmos.proto\"\206\005\n" +
      "\004Post\022/\n\013subspace_id\030\001 \001(\004B\016\342\336\037\nSubspace" +
      "IDR\nsubspaceId\022,\n\nsection_id\030\002 \001(\rB\r\342\336\037\t" +
      "SectionIDR\tsectionId\022\026\n\002id\030\003 \001(\004B\006\342\336\037\002ID" +
      "R\002id\022/\n\013external_id\030\004 \001(\tB\016\342\336\037\nExternalI" +
      "DR\nexternalId\022\022\n\004text\030\005 \001(\tR\004text\0225\n\010ent" +
      "ities\030\006 \001(\0132\031.desmos.posts.v1.EntitiesR\010" +
      "entities\022\026\n\006author\030\007 \001(\tR\006author\022;\n\017conv" +
      "ersation_id\030\010 \001(\004B\022\342\336\037\016ConversationIDR\016c" +
      "onversationId\022O\n\020referenced_posts\030\t \003(\0132" +
      "\036.desmos.posts.v1.PostReferenceB\004\310\336\037\000R\017r" +
      "eferencedPosts\022D\n\016reply_settings\030\n \001(\0162\035" +
      ".desmos.posts.v1.ReplySettingR\rreplySett" +
      "ings\022I\n\rcreation_date\030\013 \001(\0132\032.google.pro" +
      "tobuf.TimestampB\010\310\336\037\000\220\337\037\001R\014creationDate\022" +
      "J\n\020last_edited_date\030\014 \001(\0132\032.google.proto" +
      "buf.TimestampB\004\220\337\037\001R\016lastEditedDate:\010\230\240\037" +
      "\001\350\240\037\001\"\222\001\n\rPostReference\0226\n\004type\030\001 \001(\0162\"." +
      "desmos.posts.v1.PostReferenceTypeR\004type\022" +
      "#\n\007post_id\030\002 \001(\004B\n\342\336\037\006PostIDR\006postId\022\032\n\010" +
      "position\030\003 \001(\004R\010position:\010\230\240\037\001\350\240\037\001\"\264\001\n\010E" +
      "ntities\0226\n\010hashtags\030\001 \003(\0132\024.desmos.posts" +
      ".v1.TagB\004\310\336\037\000R\010hashtags\0226\n\010mentions\030\002 \003(" +
      "\0132\024.desmos.posts.v1.TagB\004\310\336\037\000R\010mentions\022" +
      ".\n\004urls\030\003 \003(\0132\024.desmos.posts.v1.UrlB\004\310\336\037" +
      "\000R\004urls:\010\230\240\037\001\350\240\037\001\"I\n\003Tag\022\024\n\005start\030\001 \001(\004R" +
      "\005start\022\020\n\003end\030\002 \001(\004R\003end\022\020\n\003tag\030\003 \001(\tR\003t" +
      "ag:\010\230\240\037\001\350\240\037\001\"j\n\003Url\022\024\n\005start\030\001 \001(\004R\005star" +
      "t\022\020\n\003end\030\002 \001(\004R\003end\022\020\n\003url\030\003 \001(\tR\003url\022\037\n" +
      "\013display_url\030\004 \001(\tR\ndisplayUrl:\010\230\240\037\001\350\240\037\001" +
      "\"\211\002\n\nAttachment\022/\n\013subspace_id\030\001 \001(\004B\016\342\336" +
      "\037\nSubspaceIDR\nsubspaceId\022,\n\nsection_id\030\002" +
      " \001(\rB\r\342\336\037\tSectionIDR\tsectionId\022#\n\007post_i" +
      "d\030\003 \001(\004B\n\342\336\037\006PostIDR\006postId\022\026\n\002id\030\004 \001(\rB" +
      "\006\342\336\037\002IDR\002id\022U\n\007content\030\005 \001(\0132\024.google.pr" +
      "otobuf.AnyB%\312\264-!desmos.posts.v1.Attachme" +
      "ntContentR\007content:\010\230\240\037\001\350\240\037\001\"e\n\005Media\022\020\n" +
      "\003uri\030\002 \001(\tR\003uri\022\033\n\tmime_type\030\003 \001(\tR\010mime" +
      "Type:-\230\240\037\001\350\240\037\001\312\264-!desmos.posts.v1.Attach" +
      "mentContent\"\231\004\n\004Poll\022\032\n\010question\030\001 \001(\tR\010" +
      "question\022U\n\020provided_answers\030\002 \003(\0132$.des" +
      "mos.posts.v1.Poll.ProvidedAnswerB\004\310\336\037\000R\017" +
      "providedAnswers\022?\n\010end_date\030\003 \001(\0132\032.goog" +
      "le.protobuf.TimestampB\010\310\336\037\000\220\337\037\001R\007endDate" +
      "\0226\n\027allows_multiple_answers\030\004 \001(\010R\025allow" +
      "sMultipleAnswers\022.\n\023allows_answer_edits\030" +
      "\005 \001(\010R\021allowsAnswerEdits\022Q\n\023final_tally_" +
      "results\030\006 \001(\0132!.desmos.posts.v1.PollTall" +
      "yResultsR\021finalTallyResults\032s\n\016ProvidedA" +
      "nswer\022\022\n\004text\030\001 \001(\tR\004text\022C\n\013attachments" +
      "\030\002 \003(\0132\033.desmos.posts.v1.AttachmentB\004\310\336\037" +
      "\000R\013attachments:\010\230\240\037\001\350\240\037\001:-\230\240\037\001\350\240\037\001\312\264-!de" +
      "smos.posts.v1.AttachmentContent\"\374\001\n\nUser" +
      "Answer\022/\n\013subspace_id\030\001 \001(\004B\016\342\336\037\nSubspac" +
      "eIDR\nsubspaceId\022,\n\nsection_id\030\002 \001(\rB\r\342\336\037" +
      "\tSectionIDR\tsectionId\022#\n\007post_id\030\003 \001(\004B\n" +
      "\342\336\037\006PostIDR\006postId\022#\n\007poll_id\030\004 \001(\rB\n\342\336\037" +
      "\006PollIDR\006pollId\022\'\n\017answers_indexes\030\005 \003(\r" +
      "R\016answersIndexes\022\022\n\004user\030\006 \001(\tR\004user:\010\230\240" +
      "\037\001\350\240\037\001\"\277\001\n\020PollTallyResults\022N\n\007results\030\001" +
      " \003(\0132..desmos.posts.v1.PollTallyResults." +
      "AnswerResultB\004\310\336\037\000R\007results\032Q\n\014AnswerRes" +
      "ult\022!\n\014answer_index\030\001 \001(\rR\013answerIndex\022\024" +
      "\n\005votes\030\002 \001(\004R\005votes:\010\230\240\037\001\350\240\037\001:\010\230\240\037\001\350\240\037\001" +
      "\":\n\006Params\022&\n\017max_text_length\030\001 \001(\rR\rmax" +
      "TextLength:\010\230\240\037\001\350\240\037\001*\234\001\n\021PostReferenceTy" +
      "pe\022#\n\037POST_REFERENCE_TYPE_UNSPECIFIED\020\000\022" +
      "\035\n\031POST_REFERENCE_TYPE_REPLY\020\001\022\035\n\031POST_R" +
      "EFERENCE_TYPE_QUOTE\020\002\022\036\n\032POST_REFERENCE_" +
      "TYPE_REPOST\020\003\032\004\210\243\036\000*\242\001\n\014ReplySetting\022\035\n\031" +
      "REPLY_SETTING_UNSPECIFIED\020\000\022\032\n\026REPLY_SET" +
      "TING_EVERYONE\020\001\022\033\n\027REPLY_SETTING_FOLLOWE" +
      "RS\020\002\022\030\n\024REPLY_SETTING_MUTUAL\020\003\022\032\n\026REPLY_" +
      "SETTING_MENTIONS\020\004\032\004\210\243\036\000B\264\001\n\023com.desmos." +
      "posts.v1B\013ModelsProtoP\001Z2github.com/desm" +
      "os-labs/desmos/v5/x/posts/legacy/v2\242\002\003DP" +
      "X\252\002\017Desmos.Posts.V1\312\002\017Desmos\\Posts\\V1\342\002\033" +
      "Desmos\\Posts\\V1\\GPBMetadata\352\002\021Desmos::Po" +
      "sts::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.cosmos_proto.CosmosProto.getDescriptor(),
        });
    internal_static_desmos_posts_v1_Post_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_desmos_posts_v1_Post_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Post_descriptor,
        new java.lang.String[] { "SubspaceId", "SectionId", "Id", "ExternalId", "Text", "Entities", "Author", "ConversationId", "ReferencedPosts", "ReplySettings", "CreationDate", "LastEditedDate", });
    internal_static_desmos_posts_v1_PostReference_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_desmos_posts_v1_PostReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_PostReference_descriptor,
        new java.lang.String[] { "Type", "PostId", "Position", });
    internal_static_desmos_posts_v1_Entities_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_desmos_posts_v1_Entities_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Entities_descriptor,
        new java.lang.String[] { "Hashtags", "Mentions", "Urls", });
    internal_static_desmos_posts_v1_Tag_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_desmos_posts_v1_Tag_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Tag_descriptor,
        new java.lang.String[] { "Start", "End", "Tag", });
    internal_static_desmos_posts_v1_Url_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_desmos_posts_v1_Url_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Url_descriptor,
        new java.lang.String[] { "Start", "End", "Url", "DisplayUrl", });
    internal_static_desmos_posts_v1_Attachment_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_desmos_posts_v1_Attachment_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Attachment_descriptor,
        new java.lang.String[] { "SubspaceId", "SectionId", "PostId", "Id", "Content", });
    internal_static_desmos_posts_v1_Media_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_desmos_posts_v1_Media_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Media_descriptor,
        new java.lang.String[] { "Uri", "MimeType", });
    internal_static_desmos_posts_v1_Poll_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_desmos_posts_v1_Poll_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Poll_descriptor,
        new java.lang.String[] { "Question", "ProvidedAnswers", "EndDate", "AllowsMultipleAnswers", "AllowsAnswerEdits", "FinalTallyResults", });
    internal_static_desmos_posts_v1_Poll_ProvidedAnswer_descriptor =
      internal_static_desmos_posts_v1_Poll_descriptor.getNestedTypes().get(0);
    internal_static_desmos_posts_v1_Poll_ProvidedAnswer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Poll_ProvidedAnswer_descriptor,
        new java.lang.String[] { "Text", "Attachments", });
    internal_static_desmos_posts_v1_UserAnswer_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_desmos_posts_v1_UserAnswer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_UserAnswer_descriptor,
        new java.lang.String[] { "SubspaceId", "SectionId", "PostId", "PollId", "AnswersIndexes", "User", });
    internal_static_desmos_posts_v1_PollTallyResults_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_desmos_posts_v1_PollTallyResults_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_PollTallyResults_descriptor,
        new java.lang.String[] { "Results", });
    internal_static_desmos_posts_v1_PollTallyResults_AnswerResult_descriptor =
      internal_static_desmos_posts_v1_PollTallyResults_descriptor.getNestedTypes().get(0);
    internal_static_desmos_posts_v1_PollTallyResults_AnswerResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_PollTallyResults_AnswerResult_descriptor,
        new java.lang.String[] { "AnswerIndex", "Votes", });
    internal_static_desmos_posts_v1_Params_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_desmos_posts_v1_Params_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_desmos_posts_v1_Params_descriptor,
        new java.lang.String[] { "MaxTextLength", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.cosmos_proto.CosmosProto.acceptsInterface);
    registry.add(com.cosmos_proto.CosmosProto.implementsInterface);
    registry.add(com.gogoproto.GogoProto.customname);
    registry.add(com.gogoproto.GogoProto.equal);
    registry.add(com.gogoproto.GogoProto.goprotoEnumPrefix);
    registry.add(com.gogoproto.GogoProto.goprotoStringer);
    registry.add(com.gogoproto.GogoProto.nullable);
    registry.add(com.gogoproto.GogoProto.stdtime);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.cosmos_proto.CosmosProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
