# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/reactions/v1/models.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n desmos/reactions/v1/models.proto\x12\x13\x64\x65smos.reactions.v1\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xc5\x02\n\x08Reaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x35\n\x07post_id\x18\x02 \x01(\x04\x42\x1c\xe2\xde\x1f\x06PostID\xf2\xde\x1f\x0eyaml:\"post_id\"R\x06postId\x12#\n\x02id\x18\x03 \x01(\rB\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12\x61\n\x05value\x18\x04 \x01(\x0b\x32\x14.google.protobuf.AnyB5\xf2\xde\x1f\x0cyaml:\"value\"\xca\xb4-!desmos.reactions.v1.ReactionValueR\x05value\x12)\n\x06\x61uthor\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"author\"R\x06\x61uthor:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xb9\x01\n\x17RegisteredReactionValue\x12o\n\x16registered_reaction_id\x18\x01 \x01(\rB9\xe2\xde\x1f\x14RegisteredReactionID\xf2\xde\x1f\x1dyaml:\"registered_reaction_id\"R\x14registeredReactionId:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.reactions.v1.ReactionValue\"c\n\rFreeTextValue\x12#\n\x04text\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"text\"R\x04text:-\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\xca\xb4-!desmos.reactions.v1.ReactionValue\"\x8b\x02\n\x12RegisteredReaction\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12#\n\x02id\x18\x02 \x01(\rB\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12@\n\x0eshorthand_code\x18\x03 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"shorthand_code\"R\rshorthandCode\x12=\n\rdisplay_value\x18\x04 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"display_value\"R\x0c\x64isplayValue:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xd5\x02\n\x17SubspaceReactionsParams\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x87\x01\n\x13registered_reaction\x18\x02 \x01(\x0b\x32\x32.desmos.reactions.v1.RegisteredReactionValueParamsB\"\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"registered_reaction\"R\x12registeredReaction\x12_\n\tfree_text\x18\x03 \x01(\x0b\x32(.desmos.reactions.v1.FreeTextValueParamsB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"free_text\"R\x08\x66reeText:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xad\x01\n\x13\x46reeTextValueParams\x12,\n\x07\x65nabled\x18\x01 \x01(\x08\x42\x12\xf2\xde\x1f\x0eyaml:\"enabled\"R\x07\x65nabled\x12\x34\n\nmax_length\x18\x02 \x01(\rB\x15\xf2\xde\x1f\x11yaml:\"max_length\"R\tmaxLength\x12(\n\x06reg_ex\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"reg_ex\"R\x05regEx:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"W\n\x1dRegisteredReactionValueParams\x12,\n\x07\x65nabled\x18\x01 \x01(\x08\x42\x12\xf2\xde\x1f\x0eyaml:\"enabled\"R\x07\x65nabled:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xc8\x01\n\x17\x63om.desmos.reactions.v1B\x0bModelsProtoP\x01Z2github.com/desmos-labs/desmos/v5/x/reactions/types\xa2\x02\x03\x44RX\xaa\x02\x13\x44\x65smos.Reactions.V1\xca\x02\x13\x44\x65smos\\Reactions\\V1\xe2\x02\x1f\x44\x65smos\\Reactions\\V1\\GPBMetadata\xea\x02\x15\x44\x65smos::Reactions::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.reactions.v1.models_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.desmos.reactions.v1B\013ModelsProtoP\001Z2github.com/desmos-labs/desmos/v5/x/reactions/types\242\002\003DRX\252\002\023Desmos.Reactions.V1\312\002\023Desmos\\Reactions\\V1\342\002\037Desmos\\Reactions\\V1\\GPBMetadata\352\002\025Desmos::Reactions::V1'
  _REACTION.fields_by_name['subspace_id']._options = None
  _REACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _REACTION.fields_by_name['post_id']._options = None
  _REACTION.fields_by_name['post_id']._serialized_options = b'\342\336\037\006PostID\362\336\037\016yaml:\"post_id\"'
  _REACTION.fields_by_name['id']._options = None
  _REACTION.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _REACTION.fields_by_name['value']._options = None
  _REACTION.fields_by_name['value']._serialized_options = b'\362\336\037\014yaml:\"value\"\312\264-!desmos.reactions.v1.ReactionValue'
  _REACTION.fields_by_name['author']._options = None
  _REACTION.fields_by_name['author']._serialized_options = b'\362\336\037\ryaml:\"author\"'
  _REACTION._options = None
  _REACTION._serialized_options = b'\230\240\037\001\350\240\037\001'
  _REGISTEREDREACTIONVALUE.fields_by_name['registered_reaction_id']._options = None
  _REGISTEREDREACTIONVALUE.fields_by_name['registered_reaction_id']._serialized_options = b'\342\336\037\024RegisteredReactionID\362\336\037\035yaml:\"registered_reaction_id\"'
  _REGISTEREDREACTIONVALUE._options = None
  _REGISTEREDREACTIONVALUE._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.reactions.v1.ReactionValue'
  _FREETEXTVALUE.fields_by_name['text']._options = None
  _FREETEXTVALUE.fields_by_name['text']._serialized_options = b'\362\336\037\013yaml:\"text\"'
  _FREETEXTVALUE._options = None
  _FREETEXTVALUE._serialized_options = b'\230\240\037\001\350\240\037\001\312\264-!desmos.reactions.v1.ReactionValue'
  _REGISTEREDREACTION.fields_by_name['subspace_id']._options = None
  _REGISTEREDREACTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _REGISTEREDREACTION.fields_by_name['id']._options = None
  _REGISTEREDREACTION.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _REGISTEREDREACTION.fields_by_name['shorthand_code']._options = None
  _REGISTEREDREACTION.fields_by_name['shorthand_code']._serialized_options = b'\362\336\037\025yaml:\"shorthand_code\"'
  _REGISTEREDREACTION.fields_by_name['display_value']._options = None
  _REGISTEREDREACTION.fields_by_name['display_value']._serialized_options = b'\362\336\037\024yaml:\"display_value\"'
  _REGISTEREDREACTION._options = None
  _REGISTEREDREACTION._serialized_options = b'\230\240\037\001\350\240\037\001'
  _SUBSPACEREACTIONSPARAMS.fields_by_name['subspace_id']._options = None
  _SUBSPACEREACTIONSPARAMS.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _SUBSPACEREACTIONSPARAMS.fields_by_name['registered_reaction']._options = None
  _SUBSPACEREACTIONSPARAMS.fields_by_name['registered_reaction']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"registered_reaction\"'
  _SUBSPACEREACTIONSPARAMS.fields_by_name['free_text']._options = None
  _SUBSPACEREACTIONSPARAMS.fields_by_name['free_text']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"free_text\"'
  _SUBSPACEREACTIONSPARAMS._options = None
  _SUBSPACEREACTIONSPARAMS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _FREETEXTVALUEPARAMS.fields_by_name['enabled']._options = None
  _FREETEXTVALUEPARAMS.fields_by_name['enabled']._serialized_options = b'\362\336\037\016yaml:\"enabled\"'
  _FREETEXTVALUEPARAMS.fields_by_name['max_length']._options = None
  _FREETEXTVALUEPARAMS.fields_by_name['max_length']._serialized_options = b'\362\336\037\021yaml:\"max_length\"'
  _FREETEXTVALUEPARAMS.fields_by_name['reg_ex']._options = None
  _FREETEXTVALUEPARAMS.fields_by_name['reg_ex']._serialized_options = b'\362\336\037\ryaml:\"reg_ex\"'
  _FREETEXTVALUEPARAMS._options = None
  _FREETEXTVALUEPARAMS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _REGISTEREDREACTIONVALUEPARAMS.fields_by_name['enabled']._options = None
  _REGISTEREDREACTIONVALUEPARAMS.fields_by_name['enabled']._serialized_options = b'\362\336\037\016yaml:\"enabled\"'
  _REGISTEREDREACTIONVALUEPARAMS._options = None
  _REGISTEREDREACTIONVALUEPARAMS._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_REACTION']._serialized_start=134
  _globals['_REACTION']._serialized_end=459
  _globals['_REGISTEREDREACTIONVALUE']._serialized_start=462
  _globals['_REGISTEREDREACTIONVALUE']._serialized_end=647
  _globals['_FREETEXTVALUE']._serialized_start=649
  _globals['_FREETEXTVALUE']._serialized_end=748
  _globals['_REGISTEREDREACTION']._serialized_start=751
  _globals['_REGISTEREDREACTION']._serialized_end=1018
  _globals['_SUBSPACEREACTIONSPARAMS']._serialized_start=1021
  _globals['_SUBSPACEREACTIONSPARAMS']._serialized_end=1362
  _globals['_FREETEXTVALUEPARAMS']._serialized_start=1365
  _globals['_FREETEXTVALUEPARAMS']._serialized_end=1538
  _globals['_REGISTEREDREACTIONVALUEPARAMS']._serialized_start=1540
  _globals['_REGISTEREDREACTIONVALUEPARAMS']._serialized_end=1627
# @@protoc_insertion_point(module_scope)