# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/concentrated-liquidity/tickInfo.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-osmosis/concentrated-liquidity/tickInfo.proto\x12%osmosis.concentratedliquidity.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xb4\x04\n\x08TickInfo\x12q\n\x0fliquidity_gross\x18\x01 \x01(\tBH\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x16yaml:\"liquidity_gross\"R\x0eliquidityGross\x12k\n\rliquidity_net\x18\x02 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"liquidity_net\"R\x0cliquidityNet\x12\xc8\x01\n9spread_reward_growth_opposite_direction_of_last_traversal\x18\x03 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR2spreadRewardGrowthOppositeDirectionOfLastTraversal\x12}\n\x0fuptime_trackers\x18\x04 \x03(\x0b\x32\x34.osmosis.concentratedliquidity.v1beta1.UptimeTrackerB\x1e\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"uptime_trackers\"R\x0euptimeTrackers\"\x97\x01\n\rUptimeTracker\x12\x85\x01\n\x15uptime_growth_outside\x18\x01 \x03(\x0b\x32\x1c.cosmos.base.v1beta1.DecCoinB3\xc8\xde\x1f\x00\xaa\xdf\x1f+github.com/cosmos/cosmos-sdk/types.DecCoinsR\x13uptimeGrowthOutsideB\xb4\x02\n)com.osmosis.concentratedliquidity.v1beta1B\rTickInfoProtoP\x01ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\xa2\x02\x03OCX\xaa\x02%Osmosis.Concentratedliquidity.V1beta1\xca\x02%Osmosis\\Concentratedliquidity\\V1beta1\xe2\x02\x31Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\xea\x02\'Osmosis::Concentratedliquidity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.concentrated_liquidity.tickInfo_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.osmosis.concentratedliquidity.v1beta1B\rTickInfoProtoP\001ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\242\002\003OCX\252\002%Osmosis.Concentratedliquidity.V1beta1\312\002%Osmosis\\Concentratedliquidity\\V1beta1\342\0021Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\352\002\'Osmosis::Concentratedliquidity::V1beta1'
  _TICKINFO.fields_by_name['liquidity_gross']._options = None
  _TICKINFO.fields_by_name['liquidity_gross']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\026yaml:\"liquidity_gross\"'
  _TICKINFO.fields_by_name['liquidity_net']._options = None
  _TICKINFO.fields_by_name['liquidity_net']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"liquidity_net\"'
  _TICKINFO.fields_by_name['spread_reward_growth_opposite_direction_of_last_traversal']._options = None
  _TICKINFO.fields_by_name['spread_reward_growth_opposite_direction_of_last_traversal']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _TICKINFO.fields_by_name['uptime_trackers']._options = None
  _TICKINFO.fields_by_name['uptime_trackers']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"uptime_trackers\"'
  _UPTIMETRACKER.fields_by_name['uptime_growth_outside']._options = None
  _UPTIMETRACKER.fields_by_name['uptime_growth_outside']._serialized_options = b'\310\336\037\000\252\337\037+github.com/cosmos/cosmos-sdk/types.DecCoins'
  _globals['_TICKINFO']._serialized_start=170
  _globals['_TICKINFO']._serialized_end=734
  _globals['_UPTIMETRACKER']._serialized_start=737
  _globals['_UPTIMETRACKER']._serialized_end=888
# @@protoc_insertion_point(module_scope)
