# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stargaze/cron/v1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cstargaze/cron/v1/query.proto\x12\x1epublicawesome.stargaze.cron.v1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\"\x1c\n\x1aQueryListPrivilegedRequest\"y\n\x1bQueryListPrivilegedResponse\x12Z\n\x12\x63ontract_addresses\x18\x01 \x03(\tB+\xea\xde\x1f\'privileged_contract_addresses,omitemptyR\x11\x63ontractAddresses2\xbe\x01\n\x05Query\x12\xb4\x01\n\x0eListPrivileged\x12:.publicawesome.stargaze.cron.v1.QueryListPrivilegedRequest\x1a;.publicawesome.stargaze.cron.v1.QueryListPrivilegedResponse\")\x82\xd3\xe4\x93\x02#\x12!/stargaze/cron/v1/list-privilegedB\x80\x02\n\"com.publicawesome.stargaze.cron.v1B\nQueryProtoP\x01Z3github.com/public-awesome/stargaze/v11/x/cron/types\xa2\x02\x03PSC\xaa\x02\x1ePublicawesome.Stargaze.Cron.V1\xca\x02\x1ePublicawesome\\Stargaze\\Cron\\V1\xe2\x02*Publicawesome\\Stargaze\\Cron\\V1\\GPBMetadata\xea\x02!Publicawesome::Stargaze::Cron::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stargaze.cron.v1.query_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\"com.publicawesome.stargaze.cron.v1B\nQueryProtoP\001Z3github.com/public-awesome/stargaze/v11/x/cron/types\242\002\003PSC\252\002\036Publicawesome.Stargaze.Cron.V1\312\002\036Publicawesome\\Stargaze\\Cron\\V1\342\002*Publicawesome\\Stargaze\\Cron\\V1\\GPBMetadata\352\002!Publicawesome::Stargaze::Cron::V1'
  _QUERYLISTPRIVILEGEDRESPONSE.fields_by_name['contract_addresses']._options = None
  _QUERYLISTPRIVILEGEDRESPONSE.fields_by_name['contract_addresses']._serialized_options = b'\352\336\037\'privileged_contract_addresses,omitempty'
  _QUERY.methods_by_name['ListPrivileged']._options = None
  _QUERY.methods_by_name['ListPrivileged']._serialized_options = b'\202\323\344\223\002#\022!/stargaze/cron/v1/list-privileged'
  _globals['_QUERYLISTPRIVILEGEDREQUEST']._serialized_start=116
  _globals['_QUERYLISTPRIVILEGEDREQUEST']._serialized_end=144
  _globals['_QUERYLISTPRIVILEGEDRESPONSE']._serialized_start=146
  _globals['_QUERYLISTPRIVILEGEDRESPONSE']._serialized_end=267
  _globals['_QUERY']._serialized_start=270
  _globals['_QUERY']._serialized_end=460
# @@protoc_insertion_point(module_scope)