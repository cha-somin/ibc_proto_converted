# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/autopilot/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from stride.autopilot import params_pb2 as stride_dot_autopilot_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cstride/autopilot/query.proto\x12\x10stride.autopilot\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1dstride/autopilot/params.proto\"\x14\n\x12QueryParamsRequest\"M\n\x13QueryParamsResponse\x12\x36\n\x06params\x18\x01 \x01(\x0b\x32\x18.stride.autopilot.ParamsB\x04\xc8\xde\x1f\x00R\x06params2\x8d\x01\n\x05Query\x12\x83\x01\n\x06Params\x12$.stride.autopilot.QueryParamsRequest\x1a%.stride.autopilot.QueryParamsResponse\",\x82\xd3\xe4\x93\x02&\x12$/Stride-Labs/stride/autopilot/paramsB\xb7\x01\n\x14\x63om.stride.autopilotB\nQueryProtoP\x01Z2github.com/Stride-Labs/stride/v9/x/autopilot/types\xa2\x02\x03SAX\xaa\x02\x10Stride.Autopilot\xca\x02\x10Stride\\Autopilot\xe2\x02\x1cStride\\Autopilot\\GPBMetadata\xea\x02\x11Stride::Autopilotb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.autopilot.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.stride.autopilotB\nQueryProtoP\001Z2github.com/Stride-Labs/stride/v9/x/autopilot/types\242\002\003SAX\252\002\020Stride.Autopilot\312\002\020Stride\\Autopilot\342\002\034Stride\\Autopilot\\GPBMetadata\352\002\021Stride::Autopilot'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002&\022$/Stride-Labs/stride/autopilot/params'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=133
  _globals['_QUERYPARAMSREQUEST']._serialized_end=153
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=155
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=232
  _globals['_QUERY']._serialized_start=235
  _globals['_QUERY']._serialized_end=376
# @@protoc_insertion_point(module_scope)
