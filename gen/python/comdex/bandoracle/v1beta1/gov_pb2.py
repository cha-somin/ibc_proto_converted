# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: comdex/bandoracle/v1beta1/gov.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from comdex.bandoracle.v1beta1 import tx_pb2 as comdex_dot_bandoracle_dot_v1beta1_dot_tx__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n#comdex/bandoracle/v1beta1/gov.proto\x12\x19\x63omdex.bandoracle.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\"comdex/bandoracle/v1beta1/tx.proto\"\xca\x01\n\x12\x46\x65tchPriceProposal\x12&\n\x05title\x18\x01 \x01(\tB\x10\xf2\xde\x1f\x0cyaml:\"title\"R\x05title\x12\x38\n\x0b\x64\x65scription\x18\x02 \x01(\tB\x16\xf2\xde\x1f\x12yaml:\"description\"R\x0b\x64\x65scription\x12R\n\nFetchPrice\x18\x03 \x01(\x0b\x32,.comdex.bandoracle.v1beta1.MsgFetchPriceDataB\x04\xc8\xde\x1f\x00R\nFetchPriceB\xe5\x01\n\x1d\x63om.comdex.bandoracle.v1beta1B\x08GovProtoP\x01Z4github.com/comdex-official/comdex/x/bandoracle/types\xa2\x02\x03\x43\x42X\xaa\x02\x19\x43omdex.Bandoracle.V1beta1\xca\x02\x19\x43omdex\\Bandoracle\\V1beta1\xe2\x02%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\xea\x02\x1b\x43omdex::Bandoracle::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'comdex.bandoracle.v1beta1.gov_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\035com.comdex.bandoracle.v1beta1B\010GovProtoP\001Z4github.com/comdex-official/comdex/x/bandoracle/types\242\002\003CBX\252\002\031Comdex.Bandoracle.V1beta1\312\002\031Comdex\\Bandoracle\\V1beta1\342\002%Comdex\\Bandoracle\\V1beta1\\GPBMetadata\352\002\033Comdex::Bandoracle::V1beta1'
  _FETCHPRICEPROPOSAL.fields_by_name['title']._options = None
  _FETCHPRICEPROPOSAL.fields_by_name['title']._serialized_options = b'\362\336\037\014yaml:\"title\"'
  _FETCHPRICEPROPOSAL.fields_by_name['description']._options = None
  _FETCHPRICEPROPOSAL.fields_by_name['description']._serialized_options = b'\362\336\037\022yaml:\"description\"'
  _FETCHPRICEPROPOSAL.fields_by_name['FetchPrice']._options = None
  _FETCHPRICEPROPOSAL.fields_by_name['FetchPrice']._serialized_options = b'\310\336\037\000'
  _globals['_FETCHPRICEPROPOSAL']._serialized_start=125
  _globals['_FETCHPRICEPROPOSAL']._serialized_end=327
# @@protoc_insertion_point(module_scope)
