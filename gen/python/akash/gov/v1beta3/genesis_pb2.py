# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/gov/v1beta3/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.gov.v1beta3 import params_pb2 as akash_dot_gov_dot_v1beta3_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x61kash/gov/v1beta3/genesis.proto\x12\x11\x61kash.gov.v1beta3\x1a\x14gogoproto/gogo.proto\x1a\x1e\x61kash/gov/v1beta3/params.proto\"\x88\x01\n\x0cGenesisState\x12x\n\x0e\x64\x65posit_params\x18\x01 \x01(\x0b\x32 .akash.gov.v1beta3.DepositParamsB/\xc8\xde\x1f\x00\xea\xde\x1f\x0e\x64\x65posit_params\xf2\xde\x1f\x15yaml:\"deposit_params\"R\rdepositParamsB\xc3\x01\n\x15\x63om.akash.gov.v1beta3B\x0cGenesisProtoP\x01Z6github.com/akash-network/akash-api/go/node/gov/v1beta3\xa2\x02\x03\x41GX\xaa\x02\x11\x41kash.Gov.V1beta3\xca\x02\x11\x41kash\\Gov\\V1beta3\xe2\x02\x1d\x41kash\\Gov\\V1beta3\\GPBMetadata\xea\x02\x13\x41kash::Gov::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.gov.v1beta3.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.akash.gov.v1beta3B\014GenesisProtoP\001Z6github.com/akash-network/akash-api/go/node/gov/v1beta3\242\002\003AGX\252\002\021Akash.Gov.V1beta3\312\002\021Akash\\Gov\\V1beta3\342\002\035Akash\\Gov\\V1beta3\\GPBMetadata\352\002\023Akash::Gov::V1beta3'
  _GENESISSTATE.fields_by_name['deposit_params']._options = None
  _GENESISSTATE.fields_by_name['deposit_params']._serialized_options = b'\310\336\037\000\352\336\037\016deposit_params\362\336\037\025yaml:\"deposit_params\"'
  _globals['_GENESISSTATE']._serialized_start=109
  _globals['_GENESISSTATE']._serialized_end=245
# @@protoc_insertion_point(module_scope)