# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: provenance/msgfees/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1eprovenance/msgfees/v1/tx.proto\x12\x15provenance.msgfees.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xe1\x01\n\x1cMsgAssessCustomMsgFeeRequest\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\x12\x1c\n\trecipient\x18\x03 \x01(\tR\trecipient\x12\x12\n\x04\x66rom\x18\x04 \x01(\tR\x04\x66rom\x12\x34\n\x16recipient_basis_points\x18\x05 \x01(\tR\x14recipientBasisPoints:\x0c\x88\xa0\x1f\x00\x98\xa0\x1f\x01\xe8\xa0\x1f\x00\"\x1f\n\x1dMsgAssessCustomMsgFeeResponse2\x86\x01\n\x03Msg\x12\x7f\n\x12\x41ssessCustomMsgFee\x12\x33.provenance.msgfees.v1.MsgAssessCustomMsgFeeRequest\x1a\x34.provenance.msgfees.v1.MsgAssessCustomMsgFeeResponseB\xcf\x01\n\x19\x63om.provenance.msgfees.v1B\x07TxProtoP\x01Z3github.com/provenance-io/provenance/x/msgfees/types\xa2\x02\x03PMX\xaa\x02\x15Provenance.Msgfees.V1\xca\x02\x15Provenance\\Msgfees\\V1\xe2\x02!Provenance\\Msgfees\\V1\\GPBMetadata\xea\x02\x17Provenance::Msgfees::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'provenance.msgfees.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\031com.provenance.msgfees.v1B\007TxProtoP\001Z3github.com/provenance-io/provenance/x/msgfees/types\242\002\003PMX\252\002\025Provenance.Msgfees.V1\312\002\025Provenance\\Msgfees\\V1\342\002!Provenance\\Msgfees\\V1\\GPBMetadata\352\002\027Provenance::Msgfees::V1'
  _MSGASSESSCUSTOMMSGFEEREQUEST.fields_by_name['amount']._options = None
  _MSGASSESSCUSTOMMSGFEEREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGASSESSCUSTOMMSGFEEREQUEST._options = None
  _MSGASSESSCUSTOMMSGFEEREQUEST._serialized_options = b'\210\240\037\000\230\240\037\001\350\240\037\000'
  _globals['_MSGASSESSCUSTOMMSGFEEREQUEST']._serialized_start=112
  _globals['_MSGASSESSCUSTOMMSGFEEREQUEST']._serialized_end=337
  _globals['_MSGASSESSCUSTOMMSGFEERESPONSE']._serialized_start=339
  _globals['_MSGASSESSCUSTOMMSGFEERESPONSE']._serialized_end=370
  _globals['_MSG']._serialized_start=373
  _globals['_MSG']._serialized_end=507
# @@protoc_insertion_point(module_scope)