# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/evidence/v1beta1/query.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#cosmos/evidence/v1beta1/query.proto\x12\x17\x63osmos.evidence.v1beta1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1cgoogle/api/annotations.proto\"\x87\x01\n\x14QueryEvidenceRequest\x12[\n\revidence_hash\x18\x01 \x01(\x0c\x42\x36\x18\x01\xfa\xde\x1f\x30github.com/cometbft/cometbft/libs/bytes.HexBytesR\x0c\x65videnceHash\x12\x12\n\x04hash\x18\x02 \x01(\tR\x04hash\"I\n\x15QueryEvidenceResponse\x12\x30\n\x08\x65vidence\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyR\x08\x65vidence\"a\n\x17QueryAllEvidenceRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\x95\x01\n\x18QueryAllEvidenceResponse\x12\x30\n\x08\x65vidence\x18\x01 \x03(\x0b\x32\x14.google.protobuf.AnyR\x08\x65vidence\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xc5\x02\n\x05Query\x12\x9b\x01\n\x08\x45vidence\x12-.cosmos.evidence.v1beta1.QueryEvidenceRequest\x1a..cosmos.evidence.v1beta1.QueryEvidenceResponse\"0\x82\xd3\xe4\x93\x02*\x12(/cosmos/evidence/v1beta1/evidence/{hash}\x12\x9d\x01\n\x0b\x41llEvidence\x12\x30.cosmos.evidence.v1beta1.QueryAllEvidenceRequest\x1a\x31.cosmos.evidence.v1beta1.QueryAllEvidenceResponse\")\x82\xd3\xe4\x93\x02#\x12!/cosmos/evidence/v1beta1/evidenceB\xd4\x01\n\x1b\x63om.cosmos.evidence.v1beta1B\nQueryProtoZ-github.com/cosmos/cosmos-sdk/x/evidence/types\xa2\x02\x03\x43\x45X\xaa\x02\x17\x43osmos.Evidence.V1beta1\xca\x02\x17\x43osmos\\Evidence\\V1beta1\xe2\x02#Cosmos\\Evidence\\V1beta1\\GPBMetadata\xea\x02\x19\x43osmos::Evidence::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.evidence.v1beta1.query_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\033com.cosmos.evidence.v1beta1B\nQueryProtoZ-github.com/cosmos/cosmos-sdk/x/evidence/types\242\002\003CEX\252\002\027Cosmos.Evidence.V1beta1\312\002\027Cosmos\\Evidence\\V1beta1\342\002#Cosmos\\Evidence\\V1beta1\\GPBMetadata\352\002\031Cosmos::Evidence::V1beta1'
  _globals['_QUERYEVIDENCEREQUEST'].fields_by_name['evidence_hash']._loaded_options = None
  _globals['_QUERYEVIDENCEREQUEST'].fields_by_name['evidence_hash']._serialized_options = b'\030\001\372\336\0370github.com/cometbft/cometbft/libs/bytes.HexBytes'
  _globals['_QUERY'].methods_by_name['Evidence']._loaded_options = None
  _globals['_QUERY'].methods_by_name['Evidence']._serialized_options = b'\202\323\344\223\002*\022(/cosmos/evidence/v1beta1/evidence/{hash}'
  _globals['_QUERY'].methods_by_name['AllEvidence']._loaded_options = None
  _globals['_QUERY'].methods_by_name['AllEvidence']._serialized_options = b'\202\323\344\223\002#\022!/cosmos/evidence/v1beta1/evidence'
  _globals['_QUERYEVIDENCEREQUEST']._serialized_start=188
  _globals['_QUERYEVIDENCEREQUEST']._serialized_end=323
  _globals['_QUERYEVIDENCERESPONSE']._serialized_start=325
  _globals['_QUERYEVIDENCERESPONSE']._serialized_end=398
  _globals['_QUERYALLEVIDENCEREQUEST']._serialized_start=400
  _globals['_QUERYALLEVIDENCEREQUEST']._serialized_end=497
  _globals['_QUERYALLEVIDENCERESPONSE']._serialized_start=500
  _globals['_QUERYALLEVIDENCERESPONSE']._serialized_end=649
  _globals['_QUERY']._serialized_start=652
  _globals['_QUERY']._serialized_end=977
# @@protoc_insertion_point(module_scope)
