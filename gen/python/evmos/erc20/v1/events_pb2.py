# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/erc20/v1/events.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1b\x65vmos/erc20/v1/events.proto\x12\x0e\x65vmos.erc20.v1\"N\n\x11\x45ventRegisterPair\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12#\n\rerc20_address\x18\x02 \x01(\tR\x0c\x65rc20Address\"W\n\x1a\x45ventToggleTokenConversion\x12\x14\n\x05\x64\x65nom\x18\x01 \x01(\tR\x05\x64\x65nom\x12#\n\rerc20_address\x18\x02 \x01(\tR\x0c\x65rc20Address\"\x99\x01\n\x10\x45ventConvertCoin\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1a\n\x08receiver\x18\x02 \x01(\tR\x08receiver\x12\x16\n\x06\x61mount\x18\x03 \x01(\tR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x04 \x01(\tR\x05\x64\x65nom\x12#\n\rerc20_address\x18\x05 \x01(\tR\x0c\x65rc20Address\"\xa0\x01\n\x11\x45ventConvertERC20\x12\x16\n\x06sender\x18\x01 \x01(\tR\x06sender\x12\x1a\n\x08receiver\x18\x02 \x01(\tR\x08receiver\x12\x16\n\x06\x61mount\x18\x03 \x01(\tR\x06\x61mount\x12\x14\n\x05\x64\x65nom\x18\x04 \x01(\tR\x05\x64\x65nom\x12)\n\x10\x63ontract_address\x18\x05 \x01(\tR\x0f\x63ontractAddressB\xa5\x01\n\x12\x63om.evmos.erc20.v1B\x0b\x45ventsProtoP\x01Z(github.com/evmos/evmos/v13/x/erc20/types\xa2\x02\x03\x45\x45X\xaa\x02\x0e\x45vmos.Erc20.V1\xca\x02\x0e\x45vmos\\Erc20\\V1\xe2\x02\x1a\x45vmos\\Erc20\\V1\\GPBMetadata\xea\x02\x10\x45vmos::Erc20::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.erc20.v1.events_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\022com.evmos.erc20.v1B\013EventsProtoP\001Z(github.com/evmos/evmos/v13/x/erc20/types\242\002\003EEX\252\002\016Evmos.Erc20.V1\312\002\016Evmos\\Erc20\\V1\342\002\032Evmos\\Erc20\\V1\\GPBMetadata\352\002\020Evmos::Erc20::V1'
  _globals['_EVENTREGISTERPAIR']._serialized_start=47
  _globals['_EVENTREGISTERPAIR']._serialized_end=125
  _globals['_EVENTTOGGLETOKENCONVERSION']._serialized_start=127
  _globals['_EVENTTOGGLETOKENCONVERSION']._serialized_end=214
  _globals['_EVENTCONVERTCOIN']._serialized_start=217
  _globals['_EVENTCONVERTCOIN']._serialized_end=370
  _globals['_EVENTCONVERTERC20']._serialized_start=373
  _globals['_EVENTCONVERTERC20']._serialized_end=533
# @@protoc_insertion_point(module_scope)