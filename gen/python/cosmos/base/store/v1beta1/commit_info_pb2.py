# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/base/store/v1beta1/commit_info.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+cosmos/base/store/v1beta1/commit_info.proto\x12\x19\x63osmos.base.store.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\xb7\x01\n\nCommitInfo\x12\x18\n\x07version\x18\x01 \x01(\x03R\x07version\x12K\n\x0bstore_infos\x18\x02 \x03(\x0b\x32$.cosmos.base.store.v1beta1.StoreInfoB\x04\xc8\xde\x1f\x00R\nstoreInfos\x12\x42\n\ttimestamp\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\ttimestamp\"g\n\tStoreInfo\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x46\n\tcommit_id\x18\x02 \x01(\x0b\x32#.cosmos.base.store.v1beta1.CommitIDB\x04\xc8\xde\x1f\x00R\x08\x63ommitId\">\n\x08\x43ommitID\x12\x18\n\x07version\x18\x01 \x01(\x03R\x07version\x12\x12\n\x04hash\x18\x02 \x01(\x0cR\x04hash:\x04\x98\xa0\x1f\x00\x42\xdf\x01\n\x1d\x63om.cosmos.base.store.v1beta1B\x0f\x43ommitInfoProtoZ(github.com/cosmos/cosmos-sdk/store/types\xa2\x02\x03\x43\x42S\xaa\x02\x19\x43osmos.Base.Store.V1beta1\xca\x02\x19\x43osmos\\Base\\Store\\V1beta1\xe2\x02%Cosmos\\Base\\Store\\V1beta1\\GPBMetadata\xea\x02\x1c\x43osmos::Base::Store::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.base.store.v1beta1.commit_info_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\035com.cosmos.base.store.v1beta1B\017CommitInfoProtoZ(github.com/cosmos/cosmos-sdk/store/types\242\002\003CBS\252\002\031Cosmos.Base.Store.V1beta1\312\002\031Cosmos\\Base\\Store\\V1beta1\342\002%Cosmos\\Base\\Store\\V1beta1\\GPBMetadata\352\002\034Cosmos::Base::Store::V1beta1'
  _globals['_COMMITINFO'].fields_by_name['store_infos']._loaded_options = None
  _globals['_COMMITINFO'].fields_by_name['store_infos']._serialized_options = b'\310\336\037\000'
  _globals['_COMMITINFO'].fields_by_name['timestamp']._loaded_options = None
  _globals['_COMMITINFO'].fields_by_name['timestamp']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_STOREINFO'].fields_by_name['commit_id']._loaded_options = None
  _globals['_STOREINFO'].fields_by_name['commit_id']._serialized_options = b'\310\336\037\000'
  _globals['_COMMITID']._loaded_options = None
  _globals['_COMMITID']._serialized_options = b'\230\240\037\000'
  _globals['_COMMITINFO']._serialized_start=130
  _globals['_COMMITINFO']._serialized_end=313
  _globals['_STOREINFO']._serialized_start=315
  _globals['_STOREINFO']._serialized_end=418
  _globals['_COMMITID']._serialized_start=420
  _globals['_COMMITID']._serialized_end=482
# @@protoc_insertion_point(module_scope)
