# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/bank/v1beta1/bank.proto
# Protobuf Python Version: 5.26.0
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from cosmos.msg.v1 import msg_pb2 as cosmos_dot_msg_dot_v1_dot_msg__pb2
from amino import amino_pb2 as amino_dot_amino__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x63osmos/bank/v1beta1/bank.proto\x12\x13\x63osmos.bank.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x17\x63osmos/msg/v1/msg.proto\x1a\x11\x61mino/amino.proto\"\xa6\x01\n\x06Params\x12G\n\x0csend_enabled\x18\x01 \x03(\x0b\x32 .cosmos.bank.v1beta1.SendEnabledB\x02\x18\x01R\x0bsendEnabled\x12\x30\n\x14\x64\x65\x66\x61ult_send_enabled\x18\x02 \x01(\x08R\x12\x64\x65\x66\x61ultSendEnabled:!\x98\xa0\x1f\x00\x8a\xe7\xb0*\x18\x63osmos-sdk/x/bank/Params\"G\n\x0bSendEnabled\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x18\n\x07\x65nabled\x18\x02 \x01(\x08R\x07\x65nabled:\x08\x98\xa0\x1f\x00\xe8\xa0\x1f\x01\"\xb9\x01\n\x05Input\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x66\n\x05\x63oins\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB5\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.Coins\xa8\xe7\xb0*\x01R\x05\x63oins:\x14\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\x82\xe7\xb0*\x07\x61\x64\x64ress\"\xae\x01\n\x06Output\x12\x32\n\x07\x61\x64\x64ress\x18\x01 \x01(\tB\x18\xd2\xb4-\x14\x63osmos.AddressStringR\x07\x61\x64\x64ress\x12\x66\n\x05\x63oins\x18\x02 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB5\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.Coins\xa8\xe7\xb0*\x01R\x05\x63oins:\x08\x88\xa0\x1f\x00\xe8\xa0\x1f\x00\"\x9b\x01\n\x06Supply\x12\x66\n\x05total\x18\x01 \x03(\x0b\x32\x19.cosmos.base.v1beta1.CoinB5\xc8\xde\x1f\x00\xaa\xdf\x1f(github.com/cosmos/cosmos-sdk/types.Coins\xa8\xe7\xb0*\x01R\x05total:)\x18\x01\x88\xa0\x1f\x00\xe8\xa0\x1f\x01\xca\xb4-\x1b\x63osmos.bank.v1beta1.SupplyI\"W\n\tDenomUnit\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x1a\n\x08\x65xponent\x18\x02 \x01(\rR\x08\x65xponent\x12\x18\n\x07\x61liases\x18\x03 \x03(\tR\x07\x61liases\"\x8a\x02\n\x08Metadata\x12 \n\x0b\x64\x65scription\x18\x01 \x01(\tR\x0b\x64\x65scription\x12?\n\x0b\x64\x65nom_units\x18\x02 \x03(\x0b\x32\x1e.cosmos.bank.v1beta1.DenomUnitR\ndenomUnits\x12\x12\n\x04\x62\x61se\x18\x03 \x01(\tR\x04\x62\x61se\x12\x18\n\x07\x64isplay\x18\x04 \x01(\tR\x07\x64isplay\x12\x12\n\x04name\x18\x05 \x01(\tR\x04name\x12\x16\n\x06symbol\x18\x06 \x01(\tR\x06symbol\x12\x19\n\x03uri\x18\x07 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12&\n\x08uri_hash\x18\x08 \x01(\tB\x0b\xe2\xde\x1f\x07URIHashR\x07uriHashB\xbb\x01\n\x17\x63om.cosmos.bank.v1beta1B\tBankProtoZ)github.com/cosmos/cosmos-sdk/x/bank/types\xa2\x02\x03\x43\x42X\xaa\x02\x13\x43osmos.Bank.V1beta1\xca\x02\x13\x43osmos\\Bank\\V1beta1\xe2\x02\x1f\x43osmos\\Bank\\V1beta1\\GPBMetadata\xea\x02\x15\x43osmos::Bank::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'cosmos.bank.v1beta1.bank_pb2', _globals)
if not _descriptor._USE_C_DESCRIPTORS:
  _globals['DESCRIPTOR']._loaded_options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\027com.cosmos.bank.v1beta1B\tBankProtoZ)github.com/cosmos/cosmos-sdk/x/bank/types\242\002\003CBX\252\002\023Cosmos.Bank.V1beta1\312\002\023Cosmos\\Bank\\V1beta1\342\002\037Cosmos\\Bank\\V1beta1\\GPBMetadata\352\002\025Cosmos::Bank::V1beta1'
  _globals['_PARAMS'].fields_by_name['send_enabled']._loaded_options = None
  _globals['_PARAMS'].fields_by_name['send_enabled']._serialized_options = b'\030\001'
  _globals['_PARAMS']._loaded_options = None
  _globals['_PARAMS']._serialized_options = b'\230\240\037\000\212\347\260*\030cosmos-sdk/x/bank/Params'
  _globals['_SENDENABLED']._loaded_options = None
  _globals['_SENDENABLED']._serialized_options = b'\230\240\037\000\350\240\037\001'
  _globals['_INPUT'].fields_by_name['address']._loaded_options = None
  _globals['_INPUT'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_INPUT'].fields_by_name['coins']._loaded_options = None
  _globals['_INPUT'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins\250\347\260*\001'
  _globals['_INPUT']._loaded_options = None
  _globals['_INPUT']._serialized_options = b'\210\240\037\000\350\240\037\000\202\347\260*\007address'
  _globals['_OUTPUT'].fields_by_name['address']._loaded_options = None
  _globals['_OUTPUT'].fields_by_name['address']._serialized_options = b'\322\264-\024cosmos.AddressString'
  _globals['_OUTPUT'].fields_by_name['coins']._loaded_options = None
  _globals['_OUTPUT'].fields_by_name['coins']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins\250\347\260*\001'
  _globals['_OUTPUT']._loaded_options = None
  _globals['_OUTPUT']._serialized_options = b'\210\240\037\000\350\240\037\000'
  _globals['_SUPPLY'].fields_by_name['total']._loaded_options = None
  _globals['_SUPPLY'].fields_by_name['total']._serialized_options = b'\310\336\037\000\252\337\037(github.com/cosmos/cosmos-sdk/types.Coins\250\347\260*\001'
  _globals['_SUPPLY']._loaded_options = None
  _globals['_SUPPLY']._serialized_options = b'\030\001\210\240\037\000\350\240\037\001\312\264-\033cosmos.bank.v1beta1.SupplyI'
  _globals['_METADATA'].fields_by_name['uri']._loaded_options = None
  _globals['_METADATA'].fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _globals['_METADATA'].fields_by_name['uri_hash']._loaded_options = None
  _globals['_METADATA'].fields_by_name['uri_hash']._serialized_options = b'\342\336\037\007URIHash'
  _globals['_PARAMS']._serialized_start=181
  _globals['_PARAMS']._serialized_end=347
  _globals['_SENDENABLED']._serialized_start=349
  _globals['_SENDENABLED']._serialized_end=420
  _globals['_INPUT']._serialized_start=423
  _globals['_INPUT']._serialized_end=608
  _globals['_OUTPUT']._serialized_start=611
  _globals['_OUTPUT']._serialized_end=785
  _globals['_SUPPLY']._serialized_start=788
  _globals['_SUPPLY']._serialized_end=943
  _globals['_DENOMUNIT']._serialized_start=945
  _globals['_DENOMUNIT']._serialized_end=1032
  _globals['_METADATA']._serialized_start=1035
  _globals['_METADATA']._serialized_end=1301
# @@protoc_insertion_point(module_scope)
