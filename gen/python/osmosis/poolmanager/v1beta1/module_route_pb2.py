# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/poolmanager/v1beta1/module_route.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n.osmosis/poolmanager/v1beta1/module_route.proto\x12\x1bosmosis.poolmanager.v1beta1\x1a\x14gogoproto/gogo.proto\"\x82\x01\n\x0bModuleRoute\x12\x42\n\tpool_type\x18\x01 \x01(\x0e\x32%.osmosis.poolmanager.v1beta1.PoolTypeR\x08poolType\x12/\n\x07pool_id\x18\x02 \x01(\x04\x42\x16\xc8\xde\x1f\x01\xf2\xde\x1f\x0eyaml:\"pool_id\"R\x06poolId*N\n\x08PoolType\x12\x0c\n\x08\x42\x61lancer\x10\x00\x12\x0e\n\nStableswap\x10\x01\x12\x10\n\x0c\x43oncentrated\x10\x02\x12\x0c\n\x08\x43osmWasm\x10\x03\x1a\x04\x88\xa3\x1e\x00\x42\xfa\x01\n\x1f\x63om.osmosis.poolmanager.v1beta1B\x10ModuleRouteProtoP\x01Z7github.com/osmosis-labs/osmosis/v15/x/poolmanager/types\xa2\x02\x03OPX\xaa\x02\x1bOsmosis.Poolmanager.V1beta1\xca\x02\x1bOsmosis\\Poolmanager\\V1beta1\xe2\x02\'Osmosis\\Poolmanager\\V1beta1\\GPBMetadata\xea\x02\x1dOsmosis::Poolmanager::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.poolmanager.v1beta1.module_route_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\037com.osmosis.poolmanager.v1beta1B\020ModuleRouteProtoP\001Z7github.com/osmosis-labs/osmosis/v15/x/poolmanager/types\242\002\003OPX\252\002\033Osmosis.Poolmanager.V1beta1\312\002\033Osmosis\\Poolmanager\\V1beta1\342\002\'Osmosis\\Poolmanager\\V1beta1\\GPBMetadata\352\002\035Osmosis::Poolmanager::V1beta1'
  _POOLTYPE._options = None
  _POOLTYPE._serialized_options = b'\210\243\036\000'
  _MODULEROUTE.fields_by_name['pool_id']._options = None
  _MODULEROUTE.fields_by_name['pool_id']._serialized_options = b'\310\336\037\001\362\336\037\016yaml:\"pool_id\"'
  _globals['_POOLTYPE']._serialized_start=234
  _globals['_POOLTYPE']._serialized_end=312
  _globals['_MODULEROUTE']._serialized_start=102
  _globals['_MODULEROUTE']._serialized_end=232
# @@protoc_insertion_point(module_scope)
