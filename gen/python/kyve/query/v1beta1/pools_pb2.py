# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kyve/query/v1beta1/pools.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.query.v1beta1 import pagination_pb2 as cosmos_dot_base_dot_query_dot_v1beta1_dot_pagination__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from kyve.bundles.v1beta1 import bundles_pb2 as kyve_dot_bundles_dot_v1beta1_dot_bundles__pb2
from kyve.pool.v1beta1 import pool_pb2 as kyve_dot_pool_dot_v1beta1_dot_pool__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ekyve/query/v1beta1/pools.proto\x12\x12kyve.query.v1beta1\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\"kyve/bundles/v1beta1/bundles.proto\x1a\x1ckyve/pool/v1beta1/pool.proto\"\xd9\x01\n\x11QueryPoolsRequest\x12\x46\n\npagination\x18\x01 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\x12\x16\n\x06search\x18\x02 \x01(\tR\x06search\x12\x18\n\x07runtime\x18\x03 \x01(\tR\x07runtime\x12\x1a\n\x08\x64isabled\x18\x04 \x01(\x08R\x08\x64isabled\x12.\n\x13storage_provider_id\x18\x05 \x01(\rR\x11storageProviderId\"\x9b\x01\n\x12QueryPoolsResponse\x12<\n\x05pools\x18\x01 \x03(\x0b\x32 .kyve.query.v1beta1.PoolResponseB\x04\xc8\xde\x1f\x00R\x05pools\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination\"\xca\x02\n\x0cPoolResponse\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12+\n\x04\x64\x61ta\x18\x02 \x01(\x0b\x32\x17.kyve.pool.v1beta1.PoolR\x04\x64\x61ta\x12M\n\x0f\x62undle_proposal\x18\x03 \x01(\x0b\x32$.kyve.bundles.v1beta1.BundleProposalR\x0e\x62undleProposal\x12\x18\n\x07stakers\x18\x04 \x03(\tR\x07stakers\x12\x32\n\x15total_self_delegation\x18\x05 \x01(\x04R\x13totalSelfDelegation\x12)\n\x10total_delegation\x18\x06 \x01(\x04R\x0ftotalDelegation\x12\x35\n\x06status\x18\x07 \x01(\x0e\x32\x1d.kyve.pool.v1beta1.PoolStatusR\x06status\"\"\n\x10QueryPoolRequest\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\"O\n\x11QueryPoolResponse\x12:\n\x04pool\x18\x01 \x01(\x0b\x32 .kyve.query.v1beta1.PoolResponseB\x04\xc8\xde\x1f\x00R\x04pool2\x82\x02\n\tQueryPool\x12y\n\x05Pools\x12%.kyve.query.v1beta1.QueryPoolsRequest\x1a&.kyve.query.v1beta1.QueryPoolsResponse\"!\x82\xd3\xe4\x93\x02\x1b\x12\x19/kyve/query/v1beta1/pools\x12z\n\x04Pool\x12$.kyve.query.v1beta1.QueryPoolRequest\x1a%.kyve.query.v1beta1.QueryPoolResponse\"%\x82\xd3\xe4\x93\x02\x1f\x12\x1d/kyve/query/v1beta1/pool/{id}B\xba\x01\n\x16\x63om.kyve.query.v1beta1B\nPoolsProtoP\x01Z*github.com/KYVENetwork/chain/x/query/types\xa2\x02\x03KQX\xaa\x02\x12Kyve.Query.V1beta1\xca\x02\x12Kyve\\Query\\V1beta1\xe2\x02\x1eKyve\\Query\\V1beta1\\GPBMetadata\xea\x02\x14Kyve::Query::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kyve.query.v1beta1.pools_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.kyve.query.v1beta1B\nPoolsProtoP\001Z*github.com/KYVENetwork/chain/x/query/types\242\002\003KQX\252\002\022Kyve.Query.V1beta1\312\002\022Kyve\\Query\\V1beta1\342\002\036Kyve\\Query\\V1beta1\\GPBMetadata\352\002\024Kyve::Query::V1beta1'
  _QUERYPOOLSRESPONSE.fields_by_name['pools']._options = None
  _QUERYPOOLSRESPONSE.fields_by_name['pools']._serialized_options = b'\310\336\037\000'
  _QUERYPOOLRESPONSE.fields_by_name['pool']._options = None
  _QUERYPOOLRESPONSE.fields_by_name['pool']._serialized_options = b'\310\336\037\000'
  _QUERYPOOL.methods_by_name['Pools']._options = None
  _QUERYPOOL.methods_by_name['Pools']._serialized_options = b'\202\323\344\223\002\033\022\031/kyve/query/v1beta1/pools'
  _QUERYPOOL.methods_by_name['Pool']._options = None
  _QUERYPOOL.methods_by_name['Pool']._serialized_options = b'\202\323\344\223\002\037\022\035/kyve/query/v1beta1/pool/{id}'
  _globals['_QUERYPOOLSREQUEST']._serialized_start=217
  _globals['_QUERYPOOLSREQUEST']._serialized_end=434
  _globals['_QUERYPOOLSRESPONSE']._serialized_start=437
  _globals['_QUERYPOOLSRESPONSE']._serialized_end=592
  _globals['_POOLRESPONSE']._serialized_start=595
  _globals['_POOLRESPONSE']._serialized_end=925
  _globals['_QUERYPOOLREQUEST']._serialized_start=927
  _globals['_QUERYPOOLREQUEST']._serialized_end=961
  _globals['_QUERYPOOLRESPONSE']._serialized_start=963
  _globals['_QUERYPOOLRESPONSE']._serialized_end=1042
  _globals['_QUERYPOOL']._serialized_start=1045
  _globals['_QUERYPOOL']._serialized_end=1303
# @@protoc_insertion_point(module_scope)
