# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/relationships/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from desmos.relationships.v1 import models_pb2 as desmos_dot_relationships_dot_v1_dot_models__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%desmos/relationships/v1/genesis.proto\x12\x17\x64\x65smos.relationships.v1\x1a\x14gogoproto/gogo.proto\x1a$desmos/relationships/v1/models.proto\"\xd2\x01\n\x0cGenesisState\x12i\n\rrelationships\x18\x01 \x03(\x0b\x32%.desmos.relationships.v1.RelationshipB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"relationships\"R\rrelationships\x12Q\n\x06\x62locks\x18\x02 \x03(\x0b\x32\".desmos.relationships.v1.UserBlockB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"blocks\"R\x06\x62locks:\x04\x88\xa0\x1f\x00\x42\xe1\x01\n\x1b\x63om.desmos.relationships.v1B\x0cGenesisProtoP\x01Z6github.com/desmos-labs/desmos/v5/x/relationships/types\xa2\x02\x03\x44RX\xaa\x02\x17\x44\x65smos.Relationships.V1\xca\x02\x17\x44\x65smos\\Relationships\\V1\xe2\x02#Desmos\\Relationships\\V1\\GPBMetadata\xea\x02\x19\x44\x65smos::Relationships::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.relationships.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.desmos.relationships.v1B\014GenesisProtoP\001Z6github.com/desmos-labs/desmos/v5/x/relationships/types\242\002\003DRX\252\002\027Desmos.Relationships.V1\312\002\027Desmos\\Relationships\\V1\342\002#Desmos\\Relationships\\V1\\GPBMetadata\352\002\031Desmos::Relationships::V1'
  _GENESISSTATE.fields_by_name['relationships']._options = None
  _GENESISSTATE.fields_by_name['relationships']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"relationships\"'
  _GENESISSTATE.fields_by_name['blocks']._options = None
  _GENESISSTATE.fields_by_name['blocks']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"blocks\"'
  _GENESISSTATE._options = None
  _GENESISSTATE._serialized_options = b'\210\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=127
  _globals['_GENESISSTATE']._serialized_end=337
# @@protoc_insertion_point(module_scope)
