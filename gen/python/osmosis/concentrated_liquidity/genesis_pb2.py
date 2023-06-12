# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/concentrated-liquidity/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from osmosis.accum.v1beta1 import accum_pb2 as osmosis_dot_accum_dot_v1beta1_dot_accum__pb2
from osmosis.concentrated_liquidity import params_pb2 as osmosis_dot_concentrated__liquidity_dot_params__pb2
from osmosis.concentrated_liquidity import position_pb2 as osmosis_dot_concentrated__liquidity_dot_position__pb2
from osmosis.concentrated_liquidity import tickInfo_pb2 as osmosis_dot_concentrated__liquidity_dot_tickInfo__pb2
from osmosis.concentrated_liquidity import incentive_record_pb2 as osmosis_dot_concentrated__liquidity_dot_incentive__record__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,osmosis/concentrated-liquidity/genesis.proto\x12%osmosis.concentratedliquidity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19google/protobuf/any.proto\x1a!osmosis/accum/v1beta1/accum.proto\x1a+osmosis/concentrated-liquidity/params.proto\x1a-osmosis/concentrated-liquidity/position.proto\x1a-osmosis/concentrated-liquidity/tickInfo.proto\x1a\x35osmosis/concentrated-liquidity/incentive_record.proto\"\xcc\x01\n\x08\x46ullTick\x12+\n\x07pool_id\x18\x01 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolId\x12\x34\n\ntick_index\x18\x02 \x01(\x03\x42\x15\xf2\xde\x1f\x11yaml:\"tick_index\"R\ttickIndex\x12]\n\x04info\x18\x03 \x01(\x0b\x32/.osmosis.concentratedliquidity.v1beta1.TickInfoB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"tick_info\"R\x04info\"\xb7\x04\n\x08PoolData\x12\x33\n\x04pool\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyB\t\xca\xb4-\x05PoolIR\x04pool\x12[\n\x05ticks\x18\x02 \x03(\x0b\x32/.osmosis.concentratedliquidity.v1beta1.FullTickB\x14\xc8\xde\x1f\x00\xf2\xde\x1f\x0cyaml:\"ticks\"R\x05ticks\x12\x98\x01\n\x19spread_reward_accumulator\x18\x03 \x01(\x0b\x32\x32.osmosis.concentratedliquidity.v1beta1.AccumObjectB(\xc8\xde\x1f\x00\xf2\xde\x1f yaml:\"spread_reward_accumulator\"R\x17spreadRewardAccumulator\x12\x92\x01\n\x17incentives_accumulators\x18\x04 \x03(\x0b\x32\x32.osmosis.concentratedliquidity.v1beta1.AccumObjectB%\xc8\xde\x1f\x00\xf2\xde\x1f\x1dyaml:\"incentives_accumulator\"R\x16incentivesAccumulators\x12i\n\x11incentive_records\x18\x05 \x03(\x0b\x32\x36.osmosis.concentratedliquidity.v1beta1.IncentiveRecordB\x04\xc8\xde\x1f\x00R\x10incentiveRecords\"\xea\x01\n\x0cPositionData\x12K\n\x08position\x18\x01 \x01(\x0b\x32/.osmosis.concentratedliquidity.v1beta1.PositionR\x08position\x12+\n\x07lock_id\x18\x02 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"lock_id\"R\x06lockId\x12`\n\x1aspread_reward_accum_record\x18\x03 \x01(\x0b\x32\x1d.osmosis.accum.v1beta1.RecordB\x04\xc8\xde\x1f\x00R\x17spreadRewardAccumRecord\"\xce\x02\n\x0cGenesisState\x12\x43\n\x06params\x18\x01 \x01(\x0b\x32%.osmosis.concentratedliquidity.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12R\n\tpool_data\x18\x02 \x03(\x0b\x32/.osmosis.concentratedliquidity.v1beta1.PoolDataB\x04\xc8\xde\x1f\x00R\x08poolData\x12^\n\rposition_data\x18\x03 \x03(\x0b\x32\x33.osmosis.concentratedliquidity.v1beta1.PositionDataB\x04\xc8\xde\x1f\x00R\x0cpositionData\x12\x45\n\x10next_position_id\x18\x04 \x01(\x04\x42\x1b\xf2\xde\x1f\x17yaml:\"next_position_id\"R\x0enextPositionId\"\x82\x01\n\x0b\x41\x63\x63umObject\x12#\n\x04name\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12N\n\raccum_content\x18\x02 \x01(\x0b\x32).osmosis.accum.v1beta1.AccumulatorContentR\x0c\x61\x63\x63umContentB\xbb\x02\n)com.osmosis.concentratedliquidity.v1beta1B\x0cGenesisProtoP\x01ZJgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/types/genesis\xa2\x02\x03OCX\xaa\x02%Osmosis.Concentratedliquidity.V1beta1\xca\x02%Osmosis\\Concentratedliquidity\\V1beta1\xe2\x02\x31Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\xea\x02\'Osmosis::Concentratedliquidity::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.concentrated_liquidity.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n)com.osmosis.concentratedliquidity.v1beta1B\014GenesisProtoP\001ZJgithub.com/osmosis-labs/osmosis/v15/x/concentrated-liquidity/types/genesis\242\002\003OCX\252\002%Osmosis.Concentratedliquidity.V1beta1\312\002%Osmosis\\Concentratedliquidity\\V1beta1\342\0021Osmosis\\Concentratedliquidity\\V1beta1\\GPBMetadata\352\002\'Osmosis::Concentratedliquidity::V1beta1'
  _FULLTICK.fields_by_name['pool_id']._options = None
  _FULLTICK.fields_by_name['pool_id']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _FULLTICK.fields_by_name['tick_index']._options = None
  _FULLTICK.fields_by_name['tick_index']._serialized_options = b'\362\336\037\021yaml:\"tick_index\"'
  _FULLTICK.fields_by_name['info']._options = None
  _FULLTICK.fields_by_name['info']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"tick_info\"'
  _POOLDATA.fields_by_name['pool']._options = None
  _POOLDATA.fields_by_name['pool']._serialized_options = b'\312\264-\005PoolI'
  _POOLDATA.fields_by_name['ticks']._options = None
  _POOLDATA.fields_by_name['ticks']._serialized_options = b'\310\336\037\000\362\336\037\014yaml:\"ticks\"'
  _POOLDATA.fields_by_name['spread_reward_accumulator']._options = None
  _POOLDATA.fields_by_name['spread_reward_accumulator']._serialized_options = b'\310\336\037\000\362\336\037 yaml:\"spread_reward_accumulator\"'
  _POOLDATA.fields_by_name['incentives_accumulators']._options = None
  _POOLDATA.fields_by_name['incentives_accumulators']._serialized_options = b'\310\336\037\000\362\336\037\035yaml:\"incentives_accumulator\"'
  _POOLDATA.fields_by_name['incentive_records']._options = None
  _POOLDATA.fields_by_name['incentive_records']._serialized_options = b'\310\336\037\000'
  _POSITIONDATA.fields_by_name['lock_id']._options = None
  _POSITIONDATA.fields_by_name['lock_id']._serialized_options = b'\362\336\037\016yaml:\"lock_id\"'
  _POSITIONDATA.fields_by_name['spread_reward_accum_record']._options = None
  _POSITIONDATA.fields_by_name['spread_reward_accum_record']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['pool_data']._options = None
  _GENESISSTATE.fields_by_name['pool_data']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['position_data']._options = None
  _GENESISSTATE.fields_by_name['position_data']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['next_position_id']._options = None
  _GENESISSTATE.fields_by_name['next_position_id']._serialized_options = b'\362\336\037\027yaml:\"next_position_id\"'
  _ACCUMOBJECT.fields_by_name['name']._options = None
  _ACCUMOBJECT.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _globals['_FULLTICK']._serialized_start=425
  _globals['_FULLTICK']._serialized_end=629
  _globals['_POOLDATA']._serialized_start=632
  _globals['_POOLDATA']._serialized_end=1199
  _globals['_POSITIONDATA']._serialized_start=1202
  _globals['_POSITIONDATA']._serialized_end=1436
  _globals['_GENESISSTATE']._serialized_start=1439
  _globals['_GENESISSTATE']._serialized_end=1773
  _globals['_ACCUMOBJECT']._serialized_start=1776
  _globals['_ACCUMOBJECT']._serialized_end=1906
# @@protoc_insertion_point(module_scope)
