# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/coinswap/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cirismod/coinswap/query.proto\x12\x10irismod.coinswap\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\"8\n\x19QueryLiquidityPoolRequest\x12\x1b\n\tlpt_denom\x18\x01 \x01(\tR\x08lptDenom\"R\n\x1aQueryLiquidityPoolResponse\x12\x34\n\x04pool\x18\x01 \x01(\x0b\x32\x1a.irismod.coinswap.PoolInfoB\x04\xc8\xde\x1f\x00R\x04pool\"d\n\x1aQueryLiquidityPoolsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x9e\x01\n\x1bQueryLiquidityPoolsResponse\x12\x36\n\x05pools\x18\x01 \x03(\x0b\x32\x1a.irismod.coinswap.PoolInfoB\x04\xc8\xde\x1f\x00R\x05pools\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xfa\x01\n\x08PoolInfo\x12\x0e\n\x02id\x18\x01 \x01(\tR\x02id\x12%\n\x0e\x65scrow_address\x18\x02 \x01(\tR\rescrowAddress\x12;\n\x08standard\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x08standard\x12\x35\n\x05token\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x05token\x12\x31\n\x03lpt\x18\x05 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x03lpt\x12\x10\n\x03\x66\x65\x65\x18\x06 \x01(\tR\x03\x66\x65\x65\x32\xb2\x02\n\x05Query\x12\x97\x01\n\rLiquidityPool\x12+.irismod.coinswap.QueryLiquidityPoolRequest\x1a,.irismod.coinswap.QueryLiquidityPoolResponse\"+\x82\xd3\xe4\x93\x02%\x12#/irismod/coinswap/pools/{lpt_denom}\x12\x8e\x01\n\x0eLiquidityPools\x12,.irismod.coinswap.QueryLiquidityPoolsRequest\x1a-.irismod.coinswap.QueryLiquidityPoolsResponse\"\x1f\x82\xd3\xe4\x93\x02\x19\x12\x17/irismod/coinswap/poolsB\xb6\x01\n\x14\x63om.irismod.coinswapB\nQueryProtoP\x01Z1github.com/irisnet/irismod/modules/coinswap/types\xa2\x02\x03ICX\xaa\x02\x10Irismod.Coinswap\xca\x02\x10Irismod\\Coinswap\xe2\x02\x1cIrismod\\Coinswap\\GPBMetadata\xea\x02\x11Irismod::Coinswapb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.coinswap.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.irismod.coinswapB\nQueryProtoP\001Z1github.com/irisnet/irismod/modules/coinswap/types\242\002\003ICX\252\002\020Irismod.Coinswap\312\002\020Irismod\\Coinswap\342\002\034Irismod\\Coinswap\\GPBMetadata\352\002\021Irismod::Coinswap'
  _QUERYLIQUIDITYPOOLRESPONSE.fields_by_name['pool']._options = None
  _QUERYLIQUIDITYPOOLRESPONSE.fields_by_name['pool']._serialized_options = b'\310\336\037\000'
  _QUERYLIQUIDITYPOOLSRESPONSE.fields_by_name['pools']._options = None
  _QUERYLIQUIDITYPOOLSRESPONSE.fields_by_name['pools']._serialized_options = b'\310\336\037\000'
  _POOLINFO.fields_by_name['standard']._options = None
  _POOLINFO.fields_by_name['standard']._serialized_options = b'\310\336\037\000'
  _POOLINFO.fields_by_name['token']._options = None
  _POOLINFO.fields_by_name['token']._serialized_options = b'\310\336\037\000'
  _POOLINFO.fields_by_name['lpt']._options = None
  _POOLINFO.fields_by_name['lpt']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['LiquidityPool']._options = None
  _QUERY.methods_by_name['LiquidityPool']._serialized_options = b'\202\323\344\223\002%\022#/irismod/coinswap/pools/{lpt_denom}'
  _QUERY.methods_by_name['LiquidityPools']._options = None
  _QUERY.methods_by_name['LiquidityPools']._serialized_options = b'\202\323\344\223\002\031\022\027/irismod/coinswap/pools'
  _globals['_QUERYLIQUIDITYPOOLREQUEST']._serialized_start=178
  _globals['_QUERYLIQUIDITYPOOLREQUEST']._serialized_end=234
  _globals['_QUERYLIQUIDITYPOOLRESPONSE']._serialized_start=236
  _globals['_QUERYLIQUIDITYPOOLRESPONSE']._serialized_end=318
  _globals['_QUERYLIQUIDITYPOOLSREQUEST']._serialized_start=320
  _globals['_QUERYLIQUIDITYPOOLSREQUEST']._serialized_end=420
  _globals['_QUERYLIQUIDITYPOOLSRESPONSE']._serialized_start=423
  _globals['_QUERYLIQUIDITYPOOLSRESPONSE']._serialized_end=581
  _globals['_POOLINFO']._serialized_start=584
  _globals['_POOLINFO']._serialized_end=834
  _globals['_QUERY']._serialized_start=837
  _globals['_QUERY']._serialized_end=1143
# @@protoc_insertion_point(module_scope)
