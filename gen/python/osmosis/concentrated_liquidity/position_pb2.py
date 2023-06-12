# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/concentrated-liquidity/position.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-osmosis/concentrated-liquidity/position.proto\x12%osmosis.concentratedliquidity.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1egoogle/protobuf/duration.proto\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x95\x03\n\x08Position\x12\x37\n\x0bposition_id\x18\x01 \x01(\x04\x42\x16\xf2\xde\x1f\x12yaml:\"position_id\"R\npositionId\x12,\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"address\"R\x07\x61\x64\x64ress\x12+\n\x07pool_id\x18\x03 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolId\x12\x1d\n\nlower_tick\x18\x04 \x01(\x03R\tlowerTick\x12\x1d\n\nupper_tick\x18\x05 \x01(\x03R\tupperTick\x12U\n\tjoin_time\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x1c\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"join_time\"\x90\xdf\x1f\x01R\x08joinTime\x12`\n\tliquidity\x18\x07 \x01(\tBB\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x10yaml:\"liquidity\"R\tliquidity\"\xf9\x04\n\x15\x46ullPositionBreakdown\x12Q\n\x08position\x18\x01 \x01(\x0b\x32/.osmosis.concentratedliquidity.v1beta1.PositionB\x04\xc8\xde\x1f\x00R\x08position\x12\x62\n\x06\x61sset0\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61sset0\x12\x62\n\x06\x61sset1\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xaa\xdf\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x06\x61sset1\x12_\n\x0e\x63laimable_fees\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"claimable_fees\"R\rclaimableFees\x12q\n\x14\x63laimable_incentives\x18\x05 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB#\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"claimable_incentives\"R\x13\x63laimableIncentives\x12q\n\x14\x66orfeited_incentives\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB#\xc8\xde\x1f\x00\xf2\xde\x1f\x1byaml:\"forfeited_incentives\"R\x13\x66orfeitedIncentivesB\xb4\x02\n)com.osmosis.concentratedliquidity.v1beta1B\rPositionProtoP\x01ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\xa2\x02\x03OCX\xaa\x02%Osmosis.Concentratedliquidity.V1beta1\xca\x02%Osmosis\\Concentratedliquidity\\V1beta1\xe2\x02\x31Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\xea\x02\'Osmosis::Concentratedliquidity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.concentrated_liquidity.position_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.osmosis.concentratedliquidity.v1beta1B\rPositionProtoP\001ZBgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/model\242\002\003OCX\252\002%Osmosis.Concentratedliquidity.V1beta1\312\002%Osmosis\\Concentratedliquidity\\V1beta1\342\0021Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\352\002\'Osmosis::Concentratedliquidity::V1beta1'
  _POSITION.fields_by_name['position_id']._options = None
  _POSITION.fields_by_name['position_id']._serialized_options = b'\362\336\037\022yaml:\"position_id\"'
  _POSITION.fields_by_name['address']._options = None
  _POSITION.fields_by_name['address']._serialized_options = b'\362\336\037\016yaml:\"address\"'
  _POSITION.fields_by_name['pool_id']._options = None
  _POSITION.fields_by_name['pool_id']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _POSITION.fields_by_name['join_time']._options = None
  _POSITION.fields_by_name['join_time']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"join_time\"\220\337\037\001'
  _POSITION.fields_by_name['liquidity']._options = None
  _POSITION.fields_by_name['liquidity']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\020yaml:\"liquidity\"'
  _FULLPOSITIONBREAKDOWN.fields_by_name['position']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['position']._serialized_options = b'\310\336\037\000'
  _FULLPOSITIONBREAKDOWN.fields_by_name['asset0']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['asset0']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _FULLPOSITIONBREAKDOWN.fields_by_name['asset1']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['asset1']._serialized_options = b'\310\336\037\000\252\337\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _FULLPOSITIONBREAKDOWN.fields_by_name['claimable_fees']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['claimable_fees']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"claimable_fees\"'
  _FULLPOSITIONBREAKDOWN.fields_by_name['claimable_incentives']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['claimable_incentives']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"claimable_incentives\"'
  _FULLPOSITIONBREAKDOWN.fields_by_name['forfeited_incentives']._options = None
  _FULLPOSITIONBREAKDOWN.fields_by_name['forfeited_incentives']._serialized_options = b'\310\336\037\000\362\336\037\033yaml:\"forfeited_incentives\"'
  _globals['_POSITION']._serialized_start=235
  _globals['_POSITION']._serialized_end=640
  _globals['_FULLPOSITIONBREAKDOWN']._serialized_start=643
  _globals['_FULLPOSITIONBREAKDOWN']._serialized_end=1276
# @@protoc_insertion_point(module_scope)
