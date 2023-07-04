# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ibc/core/client/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from ibc.core.client.v1 import client_pb2 as ibc_dot_core_dot_client_dot_v1_dot_client__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1bibc/core/client/v1/tx.proto\x12\x12ibc.core.client.v1\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\x1a\x1fibc/core/client/v1/client.proto\"\xb6\x01\n\x0fMsgCreateClient\x12\x37\n\x0c\x63lient_state\x18\x01 \x01(\x0b\x32\x14.google.protobuf.AnyR\x0b\x63lientState\x12=\n\x0f\x63onsensus_state\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyR\x0e\x63onsensusState\x12\x16\n\x06signer\x18\x03 \x01(\tR\x06signer:\x13\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06signer\"\x19\n\x17MsgCreateClientResponse\"\x98\x01\n\x0fMsgUpdateClient\x12\x1b\n\tclient_id\x18\x01 \x01(\tR\x08\x63lientId\x12;\n\x0e\x63lient_message\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyR\rclientMessage\x12\x16\n\x06signer\x18\x03 \x01(\tR\x06signer:\x13\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06signer\"\x19\n\x17MsgUpdateClientResponse\"\xc9\x02\n\x10MsgUpgradeClient\x12\x1b\n\tclient_id\x18\x01 \x01(\tR\x08\x63lientId\x12\x37\n\x0c\x63lient_state\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyR\x0b\x63lientState\x12=\n\x0f\x63onsensus_state\x18\x03 \x01(\x0b\x32\x14.google.protobuf.AnyR\x0e\x63onsensusState\x12\x30\n\x14proof_upgrade_client\x18\x04 \x01(\x0cR\x12proofUpgradeClient\x12\x41\n\x1dproof_upgrade_consensus_state\x18\x05 \x01(\x0cR\x1aproofUpgradeConsensusState\x12\x16\n\x06signer\x18\x06 \x01(\tR\x06signer:\x13\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06signer\"\x1a\n\x18MsgUpgradeClientResponse\"\xa7\x01\n\x15MsgSubmitMisbehaviour\x12\x1f\n\tclient_id\x18\x01 \x01(\tB\x02\x18\x01R\x08\x63lientId\x12<\n\x0cmisbehaviour\x18\x02 \x01(\x0b\x32\x14.google.protobuf.AnyB\x02\x18\x01R\x0cmisbehaviour\x12\x1a\n\x06signer\x18\x03 \x01(\tB\x02\x18\x01R\x06signer:\x13\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06signer\"\x1f\n\x1dMsgSubmitMisbehaviourResponse\"y\n\x0fMsgUpdateParams\x12\x1c\n\tauthority\x18\x01 \x01(\tR\tauthority\x12\x38\n\x06params\x18\x02 \x01(\x0b\x32\x1a.ibc.core.client.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params:\x0e\x82\xe7\xb0*\tauthority\"\x19\n\x17MsgUpdateParamsResponse2\x8a\x04\n\x03Msg\x12`\n\x0c\x43reateClient\x12#.ibc.core.client.v1.MsgCreateClient\x1a+.ibc.core.client.v1.MsgCreateClientResponse\x12`\n\x0cUpdateClient\x12#.ibc.core.client.v1.MsgUpdateClient\x1a+.ibc.core.client.v1.MsgUpdateClientResponse\x12\x63\n\rUpgradeClient\x12$.ibc.core.client.v1.MsgUpgradeClient\x1a,.ibc.core.client.v1.MsgUpgradeClientResponse\x12r\n\x12SubmitMisbehaviour\x12).ibc.core.client.v1.MsgSubmitMisbehaviour\x1a\x31.ibc.core.client.v1.MsgSubmitMisbehaviourResponse\x12\x66\n\x12UpdateClientParams\x12#.ibc.core.client.v1.MsgUpdateParams\x1a+.ibc.core.client.v1.MsgUpdateParamsResponseB\xc6\x01\n\x16\x63om.ibc.core.client.v1B\x07TxProtoP\x01Z8github.com/cosmos/ibc-go/v7/modules/core/02-client/types\xa2\x02\x03ICC\xaa\x02\x12Ibc.Core.Client.V1\xca\x02\x12Ibc\\Core\\Client\\V1\xe2\x02\x1eIbc\\Core\\Client\\V1\\GPBMetadata\xea\x02\x15Ibc::Core::Client::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ibc.core.client.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\026com.ibc.core.client.v1B\007TxProtoP\001Z8github.com/cosmos/ibc-go/v7/modules/core/02-client/types\242\002\003ICC\252\002\022Ibc.Core.Client.V1\312\002\022Ibc\\Core\\Client\\V1\342\002\036Ibc\\Core\\Client\\V1\\GPBMetadata\352\002\025Ibc::Core::Client::V1'
  _MSGCREATECLIENT._options = None
  _MSGCREATECLIENT._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006signer'
  _MSGUPDATECLIENT._options = None
  _MSGUPDATECLIENT._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006signer'
  _MSGUPGRADECLIENT._options = None
  _MSGUPGRADECLIENT._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006signer'
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['client_id']._options = None
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['client_id']._serialized_options = b'\030\001'
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['misbehaviour']._options = None
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['misbehaviour']._serialized_options = b'\030\001'
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['signer']._options = None
  _MSGSUBMITMISBEHAVIOUR.fields_by_name['signer']._serialized_options = b'\030\001'
  _MSGSUBMITMISBEHAVIOUR._options = None
  _MSGSUBMITMISBEHAVIOUR._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006signer'
  _MSGUPDATEPARAMS.fields_by_name['params']._options = None
  _MSGUPDATEPARAMS.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _MSGUPDATEPARAMS._options = None
  _MSGUPDATEPARAMS._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSGCREATECLIENT']._serialized_start=159
  _globals['_MSGCREATECLIENT']._serialized_end=341
  _globals['_MSGCREATECLIENTRESPONSE']._serialized_start=343
  _globals['_MSGCREATECLIENTRESPONSE']._serialized_end=368
  _globals['_MSGUPDATECLIENT']._serialized_start=371
  _globals['_MSGUPDATECLIENT']._serialized_end=523
  _globals['_MSGUPDATECLIENTRESPONSE']._serialized_start=525
  _globals['_MSGUPDATECLIENTRESPONSE']._serialized_end=550
  _globals['_MSGUPGRADECLIENT']._serialized_start=553
  _globals['_MSGUPGRADECLIENT']._serialized_end=882
  _globals['_MSGUPGRADECLIENTRESPONSE']._serialized_start=884
  _globals['_MSGUPGRADECLIENTRESPONSE']._serialized_end=910
  _globals['_MSGSUBMITMISBEHAVIOUR']._serialized_start=913
  _globals['_MSGSUBMITMISBEHAVIOUR']._serialized_end=1080
  _globals['_MSGSUBMITMISBEHAVIOURRESPONSE']._serialized_start=1082
  _globals['_MSGSUBMITMISBEHAVIOURRESPONSE']._serialized_end=1113
  _globals['_MSGUPDATEPARAMS']._serialized_start=1115
  _globals['_MSGUPDATEPARAMS']._serialized_end=1236
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=1238
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=1263
  _globals['_MSG']._serialized_start=1266
  _globals['_MSG']._serialized_end=1788
# @@protoc_insertion_point(module_scope)