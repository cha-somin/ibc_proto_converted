# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: lum-network/millions/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!lum-network/millions/params.proto\x12\x14lum.network.millions\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\"\x9c\x05\n\x06Params\x12\\\n\x12min_deposit_amount\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x10minDepositAmount\x12;\n\x1amax_prize_strategy_batches\x18\x02 \x01(\x04R\x17maxPrizeStrategyBatches\x12\x37\n\x18max_prize_batch_quantity\x18\x03 \x01(\x04R\x15maxPrizeBatchQuantity\x12Z\n\x17min_draw_schedule_delta\x18\x04 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x14minDrawScheduleDelta\x12Z\n\x17max_draw_schedule_delta\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x14maxDrawScheduleDelta\x12Y\n\x16prize_expiration_delta\x18\x06 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x14prizeExpirationDelta\x12Q\n\x0c\x66\x65\x65s_stakers\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0b\x66\x65\x65sStakers\x12X\n\x16min_deposit_draw_delta\x18\x08 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x13minDepositDrawDeltaB\xc8\x01\n\x18\x63om.lum.network.millionsB\x0bParamsProtoP\x01Z-github.com/lum-network/chain/x/millions/types\xa2\x02\x03LNM\xaa\x02\x14Lum.Network.Millions\xca\x02\x14Lum\\Network\\Millions\xe2\x02 Lum\\Network\\Millions\\GPBMetadata\xea\x02\x16Lum::Network::Millionsb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'lum_network.millions.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.lum.network.millionsB\013ParamsProtoP\001Z-github.com/lum-network/chain/x/millions/types\242\002\003LNM\252\002\024Lum.Network.Millions\312\002\024Lum\\Network\\Millions\342\002 Lum\\Network\\Millions\\GPBMetadata\352\002\026Lum::Network::Millions'
  _PARAMS.fields_by_name['min_deposit_amount']._options = None
  _PARAMS.fields_by_name['min_deposit_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _PARAMS.fields_by_name['min_draw_schedule_delta']._options = None
  _PARAMS.fields_by_name['min_draw_schedule_delta']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['max_draw_schedule_delta']._options = None
  _PARAMS.fields_by_name['max_draw_schedule_delta']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['prize_expiration_delta']._options = None
  _PARAMS.fields_by_name['prize_expiration_delta']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _PARAMS.fields_by_name['fees_stakers']._options = None
  _PARAMS.fields_by_name['fees_stakers']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _PARAMS.fields_by_name['min_deposit_draw_delta']._options = None
  _PARAMS.fields_by_name['min_deposit_draw_delta']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_PARAMS']._serialized_start=114
  _globals['_PARAMS']._serialized_end=782
# @@protoc_insertion_point(module_scope)
