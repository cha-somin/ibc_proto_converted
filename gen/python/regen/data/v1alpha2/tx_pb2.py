# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: regen/data/v1alpha2/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2
from regen.data.v1alpha2 import types_pb2 as regen_dot_data_dot_v1alpha2_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1cregen/data/v1alpha2/tx.proto\x12\x13regen.data.v1alpha2\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\x1a\x1fregen/data/v1alpha2/types.proto\"]\n\rMsgAnchorData\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x34\n\x04hash\x18\x02 \x01(\x0b\x32 .regen.data.v1alpha2.ContentHashR\x04hash\"c\n\x15MsgAnchorDataResponse\x12\x38\n\ttimestamp\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampR\ttimestamp\x12\x10\n\x03iri\x18\x02 \x01(\tR\x03iri\"i\n\x0bMsgSignData\x12\x18\n\x07signers\x18\x01 \x03(\tR\x07signers\x12:\n\x04hash\x18\x02 \x01(\x0b\x32&.regen.data.v1alpha2.ContentHash.GraphR\x04hash:\x04\x88\xa0\x1f\x00\"\x15\n\x13MsgSignDataResponse2\xbb\x01\n\x03Msg\x12\\\n\nAnchorData\x12\".regen.data.v1alpha2.MsgAnchorData\x1a*.regen.data.v1alpha2.MsgAnchorDataResponse\x12V\n\x08SignData\x12 .regen.data.v1alpha2.MsgSignData\x1a(.regen.data.v1alpha2.MsgSignDataResponseB\xbe\x01\n\x17\x63om.regen.data.v1alpha2B\x07TxProtoP\x01Z,github.com/regen-network/regen-ledger/x/data\xa2\x02\x03RDX\xaa\x02\x13Regen.Data.V1alpha2\xca\x02\x13Regen\\Data\\V1alpha2\xe2\x02\x1fRegen\\Data\\V1alpha2\\GPBMetadata\xea\x02\x15Regen::Data::V1alpha2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'regen.data.v1alpha2.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.regen.data.v1alpha2B\007TxProtoP\001Z,github.com/regen-network/regen-ledger/x/data\242\002\003RDX\252\002\023Regen.Data.V1alpha2\312\002\023Regen\\Data\\V1alpha2\342\002\037Regen\\Data\\V1alpha2\\GPBMetadata\352\002\025Regen::Data::V1alpha2'
  _MSGSIGNDATA._options = None
  _MSGSIGNDATA._serialized_options = b'\210\240\037\000'
  _globals['_MSGANCHORDATA']._serialized_start=141
  _globals['_MSGANCHORDATA']._serialized_end=234
  _globals['_MSGANCHORDATARESPONSE']._serialized_start=236
  _globals['_MSGANCHORDATARESPONSE']._serialized_end=335
  _globals['_MSGSIGNDATA']._serialized_start=337
  _globals['_MSGSIGNDATA']._serialized_end=442
  _globals['_MSGSIGNDATARESPONSE']._serialized_start=444
  _globals['_MSGSIGNDATARESPONSE']._serialized_end=465
  _globals['_MSG']._serialized_start=468
  _globals['_MSG']._serialized_end=655
# @@protoc_insertion_point(module_scope)