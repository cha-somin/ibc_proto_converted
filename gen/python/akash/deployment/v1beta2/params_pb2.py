# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta2/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%akash/deployment/v1beta2/params.proto\x12\x18\x61kash.deployment.v1beta2\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xb3\x01\n\x06Params\x12\xa8\x01\n\x16\x64\x65ployment_min_deposit\x18\x01 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinBW\xc8\xde\x1f\x00\xe2\xde\x1f\x14\x44\x65ploymentMinDeposit\xea\xde\x1f\x16\x64\x65ployment_min_deposit\xf2\xde\x1f\x1dyaml:\"deployment_min_deposit\"R\x14\x64\x65ploymentMinDepositB\xec\x01\n\x1c\x63om.akash.deployment.v1beta2B\x0bParamsProtoP\x01Z=github.com/akash-network/akash-api/go/node/deployment/v1beta2\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta2\xca\x02\x18\x41kash\\Deployment\\V1beta2\xe2\x02$Akash\\Deployment\\V1beta2\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta2.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.akash.deployment.v1beta2B\013ParamsProtoP\001Z=github.com/akash-network/akash-api/go/node/deployment/v1beta2\242\002\003ADX\252\002\030Akash.Deployment.V1beta2\312\002\030Akash\\Deployment\\V1beta2\342\002$Akash\\Deployment\\V1beta2\\GPBMetadata\352\002\032Akash::Deployment::V1beta2'
  _PARAMS.fields_by_name['deployment_min_deposit']._options = None
  _PARAMS.fields_by_name['deployment_min_deposit']._serialized_options = b'\310\336\037\000\342\336\037\024DeploymentMinDeposit\352\336\037\026deployment_min_deposit\362\336\037\035yaml:\"deployment_min_deposit\"'
  _globals['_PARAMS']._serialized_start=122
  _globals['_PARAMS']._serialized_end=301
# @@protoc_insertion_point(module_scope)
