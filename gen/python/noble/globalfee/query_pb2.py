# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: noble/globalfee/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from noble.globalfee import genesis_pb2 as noble_dot_globalfee_dot_genesis__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bnoble/globalfee/query.proto\x12\x0fnoble.globalfee\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1dnoble/globalfee/genesis.proto\"\x14\n\x12QueryParamsRequest\"L\n\x13QueryParamsResponse\x12\x35\n\x06params\x18\x01 \x01(\x0b\x32\x17.noble.globalfee.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x85\x01\n\x05Query\x12|\n\x06Params\x12#.noble.globalfee.QueryParamsRequest\x1a$.noble.globalfee.QueryParamsResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/noble/globalfee/v1beta1/paramsB\xb7\x01\n\x13\x63om.noble.globalfeeB\nQueryProtoP\x01Z7github.com/strangelove-ventures/noble/x/globalfee/types\xa2\x02\x03NGX\xaa\x02\x0fNoble.Globalfee\xca\x02\x0fNoble\\Globalfee\xe2\x02\x1bNoble\\Globalfee\\GPBMetadata\xea\x02\x10Noble::Globalfeeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'noble.globalfee.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.noble.globalfeeB\nQueryProtoP\001Z7github.com/strangelove-ventures/noble/x/globalfee/types\242\002\003NGX\252\002\017Noble.Globalfee\312\002\017Noble\\Globalfee\342\002\033Noble\\Globalfee\\GPBMetadata\352\002\020Noble::Globalfee'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002!\022\037/noble/globalfee/v1beta1/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=163
  _globals['_QUERYPARAMSREQUEST']._serialized_end=183
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=185
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=261
  _globals['_QUERY']._serialized_start=264
  _globals['_QUERY']._serialized_end=397
# @@protoc_insertion_point(module_scope)
