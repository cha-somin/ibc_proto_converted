# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/provider/v2/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!sentinel/provider/v2/params.proto\x12\x14sentinel.provider.v2\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x98\x01\n\x06Params\x12\x39\n\x07\x64\x65posit\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07\x64\x65posit\x12S\n\rrevenue_share\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0crevenueShareB\xd4\x01\n\x18\x63om.sentinel.provider.v2B\x0bParamsProtoP\x01Z1github.com/sentinel-official/hub/x/provider/types\xa2\x02\x03SPX\xaa\x02\x14Sentinel.Provider.V2\xca\x02\x14Sentinel\\Provider\\V2\xe2\x02 Sentinel\\Provider\\V2\\GPBMetadata\xea\x02\x16Sentinel::Provider::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.provider.v2.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.sentinel.provider.v2B\013ParamsProtoP\001Z1github.com/sentinel-official/hub/x/provider/types\242\002\003SPX\252\002\024Sentinel.Provider.V2\312\002\024Sentinel\\Provider\\V2\342\002 Sentinel\\Provider\\V2\\GPBMetadata\352\002\026Sentinel::Provider::V2\310\341\036\000\250\342\036\000'
  _PARAMS.fields_by_name['deposit']._options = None
  _PARAMS.fields_by_name['deposit']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['revenue_share']._options = None
  _PARAMS.fields_by_name['revenue_share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._serialized_start=114
  _globals['_PARAMS']._serialized_end=266
# @@protoc_insertion_point(module_scope)
