# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/capability/v1beta1/genesis.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.capability.v1beta1 import capability_pb2 as cosmos_dot_capability_dot_v1beta1_dot_capability__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'cosmos/capability/v1beta1/genesis.proto\x12\x19\x63osmos.capability.v1beta1\x1a\x14gogoproto/gogo.proto\x1a*cosmos/capability/v1beta1/capability.proto\x1a\x11\x61mino/amino.proto\"\x80\x01\n\rGenesisOwners\x12\x14\n\x05index\x18\x01 \x01(\x04R\x05index\x12Y\n\x0cindex_owners\x18\x02 \x01(\x0b\x32+.cosmos.capability.v1beta1.CapabilityOwnersB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x0bindexOwners\"q\n\x0cGenesisState\x12\x14\n\x05index\x18\x01 \x01(\x04R\x05index\x12K\n\x06owners\x18\x02 \x03(\x0b\x32(.cosmos.capability.v1beta1.GenesisOwnersB\t\xc8\xde\x1f\x00\xa8\xe7\xb0*\x01R\x06ownersB\xe2\x01\n\x1d\x63om.cosmos.capability.v1beta1B\x0cGenesisProtoZ/github.com/cosmos/cosmos-sdk/x/capability/types\xa2\x02\x03\x43\x43X\xaa\x02\x19\x43osmos.Capability.V1beta1\xca\x02\x19\x43osmos\\Capability\\V1beta1\xe2\x02%Cosmos\\Capability\\V1beta1\\GPBMetadata\xea\x02\x1b\x43osmos::Capability::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.capability.v1beta1.genesis_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.cosmos.capability.v1beta1B\014GenesisProtoZ/github.com/cosmos/cosmos-sdk/x/capability/types\242\002\003CCX\252\002\031Cosmos.Capability.V1beta1\312\002\031Cosmos\\Capability\\V1beta1\342\002%Cosmos\\Capability\\V1beta1\\GPBMetadata\352\002\033Cosmos::Capability::V1beta1'
  _globals['_GENESISOWNERS'].fields_by_name['index_owners']._loaded_options = None
  _globals['_GENESISOWNERS'].fields_by_name['index_owners']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISSTATE'].fields_by_name['owners']._loaded_options = None
  _globals['_GENESISSTATE'].fields_by_name['owners']._serialized_options = b'\310\336\037\000\250\347\260*\001'
  _globals['_GENESISOWNERS']._serialized_start=156
  _globals['_GENESISOWNERS']._serialized_end=284
  _globals['_GENESISSTATE']._serialized_start=286
  _globals['_GENESISSTATE']._serialized_end=399
# @@protoc_insertion_point(module_scope)
