# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: axelar/utils/v1beta1/queuer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!axelar/utils/v1beta1/queuer.proto\x12\x14\x61xelar.utils.v1beta1\x1a\x14gogoproto/gogo.proto\"\xec\x01\n\nQueueState\x12G\n\x05items\x18\x01 \x03(\x0b\x32+.axelar.utils.v1beta1.QueueState.ItemsEntryB\x04\xc8\xde\x1f\x00R\x05items\x1a.\n\x04Item\x12\x10\n\x03key\x18\x01 \x01(\x0cR\x03key\x12\x14\n\x05value\x18\x02 \x01(\x0cR\x05value\x1a_\n\nItemsEntry\x12\x10\n\x03key\x18\x01 \x01(\tR\x03key\x12;\n\x05value\x18\x02 \x01(\x0b\x32%.axelar.utils.v1beta1.QueueState.ItemR\x05value:\x02\x38\x01:\x04\x98\xa1\x1f\x01\x42\xc9\x01\n\x18\x63om.axelar.utils.v1beta1B\x0bQueuerProtoP\x01Z*github.com/axelarnetwork/axelar-core/utils\xa2\x02\x03\x41UX\xaa\x02\x14\x41xelar.Utils.V1beta1\xca\x02\x14\x41xelar\\Utils\\V1beta1\xe2\x02 Axelar\\Utils\\V1beta1\\GPBMetadata\xea\x02\x16\x41xelar::Utils::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'axelar.utils.v1beta1.queuer_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.axelar.utils.v1beta1B\013QueuerProtoP\001Z*github.com/axelarnetwork/axelar-core/utils\242\002\003AUX\252\002\024Axelar.Utils.V1beta1\312\002\024Axelar\\Utils\\V1beta1\342\002 Axelar\\Utils\\V1beta1\\GPBMetadata\352\002\026Axelar::Utils::V1beta1\310\341\036\000'
  _QUEUESTATE_ITEMSENTRY._options = None
  _QUEUESTATE_ITEMSENTRY._serialized_options = b'8\001'
  _QUEUESTATE.fields_by_name['items']._options = None
  _QUEUESTATE.fields_by_name['items']._serialized_options = b'\310\336\037\000'
  _QUEUESTATE._options = None
  _QUEUESTATE._serialized_options = b'\230\241\037\001'
  _globals['_QUEUESTATE']._serialized_start=82
  _globals['_QUEUESTATE']._serialized_end=318
  _globals['_QUEUESTATE_ITEM']._serialized_start=169
  _globals['_QUEUESTATE_ITEM']._serialized_end=215
  _globals['_QUEUESTATE_ITEMSENTRY']._serialized_start=217
  _globals['_QUEUESTATE_ITEMSENTRY']._serialized_end=312
# @@protoc_insertion_point(module_scope)
