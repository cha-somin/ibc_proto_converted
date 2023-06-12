# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stride/interchainquery/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from stride.interchainquery.v1 import genesis_pb2 as stride_dot_interchainquery_dot_v1_dot_genesis__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%stride/interchainquery/v1/query.proto\x12\x19stride.interchainquery.v1\x1a\'stride/interchainquery/v1/genesis.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x14gogoproto/gogo.proto\"\x1c\n\x1aQueryPendingQueriesRequest\"n\n\x1bQueryPendingQueriesResponse\x12O\n\x0fpending_queries\x18\x01 \x03(\x0b\x32 .stride.interchainquery.v1.QueryB\x04\xc8\xde\x1f\x00R\x0ependingQueries2\xcd\x01\n\x0cQueryService\x12\xbc\x01\n\x0ePendingQueries\x12\x35.stride.interchainquery.v1.QueryPendingQueriesRequest\x1a\x36.stride.interchainquery.v1.QueryPendingQueriesResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/Stride-Labs/stride/interchainquery/pending_queriesB\xeb\x01\n\x1d\x63om.stride.interchainquery.v1B\nQueryProtoP\x01Z8github.com/Stride-Labs/stride/v9/x/interchainquery/types\xa2\x02\x03SIX\xaa\x02\x19Stride.Interchainquery.V1\xca\x02\x19Stride\\Interchainquery\\V1\xe2\x02%Stride\\Interchainquery\\V1\\GPBMetadata\xea\x02\x1bStride::Interchainquery::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stride.interchainquery.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.stride.interchainquery.v1B\nQueryProtoP\001Z8github.com/Stride-Labs/stride/v9/x/interchainquery/types\242\002\003SIX\252\002\031Stride.Interchainquery.V1\312\002\031Stride\\Interchainquery\\V1\342\002%Stride\\Interchainquery\\V1\\GPBMetadata\352\002\033Stride::Interchainquery::V1'
  _QUERYPENDINGQUERIESRESPONSE.fields_by_name['pending_queries']._options = None
  _QUERYPENDINGQUERIESRESPONSE.fields_by_name['pending_queries']._serialized_options = b'\310\336\037\000'
  _QUERYSERVICE.methods_by_name['PendingQueries']._options = None
  _QUERYSERVICE.methods_by_name['PendingQueries']._serialized_options = b'\202\323\344\223\0025\0223/Stride-Labs/stride/interchainquery/pending_queries'
  _globals['_QUERYPENDINGQUERIESREQUEST']._serialized_start=161
  _globals['_QUERYPENDINGQUERIESREQUEST']._serialized_end=189
  _globals['_QUERYPENDINGQUERIESRESPONSE']._serialized_start=191
  _globals['_QUERYPENDINGQUERIESRESPONSE']._serialized_end=301
  _globals['_QUERYSERVICE']._serialized_start=304
  _globals['_QUERYSERVICE']._serialized_end=509
# @@protoc_insertion_point(module_scope)
