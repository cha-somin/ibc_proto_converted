# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: quicksilver/claimsmanager/v1/query.proto
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
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from quicksilver.claimsmanager.v1 import claimsmanager_pb2 as quicksilver_dot_claimsmanager_dot_v1_dot_claimsmanager__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(quicksilver/claimsmanager/v1/query.proto\x12\x1cquicksilver.claimsmanager.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a*cosmos/base/query/v1beta1/pagination.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x30quicksilver/claimsmanager/v1/claimsmanager.proto\"\xc0\x01\n\x12QueryClaimsRequest\x12.\n\x08\x63hain_id\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"chain_id\"R\x07\x63hainId\x12\x32\n\x07\x61\x64\x64ress\x18\x02 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x46\n\npagination\x18\x03 \x01(\x0b\x32&.cosmos.base.query.v1beta1.PageRequestR\npagination\"\xa1\x01\n\x13QueryClaimsResponse\x12\x41\n\x06\x63laims\x18\x01 \x03(\x0b\x32#.quicksilver.claimsmanager.v1.ClaimB\x04\xc8\xde\x1f\x00R\x06\x63laims\x12G\n\npagination\x18\x02 \x01(\x0b\x32\'.cosmos.base.query.v1beta1.PageResponseR\npagination2\xeb\x05\n\x05Query\x12\xa6\x01\n\x06\x43laims\x12\x30.quicksilver.claimsmanager.v1.QueryClaimsRequest\x1a\x31.quicksilver.claimsmanager.v1.QueryClaimsResponse\"7\x82\xd3\xe4\x93\x02\x31\x12//quicksilver/claimsmanager/v1/claims/{chain_id}\x12\xbe\x01\n\x0fLastEpochClaims\x12\x30.quicksilver.claimsmanager.v1.QueryClaimsRequest\x1a\x31.quicksilver.claimsmanager.v1.QueryClaimsResponse\"F\x82\xd3\xe4\x93\x02@\x12>/quicksilver/claimsmanager/v1/previous_epoch_claims/{chain_id}\x12\xae\x01\n\nUserClaims\x12\x30.quicksilver.claimsmanager.v1.QueryClaimsRequest\x1a\x31.quicksilver.claimsmanager.v1.QueryClaimsResponse\";\x82\xd3\xe4\x93\x02\x35\x12\x33/quicksilver/claimsmanager/v1/user/{address}/claims\x12\xc6\x01\n\x13UserLastEpochClaims\x12\x30.quicksilver.claimsmanager.v1.QueryClaimsRequest\x1a\x31.quicksilver.claimsmanager.v1.QueryClaimsResponse\"J\x82\xd3\xe4\x93\x02\x44\x12\x42/quicksilver/claimsmanager/v1/user/{address}/previous_epoch_claimsB\xfe\x01\n com.quicksilver.claimsmanager.v1B\nQueryProtoP\x01Z<github.com/ingenuity-build/quicksilver/x/claimsmanager/types\xa2\x02\x03QCX\xaa\x02\x1cQuicksilver.Claimsmanager.V1\xca\x02\x1cQuicksilver\\Claimsmanager\\V1\xe2\x02(Quicksilver\\Claimsmanager\\V1\\GPBMetadata\xea\x02\x1eQuicksilver::Claimsmanager::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'quicksilver.claimsmanager.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.quicksilver.claimsmanager.v1B\nQueryProtoP\001Z<github.com/ingenuity-build/quicksilver/x/claimsmanager/types\242\002\003QCX\252\002\034Quicksilver.Claimsmanager.V1\312\002\034Quicksilver\\Claimsmanager\\V1\342\002(Quicksilver\\Claimsmanager\\V1\\GPBMetadata\352\002\036Quicksilver::Claimsmanager::V1'
  _QUERYCLAIMSREQUEST.fields_by_name['chain_id']._options = None
  _QUERYCLAIMSREQUEST.fields_by_name['chain_id']._serialized_options = b'\362\336\037\017yaml:\"chain_id\"'
  _QUERYCLAIMSREQUEST.fields_by_name['address']._options = None
  _QUERYCLAIMSREQUEST.fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _QUERYCLAIMSRESPONSE.fields_by_name['claims']._options = None
  _QUERYCLAIMSRESPONSE.fields_by_name['claims']._serialized_options = b'\310\336\037\000'
  _QUERY.methods_by_name['Claims']._options = None
  _QUERY.methods_by_name['Claims']._serialized_options = b'\202\323\344\223\0021\022//quicksilver/claimsmanager/v1/claims/{chain_id}'
  _QUERY.methods_by_name['LastEpochClaims']._options = None
  _QUERY.methods_by_name['LastEpochClaims']._serialized_options = b'\202\323\344\223\002@\022>/quicksilver/claimsmanager/v1/previous_epoch_claims/{chain_id}'
  _QUERY.methods_by_name['UserClaims']._options = None
  _QUERY.methods_by_name['UserClaims']._serialized_options = b'\202\323\344\223\0025\0223/quicksilver/claimsmanager/v1/user/{address}/claims'
  _QUERY.methods_by_name['UserLastEpochClaims']._options = None
  _QUERY.methods_by_name['UserLastEpochClaims']._serialized_options = b'\202\323\344\223\002D\022B/quicksilver/claimsmanager/v1/user/{address}/previous_epoch_claims'
  _globals['_QUERYCLAIMSREQUEST']._serialized_start=248
  _globals['_QUERYCLAIMSREQUEST']._serialized_end=440
  _globals['_QUERYCLAIMSRESPONSE']._serialized_start=443
  _globals['_QUERYCLAIMSRESPONSE']._serialized_end=604
  _globals['_QUERY']._serialized_start=607
  _globals['_QUERY']._serialized_end=1354
# @@protoc_insertion_point(module_scope)
