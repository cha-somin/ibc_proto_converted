# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta3/authz.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$akash/deployment/v1beta3/authz.proto\x12\x18\x61kash.deployment.v1beta3\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\x84\x01\n\x1e\x44\x65positDeploymentAuthorization\x12O\n\x0bspend_limit\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x13\xc8\xde\x1f\x00\xea\xde\x1f\x0bspend_limitR\nspendLimit:\x11\xca\xb4-\rAuthorizationB\xeb\x01\n\x1c\x63om.akash.deployment.v1beta3B\nAuthzProtoP\x01Z=github.com/akash-network/akash-api/go/node/deployment/v1beta3\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta3\xca\x02\x18\x41kash\\Deployment\\V1beta3\xe2\x02$Akash\\Deployment\\V1beta3\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta3.authz_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.akash.deployment.v1beta3B\nAuthzProtoP\001Z=github.com/akash-network/akash-api/go/node/deployment/v1beta3\242\002\003ADX\252\002\030Akash.Deployment.V1beta3\312\002\030Akash\\Deployment\\V1beta3\342\002$Akash\\Deployment\\V1beta3\\GPBMetadata\352\002\032Akash::Deployment::V1beta3'
  _DEPOSITDEPLOYMENTAUTHORIZATION.fields_by_name['spend_limit']._options = None
  _DEPOSITDEPLOYMENTAUTHORIZATION.fields_by_name['spend_limit']._serialized_options = b'\310\336\037\000\352\336\037\013spend_limit'
  _DEPOSITDEPLOYMENTAUTHORIZATION._options = None
  _DEPOSITDEPLOYMENTAUTHORIZATION._serialized_options = b'\312\264-\rAuthorization'
  _globals['_DEPOSITDEPLOYMENTAUTHORIZATION']._serialized_start=148
  _globals['_DEPOSITDEPLOYMENTAUTHORIZATION']._serialized_end=280
# @@protoc_insertion_point(module_scope)
