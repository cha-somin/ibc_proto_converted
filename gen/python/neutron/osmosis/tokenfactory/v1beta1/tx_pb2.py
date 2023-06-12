# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: neutron/osmosis/tokenfactory/v1beta1/tx.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n-neutron/osmosis/tokenfactory/v1beta1/tx.proto\x12$neutron.osmosis.tokenfactory.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"l\n\x0eMsgCreateDenom\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12/\n\x08subdenom\x18\x02 \x01(\tB\x13\xf2\xde\x1f\x0fyaml:\"subdenom\"R\x08subdenom\"\\\n\x16MsgCreateDenomResponse\x12\x42\n\x0fnew_token_denom\x18\x01 \x01(\tB\x1a\xf2\xde\x1f\x16yaml:\"new_token_denom\"R\rnewTokenDenom\"~\n\x07MsgMint\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12H\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x11\n\x0fMsgMintResponse\"~\n\x07MsgBurn\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12H\n\x06\x61mount\x18\x02 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinB\x15\xc8\xde\x1f\x00\xf2\xde\x1f\ryaml:\"amount\"R\x06\x61mount\"\x11\n\x0fMsgBurnResponse\"\x95\x01\n\x0eMsgChangeAdmin\x12)\n\x06sender\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"sender\"R\x06sender\x12&\n\x05\x64\x65nom\x18\x02 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"denom\"R\x05\x64\x65nom\x12\x30\n\x08newAdmin\x18\x03 \x01(\tB\x14\xf2\xde\x1f\x10yaml:\"new_admin\"R\x08newAdmin\"\x18\n\x16MsgChangeAdminResponse2\xe9\x03\n\x03Msg\x12\x81\x01\n\x0b\x43reateDenom\x12\x34.neutron.osmosis.tokenfactory.v1beta1.MsgCreateDenom\x1a<.neutron.osmosis.tokenfactory.v1beta1.MsgCreateDenomResponse\x12l\n\x04Mint\x12-.neutron.osmosis.tokenfactory.v1beta1.MsgMint\x1a\x35.neutron.osmosis.tokenfactory.v1beta1.MsgMintResponse\x12l\n\x04\x42urn\x12-.neutron.osmosis.tokenfactory.v1beta1.MsgBurn\x1a\x35.neutron.osmosis.tokenfactory.v1beta1.MsgBurnResponse\x12\x81\x01\n\x0b\x43hangeAdmin\x12\x34.neutron.osmosis.tokenfactory.v1beta1.MsgChangeAdmin\x1a<.neutron.osmosis.tokenfactory.v1beta1.MsgChangeAdminResponseB\x9b\x02\n(com.neutron.osmosis.tokenfactory.v1beta1B\x07TxProtoP\x01Z3github.com/neutron-org/neutron/x/tokenfactory/types\xa2\x02\x03NOT\xaa\x02$Neutron.Osmosis.Tokenfactory.V1beta1\xca\x02$Neutron\\Osmosis\\Tokenfactory\\V1beta1\xe2\x02\x30Neutron\\Osmosis\\Tokenfactory\\V1beta1\\GPBMetadata\xea\x02\'Neutron::Osmosis::Tokenfactory::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'neutron.osmosis.tokenfactory.v1beta1.tx_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n(com.neutron.osmosis.tokenfactory.v1beta1B\007TxProtoP\001Z3github.com/neutron-org/neutron/x/tokenfactory/types\242\002\003NOT\252\002$Neutron.Osmosis.Tokenfactory.V1beta1\312\002$Neutron\\Osmosis\\Tokenfactory\\V1beta1\342\0020Neutron\\Osmosis\\Tokenfactory\\V1beta1\\GPBMetadata\352\002\'Neutron::Osmosis::Tokenfactory::V1beta1'
  _MSGCREATEDENOM.fields_by_name['sender']._options = None
  _MSGCREATEDENOM.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCREATEDENOM.fields_by_name['subdenom']._options = None
  _MSGCREATEDENOM.fields_by_name['subdenom']._serialized_options = b'\362\336\037\017yaml:\"subdenom\"'
  _MSGCREATEDENOMRESPONSE.fields_by_name['new_token_denom']._options = None
  _MSGCREATEDENOMRESPONSE.fields_by_name['new_token_denom']._serialized_options = b'\362\336\037\026yaml:\"new_token_denom\"'
  _MSGMINT.fields_by_name['sender']._options = None
  _MSGMINT.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGMINT.fields_by_name['amount']._options = None
  _MSGMINT.fields_by_name['amount']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"'
  _MSGBURN.fields_by_name['sender']._options = None
  _MSGBURN.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGBURN.fields_by_name['amount']._options = None
  _MSGBURN.fields_by_name['amount']._serialized_options = b'\310\336\037\000\362\336\037\ryaml:\"amount\"'
  _MSGCHANGEADMIN.fields_by_name['sender']._options = None
  _MSGCHANGEADMIN.fields_by_name['sender']._serialized_options = b'\362\336\037\ryaml:\"sender\"'
  _MSGCHANGEADMIN.fields_by_name['denom']._options = None
  _MSGCHANGEADMIN.fields_by_name['denom']._serialized_options = b'\362\336\037\014yaml:\"denom\"'
  _MSGCHANGEADMIN.fields_by_name['newAdmin']._options = None
  _MSGCHANGEADMIN.fields_by_name['newAdmin']._serialized_options = b'\362\336\037\020yaml:\"new_admin\"'
  _globals['_MSGCREATEDENOM']._serialized_start=141
  _globals['_MSGCREATEDENOM']._serialized_end=249
  _globals['_MSGCREATEDENOMRESPONSE']._serialized_start=251
  _globals['_MSGCREATEDENOMRESPONSE']._serialized_end=343
  _globals['_MSGMINT']._serialized_start=345
  _globals['_MSGMINT']._serialized_end=471
  _globals['_MSGMINTRESPONSE']._serialized_start=473
  _globals['_MSGMINTRESPONSE']._serialized_end=490
  _globals['_MSGBURN']._serialized_start=492
  _globals['_MSGBURN']._serialized_end=618
  _globals['_MSGBURNRESPONSE']._serialized_start=620
  _globals['_MSGBURNRESPONSE']._serialized_end=637
  _globals['_MSGCHANGEADMIN']._serialized_start=640
  _globals['_MSGCHANGEADMIN']._serialized_end=789
  _globals['_MSGCHANGEADMINRESPONSE']._serialized_start=791
  _globals['_MSGCHANGEADMINRESPONSE']._serialized_end=815
  _globals['_MSG']._serialized_start=818
  _globals['_MSG']._serialized_end=1307
# @@protoc_insertion_point(module_scope)
