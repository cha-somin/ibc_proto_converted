# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/lockup/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bosmosis/lockup/params.proto\x12\x0eosmosis.lockup\x1a\x14gogoproto/gogo.proto\"v\n\x06Params\x12l\n\x1e\x66orce_unlock_allowed_addresses\x18\x01 \x03(\tB\'\xf2\xde\x1f#yaml:\"force_unlock_allowed_address\"R\x1b\x66orceUnlockAllowedAddressesB\xae\x01\n\x12\x63om.osmosis.lockupB\x0bParamsProtoP\x01Z2github.com/osmosis-labs/osmosis/v15/x/lockup/types\xa2\x02\x03OLX\xaa\x02\x0eOsmosis.Lockup\xca\x02\x0eOsmosis\\Lockup\xe2\x02\x1aOsmosis\\Lockup\\GPBMetadata\xea\x02\x0fOsmosis::Lockupb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.lockup.params_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.osmosis.lockupB\013ParamsProtoP\001Z2github.com/osmosis-labs/osmosis/v15/x/lockup/types\242\002\003OLX\252\002\016Osmosis.Lockup\312\002\016Osmosis\\Lockup\342\002\032Osmosis\\Lockup\\GPBMetadata\352\002\017Osmosis::Lockup'
  _PARAMS.fields_by_name['force_unlock_allowed_addresses']._options = None
  _PARAMS.fields_by_name['force_unlock_allowed_addresses']._serialized_options = b'\362\336\037#yaml:\"force_unlock_allowed_address\"'
  _globals['_PARAMS']._serialized_start=69
  _globals['_PARAMS']._serialized_end=187
# @@protoc_insertion_point(module_scope)