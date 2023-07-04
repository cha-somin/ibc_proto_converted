# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/subspaces/v3/models.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n desmos/subspaces/v3/models.proto\x12\x13\x64\x65smos.subspaces.v3\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x82\x03\n\x08Subspace\x12#\n\x02id\x18\x01 \x01(\x04\x42\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12#\n\x04name\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12/\n\x08treasury\x18\x04 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"treasury\"R\x08treasury\x12&\n\x05owner\x18\x05 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12,\n\x07\x63reator\x18\x06 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\x12\x61\n\rcreation_time\x18\x07 \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"creation_time\"\x90\xdf\x1f\x01R\x0c\x63reationTime:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\x9d\x02\n\x07Section\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12#\n\x02id\x18\x02 \x01(\rB\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12=\n\tparent_id\x18\x03 \x01(\rB \xe2\xde\x1f\x08ParentID\xf2\xde\x1f\x10yaml:\"parent_id\"R\x08parentId\x12#\n\x04name\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xec\x02\n\tUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12#\n\x02id\x18\x03 \x01(\rB\x13\xe2\xde\x1f\x02ID\xf2\xde\x1f\tyaml:\"id\"R\x02id\x12#\n\x04name\x18\x04 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x05 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12G\n\x0bpermissions\x18\x06 \x03(\tB%\xf2\xde\x1f\x12yaml:\"permissions\"\xaa\xdf\x1f\x0bPermissionsR\x0bpermissions:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\"\xc0\x01\n\x0eUserPermission\x12/\n\x0bsubspace_id\x18\x01 \x01(\x04\x42\x0e\xe2\xde\x1f\nSubspaceIDR\nsubspaceId\x12,\n\nsection_id\x18\x02 \x01(\rB\r\xe2\xde\x1f\tSectionIDR\tsectionId\x12\x12\n\x04user\x18\x03 \x01(\tR\x04user\x12\x31\n\x0bpermissions\x18\x04 \x03(\tB\x0f\xaa\xdf\x1f\x0bPermissionsR\x0bpermissions:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xc8\x01\n\x17\x63om.desmos.subspaces.v3B\x0bModelsProtoP\x01Z2github.com/desmos-labs/desmos/v5/x/subspaces/types\xa2\x02\x03\x44SX\xaa\x02\x13\x44\x65smos.Subspaces.V3\xca\x02\x13\x44\x65smos\\Subspaces\\V3\xe2\x02\x1f\x44\x65smos\\Subspaces\\V3\\GPBMetadata\xea\x02\x15\x44\x65smos::Subspaces::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.subspaces.v3.models_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.desmos.subspaces.v3B\013ModelsProtoP\001Z2github.com/desmos-labs/desmos/v5/x/subspaces/types\242\002\003DSX\252\002\023Desmos.Subspaces.V3\312\002\023Desmos\\Subspaces\\V3\342\002\037Desmos\\Subspaces\\V3\\GPBMetadata\352\002\025Desmos::Subspaces::V3'
  _SUBSPACE.fields_by_name['id']._options = None
  _SUBSPACE.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _SUBSPACE.fields_by_name['name']._options = None
  _SUBSPACE.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _SUBSPACE.fields_by_name['description']._options = None
  _SUBSPACE.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _SUBSPACE.fields_by_name['treasury']._options = None
  _SUBSPACE.fields_by_name['treasury']._serialized_options = b'\362\336\037\017yaml:\"treasury\"'
  _SUBSPACE.fields_by_name['owner']._options = None
  _SUBSPACE.fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _SUBSPACE.fields_by_name['creator']._options = None
  _SUBSPACE.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _SUBSPACE.fields_by_name['creation_time']._options = None
  _SUBSPACE.fields_by_name['creation_time']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"creation_time\"\220\337\037\001'
  _SUBSPACE._options = None
  _SUBSPACE._serialized_options = b'\230\240\037\001\350\240\037\001'
  _SECTION.fields_by_name['subspace_id']._options = None
  _SECTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _SECTION.fields_by_name['id']._options = None
  _SECTION.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _SECTION.fields_by_name['parent_id']._options = None
  _SECTION.fields_by_name['parent_id']._serialized_options = b'\342\336\037\010ParentID\362\336\037\020yaml:\"parent_id\"'
  _SECTION.fields_by_name['name']._options = None
  _SECTION.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _SECTION.fields_by_name['description']._options = None
  _SECTION.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _SECTION._options = None
  _SECTION._serialized_options = b'\230\240\037\001\350\240\037\001'
  _USERGROUP.fields_by_name['subspace_id']._options = None
  _USERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _USERGROUP.fields_by_name['section_id']._options = None
  _USERGROUP.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _USERGROUP.fields_by_name['id']._options = None
  _USERGROUP.fields_by_name['id']._serialized_options = b'\342\336\037\002ID\362\336\037\tyaml:\"id\"'
  _USERGROUP.fields_by_name['name']._options = None
  _USERGROUP.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _USERGROUP.fields_by_name['description']._options = None
  _USERGROUP.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _USERGROUP.fields_by_name['permissions']._options = None
  _USERGROUP.fields_by_name['permissions']._serialized_options = b'\362\336\037\022yaml:\"permissions\"\252\337\037\013Permissions'
  _USERGROUP._options = None
  _USERGROUP._serialized_options = b'\230\240\037\001\350\240\037\001'
  _USERPERMISSION.fields_by_name['subspace_id']._options = None
  _USERPERMISSION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID'
  _USERPERMISSION.fields_by_name['section_id']._options = None
  _USERPERMISSION.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID'
  _USERPERMISSION.fields_by_name['permissions']._options = None
  _USERPERMISSION.fields_by_name['permissions']._serialized_options = b'\252\337\037\013Permissions'
  _USERPERMISSION._options = None
  _USERPERMISSION._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_SUBSPACE']._serialized_start=113
  _globals['_SUBSPACE']._serialized_end=499
  _globals['_SECTION']._serialized_start=502
  _globals['_SECTION']._serialized_end=787
  _globals['_USERGROUP']._serialized_start=790
  _globals['_USERGROUP']._serialized_end=1154
  _globals['_USERPERMISSION']._serialized_start=1157
  _globals['_USERPERMISSION']._serialized_end=1349
# @@protoc_insertion_point(module_scope)