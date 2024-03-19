# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/base/snapshots/v1beta1/snapshot.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,cosmos/base/snapshots/v1beta1/snapshot.proto\x12\x1d\x63osmos.base.snapshots.v1beta1\x1a\x14gogoproto/gogo.proto\"\xb1\x01\n\x08Snapshot\x12\x16\n\x06height\x18\x01 \x01(\x04R\x06height\x12\x16\n\x06\x66ormat\x18\x02 \x01(\rR\x06\x66ormat\x12\x16\n\x06\x63hunks\x18\x03 \x01(\rR\x06\x63hunks\x12\x12\n\x04hash\x18\x04 \x01(\x0cR\x04hash\x12I\n\x08metadata\x18\x05 \x01(\x0b\x32\'.cosmos.base.snapshots.v1beta1.MetadataB\x04\xc8\xde\x1f\x00R\x08metadata\"-\n\x08Metadata\x12!\n\x0c\x63hunk_hashes\x18\x01 \x03(\x0cR\x0b\x63hunkHashes\"\x87\x04\n\x0cSnapshotItem\x12H\n\x05store\x18\x01 \x01(\x0b\x32\x30.cosmos.base.snapshots.v1beta1.SnapshotStoreItemH\x00R\x05store\x12O\n\x04iavl\x18\x02 \x01(\x0b\x32/.cosmos.base.snapshots.v1beta1.SnapshotIAVLItemB\x08\xe2\xde\x1f\x04IAVLH\x00R\x04iavl\x12T\n\textension\x18\x03 \x01(\x0b\x32\x34.cosmos.base.snapshots.v1beta1.SnapshotExtensionMetaH\x00R\textension\x12\x66\n\x11\x65xtension_payload\x18\x04 \x01(\x0b\x32\x37.cosmos.base.snapshots.v1beta1.SnapshotExtensionPayloadH\x00R\x10\x65xtensionPayload\x12I\n\x02kv\x18\x05 \x01(\x0b\x32-.cosmos.base.snapshots.v1beta1.SnapshotKVItemB\x08\x18\x01\xe2\xde\x1f\x02KVH\x00R\x02kv\x12K\n\x06schema\x18\x06 \x01(\x0b\x32-.cosmos.base.snapshots.v1beta1.SnapshotSchemaB\x02\x18\x01H\x00R\x06schemaB\x06\n\x04item\"\'\n\x11SnapshotStoreItem\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\"l\n\x10SnapshotIAVLItem\x12\x10\n\x03key\x18\x01 \x01(\x0cR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x0cR\x05value\x12\x18\n\x07version\x18\x03 \x01(\x03R\x07version\x12\x16\n\x06height\x18\x04 \x01(\x05R\x06height\"C\n\x15SnapshotExtensionMeta\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x16\n\x06\x66ormat\x18\x02 \x01(\rR\x06\x66ormat\"4\n\x18SnapshotExtensionPayload\x12\x18\n\x07payload\x18\x01 \x01(\x0cR\x07payload\"<\n\x0eSnapshotKVItem\x12\x10\n\x03key\x18\x01 \x01(\x0cR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x0cR\x05value:\x02\x18\x01\"(\n\x0eSnapshotSchema\x12\x12\n\x04keys\x18\x01 \x03(\x0cR\x04keys:\x02\x18\x01\x42\xf5\x01\n!com.cosmos.base.snapshots.v1beta1B\rSnapshotProtoZ,github.com/cosmos/cosmos-sdk/snapshots/types\xa2\x02\x03\x43\x42S\xaa\x02\x1d\x43osmos.Base.Snapshots.V1beta1\xca\x02\x1d\x43osmos\\Base\\Snapshots\\V1beta1\xe2\x02)Cosmos\\Base\\Snapshots\\V1beta1\\GPBMetadata\xea\x02 Cosmos::Base::Snapshots::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.base.snapshots.v1beta1.snapshot_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n!com.cosmos.base.snapshots.v1beta1B\rSnapshotProtoZ,github.com/cosmos/cosmos-sdk/snapshots/types\242\002\003CBS\252\002\035Cosmos.Base.Snapshots.V1beta1\312\002\035Cosmos\\Base\\Snapshots\\V1beta1\342\002)Cosmos\\Base\\Snapshots\\V1beta1\\GPBMetadata\352\002 Cosmos::Base::Snapshots::V1beta1'
  _globals['_SNAPSHOT'].fields_by_name['metadata']._loaded_options = None
  _globals['_SNAPSHOT'].fields_by_name['metadata']._serialized_options = b'\310\336\037\000'
  _globals['_SNAPSHOTITEM'].fields_by_name['iavl']._loaded_options = None
  _globals['_SNAPSHOTITEM'].fields_by_name['iavl']._serialized_options = b'\342\336\037\004IAVL'
  _globals['_SNAPSHOTITEM'].fields_by_name['kv']._loaded_options = None
  _globals['_SNAPSHOTITEM'].fields_by_name['kv']._serialized_options = b'\030\001\342\336\037\002KV'
  _globals['_SNAPSHOTITEM'].fields_by_name['schema']._loaded_options = None
  _globals['_SNAPSHOTITEM'].fields_by_name['schema']._serialized_options = b'\030\001'
  _globals['_SNAPSHOTKVITEM']._loaded_options = None
  _globals['_SNAPSHOTKVITEM']._serialized_options = b'\030\001'
  _globals['_SNAPSHOTSCHEMA']._loaded_options = None
  _globals['_SNAPSHOTSCHEMA']._serialized_options = b'\030\001'
  _globals['_SNAPSHOT']._serialized_start=102
  _globals['_SNAPSHOT']._serialized_end=279
  _globals['_METADATA']._serialized_start=281
  _globals['_METADATA']._serialized_end=326
  _globals['_SNAPSHOTITEM']._serialized_start=329
  _globals['_SNAPSHOTITEM']._serialized_end=848
  _globals['_SNAPSHOTSTOREITEM']._serialized_start=850
  _globals['_SNAPSHOTSTOREITEM']._serialized_end=889
  _globals['_SNAPSHOTIAVLITEM']._serialized_start=891
  _globals['_SNAPSHOTIAVLITEM']._serialized_end=999
  _globals['_SNAPSHOTEXTENSIONMETA']._serialized_start=1001
  _globals['_SNAPSHOTEXTENSIONMETA']._serialized_end=1068
  _globals['_SNAPSHOTEXTENSIONPAYLOAD']._serialized_start=1070
  _globals['_SNAPSHOTEXTENSIONPAYLOAD']._serialized_end=1122
  _globals['_SNAPSHOTKVITEM']._serialized_start=1124
  _globals['_SNAPSHOTKVITEM']._serialized_end=1184
  _globals['_SNAPSHOTSCHEMA']._serialized_start=1186
  _globals['_SNAPSHOTSCHEMA']._serialized_end=1226
# @@protoc_insertion_point(module_scope)
