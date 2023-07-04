# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/htlc/htlc.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17irismod/htlc/htlc.proto\x12\x0cirismod.htlc\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\"\xcf\x05\n\x04HTLC\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12\x16\n\x06sender\x18\x02 \x01(\tR\x06sender\x12\x0e\n\x02to\x18\x03 \x01(\tR\x02to\x12Y\n\x17receiver_on_other_chain\x18\x04 \x01(\tB\"\xf2\xde\x1f\x1eyaml:\"receiver_on_other_chain\"R\x14receiverOnOtherChain\x12S\n\x15sender_on_other_chain\x18\x05 \x01(\tB \xf2\xde\x1f\x1cyaml:\"sender_on_other_chain\"R\x12senderOnOtherChain\x12\x63\n\x06\x61mount\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12\x31\n\thash_lock\x18\x07 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"hash_lock\"R\x08hashLock\x12\x16\n\x06secret\x18\x08 \x01(\tR\x06secret\x12\x1c\n\ttimestamp\x18\t \x01(\x04R\ttimestamp\x12I\n\x11\x65xpiration_height\x18\n \x01(\x04\x42\x1c\xf2\xde\x1f\x18yaml:\"expiration_height\"R\x10\x65xpirationHeight\x12-\n\x05state\x18\x0b \x01(\x0e\x32\x17.irismod.htlc.HTLCStateR\x05state\x12:\n\x0c\x63losed_block\x18\x0c \x01(\x04\x42\x17\xf2\xde\x1f\x13yaml:\"closed_block\"R\x0b\x63losedBlock\x12\x1a\n\x08transfer\x18\r \x01(\x08R\x08transfer\x12\x39\n\tdirection\x18\x0e \x01(\x0e\x32\x1b.irismod.htlc.SwapDirectionR\tdirection:\x04\xe8\xa0\x1f\x01\"\xa8\x04\n\x0b\x41ssetSupply\x12\x62\n\x0fincoming_supply\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1e\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"incoming_supply\"R\x0eincomingSupply\x12n\n\x0foutgoing_supply\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB*\xc8\xde\x1f\x00\xf2\xde\x1f\"yaml:\"assetoutgoing_supply_params\"R\x0eoutgoingSupply\x12_\n\x0e\x63urrent_supply\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x1d\xc8\xde\x1f\x00\xf2\xde\x1f\x15yaml:\"current_supply\"R\rcurrentSupply\x12\x84\x01\n\x1btime_limited_current_supply\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB*\xc8\xde\x1f\x00\xf2\xde\x1f\"yaml:\"time_limited_current_supply\"R\x18timeLimitedCurrentSupply\x12]\n\x0ctime_elapsed\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x1f\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"time_elapsed\"\x98\xdf\x1f\x01R\x0btimeElapsed\"l\n\x06Params\x12X\n\x0c\x61sset_params\x18\x01 \x03(\x0b\x32\x18.irismod.htlc.AssetParamB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"asset_params\"R\x0b\x61ssetParams:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xe0\x04\n\nAssetParam\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12Y\n\x0csupply_limit\x18\x02 \x01(\x0b\x32\x19.irismod.htlc.SupplyLimitB\x1b\xc8\xde\x1f\x00\xf2\xde\x1f\x13yaml:\"supply_limit\"R\x0bsupplyLimit\x12\x16\n\x06\x61\x63tive\x18\x03 \x01(\x08R\x06\x61\x63tive\x12@\n\x0e\x64\x65puty_address\x18\x04 \x01(\tB\x19\xf2\xde\x1f\x15yaml:\"deputy_address\"R\rdeputyAddress\x12K\n\tfixed_fee\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x08\x66ixedFee\x12V\n\x0fmin_swap_amount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rminSwapAmount\x12V\n\x0fmax_swap_amount\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rmaxSwapAmount\x12?\n\x0emin_block_lock\x18\x08 \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"min_block_lock\"R\x0cminBlockLock\x12?\n\x0emax_block_lock\x18\t \x01(\x04\x42\x19\xf2\xde\x1f\x15yaml:\"max_block_lock\"R\x0cmaxBlockLock:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xcf\x02\n\x0bSupplyLimit\x12\x44\n\x05limit\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x05limit\x12:\n\x0ctime_limited\x18\x02 \x01(\x08\x42\x17\xf2\xde\x1f\x13yaml:\"time_limited\"R\x0btimeLimited\x12Z\n\x0btime_period\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x1e\xc8\xde\x1f\x00\xf2\xde\x1f\x12yaml:\"time_period\"\x98\xdf\x1f\x01R\ntimePeriod\x12X\n\x10time_based_limit\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0etimeBasedLimit:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01*\x80\x01\n\tHTLCState\x12\x1d\n\x0fHTLC_STATE_OPEN\x10\x00\x1a\x08\x8a\x9d \x04Open\x12\'\n\x14HTLC_STATE_COMPLETED\x10\x01\x1a\r\x8a\x9d \tCompleted\x12%\n\x13HTLC_STATE_REFUNDED\x10\x02\x1a\x0c\x8a\x9d \x08Refunded\x1a\x04\x88\xa3\x1e\x00*a\n\rSwapDirection\x12\x12\n\x04NONE\x10\x00\x1a\x08\x8a\x9d \x04None\x12\x1a\n\x08INCOMING\x10\x01\x1a\x0c\x8a\x9d \x08Incoming\x12\x1a\n\x08OUTGOING\x10\x02\x1a\x0c\x8a\x9d \x08Outgoing\x1a\x04\x88\xa3\x1e\x00\x42\xa1\x01\n\x10\x63om.irismod.htlcB\tHtlcProtoP\x01Z-github.com/irisnet/irismod/modules/htlc/types\xa2\x02\x03IHX\xaa\x02\x0cIrismod.Htlc\xca\x02\x0cIrismod\\Htlc\xe2\x02\x18Irismod\\Htlc\\GPBMetadata\xea\x02\rIrismod::Htlc\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.htlc.htlc_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\020com.irismod.htlcB\tHtlcProtoP\001Z-github.com/irisnet/irismod/modules/htlc/types\242\002\003IHX\252\002\014Irismod.Htlc\312\002\014Irismod\\Htlc\342\002\030Irismod\\Htlc\\GPBMetadata\352\002\rIrismod::Htlc\310\341\036\000'
  _HTLCSTATE._options = None
  _HTLCSTATE._serialized_options = b'\210\243\036\000'
  _HTLCSTATE.values_by_name["HTLC_STATE_OPEN"]._options = None
  _HTLCSTATE.values_by_name["HTLC_STATE_OPEN"]._serialized_options = b'\212\235 \004Open'
  _HTLCSTATE.values_by_name["HTLC_STATE_COMPLETED"]._options = None
  _HTLCSTATE.values_by_name["HTLC_STATE_COMPLETED"]._serialized_options = b'\212\235 \tCompleted'
  _HTLCSTATE.values_by_name["HTLC_STATE_REFUNDED"]._options = None
  _HTLCSTATE.values_by_name["HTLC_STATE_REFUNDED"]._serialized_options = b'\212\235 \010Refunded'
  _SWAPDIRECTION._options = None
  _SWAPDIRECTION._serialized_options = b'\210\243\036\000'
  _SWAPDIRECTION.values_by_name["NONE"]._options = None
  _SWAPDIRECTION.values_by_name["NONE"]._serialized_options = b'\212\235 \004None'
  _SWAPDIRECTION.values_by_name["INCOMING"]._options = None
  _SWAPDIRECTION.values_by_name["INCOMING"]._serialized_options = b'\212\235 \010Incoming'
  _SWAPDIRECTION.values_by_name["OUTGOING"]._options = None
  _SWAPDIRECTION.values_by_name["OUTGOING"]._serialized_options = b'\212\235 \010Outgoing'
  _HTLC.fields_by_name['receiver_on_other_chain']._options = None
  _HTLC.fields_by_name['receiver_on_other_chain']._serialized_options = b'\362\336\037\036yaml:\"receiver_on_other_chain\"'
  _HTLC.fields_by_name['sender_on_other_chain']._options = None
  _HTLC.fields_by_name['sender_on_other_chain']._serialized_options = b'\362\336\037\034yaml:\"sender_on_other_chain\"'
  _HTLC.fields_by_name['amount']._options = None
  _HTLC.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _HTLC.fields_by_name['hash_lock']._options = None
  _HTLC.fields_by_name['hash_lock']._serialized_options = b'\362\336\037\020yaml:\"hash_lock\"'
  _HTLC.fields_by_name['expiration_height']._options = None
  _HTLC.fields_by_name['expiration_height']._serialized_options = b'\362\336\037\030yaml:\"expiration_height\"'
  _HTLC.fields_by_name['closed_block']._options = None
  _HTLC.fields_by_name['closed_block']._serialized_options = b'\362\336\037\023yaml:\"closed_block\"'
  _HTLC._options = None
  _HTLC._serialized_options = b'\350\240\037\001'
  _ASSETSUPPLY.fields_by_name['incoming_supply']._options = None
  _ASSETSUPPLY.fields_by_name['incoming_supply']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"incoming_supply\"'
  _ASSETSUPPLY.fields_by_name['outgoing_supply']._options = None
  _ASSETSUPPLY.fields_by_name['outgoing_supply']._serialized_options = b'\310\336\037\000\362\336\037\"yaml:\"assetoutgoing_supply_params\"'
  _ASSETSUPPLY.fields_by_name['current_supply']._options = None
  _ASSETSUPPLY.fields_by_name['current_supply']._serialized_options = b'\310\336\037\000\362\336\037\025yaml:\"current_supply\"'
  _ASSETSUPPLY.fields_by_name['time_limited_current_supply']._options = None
  _ASSETSUPPLY.fields_by_name['time_limited_current_supply']._serialized_options = b'\310\336\037\000\362\336\037\"yaml:\"time_limited_current_supply\"'
  _ASSETSUPPLY.fields_by_name['time_elapsed']._options = None
  _ASSETSUPPLY.fields_by_name['time_elapsed']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"time_elapsed\"\230\337\037\001'
  _PARAMS.fields_by_name['asset_params']._options = None
  _PARAMS.fields_by_name['asset_params']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"asset_params\"'
  _PARAMS._options = None
  _PARAMS._serialized_options = b'\230\240\037\000\350\240\037\001'
  _ASSETPARAM.fields_by_name['supply_limit']._options = None
  _ASSETPARAM.fields_by_name['supply_limit']._serialized_options = b'\310\336\037\000\362\336\037\023yaml:\"supply_limit\"'
  _ASSETPARAM.fields_by_name['deputy_address']._options = None
  _ASSETPARAM.fields_by_name['deputy_address']._serialized_options = b'\362\336\037\025yaml:\"deputy_address\"'
  _ASSETPARAM.fields_by_name['fixed_fee']._options = None
  _ASSETPARAM.fields_by_name['fixed_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ASSETPARAM.fields_by_name['min_swap_amount']._options = None
  _ASSETPARAM.fields_by_name['min_swap_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ASSETPARAM.fields_by_name['max_swap_amount']._options = None
  _ASSETPARAM.fields_by_name['max_swap_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _ASSETPARAM.fields_by_name['min_block_lock']._options = None
  _ASSETPARAM.fields_by_name['min_block_lock']._serialized_options = b'\362\336\037\025yaml:\"min_block_lock\"'
  _ASSETPARAM.fields_by_name['max_block_lock']._options = None
  _ASSETPARAM.fields_by_name['max_block_lock']._serialized_options = b'\362\336\037\025yaml:\"max_block_lock\"'
  _ASSETPARAM._options = None
  _ASSETPARAM._serialized_options = b'\230\240\037\000\350\240\037\001'
  _SUPPLYLIMIT.fields_by_name['limit']._options = None
  _SUPPLYLIMIT.fields_by_name['limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _SUPPLYLIMIT.fields_by_name['time_limited']._options = None
  _SUPPLYLIMIT.fields_by_name['time_limited']._serialized_options = b'\362\336\037\023yaml:\"time_limited\"'
  _SUPPLYLIMIT.fields_by_name['time_period']._options = None
  _SUPPLYLIMIT.fields_by_name['time_period']._serialized_options = b'\310\336\037\000\362\336\037\022yaml:\"time_period\"\230\337\037\001'
  _SUPPLYLIMIT.fields_by_name['time_based_limit']._options = None
  _SUPPLYLIMIT.fields_by_name['time_based_limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _SUPPLYLIMIT._options = None
  _SUPPLYLIMIT._serialized_options = b'\230\240\037\000\350\240\037\001'
  _globals['_HTLCSTATE']._serialized_start=2464
  _globals['_HTLCSTATE']._serialized_end=2592
  _globals['_SWAPDIRECTION']._serialized_start=2594
  _globals['_SWAPDIRECTION']._serialized_end=2691
  _globals['_HTLC']._serialized_start=128
  _globals['_HTLC']._serialized_end=847
  _globals['_ASSETSUPPLY']._serialized_start=850
  _globals['_ASSETSUPPLY']._serialized_end=1402
  _globals['_PARAMS']._serialized_start=1404
  _globals['_PARAMS']._serialized_end=1512
  _globals['_ASSETPARAM']._serialized_start=1515
  _globals['_ASSETPARAM']._serialized_end=2123
  _globals['_SUPPLYLIMIT']._serialized_start=2126
  _globals['_SUPPLYLIMIT']._serialized_end=2461
# @@protoc_insertion_point(module_scope)