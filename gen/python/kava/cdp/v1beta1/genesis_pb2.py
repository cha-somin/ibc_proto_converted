# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/cdp/v1beta1/genesis.proto
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
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from kava.cdp.v1beta1 import cdp_pb2 as kava_dot_cdp_dot_v1beta1_dot_cdp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ekava/cdp/v1beta1/genesis.proto\x12\x10kava.cdp.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1akava/cdp/v1beta1/cdp.proto\"\xc9\x04\n\x0cGenesisState\x12\x36\n\x06params\x18\x01 \x01(\x0b\x32\x18.kava.cdp.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12?\n\x04\x63\x64ps\x18\x02 \x03(\x0b\x32\x15.kava.cdp.v1beta1.CDPB\x14\xc8\xde\x1f\x00\xe2\xde\x1f\x04\x43\x44Ps\xaa\xdf\x1f\x04\x43\x44PsR\x04\x63\x64ps\x12G\n\x08\x64\x65posits\x18\x03 \x03(\x0b\x32\x19.kava.cdp.v1beta1.DepositB\x10\xc8\xde\x1f\x00\xaa\xdf\x1f\x08\x44\x65positsR\x08\x64\x65posits\x12\x39\n\x0fstarting_cdp_id\x18\x04 \x01(\x04\x42\x11\xe2\xde\x1f\rStartingCdpIDR\rstartingCdpId\x12\x1d\n\ndebt_denom\x18\x05 \x01(\tR\tdebtDenom\x12\x1b\n\tgov_denom\x18\x06 \x01(\tR\x08govDenom\x12\x8b\x01\n\x1bprevious_accumulation_times\x18\x07 \x03(\x0b\x32).kava.cdp.v1beta1.GenesisAccumulationTimeB \xc8\xde\x1f\x00\xaa\xdf\x1f\x18GenesisAccumulationTimesR\x19previousAccumulationTimes\x12r\n\x10total_principals\x18\x08 \x03(\x0b\x32\'.kava.cdp.v1beta1.GenesisTotalPrincipalB\x1e\xc8\xde\x1f\x00\xaa\xdf\x1f\x16GenesisTotalPrincipalsR\x0ftotalPrincipals\"\xee\x05\n\x06Params\x12h\n\x11\x63ollateral_params\x18\x01 \x03(\x0b\x32!.kava.cdp.v1beta1.CollateralParamB\x18\xc8\xde\x1f\x00\xaa\xdf\x1f\x10\x43ollateralParamsR\x10\x63ollateralParams\x12@\n\ndebt_param\x18\x02 \x01(\x0b\x32\x1b.kava.cdp.v1beta1.DebtParamB\x04\xc8\xde\x1f\x00R\tdebtParam\x12K\n\x11global_debt_limit\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x0fglobalDebtLimit\x12x\n\x19surplus_auction_threshold\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x17surplusAuctionThreshold\x12l\n\x13surplus_auction_lot\x18\x05 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x11surplusAuctionLot\x12r\n\x16\x64\x65\x62t_auction_threshold\x18\x06 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x14\x64\x65\x62tAuctionThreshold\x12\x66\n\x10\x64\x65\x62t_auction_lot\x18\x07 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0e\x64\x65\x62tAuctionLot\x12\'\n\x0f\x63ircuit_breaker\x18\x08 \x01(\x08R\x0e\x63ircuitBreaker\"\x92\x02\n\tDebtParam\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\'\n\x0freference_asset\x18\x02 \x01(\tR\x0ereferenceAsset\x12i\n\x11\x63onversion_factor\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x10\x63onversionFactor\x12[\n\ndebt_floor\x18\x04 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\tdebtFloor\"\x8f\x08\n\x0f\x43ollateralParam\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x12\n\x04type\x18\x02 \x01(\tR\x04type\x12i\n\x11liquidation_ratio\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x10liquidationRatio\x12>\n\ndebt_limit\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tdebtLimit\x12\x61\n\rstability_fee\x18\x05 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0cstabilityFee\x12_\n\x0c\x61uction_size\x18\x06 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0b\x61uctionSize\x12m\n\x13liquidation_penalty\x18\x07 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x12liquidationPenalty\x12\x36\n\x0espot_market_id\x18\x08 \x01(\tB\x10\xe2\xde\x1f\x0cSpotMarketIDR\x0cspotMarketId\x12K\n\x15liquidation_market_id\x18\t \x01(\tB\x17\xe2\xde\x1f\x13LiquidationMarketIDR\x13liquidationMarketId\x12v\n\x18keeper_reward_percentage\x18\n \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x16keeperRewardPercentage\x12\x8b\x01\n#check_collateralization_index_count\x18\x0b \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR checkCollateralizationIndexCount\x12i\n\x11\x63onversion_factor\x18\x0c \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x10\x63onversionFactor\"\x8d\x02\n\x17GenesisAccumulationTime\x12\'\n\x0f\x63ollateral_type\x18\x01 \x01(\tR\x0e\x63ollateralType\x12\x62\n\x1aprevious_accumulation_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x18previousAccumulationTime\x12\x65\n\x0finterest_factor\x18\x03 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xd2\xb4-\ncosmos.DecR\x0einterestFactor\"\xa7\x01\n\x15GenesisTotalPrincipal\x12\'\n\x0f\x63ollateral_type\x18\x01 \x01(\tR\x0e\x63ollateralType\x12\x65\n\x0ftotal_principal\x18\x02 \x01(\tB<\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xd2\xb4-\ncosmos.IntR\x0etotalPrincipalB\xad\x01\n\x14\x63om.kava.cdp.v1beta1B\x0cGenesisProtoP\x01Z%github.com/kava-labs/kava/x/cdp/types\xa2\x02\x03KCX\xaa\x02\x10Kava.Cdp.V1beta1\xca\x02\x10Kava\\Cdp\\V1beta1\xe2\x02\x1cKava\\Cdp\\V1beta1\\GPBMetadata\xea\x02\x12Kava::Cdp::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.cdp.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.kava.cdp.v1beta1B\014GenesisProtoP\001Z%github.com/kava-labs/kava/x/cdp/types\242\002\003KCX\252\002\020Kava.Cdp.V1beta1\312\002\020Kava\\Cdp\\V1beta1\342\002\034Kava\\Cdp\\V1beta1\\GPBMetadata\352\002\022Kava::Cdp::V1beta1'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['cdps']._options = None
  _GENESISSTATE.fields_by_name['cdps']._serialized_options = b'\310\336\037\000\342\336\037\004CDPs\252\337\037\004CDPs'
  _GENESISSTATE.fields_by_name['deposits']._options = None
  _GENESISSTATE.fields_by_name['deposits']._serialized_options = b'\310\336\037\000\252\337\037\010Deposits'
  _GENESISSTATE.fields_by_name['starting_cdp_id']._options = None
  _GENESISSTATE.fields_by_name['starting_cdp_id']._serialized_options = b'\342\336\037\rStartingCdpID'
  _GENESISSTATE.fields_by_name['previous_accumulation_times']._options = None
  _GENESISSTATE.fields_by_name['previous_accumulation_times']._serialized_options = b'\310\336\037\000\252\337\037\030GenesisAccumulationTimes'
  _GENESISSTATE.fields_by_name['total_principals']._options = None
  _GENESISSTATE.fields_by_name['total_principals']._serialized_options = b'\310\336\037\000\252\337\037\026GenesisTotalPrincipals'
  _PARAMS.fields_by_name['collateral_params']._options = None
  _PARAMS.fields_by_name['collateral_params']._serialized_options = b'\310\336\037\000\252\337\037\020CollateralParams'
  _PARAMS.fields_by_name['debt_param']._options = None
  _PARAMS.fields_by_name['debt_param']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['global_debt_limit']._options = None
  _PARAMS.fields_by_name['global_debt_limit']._serialized_options = b'\310\336\037\000'
  _PARAMS.fields_by_name['surplus_auction_threshold']._options = None
  _PARAMS.fields_by_name['surplus_auction_threshold']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _PARAMS.fields_by_name['surplus_auction_lot']._options = None
  _PARAMS.fields_by_name['surplus_auction_lot']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _PARAMS.fields_by_name['debt_auction_threshold']._options = None
  _PARAMS.fields_by_name['debt_auction_threshold']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _PARAMS.fields_by_name['debt_auction_lot']._options = None
  _PARAMS.fields_by_name['debt_auction_lot']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _DEBTPARAM.fields_by_name['conversion_factor']._options = None
  _DEBTPARAM.fields_by_name['conversion_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _DEBTPARAM.fields_by_name['debt_floor']._options = None
  _DEBTPARAM.fields_by_name['debt_floor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _COLLATERALPARAM.fields_by_name['liquidation_ratio']._options = None
  _COLLATERALPARAM.fields_by_name['liquidation_ratio']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _COLLATERALPARAM.fields_by_name['debt_limit']._options = None
  _COLLATERALPARAM.fields_by_name['debt_limit']._serialized_options = b'\310\336\037\000'
  _COLLATERALPARAM.fields_by_name['stability_fee']._options = None
  _COLLATERALPARAM.fields_by_name['stability_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _COLLATERALPARAM.fields_by_name['auction_size']._options = None
  _COLLATERALPARAM.fields_by_name['auction_size']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _COLLATERALPARAM.fields_by_name['liquidation_penalty']._options = None
  _COLLATERALPARAM.fields_by_name['liquidation_penalty']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _COLLATERALPARAM.fields_by_name['spot_market_id']._options = None
  _COLLATERALPARAM.fields_by_name['spot_market_id']._serialized_options = b'\342\336\037\014SpotMarketID'
  _COLLATERALPARAM.fields_by_name['liquidation_market_id']._options = None
  _COLLATERALPARAM.fields_by_name['liquidation_market_id']._serialized_options = b'\342\336\037\023LiquidationMarketID'
  _COLLATERALPARAM.fields_by_name['keeper_reward_percentage']._options = None
  _COLLATERALPARAM.fields_by_name['keeper_reward_percentage']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _COLLATERALPARAM.fields_by_name['check_collateralization_index_count']._options = None
  _COLLATERALPARAM.fields_by_name['check_collateralization_index_count']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _COLLATERALPARAM.fields_by_name['conversion_factor']._options = None
  _COLLATERALPARAM.fields_by_name['conversion_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _GENESISACCUMULATIONTIME.fields_by_name['previous_accumulation_time']._options = None
  _GENESISACCUMULATIONTIME.fields_by_name['previous_accumulation_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _GENESISACCUMULATIONTIME.fields_by_name['interest_factor']._options = None
  _GENESISACCUMULATIONTIME.fields_by_name['interest_factor']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\322\264-\ncosmos.Dec'
  _GENESISTOTALPRINCIPAL.fields_by_name['total_principal']._options = None
  _GENESISTOTALPRINCIPAL.fields_by_name['total_principal']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\322\264-\ncosmos.Int'
  _globals['_GENESISSTATE']._serialized_start=195
  _globals['_GENESISSTATE']._serialized_end=780
  _globals['_PARAMS']._serialized_start=783
  _globals['_PARAMS']._serialized_end=1533
  _globals['_DEBTPARAM']._serialized_start=1536
  _globals['_DEBTPARAM']._serialized_end=1810
  _globals['_COLLATERALPARAM']._serialized_start=1813
  _globals['_COLLATERALPARAM']._serialized_end=2852
  _globals['_GENESISACCUMULATIONTIME']._serialized_start=2855
  _globals['_GENESISACCUMULATIONTIME']._serialized_end=3124
  _globals['_GENESISTOTALPRINCIPAL']._serialized_start=3127
  _globals['_GENESISTOTALPRINCIPAL']._serialized_end=3294
# @@protoc_insertion_point(module_scope)