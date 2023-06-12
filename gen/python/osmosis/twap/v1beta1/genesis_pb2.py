# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: osmosis/twap/v1beta1/genesis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from osmosis.twap.v1beta1 import twap_record_pb2 as osmosis_dot_twap_dot_v1beta1_dot_twap__record__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2
from cosmos_proto import cosmos_pb2 as cosmos__proto_dot_cosmos__pb2
from google.protobuf import duration_pb2 as google_dot_protobuf_dot_duration__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"osmosis/twap/v1beta1/genesis.proto\x12\x14osmosis.twap.v1beta1\x1a\x14gogoproto/gogo.proto\x1a&osmosis/twap/v1beta1/twap_record.proto\x1a\x19google/protobuf/any.proto\x1a\x19\x63osmos_proto/cosmos.proto\x1a\x1egoogle/protobuf/duration.proto\"\xc6\x01\n\x06Params\x12\x34\n\x16prune_epoch_identifier\x18\x01 \x01(\tR\x14pruneEpochIdentifier\x12\x85\x01\n\x1arecord_history_keep_period\x18\x02 \x01(\x0b\x32\x19.google.protobuf.DurationB-\xc8\xde\x1f\x00\xf2\xde\x1f!yaml:\"record_history_keep_period\"\x98\xdf\x1f\x01R\x17recordHistoryKeepPeriod\"\x88\x01\n\x0cGenesisState\x12<\n\x05twaps\x18\x01 \x03(\x0b\x32 .osmosis.twap.v1beta1.TwapRecordB\x04\xc8\xde\x1f\x00R\x05twaps\x12:\n\x06params\x18\x02 \x01(\x0b\x32\x1c.osmosis.twap.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06paramsB\xcc\x01\n\x18\x63om.osmosis.twap.v1beta1B\x0cGenesisProtoP\x01Z0github.com/osmosis-labs/osmosis/v15/x/twap/types\xa2\x02\x03OTX\xaa\x02\x14Osmosis.Twap.V1beta1\xca\x02\x14Osmosis\\Twap\\V1beta1\xe2\x02 Osmosis\\Twap\\V1beta1\\GPBMetadata\xea\x02\x16Osmosis::Twap::V1beta1b\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'osmosis.twap.v1beta1.genesis_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\030com.osmosis.twap.v1beta1B\014GenesisProtoP\001Z0github.com/osmosis-labs/osmosis/v15/x/twap/types\242\002\003OTX\252\002\024Osmosis.Twap.V1beta1\312\002\024Osmosis\\Twap\\V1beta1\342\002 Osmosis\\Twap\\V1beta1\\GPBMetadata\352\002\026Osmosis::Twap::V1beta1'
  _PARAMS.fields_by_name['record_history_keep_period']._options = None
  _PARAMS.fields_by_name['record_history_keep_period']._serialized_options = b'\310\336\037\000\362\336\037!yaml:\"record_history_keep_period\"\230\337\037\001'
  _GENESISSTATE.fields_by_name['twaps']._options = None
  _GENESISSTATE.fields_by_name['twaps']._serialized_options = b'\310\336\037\000'
  _GENESISSTATE.fields_by_name['params']._options = None
  _GENESISSTATE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _globals['_PARAMS']._serialized_start=209
  _globals['_PARAMS']._serialized_end=407
  _globals['_GENESISSTATE']._serialized_start=410
  _globals['_GENESISSTATE']._serialized_end=546
# @@protoc_insertion_point(module_scope)
