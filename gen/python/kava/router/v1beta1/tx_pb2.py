# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: kava/router/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1ckava/router/v1beta1/tx.proto\x12\x13kava.router.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x14gogoproto/gogo.proto\"\x9f\x01\n\x0eMsgMintDeposit\x12\x36\n\tdepositor\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdepositor\x12\x1c\n\tvalidator\x18\x02 \x01(\tR\tvalidator\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x18\n\x16MsgMintDepositResponse\"\xa7\x01\n\x16MsgDelegateMintDeposit\x12\x36\n\tdepositor\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\tdepositor\x12\x1c\n\tvalidator\x18\x02 \x01(\tR\tvalidator\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\" \n\x1eMsgDelegateMintDepositResponse\"\x96\x01\n\x0fMsgWithdrawBurn\x12,\n\x04\x66rom\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x04\x66rom\x12\x1c\n\tvalidator\x18\x02 \x01(\tR\tvalidator\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x19\n\x17MsgWithdrawBurnResponse\"\xa0\x01\n\x19MsgWithdrawBurnUndelegate\x12,\n\x04\x66rom\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x04\x66rom\x12\x1c\n\tvalidator\x18\x02 \x01(\tR\tvalidator\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"#\n!MsgWithdrawBurnUndelegateResponse2\xc6\x03\n\x03Msg\x12_\n\x0bMintDeposit\x12#.kava.router.v1beta1.MsgMintDeposit\x1a+.kava.router.v1beta1.MsgMintDepositResponse\x12w\n\x13\x44\x65legateMintDeposit\x12+.kava.router.v1beta1.MsgDelegateMintDeposit\x1a\x33.kava.router.v1beta1.MsgDelegateMintDepositResponse\x12\x62\n\x0cWithdrawBurn\x12$.kava.router.v1beta1.MsgWithdrawBurn\x1a,.kava.router.v1beta1.MsgWithdrawBurnResponse\x12\x80\x01\n\x16WithdrawBurnUndelegate\x12..kava.router.v1beta1.MsgWithdrawBurnUndelegate\x1a\x36.kava.router.v1beta1.MsgWithdrawBurnUndelegateResponseB\xbe\x01\n\x17\x63om.kava.router.v1beta1B\x07TxProtoP\x01Z(github.com/kava-labs/kava/x/router/types\xa2\x02\x03KRX\xaa\x02\x13Kava.Router.V1beta1\xca\x02\x13Kava\\Router\\V1beta1\xe2\x02\x1fKava\\Router\\V1beta1\\GPBMetadata\xea\x02\x15Kava::Router::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'kava.router.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\027com.kava.router.v1beta1B\007TxProtoP\001Z(github.com/kava-labs/kava/x/router/types\242\002\003KRX\252\002\023Kava.Router.V1beta1\312\002\023Kava\\Router\\V1beta1\342\002\037Kava\\Router\\V1beta1\\GPBMetadata\352\002\025Kava::Router::V1beta1\310\341\036\000'
  _MSGMINTDEPOSIT.fields_by_name['depositor']._options = None
  _MSGMINTDEPOSIT.fields_by_name['depositor']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGMINTDEPOSIT.fields_by_name['amount']._options = None
  _MSGMINTDEPOSIT.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGDELEGATEMINTDEPOSIT.fields_by_name['depositor']._options = None
  _MSGDELEGATEMINTDEPOSIT.fields_by_name['depositor']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGDELEGATEMINTDEPOSIT.fields_by_name['amount']._options = None
  _MSGDELEGATEMINTDEPOSIT.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGWITHDRAWBURN.fields_by_name['from']._options = None
  _MSGWITHDRAWBURN.fields_by_name['from']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGWITHDRAWBURN.fields_by_name['amount']._options = None
  _MSGWITHDRAWBURN.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGWITHDRAWBURNUNDELEGATE.fields_by_name['from']._options = None
  _MSGWITHDRAWBURNUNDELEGATE.fields_by_name['from']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _MSGWITHDRAWBURNUNDELEGATE.fields_by_name['amount']._options = None
  _MSGWITHDRAWBURNUNDELEGATE.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGMINTDEPOSIT']._serialized_start=135
  _globals['_MSGMINTDEPOSIT']._serialized_end=294
  _globals['_MSGMINTDEPOSITRESPONSE']._serialized_start=296
  _globals['_MSGMINTDEPOSITRESPONSE']._serialized_end=320
  _globals['_MSGDELEGATEMINTDEPOSIT']._serialized_start=323
  _globals['_MSGDELEGATEMINTDEPOSIT']._serialized_end=490
  _globals['_MSGDELEGATEMINTDEPOSITRESPONSE']._serialized_start=492
  _globals['_MSGDELEGATEMINTDEPOSITRESPONSE']._serialized_end=524
  _globals['_MSGWITHDRAWBURN']._serialized_start=527
  _globals['_MSGWITHDRAWBURN']._serialized_end=677
  _globals['_MSGWITHDRAWBURNRESPONSE']._serialized_start=679
  _globals['_MSGWITHDRAWBURNRESPONSE']._serialized_end=704
  _globals['_MSGWITHDRAWBURNUNDELEGATE']._serialized_start=707
  _globals['_MSGWITHDRAWBURNUNDELEGATE']._serialized_end=867
  _globals['_MSGWITHDRAWBURNUNDELEGATERESPONSE']._serialized_start=869
  _globals['_MSGWITHDRAWBURNUNDELEGATERESPONSE']._serialized_end=904
  _globals['_MSG']._serialized_start=907
  _globals['_MSG']._serialized_end=1361
# @@protoc_insertion_point(module_scope)
