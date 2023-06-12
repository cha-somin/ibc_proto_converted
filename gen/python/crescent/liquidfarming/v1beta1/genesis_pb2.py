# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/liquidfarming/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from crescent.liquidfarming.v1beta1 import liquidfarming_pb2 as crescent_dot_liquidfarming_dot_v1beta1_dot_liquidfarming__pb2
from crescent.liquidfarming.v1beta1 import params_pb2 as crescent_dot_liquidfarming_dot_v1beta1_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,crescent/liquidfarming/v1beta1/genesis.proto\x12\x1e\x63rescent.liquidfarming.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x32\x63rescent/liquidfarming/v1beta1/liquidfarming.proto\x1a+crescent/liquidfarming/v1beta1/params.proto\"\xa6\x05\n\x0cGenesisState\x12\x44\n\x06params\x18\x01 \x01(\x0b\x32&.crescent.liquidfarming.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12\x84\x01\n\x1elast_rewards_auction_id_record\x18\x02 \x03(\x0b\x32:.crescent.liquidfarming.v1beta1.LastRewardsAuctionIdRecordB\x04\xc8\xde\x1f\x00R\x1alastRewardsAuctionIdRecord\x12S\n\x0cliquid_farms\x18\x03 \x03(\x0b\x32*.crescent.liquidfarming.v1beta1.LiquidFarmB\x04\xc8\xde\x1f\x00R\x0bliquidFarms\x12_\n\x10rewards_auctions\x18\x04 \x03(\x0b\x32..crescent.liquidfarming.v1beta1.RewardsAuctionB\x04\xc8\xde\x1f\x00R\x0frewardsAuctions\x12=\n\x04\x62ids\x18\x05 \x03(\x0b\x32#.crescent.liquidfarming.v1beta1.BidB\x04\xc8\xde\x1f\x00R\x04\x62ids\x12\x66\n\x13winning_bid_records\x18\x06 \x03(\x0b\x32\x30.crescent.liquidfarming.v1beta1.WinningBidRecordB\x04\xc8\xde\x1f\x00R\x11winningBidRecords\x12\x62\n\x1dlast_rewards_auction_end_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x04\x90\xdf\x1f\x01R\x19lastRewardsAuctionEndTime:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"^\n\x1aLastRewardsAuctionIdRecord\x12\x17\n\x07pool_id\x18\x01 \x01(\x04R\x06poolId\x12\x1d\n\nauction_id\x18\x02 \x01(\x04R\tauctionId:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x87\x01\n\x10WinningBidRecord\x12\x1d\n\nauction_id\x18\x01 \x01(\x04R\tauctionId\x12J\n\x0bwinning_bid\x18\x02 \x01(\x0b\x32#.crescent.liquidfarming.v1beta1.BidB\x04\xc8\xde\x1f\x00R\nwinningBid:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\x8b\x02\n\"com.crescent.liquidfarming.v1beta1B\x0cGenesisProtoP\x01Z=github.com/crescent-network/crescent/v5/x/liquidfarming/types\xa2\x02\x03\x43LX\xaa\x02\x1e\x43rescent.Liquidfarming.V1beta1\xca\x02\x1e\x43rescent\\Liquidfarming\\V1beta1\xe2\x02*Crescent\\Liquidfarming\\V1beta1\\GPBMetadata\xea\x02 Crescent::Liquidfarming::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.liquidfarming.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.crescent.liquidfarming.v1beta1B\014GenesisProtoP\001Z=github.com/crescent-network/crescent/v5/x/liquidfarming/types\242\002\003CLX\252\002\036Crescent.Liquidfarming.V1beta1\312\002\036Crescent\\Liquidfarming\\V1beta1\342\002*Crescent\\Liquidfarming\\V1beta1\\GPBMetadata\352\002 Crescent::Liquidfarming::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['last_rewards_auction_id_record']._options = None
  _GENESISSTATE.fields_by_name['last_rewards_auction_id_record']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['liquid_farms']._options = None
  _GENESISSTATE.fields_by_name['liquid_farms']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['rewards_auctions']._options = None
  _GENESISSTATE.fields_by_name['rewards_auctions']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['bids']._options = None
  _GENESISSTATE.fields_by_name['bids']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['winning_bid_records']._options = None
  _GENESISSTATE.fields_by_name['winning_bid_records']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['last_rewards_auction_end_time']._options = None
  _GENESISSTATE.fields_by_name['last_rewards_auction_end_time']._serialized_options = b'\220\337\037\001'
  _GENESISSTATE._options = None
  _GENESISSTATE._serialized_options = b'\210\240\037\000\350\240\037\000'
  _LASTREWARDSAUCTIONIDRECORD._options = None
  _LASTREWARDSAUCTIONIDRECORD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _WINNINGBIDRECORD.fields_by_name['winning_bid']._options = None
  _WINNINGBIDRECORD.fields_by_name['winning_bid']._serialized_options = b'\310\336\037\000'
  _WINNINGBIDRECORD._options = None
  _WINNINGBIDRECORD._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GENESISSTATE']._serialized_start=233
  _globals['_GENESISSTATE']._serialized_end=911
  _globals['_LASTREWARDSAUCTIONIDRECORD']._serialized_start=913
  _globals['_LASTREWARDSAUCTIONIDRECORD']._serialized_end=1007
  _globals['_WINNINGBIDRECORD']._serialized_start=1010
  _globals['_WINNINGBIDRECORD']._serialized_end=1145
# @@protoc_insertion_point(module_scope)
