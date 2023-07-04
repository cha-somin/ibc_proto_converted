# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/relationships/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from desmos.relationships.v1 import models_pb2 as desmos_dot_relationships_dot_v1_dot_models__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#desmos/relationships/v1/query.proto\x12\x17\x64\x65smos.relationships.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a$desmos/relationships/v1/models.proto\"\xc6\x01\n\x19QueryRelationshipsRequest\x12\x1f\n\x0bsubspace_id\x18\x01 \x01(\x04R\nsubspaceId\x12\x12\n\x04user\x18\x02 \x01(\tR\x04user\x12\"\n\x0c\x63ounterparty\x18\x03 \x01(\tR\x0c\x63ounterparty\x12\x46\n\npagination\x18\x04 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xb8\x01\n\x1aQueryRelationshipsResponse\x12Q\n\rrelationships\x18\x01 \x03(\x0b\x32%.desmos.relationships.v1.RelationshipB\x04\xc8\xde\x1f\x00R\rrelationships\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xbb\x01\n\x12QueryBlocksRequest\x12\x1f\n\x0bsubspace_id\x18\x01 \x01(\x04R\nsubspaceId\x12\x18\n\x07\x62locker\x18\x02 \x01(\tR\x07\x62locker\x12\x18\n\x07\x62locked\x18\x03 \x01(\tR\x07\x62locked\x12\x46\n\npagination\x18\x04 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\xa0\x01\n\x13QueryBlocksResponse\x12@\n\x06\x62locks\x18\x01 \x03(\x0b\x32\".desmos.relationships.v1.UserBlockB\x04\xc8\xde\x1f\x00R\x06\x62locks\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xc1\x02\n\x05Query\x12\xa8\x01\n\rRelationships\x12\x32.desmos.relationships.v1.QueryRelationshipsRequest\x1a\x33.desmos.relationships.v1.QueryRelationshipsResponse\".\x82\xd3\xe4\x93\x02(\x12&/desmos/relationships/v1/relationships\x12\x8c\x01\n\x06\x42locks\x12+.desmos.relationships.v1.QueryBlocksRequest\x1a,.desmos.relationships.v1.QueryBlocksResponse\"\'\x82\xd3\xe4\x93\x02!\x12\x1f/desmos/relationships/v1/blocksB\xdf\x01\n\x1b\x63om.desmos.relationships.v1B\nQueryProtoP\x01Z6github.com/desmos-labs/desmos/v5/x/relationships/types\xa2\x02\x03\x44RX\xaa\x02\x17\x44\x65smos.Relationships.V1\xca\x02\x17\x44\x65smos\\Relationships\\V1\xe2\x02#Desmos\\Relationships\\V1\\GPBMetadata\xea\x02\x19\x44\x65smos::Relationships::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.relationships.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\033com.desmos.relationships.v1B\nQueryProtoP\001Z6github.com/desmos-labs/desmos/v5/x/relationships/types\242\002\003DRX\252\002\027Desmos.Relationships.V1\312\002\027Desmos\\Relationships\\V1\342\002#Desmos\\Relationships\\V1\\GPBMetadata\352\002\031Desmos::Relationships::V1'
  _QUERYRELATIONSHIPSREQUEST._options = None
  _QUERYRELATIONSHIPSREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _QUERYRELATIONSHIPSRESPONSE.fields_by_name['relationships']._options = None
  _QUERYRELATIONSHIPSRESPONSE.fields_by_name['relationships']._serialized_options = b'\310\336\037\000'
  _QUERYBLOCKSREQUEST._options = None
  _QUERYBLOCKSREQUEST._serialized_options = b'\210\240\037\000\350\240\037\000'
  _QUERYBLOCKSRESPONSE.fields_by_name['blocks']._options = None
  _QUERYBLOCKSRESPONSE.fields_by_name['blocks']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Relationships']._options = None
  _QUERY.methods_by_name['Relationships']._serialized_options = b'\202\323\344\223\002(\022&/desmos/relationships/v1/relationships'
  _QUERY.methods_by_name['Blocks']._options = None
  _QUERY.methods_by_name['Blocks']._serialized_options = b'\202\323\344\223\002!\022\037/desmos/relationships/v1/blocks'
  _globals['_QUERYRELATIONSHIPSREQUEST']._serialized_start=199
  _globals['_QUERYRELATIONSHIPSREQUEST']._serialized_end=397
  _globals['_QUERYRELATIONSHIPSRESPONSE']._serialized_start=400
  _globals['_QUERYRELATIONSHIPSRESPONSE']._serialized_end=584
  _globals['_QUERYBLOCKSREQUEST']._serialized_start=587
  _globals['_QUERYBLOCKSREQUEST']._serialized_end=774
  _globals['_QUERYBLOCKSRESPONSE']._serialized_start=777
  _globals['_QUERYBLOCKSRESPONSE']._serialized_end=937
  _globals['_QUERY']._serialized_start=940
  _globals['_QUERY']._serialized_end=1261
# @@protoc_insertion_point(module_scope)