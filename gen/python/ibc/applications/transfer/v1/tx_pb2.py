# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: ibc/applications/transfer/v1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from ibc.core.client.v1 import client_pb2 as ibc_dot_core_dot_client_dot_v1_dot_client__pb2
from ibc.applications.transfer.v1 import transfer_pb2 as ibc_dot_applications_dot_transfer_dot_v1_dot_transfer__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%ibc/applications/transfer/v1/tx.proto\x12\x1cibc.applications.transfer.v1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x1fibc/core/client/v1/client.proto\x1a+ibc/applications/transfer/v1/transfer.proto\"\xdf\x02\n\x0bMsgTransfer\x12\x1f\n\x0bsource_port\x18\x01 \x01(\tR\nsourcePort\x12%\n\x0esource_channel\x18\x02 \x01(\tR\rsourceChannel\x12\x35\n\x05token\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x05token\x12\x16\n\x06sender\x18\x04 \x01(\tR\x06sender\x12\x1a\n\x08receiver\x18\x05 \x01(\tR\x08receiver\x12G\n\x0etimeout_height\x18\x06 \x01(\x0b\x32\x1a.ibc.core.client.v1.HeightB\x04\xc8\xde\x1f\x00R\rtimeoutHeight\x12+\n\x11timeout_timestamp\x18\x07 \x01(\x04R\x10timeoutTimestamp\x12\x12\n\x04memo\x18\x08 \x01(\tR\x04memo:\x13\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x06sender\"1\n\x13MsgTransferResponse\x12\x1a\n\x08sequence\x18\x01 \x01(\x04R\x08sequence\"\x83\x01\n\x0fMsgUpdateParams\x12\x1c\n\tauthority\x18\x01 \x01(\tR\tauthority\x12\x42\n\x06params\x18\x02 \x01(\x0b\x32$.ibc.applications.transfer.v1.ParamsB\x04\xc8\xde\x1f\x00R\x06params:\x0e\x82\xe7\xb0*\tauthority\"\x19\n\x17MsgUpdateParamsResponse2\xe5\x01\n\x03Msg\x12h\n\x08Transfer\x12).ibc.applications.transfer.v1.MsgTransfer\x1a\x31.ibc.applications.transfer.v1.MsgTransferResponse\x12t\n\x0cUpdateParams\x12-.ibc.applications.transfer.v1.MsgUpdateParams\x1a\x35.ibc.applications.transfer.v1.MsgUpdateParamsResponseB\xf7\x01\n com.ibc.applications.transfer.v1B\x07TxProtoP\x01Z7github.com/cosmos/ibc-go/v7/modules/apps/transfer/types\xa2\x02\x03IAT\xaa\x02\x1cIbc.Applications.Transfer.V1\xca\x02\x1cIbc\\Applications\\Transfer\\V1\xe2\x02(Ibc\\Applications\\Transfer\\V1\\GPBMetadata\xea\x02\x1fIbc::Applications::Transfer::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'ibc.applications.transfer.v1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n com.ibc.applications.transfer.v1B\007TxProtoP\001Z7github.com/cosmos/ibc-go/v7/modules/apps/transfer/types\242\002\003IAT\252\002\034Ibc.Applications.Transfer.V1\312\002\034Ibc\\Applications\\Transfer\\V1\342\002(Ibc\\Applications\\Transfer\\V1\\GPBMetadata\352\002\037Ibc::Applications::Transfer::V1'
  _MSGTRANSFER.fields_by_name['token']._options = None
  _MSGTRANSFER.fields_by_name['token']._serialized_options = b'\310\336\037\000'
  _MSGTRANSFER.fields_by_name['timeout_height']._options = None
  _MSGTRANSFER.fields_by_name['timeout_height']._serialized_options = b'\310\336\037\000'
  _MSGTRANSFER._options = None
  _MSGTRANSFER._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\006sender'
  _MSGUPDATEPARAMS.fields_by_name['params']._options = None
  _MSGUPDATEPARAMS.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _MSGUPDATEPARAMS._options = None
  _MSGUPDATEPARAMS._serialized_options = b'\202\347\260*\tauthority'
  _globals['_MSGTRANSFER']._serialized_start=229
  _globals['_MSGTRANSFER']._serialized_end=580
  _globals['_MSGTRANSFERRESPONSE']._serialized_start=582
  _globals['_MSGTRANSFERRESPONSE']._serialized_end=631
  _globals['_MSGUPDATEPARAMS']._serialized_start=634
  _globals['_MSGUPDATEPARAMS']._serialized_end=765
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_start=767
  _globals['_MSGUPDATEPARAMSRESPONSE']._serialized_end=792
  _globals['_MSG']._serialized_start=795
  _globals['_MSG']._serialized_end=1024
# @@protoc_insertion_point(module_scope)
