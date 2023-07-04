# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/liquidity/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from comdex.liquidity.v1beta1 import liquidity_pb2 as comdex_dot_liquidity_dot_v1beta1_dot_liquidity__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!comdex/liquidity/v1beta1/tx.proto\x12\x18\x63omdex.liquidity.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x1egoogle/protobuf/duration.proto\x1a(comdex/liquidity/v1beta1/liquidity.proto\"\x92\x01\n\rMsgCreatePair\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12&\n\x0f\x62\x61se_coin_denom\x18\x02 \x01(\tR\rbaseCoinDenom\x12(\n\x10quote_coin_denom\x18\x03 \x01(\tR\x0equoteCoinDenom\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x17\n\x15MsgCreatePairResponse\"\xcb\x01\n\rMsgCreatePool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12p\n\rdeposit_coins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0c\x64\x65positCoins\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x17\n\x15MsgCreatePoolResponse\"\xc0\x03\n\x13MsgCreateRangedPool\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pair_id\x18\x03 \x01(\x04R\x06pairId\x12p\n\rdeposit_coins\x18\x04 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0c\x64\x65positCoins\x12K\n\tmin_price\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08minPrice\x12K\n\tmax_price\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x08maxPrice\x12S\n\rinitial_price\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0cinitialPrice\"\x1d\n\x1bMsgCreateRangedPoolResponse\"\xcc\x01\n\nMsgDeposit\x12\x1c\n\tdepositor\x18\x01 \x01(\tR\tdepositor\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12p\n\rdeposit_coins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0c\x64\x65positCoins\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x14\n\x12MsgDepositResponse\"\x9b\x01\n\x0bMsgWithdraw\x12\x1e\n\nwithdrawer\x18\x01 \x01(\tR\nwithdrawer\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12<\n\tpool_coin\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08poolCoin\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x15\n\x13MsgWithdrawResponse\"\xe7\x03\n\rMsgLimitOrder\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x46\n\tdirection\x18\x03 \x01(\x0e\x32(.comdex.liquidity.v1beta1.OrderDirectionR\tdirection\x12>\n\noffer_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tofferCoin\x12*\n\x11\x64\x65mand_coin_denom\x18\x05 \x01(\tR\x0f\x64\x65mandCoinDenom\x12\x44\n\x05price\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05price\x12\x46\n\x06\x61mount\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12J\n\x0eorder_lifespan\x18\x08 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\rorderLifespan\x12\x15\n\x06\x61pp_id\x18\t \x01(\x04R\x05\x61ppId\"\x17\n\x15MsgLimitOrderResponse\"\xa2\x03\n\x0eMsgMarketOrder\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x46\n\tdirection\x18\x03 \x01(\x0e\x32(.comdex.liquidity.v1beta1.OrderDirectionR\tdirection\x12>\n\noffer_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\tofferCoin\x12*\n\x11\x64\x65mand_coin_denom\x18\x05 \x01(\tR\x0f\x64\x65mandCoinDenom\x12\x46\n\x06\x61mount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x06\x61mount\x12J\n\x0eorder_lifespan\x18\x07 \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\rorderLifespan\x12\x15\n\x06\x61pp_id\x18\x08 \x01(\x04R\x05\x61ppId\"\x18\n\x16MsgMarketOrderResponse\"\x96\x05\n\nMsgMMOrder\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pair_id\x18\x03 \x01(\x04R\x06pairId\x12T\n\x0emax_sell_price\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0cmaxSellPrice\x12T\n\x0emin_sell_price\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0cminSellPrice\x12O\n\x0bsell_amount\x18\x06 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\nsellAmount\x12R\n\rmax_buy_price\x18\x07 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0bmaxBuyPrice\x12R\n\rmin_buy_price\x18\x08 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x0bminBuyPrice\x12M\n\nbuy_amount\x18\t \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\tbuyAmount\x12J\n\x0eorder_lifespan\x18\n \x01(\x0b\x32\x19.google.protobuf.DurationB\x08\xc8\xde\x1f\x00\x98\xdf\x1f\x01R\rorderLifespan\"\x14\n\x12MsgMMOrderResponse\"u\n\x0eMsgCancelOrder\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x19\n\x08order_id\x18\x03 \x01(\x04R\x07orderId\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x18\n\x16MsgCancelOrderResponse\"`\n\x12MsgCancelAllOrders\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x19\n\x08pair_ids\x18\x02 \x03(\x04R\x07pairIds\x12\x15\n\x06\x61pp_id\x18\x03 \x01(\x04R\x05\x61ppId\"\x1c\n\x1aMsgCancelAllOrdersResponse\"\\\n\x10MsgCancelMMOrder\x12\x18\n\x07orderer\x18\x01 \x01(\tR\x07orderer\x12\x15\n\x06\x61pp_id\x18\x02 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pair_id\x18\x03 \x01(\x04R\x06pairId\"\x1a\n\x18MsgCancelMMOrderResponse\"\xe6\x01\n\x07MsgFarm\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\x12\x92\x01\n\x11\x66\x61rming_pool_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBK\xc8\xde\x1f\x00\xf2\xde\x1f\x18yaml:\"farming_pool_coin\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x0f\x66\x61rmingPoolCoin\"\x11\n\x0fMsgFarmResponse\"\xee\x01\n\tMsgUnfarm\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\x12\x98\x01\n\x13unfarming_pool_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBM\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"unfarming_pool_coin\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x11unfarmingPoolCoin\"\x13\n\x11MsgUnfarmResponse\"\xd3\x01\n\x11MsgDepositAndFarm\x12\x1c\n\tdepositor\x18\x01 \x01(\tR\tdepositor\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12p\n\rdeposit_coins\x18\x03 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB0\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x0c\x64\x65positCoins\x12\x15\n\x06\x61pp_id\x18\x04 \x01(\x04R\x05\x61ppId\"\x1b\n\x19MsgDepositAndFarmResponse\"\xf9\x01\n\x14MsgUnfarmAndWithdraw\x12\x15\n\x06\x61pp_id\x18\x01 \x01(\x04R\x05\x61ppId\x12\x17\n\x07pool_id\x18\x02 \x01(\x04R\x06poolId\x12\x16\n\x06\x66\x61rmer\x18\x03 \x01(\tR\x06\x66\x61rmer\x12\x98\x01\n\x13unfarming_pool_coin\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBM\xc8\xde\x1f\x00\xf2\xde\x1f\x1ayaml:\"unfarming_pool_coin\"\xfa\xde\x1f\'github.com/cosmos/cosmos-sdk/types.CoinR\x11unfarmingPoolCoin\"\x1e\n\x1cMsgUnfarmAndWithdrawResponse2\xb8\x0c\n\x03Msg\x12\x66\n\nCreatePair\x12\'.comdex.liquidity.v1beta1.MsgCreatePair\x1a/.comdex.liquidity.v1beta1.MsgCreatePairResponse\x12\x66\n\nCreatePool\x12\'.comdex.liquidity.v1beta1.MsgCreatePool\x1a/.comdex.liquidity.v1beta1.MsgCreatePoolResponse\x12x\n\x10\x43reateRangedPool\x12-.comdex.liquidity.v1beta1.MsgCreateRangedPool\x1a\x35.comdex.liquidity.v1beta1.MsgCreateRangedPoolResponse\x12]\n\x07\x44\x65posit\x12$.comdex.liquidity.v1beta1.MsgDeposit\x1a,.comdex.liquidity.v1beta1.MsgDepositResponse\x12`\n\x08Withdraw\x12%.comdex.liquidity.v1beta1.MsgWithdraw\x1a-.comdex.liquidity.v1beta1.MsgWithdrawResponse\x12\x66\n\nLimitOrder\x12\'.comdex.liquidity.v1beta1.MsgLimitOrder\x1a/.comdex.liquidity.v1beta1.MsgLimitOrderResponse\x12i\n\x0bMarketOrder\x12(.comdex.liquidity.v1beta1.MsgMarketOrder\x1a\x30.comdex.liquidity.v1beta1.MsgMarketOrderResponse\x12]\n\x07MMOrder\x12$.comdex.liquidity.v1beta1.MsgMMOrder\x1a,.comdex.liquidity.v1beta1.MsgMMOrderResponse\x12i\n\x0b\x43\x61ncelOrder\x12(.comdex.liquidity.v1beta1.MsgCancelOrder\x1a\x30.comdex.liquidity.v1beta1.MsgCancelOrderResponse\x12u\n\x0f\x43\x61ncelAllOrders\x12,.comdex.liquidity.v1beta1.MsgCancelAllOrders\x1a\x34.comdex.liquidity.v1beta1.MsgCancelAllOrdersResponse\x12o\n\rCancelMMOrder\x12*.comdex.liquidity.v1beta1.MsgCancelMMOrder\x1a\x32.comdex.liquidity.v1beta1.MsgCancelMMOrderResponse\x12T\n\x04\x46\x61rm\x12!.comdex.liquidity.v1beta1.MsgFarm\x1a).comdex.liquidity.v1beta1.MsgFarmResponse\x12Z\n\x06Unfarm\x12#.comdex.liquidity.v1beta1.MsgUnfarm\x1a+.comdex.liquidity.v1beta1.MsgUnfarmResponse\x12r\n\x0e\x44\x65positAndFarm\x12+.comdex.liquidity.v1beta1.MsgDepositAndFarm\x1a\x33.comdex.liquidity.v1beta1.MsgDepositAndFarmResponse\x12{\n\x11UnfarmAndWithdraw\x12..comdex.liquidity.v1beta1.MsgUnfarmAndWithdraw\x1a\x36.comdex.liquidity.v1beta1.MsgUnfarmAndWithdrawResponseB\xe2\x01\n\x1c\x63om.comdex.liquidity.v1beta1B\x07TxProtoP\x01Z3github.com/comdex-official/comdex/x/liquidity/types\xa2\x02\x03\x43LX\xaa\x02\x18\x43omdex.Liquidity.V1beta1\xca\x02\x18\x43omdex\\Liquidity\\V1beta1\xe2\x02$Comdex\\Liquidity\\V1beta1\\GPBMetadata\xea\x02\x1a\x43omdex::Liquidity::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.liquidity.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.comdex.liquidity.v1beta1B\007TxProtoP\001Z3github.com/comdex-official/comdex/x/liquidity/types\242\002\003CLX\252\002\030Comdex.Liquidity.V1beta1\312\002\030Comdex\\Liquidity\\V1beta1\342\002$Comdex\\Liquidity\\V1beta1\\GPBMetadata\352\002\032Comdex::Liquidity::V1beta1\310\341\036\000'
  _MSGCREATEPOOL.fields_by_name['deposit_coins']._options = None
  _MSGCREATEPOOL.fields_by_name['deposit_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGCREATERANGEDPOOL.fields_by_name['deposit_coins']._options = None
  _MSGCREATERANGEDPOOL.fields_by_name['deposit_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGCREATERANGEDPOOL.fields_by_name['min_price']._options = None
  _MSGCREATERANGEDPOOL.fields_by_name['min_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGCREATERANGEDPOOL.fields_by_name['max_price']._options = None
  _MSGCREATERANGEDPOOL.fields_by_name['max_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGCREATERANGEDPOOL.fields_by_name['initial_price']._options = None
  _MSGCREATERANGEDPOOL.fields_by_name['initial_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGDEPOSIT.fields_by_name['deposit_coins']._options = None
  _MSGDEPOSIT.fields_by_name['deposit_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGWITHDRAW.fields_by_name['pool_coin']._options = None
  _MSGWITHDRAW.fields_by_name['pool_coin']._serialized_options = b'\310\336\037\000'
  _MSGLIMITORDER.fields_by_name['offer_coin']._options = None
  _MSGLIMITORDER.fields_by_name['offer_coin']._serialized_options = b'\310\336\037\000'
  _MSGLIMITORDER.fields_by_name['price']._options = None
  _MSGLIMITORDER.fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGLIMITORDER.fields_by_name['amount']._options = None
  _MSGLIMITORDER.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGLIMITORDER.fields_by_name['order_lifespan']._options = None
  _MSGLIMITORDER.fields_by_name['order_lifespan']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _MSGMARKETORDER.fields_by_name['offer_coin']._options = None
  _MSGMARKETORDER.fields_by_name['offer_coin']._serialized_options = b'\310\336\037\000'
  _MSGMARKETORDER.fields_by_name['amount']._options = None
  _MSGMARKETORDER.fields_by_name['amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMARKETORDER.fields_by_name['order_lifespan']._options = None
  _MSGMARKETORDER.fields_by_name['order_lifespan']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _MSGMMORDER.fields_by_name['max_sell_price']._options = None
  _MSGMMORDER.fields_by_name['max_sell_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGMMORDER.fields_by_name['min_sell_price']._options = None
  _MSGMMORDER.fields_by_name['min_sell_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGMMORDER.fields_by_name['sell_amount']._options = None
  _MSGMMORDER.fields_by_name['sell_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMMORDER.fields_by_name['max_buy_price']._options = None
  _MSGMMORDER.fields_by_name['max_buy_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGMMORDER.fields_by_name['min_buy_price']._options = None
  _MSGMMORDER.fields_by_name['min_buy_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _MSGMMORDER.fields_by_name['buy_amount']._options = None
  _MSGMMORDER.fields_by_name['buy_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _MSGMMORDER.fields_by_name['order_lifespan']._options = None
  _MSGMMORDER.fields_by_name['order_lifespan']._serialized_options = b'\310\336\037\000\230\337\037\001'
  _MSGFARM.fields_by_name['farming_pool_coin']._options = None
  _MSGFARM.fields_by_name['farming_pool_coin']._serialized_options = b'\310\336\037\000\362\336\037\030yaml:\"farming_pool_coin\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGUNFARM.fields_by_name['unfarming_pool_coin']._options = None
  _MSGUNFARM.fields_by_name['unfarming_pool_coin']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"unfarming_pool_coin\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _MSGDEPOSITANDFARM.fields_by_name['deposit_coins']._options = None
  _MSGDEPOSITANDFARM.fields_by_name['deposit_coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGUNFARMANDWITHDRAW.fields_by_name['unfarming_pool_coin']._options = None
  _MSGUNFARMANDWITHDRAW.fields_by_name['unfarming_pool_coin']._serialized_options = b'\310\336\037\000\362\336\037\032yaml:\"unfarming_pool_coin\"\372\336\037\'github.com/cosmos/cosmos-sdk/types.Coin'
  _globals['_MSGCREATEPAIR']._serialized_start=192
  _globals['_MSGCREATEPAIR']._serialized_end=338
  _globals['_MSGCREATEPAIRRESPONSE']._serialized_start=340
  _globals['_MSGCREATEPAIRRESPONSE']._serialized_end=363
  _globals['_MSGCREATEPOOL']._serialized_start=366
  _globals['_MSGCREATEPOOL']._serialized_end=569
  _globals['_MSGCREATEPOOLRESPONSE']._serialized_start=571
  _globals['_MSGCREATEPOOLRESPONSE']._serialized_end=594
  _globals['_MSGCREATERANGEDPOOL']._serialized_start=597
  _globals['_MSGCREATERANGEDPOOL']._serialized_end=1045
  _globals['_MSGCREATERANGEDPOOLRESPONSE']._serialized_start=1047
  _globals['_MSGCREATERANGEDPOOLRESPONSE']._serialized_end=1076
  _globals['_MSGDEPOSIT']._serialized_start=1079
  _globals['_MSGDEPOSIT']._serialized_end=1283
  _globals['_MSGDEPOSITRESPONSE']._serialized_start=1285
  _globals['_MSGDEPOSITRESPONSE']._serialized_end=1305
  _globals['_MSGWITHDRAW']._serialized_start=1308
  _globals['_MSGWITHDRAW']._serialized_end=1463
  _globals['_MSGWITHDRAWRESPONSE']._serialized_start=1465
  _globals['_MSGWITHDRAWRESPONSE']._serialized_end=1486
  _globals['_MSGLIMITORDER']._serialized_start=1489
  _globals['_MSGLIMITORDER']._serialized_end=1976
  _globals['_MSGLIMITORDERRESPONSE']._serialized_start=1978
  _globals['_MSGLIMITORDERRESPONSE']._serialized_end=2001
  _globals['_MSGMARKETORDER']._serialized_start=2004
  _globals['_MSGMARKETORDER']._serialized_end=2422
  _globals['_MSGMARKETORDERRESPONSE']._serialized_start=2424
  _globals['_MSGMARKETORDERRESPONSE']._serialized_end=2448
  _globals['_MSGMMORDER']._serialized_start=2451
  _globals['_MSGMMORDER']._serialized_end=3113
  _globals['_MSGMMORDERRESPONSE']._serialized_start=3115
  _globals['_MSGMMORDERRESPONSE']._serialized_end=3135
  _globals['_MSGCANCELORDER']._serialized_start=3137
  _globals['_MSGCANCELORDER']._serialized_end=3254
  _globals['_MSGCANCELORDERRESPONSE']._serialized_start=3256
  _globals['_MSGCANCELORDERRESPONSE']._serialized_end=3280
  _globals['_MSGCANCELALLORDERS']._serialized_start=3282
  _globals['_MSGCANCELALLORDERS']._serialized_end=3378
  _globals['_MSGCANCELALLORDERSRESPONSE']._serialized_start=3380
  _globals['_MSGCANCELALLORDERSRESPONSE']._serialized_end=3408
  _globals['_MSGCANCELMMORDER']._serialized_start=3410
  _globals['_MSGCANCELMMORDER']._serialized_end=3502
  _globals['_MSGCANCELMMORDERRESPONSE']._serialized_start=3504
  _globals['_MSGCANCELMMORDERRESPONSE']._serialized_end=3530
  _globals['_MSGFARM']._serialized_start=3533
  _globals['_MSGFARM']._serialized_end=3763
  _globals['_MSGFARMRESPONSE']._serialized_start=3765
  _globals['_MSGFARMRESPONSE']._serialized_end=3782
  _globals['_MSGUNFARM']._serialized_start=3785
  _globals['_MSGUNFARM']._serialized_end=4023
  _globals['_MSGUNFARMRESPONSE']._serialized_start=4025
  _globals['_MSGUNFARMRESPONSE']._serialized_end=4044
  _globals['_MSGDEPOSITANDFARM']._serialized_start=4047
  _globals['_MSGDEPOSITANDFARM']._serialized_end=4258
  _globals['_MSGDEPOSITANDFARMRESPONSE']._serialized_start=4260
  _globals['_MSGDEPOSITANDFARMRESPONSE']._serialized_end=4287
  _globals['_MSGUNFARMANDWITHDRAW']._serialized_start=4290
  _globals['_MSGUNFARMANDWITHDRAW']._serialized_end=4539
  _globals['_MSGUNFARMANDWITHDRAWRESPONSE']._serialized_start=4541
  _globals['_MSGUNFARMANDWITHDRAWRESPONSE']._serialized_end=4571
  _globals['_MSG']._serialized_start=4574
  _globals['_MSG']._serialized_end=6166
# @@protoc_insertion_point(module_scope)