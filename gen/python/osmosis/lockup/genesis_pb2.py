# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/lockup/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.lockup import lock_pb2 as osmosis_dot_lockup_dot_lock__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cosmosis/lockup/genesis.proto\x12\x0eosmosis.lockup\x1a\x14gogoproto/gogo.proto\x1a\x19osmosis/lockup/lock.proto\"\xb6\x01\n\x0cGenesisState\x12 \n\x0clast_lock_id\x18\x01 \x01(\x04R\nlastLockId\x12\x36\n\x05locks\x18\x02 \x03(\x0b\x32\x1a.osmosis.lockup.PeriodLockB\x04\xc8\xde\x1f\x00R\x05locks\x12L\n\x0fsynthetic_locks\x18\x03 \x03(\x0b\x32\x1d.osmosis.lockup.SyntheticLockB\x04\xc8\xde\x1f\x00R\x0esyntheticLocksB\xaf\x01\n\x12\x63om.osmosis.lockupB\x0cGenesisProtoP\x01Z2github.com/osmosis-labs/osmosis/v15/x/lockup/types\xa2\x02\x03OLX\xaa\x02\x0eOsmosis.Lockup\xca\x02\x0eOsmosis\\Lockup\xe2\x02\x1aOsmosis\\Lockup\\GPBMetadata\xea\x02\x0fOsmosis::Lockupb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.lockup.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.osmosis.lockupB\014GenesisProtoP\001Z2github.com/osmosis-labs/osmosis/v15/x/lockup/types\242\002\003OLX\252\002\016Osmosis.Lockup\312\002\016Osmosis\\Lockup\342\002\032Osmosis\\Lockup\\GPBMetadata\352\002\017Osmosis::Lockup'
  _GENESISSTATE.fields_by_name['locks']._options = None
  _GENESISSTATE.fields_by_name['locks']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['synthetic_locks']._options = None
  _GENESISSTATE.fields_by_name['synthetic_locks']._serialized_options = b'\310\336\037\000'
  _globals['_GENESISSTATE']._serialized_start=98
  _globals['_GENESISSTATE']._serialized_end=280
# @@protoc_insertion_point(module_scope)