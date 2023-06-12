# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/gamm/v2/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.gamm.v1beta1 import tx_pb2 as osmosis_dot_gamm_dot_v1beta1_dot_tx__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bosmosis/gamm/v2/query.proto\x12\x0fosmosis.gamm.v2\x1a\x14gogoproto/gogo.proto\x1a\x1dosmosis/gamm/v1beta1/tx.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\xd9\x01\n\x15QuerySpotPriceRequest\x12+\n\x07pool_id\x18\x01 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolId\x12\x45\n\x10\x62\x61se_asset_denom\x18\x02 \x01(\tB\x1b\xf2\xde\x1f\x17yaml:\"base_asset_denom\"R\x0e\x62\x61seAssetDenom\x12H\n\x11quote_asset_denom\x18\x03 \x01(\tB\x1c\xf2\xde\x1f\x18yaml:\"quote_asset_denom\"R\x0fquoteAssetDenom:\x02\x18\x01\"R\n\x16QuerySpotPriceResponse\x12\x34\n\nspot_price\x18\x01 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"spot_price\"R\tspotPrice:\x02\x18\x01\x32\x9a\x01\n\x05Query\x12\x90\x01\n\tSpotPrice\x12&.osmosis.gamm.v2.QuerySpotPriceRequest\x1a\'.osmosis.gamm.v2.QuerySpotPriceResponse\"2\x88\x02\x01\x82\xd3\xe4\x93\x02)\x12\'/osmosis/gamm/v2/pools/{pool_id}/pricesB\xb3\x01\n\x13\x63om.osmosis.gamm.v2B\nQueryProtoP\x01Z2github.com/osmosis-labs/osmosis/v15/x/gamm/v2types\xa2\x02\x03OGX\xaa\x02\x0fOsmosis.Gamm.V2\xca\x02\x0fOsmosis\\Gamm\\V2\xe2\x02\x1bOsmosis\\Gamm\\V2\\GPBMetadata\xea\x02\x11Osmosis::Gamm::V2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.gamm.v2.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.osmosis.gamm.v2B\nQueryProtoP\001Z2github.com/osmosis-labs/osmosis/v15/x/gamm/v2types\242\002\003OGX\252\002\017Osmosis.Gamm.V2\312\002\017Osmosis\\Gamm\\V2\342\002\033Osmosis\\Gamm\\V2\\GPBMetadata\352\002\021Osmosis::Gamm::V2'
  _QUERYSPOTPRICEREQUEST.fields_by_name['pool_id']._options = None
  _QUERYSPOTPRICEREQUEST.fields_by_name['pool_id']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _QUERYSPOTPRICEREQUEST.fields_by_name['base_asset_denom']._options = None
  _QUERYSPOTPRICEREQUEST.fields_by_name['base_asset_denom']._serialized_options = b'\362\336\037\027yaml:\"base_asset_denom\"'
  _QUERYSPOTPRICEREQUEST.fields_by_name['quote_asset_denom']._options = None
  _QUERYSPOTPRICEREQUEST.fields_by_name['quote_asset_denom']._serialized_options = b'\362\336\037\030yaml:\"quote_asset_denom\"'
  _QUERYSPOTPRICEREQUEST._options = None
  _QUERYSPOTPRICEREQUEST._serialized_options = b'\030\001'
  _QUERYSPOTPRICERESPONSE.fields_by_name['spot_price']._options = None
  _QUERYSPOTPRICERESPONSE.fields_by_name['spot_price']._serialized_options = b'\362\336\037\021yaml:\"spot_price\"'
  _QUERYSPOTPRICERESPONSE._options = None
  _QUERYSPOTPRICERESPONSE._serialized_options = b'\030\001'
  _QUERY.methods_by_name['SpotPrice']._options = None
  _QUERY.methods_by_name['SpotPrice']._serialized_options = b'\210\002\001\202\323\344\223\002)\022\'/osmosis/gamm/v2/pools/{pool_id}/prices'
  _globals['_QUERYSPOTPRICEREQUEST']._serialized_start=262
  _globals['_QUERYSPOTPRICEREQUEST']._serialized_end=479
  _globals['_QUERYSPOTPRICERESPONSE']._serialized_start=481
  _globals['_QUERYSPOTPRICERESPONSE']._serialized_end=563
  _globals['_QUERY']._serialized_start=566
  _globals['_QUERY']._serialized_end=720
# @@protoc_insertion_point(module_scope)
