# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/crypto/multisig/keys.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!cosmos/crypto/multisig/keys.proto\x12\x16\x63osmos.crypto.multisig\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x11\x61mino/amino.proto\"\xc3\x01\n\x11LegacyAminoPubKey\x12\x1c\n\tthreshold\x18\x01 \x01(\rR\tthreshold\x12N\n\x0bpublic_keys\x18\x02 \x03(\x0b\x32\x14.google.protobuf.AnyB\x17\xe2\xde\x1f\x07PubKeys\xa2\xe7\xb0*\x07pubkeysR\npublicKeys:@\x88\xa0\x1f\x00\x8a\xe7\xb0*\"tendermint/PubKeyMultisigThreshold\x92\xe7\xb0*\x10threshold_stringB\xd2\x01\n\x1a\x63om.cosmos.crypto.multisigB\tKeysProtoZ1github.com/cosmos/cosmos-sdk/crypto/keys/multisig\xa2\x02\x03\x43\x43M\xaa\x02\x16\x43osmos.Crypto.Multisig\xca\x02\x16\x43osmos\\Crypto\\Multisig\xe2\x02\"Cosmos\\Crypto\\Multisig\\GPBMetadata\xea\x02\x18\x43osmos::Crypto::Multisigb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.crypto.multisig.keys_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\032com.cosmos.crypto.multisigB\tKeysProtoZ1github.com/cosmos/cosmos-sdk/crypto/keys/multisig\242\002\003CCM\252\002\026Cosmos.Crypto.Multisig\312\002\026Cosmos\\Crypto\\Multisig\342\002\"Cosmos\\Crypto\\Multisig\\GPBMetadata\352\002\030Cosmos::Crypto::Multisig'
  _globals['_LEGACYAMINOPUBKEY'].fields_by_name['public_keys']._loaded_options = None
  _globals['_LEGACYAMINOPUBKEY'].fields_by_name['public_keys']._serialized_options = b'\342\336\037\007PubKeys\242\347\260*\007pubkeys'
  _globals['_LEGACYAMINOPUBKEY']._loaded_options = None
  _globals['_LEGACYAMINOPUBKEY']._serialized_options = b'\210\240\037\000\212\347\260*\"tendermint/PubKeyMultisigThreshold\222\347\260*\020threshold_string'
  _globals['_LEGACYAMINOPUBKEY']._serialized_start=130
  _globals['_LEGACYAMINOPUBKEY']._serialized_end=325
# @@protoc_insertion_point(module_scope)
