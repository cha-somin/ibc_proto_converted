# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/counter/v1/tx.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1a\x63osmos/counter/v1/tx.proto\x12\x11\x63osmos.counter.v1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x11\x61mino/amino.proto\"\x89\x01\n\x12MsgIncreaseCounter\x12\x30\n\x06signer\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x06signer\x12\x14\n\x05\x63ount\x18\x02 \x01(\x03R\x05\x63ount:+\x82\xe7\xb0*\x06signer\x8a\xe7\xb0*\x1b\x63osmos-sdk/increase_counter\"7\n\x18MsgIncreaseCountResponse\x12\x1b\n\tnew_count\x18\x01 \x01(\x03R\x08newCount2q\n\x03Msg\x12\x63\n\rIncreaseCount\x12%.cosmos.counter.v1.MsgIncreaseCounter\x1a+.cosmos.counter.v1.MsgIncreaseCountResponse\x1a\x05\x80\xe7\xb0*\x01\x42\xb2\x01\n\x15\x63om.cosmos.counter.v1B\x07TxProtoZ,github.com/cosmos/cosmos-sdk/x/counter/types\xa2\x02\x03\x43\x43X\xaa\x02\x11\x43osmos.Counter.V1\xca\x02\x11\x43osmos\\Counter\\V1\xe2\x02\x1d\x43osmos\\Counter\\V1\\GPBMetadata\xea\x02\x13\x43osmos::Counter::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.counter.v1.tx_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\025com.cosmos.counter.v1B\007TxProtoZ,github.com/cosmos/cosmos-sdk/x/counter/types\242\002\003CCX\252\002\021Cosmos.Counter.V1\312\002\021Cosmos\\Counter\\V1\342\002\035Cosmos\\Counter\\V1\\GPBMetadata\352\002\023Cosmos::Counter::V1'
  _globals['_MSGINCREASECOUNTER'].fields_by_name['signer']._loaded_options = None
  _globals['_MSGINCREASECOUNTER'].fields_by_name['signer']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGINCREASECOUNTER']._loaded_options = None
  _globals['_MSGINCREASECOUNTER']._serialized_options = b'\202\347\260*\006signer\212\347\260*\033cosmos-sdk/increase_counter'
  _globals['_MSG']._loaded_options = None
  _globals['_MSG']._serialized_options = b'\200\347\260*\001'
  _globals['_MSGINCREASECOUNTER']._serialized_start=121
  _globals['_MSGINCREASECOUNTER']._serialized_end=258
  _globals['_MSGINCREASECOUNTRESPONSE']._serialized_start=260
  _globals['_MSGINCREASECOUNTRESPONSE']._serialized_end=315
  _globals['_MSG']._serialized_start=317
  _globals['_MSG']._serialized_end=430
# @@protoc_insertion_point(module_scope)