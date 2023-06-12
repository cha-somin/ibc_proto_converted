# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sentinel/node/v2/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dsentinel/node/v2/params.proto\x12\x10sentinel.node.v2\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\"\xba\x07\n\x06Params\x12\x39\n\x07\x64\x65posit\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07\x64\x65posit\x12L\n\x0f\x65xpiry_duration\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x0e\x65xpiryDuration\x12{\n\x13max_gigabyte_prices\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x11maxGigabytePrices\x12{\n\x13min_gigabyte_prices\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x11minGigabytePrices\x12w\n\x11max_hourly_prices\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0fmaxHourlyPrices\x12w\n\x11min_hourly_prices\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0fminHourlyPrices\x12<\n\x1amax_subscription_gigabytes\x18\x07 \x01(\x03R\x18maxSubscriptionGigabytes\x12<\n\x1amin_subscription_gigabytes\x18\x08 \x01(\x03R\x18minSubscriptionGigabytes\x12\x34\n\x16max_subscription_hours\x18\t \x01(\x03R\x14maxSubscriptionHours\x12\x34\n\x16min_subscription_hours\x18\n \x01(\x03R\x14minSubscriptionHours\x12S\n\rrevenue_share\x18\x0b \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0crevenueShareB\xbc\x01\n\x14\x63om.sentinel.node.v2B\x0bParamsProtoP\x01Z-github.com/sentinel-official/hub/x/node/types\xa2\x02\x03SNX\xaa\x02\x10Sentinel.Node.V2\xca\x02\x10Sentinel\\Node\\V2\xe2\x02\x1cSentinel\\Node\\V2\\GPBMetadata\xea\x02\x12Sentinel::Node::V2\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sentinel.node.v2.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.sentinel.node.v2B\013ParamsProtoP\001Z-github.com/sentinel-official/hub/x/node/types\242\002\003SNX\252\002\020Sentinel.Node.V2\312\002\020Sentinel\\Node\\V2\342\002\034Sentinel\\Node\\V2\\GPBMetadata\352\002\022Sentinel::Node::V2\310\341\036\000\250\342\036\000'
  _PARAMS.fields_by_name['deposit']._options = None
  _PARAMS.fields_by_name['deposit']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['expiry_duration']._options = None
  _PARAMS.fields_by_name['expiry_duration']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['max_gigabyte_prices']._options = None
  _PARAMS.fields_by_name['max_gigabyte_prices']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _PARAMS.fields_by_name['min_gigabyte_prices']._options = None
  _PARAMS.fields_by_name['min_gigabyte_prices']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _PARAMS.fields_by_name['max_hourly_prices']._options = None
  _PARAMS.fields_by_name['max_hourly_prices']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _PARAMS.fields_by_name['min_hourly_prices']._options = None
  _PARAMS.fields_by_name['min_hourly_prices']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _PARAMS.fields_by_name['revenue_share']._options = None
  _PARAMS.fields_by_name['revenue_share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._serialized_start=138
  _globals['_PARAMS']._serialized_end=1092
# @@protoc_insertion_point(module_scope)
