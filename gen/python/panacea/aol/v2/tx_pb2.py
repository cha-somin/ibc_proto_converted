# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/aol/v2/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17panacea/aol/v2/tx.proto\x12\x0epanacea.aol.v2\"v\n\x0eMsgCreateTopic\x12\x1d\n\ntopic_name\x18\x01 \x01(\tR\ttopicName\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12#\n\rowner_address\x18\x03 \x01(\tR\x0cownerAddress\"\x18\n\x16MsgCreateTopicResponse\"\xb5\x01\n\x0cMsgAddWriter\x12\x1d\n\ntopic_name\x18\x01 \x01(\tR\ttopicName\x12\x18\n\x07moniker\x18\x02 \x01(\tR\x07moniker\x12 \n\x0b\x64\x65scription\x18\x03 \x01(\tR\x0b\x64\x65scription\x12%\n\x0ewriter_address\x18\x04 \x01(\tR\rwriterAddress\x12#\n\rowner_address\x18\x05 \x01(\tR\x0cownerAddress\"\x16\n\x14MsgAddWriterResponse\"|\n\x0fMsgDeleteWriter\x12\x1d\n\ntopic_name\x18\x01 \x01(\tR\ttopicName\x12%\n\x0ewriter_address\x18\x02 \x01(\tR\rwriterAddress\x12#\n\rowner_address\x18\x03 \x01(\tR\x0cownerAddress\"\x19\n\x17MsgDeleteWriterResponse\"\xcd\x01\n\x0cMsgAddRecord\x12\x1d\n\ntopic_name\x18\x01 \x01(\tR\ttopicName\x12\x10\n\x03key\x18\x02 \x01(\x0cR\x03key\x12\x14\n\x05value\x18\x03 \x01(\x0cR\x05value\x12%\n\x0ewriter_address\x18\x04 \x01(\tR\rwriterAddress\x12#\n\rowner_address\x18\x05 \x01(\tR\x0cownerAddress\x12*\n\x11\x66\x65\x65_payer_address\x18\x06 \x01(\tR\x0f\x66\x65\x65PayerAddress\"r\n\x14MsgAddRecordResponse\x12#\n\rowner_address\x18\x01 \x01(\tR\x0cownerAddress\x12\x1d\n\ntopic_name\x18\x02 \x01(\tR\ttopicName\x12\x16\n\x06offset\x18\x03 \x01(\x04R\x06offset2\xd8\x02\n\x03Msg\x12U\n\x0b\x43reateTopic\x12\x1e.panacea.aol.v2.MsgCreateTopic\x1a&.panacea.aol.v2.MsgCreateTopicResponse\x12O\n\tAddWriter\x12\x1c.panacea.aol.v2.MsgAddWriter\x1a$.panacea.aol.v2.MsgAddWriterResponse\x12X\n\x0c\x44\x65leteWriter\x12\x1f.panacea.aol.v2.MsgDeleteWriter\x1a\'.panacea.aol.v2.MsgDeleteWriterResponse\x12O\n\tAddRecord\x12\x1c.panacea.aol.v2.MsgAddRecord\x1a$.panacea.aol.v2.MsgAddRecordResponseB\xa8\x01\n\x12\x63om.panacea.aol.v2B\x07TxProtoP\x01Z/github.com/medibloc/panacea-core/v2/x/aol/types\xa2\x02\x03PAX\xaa\x02\x0ePanacea.Aol.V2\xca\x02\x0ePanacea\\Aol\\V2\xe2\x02\x1aPanacea\\Aol\\V2\\GPBMetadata\xea\x02\x10Panacea::Aol::V2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.aol.v2.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.panacea.aol.v2B\007TxProtoP\001Z/github.com/medibloc/panacea-core/v2/x/aol/types\242\002\003PAX\252\002\016Panacea.Aol.V2\312\002\016Panacea\\Aol\\V2\342\002\032Panacea\\Aol\\V2\\GPBMetadata\352\002\020Panacea::Aol::V2'
  _globals['_MSGCREATETOPIC']._serialized_start=43
  _globals['_MSGCREATETOPIC']._serialized_end=161
  _globals['_MSGCREATETOPICRESPONSE']._serialized_start=163
  _globals['_MSGCREATETOPICRESPONSE']._serialized_end=187
  _globals['_MSGADDWRITER']._serialized_start=190
  _globals['_MSGADDWRITER']._serialized_end=371
  _globals['_MSGADDWRITERRESPONSE']._serialized_start=373
  _globals['_MSGADDWRITERRESPONSE']._serialized_end=395
  _globals['_MSGDELETEWRITER']._serialized_start=397
  _globals['_MSGDELETEWRITER']._serialized_end=521
  _globals['_MSGDELETEWRITERRESPONSE']._serialized_start=523
  _globals['_MSGDELETEWRITERRESPONSE']._serialized_end=548
  _globals['_MSGADDRECORD']._serialized_start=551
  _globals['_MSGADDRECORD']._serialized_end=756
  _globals['_MSGADDRECORDRESPONSE']._serialized_start=758
  _globals['_MSGADDRECORDRESPONSE']._serialized_end=872
  _globals['_MSG']._serialized_start=875
  _globals['_MSG']._serialized_end=1219
# @@protoc_insertion_point(module_scope)