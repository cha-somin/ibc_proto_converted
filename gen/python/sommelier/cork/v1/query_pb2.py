# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: sommelier/cork/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from sommelier.cork.v1 import genesis_pb2 as sommelier_dot_cork_dot_v1_dot_genesis__pb2
from sommelier.cork.v1 import cork_pb2 as sommelier_dot_cork_dot_v1_dot_cork__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1dsommelier/cork/v1/query.proto\x12\x07\x63ork.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1fsommelier/cork/v1/genesis.proto\x1a\x1csommelier/cork/v1/cork.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\"\x14\n\x12QueryParamsRequest\"D\n\x13QueryParamsResponse\x12-\n\x06params\x18\x01 \x01(\x0b\x32\x0f.cork.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x1c\n\x1aQuerySubmittedCorksRequest\"B\n\x1bQuerySubmittedCorksResponse\x12#\n\x05\x63orks\x18\x01 \x03(\x0b\x32\r.cork.v1.CorkR\x05\x63orks\"\x1a\n\x18QueryCommitPeriodRequest\"\x96\x01\n\x19QueryCommitPeriodResponse\x12%\n\x0e\x63urrent_height\x18\x01 \x01(\x03R\rcurrentHeight\x12*\n\x11vote_period_start\x18\x02 \x01(\x03R\x0fvotePeriodStart\x12&\n\x0fvote_period_end\x18\x03 \x01(\x03R\rvotePeriodEnd\"\x17\n\x15QueryCellarIDsRequest\"7\n\x16QueryCellarIDsResponse\x12\x1d\n\ncellar_ids\x18\x01 \x03(\tR\tcellarIds\"\x1c\n\x1aQueryScheduledCorksRequest\"K\n\x1bQueryScheduledCorksResponse\x12,\n\x05\x63orks\x18\x01 \x03(\x0b\x32\x16.cork.v1.ScheduledCorkR\x05\x63orks\"#\n!QueryScheduledBlockHeightsRequest\"I\n\"QueryScheduledBlockHeightsResponse\x12#\n\rblock_heights\x18\x01 \x03(\x04R\x0c\x62lockHeights\"L\n\'QueryScheduledCorksByBlockHeightRequest\x12!\n\x0c\x62lock_height\x18\x01 \x01(\x04R\x0b\x62lockHeight\"X\n(QueryScheduledCorksByBlockHeightResponse\x12,\n\x05\x63orks\x18\x01 \x03(\x0b\x32\x16.cork.v1.ScheduledCorkR\x05\x63orks2\x8e\x08\n\x05Query\x12k\n\x0bQueryParams\x12\x1b.cork.v1.QueryParamsRequest\x1a\x1c.cork.v1.QueryParamsResponse\"!\x82\xd3\xe4\x93\x02\x1b\x12\x19/sommelier/cork/v1/params\x12\x86\x01\n\x13QuerySubmittedCorks\x12#.cork.v1.QuerySubmittedCorksRequest\x1a$.cork.v1.QuerySubmittedCorksResponse\"$\x82\xd3\xe4\x93\x02\x1e\x12\x1c/sommelier/cork/v1/submitted\x12\x84\x01\n\x11QueryCommitPeriod\x12!.cork.v1.QueryCommitPeriodRequest\x1a\".cork.v1.QueryCommitPeriodResponse\"(\x82\xd3\xe4\x93\x02\"\x12 /sommelier/cork/v1/commit_period\x12x\n\x0eQueryCellarIDs\x12\x1e.cork.v1.QueryCellarIDsRequest\x1a\x1f.cork.v1.QueryCellarIDsResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/sommelier/cork/v1/cellar_ids\x12\x8c\x01\n\x13QueryScheduledCorks\x12#.cork.v1.QueryScheduledCorksRequest\x1a$.cork.v1.QueryScheduledCorksResponse\"*\x82\xd3\xe4\x93\x02$\x12\"/sommelier/cork/v1/scheduled_corks\x12\xa9\x01\n\x1aQueryScheduledBlockHeights\x12*.cork.v1.QueryScheduledBlockHeightsRequest\x1a+.cork.v1.QueryScheduledBlockHeightsResponse\"2\x82\xd3\xe4\x93\x02,\x12*/sommelier/cork/v1/scheduled_block_heights\x12\xd2\x01\n QueryScheduledCorksByBlockHeight\x12\x30.cork.v1.QueryScheduledCorksByBlockHeightRequest\x1a\x31.cork.v1.QueryScheduledCorksByBlockHeightResponse\"I\x82\xd3\xe4\x93\x02\x43\x12\x41/sommelier/cork/v1/scheduled_corks_by_block_height/{block_height}B\x84\x01\n\x0b\x63om.cork.v1B\nQueryProtoP\x01Z,github.com/peggyjv/sommelier/v4/x/cork/types\xa2\x02\x03\x43XX\xaa\x02\x07\x43ork.V1\xca\x02\x07\x43ork\\V1\xe2\x02\x13\x43ork\\V1\\GPBMetadata\xea\x02\x08\x43ork::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'sommelier.cork.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\013com.cork.v1B\nQueryProtoP\001Z,github.com/peggyjv/sommelier/v4/x/cork/types\242\002\003CXX\252\002\007Cork.V1\312\002\007Cork\\V1\342\002\023Cork\\V1\\GPBMetadata\352\002\010Cork::V1'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['QueryParams']._options = None
  _QUERY.methods_by_name['QueryParams']._serialized_options = b'\202\323\344\223\002\033\022\031/sommelier/cork/v1/params'
  _QUERY.methods_by_name['QuerySubmittedCorks']._options = None
  _QUERY.methods_by_name['QuerySubmittedCorks']._serialized_options = b'\202\323\344\223\002\036\022\034/sommelier/cork/v1/submitted'
  _QUERY.methods_by_name['QueryCommitPeriod']._options = None
  _QUERY.methods_by_name['QueryCommitPeriod']._serialized_options = b'\202\323\344\223\002\"\022 /sommelier/cork/v1/commit_period'
  _QUERY.methods_by_name['QueryCellarIDs']._options = None
  _QUERY.methods_by_name['QueryCellarIDs']._serialized_options = b'\202\323\344\223\002\037\022\035/sommelier/cork/v1/cellar_ids'
  _QUERY.methods_by_name['QueryScheduledCorks']._options = None
  _QUERY.methods_by_name['QueryScheduledCorks']._serialized_options = b'\202\323\344\223\002$\022\"/sommelier/cork/v1/scheduled_corks'
  _QUERY.methods_by_name['QueryScheduledBlockHeights']._options = None
  _QUERY.methods_by_name['QueryScheduledBlockHeights']._serialized_options = b'\202\323\344\223\002,\022*/sommelier/cork/v1/scheduled_block_heights'
  _QUERY.methods_by_name['QueryScheduledCorksByBlockHeight']._options = None
  _QUERY.methods_by_name['QueryScheduledCorksByBlockHeight']._serialized_options = b'\202\323\344\223\002C\022A/sommelier/cork/v1/scheduled_corks_by_block_height/{block_height}'
  _globals['_QUERYPARAMSREQUEST']._serialized_start=228
  _globals['_QUERYPARAMSREQUEST']._serialized_end=248
  _globals['_QUERYPARAMSRESPONSE']._serialized_start=250
  _globals['_QUERYPARAMSRESPONSE']._serialized_end=318
  _globals['_QUERYSUBMITTEDCORKSREQUEST']._serialized_start=320
  _globals['_QUERYSUBMITTEDCORKSREQUEST']._serialized_end=348
  _globals['_QUERYSUBMITTEDCORKSRESPONSE']._serialized_start=350
  _globals['_QUERYSUBMITTEDCORKSRESPONSE']._serialized_end=416
  _globals['_QUERYCOMMITPERIODREQUEST']._serialized_start=418
  _globals['_QUERYCOMMITPERIODREQUEST']._serialized_end=444
  _globals['_QUERYCOMMITPERIODRESPONSE']._serialized_start=447
  _globals['_QUERYCOMMITPERIODRESPONSE']._serialized_end=597
  _globals['_QUERYCELLARIDSREQUEST']._serialized_start=599
  _globals['_QUERYCELLARIDSREQUEST']._serialized_end=622
  _globals['_QUERYCELLARIDSRESPONSE']._serialized_start=624
  _globals['_QUERYCELLARIDSRESPONSE']._serialized_end=679
  _globals['_QUERYSCHEDULEDCORKSREQUEST']._serialized_start=681
  _globals['_QUERYSCHEDULEDCORKSREQUEST']._serialized_end=709
  _globals['_QUERYSCHEDULEDCORKSRESPONSE']._serialized_start=711
  _globals['_QUERYSCHEDULEDCORKSRESPONSE']._serialized_end=786
  _globals['_QUERYSCHEDULEDBLOCKHEIGHTSREQUEST']._serialized_start=788
  _globals['_QUERYSCHEDULEDBLOCKHEIGHTSREQUEST']._serialized_end=823
  _globals['_QUERYSCHEDULEDBLOCKHEIGHTSRESPONSE']._serialized_start=825
  _globals['_QUERYSCHEDULEDBLOCKHEIGHTSRESPONSE']._serialized_end=898
  _globals['_QUERYSCHEDULEDCORKSBYBLOCKHEIGHTREQUEST']._serialized_start=900
  _globals['_QUERYSCHEDULEDCORKSBYBLOCKHEIGHTREQUEST']._serialized_end=976
  _globals['_QUERYSCHEDULEDCORKSBYBLOCKHEIGHTRESPONSE']._serialized_start=978
  _globals['_QUERYSCHEDULEDCORKSBYBLOCKHEIGHTRESPONSE']._serialized_end=1066
  _globals['_QUERY']._serialized_start=1069
  _globals['_QUERY']._serialized_end=2107
# @@protoc_insertion_point(module_scope)
