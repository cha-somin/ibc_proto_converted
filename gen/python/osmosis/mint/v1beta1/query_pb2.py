# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/mint/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from osmosis.mint.v1beta1 import mint_pb2 as osmosis_dot_mint_dot_v1beta1_dot_mint__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n osmosis/mint/v1beta1/query.proto\x12\x14osmosis.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fosmosis/mint/v1beta1/mint.proto\"\x14\n\x12QueryParamsRequest\"Q\n\x13QueryParamsResponse\x12:\n\x06params\x18\x01 \x01(\x0b\x32\x1c.osmosis.mint.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x1d\n\x1bQueryEpochProvisionsRequest\"y\n\x1cQueryEpochProvisionsResponse\x12Y\n\x10\x65poch_provisions\x18\x01 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0f\x65pochProvisions2\xb8\x02\n\x05Query\x12\x83\x01\n\x06Params\x12(.osmosis.mint.v1beta1.QueryParamsRequest\x1a).osmosis.mint.v1beta1.QueryParamsResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/osmosis/mint/v1beta1/params\x12\xa8\x01\n\x0f\x45pochProvisions\x12\x31.osmosis.mint.v1beta1.QueryEpochProvisionsRequest\x1a\x32.osmosis.mint.v1beta1.QueryEpochProvisionsResponse\".\x82\xd3\xe4\x93\x02(\x12&/osmosis/mint/v1beta1/epoch_provisionsB\xca\x01\n\x18\x63om.osmosis.mint.v1beta1B\nQueryProtoP\x01Z0github.com/osmosis-labs/osmosis/v15/x/mint/types\xa2\x02\x03OMX\xaa\x02\x14Osmosis.Mint.V1beta1\xca\x02\x14Osmosis\\Mint\\V1beta1\xe2\x02 Osmosis\\Mint\\V1beta1\\GPBMetadata\xea\x02\x16Osmosis::Mint::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.mint.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.osmosis.mint.v1beta1B\nQueryProtoP\001Z0github.com/osmosis-labs/osmosis/v15/x/mint/types\242\002\003OMX\252\002\024Osmosis.Mint.V1beta1\312\002\024Osmosis\\Mint\\V1beta1\342\002 Osmosis\\Mint\\V1beta1\\GPBMetadata\352\002\026Osmosis::Mint::V1beta1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYEPOCHPROVISIONSRESPONSE.fields_by_name['epoch_provisions']._options = None
  _QUERYEPOCHPROVISIONSRESPONSE.fields_by_name['epoch_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\036\022\034/osmosis/mint/v1beta1/params'
  _QUERY.methods_by_name['EpochProvisions']._options = None
  _QUERY.methods_by_name['EpochProvisions']._serialized_options = b'\202\323\344\223\002(\022&/osmosis/mint/v1beta1/epoch_provisions'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=143
  _globals['_QUERYPARAMSREQUEST']._serialized_end=163
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=165
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=246
  _globals['_QUERYEPOCHPROVISIONSREQUEST']._serialized_start=248
  _globals['_QUERYEPOCHPROVISIONSREQUEST']._serialized_end=277
  _globals['_QUERYEPOCHPROVISIONSRESPONSE']._serialized_start=279
  _globals['_QUERYEPOCHPROVISIONSRESPONSE']._serialized_end=400
  _globals['_QUERY']._serialized_start=403
  _globals['_QUERY']._serialized_end=715
# @@protoc_insertion_point(module_scope)