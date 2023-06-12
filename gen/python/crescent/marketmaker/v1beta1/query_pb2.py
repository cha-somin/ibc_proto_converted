# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: crescent/marketmaker/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from crescent.marketmaker.v1beta1 import marketmaker_pb2 as crescent_dot_marketmaker_dot_v1beta1_dot_marketmaker__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(crescent/marketmaker/v1beta1/query.proto\x12\x1c\x63rescent.marketmaker.v1beta1\x1a.crescent/marketmaker/v1beta1/marketmaker.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1cgoogle/api/annotations.proto\"\x14\n\x12QueryParamsRequest\"Y\n\x13QueryParamsResponse\x12\x42\n\x06params\x18\x01 \x01(\x0b\x32$.crescent.marketmaker.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\xb1\x01\n\x18QueryMarketMakersRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\x12\x17\n\x07pair_id\x18\x02 \x01(\x04R\x06pairId\x12\x1a\n\x08\x65ligible\x18\x03 \x01(\tR\x08\x65ligible\x12\x46\n\npagination\x18\x04 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xb9\x01\n\x19QueryMarketMakersResponse\x12S\n\x0cmarketmakers\x18\x01 \x03(\x0b\x32).crescent.marketmaker.v1beta1.MarketMakerB\x04\xc8\xde\x1f\x00R\x0cmarketmakers\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"1\n\x15QueryIncentiveRequest\x12\x18\n\x07\x61\x64\x64ress\x18\x01 \x01(\tR\x07\x61\x64\x64ress\"e\n\x16QueryIncentiveResponse\x12K\n\tincentive\x18\x01 \x01(\x0b\x32\'.crescent.marketmaker.v1beta1.IncentiveB\x04\xc8\xde\x1f\x00R\tincentive2\x8f\x04\n\x05Query\x12\x9b\x01\n\x06Params\x12\x30.crescent.marketmaker.v1beta1.QueryParamsRequest\x1a\x31.crescent.marketmaker.v1beta1.QueryParamsResponse\",\x82\xd3\xe4\x93\x02&\x12$/crescent/marketmaker/v1beta1/params\x12\xb3\x01\n\x0cMarketMakers\x12\x36.crescent.marketmaker.v1beta1.QueryMarketMakersRequest\x1a\x37.crescent.marketmaker.v1beta1.QueryMarketMakersResponse\"2\x82\xd3\xe4\x93\x02,\x12*/crescent/marketmaker/v1beta1/marketmakers\x12\xb1\x01\n\tIncentive\x12\x33.crescent.marketmaker.v1beta1.QueryIncentiveRequest\x1a\x34.crescent.marketmaker.v1beta1.QueryIncentiveResponse\"9\x82\xd3\xe4\x93\x02\x33\x12\x31/crescent/marketmaker/v1beta1/incentive/{address}B\xfd\x01\n com.crescent.marketmaker.v1beta1B\nQueryProtoP\x01Z;github.com/crescent-network/crescent/v5/x/marketmaker/types\xa2\x02\x03\x43MX\xaa\x02\x1c\x43rescent.Marketmaker.V1beta1\xca\x02\x1c\x43rescent\\Marketmaker\\V1beta1\xe2\x02(Crescent\\Marketmaker\\V1beta1\\GPBMetadata\xea\x02\x1e\x43rescent::Marketmaker::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'crescent.marketmaker.v1beta1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.crescent.marketmaker.v1beta1B\nQueryProtoP\001Z;github.com/crescent-network/crescent/v5/x/marketmaker/types\242\002\003CMX\252\002\034Crescent.Marketmaker.V1beta1\312\002\034Crescent\\Marketmaker\\V1beta1\342\002(Crescent\\Marketmaker\\V1beta1\\GPBMetadata\352\002\036Crescent::Marketmaker::V1beta1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYMARKETMAKERSRESPONSE.fields_by_name['marketmakers']._options = None
  _QUERYMARKETMAKERSRESPONSE.fields_by_name['marketmakers']._serialized_options = b'\310\336\037\000'
  _QUERYINCENTIVERESPONSE.fields_by_name['incentive']._options = None
  _QUERYINCENTIVERESPONSE.fields_by_name['incentive']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002&\022$/crescent/marketmaker/v1beta1/params'
  _QUERY.methods_by_name['MarketMakers']._options = None
  _QUERY.methods_by_name['MarketMakers']._serialized_options = b'\202\323\344\223\002,\022*/crescent/marketmaker/v1beta1/marketmakers'
  _QUERY.methods_by_name['Incentive']._options = None
  _QUERY.methods_by_name['Incentive']._serialized_options = b'\202\323\344\223\0023\0221/crescent/marketmaker/v1beta1/incentive/{address}'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=337
  _globals['_QUERYPARAMSREQUEST']._serialized_end=357
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=359
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=448
  _globals['_QUERYMARKETMAKERSREQUEST']._serialized_start=451
  _globals['_QUERYMARKETMAKERSREQUEST']._serialized_end=628
  _globals['_QUERYMARKETMAKERSRESPONSE']._serialized_start=631
  _globals['_QUERYMARKETMAKERSRESPONSE']._serialized_end=816
  _globals['_QUERYINCENTIVEREQUEST']._serialized_start=818
  _globals['_QUERYINCENTIVEREQUEST']._serialized_end=867
  _globals['_QUERYINCENTIVERESPONSE']._serialized_start=869
  _globals['_QUERYINCENTIVERESPONSE']._serialized_end=970
  _globals['_QUERY']._serialized_start=973
  _globals['_QUERY']._serialized_end=1500
# @@protoc_insertion_point(module_scope)
