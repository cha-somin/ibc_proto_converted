# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: stafihub/relayers/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1astafihub/relayers/tx.proto\x12\x1astafihub.stafihub.relayers\x1a\x14gogoproto/gogo.proto\"s\n\rMsgAddRelayer\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x61rena\x18\x02 \x01(\tR\x05\x61rena\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1c\n\taddresses\x18\x04 \x03(\tR\taddresses\"\x17\n\x15MsgAddRelayerResponse\"r\n\x10MsgDeleteRelayer\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x61rena\x18\x02 \x01(\tR\x05\x61rena\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x18\n\x07\x61\x64\x64ress\x18\x04 \x01(\tR\x07\x61\x64\x64ress\"\x1a\n\x18MsgDeleteRelayerResponse\"x\n\x0fMsgSetThreshold\x12\x18\n\x07\x63reator\x18\x01 \x01(\tR\x07\x63reator\x12\x14\n\x05\x61rena\x18\x02 \x01(\tR\x05\x61rena\x12\x14\n\x05\x64\x65nom\x18\x03 \x01(\tR\x05\x64\x65nom\x12\x1f\n\x05value\x18\x04 \x01(\rB\t\xea\xde\x1f\x05valueR\x05value\"\x19\n\x17MsgSetThresholdResponse2\xd8\x02\n\x03Msg\x12j\n\nAddRelayer\x12).stafihub.stafihub.relayers.MsgAddRelayer\x1a\x31.stafihub.stafihub.relayers.MsgAddRelayerResponse\x12s\n\rDeleteRelayer\x12,.stafihub.stafihub.relayers.MsgDeleteRelayer\x1a\x34.stafihub.stafihub.relayers.MsgDeleteRelayerResponse\x12p\n\x0cSetThreshold\x12+.stafihub.stafihub.relayers.MsgSetThreshold\x1a\x33.stafihub.stafihub.relayers.MsgSetThresholdResponseB\xe2\x01\n\x1e\x63om.stafihub.stafihub.relayersB\x07TxProtoP\x01Z-github.com/stafihub/stafihub/x/relayers/types\xa2\x02\x03SSR\xaa\x02\x1aStafihub.Stafihub.Relayers\xca\x02\x1aStafihub\\Stafihub\\Relayers\xe2\x02&Stafihub\\Stafihub\\Relayers\\GPBMetadata\xea\x02\x1cStafihub::Stafihub::Relayersb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'stafihub.relayers.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\036com.stafihub.stafihub.relayersB\007TxProtoP\001Z-github.com/stafihub/stafihub/x/relayers/types\242\002\003SSR\252\002\032Stafihub.Stafihub.Relayers\312\002\032Stafihub\\Stafihub\\Relayers\342\002&Stafihub\\Stafihub\\Relayers\\GPBMetadata\352\002\034Stafihub::Stafihub::Relayers'
  _MSGSETTHRESHOLD.fields_by_name['value']._options = None
  _MSGSETTHRESHOLD.fields_by_name['value']._serialized_options = b'\352\336\037\005value'
  _globals['_MSGADDRELAYER']._serialized_start=80
  _globals['_MSGADDRELAYER']._serialized_end=195
  _globals['_MSGADDRELAYERRESPONSE']._serialized_start=197
  _globals['_MSGADDRELAYERRESPONSE']._serialized_end=220
  _globals['_MSGDELETERELAYER']._serialized_start=222
  _globals['_MSGDELETERELAYER']._serialized_end=336
  _globals['_MSGDELETERELAYERRESPONSE']._serialized_start=338
  _globals['_MSGDELETERELAYERRESPONSE']._serialized_end=364
  _globals['_MSGSETTHRESHOLD']._serialized_start=366
  _globals['_MSGSETTHRESHOLD']._serialized_end=486
  _globals['_MSGSETTHRESHOLDRESPONSE']._serialized_start=488
  _globals['_MSGSETTHRESHOLDRESPONSE']._serialized_end=513
  _globals['_MSG']._serialized_start=516
  _globals['_MSG']._serialized_end=860
# @@protoc_insertion_point(module_scope)
