# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: rizon/treasury/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17rizon/treasury/tx.proto\x12\x19rizonworld.rizon.treasury\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xa5\x01\n\x0eMsgMintRequest\x12/\n\x08receiver\x18\x01 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"receiver\"R\x08receiver\x12)\n\x06signer\x18\x02 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\x12\x37\n\x06\x61mount\x18\x03 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x11\n\x0fMsgMintResponse\"t\n\x0eMsgBurnRequest\x12)\n\x06signer\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"signer\"R\x06signer\x12\x37\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x04\xc8\xde\x1f\x00R\x06\x61mount\"\x11\n\x0fMsgBurnResponse2\xc3\x01\n\x03Msg\x12]\n\x04Mint\x12).rizonworld.rizon.treasury.MsgMintRequest\x1a*.rizonworld.rizon.treasury.MsgMintResponse\x12]\n\x04\x42urn\x12).rizonworld.rizon.treasury.MsgBurnRequest\x1a*.rizonworld.rizon.treasury.MsgBurnResponseB\xdd\x01\n\x1d\x63om.rizonworld.rizon.treasuryB\x07TxProtoP\x01Z-github.com/rizon-world/rizon/x/treasury/types\xa2\x02\x03RRT\xaa\x02\x19Rizonworld.Rizon.Treasury\xca\x02\x19Rizonworld\\Rizon\\Treasury\xe2\x02%Rizonworld\\Rizon\\Treasury\\GPBMetadata\xea\x02\x1bRizonworld::Rizon::Treasuryb\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'rizon.treasury.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.rizonworld.rizon.treasuryB\007TxProtoP\001Z-github.com/rizon-world/rizon/x/treasury/types\242\002\003RRT\252\002\031Rizonworld.Rizon.Treasury\312\002\031Rizonworld\\Rizon\\Treasury\342\002%Rizonworld\\Rizon\\Treasury\\GPBMetadata\352\002\033Rizonworld::Rizon::Treasury'
  _MSGMINTREQUEST.fields_by_name['receiver']._options = None
  _MSGMINTREQUEST.fields_by_name['receiver']._serialized_options = b'\362\336\037\017yaml:\"receiver\"'
  _MSGMINTREQUEST.fields_by_name['signer']._options = None
  _MSGMINTREQUEST.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGMINTREQUEST.fields_by_name['amount']._options = None
  _MSGMINTREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _MSGBURNREQUEST.fields_by_name['signer']._options = None
  _MSGBURNREQUEST.fields_by_name['signer']._serialized_options = b'\362\336\037\ryaml:\"signer\"'
  _MSGBURNREQUEST.fields_by_name['amount']._options = None
  _MSGBURNREQUEST.fields_by_name['amount']._serialized_options = b'\310\336\037\000'
  _globals['_MSGMINTREQUEST']._serialized_start=109
  _globals['_MSGMINTREQUEST']._serialized_end=274
  _globals['_MSGMINTRESPONSE']._serialized_start=276
  _globals['_MSGMINTRESPONSE']._serialized_end=293
  _globals['_MSGBURNREQUEST']._serialized_start=295
  _globals['_MSGBURNREQUEST']._serialized_end=411
  _globals['_MSGBURNRESPONSE']._serialized_start=413
  _globals['_MSGBURNRESPONSE']._serialized_end=430
  _globals['_MSG']._serialized_start=433
  _globals['_MSG']._serialized_end=628
# @@protoc_insertion_point(module_scope)