# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: bitsong/fantoken/v1beta1/fantoken.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.base.v1beta1 import coin_pb2 as cosmos_dot_base_dot_v1beta1_dot_coin__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\'bitsong/fantoken/v1beta1/fantoken.proto\x12\x18\x62itsong.fantoken.v1beta1\x1a\x1e\x63osmos/base/v1beta1/coin.proto\x1a\x14gogoproto/gogo.proto\"o\n\x08Metadata\x12\x12\n\x04name\x18\x01 \x01(\tR\x04name\x12\x16\n\x06symbol\x18\x02 \x01(\tR\x06symbol\x12\x19\n\x03uri\x18\x03 \x01(\tB\x07\xe2\xde\x1f\x03URIR\x03uri\x12\x1c\n\tauthority\x18\x04 \x01(\tR\tauthority\"\x81\x02\n\x08\x46\x61nToken\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12\x62\n\nmax_supply\x18\x02 \x01(\tBC\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.Int\xf2\xde\x1f\x11yaml:\"max_supply\"R\tmaxSupply\x12\x16\n\x06minter\x18\x03 \x01(\tR\x06minter\x12Y\n\tmeta_data\x18\x04 \x01(\x0b\x32\".bitsong.fantoken.v1beta1.MetadataB\x18\xc8\xde\x1f\x00\xf2\xde\x1f\x10yaml:\"meta_data\"R\x08metaData:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\x42\xeb\x01\n\x1c\x63om.bitsong.fantoken.v1beta1B\rFantokenProtoP\x01Z6github.com/bitsongofficial/go-bitsong/x/fantoken/types\xa2\x02\x03\x42\x46X\xaa\x02\x18\x42itsong.Fantoken.V1beta1\xca\x02\x18\x42itsong\\Fantoken\\V1beta1\xe2\x02$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\xea\x02\x1a\x42itsong::Fantoken::V1beta1\xc8\xe1\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'bitsong.fantoken.v1beta1.fantoken_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\034com.bitsong.fantoken.v1beta1B\rFantokenProtoP\001Z6github.com/bitsongofficial/go-bitsong/x/fantoken/types\242\002\003BFX\252\002\030Bitsong.Fantoken.V1beta1\312\002\030Bitsong\\Fantoken\\V1beta1\342\002$Bitsong\\Fantoken\\V1beta1\\GPBMetadata\352\002\032Bitsong::Fantoken::V1beta1\310\341\036\000'
  _METADATA.fields_by_name['uri']._options = None
  _METADATA.fields_by_name['uri']._serialized_options = b'\342\336\037\003URI'
  _FANTOKEN.fields_by_name['max_supply']._options = None
  _FANTOKEN.fields_by_name['max_supply']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Int\362\336\037\021yaml:\"max_supply\"'
  _FANTOKEN.fields_by_name['meta_data']._options = None
  _FANTOKEN.fields_by_name['meta_data']._serialized_options = b'\310\336\037\000\362\336\037\020yaml:\"meta_data\"'
  _FANTOKEN._options = None
  _FANTOKEN._serialized_options = b'\210\240\037\000\230\240\037\000'
  _globals['_METADATA']._serialized_start=123
  _globals['_METADATA']._serialized_end=234
  _globals['_FANTOKEN']._serialized_start=237
  _globals['_FANTOKEN']._serialized_end=494
# @@protoc_insertion_point(module_scope)
