# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: coreum/customparams/v1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#coreum/customparams/v1/params.proto\x12\x16\x63oreum.customparams.v1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\x8d\x01\n\rStakingParams\x12|\n\x13min_self_delegation\x18\x01 \x01(\tBL\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x1ayaml:\"min_self_delegation\"R\x11minSelfDelegationB\xdc\x01\n\x1a\x63om.coreum.customparams.v1B\x0bParamsProtoP\x01Z7github.com/CoreumFoundation/coreum/x/customparams/types\xa2\x02\x03\x43\x43X\xaa\x02\x16\x43oreum.Customparams.V1\xca\x02\x16\x43oreum\\Customparams\\V1\xe2\x02\"Coreum\\Customparams\\V1\\GPBMetadata\xea\x02\x18\x43oreum::Customparams::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'coreum.customparams.v1.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\032com.coreum.customparams.v1B\013ParamsProtoP\001Z7github.com/CoreumFoundation/coreum/x/customparams/types\242\002\003CCX\252\002\026Coreum.Customparams.V1\312\002\026Coreum\\Customparams\\V1\342\002\"Coreum\\Customparams\\V1\\GPBMetadata\352\002\030Coreum::Customparams::V1'
  _STAKINGPARAMS.fields_by_name['min_self_delegation']._options = None
  _STAKINGPARAMS.fields_by_name['min_self_delegation']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\032yaml:\"min_self_delegation\"'
  _globals['_STAKINGPARAMS']._serialized_start=113
  _globals['_STAKINGPARAMS']._serialized_end=254
# @@protoc_insertion_point(module_scope)