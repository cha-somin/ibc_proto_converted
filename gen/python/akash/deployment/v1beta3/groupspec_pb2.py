# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/deployment/v1beta3/groupspec.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.base.v1beta3 import attribute_pb2 as akash_dot_base_dot_v1beta3_dot_attribute__pb2
from akash.deployment.v1beta3 import resource_pb2 as akash_dot_deployment_dot_v1beta3_dot_resource__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n(akash/deployment/v1beta3/groupspec.proto\x12\x18\x61kash.deployment.v1beta3\x1a\x14gogoproto/gogo.proto\x1a\"akash/base/v1beta3/attribute.proto\x1a\'akash/deployment/v1beta3/resource.proto\"\xa7\x02\n\tGroupSpec\x12+\n\x04name\x18\x01 \x01(\tB\x17\xea\xde\x1f\x04name\xf2\xde\x1f\x0byaml:\"name\"R\x04name\x12z\n\x0crequirements\x18\x02 \x01(\x0b\x32).akash.base.v1beta3.PlacementRequirementsB+\xc8\xde\x1f\x00\xea\xde\x1f\x0crequirements\xf2\xde\x1f\x13yaml:\"requirements\"R\x0crequirements\x12g\n\tresources\x18\x03 \x03(\x0b\x32\".akash.deployment.v1beta3.ResourceB%\xc8\xde\x1f\x00\xea\xde\x1f\tresources\xf2\xde\x1f\x10yaml:\"resources\"R\tresources:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x42\xef\x01\n\x1c\x63om.akash.deployment.v1beta3B\x0eGroupspecProtoP\x01Z=github.com/akash-network/akash-api/go/node/deployment/v1beta3\xa2\x02\x03\x41\x44X\xaa\x02\x18\x41kash.Deployment.V1beta3\xca\x02\x18\x41kash\\Deployment\\V1beta3\xe2\x02$Akash\\Deployment\\V1beta3\\GPBMetadata\xea\x02\x1a\x41kash::Deployment::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.deployment.v1beta3.groupspec_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.akash.deployment.v1beta3B\016GroupspecProtoP\001Z=github.com/akash-network/akash-api/go/node/deployment/v1beta3\242\002\003ADX\252\002\030Akash.Deployment.V1beta3\312\002\030Akash\\Deployment\\V1beta3\342\002$Akash\\Deployment\\V1beta3\\GPBMetadata\352\002\032Akash::Deployment::V1beta3'
  _GROUPSPEC.fields_by_name['name']._options = None
  _GROUPSPEC.fields_by_name['name']._serialized_options = b'\352\336\037\004name\362\336\037\013yaml:\"name\"'
  _GROUPSPEC.fields_by_name['requirements']._options = None
  _GROUPSPEC.fields_by_name['requirements']._serialized_options = b'\310\336\037\000\352\336\037\014requirements\362\336\037\023yaml:\"requirements\"'
  _GROUPSPEC.fields_by_name['resources']._options = None
  _GROUPSPEC.fields_by_name['resources']._serialized_options = b'\310\336\037\000\352\336\037\tresources\362\336\037\020yaml:\"resources\"'
  _GROUPSPEC._options = None
  _GROUPSPEC._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_GROUPSPEC']._serialized_start=170
  _globals['_GROUPSPEC']._serialized_end=465
# @@protoc_insertion_point(module_scope)
