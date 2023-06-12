# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: desmos/profiles/v2/models_profile.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'desmos/profiles/v2/models_profile.proto\x12\x12\x64\x65smos.profiles.v2\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x19\x63osmos_proto/cosmos.proto\"\x9b\x03\n\x07Profile\x12P\n\x07\x61\x63\x63ount\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyB \xca\xb4-\x1c\x63osmos.auth.v1beta1.AccountIR\x07\x61\x63\x63ount\x12+\n\x04\x64tag\x18\x02 \x01(\tB\x17\xe2\xde\x1f\x04\x44Tag\xf2\xde\x1f\x0byaml:\"dtag\"R\x04\x64tag\x12/\n\x08nickname\x18\x03 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"nickname\"R\x08nickname\x12 \n\x03\x62io\x18\x04 \x01(\tB\x0e\xf2\xde\x1f\nyaml:\"bio\"R\x03\x62io\x12Q\n\x08pictures\x18\x05 \x01(\x0b\x32\x1c.desmos.profiles.v2.PicturesB\x17\xc8\xde\x1f\x00\xf2\xde\x1f\x0fyaml:\"pictures\"R\x08pictures\x12\x61\n\rcreation_date\x18\x06 \x01(\x0b\x32\x1a.google.protobuf.TimestampB \xc8\xde\x1f\x00\xf2\xde\x1f\x14yaml:\"creation_date\"\x90\xdf\x1f\x01R\x0c\x63reationDate:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"j\n\x08Pictures\x12,\n\x07profile\x18\x01 \x01(\tB\x12\xf2\xde\x1f\x0eyaml:\"profile\"R\x07profile\x12&\n\x05\x63over\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"cover\"R\x05\x63over:\x08\x98\xa0\x1f\x01\xe8\xa0\x1f\x01\x42\xd3\x01\n\x16\x63om.desmos.profiles.v2B\x12ModelsProfileProtoP\x01Z;github.com/desmos-labs/desmos/v5/x/profiles/legacy/v5/types\xa2\x02\x03\x44PX\xaa\x02\x12\x44\x65smos.Profiles.V2\xca\x02\x12\x44\x65smos\\Profiles\\V2\xe2\x02\x1e\x44\x65smos\\Profiles\\V2\\GPBMetadata\xea\x02\x14\x44\x65smos::Profiles::V2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'desmos.profiles.v2.models_profile_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.desmos.profiles.v2B\022ModelsProfileProtoP\001Z;github.com/desmos-labs/desmos/v5/x/profiles/legacy/v5/types\242\002\003DPX\252\002\022Desmos.Profiles.V2\312\002\022Desmos\\Profiles\\V2\342\002\036Desmos\\Profiles\\V2\\GPBMetadata\352\002\024Desmos::Profiles::V2'
  _PROFILE.fields_by_name['account']._options = None
  _PROFILE.fields_by_name['account']._serialized_options = b'\312\264-\034cosmos.auth.v1beta1.AccountI'
  _PROFILE.fields_by_name['dtag']._options = None
  _PROFILE.fields_by_name['dtag']._serialized_options = b'\342\336\037\004DTag\362\336\037\013yaml:\"dtag\"'
  _PROFILE.fields_by_name['nickname']._options = None
  _PROFILE.fields_by_name['nickname']._serialized_options = b'\362\336\037\017yaml:\"nickname\"'
  _PROFILE.fields_by_name['bio']._options = None
  _PROFILE.fields_by_name['bio']._serialized_options = b'\362\336\037\nyaml:\"bio\"'
  _PROFILE.fields_by_name['pictures']._options = None
  _PROFILE.fields_by_name['pictures']._serialized_options = b'\310\336\037\000\362\336\037\017yaml:\"pictures\"'
  _PROFILE.fields_by_name['creation_date']._options = None
  _PROFILE.fields_by_name['creation_date']._serialized_options = b'\310\336\037\000\362\336\037\024yaml:\"creation_date\"\220\337\037\001'
  _PROFILE._options = None
  _PROFILE._serialized_options = b'\210\240\037\000\230\240\037\000'
  _PICTURES.fields_by_name['profile']._options = None
  _PICTURES.fields_by_name['profile']._serialized_options = b'\362\336\037\016yaml:\"profile\"'
  _PICTURES.fields_by_name['cover']._options = None
  _PICTURES.fields_by_name['cover']._serialized_options = b'\362\336\037\014yaml:\"cover\"'
  _PICTURES._options = None
  _PICTURES._serialized_options = b'\230\240\037\001\350\240\037\001'
  _globals['_PROFILE']._serialized_start=173
  _globals['_PROFILE']._serialized_end=584
  _globals['_PICTURES']._serialized_start=586
  _globals['_PICTURES']._serialized_end=692
# @@protoc_insertion_point(module_scope)
