# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/profiles/v3/msgs_profile.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%desmos/profiles/v3/msgs_profile.proto\x12\x12\x64\x65smos.profiles.v3\x1a\x14gogoproto/gogo.proto\"\xc2\x02\n\x0eMsgSaveProfile\x12+\n\x04\x64tag\x18\x01 \x01(\tB\x17\xe2\xde\x1f\x04\x44Tag\xf2\xde\x1f\x0byaml:\"dtag\"R\x04\x64tag\x12/\n\x08nickname\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"nickname\"R\x08nickname\x12 \n\x03\x62io\x18\x03 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"bio\"R\x03\x62io\x12\x43\n\x0fprofile_picture\x18\x04 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"profile_picture\"R\x0eprofilePicture\x12=\n\rcover_picture\x18\x05 \x01(\tB\x18\xf2\xde\x1f\x14yaml:\"cover_picture\"R\x0c\x63overPicture\x12,\n\x07\x63reator\x18\x06 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\"\x18\n\x16MsgSaveProfileResponse\"@\n\x10MsgDeleteProfile\x12,\n\x07\x63reator\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"creator\"R\x07\x63reator\"\x1a\n\x18MsgDeleteProfileResponseB\xc7\x01\n\x16\x63om.desmos.profiles.v3B\x10MsgsProfileProtoP\x01Z1github.com/desmos-labs/desmos/v5/x/profiles/types\xa2\x02\x03\x44PX\xaa\x02\x12\x44\x65smos.Profiles.V3\xca\x02\x12\x44\x65smos\\Profiles\\V3\xe2\x02\x1e\x44\x65smos\\Profiles\\V3\\GPBMetadata\xea\x02\x14\x44\x65smos::Profiles::V3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.profiles.v3.msgs_profile_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.desmos.profiles.v3B\020MsgsProfileProtoP\001Z1github.com/desmos-labs/desmos/v5/x/profiles/types\242\002\003DPX\252\002\022Desmos.Profiles.V3\312\002\022Desmos\\Profiles\\V3\342\002\036Desmos\\Profiles\\V3\\GPBMetadata\352\002\024Desmos::Profiles::V3'
  _MSGSAVEPROFILE.fields_by_name['dtag']._options = None
  _MSGSAVEPROFILE.fields_by_name['dtag']._serialized_options = b'\342\336\037\004DTag\362\336\037\013yaml:\"dtag\"'
  _MSGSAVEPROFILE.fields_by_name['nickname']._options = None
  _MSGSAVEPROFILE.fields_by_name['nickname']._serialized_options = b'\362\336\037\017yaml:\"nickname\"'
  _MSGSAVEPROFILE.fields_by_name['bio']._options = None
  _MSGSAVEPROFILE.fields_by_name['bio']._serialized_options = b'\362\336\037\nyaml:\"bio\"'
  _MSGSAVEPROFILE.fields_by_name['profile_picture']._options = None
  _MSGSAVEPROFILE.fields_by_name['profile_picture']._serialized_options = b'\362\336\037\026yaml:\"profile_picture\"'
  _MSGSAVEPROFILE.fields_by_name['cover_picture']._options = None
  _MSGSAVEPROFILE.fields_by_name['cover_picture']._serialized_options = b'\362\336\037\024yaml:\"cover_picture\"'
  _MSGSAVEPROFILE.fields_by_name['creator']._options = None
  _MSGSAVEPROFILE.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _MSGDELETEPROFILE.fields_by_name['creator']._options = None
  _MSGDELETEPROFILE.fields_by_name['creator']._serialized_options = b'\362\336\037\016yaml:\"creator\"'
  _globals['_MSGSAVEPROFILE']._serialized_start=84
  _globals['_MSGSAVEPROFILE']._serialized_end=406
  _globals['_MSGSAVEPROFILERESPONSE']._serialized_start=408
  _globals['_MSGSAVEPROFILERESPONSE']._serialized_end=432
  _globals['_MSGDELETEPROFILE']._serialized_start=434
  _globals['_MSGDELETEPROFILE']._serialized_end=498
  _globals['_MSGDELETEPROFILERESPONSE']._serialized_start=500
  _globals['_MSGDELETEPROFILERESPONSE']._serialized_end=526
# @@protoc_insertion_point(module_scope)
