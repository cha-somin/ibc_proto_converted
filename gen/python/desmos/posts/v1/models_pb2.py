# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/posts/v1/models.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x64\x65smos/posts/v1/models.proto\x12\x0f\x64\x65smos.posts.v1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\x86\x05\n\x04Post\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12,\n\nsection_id\x18\x02 \x01(\rB\r\xe2\xde\x1f\tSectionIDR\tsectionId\x12\x16\n\x02id\x18\x03 \x01(\x04\x42\x06\xe2\xde\x1f\x02IDR\x02id\x12/\n\x0b\x65xternal_id\x18\x04 \x01(\tB\x0e\xe2\xde\x1f\nExternalIDR\nexternalId\x12\x12\n\x04text\x18\x05 \x01(\tR\x04text\x12\x35\n\x08\x65ntities\x18\x06 \x01(\x0b\x32\x19.desmos.posts.v1.EntitiesR\x08\x65ntities\x12\x16\n\x06\x61uthor\x18\x07 \x01(\tR\x06\x61uthor\x12;\n\x0f\x63onversation_id\x18\x08 \x01(\x04\x42\x12\xe2\xde\x1f\x0e\x43onversationIDR\x0e\x63onversationId\x12O\n\x10referenced_posts\x18\t \x03(\x0b\x32\x1e.desmos.posts.v1.PostReferenceB\x04\xc8\xde\x1f\x00R\x0freferencedPosts\x12\x44\n\x0ereply_settings\x18\n \x01(\x0e\x32\x1d.desmos.posts.v1.ReplySettingR\rreplySettings\x12I\n\rcreation_date\x18\x0b \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x0c\x63reationDate\x12J\n\x10last_edited_date\x18\x0c \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x0elastEditedDate:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x92\x01\n\rPostReference\x12\x36\n\x04type\x18\x01 \x01(\x0e\x32\".desmos.posts.v1.PostReferenceTypeR\x04type\x12#\n\x07post_id\x18\x02 \x01(\x04\x42\n\xe2\xde\x1f\x06PostIDR\x06postId\x12\x1a\n\x08position\x18\x03 \x01(\x04R\x08position:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xb4\x01\n\x08\x45ntities\x12\x36\n\x08hashtags\x18\x01 \x03(\x0b\x32\x14.desmos.posts.v1.TagB\x04\xc8\xde\x1f\x00R\x08hashtags\x12\x36\n\x08mentions\x18\x02 \x03(\x0b\x32\x14.desmos.posts.v1.TagB\x04\xc8\xde\x1f\x00R\x08mentions\x12.\n\x04urls\x18\x03 \x03(\x0b\x32\x14.desmos.posts.v1.UrlB\x04\xc8\xde\x1f\x00R\x04urls:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"I\n\x03Tag\x12\x14\n\x05start\x18\x01 \x01(\x04R\x05start\x12\x10\n\x03\x65nd\x18\x02 \x01(\x04R\x03\x65nd\x12\x10\n\x03tag\x18\x03 \x01(\tR\x03tag:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"j\n\x03Url\x12\x14\n\x05start\x18\x01 \x01(\x04R\x05start\x12\x10\n\x03\x65nd\x18\x02 \x01(\x04R\x03\x65nd\x12\x10\n\x03url\x18\x03 \x01(\tR\x03url\x12\x1f\n\x0b\x64isplay_url\x18\x04 \x01(\tR\ndisplayUrl:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x89\x02\n\nAttachment\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12,\n\nsection_id\x18\x02 \x01(\rB\r\xe2\xde\x1f\tSectionIDR\tsectionId\x12#\n\x07post_id\x18\x03 \x01(\x04\x42\n\xe2\xde\x1f\x06PostIDR\x06postId\x12\x16\n\x02id\x18\x04 \x01(\rB\x06\xe2\xde\x1f\x02IDR\x02id\x12U\n\x07\x63ontent\x18\x05 \x01(\x0b\x32\x14.google.protobuf.AnyB%\xca\xb4-!desmos.posts.v1.AttachmentContentR\x07\x63ontent:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"e\n\x05Media\x12\x10\n\x03uri\x18\x02 \x01(\tR\x03uri\x12\x1b\n\tmime_type\x18\x03 \x01(\tR\x08mimeType:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.posts.v1.AttachmentContent\"\x99\x04\n\x04Poll\x12\x1a\n\x08question\x18\x01 \x01(\tR\x08question\x12U\n\x10provided_answers\x18\x02 \x03(\x0b\x32$.desmos.posts.v1.Poll.ProvidedAnswerB\x04\xc8\xde\x1f\x00R\x0fprovidedAnswers\x12?\n\x08\x65nd_date\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x07\x65ndDate\x12\x36\n\x17\x61llows_multiple_answers\x18\x04 \x01(\x08R\x15\x61llowsMultipleAnswers\x12.\n\x13\x61llows_answer_edits\x18\x05 \x01(\x08R\x11\x61llowsAnswerEdits\x12Q\n\x13\x66inal_tally_results\x18\x06 \x01(\x0b\x32!.desmos.posts.v1.PollTallyResultsR\x11\x66inalTallyResults\x1as\n\x0eProvidedAnswer\x12\x12\n\x04text\x18\x01 \x01(\tR\x04text\x12\x43\n\x0b\x61ttachments\x18\x02 \x03(\x0b\x32\x1b.desmos.posts.v1.AttachmentB\x04\xc8\xde\x1f\x00R\x0b\x61ttachments:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.posts.v1.AttachmentContent\"\xfc\x01\n\nUserAnswer\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12,\n\nsection_id\x18\x02 \x01(\rB\r\xe2\xde\x1f\tSectionIDR\tsectionId\x12#\n\x07post_id\x18\x03 \x01(\x04\x42\n\xe2\xde\x1f\x06PostIDR\x06postId\x12#\n\x07poll_id\x18\x04 \x01(\rB\n\xe2\xde\x1f\x06PollIDR\x06pollId\x12\'\n\x0f\x61nswers_indexes\x18\x05 \x03(\rR\x0e\x61nswersIndexes\x12\x12\n\x04user\x18\x06 \x01(\tR\x04user:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xbf\x01\n\x10PollTallyResults\x12N\n\x07results\x18\x01 \x03(\x0b\x32..desmos.posts.v1.PollTallyResults.AnswerResultB\x04\xc8\xde\x1f\x00R\x07results\x1aQ\n\x0c\x41nswerResult\x12!\n\x0c\x61nswer_index\x18\x01 \x01(\rR\x0b\x61nswerIndex\x12\x14\n\x05votes\x18\x02 \x01(\x04R\x05votes:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\":\n\x06Params\x12&\n\x0fmax_text_length\x18\x01 \x01(\rR\rmaxTextLength:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01*\x9c\x01\n\x11PostReferenceType\x12#\n\x1fPOST_REFERENCE_TYPE_UNSPECIFIED\x10\x00\x12\x1d\n\x19POST_REFERENCE_TYPE_REPLY\x10\x01\x12\x1d\n\x19POST_REFERENCE_TYPE_QUOTE\x10\x02\x12\x1e\n\x1aPOST_REFERENCE_TYPE_REPOST\x10\x03\x1a\x04\x88\xa3\x1e\x00*\xa2\x01\n\x0cReplySetting\x12\x1d\n\x19REPLY_SETTING_UNSPECIFIED\x10\x00\x12\x1a\n\x16REPLY_SETTING_EVERYONE\x10\x01\x12\x1b\n\x17REPLY_SETTING_FOLLOWERS\x10\x02\x12\x18\n\x14REPLY_SETTING_MUTUAL\x10\x03\x12\x1a\n\x16REPLY_SETTING_MENTIONS\x10\x04\x1a\x04\x88\xa3\x1e\x00\x42\xb4\x01\n\x13\x63om.desmos.posts.v1B\x0bModelsProtoP\x01Z2github.com/desmos-labs/desmos/v5/x/posts/legacy/v2\xa2\x02\x03\x44PX\xaa\x02\x0f\x44\x65smos.Posts.V1\xca\x02\x0f\x44\x65smos\\Posts\\V1\xe2\x02\x1b\x44\x65smos\\Posts\\V1\\GPBMetadata\xea\x02\x11\x44\x65smos::Posts::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.posts.v1.models_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.desmos.posts.v1B\013ModelsProtoP\001Z2github.com/desmos-labs/desmos/v5/x/posts/legacy/v2\242\002\003DPX\252\002\017Desmos.Posts.V1\312\002\017Desmos\\Posts\\V1\342\002\033Desmos\\Posts\\V1\\GPBMetadata\352\002\021Desmos::Posts::V1'
  _POSTREFERENCETYPE._options = None
  _POSTREFERENCETYPE._serialized_options = b'\210\243\036\000'
  _REPLYSETTING._options = None
  _REPLYSETTING._serialized_options = b'\210\243\036\000'
  _POST.fields_by_name['subspace_id']._options = None
  _POST.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _POST.fields_by_name['section_id']._options = None
  _POST.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID'
  _POST.fields_by_name['id']._options = None
  _POST.fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _POST.fields_by_name['external_id']._options = None
  _POST.fields_by_name['external_id']._serialized_options = b'\342\336\037\nExternalID'
  _POST.fields_by_name['conversation_id']._options = None
  _POST.fields_by_name['conversation_id']._serialized_options = b'\342\336\037\016ConversationID'
  _POST.fields_by_name['referenced_posts']._options = None
  _POST.fields_by_name['referenced_posts']._serialized_options = b'\310\336\037\000'
  _POST.fields_by_name['creation_date']._options = None
  _POST.fields_by_name['creation_date']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _POST.fields_by_name['last_edited_date']._options = None
  _POST.fields_by_name['last_edited_date']._serialized_options = b'\220\337\037\001'
  _POST._options = None
  _POST._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POSTREFERENCE.fields_by_name['post_id']._options = None
  _POSTREFERENCE.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID'
  _POSTREFERENCE._options = None
  _POSTREFERENCE._serialized_options = b'\230\240\037\001\350\240\037\001'
  _ENTITIES.fields_by_name['hashtags']._options = None
  _ENTITIES.fields_by_name['hashtags']._serialized_options = b'\310\336\037\000'
  _ENTITIES.fields_by_name['mentions']._options = None
  _ENTITIES.fields_by_name['mentions']._serialized_options = b'\310\336\037\000'
  _ENTITIES.fields_by_name['urls']._options = None
  _ENTITIES.fields_by_name['urls']._serialized_options = b'\310\336\037\000'
  _ENTITIES._options = None
  _ENTITIES._serialized_options = b'\230\240\037\001\350\240\037\001'
  _TAG._options = None
  _TAG._serialized_options = b'\230\240\037\001\350\240\037\001'
  _URL._options = None
  _URL._serialized_options = b'\230\240\037\001\350\240\037\001'
  _ATTACHMENT.fields_by_name['subspace_id']._options = None
  _ATTACHMENT.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _ATTACHMENT.fields_by_name['section_id']._options = None
  _ATTACHMENT.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID'
  _ATTACHMENT.fields_by_name['post_id']._options = None
  _ATTACHMENT.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID'
  _ATTACHMENT.fields_by_name['id']._options = None
  _ATTACHMENT.fields_by_name['id']._serialized_options = b'\342\336\037\002ID'
  _ATTACHMENT.fields_by_name['content']._options = None
  _ATTACHMENT.fields_by_name['content']._serialized_options = b'\312\264-!desmos.posts.v1.AttachmentContent'
  _ATTACHMENT._options = None
  _ATTACHMENT._serialized_options = b'\230\240\037\001\350\240\037\001'
  _MEDIA._options = None
  _MEDIA._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.posts.v1.AttachmentContent'
  _POLL_PROVIDEDANSWER.fields_by_name['attachments']._options = None
  _POLL_PROVIDEDANSWER.fields_by_name['attachments']._serialized_options = b'\310\336\037\000'
  _POLL_PROVIDEDANSWER._options = None
  _POLL_PROVIDEDANSWER._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLL.fields_by_name['provided_answers']._options = None
  _POLL.fields_by_name['provided_answers']._serialized_options = b'\310\336\037\000'
  _POLL.fields_by_name['end_date']._options = None
  _POLL.fields_by_name['end_date']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _POLL._options = None
  _POLL._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.posts.v1.AttachmentContent'
  _USERANSWER.fields_by_name['subspace_id']._options = None
  _USERANSWER.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _USERANSWER.fields_by_name['section_id']._options = None
  _USERANSWER.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID'
  _USERANSWER.fields_by_name['post_id']._options = None
  _USERANSWER.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID'
  _USERANSWER.fields_by_name['poll_id']._options = None
  _USERANSWER.fields_by_name['poll_id']._serialized_options = b'\342\336\037\006PollID'
  _USERANSWER._options = None
  _USERANSWER._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLLTALLYRESULTS_ANSWERRESULT._options = None
  _POLLTALLYRESULTS_ANSWERRESULT._serialized_options = b'\230\240\037\001\350\240\037\001'
  _POLLTALLYRESULTS.fields_by_name['results']._options = None
  _POLLTALLYRESULTS.fields_by_name['results']._serialized_options = b'\310\336\037\000'
  _POLLTALLYRESULTS._options = None
  _POLLTALLYRESULTS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_POSTREFERENCETYPE']._serialized_start=2743
  _globals['_POSTREFERENCETYPE']._serialized_end=2899
  _globals['_REPLYSETTING']._serialized_start=2902
  _globals['_REPLYSETTING']._serialized_end=3064
  _globals['_POST']._serialized_start=159
  _globals['_POST']._serialized_end=805
  _globals['_POSTREFERENCE']._serialized_start=808
  _globals['_POSTREFERENCE']._serialized_end=954
  _globals['_ENTITIES']._serialized_start=957
  _globals['_ENTITIES']._serialized_end=1137
  _globals['_TAG']._serialized_start=1139
  _globals['_TAG']._serialized_end=1212
  _globals['_URL']._serialized_start=1214
  _globals['_URL']._serialized_end=1320
  _globals['_ATTACHMENT']._serialized_start=1323
  _globals['_ATTACHMENT']._serialized_end=1588
  _globals['_MEDIA']._serialized_start=1590
  _globals['_MEDIA']._serialized_end=1691
  _globals['_POLL']._serialized_start=1694
  _globals['_POLL']._serialized_end=2231
  _globals['_POLL_PROVIDEDANSWER']._serialized_start=2069
  _globals['_POLL_PROVIDEDANSWER']._serialized_end=2184
  _globals['_USERANSWER']._serialized_start=2234
  _globals['_USERANSWER']._serialized_end=2486
  _globals['_POLLTALLYRESULTS']._serialized_start=2489
  _globals['_POLLTALLYRESULTS']._serialized_end=2680
  _globals['_POLLTALLYRESULTS_ANSWERRESULT']._serialized_start=2589
  _globals['_POLLTALLYRESULTS_ANSWERRESULT']._serialized_end=2670
  _globals['_PARAMS']._serialized_start=2682
  _globals['_PARAMS']._serialized_end=2740
# @@protoc_insertion_point(module_scope)