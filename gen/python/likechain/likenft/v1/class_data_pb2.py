# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: likechain/likenft/v1/class_data.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n%likechain/likenft/v1/class_data.proto\x12\x14likechain.likenft.v1\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x8f\x02\n\tClassData\x12-\n\x08metadata\x18\x01 \x01(\x0c\x42\x11\xc8\xde\x1f\x00\xda\xde\x1f\tJsonInputR\x08metadata\x12?\n\x06parent\x18\x02 \x01(\x0b\x32!.likechain.likenft.v1.ClassParentB\x04\xc8\xde\x1f\x00R\x06parent\x12?\n\x06\x63onfig\x18\x03 \x01(\x0b\x32!.likechain.likenft.v1.ClassConfigB\x04\xc8\xde\x1f\x00R\x06\x63onfig\x12Q\n\x0f\x62lind_box_state\x18\x04 \x01(\x0b\x32#.likechain.likenft.v1.BlindBoxStateB\x04\xc8\xde\x1f\x00R\rblindBoxState\"\xcb\x01\n\x0b\x43lassParent\x12\x39\n\x04type\x18\x01 \x01(\x0e\x32%.likechain.likenft.v1.ClassParentTypeR\x04type\x12*\n\x0eiscn_id_prefix\x18\x02 \x01(\tB\x04\xc8\xde\x1f\x01R\x0ciscnIdPrefix\x12\x35\n\x14iscn_version_at_mint\x18\x03 \x01(\x04\x42\x04\xc8\xde\x1f\x01R\x11iscnVersionAtMint\x12\x1e\n\x07\x61\x63\x63ount\x18\x04 \x01(\tB\x04\xc8\xde\x1f\x01R\x07\x61\x63\x63ount\"\x9d\x01\n\nMintPeriod\x12\x43\n\nstart_time\x18\x01 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tstartTime\x12+\n\x11\x61llowed_addresses\x18\x02 \x03(\tR\x10\x61llowedAddresses\x12\x1d\n\nmint_price\x18\x03 \x01(\x04R\tmintPrice\"\x9e\x01\n\x0b\x43lassConfig\x12\x1a\n\x08\x62urnable\x18\x01 \x01(\x08R\x08\x62urnable\x12\x1d\n\nmax_supply\x18\x02 \x01(\x04R\tmaxSupply\x12T\n\x10\x62lind_box_config\x18\x03 \x01(\x0b\x32$.likechain.likenft.v1.BlindBoxConfigB\x04\xc8\xde\x1f\x01R\x0e\x62lindBoxConfig\"\xa2\x01\n\x0e\x42lindBoxConfig\x12I\n\x0cmint_periods\x18\x01 \x03(\x0b\x32 .likechain.likenft.v1.MintPeriodB\x04\xc8\xde\x1f\x00R\x0bmintPeriods\x12\x45\n\x0breveal_time\x18\x02 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\nrevealTime\"Z\n\rBlindBoxState\x12#\n\rcontent_count\x18\x01 \x01(\x04R\x0c\x63ontentCount\x12$\n\x0eto_be_revealed\x18\x02 \x01(\x08R\x0ctoBeRevealed*5\n\x0f\x43lassParentType\x12\x0b\n\x07UNKNOWN\x10\x00\x12\x08\n\x04ISCN\x10\x01\x12\x0b\n\x07\x41\x43\x43OUNT\x10\x02\x42\xd3\x01\n\x18\x63om.likechain.likenft.v1B\x0e\x43lassDataProtoP\x01Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\xa2\x02\x03LLX\xaa\x02\x14Likechain.Likenft.V1\xca\x02\x14Likechain\\Likenft\\V1\xe2\x02 Likechain\\Likenft\\V1\\GPBMetadata\xea\x02\x16Likechain::Likenft::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'likechain.likenft.v1.class_data_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.likechain.likenft.v1B\016ClassDataProtoP\001Z5github.com/likecoin/likecoin-chain/v4/x/likenft/types\242\002\003LLX\252\002\024Likechain.Likenft.V1\312\002\024Likechain\\Likenft\\V1\342\002 Likechain\\Likenft\\V1\\GPBMetadata\352\002\026Likechain::Likenft::V1'
  _CLASSDATA.fields_by_name['metadata']._options = None
  _CLASSDATA.fields_by_name['metadata']._serialized_options = b'\310\336\037\000\332\336\037\tJsonInput'
  _CLASSDATA.fields_by_name['parent']._options = None
  _CLASSDATA.fields_by_name['parent']._serialized_options = b'\310\336\037\000'
  _CLASSDATA.fields_by_name['config']._options = None
  _CLASSDATA.fields_by_name['config']._serialized_options = b'\310\336\037\000'
  _CLASSDATA.fields_by_name['blind_box_state']._options = None
  _CLASSDATA.fields_by_name['blind_box_state']._serialized_options = b'\310\336\037\000'
  _CLASSPARENT.fields_by_name['iscn_id_prefix']._options = None
  _CLASSPARENT.fields_by_name['iscn_id_prefix']._serialized_options = b'\310\336\037\001'
  _CLASSPARENT.fields_by_name['iscn_version_at_mint']._options = None
  _CLASSPARENT.fields_by_name['iscn_version_at_mint']._serialized_options = b'\310\336\037\001'
  _CLASSPARENT.fields_by_name['account']._options = None
  _CLASSPARENT.fields_by_name['account']._serialized_options = b'\310\336\037\001'
  _MINTPERIOD.fields_by_name['start_time']._options = None
  _MINTPERIOD.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _CLASSCONFIG.fields_by_name['blind_box_config']._options = None
  _CLASSCONFIG.fields_by_name['blind_box_config']._serialized_options = b'\310\336\037\001'
  _BLINDBOXCONFIG.fields_by_name['mint_periods']._options = None
  _BLINDBOXCONFIG.fields_by_name['mint_periods']._serialized_options = b'\310\336\037\000'
  _BLINDBOXCONFIG.fields_by_name['reveal_time']._options = None
  _BLINDBOXCONFIG.fields_by_name['reveal_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _globals['_CLASSPARENTTYPE']._serialized_start=1176
  _globals['_CLASSPARENTTYPE']._serialized_end=1229
  _globals['_CLASSDATA']._serialized_start=119
  _globals['_CLASSDATA']._serialized_end=390
  _globals['_CLASSPARENT']._serialized_start=393
  _globals['_CLASSPARENT']._serialized_end=596
  _globals['_MINTPERIOD']._serialized_start=599
  _globals['_MINTPERIOD']._serialized_end=756
  _globals['_CLASSCONFIG']._serialized_start=759
  _globals['_CLASSCONFIG']._serialized_end=917
  _globals['_BLINDBOXCONFIG']._serialized_start=920
  _globals['_BLINDBOXCONFIG']._serialized_end=1082
  _globals['_BLINDBOXSTATE']._serialized_start=1084
  _globals['_BLINDBOXSTATE']._serialized_end=1174
# @@protoc_insertion_point(module_scope)
