# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: akash/base/v1beta3/cpu.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from akash.base.v1beta3 import attribute_pb2 as akash_dot_base_dot_v1beta3_dot_attribute__pb2
from akash.base.v1beta3 import resourcevalue_pb2 as akash_dot_base_dot_v1beta3_dot_resourcevalue__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x61kash/base/v1beta3/cpu.proto\x12\x12\x61kash.base.v1beta3\x1a\x14gogoproto/gogo.proto\x1a\"akash/base/v1beta3/attribute.proto\x1a&akash/base/v1beta3/resourcevalue.proto\"\xd5\x01\n\x03\x43PU\x12=\n\x05units\x18\x01 \x01(\x0b\x32!.akash.base.v1beta3.ResourceValueB\x04\xc8\xde\x1f\x00R\x05units\x12\x88\x01\n\nattributes\x18\x02 \x03(\x0b\x32\x1d.akash.base.v1beta3.AttributeBI\xc8\xde\x1f\x00\xea\xde\x1f\x14\x61ttributes,omitempty\xf2\xde\x1f\x1byaml:\"attributes,omitempty\"\xaa\xdf\x1f\nAttributesR\nattributes:\x04\xe8\xa0\x1f\x01\x42\xc6\x01\n\x16\x63om.akash.base.v1beta3B\x08\x43puProtoP\x01Z8github.com/akash-network/akash-api/go/node/types/v1beta3\xa2\x02\x03\x41\x42X\xaa\x02\x12\x41kash.Base.V1beta3\xca\x02\x12\x41kash\\Base\\V1beta3\xe2\x02\x1e\x41kash\\Base\\V1beta3\\GPBMetadata\xea\x02\x14\x41kash::Base::V1beta3b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'akash.base.v1beta3.cpu_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.akash.base.v1beta3B\010CpuProtoP\001Z8github.com/akash-network/akash-api/go/node/types/v1beta3\242\002\003ABX\252\002\022Akash.Base.V1beta3\312\002\022Akash\\Base\\V1beta3\342\002\036Akash\\Base\\V1beta3\\GPBMetadata\352\002\024Akash::Base::V1beta3'
  _CPU.fields_by_name['units']._options = None
  _CPU.fields_by_name['units']._serialized_options = b'\310\336\037\000'
  _CPU.fields_by_name['attributes']._options = None
  _CPU.fields_by_name['attributes']._serialized_options = b'\310\336\037\000\352\336\037\024attributes,omitempty\362\336\037\033yaml:\"attributes,omitempty\"\252\337\037\nAttributes'
  _CPU._options = None
  _CPU._serialized_options = b'\350\240\037\001'
  _globals['_CPU']._serialized_start=151
  _globals['_CPU']._serialized_end=364
# @@protoc_insertion_point(module_scope)
