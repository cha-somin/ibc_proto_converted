# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/bep3/v1beta1/bep3.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ckava/bep3/v1beta1/bep3.proto\x12\x11kava.bep3.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1egoogle/protobuf/duration.proto\"_\n\x06Params\x12U\n\x0c\x61sset_params\x18\x01 \x03(\x0b\x32\x1d.kava.bep3.v1beta1.AssetParamB\x13\xc8\xde\x1f\x00\xaa\xdf\x1f\x0b\x41ssetParamsR\x0b\x61ssetParams\"\x8c\x05\n\nAssetParam\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12#\n\x07\x63oin_id\x18\x02 \x01(\x03\x42\n\xe2\xde\x1f\x06\x43oinIDR\x06\x63oinId\x12G\n\x0csupply_limit\x18\x03 \x01(\x0b\x32\x1e.kava.bep3.v1beta1.SupplyLimitB\x04\xc8\xde\x1f\x00R\x0bsupplyLimit\x12\x16\n\x06\x61\x63tive\x18\x04 \x01(\x08R\x06\x61\x63tive\x12o\n\x0e\x64\x65puty_address\x18\x05 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\rdeputyAddress\x12Y\n\tfixed_fee\x18\x06 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x08\x66ixedFee\x12\x64\n\x0fmin_swap_amount\x18\x07 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\rminSwapAmount\x12\x64\n\x0fmax_swap_amount\x18\x08 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\rmaxSwapAmount\x12$\n\x0emin_block_lock\x18\t \x01(\x04R\x0cminBlockLock\x12$\n\x0emax_block_lock\x18\n \x01(\x04R\x0cmaxBlockLock\"\xb2\x02\n\x0bSupplyLimit\x12R\n\x05limit\x18\x01 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x05limit\x12!\n\x0ctime_limited\x18\x02 \x01(\x08R\x0btimeLimited\x12\x44\n\x0btime_period\x18\x03 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\ntimePeriod\x12\x66\n\x10time_based_limit\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0etimeBasedLimit\"\x83\x06\n\nAtomicSwap\x12\x63\n\x06\x61mount\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\x12\x66\n\x12random_number_hash\x18\x02 \x01(\x0c\x42\x38\xfa\xde\x1f\x34github.com/tendermint/tendermint/libs/bytes.HexBytesR\x10randomNumberHash\x12#\n\rexpire_height\x18\x03 \x01(\x04R\x0c\x65xpireHeight\x12\x1c\n\ttimestamp\x18\x04 \x01(\x03R\ttimestamp\x12`\n\x06sender\x18\x05 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x06sender\x12\x66\n\trecipient\x18\x06 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\trecipient\x12,\n\x12sender_other_chain\x18\x07 \x01(\tR\x10senderOtherChain\x12\x32\n\x15recipient_other_chain\x18\x08 \x01(\tR\x13recipientOtherChain\x12!\n\x0c\x63losed_block\x18\t \x01(\x03R\x0b\x63losedBlock\x12\x35\n\x06status\x18\n \x01(\x0e\x32\x1d.kava.bep3.v1beta1.SwapStatusR\x06status\x12\x1f\n\x0b\x63ross_chain\x18\x0b \x01(\x08R\ncrossChain\x12>\n\tdirection\x18\x0c \x01(\x0e\x32 .kava.bep3.v1beta1.SwapDirectionR\tdirection\"\x91\x03\n\x0b\x41ssetSupply\x12H\n\x0fincoming_supply\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0eincomingSupply\x12H\n\x0foutgoing_supply\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0eoutgoingSupply\x12\x46\n\x0e\x63urrent_supply\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\rcurrentSupply\x12^\n\x1btime_limited_current_supply\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x18timeLimitedCurrentSupply\x12\x46\n\x0ctime_elapsed\x18\x05 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\x0btimeElapsed*y\n\nSwapStatus\x12\x1b\n\x17SWAP_STATUS_UNSPECIFIED\x10\x00\x12\x14\n\x10SWAP_STATUS_OPEN\x10\x01\x12\x19\n\x15SWAP_STATUS_COMPLETED\x10\x02\x12\x17\n\x13SWAP_STATUS_EXPIRED\x10\x03\x1a\x04\x88\xa3\x1e\x00*o\n\rSwapDirection\x12\x1e\n\x1aSWAP_DIRECTION_UNSPECIFIED\x10\x00\x12\x1b\n\x17SWAP_DIRECTION_INCOMING\x10\x01\x12\x1b\n\x17SWAP_DIRECTION_OUTGOING\x10\x02\x1a\x04\x88\xa3\x1e\x00\x42\xb0\x01\n\x15\x63om.kava.bep3.v1beta1B\tBep3ProtoP\x01Z&github.com/kava-labs/kava/x/bep3/types\xa2\x02\x03KBX\xaa\x02\x11Kava.Bep3.V1beta1\xca\x02\x11Kava\\Bep3\\V1beta1\xe2\x02\x1dKava\\Bep3\\V1beta1\\GPBMetadata\xea\x02\x13Kava::Bep3::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.bep3.v1beta1.bep3_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\025com.kava.bep3.v1beta1B\tBep3ProtoP\001Z&github.com/kava-labs/kava/x/bep3/types\242\002\003KBX\252\002\021Kava.Bep3.V1beta1\312\002\021Kava\\Bep3\\V1beta1\342\002\035Kava\\Bep3\\V1beta1\\GPBMetadata\352\002\023Kava::Bep3::V1beta1'
  _SWAPSTATUS._options = None
  _SWAPSTATUS._serialized_options = b'\210\243\036\000'
  _SWAPDIRECTION._options = None
  _SWAPDIRECTION._serialized_options = b'\210\243\036\000'
  _PARAMS.fields_by_name['asset_params']._options = None
  _PARAMS.fields_by_name['asset_params']._serialized_options = b'\310\336\037\000\252\337\037\013AssetParams'
  _ASSETPARAM.fields_by_name['coin_id']._options = None
  _ASSETPARAM.fields_by_name['coin_id']._serialized_options = b'\342\336\037\006CoinID'
  _ASSETPARAM.fields_by_name['supply_limit']._options = None
  _ASSETPARAM.fields_by_name['supply_limit']._serialized_options = b'\310\336\037\000'
  _ASSETPARAM.fields_by_name['deputy_address']._options = None
  _ASSETPARAM.fields_by_name['deputy_address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _ASSETPARAM.fields_by_name['fixed_fee']._options = None
  _ASSETPARAM.fields_by_name['fixed_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _ASSETPARAM.fields_by_name['min_swap_amount']._options = None
  _ASSETPARAM.fields_by_name['min_swap_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _ASSETPARAM.fields_by_name['max_swap_amount']._options = None
  _ASSETPARAM.fields_by_name['max_swap_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _SUPPLYLIMIT.fields_by_name['limit']._options = None
  _SUPPLYLIMIT.fields_by_name['limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _SUPPLYLIMIT.fields_by_name['time_period']._options = None
  _SUPPLYLIMIT.fields_by_name['time_period']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _SUPPLYLIMIT.fields_by_name['time_based_limit']._options = None
  _SUPPLYLIMIT.fields_by_name['time_based_limit']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _ATOMICSWAP.fields_by_name['amount']._options = None
  _ATOMICSWAP.fields_by_name['amount']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _ATOMICSWAP.fields_by_name['random_number_hash']._options = None
  _ATOMICSWAP.fields_by_name['random_number_hash']._serialized_options = b'\372\336\0374github.com/tendermint/tendermint/libs/bytes.HexBytes'
  _ATOMICSWAP.fields_by_name['sender']._options = None
  _ATOMICSWAP.fields_by_name['sender']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _ATOMICSWAP.fields_by_name['recipient']._options = None
  _ATOMICSWAP.fields_by_name['recipient']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _ASSETSUPPLY.fields_by_name['incoming_supply']._options = None
  _ASSETSUPPLY.fields_by_name['incoming_supply']._serialized_options = b'\310\336\037\000'
  _ASSETSUPPLY.fields_by_name['outgoing_supply']._options = None
  _ASSETSUPPLY.fields_by_name['outgoing_supply']._serialized_options = b'\310\336\037\000'
  _ASSETSUPPLY.fields_by_name['current_supply']._options = None
  _ASSETSUPPLY.fields_by_name['current_supply']._serialized_options = b'\310\336\037\000'
  _ASSETSUPPLY.fields_by_name['time_limited_current_supply']._options = None
  _ASSETSUPPLY.fields_by_name['time_limited_current_supply']._serialized_options = b'\310\336\037\000'
  _ASSETSUPPLY.fields_by_name['time_elapsed']._options = None
  _ASSETSUPPLY.fields_by_name['time_elapsed']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _globals['_SWAPSTATUS']._serialized_start=2403
  _globals['_SWAPSTATUS']._serialized_end=2524
  _globals['_SWAPDIRECTION']._serialized_start=2526
  _globals['_SWAPDIRECTION']._serialized_end=2637
  _globals['_PARAMS']._serialized_start=164
  _globals['_PARAMS']._serialized_end=259
  _globals['_ASSETPARAM']._serialized_start=262
  _globals['_ASSETPARAM']._serialized_end=914
  _globals['_SUPPLYLIMIT']._serialized_start=917
  _globals['_SUPPLYLIMIT']._serialized_end=1223
  _globals['_ATOMICSWAP']._serialized_start=1226
  _globals['_ATOMICSWAP']._serialized_end=1997
  _globals['_ASSETSUPPLY']._serialized_start=2000
  _globals['_ASSETSUPPLY']._serialized_end=2401
# @@protoc_insertion_point(module_scope)
