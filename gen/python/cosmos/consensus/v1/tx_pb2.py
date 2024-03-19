# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/consensus/v1/tx.proto
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
from tendermint.types import params_pb2 as tendermint_dot_types_dot_params__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1c\x63osmos/consensus/v1/tx.proto\x12\x13\x63osmos.consensus.v1\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x1dtendermint/types/params.proto\"\x8d\x02\n\x0fMsgUpdateParams\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x33\n\x05\x62lock\x18\x02 \x01(\x0b\x32\x1d.tendermint.types.BlockParamsR\x05\x62lock\x12<\n\x08\x65vidence\x18\x03 \x01(\x0b\x32 .tendermint.types.EvidenceParamsR\x08\x65vidence\x12?\n\tvalidator\x18\x04 \x01(\x0b\x32!.tendermint.types.ValidatorParamsR\tvalidator:\x0e\x82\xe7\xb0*\tauthority\"\x19\n\x17MsgUpdateParamsResponse2i\n\x03Msg\x12\x62\n\x0cUpdateParams\x12$.cosmos.consensus.v1.MsgUpdateParams\x1a,.cosmos.consensus.v1.MsgUpdateParamsResponseB\xbe\x01\n\x17\x63om.cosmos.consensus.v1B\x07TxProtoZ.github.com/cosmos/cosmos-sdk/x/consensus/types\xa2\x02\x03\x43\x43X\xaa\x02\x13\x43osmos.Consensus.V1\xca\x02\x13\x43osmos\\Consensus\\V1\xe2\x02\x1f\x43osmos\\Consensus\\V1\\GPBMetadata\xea\x02\x15\x43osmos::Consensus::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.consensus.v1.tx_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.cosmos.consensus.v1B\007TxProtoZ.github.com/cosmos/cosmos-sdk/x/consensus/types\242\002\003CCX\252\002\023Cosmos.Consensus.V1\312\002\023Cosmos\\Consensus\\V1\342\002\037Cosmos\\Consensus\\V1\\GPBMetadata\352\002\025Cosmos::Consensus::V1'
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._loaded_options = None
  _globals['_MSGUPDATEPARAMS'].fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_MSGUPDATEPARAMS']._loaded_options = None
  _globals['_MSGUPDATEPARAMS']._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSGUPDATEPARAMS']._serialized_start=137
  _globals['_MSGUPDATEPARAMS']._serialized_end=406
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=408
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=433
  _globals['_MSG']._serialized_start=435
  _globals['_MSG']._serialized_end=540
# @@protoc_insertion_point(module_scope)
