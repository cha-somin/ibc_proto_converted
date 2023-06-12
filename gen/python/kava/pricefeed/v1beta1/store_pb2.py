# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/pricefeed/v1beta1/store.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"kava/pricefeed/v1beta1/store.proto\x12\x16kava.pricefeed.v1beta1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"S\n\x06Params\x12I\n\x07markets\x18\x01 \x03(\x0b\x32\x1e.kava.pricefeed.v1beta1.MarketB\x0f\xc8\xde\x1f\x00\xaa\xdf\x1f\x07MarketsR\x07markets\"\xef\x01\n\x06Market\x12)\n\tmarket_id\x18\x01 \x01(\tB\x0c\xe2\xde\x1f\x08MarketIDR\x08marketId\x12\x1d\n\nbase_asset\x18\x02 \x01(\tR\tbaseAsset\x12\x1f\n\x0bquote_asset\x18\x03 \x01(\tR\nquoteAsset\x12\x62\n\x07oracles\x18\x04 \x03(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\x07oracles\x12\x16\n\x06\x61\x63tive\x18\x05 \x01(\x08R\x06\x61\x63tive\"\xad\x02\n\x0bPostedPrice\x12)\n\tmarket_id\x18\x01 \x01(\tB\x0c\xe2\xde\x1f\x08MarketIDR\x08marketId\x12o\n\x0eoracle_address\x18\x02 \x01(\x0c\x42H\xfa\xde\x1f-github.com/cosmos/cosmos-sdk/types.AccAddress\xd2\xb4-\x13\x63osmos.AddressBytesR\roracleAddress\x12\x44\n\x05price\x18\x03 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05price\x12<\n\x06\x65xpiry\x18\x04 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\x06\x65xpiry\"\x7f\n\x0c\x43urrentPrice\x12)\n\tmarket_id\x18\x01 \x01(\tB\x0c\xe2\xde\x1f\x08MarketIDR\x08marketId\x12\x44\n\x05price\x18\x02 \x01(\tB.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x05priceB\xd7\x01\n\x1a\x63om.kava.pricefeed.v1beta1B\nStoreProtoP\x01Z+github.com/kava-labs/kava/x/pricefeed/types\xa2\x02\x03KPX\xaa\x02\x16Kava.Pricefeed.V1beta1\xca\x02\x16Kava\\Pricefeed\\V1beta1\xe2\x02\"Kava\\Pricefeed\\V1beta1\\GPBMetadata\xea\x02\x18Kava::Pricefeed::V1beta1\xe0\xe1\x1e\x01\xa8\xe2\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.pricefeed.v1beta1.store_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.kava.pricefeed.v1beta1B\nStoreProtoP\001Z+github.com/kava-labs/kava/x/pricefeed/types\242\002\003KPX\252\002\026Kava.Pricefeed.V1beta1\312\002\026Kava\\Pricefeed\\V1beta1\342\002\"Kava\\Pricefeed\\V1beta1\\GPBMetadata\352\002\030Kava::Pricefeed::V1beta1\340\341\036\001\250\342\036\001'
  _PARAMS.fields_by_name['markets']._options = None
  _PARAMS.fields_by_name['markets']._serialized_options = b'\310\336\037\000\252\337\037\007Markets'
  _MARKET.fields_by_name['market_id']._options = None
  _MARKET.fields_by_name['market_id']._serialized_options = b'\342\336\037\010MarketID'
  _MARKET.fields_by_name['oracles']._options = None
  _MARKET.fields_by_name['oracles']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _POSTEDPRICE.fields_by_name['market_id']._options = None
  _POSTEDPRICE.fields_by_name['market_id']._serialized_options = b'\342\336\037\010MarketID'
  _POSTEDPRICE.fields_by_name['oracle_address']._options = None
  _POSTEDPRICE.fields_by_name['oracle_address']._serialized_options = b'\372\336\037-github.com/cosmos/cosmos-sdk/types.AccAddress\322\264-\023cosmos.AddressBytes'
  _POSTEDPRICE.fields_by_name['price']._options = None
  _POSTEDPRICE.fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _POSTEDPRICE.fields_by_name['expiry']._options = None
  _POSTEDPRICE.fields_by_name['expiry']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _CURRENTPRICE.fields_by_name['market_id']._options = None
  _CURRENTPRICE.fields_by_name['market_id']._serialized_options = b'\342\336\037\010MarketID'
  _CURRENTPRICE.fields_by_name['price']._options = None
  _CURRENTPRICE.fields_by_name['price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _globals['_PARAMS']._serialized_start=144
  _globals['_PARAMS']._serialized_end=227
  _globals['_MARKET']._serialized_start=230
  _globals['_MARKET']._serialized_end=469
  _globals['_POSTEDPRICE']._serialized_start=472
  _globals['_POSTEDPRICE']._serialized_end=773
  _globals['_CURRENTPRICE']._serialized_start=775
  _globals['_CURRENTPRICE']._serialized_end=902
# @@protoc_insertion_point(module_scope)
