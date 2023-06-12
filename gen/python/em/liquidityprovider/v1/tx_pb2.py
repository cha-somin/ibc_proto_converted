# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: em/liquidityprovider/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n em/liquidityprovider/v1/tx.proto\x12\x17\x65m.liquidityprovider.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xd3\x01\n\rMsgMintTokens\x12L\n\x12liquidity_provider\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"liquidity_provider\"R\x11liquidityProvider\x12t\n\x06\x61mount\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\"\x17\n\x15MsgMintTokensResponse\"\xd3\x01\n\rMsgBurnTokens\x12L\n\x12liquidity_provider\x18\x01 \x01(\tB\x1d\xf2\xde\x1f\x19yaml:\"liquidity_provider\"R\x11liquidityProvider\x12t\n\x06\x61mount\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBA\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\x06\x61mount\"\x17\n\x15MsgBurnTokensResponse2\xd1\x01\n\x03Msg\x12\x64\n\nMintTokens\x12&.em.liquidityprovider.v1.MsgMintTokens\x1a..em.liquidityprovider.v1.MsgMintTokensResponse\x12\x64\n\nBurnTokens\x12&.em.liquidityprovider.v1.MsgBurnTokens\x1a..em.liquidityprovider.v1.MsgBurnTokensResponseB\xdc\x01\n\x1b\x63om.em.liquidityprovider.v1B\x07TxProtoP\x01Z6github.com/e-money/em-ledger/x/liquidityprovider/types\xa2\x02\x03\x45LX\xaa\x02\x17\x45m.Liquidityprovider.V1\xca\x02\x17\x45m\\Liquidityprovider\\V1\xe2\x02#Em\\Liquidityprovider\\V1\\GPBMetadata\xea\x02\x19\x45m::Liquidityprovider::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'em.liquidityprovider.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.em.liquidityprovider.v1B\007TxProtoP\001Z6github.com/e-money/em-ledger/x/liquidityprovider/types\242\002\003ELX\252\002\027Em.Liquidityprovider.V1\312\002\027Em\\Liquidityprovider\\V1\342\002#Em\\Liquidityprovider\\V1\\GPBMetadata\352\002\031Em::Liquidityprovider::V1'
  _MSGMINTTOKENS.fields_by_name['liquidity_provider']._options = None
  _MSGMINTTOKENS.fields_by_name['liquidity_provider']._serialized_options = b'\362\336\037\031yaml:\"liquidity_provider\"'
  _MSGMINTTOKENS.fields_by_name['amount']._options = None
  _MSGMINTTOKENS.fields_by_name['amount']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _MSGBURNTOKENS.fields_by_name['liquidity_provider']._options = None
  _MSGBURNTOKENS.fields_by_name['liquidity_provider']._serialized_options = b'\362\336\037\031yaml:\"liquidity_provider\"'
  _MSGBURNTOKENS.fields_by_name['amount']._options = None
  _MSGBURNTOKENS.fields_by_name['amount']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _globals['_MSGMINTTOKENS']._serialized_start=116
  _globals['_MSGMINTTOKENS']._serialized_end=327
  _globals['_MSGMINTTOKENSRESPONSE']._serialized_start=329
  _globals['_MSGMINTTOKENSRESPONSE']._serialized_end=352
  _globals['_MSGBURNTOKENS']._serialized_start=355
  _globals['_MSGBURNTOKENS']._serialized_end=566
  _globals['_MSGBURNTOKENSRESPONSE']._serialized_start=568
  _globals['_MSGBURNTOKENSRESPONSE']._serialized_end=591
  _globals['_MSG']._serialized_start=594
  _globals['_MSG']._serialized_end=803
# @@protoc_insertion_point(module_scope)
