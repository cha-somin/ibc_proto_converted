# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: iov/configuration/v1beta1/msgs.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from iov.configuration.v1beta1 import types_pb2 as iov_dot_configuration_dot_v1beta1_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$iov/configuration/v1beta1/msgs.proto\x12!starnamed.x.configuration.v1beta1\x1a\x14gogoproto/gogo.proto\x1a%iov/configuration/v1beta1/types.proto\"\xb6\x01\n\x0fMsgUpdateConfig\x12)\n\x06signer\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\x12x\n\x11new_configuration\x18\x02 \x01(\x0b\x32).starnamed.x.configuration.v1beta1.ConfigB \xc8\xde\x1f\x01\xf2\xde\x1f\x18yaml:\"new_configuration\"R\x10newConfiguration\"\x83\x01\n\rMsgUpdateFees\x12;\n\x04\x66\x65\x65s\x18\x01 \x01(\x0b\x32\'.starnamed.x.configuration.v1beta1.FeesR\x04\x66\x65\x65s\x12\x35\n\nconfigurer\x18\x02 \x01(\tB\x15\xf2\xde\x1f\x11yaml:\"configurer\"R\nconfigurerB\x8d\x02\n%com.starnamed.x.configuration.v1beta1B\tMsgsProtoP\x01Z2github.com/iov-one/starnamed/x/configuration/types\xa2\x02\x03SXC\xaa\x02!Starnamed.X.Configuration.V1beta1\xca\x02!Starnamed\\X\\Configuration\\V1beta1\xe2\x02-Starnamed\\X\\Configuration\\V1beta1\\GPBMetadata\xea\x02$Starnamed::X::Configuration::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'iov.configuration.v1beta1.msgs_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n%com.starnamed.x.configuration.v1beta1B\tMsgsProtoP\001Z2github.com/iov-one/starnamed/x/configuration/types\242\002\003SXC\252\002!Starnamed.X.Configuration.V1beta1\312\002!Starnamed\\X\\Configuration\\V1beta1\342\002-Starnamed\\X\\Configuration\\V1beta1\\GPBMetadata\352\002$Starnamed::X::Configuration::V1beta1'
  _MSGUPDATECONFIG.fields_by_name['signer']._options = None
  _MSGUPDATECONFIG.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGUPDATECONFIG.fields_by_name['new_configuration']._options = None
  _MSGUPDATECONFIG.fields_by_name['new_configuration']._serialized_options = b'\310\336\037\001\362\336\037\030yaml:\"new_configuration\"'
  _MSGUPDATEFEES.fields_by_name['configurer']._options = None
  _MSGUPDATEFEES.fields_by_name['configurer']._serialized_options = b'\362\336\037\021yaml:\"configurer\"'
  _globals['_MSGUPDATECONFIG']._serialized_start=137
  _globals['_MSGUPDATECONFIG']._serialized_end=319
  _globals['_MSGUPDATEFEES']._serialized_start=322
  _globals['_MSGUPDATEFEES']._serialized_end=453
# @@protoc_insertion_point(module_scope)
