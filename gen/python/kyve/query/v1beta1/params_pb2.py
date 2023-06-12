# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/query/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.gov.v1 import query_pb2 as cosmos_dot_gov_dot_v1_dot_query__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from kyve.bundles.v1beta1 import params_pb2 as kyve_dot_bundles_dot_v1beta1_dot_params__pb2
from kyve.delegation.v1beta1 import params_pb2 as kyve_dot_delegation_dot_v1beta1_dot_params__pb2
import importlib
kyve_dot_global_dot_v1beta1_dot_global__pb2 = importlib.import_module('kyve.global.v1beta1.global_pb2')
from kyve.stakers.v1beta1 import params_pb2 as kyve_dot_stakers_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1fkyve/query/v1beta1/params.proto\x12\x12kyve.query.v1beta1\x1a\x19\x63osmos/gov/v1/query.proto\x1a\x1cgoogle/api/annotations.proto\x1a!kyve/bundles/v1beta1/params.proto\x1a$kyve/delegation/v1beta1/params.proto\x1a kyve/global/v1beta1/global.proto\x1a!kyve/stakers/v1beta1/params.proto\"\x14\n\x12QueryParamsRequest\"\xf2\x02\n\x13QueryParamsResponse\x12\x43\n\x0e\x62undles_params\x18\x01 \x01(\x0b\x32\x1c.kyve.bundles.v1beta1.ParamsR\rbundlesParams\x12L\n\x11\x64\x65legation_params\x18\x02 \x01(\x0b\x32\x1f.kyve.delegation.v1beta1.ParamsR\x10\x64\x65legationParams\x12@\n\rglobal_params\x18\x03 \x01(\x0b\x32\x1b.kyve.global.v1beta1.ParamsR\x0cglobalParams\x12\x41\n\ngov_params\x18\x04 \x01(\x0b\x32\".cosmos.gov.v1.QueryParamsResponseR\tgovParams\x12\x43\n\x0estakers_params\x18\x05 \x01(\x0b\x32\x1c.kyve.stakers.v1beta1.ParamsR\rstakersParams2\x8c\x01\n\x0bQueryParams\x12}\n\x06Params\x12&.kyve.query.v1beta1.QueryParamsRequest\x1a\'.kyve.query.v1beta1.QueryParamsResponse\"\"\x82\xd3\xe4\x93\x02\x1c\x12\x1a/kyve/query/v1beta1/paramsB\xbb\x01\n\x16\x63om.kyve.query.v1beta1B\x0bParamsProtoP\x01Z*github.com/KYVENetwork/chain/x/query/types\xa2\x02\x03KQX\xaa\x02\x12Kyve.Query.V1beta1\xca\x02\x12Kyve\\Query\\V1beta1\xe2\x02\x1eKyve\\Query\\V1beta1\\GPBMetadata\xea\x02\x14Kyve::Query::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.query.v1beta1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.kyve.query.v1beta1B\013ParamsProtoP\001Z*github.com/KYVENetwork/chain/x/query/types\242\002\003KQX\252\002\022Kyve.Query.V1beta1\312\002\022Kyve\\Query\\V1beta1\342\002\036Kyve\\Query\\V1beta1\\GPBMetadata\352\002\024Kyve::Query::V1beta1'
  _QUERYPARAMS.methods_by_name['Params']._options = None
  _QUERYPARAMS.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\034\022\032/kyve/query/v1beta1/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=254
  _globals['_QUERYPARAMSREQUEST']._serialized_end=274
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=277
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=647
  _globals['_QUERYPARAMS']._serialized_start=650
  _globals['_QUERYPARAMS']._serialized_end=790
# @@protoc_insertion_point(module_scope)
