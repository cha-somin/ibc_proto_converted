# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/relationships/v1/models.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$desmos/relationships/v1/models.proto\x12\x17\x64\x65smos.relationships.v1\x1a\x14gogoproto/gogo.proto\"\xca\x01\n\x0cRelationship\x12,\n\x07\x63reator\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\x12;\n\x0c\x63ounterparty\x18\x02 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"counterparty\"R\x0c\x63ounterparty\x12\x45\n\x0bsubspace_id\x18\x03 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xe3\x01\n\tUserBlock\x12,\n\x07\x62locker\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"blocker\"R\x07\x62locker\x12,\n\x07\x62locked\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"blocked\"R\x07\x62locked\x12)\n\x06reason\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"reason\"R\x06reason\x12\x45\n\x0bsubspace_id\x18\x04 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xe0\x01\n\x1b\x63om.desmos.relationships.v1B\x0bModelsProtoP\x01Z6github.com/desmos-labs/desmos/v5/x/relationships/types\xa2\x02\x03\x44RX\xaa\x02\x17\x44\x65smos.Relationships.V1\xca\x02\x17\x44\x65smos\\Relationships\\V1\xe2\x02#Desmos\\Relationships\\V1\\GPBMetadata\xea\x02\x19\x44\x65smos::Relationships::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.relationships.v1.models_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.desmos.relationships.v1B\013ModelsProtoP\001Z6github.com/desmos-labs/desmos/v5/x/relationships/types\242\002\003DRX\252\002\027Desmos.Relationships.V1\312\002\027Desmos\\Relationships\\V1\342\002#Desmos\\Relationships\\V1\\GPBMetadata\352\002\031Desmos::Relationships::V1'
  _RELATIONSHIP.fields_by_name['creator']._options = None
  _RELATIONSHIP.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _RELATIONSHIP.fields_by_name['counterparty']._options = None
  _RELATIONSHIP.fields_by_name['counterparty']._serialized_options = b'\362\336\037\023yaml:\"counterparty\"'
  _RELATIONSHIP.fields_by_name['subspace_id']._options = None
  _RELATIONSHIP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _RELATIONSHIP._options = None
  _RELATIONSHIP._serialized_options = b'\230\240\037\001\350\240\037\001'
  _USERBLOCK.fields_by_name['blocker']._options = None
  _USERBLOCK.fields_by_name['blocker']._serialized_options = b'\362\336\037\016yaml:\"blocker\"'
  _USERBLOCK.fields_by_name['blocked']._options = None
  _USERBLOCK.fields_by_name['blocked']._serialized_options = b'\362\336\037\016yaml:\"blocked\"'
  _USERBLOCK.fields_by_name['reason']._options = None
  _USERBLOCK.fields_by_name['reason']._serialized_options = b'\362\336\037\ryaml:\"reason\"'
  _USERBLOCK.fields_by_name['subspace_id']._options = None
  _USERBLOCK.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _USERBLOCK._options = None
  _USERBLOCK._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_RELATIONSHIP']._serialized_start=88
  _globals['_RELATIONSHIP']._serialized_end=290
  _globals['_USERBLOCK']._serialized_start=293
  _globals['_USERBLOCK']._serialized_end=520
# @@protoc_insertion_point(module_scope)