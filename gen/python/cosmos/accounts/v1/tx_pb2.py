# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/accounts/v1/tx.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x63osmos/accounts/v1/tx.proto\x12\x12\x63osmos.accounts.v1\x1a\x17\x63osmos/msg/v1/msg.proto\"k\n\x07MsgInit\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12!\n\x0c\x61\x63\x63ount_type\x18\x02 \x01(\tR\x0b\x61\x63\x63ountType\x12\x18\n\x07message\x18\x03 \x01(\x0cR\x07message:\x0b\x82\xe7\xb0*\x06sender\"V\n\x0fMsgInitResponse\x12\'\n\x0f\x61\x63\x63ount_address\x18\x01 \x01(\tR\x0e\x61\x63\x63ountAddress\x12\x1a\n\x08response\x18\x02 \x01(\x0cR\x08response\"c\n\nMsgExecute\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x16\n\x06target\x18\x02 \x01(\tR\x06target\x12\x18\n\x07message\x18\x03 \x01(\x0cR\x07message:\x0b\x82\xe7\xb0*\x06sender\"0\n\x12MsgExecuteResponse\x12\x1a\n\x08response\x18\x01 \x01(\x0cR\x08response2\xa9\x01\n\x03Msg\x12H\n\x04Init\x12\x1b.cosmos.accounts.v1.MsgInit\x1a#.cosmos.accounts.v1.MsgInitResponse\x12Q\n\x07\x45xecute\x12\x1e.cosmos.accounts.v1.MsgExecute\x1a&.cosmos.accounts.v1.MsgExecuteResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xa5\x01\n\x16\x63om.cosmos.accounts.v1B\x07TxProtoZ\x1a\x63osmossdk.io/x/accounts/v1\xa2\x02\x03\x43\x41X\xaa\x02\x12\x43osmos.Accounts.V1\xca\x02\x12\x43osmos\\Accounts\\V1\xe2\x02\x1e\x43osmos\\Accounts\\V1\\GPBMetadata\xea\x02\x14\x43osmos::Accounts::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.accounts.v1.tx_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\026com.cosmos.accounts.v1B\007TxProtoZ\032cosmossdk.io/x/accounts/v1\242\002\003CAX\252\002\022Cosmos.Accounts.V1\312\002\022Cosmos\\Accounts\\V1\342\002\036Cosmos\\Accounts\\V1\\GPBMetadata\352\002\024Cosmos::Accounts::V1'
  _globals['_MSGINIT']._loaded_options = None
  _globals['_MSGINIT']._serialized_options = b'\202\347\260*\006sender'
  _globals['_MSGEXECUTE']._loaded_options = None
  _globals['_MSGEXECUTE']._serialized_options = b'\202\347\260*\006sender'
  _globals['_MSG']._loaded_options = None
  _globals['_MSG']._serialized_options = b'\200\347\260*\001'
  _globals['_MSGINIT']._serialized_start=76
  _globals['_MSGINIT']._serialized_end=183
  _globals['_MSGINITRESPONSE']._serialized_start=185
  _globals['_MSGINITRESPONSE']._serialized_end=271
  _globals['_MSGEXECUTE']._serialized_start=273
  _globals['_MSGEXECUTE']._serialized_end=372
  _globals['_MSGEXECUTERESPONSE']._serialized_start=374
  _globals['_MSGEXECUTERESPONSE']._serialized_end=422
  _globals['_MSG']._serialized_start=425
  _globals['_MSG']._serialized_end=594
# @@protoc_insertion_point(module_scope)