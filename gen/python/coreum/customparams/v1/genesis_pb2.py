# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/customparams/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from coreum.customparams.v1 import params_pb2 as coreum_dot_customparams_dot_v1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$coreum/customparams/v1/genesis.proto\x12\x16\x63oreum.customparams.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a#coreum/customparams/v1/params.proto\"b\n\x0cGenesisState\x12R\n\x0estaking_params\x18\x01 \x01(\x0b\x32%.coreum.customparams.v1.StakingParamsB\x04\xc8\xde\x1f\x00R\rstakingParamsB\xdd\x01\n\x1a\x63om.coreum.customparams.v1B\x0cGenesisProtoP\x01Z7github.com/CoreumFoundation/coreum/x/customparams/types\xa2\x02\x03\x43\x43X\xaa\x02\x16\x43oreum.Customparams.V1\xca\x02\x16\x43oreum\\Customparams\\V1\xe2\x02\"Coreum\\Customparams\\V1\\GPBMetadata\xea\x02\x18\x43oreum::Customparams::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.customparams.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.coreum.customparams.v1B\014GenesisProtoP\001Z7github.com/CoreumFoundation/coreum/x/customparams/types\242\002\003CCX\252\002\026Coreum.Customparams.V1\312\002\026Coreum\\Customparams\\V1\342\002\"Coreum\\Customparams\\V1\\GPBMetadata\352\002\030Coreum::Customparams::V1'
  _GENESISSTATE.fields_by_name['staking_params']._options = None
  _GENESISSTATE.fields_by_name['staking_params']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=155
  _globals['_GENESISSTATE']._serialized_end=253
# @@protoc_insertion_point(module_scope)
