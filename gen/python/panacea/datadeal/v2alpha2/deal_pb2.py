# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: panacea/datadeal/v2alpha2/deal.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n$panacea/datadeal/v2alpha2/deal.proto\x12\x19panacea.datadeal.v2alpha2\x1a\x14gogoproto/gogo.proto\x1a\x1e\x63osmos/base/v1beta1/coin.proto\"\xc2\x02\n\x04\x44\x65\x61l\x12\x0e\n\x02id\x18\x01 \x01(\x04R\x02id\x12\x18\n\x07\x61\x64\x64ress\x18\x02 \x01(\tR\x07\x61\x64\x64ress\x12\x1f\n\x0b\x64\x61ta_schema\x18\x03 \x03(\tR\ndataSchema\x12\x31\n\x06\x62udget\x18\x04 \x01(\x0b\x32\x19.cosmos.base.v1beta1.CoinR\x06\x62udget\x12 \n\x0cmax_num_data\x18\x05 \x01(\x04R\nmaxNumData\x12 \n\x0c\x63ur_num_data\x18\x06 \x01(\x04R\ncurNumData\x12#\n\rbuyer_address\x18\x07 \x01(\tR\x0c\x62uyerAddress\x12=\n\x06status\x18\x08 \x01(\x0e\x32%.panacea.datadeal.v2alpha2.DealStatusR\x06status\x12\x14\n\x05nonce\x18\t \x01(\x0cR\x05nonce*\x9d\x01\n\nDealStatus\x12\x1b\n\x17\x44\x45\x41L_STATUS_UNSPECIFIED\x10\x00\x12\x16\n\x12\x44\x45\x41L_STATUS_ACTIVE\x10\x01\x12\x1c\n\x18\x44\x45\x41L_STATUS_DEACTIVATING\x10\x02\x12\x1b\n\x17\x44\x45\x41L_STATUS_DEACTIVATED\x10\x03\x12\x19\n\x15\x44\x45\x41L_STATUS_COMPLETED\x10\x04\x1a\x04\x88\xa3\x1e\x00\x42\xe6\x01\n\x1d\x63om.panacea.datadeal.v2alpha2B\tDealProtoP\x01Z4github.com/medibloc/panacea-core/v2/x/datadeal/types\xa2\x02\x03PDX\xaa\x02\x19Panacea.Datadeal.V2alpha2\xca\x02\x19Panacea\\Datadeal\\V2alpha2\xe2\x02%Panacea\\Datadeal\\V2alpha2\\GPBMetadata\xea\x02\x1bPanacea::Datadeal::V2alpha2b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'panacea.datadeal.v2alpha2.deal_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.panacea.datadeal.v2alpha2B\tDealProtoP\001Z4github.com/medibloc/panacea-core/v2/x/datadeal/types\242\002\003PDX\252\002\031Panacea.Datadeal.V2alpha2\312\002\031Panacea\\Datadeal\\V2alpha2\342\002%Panacea\\Datadeal\\V2alpha2\\GPBMetadata\352\002\033Panacea::Datadeal::V2alpha2'
  _DEALSTATUS._options = None
  _DEALSTATUS._serialized_options = b'\210\243\036\000'
  _globals['_DEALSTATUS']._serialized_start=447
  _globals['_DEALSTATUS']._serialized_end=604
  _globals['_DEAL']._serialized_start=122
  _globals['_DEAL']._serialized_end=444
# @@protoc_insertion_point(module_scope)
