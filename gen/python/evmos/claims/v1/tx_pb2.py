# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/claims/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from evmos.claims.v1 import genesis_pb2 as evmos_dot_claims_dot_v1_dot_genesis__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x18\x65vmos/claims/v1/tx.proto\x12\x0f\x65vmos.claims.v1\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1d\x65vmos/claims/v1/genesis.proto\x1a\x14gogoproto/gogo.proto\"\x90\x01\n\x0fMsgUpdateParams\x12\x36\n\tauthority\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tauthority\x12\x35\n\x06params\x18\x02 \x01(\x0b\x32\x17.evmos.claims.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params:\x0e\x82\xe7\xb0*\tauthority\"\x19\n\x17MsgUpdateParamsResponse2a\n\x03Msg\x12Z\n\x0cUpdateParams\x12 .evmos.claims.v1.MsgUpdateParams\x1a(.evmos.claims.v1.MsgUpdateParamsResponseB\xa7\x01\n\x13\x63om.evmos.claims.v1B\x07TxProtoP\x01Z)github.com/evmos/evmos/v13/x/claims/types\xa2\x02\x03\x45\x43X\xaa\x02\x0f\x45vmos.Claims.V1\xca\x02\x0f\x45vmos\\Claims\\V1\xe2\x02\x1b\x45vmos\\Claims\\V1\\GPBMetadata\xea\x02\x11\x45vmos::Claims::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.claims.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\023com.evmos.claims.v1B\007TxProtoP\001Z)github.com/evmos/evmos/v13/x/claims/types\242\002\003ECX\252\002\017Evmos.Claims.V1\312\002\017Evmos\\Claims\\V1\342\002\033Evmos\\Claims\\V1\\GPBMetadata\352\002\021Evmos::Claims::V1'
  _MSGUPDATEPARAMS.fields_by_name['authority']._options = None
  _MSGUPDATEPARAMS.fields_by_name['authority']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGUPDATEPARAMS.fields_by_name['params']._options = None
  _MSGUPDATEPARAMS.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _MSGUPDATEPARAMS._options = None
  _MSGUPDATEPARAMS._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSGUPDATEPARAMS']._serialized_start=151
  _globals['_MSGUPDATEPARAMS']._serialized_end=295
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=297
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=322
  _globals['_MSG']._serialized_start=324
  _globals['_MSG']._serialized_end=421
# @@protoc_insertion_point(module_scope)