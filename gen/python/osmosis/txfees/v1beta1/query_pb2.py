# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/txfees/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2
from osmosis.txfees.v1beta1 import feetoken_pb2 as osmosis_dot_txfees_dot_v1beta1_dot_feetoken__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"osmosis/txfees/v1beta1/query.proto\x12\x16osmosis.txfees.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1egoogle/protobuf/duration.proto\x1a%osmosis/txfees/v1beta1/feetoken.proto\"\x17\n\x15QueryFeeTokensRequest\"t\n\x16QueryFeeTokensResponse\x12Z\n\nfee_tokens\x18\x01 \x03(\x0b\x32 .osmosis.txfees.v1beta1.FeeTokenB\x19\xc8\xde\x1f\x00\xf2\xde\x1f\x11yaml:\"fee_tokens\"R\tfeeTokens\"D\n\x1aQueryDenomSpotPriceRequest\x12&\n\x05\x64\x65nom\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\"\xad\x01\n\x1bQueryDenomSpotPriceResponse\x12*\n\x06poolID\x18\x01 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolID\x12\x62\n\nspot_price\x18\x02 \x01(\tBC\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Dec\xf2\xde\x1f\x11yaml:\"spot_price\"R\tspotPrice\"A\n\x17QueryDenomPoolIdRequest\x12&\n\x05\x64\x65nom\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\"F\n\x18QueryDenomPoolIdResponse\x12*\n\x06poolID\x18\x01 \x01(\x04\x42\x12\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolID\"\x17\n\x15QueryBaseDenomRequest\"N\n\x16QueryBaseDenomResponse\x12\x34\n\nbase_denom\x18\x01 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"base_denom\"R\tbaseDenom2\x94\x05\n\x05Query\x12\x96\x01\n\tFeeTokens\x12-.osmosis.txfees.v1beta1.QueryFeeTokensRequest\x1a..osmosis.txfees.v1beta1.QueryFeeTokensResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/osmosis/txfees/v1beta1/fee_tokens\x12\xae\x01\n\x0e\x44\x65nomSpotPrice\x12\x32.osmosis.txfees.v1beta1.QueryDenomSpotPriceRequest\x1a\x33.osmosis.txfees.v1beta1.QueryDenomSpotPriceResponse\"3\x82\xd3\xe4\x93\x02-\x12+/osmosis/txfees/v1beta1/spot_price_by_denom\x12\xa7\x01\n\x0b\x44\x65nomPoolId\x12/.osmosis.txfees.v1beta1.QueryDenomPoolIdRequest\x1a\x30.osmosis.txfees.v1beta1.QueryDenomPoolIdResponse\"5\x82\xd3\xe4\x93\x02/\x12-/osmosis/txfees/v1beta1/denom_pool_id/{denom}\x12\x96\x01\n\tBaseDenom\x12-.osmosis.txfees.v1beta1.QueryBaseDenomRequest\x1a..osmosis.txfees.v1beta1.QueryBaseDenomResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/osmosis/txfees/v1beta1/base_denomB\xd6\x01\n\x1a\x63om.osmosis.txfees.v1beta1B\nQueryProtoP\x01Z2github.com/osmosis-labs/osmosis/v15/x/txfees/types\xa2\x02\x03OTX\xaa\x02\x16Osmosis.Txfees.V1beta1\xca\x02\x16Osmosis\\Txfees\\V1beta1\xe2\x02\"Osmosis\\Txfees\\V1beta1\\GPBMetadata\xea\x02\x18Osmosis::Txfees::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.txfees.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.osmosis.txfees.v1beta1B\nQueryProtoP\001Z2github.com/osmosis-labs/osmosis/v15/x/txfees/types\242\002\003OTX\252\002\026Osmosis.Txfees.V1beta1\312\002\026Osmosis\\Txfees\\V1beta1\342\002\"Osmosis\\Txfees\\V1beta1\\GPBMetadata\352\002\030Osmosis::Txfees::V1beta1'
  _QUERYFEETOKENSRESPONSE.fields_by_name['fee_tokens']._options = None
  _QUERYFEETOKENSRESPONSE.fields_by_name['fee_tokens']._serialized_options = b'\310\336\037\000\362\336\037\021yaml:\"fee_tokens\"'
  _QUERYDENOMSPOTPRICEREQUEST.fields_by_name['denom']._options = None
  _QUERYDENOMSPOTPRICEREQUEST.fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _QUERYDENOMSPOTPRICERESPONSE.fields_by_name['poolID']._options = None
  _QUERYDENOMSPOTPRICERESPONSE.fields_by_name['poolID']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _QUERYDENOMSPOTPRICERESPONSE.fields_by_name['spot_price']._options = None
  _QUERYDENOMSPOTPRICERESPONSE.fields_by_name['spot_price']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec\362\336\037\021yaml:\"spot_price\"'
  _QUERYDENOMPOOLIDREQUEST.fields_by_name['denom']._options = None
  _QUERYDENOMPOOLIDREQUEST.fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _QUERYDENOMPOOLIDRESPONSE.fields_by_name['poolID']._options = None
  _QUERYDENOMPOOLIDRESPONSE.fields_by_name['poolID']._serialized_options = b'\362\336\037\016yaml:\"pool_id\"'
  _QUERYBASEDENOMRESPONSE.fields_by_name['base_denom']._options = None
  _QUERYBASEDENOMRESPONSE.fields_by_name['base_denom']._serialized_options = b'\362\336\037\021yaml:\"base_denom\"'
  _QUERY.methods_by_name['FeeTokens']._options = None
  _QUERY.methods_by_name['FeeTokens']._serialized_options = b'\202\323\344\223\002$\022\"/osmosis/txfees/v1beta1/fee_tokens'
  _QUERY.methods_by_name['DenomSpotPrice']._options = None
  _QUERY.methods_by_name['DenomSpotPrice']._serialized_options = b'\202\323\344\223\002-\022+/osmosis/txfees/v1beta1/spot_price_by_denom'
  _QUERY.methods_by_name['DenomPoolId']._options = None
  _QUERY.methods_by_name['DenomPoolId']._serialized_options = b'\202\323\344\223\002/\022-/osmosis/txfees/v1beta1/denom_pool_id/{denom}'
  _QUERY.methods_by_name['BaseDenom']._options = None
  _QUERY.methods_by_name['BaseDenom']._serialized_options = b'\202\323\344\223\002$\022\"/osmosis/txfees/v1beta1/base_denom'
  _globals['_QUERYFEETOKENSREQUEST']._serialized_start=185
  _globals['_QUERYFEETOKENSREQUEST']._serialized_end=208
  _globals['_QUERYFEETOKENSRESPONSE']._serialized_start=210
  _globals['_QUERYFEETOKENSRESPONSE']._serialized_end=326
  _globals['_QUERYDENOMSPOTPRICEREQUEST']._serialized_start=328
  _globals['_QUERYDENOMSPOTPRICEREQUEST']._serialized_end=396
  _globals['_QUERYDENOMSPOTPRICERESPONSE']._serialized_start=399
  _globals['_QUERYDENOMSPOTPRICERESPONSE']._serialized_end=572
  _globals['_QUERYDENOMPOOLIDREQUEST']._serialized_start=574
  _globals['_QUERYDENOMPOOLIDREQUEST']._serialized_end=639
  _globals['_QUERYDENOMPOOLIDRESPONSE']._serialized_start=641
  _globals['_QUERYDENOMPOOLIDRESPONSE']._serialized_end=711
  _globals['_QUERYBASEDENOMREQUEST']._serialized_start=713
  _globals['_QUERYBASEDENOMREQUEST']._serialized_end=736
  _globals['_QUERYBASEDENOMRESPONSE']._serialized_start=738
  _globals['_QUERYBASEDENOMRESPONSE']._serialized_end=816
  _globals['_QUERY']._serialized_start=819
  _globals['_QUERY']._serialized_end=1479
# @@protoc_insertion_point(module_scope)