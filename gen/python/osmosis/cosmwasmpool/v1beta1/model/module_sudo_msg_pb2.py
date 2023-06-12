# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/cosmwasmpool/v1beta1/model/module_sudo_msg.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8osmosis/cosmwasmpool/v1beta1/model/module_sudo_msg.proto\x12\x1cosmosis.cosmwasmpool.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xbb\x02\n\x11SwapExactAmountIn\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12:\n\x08token_in\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07tokenIn\x12&\n\x0ftoken_out_denom\x18\x03 \x01(\tR\rtokenOutDenom\x12_\n\x14token_out_min_amount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x11tokenOutMinAmount\x12I\n\x08swap_fee\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x07swapFee\"\x82\x01\n\x18SwapExactAmountInSudoMsg\x12\x66\n\x14swap_exact_amount_in\x18\x01 \x01(\x0b\x32/.osmosis.cosmwasmpool.v1beta1.SwapExactAmountInB\x04\xc8\xde\x1f\x00R\x11swapExactAmountIn\"|\n SwapExactAmountInSudoMsgResponse\x12X\n\x10token_out_amount\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x0etokenOutAmount\"\xba\x02\n\x12SwapExactAmountOut\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12<\n\ttoken_out\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08tokenOut\x12$\n\x0etoken_in_denom\x18\x03 \x01(\tR\x0ctokenInDenom\x12]\n\x13token_in_max_amount\x18\x04 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\x10tokenInMaxAmount\x12I\n\x08swap_fee\x18\x05 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x07swapFee\"\x86\x01\n\x19SwapExactAmountOutSudoMsg\x12i\n\x15swap_exact_amount_out\x18\x01 \x01(\x0b\x32\x30.osmosis.cosmwasmpool.v1beta1.SwapExactAmountOutB\x04\xc8\xde\x1f\x00R\x12swapExactAmountOut\"{\n!SwapExactAmountOutSudoMsgResponse\x12V\n\x0ftoken_in_amount\x18\x01 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.IntR\rtokenInAmountB\x89\x02\n com.osmosis.cosmwasmpool.v1beta1B\x12ModuleSudoMsgProtoP\x01Z?github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/cosmwasm/msg\xa2\x02\x03OCX\xaa\x02\x1cOsmosis.Cosmwasmpool.V1beta1\xca\x02\x1cOsmosis\\Cosmwasmpool\\V1beta1\xe2\x02(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\xea\x02\x1eOsmosis::Cosmwasmpool::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.cosmwasmpool.v1beta1.model.module_sudo_msg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.osmosis.cosmwasmpool.v1beta1B\022ModuleSudoMsgProtoP\001Z?github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/cosmwasm/msg\242\002\003OCX\252\002\034Osmosis.Cosmwasmpool.V1beta1\312\002\034Osmosis\\Cosmwasmpool\\V1beta1\342\002(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\352\002\036Osmosis::Cosmwasmpool::V1beta1'
  _SWAPEXACTAMOUNTIN.fields_by_name['token_in']._options = None
  _SWAPEXACTAMOUNTIN.fields_by_name['token_in']._serialized_options = b'\310\336\037\000'
  _SWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._options = None
  _SWAPEXACTAMOUNTIN.fields_by_name['token_out_min_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _SWAPEXACTAMOUNTIN.fields_by_name['swap_fee']._options = None
  _SWAPEXACTAMOUNTIN.fields_by_name['swap_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _SWAPEXACTAMOUNTINSUDOMSG.fields_by_name['swap_exact_amount_in']._options = None
  _SWAPEXACTAMOUNTINSUDOMSG.fields_by_name['swap_exact_amount_in']._serialized_options = b'\310\336\037\000'
  _SWAPEXACTAMOUNTINSUDOMSGRESPONSE.fields_by_name['token_out_amount']._options = None
  _SWAPEXACTAMOUNTINSUDOMSGRESPONSE.fields_by_name['token_out_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _SWAPEXACTAMOUNTOUT.fields_by_name['token_out']._options = None
  _SWAPEXACTAMOUNTOUT.fields_by_name['token_out']._serialized_options = b'\310\336\037\000'
  _SWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._options = None
  _SWAPEXACTAMOUNTOUT.fields_by_name['token_in_max_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _SWAPEXACTAMOUNTOUT.fields_by_name['swap_fee']._options = None
  _SWAPEXACTAMOUNTOUT.fields_by_name['swap_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _SWAPEXACTAMOUNTOUTSUDOMSG.fields_by_name['swap_exact_amount_out']._options = None
  _SWAPEXACTAMOUNTOUTSUDOMSG.fields_by_name['swap_exact_amount_out']._serialized_options = b'\310\336\037\000'
  _SWAPEXACTAMOUNTOUTSUDOMSGRESPONSE.fields_by_name['token_in_amount']._options = None
  _SWAPEXACTAMOUNTOUTSUDOMSGRESPONSE.fields_by_name['token_in_amount']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int'
  _globals['_SWAPEXACTAMOUNTIN']._serialized_start=145
  _globals['_SWAPEXACTAMOUNTIN']._serialized_end=460
  _globals['_SWAPEXACTAMOUNTINSUDOMSG']._serialized_start=463
  _globals['_SWAPEXACTAMOUNTINSUDOMSG']._serialized_end=593
  _globals['_SWAPEXACTAMOUNTINSUDOMSGRESPONSE']._serialized_start=595
  _globals['_SWAPEXACTAMOUNTINSUDOMSGRESPONSE']._serialized_end=719
  _globals['_SWAPEXACTAMOUNTOUT']._serialized_start=722
  _globals['_SWAPEXACTAMOUNTOUT']._serialized_end=1036
  _globals['_SWAPEXACTAMOUNTOUTSUDOMSG']._serialized_start=1039
  _globals['_SWAPEXACTAMOUNTOUTSUDOMSG']._serialized_end=1173
  _globals['_SWAPEXACTAMOUNTOUTSUDOMSGRESPONSE']._serialized_start=1175
  _globals['_SWAPEXACTAMOUNTOUTSUDOMSGRESPONSE']._serialized_end=1298
# @@protoc_insertion_point(module_scope)
