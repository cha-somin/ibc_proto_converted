# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/issuance/v1beta1/genesis.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#kava/issuance/v1beta1/genesis.proto\x12\x15kava.issuance.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\"\x91\x01\n\x0cGenesisState\x12;\n\x06params\x18\x01 \x01(\x0b\x32\x1d.kava.issuance.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x44\n\x08supplies\x18\x02 \x03(\x0b\x32\".kava.issuance.v1beta1.AssetSupplyB\x04\xc8\xde\x1f\x00R\x08supplies\"J\n\x06Params\x12:\n\x06\x61ssets\x18\x01 \x03(\x0b\x32\x1c.kava.issuance.v1beta1.AssetB\x04\xc8\xde\x1f\x00R\x06\x61ssets:\x04\x98\xa0\x1f\x00\"\xe3\x01\n\x05\x41sset\x12\x14\n\x05owner\x18\x01 \x01(\tR\x05owner\x12\x14\n\x05\x64\x65nom\x18\x02 \x01(\tR\x05\x64\x65nom\x12+\n\x11\x62locked_addresses\x18\x03 \x03(\tR\x10\x62lockedAddresses\x12\x16\n\x06paused\x18\x04 \x01(\x08R\x06paused\x12\x1c\n\tblockable\x18\x05 \x01(\x08R\tblockable\x12\x45\n\nrate_limit\x18\x06 \x01(\x0b\x32 .kava.issuance.v1beta1.RateLimitB\x04\xc8\xde\x1f\x00R\trateLimit:\x04\x98\xa0\x1f\x00\"\xc2\x01\n\tRateLimit\x12\x16\n\x06\x61\x63tive\x18\x01 \x01(\x08R\x06\x61\x63tive\x12W\n\x05limit\x18\x02 \x01(\x0c\x42\x41\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xea\xde\x1f\x0flimit,omitemptyR\x05limit\x12\x44\n\x0btime_period\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\ntimePeriod\"\xa3\x01\n\x0b\x41ssetSupply\x12\x46\n\x0e\x63urrent_supply\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\rcurrentSupply\x12\x46\n\x0ctime_elapsed\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x0btimeElapsed:\x04\x98\xa0\x1f\x00\x42\xcb\x01\n\x19\x63om.kava.issuance.v1beta1B\x0cGenesisProtoP\x01Z*github.com/kava-labs/kava/x/issuance/types\xa2\x02\x03KIX\xaa\x02\x15Kava.Issuance.V1beta1\xca\x02\x15Kava\\Issuance\\V1beta1\xe2\x02!Kava\\Issuance\\V1beta1\\GPBMetadata\xea\x02\x17Kava::Issuance::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.issuance.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.kava.issuance.v1beta1B\014GenesisProtoP\001Z*github.com/kava-labs/kava/x/issuance/types\242\002\003KIX\252\002\025Kava.Issuance.V1beta1\312\002\025Kava\\Issuance\\V1beta1\342\002!Kava\\Issuance\\V1beta1\\GPBMetadata\352\002\027Kava::Issuance::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['supplies']._options = None
  _GENESISSTATE.fields_by_name['supplies']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['assets']._options = None
  _PARAMS.fields_by_name['assets']._serialized_options = b'\310\336\037\000'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000'
  _ASSET.fields_by_name['rate_limit']._options = None
  _ASSET.fields_by_name['rate_limit']._serialized_options = b'\310\336\037\000'
  _ASSET._options = None
  _ASSET._serialized_options = b'\230\240\037\000'
  _RATELIMIT.fields_by_name['limit']._options = None
  _RATELIMIT.fields_by_name['limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\352\336\037\017limit,omitempty'
  _RATELIMIT.fields_by_name['time_period']._options = None
  _RATELIMIT.fields_by_name['time_period']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _ASSETSUPPLY.fields_by_name['current_supply']._options = None
  _ASSETSUPPLY.fields_by_name['current_supply']._serialized_options = b'\310\336\037\000'
  _ASSETSUPPLY.fields_by_name['time_elapsed']._options = None
  _ASSETSUPPLY.fields_by_name['time_elapsed']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _ASSETSUPPLY._options = None
  _ASSETSUPPLY._serialized_options = b'\230\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=149
  _globals['_GENESISSTATE']._serialized_end=294
  _globals['_PARAMS']._serialized_start=296
  _globals['_PARAMS']._serialized_end=370
  _globals['_ASSET']._serialized_start=373
  _globals['_ASSET']._serialized_end=600
  _globals['_RATELIMIT']._serialized_start=603
  _globals['_RATELIMIT']._serialized_end=797
  _globals['_ASSETSUPPLY']._serialized_start=800
  _globals['_ASSETSUPPLY']._serialized_end=963
# @@protoc_insertion_point(module_scope)