# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/subspaces/v3/msgs.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from desmos.subspaces.v3 import msgs_treasury_pb2 as desmos_dot_subspaces_dot_v3_dot_msgs__treasury__pb2
from desmos.subspaces.v3 import msgs_feegrant_pb2 as desmos_dot_subspaces_dot_v3_dot_msgs__feegrant__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x64\x65smos/subspaces/v3/msgs.proto\x12\x13\x64\x65smos.subspaces.v3\x1a\x14gogoproto/gogo.proto\x1a\'desmos/subspaces/v3/msgs_treasury.proto\x1a\'desmos/subspaces/v3/msgs_feegrant.proto\"\xc8\x01\n\x11MsgCreateSubspace\x12#\n\x04name\x18\x01 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12&\n\x05owner\x18\x03 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12,\n\x07\x63reator\x18\x04 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\"b\n\x19MsgCreateSubspaceResponse\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\"\x8a\x02\n\x0fMsgEditSubspace\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12#\n\x04name\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12&\n\x05owner\x18\x04 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"owner\"R\x05owner\x12)\n\x06signer\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x19\n\x17MsgEditSubspaceResponse\"\x85\x01\n\x11MsgDeleteSubspace\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12)\n\x06signer\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1b\n\x19MsgDeleteSubspaceResponse\"\xa5\x02\n\x10MsgCreateSection\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12#\n\x04name\x18\x02 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x03 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12=\n\tparent_id\x18\x04 \x01(\rB \xe2\xde\x1f\x08ParentID\xf2\xde\x1f\x10yaml:\"parent_id\"R\x08parentId\x12,\n\x07\x63reator\x18\x05 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\"]\n\x18MsgCreateSectionResponse\x12\x41\n\nsection_id\x18\x01 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\"\xa4\x02\n\x0eMsgEditSection\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12#\n\x04name\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12)\n\x06\x65\x64itor\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"editor\"R\x06\x65\x64itor\"\x18\n\x16MsgEditSectionResponse\"\x92\x02\n\x0eMsgMoveSection\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12K\n\rnew_parent_id\x18\x03 \x01(\rB\'\xe2\xde\x1f\x0bNewParentID\xf2\xde\x1f\x14yaml:\"new_parent_id\"R\x0bnewParentId\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x18\n\x16MsgMoveSectionResponse\"\xc7\x01\n\x10MsgDeleteSection\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12)\n\x06signer\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1a\n\x18MsgDeleteSectionResponse\"\xc1\x03\n\x12MsgCreateUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12#\n\x04name\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12O\n\x13\x64\x65\x66\x61ult_permissions\x18\x05 \x03(\tB\x1e\xf2\xde\x1f\x1ayaml:\"default_permissions\"R\x12\x64\x65\x66\x61ultPermissions\x12\x43\n\x0finitial_members\x18\x06 \x03(\tB\x1a\xf2\xde\x1f\x16yaml:\"initial_members\"R\x0einitialMembers\x12,\n\x07\x63reator\x18\x07 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\"W\n\x1aMsgCreateUserGroupResponse\x12\x39\n\x08group_id\x18\x01 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\"\x9e\x02\n\x10MsgEditUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12#\n\x04name\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12\x38\n\x0b\x64\x65scription\x18\x04 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12)\n\x06signer\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1a\n\x18MsgEditUserGroupResponse\"\x90\x02\n\x10MsgMoveUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12O\n\x0enew_section_id\x18\x03 \x01(\rB)\xe2\xde\x1f\x0cNewSectionID\xf2\xde\x1f\x15yaml:\"new_section_id\"R\x0cnewSectionId\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1a\n\x18MsgMoveUserGroupResponse\"\x83\x02\n\x1aMsgSetUserGroupPermissions\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12\x38\n\x0bpermissions\x18\x03 \x03(\tB\x16\xf2\xde\x1f\x12yaml:\"permissions\"R\x0bpermissions\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"$\n\"MsgSetUserGroupPermissionsResponse\"\xc1\x01\n\x12MsgDeleteUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12)\n\x06signer\x18\x03 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1c\n\x1aMsgDeleteUserGroupResponse\"\xe9\x01\n\x15MsgAddUserToUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12#\n\x04user\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1f\n\x1dMsgAddUserToUserGroupResponse\"\xee\x01\n\x1aMsgRemoveUserFromUserGroup\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x39\n\x08group_id\x18\x02 \x01(\rB\x1e\xe2\xde\x1f\x07GroupID\xf2\xde\x1f\x0fyaml:\"group_id\"R\x07groupId\x12#\n\x04user\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\x12)\n\x06signer\x18\x04 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"$\n\"MsgRemoveUserFromUserGroupResponse\"\xab\x02\n\x15MsgSetUserPermissions\x12\x45\n\x0bsubspace_id\x18\x01 \x01(\x04\x42$\xe2\xde\x1f\nSubspaceID\xf2\xde\x1f\x12yaml:\"subspace_id\"R\nsubspaceId\x12\x41\n\nsection_id\x18\x02 \x01(\rB\"\xe2\xde\x1f\tSectionID\xf2\xde\x1f\x11yaml:\"section_id\"R\tsectionId\x12#\n\x04user\x18\x03 \x01(\tB\x0f\xf2\xde\x1f\x0byaml:\"user\"R\x04user\x12\x38\n\x0bpermissions\x18\x04 \x03(\tB\x16\xf2\xde\x1f\x12yaml:\"permissions\"R\x0bpermissions\x12)\n\x06signer\x18\x05 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\"\x1f\n\x1dMsgSetUserPermissionsResponse2\xe5\x10\n\x03Msg\x12h\n\x0e\x43reateSubspace\x12&.desmos.subspaces.v3.MsgCreateSubspace\x1a..desmos.subspaces.v3.MsgCreateSubspaceResponse\x12\x62\n\x0c\x45\x64itSubspace\x12$.desmos.subspaces.v3.MsgEditSubspace\x1a,.desmos.subspaces.v3.MsgEditSubspaceResponse\x12h\n\x0e\x44\x65leteSubspace\x12&.desmos.subspaces.v3.MsgDeleteSubspace\x1a..desmos.subspaces.v3.MsgDeleteSubspaceResponse\x12\x65\n\rCreateSection\x12%.desmos.subspaces.v3.MsgCreateSection\x1a-.desmos.subspaces.v3.MsgCreateSectionResponse\x12_\n\x0b\x45\x64itSection\x12#.desmos.subspaces.v3.MsgEditSection\x1a+.desmos.subspaces.v3.MsgEditSectionResponse\x12_\n\x0bMoveSection\x12#.desmos.subspaces.v3.MsgMoveSection\x1a+.desmos.subspaces.v3.MsgMoveSectionResponse\x12\x65\n\rDeleteSection\x12%.desmos.subspaces.v3.MsgDeleteSection\x1a-.desmos.subspaces.v3.MsgDeleteSectionResponse\x12k\n\x0f\x43reateUserGroup\x12\'.desmos.subspaces.v3.MsgCreateUserGroup\x1a/.desmos.subspaces.v3.MsgCreateUserGroupResponse\x12\x65\n\rEditUserGroup\x12%.desmos.subspaces.v3.MsgEditUserGroup\x1a-.desmos.subspaces.v3.MsgEditUserGroupResponse\x12\x65\n\rMoveUserGroup\x12%.desmos.subspaces.v3.MsgMoveUserGroup\x1a-.desmos.subspaces.v3.MsgMoveUserGroupResponse\x12\x83\x01\n\x17SetUserGroupPermissions\x12/.desmos.subspaces.v3.MsgSetUserGroupPermissions\x1a\x37.desmos.subspaces.v3.MsgSetUserGroupPermissionsResponse\x12k\n\x0f\x44\x65leteUserGroup\x12\'.desmos.subspaces.v3.MsgDeleteUserGroup\x1a/.desmos.subspaces.v3.MsgDeleteUserGroupResponse\x12t\n\x12\x41\x64\x64UserToUserGroup\x12*.desmos.subspaces.v3.MsgAddUserToUserGroup\x1a\x32.desmos.subspaces.v3.MsgAddUserToUserGroupResponse\x12\x83\x01\n\x17RemoveUserFromUserGroup\x12/.desmos.subspaces.v3.MsgRemoveUserFromUserGroup\x1a\x37.desmos.subspaces.v3.MsgRemoveUserFromUserGroupResponse\x12t\n\x12SetUserPermissions\x12*.desmos.subspaces.v3.MsgSetUserPermissions\x1a\x32.desmos.subspaces.v3.MsgSetUserPermissionsResponse\x12\x8c\x01\n\x1aGrantTreasuryAuthorization\x12\x32.desmos.subspaces.v3.MsgGrantTreasuryAuthorization\x1a:.desmos.subspaces.v3.MsgGrantTreasuryAuthorizationResponse\x12\x8f\x01\n\x1bRevokeTreasuryAuthorization\x12\x33.desmos.subspaces.v3.MsgRevokeTreasuryAuthorization\x1a;.desmos.subspaces.v3.MsgRevokeTreasuryAuthorizationResponse\x12h\n\x0eGrantAllowance\x12&.desmos.subspaces.v3.MsgGrantAllowance\x1a..desmos.subspaces.v3.MsgGrantAllowanceResponse\x12k\n\x0fRevokeAllowance\x12\'.desmos.subspaces.v3.MsgRevokeAllowance\x1a/.desmos.subspaces.v3.MsgRevokeAllowanceResponseB\xc6\x01\n\x17\x63om.desmos.subspaces.v3B\tMsgsProtoP\x01Z2github.com/desmos-labs/desmos/v5/x/subspaces/types\xa2\x02\x03\x44SX\xaa\x02\x13\x44\x65smos.Subspaces.V3\xca\x02\x13\x44\x65smos\\Subspaces\\V3\xe2\x02\x1f\x44\x65smos\\Subspaces\\V3\\GPBMetadata\xea\x02\x15\x44\x65smos::Subspaces::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.subspaces.v3.msgs_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.desmos.subspaces.v3B\tMsgsProtoP\001Z2github.com/desmos-labs/desmos/v5/x/subspaces/types\242\002\003DSX\252\002\023Desmos.Subspaces.V3\312\002\023Desmos\\Subspaces\\V3\342\002\037Desmos\\Subspaces\\V3\\GPBMetadata\352\002\025Desmos::Subspaces::V3'
  _MSGCREATESUBSPACE.fields_by_name['name']._options = None
  _MSGCREATESUBSPACE.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGCREATESUBSPACE.fields_by_name['description']._options = None
  _MSGCREATESUBSPACE.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGCREATESUBSPACE.fields_by_name['owner']._options = None
  _MSGCREATESUBSPACE.fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _MSGCREATESUBSPACE.fields_by_name['creator']._options = None
  _MSGCREATESUBSPACE.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _MSGCREATESUBSPACERESPONSE.fields_by_name['subspace_id']._options = None
  _MSGCREATESUBSPACERESPONSE.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGEDITSUBSPACE.fields_by_name['subspace_id']._options = None
  _MSGEDITSUBSPACE.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGEDITSUBSPACE.fields_by_name['name']._options = None
  _MSGEDITSUBSPACE.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGEDITSUBSPACE.fields_by_name['description']._options = None
  _MSGEDITSUBSPACE.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGEDITSUBSPACE.fields_by_name['owner']._options = None
  _MSGEDITSUBSPACE.fields_by_name['owner']._serialized_options = b'\362\336\037\014yaml:\"owner\"'
  _MSGEDITSUBSPACE.fields_by_name['signer']._options = None
  _MSGEDITSUBSPACE.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGDELETESUBSPACE.fields_by_name['subspace_id']._options = None
  _MSGDELETESUBSPACE.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGDELETESUBSPACE.fields_by_name['signer']._options = None
  _MSGDELETESUBSPACE.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGCREATESECTION.fields_by_name['subspace_id']._options = None
  _MSGCREATESECTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGCREATESECTION.fields_by_name['name']._options = None
  _MSGCREATESECTION.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGCREATESECTION.fields_by_name['description']._options = None
  _MSGCREATESECTION.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGCREATESECTION.fields_by_name['parent_id']._options = None
  _MSGCREATESECTION.fields_by_name['parent_id']._serialized_options = b'\342\336\037\010ParentID\362\336\037\020yaml:\"parent_id\"'
  _MSGCREATESECTION.fields_by_name['creator']._options = None
  _MSGCREATESECTION.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _MSGCREATESECTIONRESPONSE.fields_by_name['section_id']._options = None
  _MSGCREATESECTIONRESPONSE.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGEDITSECTION.fields_by_name['subspace_id']._options = None
  _MSGEDITSECTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGEDITSECTION.fields_by_name['section_id']._options = None
  _MSGEDITSECTION.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGEDITSECTION.fields_by_name['name']._options = None
  _MSGEDITSECTION.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGEDITSECTION.fields_by_name['description']._options = None
  _MSGEDITSECTION.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGEDITSECTION.fields_by_name['editor']._options = None
  _MSGEDITSECTION.fields_by_name['editor']._serialized_options = b'\362\336\037\ryaml:\"editor\"'
  _MSGMOVESECTION.fields_by_name['subspace_id']._options = None
  _MSGMOVESECTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGMOVESECTION.fields_by_name['section_id']._options = None
  _MSGMOVESECTION.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGMOVESECTION.fields_by_name['new_parent_id']._options = None
  _MSGMOVESECTION.fields_by_name['new_parent_id']._serialized_options = b'\342\336\037\013NewParentID\362\336\037\024yaml:\"new_parent_id\"'
  _MSGMOVESECTION.fields_by_name['signer']._options = None
  _MSGMOVESECTION.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGDELETESECTION.fields_by_name['subspace_id']._options = None
  _MSGDELETESECTION.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGDELETESECTION.fields_by_name['section_id']._options = None
  _MSGDELETESECTION.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGDELETESECTION.fields_by_name['signer']._options = None
  _MSGDELETESECTION.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGCREATEUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGCREATEUSERGROUP.fields_by_name['section_id']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGCREATEUSERGROUP.fields_by_name['name']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGCREATEUSERGROUP.fields_by_name['description']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGCREATEUSERGROUP.fields_by_name['default_permissions']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['default_permissions']._serialized_options = b'\362\336\037\032yaml:\"default_permissions\"'
  _MSGCREATEUSERGROUP.fields_by_name['initial_members']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['initial_members']._serialized_options = b'\362\336\037\026yaml:\"initial_members\"'
  _MSGCREATEUSERGROUP.fields_by_name['creator']._options = None
  _MSGCREATEUSERGROUP.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _MSGCREATEUSERGROUPRESPONSE.fields_by_name['group_id']._options = None
  _MSGCREATEUSERGROUPRESPONSE.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGEDITUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGEDITUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGEDITUSERGROUP.fields_by_name['group_id']._options = None
  _MSGEDITUSERGROUP.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGEDITUSERGROUP.fields_by_name['name']._options = None
  _MSGEDITUSERGROUP.fields_by_name['name']._serialized_options = b'\362\336\037\013yaml:\"name\"'
  _MSGEDITUSERGROUP.fields_by_name['description']._options = None
  _MSGEDITUSERGROUP.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _MSGEDITUSERGROUP.fields_by_name['signer']._options = None
  _MSGEDITUSERGROUP.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGMOVEUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGMOVEUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGMOVEUSERGROUP.fields_by_name['group_id']._options = None
  _MSGMOVEUSERGROUP.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGMOVEUSERGROUP.fields_by_name['new_section_id']._options = None
  _MSGMOVEUSERGROUP.fields_by_name['new_section_id']._serialized_options = b'\342\336\037\014NewSectionID\362\336\037\025yaml:\"new_section_id\"'
  _MSGMOVEUSERGROUP.fields_by_name['signer']._options = None
  _MSGMOVEUSERGROUP.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['subspace_id']._options = None
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['group_id']._options = None
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['permissions']._options = None
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['permissions']._serialized_options = b'\362\336\037\022yaml:\"permissions\"'
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['signer']._options = None
  _MSGSETUSERGROUPPERMISSIONS.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGDELETEUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGDELETEUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGDELETEUSERGROUP.fields_by_name['group_id']._options = None
  _MSGDELETEUSERGROUP.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGDELETEUSERGROUP.fields_by_name['signer']._options = None
  _MSGDELETEUSERGROUP.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGADDUSERTOUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGADDUSERTOUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGADDUSERTOUSERGROUP.fields_by_name['group_id']._options = None
  _MSGADDUSERTOUSERGROUP.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGADDUSERTOUSERGROUP.fields_by_name['user']._options = None
  _MSGADDUSERTOUSERGROUP.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGADDUSERTOUSERGROUP.fields_by_name['signer']._options = None
  _MSGADDUSERTOUSERGROUP.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['subspace_id']._options = None
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['group_id']._options = None
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['group_id']._serialized_options = b'\342\336\037\007GroupID\362\336\037\017yaml:\"group_id\"'
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['user']._options = None
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['signer']._options = None
  _MSGREMOVEUSERFROMUSERGROUP.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGSETUSERPERMISSIONS.fields_by_name['subspace_id']._options = None
  _MSGSETUSERPERMISSIONS.fields_by_name['subspace_id']._serialized_options = b'\342\336\037\nSubspaceID\362\336\037\022yaml:\"subspace_id\"'
  _MSGSETUSERPERMISSIONS.fields_by_name['section_id']._options = None
  _MSGSETUSERPERMISSIONS.fields_by_name['section_id']._serialized_options = b'\342\336\037\tSectionID\362\336\037\021yaml:\"section_id\"'
  _MSGSETUSERPERMISSIONS.fields_by_name['user']._options = None
  _MSGSETUSERPERMISSIONS.fields_by_name['user']._serialized_options = b'\362\336\037\013yaml:\"user\"'
  _MSGSETUSERPERMISSIONS.fields_by_name['permissions']._options = None
  _MSGSETUSERPERMISSIONS.fields_by_name['permissions']._serialized_options = b'\362\336\037\022yaml:\"permissions\"'
  _MSGSETUSERPERMISSIONS.fields_by_name['signer']._options = None
  _MSGSETUSERPERMISSIONS.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _globals['_MSGCREATESUBSPACE']._serialized_start=160
  _globals['_MSGCREATESUBSPACE']._serialized_end=360
  _globals['_MSGCREATESUBSPACERESPONSE']._serialized_start=362
  _globals['_MSGCREATESUBSPACERESPONSE']._serialized_end=460
  _globals['_MSGEDITSUBSPACE']._serialized_start=463
  _globals['_MSGEDITSUBSPACE']._serialized_end=729
  _globals['_MSGEDITSUBSPACERESPONSE']._serialized_start=731
  _globals['_MSGEDITSUBSPACERESPONSE']._serialized_end=756
  _globals['_MSGDELETESUBSPACE']._serialized_start=759
  _globals['_MSGDELETESUBSPACE']._serialized_end=892
  _globals['_MSGDELETESUBSPACERESPONSE']._serialized_start=894
  _globals['_MSGDELETESUBSPACERESPONSE']._serialized_end=921
  _globals['_MSGCREATESECTION']._serialized_start=924
  _globals['_MSGCREATESECTION']._serialized_end=1217
  _globals['_MSGCREATESECTIONRESPONSE']._serialized_start=1219
  _globals['_MSGCREATESECTIONRESPONSE']._serialized_end=1312
  _globals['_MSGEDITSECTION']._serialized_start=1315
  _globals['_MSGEDITSECTION']._serialized_end=1607
  _globals['_MSGEDITSECTIONRESPONSE']._serialized_start=1609
  _globals['_MSGEDITSECTIONRESPONSE']._serialized_end=1633
  _globals['_MSGMOVESECTION']._serialized_start=1636
  _globals['_MSGMOVESECTION']._serialized_end=1910
  _globals['_MSGMOVESECTIONRESPONSE']._serialized_start=1912
  _globals['_MSGMOVESECTIONRESPONSE']._serialized_end=1936
  _globals['_MSGDELETESECTION']._serialized_start=1939
  _globals['_MSGDELETESECTION']._serialized_end=2138
  _globals['_MSGDELETESECTIONRESPONSE']._serialized_start=2140
  _globals['_MSGDELETESECTIONRESPONSE']._serialized_end=2166
  _globals['_MSGCREATEUSERGROUP']._serialized_start=2169
  _globals['_MSGCREATEUSERGROUP']._serialized_end=2618
  _globals['_MSGCREATEUSERGROUPRESPONSE']._serialized_start=2620
  _globals['_MSGCREATEUSERGROUPRESPONSE']._serialized_end=2707
  _globals['_MSGEDITUSERGROUP']._serialized_start=2710
  _globals['_MSGEDITUSERGROUP']._serialized_end=2996
  _globals['_MSGEDITUSERGROUPRESPONSE']._serialized_start=2998
  _globals['_MSGEDITUSERGROUPRESPONSE']._serialized_end=3024
  _globals['_MSGMOVEUSERGROUP']._serialized_start=3027
  _globals['_MSGMOVEUSERGROUP']._serialized_end=3299
  _globals['_MSGMOVEUSERGROUPRESPONSE']._serialized_start=3301
  _globals['_MSGMOVEUSERGROUPRESPONSE']._serialized_end=3327
  _globals['_MSGSETUSERGROUPPERMISSIONS']._serialized_start=3330
  _globals['_MSGSETUSERGROUPPERMISSIONS']._serialized_end=3589
  _globals['_MSGSETUSERGROUPPERMISSIONSRESPONSE']._serialized_start=3591
  _globals['_MSGSETUSERGROUPPERMISSIONSRESPONSE']._serialized_end=3627
  _globals['_MSGDELETEUSERGROUP']._serialized_start=3630
  _globals['_MSGDELETEUSERGROUP']._serialized_end=3823
  _globals['_MSGDELETEUSERGROUPRESPONSE']._serialized_start=3825
  _globals['_MSGDELETEUSERGROUPRESPONSE']._serialized_end=3853
  _globals['_MSGADDUSERTOUSERGROUP']._serialized_start=3856
  _globals['_MSGADDUSERTOUSERGROUP']._serialized_end=4089
  _globals['_MSGADDUSERTOUSERGROUPRESPONSE']._serialized_start=4091
  _globals['_MSGADDUSERTOUSERGROUPRESPONSE']._serialized_end=4122
  _globals['_MSGREMOVEUSERFROMUSERGROUP']._serialized_start=4125
  _globals['_MSGREMOVEUSERFROMUSERGROUP']._serialized_end=4363
  _globals['_MSGREMOVEUSERFROMUSERGROUPRESPONSE']._serialized_start=4365
  _globals['_MSGREMOVEUSERFROMUSERGROUPRESPONSE']._serialized_end=4401
  _globals['_MSGSETUSERPERMISSIONS']._serialized_start=4404
  _globals['_MSGSETUSERPERMISSIONS']._serialized_end=4703
  _globals['_MSGSETUSERPERMISSIONSRESPONSE']._serialized_start=4705
  _globals['_MSGSETUSERPERMISSIONSRESPONSE']._serialized_end=4736
  _globals['_MSG']._serialized_start=4739
  _globals['_MSG']._serialized_end=6888
# @@protoc_insertion_point(module_scope)
