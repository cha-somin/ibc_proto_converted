# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: assetmantle/identities/transactions/issue/message.proto
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


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n7assetmantle/identities/transactions/issue/message.proto\x12\x31\x61ssetmantle.modules.identities.transactions.issue\x1a,assetmantle/ids/base/classification_id.proto\x1a&assetmantle/ids/base/identity_id.proto\x1a*assetmantle/lists/base/property_list.proto\"\xd7\x04\n\x07Message\x12\x12\n\x04\x66rom\x18\x01 \x01(\tR\x04\x66rom\x12\x41\n\x08\x66rom_i_d\x18\x02 \x01(\x0b\x32\'.assetmantle.schema.ids.base.IdentityIDR\x06\x66romID\x12\x0e\n\x02to\x18\x03 \x01(\tR\x02to\x12[\n\x12\x63lassification_i_d\x18\x04 \x01(\x0b\x32-.assetmantle.schema.ids.base.ClassificationIDR\x10\x63lassificationID\x12g\n\x19immutable_meta_properties\x18\x05 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x17immutableMetaProperties\x12^\n\x14immutable_properties\x18\x06 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x13immutableProperties\x12\x63\n\x17mutable_meta_properties\x18\x07 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x15mutableMetaProperties\x12Z\n\x12mutable_properties\x18\x08 \x01(\x0b\x32+.assetmantle.schema.lists.base.PropertyListR\x11mutablePropertiesB\xaf\x02\n5com.assetmantle.modules.identities.transactions.issueB\x0cMessageProtoP\x01\xa2\x02\x05\x41MITI\xaa\x02\x31\x41ssetmantle.Modules.Identities.Transactions.Issue\xca\x02\x31\x41ssetmantle\\Modules\\Identities\\Transactions\\Issue\xe2\x02=Assetmantle\\Modules\\Identities\\Transactions\\Issue\\GPBMetadata\xea\x02\x35\x41ssetmantle::Modules::Identities::Transactions::Issueb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'assetmantle.identities.transactions.issue.message_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n5com.assetmantle.modules.identities.transactions.issueB\014MessageProtoP\001\242\002\005AMITI\252\0021Assetmantle.Modules.Identities.Transactions.Issue\312\0021Assetmantle\\Modules\\Identities\\Transactions\\Issue\342\002=Assetmantle\\Modules\\Identities\\Transactions\\Issue\\GPBMetadata\352\0025Assetmantle::Modules::Identities::Transactions::Issue'
  _globals['_MESSAGE']._serialized_start=241
  _globals['_MESSAGE']._serialized_end=840
# @@protoc_insertion_point(module_scope)
