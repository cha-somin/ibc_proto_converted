# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: band/oracle/v1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from band.oracle.v1 import oracle_pb2 as band_dot_oracle_dot_v1_dot_oracle__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x62\x61nd/oracle/v1/genesis.proto\x12\toracle.v1\x1a\x14gogoproto/gogo.proto\x1a\x1b\x62\x61nd/oracle/v1/oracle.proto\"\xc5\x01\n\x0cGenesisState\x12/\n\x06params\x18\x01 \x01(\x0b\x32\x11.oracle.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12>\n\x0c\x64\x61ta_sources\x18\x02 \x03(\x0b\x32\x15.oracle.v1.DataSourceB\x04\xc8\xde\x1f\x00R\x0b\x64\x61taSources\x12\x44\n\x0eoracle_scripts\x18\x03 \x03(\x0b\x32\x17.oracle.v1.OracleScriptB\x04\xc8\xde\x1f\x00R\roracleScriptsB\x93\x01\n\rcom.oracle.v1B\x0cGenesisProtoP\x01Z/github.com/bandprotocol/chain/v2/x/oracle/types\xa2\x02\x03OXX\xaa\x02\tOracle.V1\xca\x02\tOracle\\V1\xe2\x02\x15Oracle\\V1\\GPBMetadata\xea\x02\nOracle::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'band.oracle.v1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\rcom.oracle.v1B\014GenesisProtoP\001Z/github.com/bandprotocol/chain/v2/x/oracle/types\242\002\003OXX\252\002\tOracle.V1\312\002\tOracle\\V1\342\002\025Oracle\\V1\\GPBMetadata\352\002\nOracle::V1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['data_sources']._options = None
  _GENESISSTATE.fields_by_name['data_sources']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['oracle_scripts']._options = None
  _GENESISSTATE.fields_by_name['oracle_scripts']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=95
  _globals['_GENESISSTATE']._serialized_end=292
# @@protoc_insertion_point(module_scope)
