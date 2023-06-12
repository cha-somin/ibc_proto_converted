# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/farm/farm.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17irismod/farm/farm.proto\x12\x0cirismod.farm\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"\xa5\x03\n\x08\x46\x61rmPool\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x18\n\x07\x63reator\x18\x02 \x01(\tR\x07\x63reator\x12 \n\x0b\x64\x65scription\x18\x03 \x01(\tR\x0b\x64\x65scription\x12!\n\x0cstart_height\x18\x04 \x01(\x03R\x0bstartHeight\x12\x1d\n\nend_height\x18\x05 \x01(\x03R\tendHeight\x12\x39\n\x19last_height_distr_rewards\x18\x06 \x01(\x03R\x16lastHeightDistrRewards\x12\x1a\n\x08\x65\x64itable\x18\x07 \x01(\x08R\x08\x65\x64itable\x12t\n\x10total_lpt_locked\x18\x08 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0etotalLptLocked\x12\x34\n\x05rules\x18\t \x03(\x0b\x32\x18.irismod.farm.RewardRuleB\x04\xc8\xde\x1f\x00R\x05rules:\x04\xe8\xa0\x1f\x01\"\x8c\x03\n\nRewardRule\x12\x16\n\x06reward\x18\x01 \x01(\tR\x06reward\x12Q\n\x0ctotal_reward\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0btotalReward\x12Y\n\x10remaining_reward\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0fremainingReward\x12X\n\x10reward_per_block\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0erewardPerBlock\x12X\n\x10reward_per_share\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0erewardPerShare:\x04\xe8\xa0\x1f\x01\"\xfd\x01\n\x08\x46\x61rmInfo\x12\x1b\n\tpool_name\x18\x01 \x01(\tR\x08poolName\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x46\n\x06locked\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06locked\x12l\n\x0breward_debt\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\nrewardDebt:\x04\xe8\xa0\x1f\x01\"\xb0\x01\n\x06Params\x12r\n\x0f\x63reate_pool_fee\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB/\xc8\xde\x1f\x00\xda\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\rcreatePoolFee\x12\x32\n\x15max_reward_categories\x18\x02 \x01(\rR\x13maxRewardCategoriesB\xa1\x01\n\x10\x63om.irismod.farmB\tFarmProtoP\x01Z-github.com/irisnet/irismod/modules/farm/types\xa2\x02\x03IFX\xaa\x02\x0cIrismod.Farm\xca\x02\x0cIrismod\\Farm\xe2\x02\x18Irismod\\Farm\\GPBMetadata\xea\x02\rIrismod::Farm\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.farm.farm_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.irismod.farmB\tFarmProtoP\001Z-github.com/irisnet/irismod/modules/farm/types\242\002\003IFX\252\002\014Irismod.Farm\312\002\014Irismod\\Farm\342\002\030Irismod\\Farm\\GPBMetadata\352\002\rIrismod::Farm\310\341\036\000'
  _FARMPOOL.fields_by_name['total_lpt_locked']._options = None
  _FARMPOOL.fields_by_name['total_lpt_locked']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _FARMPOOL.fields_by_name['rules']._options = None
  _FARMPOOL.fields_by_name['rules']._serialized_options = b'\310\336\037\000'
  _FARMPOOL._options = None
  _FARMPOOL._serialized_options = b'\350\240\037\001'
  _REWARDRULE.fields_by_name['total_reward']._options = None
  _REWARDRULE.fields_by_name['total_reward']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _REWARDRULE.fields_by_name['remaining_reward']._options = None
  _REWARDRULE.fields_by_name['remaining_reward']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _REWARDRULE.fields_by_name['reward_per_block']._options = None
  _REWARDRULE.fields_by_name['reward_per_block']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _REWARDRULE.fields_by_name['reward_per_share']._options = None
  _REWARDRULE.fields_by_name['reward_per_share']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _REWARDRULE._options = None
  _REWARDRULE._serialized_options = b'\350\240\037\001'
  _FARMINFO.fields_by_name['locked']._options = None
  _FARMINFO.fields_by_name['locked']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _FARMINFO.fields_by_name['reward_debt']._options = None
  _FARMINFO.fields_by_name['reward_debt']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _FARMINFO._options = None
  _FARMINFO._serialized_options = b'\350\240\037\001'
  _PARAMS.fields_by_name['create_pool_fee']._options = None
  _PARAMS.fields_by_name['create_pool_fee']._serialized_options = b'\310\336\037\000\332\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_FARMPOOL']._serialized_start=96
  _globals['_FARMPOOL']._serialized_end=517
  _globals['_REWARDRULE']._serialized_start=520
  _globals['_REWARDRULE']._serialized_end=916
  _globals['_FARMINFO']._serialized_start=919
  _globals['_FARMINFO']._serialized_end=1172
  _globals['_PARAMS']._serialized_start=1175
  _globals['_PARAMS']._serialized_end=1351
# @@protoc_insertion_point(module_scope)
