# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/did/v2/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from panacea.did.v2 import did_pb2 as panacea_dot_did_dot_v2_dot_did__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1apanacea/did/v2/query.proto\x12\x0epanacea.did.v2\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x18panacea/did/v2/did.proto\"0\n\x0fQueryDIDRequest\x12\x1d\n\ndid_base64\x18\x01 \x01(\tR\tdidBase64\"i\n\x10QueryDIDResponse\x12U\n\x15\x64id_document_with_seq\x18\x01 \x01(\x0b\x32\".panacea.did.v2.DIDDocumentWithSeqR\x12\x64idDocumentWithSeq2|\n\x05Query\x12s\n\x03\x44ID\x12\x1f.panacea.did.v2.QueryDIDRequest\x1a .panacea.did.v2.QueryDIDResponse\")\x82\xd3\xe4\x93\x02#\x12!/panacea/did/v2/dids/{did_base64}B\xab\x01\n\x12\x63om.panacea.did.v2B\nQueryProtoP\x01Z/github.com/medibloc/panacea-core/v2/x/did/types\xa2\x02\x03PDX\xaa\x02\x0ePanacea.Did.V2\xca\x02\x0ePanacea\\Did\\V2\xe2\x02\x1aPanacea\\Did\\V2\\GPBMetadata\xea\x02\x10Panacea::Did::V2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.did.v2.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.panacea.did.v2B\nQueryProtoP\001Z/github.com/medibloc/panacea-core/v2/x/did/types\242\002\003PDX\252\002\016Panacea.Did.V2\312\002\016Panacea\\Did\\V2\342\002\032Panacea\\Did\\V2\\GPBMetadata\352\002\020Panacea::Did::V2'
  _QUERY.methods_by_name['DID']._options = None
  _QUERY.methods_by_name['DID']._serialized_options = b'\202\323\344\223\002#\022!/panacea/did/v2/dids/{did_base64}'
  _globals['_QUERYDIDREQUEST']._serialized_start=146
  _globals['_QUERYDIDREQUEST']._serialized_end=194
  _globals['_QUERYDIDRESPONSE']._serialized_start=196
  _globals['_QUERYDIDRESPONSE']._serialized_end=301
  _globals['_QUERY']._serialized_start=303
  _globals['_QUERY']._serialized_end=427
# @@protoc_insertion_point(module_scope)
