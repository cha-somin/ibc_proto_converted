# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: irismod/oracle/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from irismod.oracle import oracle_pb2 as irismod_dot_oracle_dot_oracle__pb2
from irismod.service import service_pb2 as irismod_dot_service_dot_service__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1airismod/oracle/query.proto\x12\x0eirismod.oracle\x1a\x1birismod/oracle/oracle.proto\x1a\x1dirismod/service/service.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\"/\n\x10QueryFeedRequest\x12\x1b\n\tfeed_name\x18\x01 \x01(\tR\x08\x66\x65\x65\x64Name\"J\n\x11QueryFeedResponse\x12\x35\n\x04\x66\x65\x65\x64\x18\x01 \x01(\x0b\x32\x1b.irismod.oracle.FeedContextB\x04\xc8\xde\x1f\x00R\x04\x66\x65\x65\x64\"q\n\x11QueryFeedsRequest\x12\x14\n\x05state\x18\x01 \x01(\tR\x05state\x12\x46\n\npagination\x18\x02 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x96\x01\n\x12QueryFeedsResponse\x12\x37\n\x05\x66\x65\x65\x64s\x18\x01 \x03(\x0b\x32\x1b.irismod.oracle.FeedContextB\x04\xc8\xde\x1f\x00R\x05\x66\x65\x65\x64s\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"4\n\x15QueryFeedValueRequest\x12\x1b\n\tfeed_name\x18\x01 \x01(\tR\x08\x66\x65\x65\x64Name\"Z\n\x16QueryFeedValueResponse\x12@\n\x0b\x66\x65\x65\x64_values\x18\x01 \x03(\x0b\x32\x19.irismod.oracle.FeedValueB\x04\xc8\xde\x1f\x00R\nfeedValues\"\xaf\x04\n\x0b\x46\x65\x65\x64\x43ontext\x12(\n\x04\x66\x65\x65\x64\x18\x01 \x01(\x0b\x32\x14.irismod.oracle.FeedR\x04\x66\x65\x65\x64\x12:\n\x0cservice_name\x18\x02 \x01(\tB\x17\xf2\xde\x1f\x13yaml:\"service_name\"R\x0bserviceName\x12\x1c\n\tproviders\x18\x03 \x03(\tR\tproviders\x12\x14\n\x05input\x18\x04 \x01(\tR\x05input\x12\x18\n\x07timeout\x18\x05 \x01(\x03R\x07timeout\x12\x8d\x01\n\x0fservice_fee_cap\x18\x06 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinBJ\xc8\xde\x1f\x00\xf2\xde\x1f\x16yaml:\"service_fee_cap\"\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.CoinsR\rserviceFeeCap\x12L\n\x12repeated_frequency\x18\x07 \x01(\x04\x42\x1d\xf2\xde\x1f\x19yaml:\"repeated_frequency\"R\x11repeatedFrequency\x12L\n\x12response_threshold\x18\x08 \x01(\rB\x1d\xf2\xde\x1f\x19yaml:\"response_threshold\"R\x11responseThreshold\x12:\n\x05state\x18\t \x01(\x0e\x32$.irismod.service.RequestContextStateR\x05state:\x04\x98\xa0\x1f\x00\x32\xfd\x02\n\x05Query\x12v\n\x04\x46\x65\x65\x64\x12 .irismod.oracle.QueryFeedRequest\x1a!.irismod.oracle.QueryFeedResponse\")\x82\xd3\xe4\x93\x02#\x12!/irismod/oracle/feeds/{feed_name}\x12m\n\x05\x46\x65\x65\x64s\x12!.irismod.oracle.QueryFeedsRequest\x1a\".irismod.oracle.QueryFeedsResponse\"\x1d\x82\xd3\xe4\x93\x02\x17\x12\x15/irismod/oracle/feeds\x12\x8c\x01\n\tFeedValue\x12%.irismod.oracle.QueryFeedValueRequest\x1a&.irismod.oracle.QueryFeedValueResponse\"0\x82\xd3\xe4\x93\x02*\x12(/irismod/oracle/feeds/{feed_name}/valuesB\xaa\x01\n\x12\x63om.irismod.oracleB\nQueryProtoP\x01Z/github.com/irisnet/irismod/modules/oracle/types\xa2\x02\x03IOX\xaa\x02\x0eIrismod.Oracle\xca\x02\x0eIrismod\\Oracle\xe2\x02\x1aIrismod\\Oracle\\GPBMetadata\xea\x02\x0fIrismod::Oracleb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'irismod.oracle.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.irismod.oracleB\nQueryProtoP\001Z/github.com/irisnet/irismod/modules/oracle/types\242\002\003IOX\252\002\016Irismod.Oracle\312\002\016Irismod\\Oracle\342\002\032Irismod\\Oracle\\GPBMetadata\352\002\017Irismod::Oracle'
  _QUERYFEEDRESPONSE.fields_by_name['feed']._options = None
  _QUERYFEEDRESPONSE.fields_by_name['feed']._serialized_options = b'\310\336\037\000'
  _QUERYFEEDSRESPONSE.fields_by_name['feeds']._options = None
  _QUERYFEEDSRESPONSE.fields_by_name['feeds']._serialized_options = b'\310\336\037\000'
  _QUERYFEEDVALUERESPONSE.fields_by_name['feed_values']._options = None
  _QUERYFEEDVALUERESPONSE.fields_by_name['feed_values']._serialized_options = b'\310\336\037\000'
  _FEEDCONTEXT.fields_by_name['service_name']._options = None
  _FEEDCONTEXT.fields_by_name['service_name']._serialized_options = b'\362\336\037\023yaml:\"service_name\"'
  _FEEDCONTEXT.fields_by_name['service_fee_cap']._options = None
  _FEEDCONTEXT.fields_by_name['service_fee_cap']._serialized_options = b'\310\336\037\000\362\336\037\026yaml:\"service_fee_cap\"\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins'
  _FEEDCONTEXT.fields_by_name['repeated_frequency']._options = None
  _FEEDCONTEXT.fields_by_name['repeated_frequency']._serialized_options = b'\362\336\037\031yaml:\"repeated_frequency\"'
  _FEEDCONTEXT.fields_by_name['response_threshold']._options = None
  _FEEDCONTEXT.fields_by_name['response_threshold']._serialized_options = b'\362\336\037\031yaml:\"response_threshold\"'
  _FEEDCONTEXT._options = None
  _FEEDCONTEXT._serialized_options = b'\230\240\037\000'
  _QUERY.methods_by_name['Feed']._options = None
  _QUERY.methods_by_name['Feed']._serialized_options = b'\202\323\344\223\002#\022!/irismod/oracle/feeds/{feed_name}'
  _QUERY.methods_by_name['Feeds']._options = None
  _QUERY.methods_by_name['Feeds']._serialized_options = b'\202\323\344\223\002\027\022\025/irismod/oracle/feeds'
  _QUERY.methods_by_name['FeedValue']._options = None
  _QUERY.methods_by_name['FeedValue']._serialized_options = b'\202\323\344\223\002*\022(/irismod/oracle/feeds/{feed_name}/values'
  _globals['_QUERYFEEDREQUEST']._serialized_start=234
  _globals['_QUERYFEEDREQUEST']._serialized_end=281
  _globals['_QUERYFEEDRESPONSE']._serialized_start=283
  _globals['_QUERYFEEDRESPONSE']._serialized_end=357
  _globals['_QUERYFEEDSREQUEST']._serialized_start=359
  _globals['_QUERYFEEDSREQUEST']._serialized_end=472
  _globals['_QUERYFEEDSRESPONSE']._serialized_start=475
  _globals['_QUERYFEEDSRESPONSE']._serialized_end=625
  _globals['_QUERYFEEDVALUEREQUEST']._serialized_start=627
  _globals['_QUERYFEEDVALUEREQUEST']._serialized_end=679
  _globals['_QUERYFEEDVALUERESPONSE']._serialized_start=681
  _globals['_QUERYFEEDVALUERESPONSE']._serialized_end=771
  _globals['_FEEDCONTEXT']._serialized_start=774
  _globals['_FEEDCONTEXT']._serialized_end=1333
  _globals['_QUERY']._serialized_start=1336
  _globals['_QUERY']._serialized_end=1717
# @@protoc_insertion_point(module_scope)
