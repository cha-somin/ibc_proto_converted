# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: xpla/reward/v1beta1/reward.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n xpla/reward/v1beta1/reward.proto\x12\x13xpla.reward.v1beta1\x1a\x14gogoproto/gogo.proto\"\xc7\x03\n\x06Params\x12j\n\rfee_pool_rate\x18\x01 \x01(\tBF\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x14yaml:\"fee_pool_rate\"R\x0b\x66\x65\x65PoolRate\x12|\n\x13\x63ommunity_pool_rate\x18\x02 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x1ayaml:\"community_pool_rate\"R\x11\x63ommunityPoolRate\x12h\n\x0creserve_rate\x18\x03 \x01(\tBE\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x13yaml:\"reserve_rate\"R\x0breserveRate\x12\'\n\x0freserve_account\x18\x04 \x01(\tR\x0ereserveAccount\x12:\n\x19reward_distribute_account\x18\x05 \x01(\tR\x17rewardDistributeAccount:\x04\x98\xa0\x1f\x00\x42\xbc\x01\n\x17\x63om.xpla.reward.v1beta1B\x0bRewardProtoP\x01Z&github.com/xpladev/xpla/x/reward/types\xa2\x02\x03XRX\xaa\x02\x13Xpla.Reward.V1beta1\xca\x02\x13Xpla\\Reward\\V1beta1\xe2\x02\x1fXpla\\Reward\\V1beta1\\GPBMetadata\xea\x02\x15Xpla::Reward::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'xpla.reward.v1beta1.reward_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.xpla.reward.v1beta1B\013RewardProtoP\001Z&github.com/xpladev/xpla/x/reward/types\242\002\003XRX\252\002\023Xpla.Reward.V1beta1\312\002\023Xpla\\Reward\\V1beta1\342\002\037Xpla\\Reward\\V1beta1\\GPBMetadata\352\002\025Xpla::Reward::V1beta1'
  _PARAMS.fields_by_name['fee_pool_rate']._options = None
  _PARAMS.fields_by_name['fee_pool_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\024yaml:\"fee_pool_rate\"'
  _PARAMS.fields_by_name['community_pool_rate']._options = None
  _PARAMS.fields_by_name['community_pool_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\032yaml:\"community_pool_rate\"'
  _PARAMS.fields_by_name['reserve_rate']._options = None
  _PARAMS.fields_by_name['reserve_rate']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\023yaml:\"reserve_rate\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000'
  _globals['_PARAMS']._serialized_start=80
  _globals['_PARAMS']._serialized_end=535
# @@protoc_insertion_point(module_scope)
