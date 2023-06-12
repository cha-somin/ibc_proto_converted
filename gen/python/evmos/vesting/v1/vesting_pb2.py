# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: evmos/vesting/v1/vesting.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from cosmos.vesting.v1beta1 import vesting_pb2 as cosmos_dot_vesting_dot_v1beta1_dot_vesting__pb2
from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import timestamp_pb2 as google_dot_protobuf_dot_timestamp__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1e\x65vmos/vesting/v1/vesting.proto\x12\x10\x65vmos.vesting.v1\x1a$cosmos/vesting/v1beta1/vesting.proto\x1a\x14gogoproto/gogo.proto\x1a\x1fgoogle/protobuf/timestamp.proto\"\x8a\x04\n\x16\x43lawbackVestingAccount\x12\x62\n\x14\x62\x61se_vesting_account\x18\x01 \x01(\x0b\x32*.cosmos.vesting.v1beta1.BaseVestingAccountB\x04\xd0\xde\x1f\x01R\x12\x62\x61seVestingAccount\x12%\n\x0e\x66under_address\x18\x02 \x01(\tR\rfunderAddress\x12\x43\n\nstart_time\x18\x03 \x01(\x0b\x32\x1a.google.protobuf.TimestampB\x08\xc8\xde\x1f\x00\x90\xdf\x1f\x01R\tstartTime\x12\x88\x01\n\x0elockup_periods\x18\x04 \x03(\x0b\x32\x1e.cosmos.vesting.v1beta1.PeriodBA\xc8\xde\x1f\x00\xaa\xdf\x1f\x39github.com/cosmos/cosmos-sdk/x/auth/vesting/types.PeriodsR\rlockupPeriods\x12\x8a\x01\n\x0fvesting_periods\x18\x05 \x03(\x0b\x32\x1e.cosmos.vesting.v1beta1.PeriodBA\xc8\xde\x1f\x00\xaa\xdf\x1f\x39github.com/cosmos/cosmos-sdk/x/auth/vesting/types.PeriodsR\x0evestingPeriods:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\x42\xb2\x01\n\x14\x63om.evmos.vesting.v1B\x0cVestingProtoP\x01Z*github.com/evmos/evmos/v13/x/vesting/types\xa2\x02\x03\x45VX\xaa\x02\x10\x45vmos.Vesting.V1\xca\x02\x10\x45vmos\\Vesting\\V1\xe2\x02\x1c\x45vmos\\Vesting\\V1\\GPBMetadata\xea\x02\x12\x45vmos::Vesting::V1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'evmos.vesting.v1.vesting_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\024com.evmos.vesting.v1B\014VestingProtoP\001Z*github.com/evmos/evmos/v13/x/vesting/types\242\002\003EVX\252\002\020Evmos.Vesting.V1\312\002\020Evmos\\Vesting\\V1\342\002\034Evmos\\Vesting\\V1\\GPBMetadata\352\002\022Evmos::Vesting::V1'
  _CLAWBACKVESTINGACCOUNT.fields_by_name['base_vesting_account']._options = None
  _CLAWBACKVESTINGACCOUNT.fields_by_name['base_vesting_account']._serialized_options = b'\320\336\037\001'
  _CLAWBACKVESTINGACCOUNT.fields_by_name['start_time']._options = None
  _CLAWBACKVESTINGACCOUNT.fields_by_name['start_time']._serialized_options = b'\310\336\037\000\220\337\037\001'
  _CLAWBACKVESTINGACCOUNT.fields_by_name['lockup_periods']._options = None
  _CLAWBACKVESTINGACCOUNT.fields_by_name['lockup_periods']._serialized_options = b'\310\336\037\000\252\337\0379github.com/cosmos/cosmos-sdk/x/auth/vesting/types.Periods'
  _CLAWBACKVESTINGACCOUNT.fields_by_name['vesting_periods']._options = None
  _CLAWBACKVESTINGACCOUNT.fields_by_name['vesting_periods']._serialized_options = b'\310\336\037\000\252\337\0379github.com/cosmos/cosmos-sdk/x/auth/vesting/types.Periods'
  _CLAWBACKVESTINGACCOUNT._options = None
  _CLAWBACKVESTINGACCOUNT._serialized_options = b'\210\240\037\000\230\240\037\000'
  _globals['_CLAWBACKVESTINGACCOUNT']._serialized_start=146
  _globals['_CLAWBACKVESTINGACCOUNT']._serialized_end=668
# @@protoc_insertion_point(module_scope)
