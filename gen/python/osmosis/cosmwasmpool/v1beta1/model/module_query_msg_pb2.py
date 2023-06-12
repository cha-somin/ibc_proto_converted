# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n9osmosis/cosmwasmpool/v1beta1/model/module_query_msg.proto\x12\x1cosmosis.cosmwasmpool.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xc2\x01\n\x11\x43\x61lcOutAmtGivenIn\x12:\n\x08token_in\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07tokenIn\x12&\n\x0ftoken_out_denom\x18\x02 \x01(\tR\rtokenOutDenom\x12I\n\x08swap_fee\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x07swapFee\"\x83\x01\n\x18\x43\x61lcOutAmtGivenInRequest\x12g\n\x15\x63\x61lc_out_amt_given_in\x18\x01 \x01(\x0b\x32/.osmosis.cosmwasmpool.v1beta1.CalcOutAmtGivenInB\x04\xc8\xde\x1f\x00R\x11\x63\x61lcOutAmtGivenIn\"Y\n\x19\x43\x61lcOutAmtGivenInResponse\x12<\n\ttoken_out\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08tokenOut\"\xc2\x01\n\x11\x43\x61lcInAmtGivenOut\x12<\n\ttoken_out\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08tokenOut\x12$\n\x0etoken_in_denom\x18\x02 \x01(\tR\x0ctokenInDenom\x12I\n\x08swap_fee\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x07swapFee\"\x83\x01\n\x18\x43\x61lcInAmtGivenOutRequest\x12g\n\x15\x63\x61lc_in_amt_given_out\x18\x01 \x01(\x0b\x32/.osmosis.cosmwasmpool.v1beta1.CalcInAmtGivenOutB\x04\xc8\xde\x1f\x00R\x11\x63\x61lcInAmtGivenOut\"W\n\x19\x43\x61lcInAmtGivenOutResponse\x12:\n\x08token_in\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x07tokenInB\x8a\x02\n com.osmosis.cosmwasmpool.v1beta1B\x13ModuleQueryMsgProtoP\x01Z?github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/cosmwasm/msg\xa2\x02\x03OCX\xaa\x02\x1cOsmosis.Cosmwasmpool.V1beta1\xca\x02\x1cOsmosis\\Cosmwasmpool\\V1beta1\xe2\x02(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\xea\x02\x1eOsmosis::Cosmwasmpool::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.cosmwasmpool.v1beta1.model.module_query_msg_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.osmosis.cosmwasmpool.v1beta1B\023ModuleQueryMsgProtoP\001Z?github.com/osmosis-labs/osmosis/v15/x/cosmwasmpool/cosmwasm/msg\242\002\003OCX\252\002\034Osmosis.Cosmwasmpool.V1beta1\312\002\034Osmosis\\Cosmwasmpool\\V1beta1\342\002(Osmosis\\Cosmwasmpool\\V1beta1\\GPBMetadata\352\002\036Osmosis::Cosmwasmpool::V1beta1'
  _CALCOUTAMTGIVENIN.fields_by_name['token_in']._options = None
  _CALCOUTAMTGIVENIN.fields_by_name['token_in']._serialized_options = b'\310\336\037\000'
  _CALCOUTAMTGIVENIN.fields_by_name['swap_fee']._options = None
  _CALCOUTAMTGIVENIN.fields_by_name['swap_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _CALCOUTAMTGIVENINREQUEST.fields_by_name['calc_out_amt_given_in']._options = None
  _CALCOUTAMTGIVENINREQUEST.fields_by_name['calc_out_amt_given_in']._serialized_options = b'\310\336\037\000'
  _CALCOUTAMTGIVENINRESPONSE.fields_by_name['token_out']._options = None
  _CALCOUTAMTGIVENINRESPONSE.fields_by_name['token_out']._serialized_options = b'\310\336\037\000'
  _CALCINAMTGIVENOUT.fields_by_name['token_out']._options = None
  _CALCINAMTGIVENOUT.fields_by_name['token_out']._serialized_options = b'\310\336\037\000'
  _CALCINAMTGIVENOUT.fields_by_name['swap_fee']._options = None
  _CALCINAMTGIVENOUT.fields_by_name['swap_fee']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _CALCINAMTGIVENOUTREQUEST.fields_by_name['calc_in_amt_given_out']._options = None
  _CALCINAMTGIVENOUTREQUEST.fields_by_name['calc_in_amt_given_out']._serialized_options = b'\310\336\037\000'
  _CALCINAMTGIVENOUTRESPONSE.fields_by_name['token_in']._options = None
  _CALCINAMTGIVENOUTRESPONSE.fields_by_name['token_in']._serialized_options = b'\310\336\037\000'
  _globals['_CALCOUTAMTGIVENIN']._serialized_start=146
  _globals['_CALCOUTAMTGIVENIN']._serialized_end=340
  _globals['_CALCOUTAMTGIVENINREQUEST']._serialized_start=343
  _globals['_CALCOUTAMTGIVENINREQUEST']._serialized_end=474
  _globals['_CALCOUTAMTGIVENINRESPONSE']._serialized_start=476
  _globals['_CALCOUTAMTGIVENINRESPONSE']._serialized_end=565
  _globals['_CALCINAMTGIVENOUT']._serialized_start=568
  _globals['_CALCINAMTGIVENOUT']._serialized_end=762
  _globals['_CALCINAMTGIVENOUTREQUEST']._serialized_start=765
  _globals['_CALCINAMTGIVENOUTREQUEST']._serialized_end=896
  _globals['_CALCINAMTGIVENOUTRESPONSE']._serialized_start=898
  _globals['_CALCINAMTGIVENOUTRESPONSE']._serialized_end=985
# @@protoc_insertion_point(module_scope)
