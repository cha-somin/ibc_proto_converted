# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/profiles/v3/query_params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from desmos.profiles.v3 import models_params_pb2 as desmos_dot_profiles_dot_v3_dot_models__params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%desmos/profiles/v3/query_params.proto\x12\x12\x64\x65smos.profiles.v3\x1a\x14gogoproto/gogo.proto\x1a&desmos/profiles/v3/models_params.proto\"\x14\n\x12QueryParamsRequest\"O\n\x13QueryParamsResponse\x12\x38\n\x06params\x18\x01 \x01(\x0b\x32\x1a.desmos.profiles.v3.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xc7\x01\n\x16\x63om.desmos.profiles.v3B\x10QueryParamsProtoP\x01Z1github.com/desmos-labs/desmos/v5/x/profiles/types\xa2\x02\x03\x44PX\xaa\x02\x12\x44\x65smos.Profiles.V3\xca\x02\x12\x44\x65smos\\Profiles\\V3\xe2\x02\x1e\x44\x65smos\\Profiles\\V3\\GPBMetadata\xea\x02\x14\x44\x65smos::Profiles::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.profiles.v3.query_params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.desmos.profiles.v3B\020QueryParamsProtoP\001Z1github.com/desmos-labs/desmos/v5/x/profiles/types\242\002\003DPX\252\002\022Desmos.Profiles.V3\312\002\022Desmos\\Profiles\\V3\342\002\036Desmos\\Profiles\\V3\\GPBMetadata\352\002\024Desmos::Profiles::V3'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=123
  _globals['_QUERYPARAMSREQUEST']._serialized_end=143
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=145
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=224
# @@protoc_insertion_point(module_scope)
