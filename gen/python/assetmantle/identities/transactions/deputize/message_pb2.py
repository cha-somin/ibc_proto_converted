# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/identities/transactions/deputize/message.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from assetmantle.ids.base import classification_id_pb2 as assetmantle_dot_ids_dot_base_dot_classification__id__pb2
from assetmantle.ids.base import identity_id_pb2 as assetmantle_dot_ids_dot_base_dot_identity__id__pb2
from assetmantle.lists.base import property_list_pb2 as assetmantle_dot_lists_dot_base_dot_property__list__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n:assetmantle/identities/transactions/deputize/message.proto\x12\x34\x61ssetmantle.modules.identities.transactions.deputize\x1a,assetmantle/ids/base/classification_id.proto\x1a&assetmantle/ids/base/identity_id.proto\x1a*assetmantle/lists/base/property_list.proto\"\xf2\x04\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12=\n\x06to_i_d\x18\x03 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x04toID\x12[\n\x12\x63lassification_i_d\x18\x04 \x01(\x0b\x32-.assetmantle.schema.ids.base.ClassificationIDR\x10\x63lassificationID\x12`\n\x15maintained_properties\x18\x05 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x14maintainedProperties\x12$\n\x0e\x63\x61n_mint_asset\x18\x06 \x01(\x08R\x0c\x63\x61nMintAsset\x12$\n\x0e\x63\x61n_burn_asset\x18\x07 \x01(\x08R\x0c\x63\x61nBurnAsset\x12\x30\n\x14\x63\x61n_renumerate_asset\x18\x08 \x01(\x08R\x12\x63\x61nRenumerateAsset\x12,\n\x12\x63\x61n_add_maintainer\x18\t \x01(\x08R\x10\x63\x61nAddMaintainer\x12\x32\n\x15\x63\x61n_remove_maintainer\x18\n \x01(\x08R\x13\x63\x61nRemoveMaintainer\x12\x32\n\x15\x63\x61n_mutate_maintainer\x18\x0b \x01(\x08R\x13\x63\x61nMutateMaintainerB\xbe\x02\n8com.assetmantle.modules.identities.transactions.deputizeB\x0cMessageProtoP\x01\xa2\x02\x05\x41MITD\xaa\x02\x34\x41ssetmantle.Modules.Identities.Transactions.Deputize\xca\x02\x34\x41ssetmantle\\Modules\\Identities\\Transactions\\Deputize\xe2\x02@Assetmantle\\Modules\\Identities\\Transactions\\Deputize\\GPBMetadata\xea\x02\x38\x41ssetmantle::Modules::Identities::Transactions::Deputizeb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.identities.transactions.deputize.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n8com.assetmantle.modules.identities.transactions.deputizeB\014MessageProtoP\001\242\002\005AMITD\252\0024Assetmantle.Modules.Identities.Transactions.Deputize\312\0024Assetmantle\\Modules\\Identities\\Transactions\\Deputize\342\002@Assetmantle\\Modules\\Identities\\Transactions\\Deputize\\GPBMetadata\352\0028Assetmantle::Modules::Identities::Transactions::Deputize'
  _globals['_MESSAGE']._serialized_start=247
  _globals['_MESSAGE']._serialized_end=873
# @@protoc_insertion_point(module_scope)
