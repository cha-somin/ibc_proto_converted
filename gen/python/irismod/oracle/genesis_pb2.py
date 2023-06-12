# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/oracle/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from irismod.oracle import oracle_pb2 as irismod_dot_oracle_dot_oracle__pb2
from irismod.service import service_pb2 as irismod_dot_service_dot_service__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cirismod/oracle/genesis.proto\x12\x0eirismod.oracle\x1a\x1birismod/oracle/oracle.proto\x1a\x1dirismod/service/service.proto\x1a\x14gogoproto/gogo.proto\"I\n\x0cGenesisState\x12\x39\n\x07\x65ntries\x18\x01 \x03(\x0b\x32\x19.irismod.oracle.FeedEntryB\x04\xc8\xde\x1f\x00R\x07\x65ntries\"\xb0\x01\n\tFeedEntry\x12.\n\x04\x66\x65\x65\x64\x18\x01 \x01(\x0b\x32\x14.irismod.oracle.FeedB\x04\xc8\xde\x1f\x00R\x04\x66\x65\x65\x64\x12:\n\x05state\x18\x02 \x01(\x0e\x32$.irismod.service.RequestContextStateR\x05state\x12\x37\n\x06values\x18\x03 \x03(\x0b\x32\x19.irismod.oracle.FeedValueB\x04\xc8\xde\x1f\x00R\x06valuesB\xac\x01\n\x12\x63om.irismod.oracleB\x0cGenesisProtoP\x01Z/github.com/irisnet/irismod/modules/oracle/types\xa2\x02\x03IOX\xaa\x02\x0eIrismod.Oracle\xca\x02\x0eIrismod\\Oracle\xe2\x02\x1aIrismod\\Oracle\\GPBMetadata\xea\x02\x0fIrismod::Oracleb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.oracle.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.irismod.oracleB\014GenesisProtoP\001Z/github.com/irisnet/irismod/modules/oracle/types\242\002\003IOX\252\002\016Irismod.Oracle\312\002\016Irismod\\Oracle\342\002\032Irismod\\Oracle\\GPBMetadata\352\002\017Irismod::Oracle'
  _GENESISSTATE.fields_by_name['entries']._options = None
  _GENESISSTATE.fields_by_name['entries']._serialized_options = b'\310\336\037\000'
  _FEEDENTRY.fields_by_name['feed']._options = None
  _FEEDENTRY.fields_by_name['feed']._serialized_options = b'\310\336\037\000'
  _FEEDENTRY.fields_by_name['values']._options = None
  _FEEDENTRY.fields_by_name['values']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=130
  _globals['_GENESISSTATE']._serialized_end=203
  _globals['_FEEDENTRY']._serialized_start=206
  _globals['_FEEDENTRY']._serialized_end=382
# @@protoc_insertion_point(module_scope)
