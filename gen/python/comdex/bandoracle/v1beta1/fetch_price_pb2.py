# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/bandoracle/v1beta1/fetch_price.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n+comdex/bandoracle/v1beta1/fetch_price.proto\x12\x19\x63omdex.bandoracle.v1beta1\x1a\x14gogoproto/gogo.proto\"N\n\x12\x46\x65tchPriceCallData\x12\x18\n\x07symbols\x18\x01 \x03(\tR\x07symbols\x12\x1e\n\nmultiplier\x18\x02 \x01(\x04R\nmultiplier\"(\n\x10\x46\x65tchPriceResult\x12\x14\n\x05rates\x18\x01 \x03(\x04R\x05rates\"r\n\x06Market\x12)\n\x06symbol\x18\x01 \x01(\tB\x11\xf2\xde\x1f\ryaml:\"symbol\"R\x06symbol\x12=\n\tscript_id\x18\x02 \x01(\x04\x42 \xe2\xde\x1f\x08ScriptID\xf2\xde\x1f\x10yaml:\"script_id\"R\x08scriptId\"\x85\x01\n\x0b\x44iscardData\x12:\n\x0c\x62lock_height\x18\x01 \x01(\x03\x42\x17\xf2\xde\x1f\x13yaml:\"block_height\"R\x0b\x62lockHeight\x12:\n\x0c\x64iscard_bool\x18\x02 \x01(\x08\x42\x17\xf2\xde\x1f\x13yaml:\"discard_bool\"R\x0b\x64iscardBoolB\xf4\x01\n\x1d\x63om.comdex.bandoracle.v1beta1B\x0f\x46\x65tchPriceProtoP\x01Z4github.com/comdex-official/comdex/x/bandoracle/types\xa2\x02\x03\x43\x42X\xaa\x02\x19\x43omdex.Bandoracle.V1beta1\xca\x02\x19\x43omdex\\Bandoracle\\V1beta1\xe2\x02%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\xea\x02\x1b\x43omdex::Bandoracle::V1beta1\xc8\xe1\x1e\x00\xa8\xe2\x1e\x00\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.bandoracle.v1beta1.fetch_price_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.comdex.bandoracle.v1beta1B\017FetchPriceProtoP\001Z4github.com/comdex-official/comdex/x/bandoracle/types\242\002\003CBX\252\002\031Comdex.Bandoracle.V1beta1\312\002\031Comdex\\Bandoracle\\V1beta1\342\002%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\352\002\033Comdex::Bandoracle::V1beta1\310\341\036\000\250\342\036\000'
  _MARKET.fields_by_name['symbol']._options = None
  _MARKET.fields_by_name['symbol']._serialized_options = b'\362\336\037\ryaml:\"symbol\"'
  _MARKET.fields_by_name['script_id']._options = None
  _MARKET.fields_by_name['script_id']._serialized_options = b'\342\336\037\010ScriptID\362\336\037\020yaml:\"script_id\"'
  _DISCARDDATA.fields_by_name['block_height']._options = None
  _DISCARDDATA.fields_by_name['block_height']._serialized_options = b'\362\336\037\023yaml:\"block_height\"'
  _DISCARDDATA.fields_by_name['discard_bool']._options = None
  _DISCARDDATA.fields_by_name['discard_bool']._serialized_options = b'\362\336\037\023yaml:\"discard_bool\"'
  _globals['_FETCHPRICECALLDATA']._serialized_start=96
  _globals['_FETCHPRICECALLDATA']._serialized_end=174
  _globals['_FETCHPRICERESULT']._serialized_start=176
  _globals['_FETCHPRICERESULT']._serialized_end=216
  _globals['_MARKET']._serialized_start=218
  _globals['_MARKET']._serialized_end=332
  _globals['_DISCARDDATA']._serialized_start=335
  _globals['_DISCARDDATA']._serialized_end=468
# @@protoc_insertion_point(module_scope)
