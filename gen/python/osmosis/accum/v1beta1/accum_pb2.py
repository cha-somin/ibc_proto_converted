# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/accum/v1beta1/accum.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!osmosis/accum/v1beta1/accum.proto\x12\x15osmosis.accum.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xdb\x01\n\x12\x41\x63\x63umulatorContent\x12r\n\x0b\x61\x63\x63um_value\x18\x01 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\naccumValue\x12Q\n\x0ctotal_shares\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0btotalShares\"\t\n\x07Options\"\xa4\x03\n\x06Record\x12M\n\nnum_shares\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tnumShares\x12\x84\x01\n\x15\x61\x63\x63um_value_per_share\x18\x02 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x12\x61\x63\x63umValuePerShare\x12\x89\x01\n\x17unclaimed_rewards_total\x18\x03 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x15unclaimedRewardsTotal\x12\x38\n\x07options\x18\x04 \x01(\x0b\x32\x1e.osmosis.accum.v1beta1.OptionsR\x07optionsB\xce\x01\n\x19\x63om.osmosis.accum.v1beta1B\nAccumProtoP\x01Z/github.com/osmosis-labs/osmosis/osmoutils/accum\xa2\x02\x03OAX\xaa\x02\x15Osmosis.Accum.V1beta1\xca\x02\x15Osmosis\\Accum\\V1beta1\xe2\x02!Osmosis\\Accum\\V1beta1\\GPBMetadata\xea\x02\x17Osmosis::Accum::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.accum.v1beta1.accum_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.osmosis.accum.v1beta1B\nAccumProtoP\001Z/github.com/osmosis-labs/osmosis/osmoutils/accum\242\002\003OAX\252\002\025Osmosis.Accum.V1beta1\312\002\025Osmosis\\Accum\\V1beta1\342\002!Osmosis\\Accum\\V1beta1\\GPBMetadata\352\002\027Osmosis::Accum::V1beta1'
  _ACCUMULATORCONTENT.fields_by_name['accum_value']._options = None
  _ACCUMULATORCONTENT.fields_by_name['accum_value']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _ACCUMULATORCONTENT.fields_by_name['total_shares']._options = None
  _ACCUMULATORCONTENT.fields_by_name['total_shares']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _RECORD.fields_by_name['num_shares']._options = None
  _RECORD.fields_by_name['num_shares']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _RECORD.fields_by_name['accum_value_per_share']._options = None
  _RECORD.fields_by_name['accum_value_per_share']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _RECORD.fields_by_name['unclaimed_rewards_total']._options = None
  _RECORD.fields_by_name['unclaimed_rewards_total']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _globals['_ACCUMULATORCONTENT']._serialized_start=115
  _globals['_ACCUMULATORCONTENT']._serialized_end=334
  _globals['_OPTIONS']._serialized_start=336
  _globals['_OPTIONS']._serialized_end=345
  _globals['_RECORD']._serialized_start=348
  _globals['_RECORD']._serialized_end=768
# @@protoc_insertion_point(module_scope)
