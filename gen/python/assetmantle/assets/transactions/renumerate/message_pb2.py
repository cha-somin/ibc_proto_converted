# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/assets/transactions/renumerate/message.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from assetmantle.ids.base import asset_id_pb2 as assetmantle_dot_ids_dot_base_dot_asset__id__pb2
from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n8assetmantle/assets/transactions/renumerate/message.proto\x12\x32\x61ssetmantle.modules.assets.transactions.renumerate\x1a#assetmantle/ids/base/asset_id.proto\x1a&assetmantle/ids/base/identity_id.proto\"\xa2\x01\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12@\n\tasset_i_d\x18\x03 \x01(\x0b\x32$.assetmantle.schema.ids.base.AssetIDR\x07\x61ssetIDB\xb4\x02\n6com.assetmantle.modules.assets.transactions.renumerateB\x0cMessageProtoP\x01\xa2\x02\x05\x41MATR\xaa\x02\x32\x41ssetmantle.Modules.Assets.Transactions.Renumerate\xca\x02\x32\x41ssetmantle\\Modules\\Assets\\Transactions\\Renumerate\xe2\x02>Assetmantle\\Modules\\Assets\\Transactions\\Renumerate\\GPBMetadata\xea\x02\x36\x41ssetmantle::Modules::Assets::Transactions::Renumerateb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.assets.transactions.renumerate.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n6com.assetmantle.modules.assets.transactions.renumerateB\014MessageProtoP\001\242\002\005AMATR\252\0022Assetmantle.Modules.Assets.Transactions.Renumerate\312\0022Assetmantle\\Modules\\Assets\\Transactions\\Renumerate\342\002>Assetmantle\\Modules\\Assets\\Transactions\\Renumerate\\GPBMetadata\352\0026Assetmantle::Modules::Assets::Transactions::Renumerate'
  _globals['_MESSAGE']._serialized_start=190
  _globals['_MESSAGE']._serialized_end=352
# @@protoc_insertion_point(module_scope)