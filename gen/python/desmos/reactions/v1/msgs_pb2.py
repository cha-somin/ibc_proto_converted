# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/reactions/v1/msgs.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from desmos.reactions.v1 import models_pb2 as desmos_dot_reactions_dot_v1_dot_models__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x64\x65smos/reactions/v1/msgs.proto\x12\x13\x64\x65smos.reactions.v1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a desmos/reactions/v1/models.proto\"\x96\x02\n\x0eMsgAddReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12\x61\n\x05value\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyB5\xf2\xde\x1f\x0cyaml:\"value\"\xca\xb4-!desmos.reactions.v1.ReactionValueR\x05value\x12#\n\x04user\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"_\n\x16MsgAddReactionResponse\x12\x45\n\x0breaction_id\x18\x01 \x01(\rB$\xe2\xde\x1f\nReactionID\xf2\xde\x1f\x12yaml:\"reaction_id\"R\nreactionId\"\xfd\x01\n\x11MsgRemoveReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12\x45\n\x0breaction_id\x18\x03 \x01(\rB$\xe2\xde\x1f\nReactionID\xf2\xde\x1f\x12yaml:\"reaction_id\"R\nreactionId\x12#\n\x04user\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"\x1b\n\x19MsgRemoveReactionResponse\"\x87\x02\n\x18MsgAddRegisteredReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12@\n\x0eshorthand_code\x18\x02 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"shorthand_code\"R\rshorthandCode\x12=\n\rdisplay_value\x18\x03 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"display_value\"R\x0c\x64isplayValue\x12#\n\x04user\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"\x93\x01\n MsgAddRegisteredReactionResponse\x12o\n\x16registered_reaction_id\x18\x01 \x01(\rB9\xe2\xde\x1f\x14RegisteredReactionID\xf2\xde\x1f\x1dyaml:\"registered_reaction_id\"R\x14registeredReactionId\"\xf9\x02\n\x19MsgEditRegisteredReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12o\n\x16registered_reaction_id\x18\x02 \x01(\rB9\xe2\xde\x1f\x14RegisteredReactionID\xf2\xde\x1f\x1dyaml:\"registered_reaction_id\"R\x14registeredReactionId\x12@\n\x0eshorthand_code\x18\x03 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"shorthand_code\"R\rshorthandCode\x12=\n\rdisplay_value\x18\x04 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"display_value\"R\x0c\x64isplayValue\x12#\n\x04user\x18\x05 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"#\n!MsgEditRegisteredReactionResponse\"\xfa\x01\n\x1bMsgRemoveRegisteredReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12o\n\x16registered_reaction_id\x18\x02 \x01(\rB9\xe2\xde\x1f\x14RegisteredReactionID\xf2\xde\x1f\x1dyaml:\"registered_reaction_id\"R\x14registeredReactionId\x12#\n\x04user\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"%\n#MsgRemoveRegisteredReactionResponse\"\xee\x02\n\x15MsgSetReactionsParams\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x87\x01\n\x13registered_reaction\x18\x02 \x01(\x0b\x32\x32.desmos.reactions.v1.RegisteredReactionValueParamsB\"\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"registered_reaction\"R\x12registeredReaction\x12_\n\tfree_text\x18\x03 \x01(\x0b\x32(.desmos.reactions.v1.FreeTextValueParamsB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"free_text\"R\x08\x66reeText\x12#\n\x04user\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\"\x1f\n\x1dMsgSetReactionsParamsResponse2\xd1\x05\n\x03Msg\x12_\n\x0b\x41\x64\x64Reaction\x12#.desmos.reactions.v1.MsgAddReaction\x1a+.desmos.reactions.v1.MsgAddReactionResponse\x12h\n\x0eRemoveReaction\x12&.desmos.reactions.v1.MsgRemoveReaction\x1a..desmos.reactions.v1.MsgRemoveReactionResponse\x12}\n\x15\x41\x64\x64RegisteredReaction\x12-.desmos.reactions.v1.MsgAddRegisteredReaction\x1a\x35.desmos.reactions.v1.MsgAddRegisteredReactionResponse\x12\x80\x01\n\x16\x45\x64itRegisteredReaction\x12..desmos.reactions.v1.MsgEditRegisteredReaction\x1a\x36.desmos.reactions.v1.MsgEditRegisteredReactionResponse\x12\x86\x01\n\x18RemoveRegisteredReaction\x12\x30.desmos.reactions.v1.MsgRemoveRegisteredReaction\x1a\x38.desmos.reactions.v1.MsgRemoveRegisteredReactionResponse\x12t\n\x12SetReactionsParams\x12*.desmos.reactions.v1.MsgSetReactionsParams\x1a\x32.desmos.reactions.v1.MsgSetReactionsParamsResponseB\xc6\x01\n\x17\x63om.desmos.reactions.v1B\tMsgsProtoP\x01Z2github.com/desmos-labs/desmos/v5/x/reactions/types\xa2\x02\x03\x44RX\xaa\x02\x13\x44\x65smos.Reactions.V1\xca\x02\x13\x44\x65smos\\Reactions\\V1\xe2\x02\x1f\x44\x65smos\\Reactions\\V1\\GPBMetadata\xea\x02\x15\x44\x65smos::Reactions::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.reactions.v1.msgs_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.desmos.reactions.v1B\tMsgsProtoP\001Z2github.com/desmos-labs/desmos/v5/x/reactions/types\242\002\003DRX\252\002\023Desmos.Reactions.V1\312\002\023Desmos\\Reactions\\V1\342\002\037Desmos\\Reactions\\V1\\GPBMetadata\352\002\025Desmos::Reactions::V1'
  _MSGADDREACTION.fields_by_name['subspace_id']._options = None
  _MSGADDREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGADDREACTION.fields_by_name['post_id']._options = None
  _MSGADDREACTION.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _MSGADDREACTION.fields_by_name['value']._options = None
  _MSGADDREACTION.fields_by_name['value']._serialized_options = b'\362\336\037\014yaml:\"value\"\312\264-!desmos.reactions.v1.ReactionValue'
  _MSGADDREACTION.fields_by_name['user']._options = None
  _MSGADDREACTION.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGADDREACTIONRESPONSE.fields_by_name['reaction_id']._options = None
  _MSGADDREACTIONRESPONSE.fields_by_name['reaction_id']._serialized_options = b'\342\336\037\nReactionID\362\336\037\022yaml:\"reaction_id\"'
  _MSGREMOVEREACTION.fields_by_name['subspace_id']._options = None
  _MSGREMOVEREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGREMOVEREACTION.fields_by_name['post_id']._options = None
  _MSGREMOVEREACTION.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _MSGREMOVEREACTION.fields_by_name['reaction_id']._options = None
  _MSGREMOVEREACTION.fields_by_name['reaction_id']._serialized_options = b'\342\336\037\nReactionID\362\336\037\022yaml:\"reaction_id\"'
  _MSGREMOVEREACTION.fields_by_name['user']._options = None
  _MSGREMOVEREACTION.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGADDREGISTEREDREACTION.fields_by_name['subspace_id']._options = None
  _MSGADDREGISTEREDREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGADDREGISTEREDREACTION.fields_by_name['shorthand_code']._options = None
  _MSGADDREGISTEREDREACTION.fields_by_name['shorthand_code']._serialized_options = b'\362\336\037\025yaml:\"shorthand_code\"'
  _MSGADDREGISTEREDREACTION.fields_by_name['display_value']._options = None
  _MSGADDREGISTEREDREACTION.fields_by_name['display_value']._serialized_options = b'\362\336\037\024yaml:\"display_value\"'
  _MSGADDREGISTEREDREACTION.fields_by_name['user']._options = None
  _MSGADDREGISTEREDREACTION.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGADDREGISTEREDREACTIONRESPONSE.fields_by_name['registered_reaction_id']._options = None
  _MSGADDREGISTEREDREACTIONRESPONSE.fields_by_name['registered_reaction_id']._serialized_options = b'\342\336\037\024RegisteredReactionID\362\336\037\035yaml:\"registered_reaction_id\"'
  _MSGEDITREGISTEREDREACTION.fields_by_name['subspace_id']._options = None
  _MSGEDITREGISTEREDREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGEDITREGISTEREDREACTION.fields_by_name['registered_reaction_id']._options = None
  _MSGEDITREGISTEREDREACTION.fields_by_name['registered_reaction_id']._serialized_options = b'\342\336\037\024RegisteredReactionID\362\336\037\035yaml:\"registered_reaction_id\"'
  _MSGEDITREGISTEREDREACTION.fields_by_name['shorthand_code']._options = None
  _MSGEDITREGISTEREDREACTION.fields_by_name['shorthand_code']._serialized_options = b'\362\336\037\025yaml:\"shorthand_code\"'
  _MSGEDITREGISTEREDREACTION.fields_by_name['display_value']._options = None
  _MSGEDITREGISTEREDREACTION.fields_by_name['display_value']._serialized_options = b'\362\336\037\024yaml:\"display_value\"'
  _MSGEDITREGISTEREDREACTION.fields_by_name['user']._options = None
  _MSGEDITREGISTEREDREACTION.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['subspace_id']._options = None
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['registered_reaction_id']._options = None
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['registered_reaction_id']._serialized_options = b'\342\336\037\024RegisteredReactionID\362\336\037\035yaml:\"registered_reaction_id\"'
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['user']._options = None
  _MSGREMOVEREGISTEREDREACTION.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGSETREACTIONSPARAMS.fields_by_name['subspace_id']._options = None
  _MSGSETREACTIONSPARAMS.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGSETREACTIONSPARAMS.fields_by_name['registered_reaction']._options = None
  _MSGSETREACTIONSPARAMS.fields_by_name['registered_reaction']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"registered_reaction\"'
  _MSGSETREACTIONSPARAMS.fields_by_name['free_text']._options = None
  _MSGSETREACTIONSPARAMS.fields_by_name['free_text']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"free_text\"'
  _MSGSETREACTIONSPARAMS.fields_by_name['user']._options = None
  _MSGSETREACTIONSPARAMS.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _globals['_MSGADDREACTION']._serialized_start=166
  _globals['_MSGADDREACTION']._serialized_end=444
  _globals['_MSGADDREACTIONRESPONSE']._serialized_start=446
  _globals['_MSGADDREACTIONRESPONSE']._serialized_end=541
  _globals['_MSGREMOVEREACTION']._serialized_start=544
  _globals['_MSGREMOVEREACTION']._serialized_end=797
  _globals['_MSGREMOVEREACTIONRESPONSE']._serialized_start=799
  _globals['_MSGREMOVEREACTIONRESPONSE']._serialized_end=826
  _globals['_MSGADDREGISTEREDREACTION']._serialized_start=829
  _globals['_MSGADDREGISTEREDREACTION']._serialized_end=1092
  _globals['_MSGADDREGISTEREDREACTIONRESPONSE']._serialized_start=1095
  _globals['_MSGADDREGISTEREDREACTIONRESPONSE']._serialized_end=1242
  _globals['_MSGEDITREGISTEREDREACTION']._serialized_start=1245
  _globals['_MSGEDITREGISTEREDREACTION']._serialized_end=1622
  _globals['_MSGEDITREGISTEREDREACTIONRESPONSE']._serialized_start=1624
  _globals['_MSGEDITREGISTEREDREACTIONRESPONSE']._serialized_end=1659
  _globals['_MSGREMOVEREGISTEREDREACTION']._serialized_start=1662
  _globals['_MSGREMOVEREGISTEREDREACTION']._serialized_end=1912
  _globals['_MSGREMOVEREGISTEREDREACTIONRESPONSE']._serialized_start=1914
  _globals['_MSGREMOVEREGISTEREDREACTIONRESPONSE']._serialized_end=1951
  _globals['_MSGSETREACTIONSPARAMS']._serialized_start=1954
  _globals['_MSGSETREACTIONSPARAMS']._serialized_end=2320
  _globals['_MSGSETREACTIONSPARAMSRESPONSE']._serialized_start=2322
  _globals['_MSGSETREACTIONSPARAMSRESPONSE']._serialized_end=2353
  _globals['_MSG']._serialized_start=2356
  _globals['_MSG']._serialized_end=3077
# @@protoc_insertion_point(module_scope)
