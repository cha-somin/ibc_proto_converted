# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/types/base/split.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from assetmantle.ids.base import any_ownable_id_pb2 as assetmantle_dot_ids_dot_base_dot_any__ownable__id__pb2
from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"assetmantle/types/base/split.proto\x12\x1d\x61ssetmantle.schema.types.base\x1a\x14gogoproto/gogo.proto\x1a)assetmantle/ids/base/any_ownable_id.proto\x1a&assetmantle/ids/base/identity_id.proto\"\xb3\x01\n\x05Split\x12\x43\n\towner_i_d\x18\x01 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x07ownerID\x12I\n\x0bownable_i_d\x18\x02 \x01(\x0b\x32).assetmantle.schema.ids.base.AnyOwnableIDR\townableID\x12\x14\n\x05value\x18\x03 \x01(\tR\x05value:\x04\x88\xa0\x1f\x00\x42\xc7\x01\n!com.assetmantle.schema.types.baseB\nSplitProtoP\x01\xa2\x02\x04\x41STB\xaa\x02\x1d\x41ssetmantle.Schema.Types.Base\xca\x02\x1d\x41ssetmantle\\Schema\\Types\\Base\xe2\x02)Assetmantle\\Schema\\Types\\Base\\GPBMetadata\xea\x02 Assetmantle::Schema::Types::Baseb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.types.base.split_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n!com.assetmantle.schema.types.baseB\nSplitProtoP\001\242\002\004ASTB\252\002\035Assetmantle.Schema.Types.Base\312\002\035Assetmantle\\Schema\\Types\\Base\342\002)Assetmantle\\Schema\\Types\\Base\\GPBMetadata\352\002 Assetmantle::Schema::Types::Base'
  _SPLIT._options = None
  _SPLIT._serialized_options = b'\210\240\037\000'
  _globals['_SPLIT']._serialized_start=175
  _globals['_SPLIT']._serialized_end=354
# @@protoc_insertion_point(module_scope)
