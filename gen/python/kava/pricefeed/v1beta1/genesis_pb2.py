# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/pricefeed/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from kava.pricefeed.v1beta1 import store_pb2 as kava_dot_pricefeed_dot_v1beta1_dot_store__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$kava/pricefeed/v1beta1/genesis.proto\x12\x16kava.pricefeed.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\"kava/pricefeed/v1beta1/store.proto\"\xac\x01\n\x0cGenesisState\x12<\n\x06params\x18\x01 \x01(\x0b\x32\x1e.kava.pricefeed.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\x12^\n\rposted_prices\x18\x02 \x03(\x0b\x32#.kava.pricefeed.v1beta1.PostedPriceB\x14\xc8\xde\x1f\x00\xaa\xdf\x1f\x0cPostedPricesR\x0cpostedPricesB\xd9\x01\n\x1a\x63om.kava.pricefeed.v1beta1B\x0cGenesisProtoP\x01Z+github.com/kava-labs/kava/x/pricefeed/types\xa2\x02\x03KPX\xaa\x02\x16Kava.Pricefeed.V1beta1\xca\x02\x16Kava\\Pricefeed\\V1beta1\xe2\x02\"Kava\\Pricefeed\\V1beta1\\GPBMetadata\xea\x02\x18Kava::Pricefeed::V1beta1\xe0\xe1\x1e\x01\xa8\xe2\x1e\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.pricefeed.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.kava.pricefeed.v1beta1B\014GenesisProtoP\001Z+github.com/kava-labs/kava/x/pricefeed/types\242\002\003KPX\252\002\026Kava.Pricefeed.V1beta1\312\002\026Kava\\Pricefeed\\V1beta1\342\002\"Kava\\Pricefeed\\V1beta1\\GPBMetadata\352\002\030Kava::Pricefeed::V1beta1\340\341\036\001\250\342\036\001'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['posted_prices']._options = None
  _GENESISSTATE.fields_by_name['posted_prices']._serialized_options = b'\310\336\037\000\252\337\037\014PostedPrices'
  _globals['_GENESISSTATE']._serialized_start=123
  _globals['_GENESISSTATE']._serialized_end=295
# @@protoc_insertion_point(module_scope)
