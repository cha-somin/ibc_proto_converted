# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/mint/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from crescent.mint.v1beta1 import mint_pb2 as crescent_dot_mint_dot_v1beta1_dot_mint__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#crescent/mint/v1beta1/genesis.proto\x12\x15\x63rescent.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a crescent/mint/v1beta1/mint.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xaf\x01\n\x0cGenesisState\x12\x62\n\x0flast_block_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1e\xf2\xde\x1f\x16yaml:\"last_block_time\"\x90\xdf\x1f\x01R\rlastBlockTime\x12;\n\x06params\x18\x02 \x01(\x0b\x32\x1d.crescent.mint.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xd5\x01\n\x19\x63om.crescent.mint.v1beta1B\x0cGenesisProtoP\x01Z4github.com/crescent-network/crescent/v5/x/mint/types\xa2\x02\x03\x43MX\xaa\x02\x15\x43rescent.Mint.V1beta1\xca\x02\x15\x43rescent\\Mint\\V1beta1\xe2\x02!Crescent\\Mint\\V1beta1\\GPBMetadata\xea\x02\x17\x43rescent::Mint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.mint.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.crescent.mint.v1beta1B\014GenesisProtoP\001Z4github.com/crescent-network/crescent/v5/x/mint/types\242\002\003CMX\252\002\025Crescent.Mint.V1beta1\312\002\025Crescent\\Mint\\V1beta1\342\002!Crescent\\Mint\\V1beta1\\GPBMetadata\352\002\027Crescent::Mint::V1beta1'
  _GENESISSTATE.fields_by_name['last_block_time']._options = None
  _GENESISSTATE.fields_by_name['last_block_time']._serialized_options = b'\362\336\037\026yaml:\"last_block_time\"\220\337\037\001'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=152
  _globals['_GENESISSTATE']._serialized_end=327
# @@protoc_insertion_point(module_scope)
